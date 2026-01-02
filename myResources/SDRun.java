import noNamespace.*;
import noNamespace.RootDocument.Root.Snowdomes.Snowdome;

import java.io.*;
import java.util.*;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 * Created by IntelliJ IDEA.
 * User: levg
 * Date: Dec 10, 2006
 * Time: 10:47:49 AM
 */
public class SDRun
{
    private static final String s_velocityProperties = "velocity.properties";
    private static final String s_fileExtension = ".html";
    private static final String s_templateExtension = ".vm";
    private static final String s_separator = "/";
    private static final String s_sd = "sd";
    private static final String s_index = "index";
    private static final String s_news = "news";
    private static final String s_all = "all";
    private static final String s_ctt = "ctt";
    private static final String s_ctts = "ctts";
    private static final String s_cbtors = "cbtors";
    private static final String s_cbtor = "cbtor";
    private static final String s_ctry = "ctry";
    private static final String s_common = "common";
    private static final String s_nc = "nc";
    private static final String s_bl = "bl";
    private static final String s_pictures = "myPictures";
    private static final String s_na = "--";
    private static final String s_t = "true";
    private static final String s_f = "false";
    private static final String s_l = "L";
    private static final String s_c = "C";
    private static final String s_delim = ",";


    public static void main(String[] x_args) throws Exception
    {
        SDRun l_sdRun = new SDRun();
        l_sdRun.generate(x_args);
    }

    private void generate(String[] x_args) throws Exception
    {
        Collection<Snowdome> l_sds = new ArrayList<Snowdome>();
        Collection<Snowdome> l_ncs = new ArrayList<Snowdome>();
        Collection<SDList> l_sdCbtors = new ArrayList<SDList>();
        Collection<SDList> l_sdCtrys = new ArrayList<SDList>();
        Velocity.init(x_args[1] + s_separator + s_velocityProperties);
        RootDocument.Root.Snowdomes.Snowdome[] l_sdArray = RootDocument.Factory.parse(new File(x_args[0])).getRoot().getSnowdomes().getSnowdomeArray();
        for (Snowdome l_sd : l_sdArray)
        {
            l_sds.add(l_sd);
            if (!Boolean.valueOf(l_sd.getClassified()))
            {
                l_ncs.add(l_sd);
            }
            generate(l_sd, x_args[1], x_args[2]);
            addEntry(l_sd, l_sd.getGroup(), l_sdCbtors);
            addEntry(l_sd, l_sd.getCountry(), l_sdCtrys);
        }
        Collection<SDWrapper> l_sdCtts = populateEntries(l_sdCtrys);
        Collection<SDWrapper> l_sdCommons = populateCommons(l_sdCtrys);
        int l_sdCbtorIndex = (int) (Math.random() * l_sdCbtors.size());
        int l_sdIndex = (int) (Math.random() * l_sds.size());
        generateIndex(((SDList) l_sdCbtors.toArray()[l_sdCbtorIndex]).getName(), (Snowdome) l_sds.toArray()[l_sdIndex], l_sds, l_sdCtrys, l_sdCbtors, x_args[1], x_args[2]);
        generateNews(x_args[1], x_args[2]);
        generateAll(l_sds, x_args[1], x_args[2]);
        generateNC(l_ncs, x_args[1], x_args[2]);
        generateBL(x_args[1], x_args[2]);
        generateCbtors(l_sdCbtors, x_args[1], x_args[2]);
        generateCtrys(l_sdCtts, l_sdCtrys, x_args[1], x_args[2]);
        generateCommons(l_sdCommons, x_args[1], x_args[2]);
    }

    private void generate(Snowdome x_sd, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        String l_sdName = x_sd.getName();
        l_context.put("sd", x_sd);
        String[] l_cbtors = x_sd.getBy().split(",");
        String[] l_groups = x_sd.getGroup().split(",");
        int l_numOfCbtors = l_cbtors.length;
        int l_numOfGroups = l_groups.length;
        if ((l_numOfCbtors > 1) && (l_numOfCbtors == l_numOfGroups))
        {
            l_context.put("num", l_numOfCbtors);
            Map<String, String> l_map = new HashMap<String, String>();
            for (int l_cbtorCount = 0; l_cbtorCount < l_cbtors.length; l_cbtorCount ++)
            {
                l_map.put(l_cbtors[l_cbtorCount], l_groups[l_cbtorCount]);
            }
            l_context.put("map", l_map);
        }
        else
        {
            l_context.put("num", 0);
        }
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + l_sdName.replace(" ", "").replace(".", "") + x_sd.getCounter() + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_sd + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateIndex(String x_sdCbtor, Snowdome x_sd, Collection<Snowdome> x_sds, Collection<SDList> x_sdCtrys, Collection<SDList> x_sdCbtors, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        l_context.put("cbtor", x_sdCbtor);
        l_context.put("sd", x_sd);
        l_context.put("sdsSize", x_sds.size());
        l_context.put("sdCtrysSize", x_sdCtrys.size()); 
        l_context.put("sdCbtorsSize", x_sdCbtors.size());
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_index + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_index + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateAll(Collection<Snowdome> x_sds, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        l_context.put("sds", x_sds);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_all + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_all + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateNews(String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_news + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_news + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateNC(Collection<Snowdome> x_ncs, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        l_context.put("sds", x_ncs);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_nc + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_nc + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateBL(String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_bl + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_bl + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateCbtors(Collection<SDList> x_sdCbtors, String x_inputDir, String x_outputDir) throws Exception
    {
        for (SDList x_sdCbtor : x_sdCbtors)
        {
            generateCbtor(x_sdCbtor, x_inputDir, x_outputDir);
        }
        VelocityContext l_context = new VelocityContext();
        l_context.put("sdCbtors", sortCbtors(x_sdCbtors));
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_cbtors + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_cbtors + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateCbtor(SDList x_sdCbtor, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        String l_sdCbtorName = x_sdCbtor.getName();
        l_context.put("cbtor", x_sdCbtor);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + l_sdCbtorName.replace(" ", "").replace(".", "") + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_cbtor + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
        PrintWriter l_printWriterL = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + l_sdCbtorName.replace(" ", "").replace(".", "") + s_l + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_cbtor + s_l + s_templateExtension).merge(l_context, l_printWriterL);
        flush(l_printWriterL);
    }

    private void generateCtrys(Collection<SDWrapper> x_sdCtts, Collection<SDList> x_sdCtrys, String x_inputDir, String x_outputDir) throws Exception
    {
        for (SDList x_sdCtry : x_sdCtrys)
        {
            generateCtry(x_sdCtry, x_inputDir, x_outputDir);
        }
        generateCtts(x_sdCtts, x_outputDir, x_inputDir);
    }

    private void generateCtts(Collection<SDWrapper> x_sdCtts, String x_outputDir, String x_inputDir)
            throws Exception
    {
        for (SDWrapper x_sdCtt : x_sdCtts)
        {
            generateCtt(x_sdCtt, x_inputDir, x_outputDir);
        }
        VelocityContext l_context = new VelocityContext();
        l_context.put("sdCtts", x_sdCtts);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + s_ctts + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_ctts + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateCtt(SDWrapper x_sdWrapper, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        String l_sdCttName = x_sdWrapper.getName();
        l_context.put("ctt", x_sdWrapper);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + l_sdCttName.replace(" ", "").replace(".", "") + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_ctt + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateCtry(SDList x_sdCtry, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        String l_sdCtryName = x_sdCtry.getName();
        l_context.put("ctry", x_sdCtry);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + l_sdCtryName.replace(" ", "").replace(".", "") + s_c + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_ctry + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void generateCommons(Collection<SDWrapper> x_sdCommons, String x_inputDir, String x_outputDir) throws Exception
    {
        for (SDWrapper x_sdCommon : x_sdCommons)
        {
            generateCommon(x_sdCommon, x_inputDir, x_outputDir);
        }
    }

    private void generateCommon(SDWrapper x_sdWrapper, String x_inputDir, String x_outputDir) throws Exception
    {
        VelocityContext l_context = new VelocityContext();
        String l_sdCommonName = x_sdWrapper.getName();
        l_context.put("common", x_sdWrapper);
        putStatics(l_context);
        PrintWriter l_printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(x_outputDir + s_separator + l_sdCommonName.replace(" ", "").replace(".", "") + s_c + s_fileExtension))));
        Velocity.getTemplate(x_inputDir + s_separator + s_common + s_templateExtension).merge(l_context, l_printWriter);
        flush(l_printWriter);
    }

    private void putStatics(VelocityContext context)
    {
        context.put("pictures", s_pictures);
        context.put("index", s_index);
        context.put("news", s_news);
        context.put("all", s_all);
        context.put("ctts", s_ctts);
        context.put("cbtors", s_cbtors);
        context.put("nc", s_nc);
        context.put("bl", s_bl);
        context.put("na", s_na);
        context.put("f", s_f);
        context.put("t", s_t);
    }

    private void flush(PrintWriter printWriter)
    {
        if (printWriter != null)
        {
            printWriter.flush();
            printWriter.close();
        }
    }

    private Collection<SDWrapper> populateEntries(Collection<SDList> x_listCollection)
    {
        Collection<SDWrapper> l_entries = new ArrayList<SDWrapper>();
        for (SDList aX_listCollection : x_listCollection)
        {
            Snowdome l_sd = aX_listCollection.getSds().iterator().next();
            String l_ctt = l_sd.getContinent();
            String l_common = l_sd.getCommon();
            SDWrapper l_wrapper = getWrapper(l_entries, l_ctt);
            if (l_wrapper == null)
            {
                l_wrapper = new SDWrapper(l_ctt);
                l_entries.add(l_wrapper);
            }
            if (l_common.equals(s_na))
            {
                l_wrapper.addEntry(aX_listCollection.getName(), aX_listCollection.getSds().size());
            }
            else
            {
                if (!l_wrapper.getMap().containsKey(l_common))
                {
                    l_wrapper.addEntry(l_common, commonSize(x_listCollection, l_common));
                }
            }
        }
        return l_entries;
    }

    private Collection<SDWrapper> populateCommons(Collection<SDList> x_listCollection)
    {
        Collection<SDWrapper> l_commons = new ArrayList<SDWrapper>();
        for (SDList aX_listCollection : x_listCollection)
        {
            Snowdome l_sd = aX_listCollection.getSds().iterator().next();
            String l_common = l_sd.getCommon();
            String l_ctry = l_sd.getCountry();
            if (l_common.equals(s_na))
            {
                continue;
            }
            SDWrapper l_wrapper = getWrapper(l_commons, l_common);
            if (l_wrapper == null)
            {
                l_wrapper = new SDWrapper(l_common);
                l_commons.add(l_wrapper);
            }
            if (!l_wrapper.getMap().containsKey(l_ctry))
            {
                l_wrapper.addEntry(l_ctry, aX_listCollection.getSds().size());
            }
        }
        return l_commons;
    }

    private int commonSize(Collection<SDList> x_listCollection, String x_name)
    {
        int l_size = 0;
        for (SDList aX_listCollection : x_listCollection)
        {
            for (Snowdome snowdome : aX_listCollection.getSds())
            {
                if (snowdome.getCommon().equals(x_name))
                {
                    l_size++;
                }
            }
        }
        return l_size;
    }

    private void addEntry(Snowdome x_sd, String x_key, Collection<SDList> x_entries)
    {
        if (x_key.contains(s_delim))
        {
            String[] l_keys = x_key.split(s_delim);
            for (String l_key : l_keys)
            {
                addEntry(x_sd, l_key.trim(), x_entries);
            }
            return;
        }
        if (x_key.equals(s_na))
        {
            return;
        }
        SDList l_entry = getList(x_entries, x_key);
        if (l_entry == null)
        {
            l_entry = new SDList(x_key);
            x_entries.add(l_entry);
        }
        l_entry.addSD(x_sd);
    }

    private Collection<SDList> sortCbtors(Collection<SDList> x_sdCbtors)
    {
        Collection<SDList> l_sdCbtors = new ArrayList<SDList>();
        while (x_sdCbtors.size() > 0)
        {
            int l_max = 0;
            SDList l_maxCbtor = null;
            for (SDList x_sdCbtor : x_sdCbtors)
            {
                int l_size = x_sdCbtor.getSds().size();
                if (l_size > l_max)
                {
                    l_max = l_size;
                    l_maxCbtor = x_sdCbtor;
                }
            }
            x_sdCbtors.remove(l_maxCbtor);
            l_sdCbtors.add(l_maxCbtor);
        }
        return l_sdCbtors;
    }

    private SDList getList(Collection<SDList> x_entries, String x_entry)
    {
        for (SDList x_entry1 : x_entries)
        {
            if (x_entry1.getName().equals(x_entry))
            {
                return x_entry1;
            }
        }
        return null;
    }

    private SDWrapper getWrapper(Collection<SDWrapper> x_entries, String x_entry)
    {
        for (SDWrapper x_entry1 : x_entries)
        {
            SDWrapper l_entry = x_entry1;
            if (l_entry.getName().equals(x_entry))
            {
                return l_entry;
            }
        }
        return null;
    }

    public class SDList
    {
        String m_name;
        Collection<Snowdome> m_sds;

        public SDList(String x_name)
        {
            m_name = x_name;
            m_sds = new ArrayList<Snowdome>();
        }

        public String getName()
        {
            return m_name;
        }

        public void setName(String x_name)
        {
            m_name = x_name;
        }

        public Collection<Snowdome> getSds()
        {
            return m_sds;
        }

        public void addSD(Snowdome x_sd)
        {
            m_sds.add(x_sd);
        }
    }

    public class SDWrapper
    {
        String m_name;
        int m_size;
        Map<String, Integer> m_map;

        public SDWrapper(String x_name)
        {
            m_name = x_name;
            m_size = 0;
            m_map = new HashMap<String, Integer>();
        }

        public String getName()
        {
            return m_name;
        }

        public void setName(String x_name)
        {
            m_name = x_name;
        }

        public int getSize()
        {
            return m_size;
        }

        private void addSize(int x_size)
        {
            m_size += x_size;
        }

        public Map<String, Integer> getMap()
        {
            return m_map;
        }

        public void addEntry(String x_entryName, int x_amount)
        {
            m_map.put(x_entryName, x_amount);
            addSize(x_amount);
        }
    }
}
