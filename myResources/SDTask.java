import org.apache.tools.ant.Task;
import org.apache.tools.ant.BuildException;

/**
 * Created by IntelliJ IDEA.
 * User: levg
 * Date: Dec 10, 2006
 * Time: 10:00:11 AM
 */
public class SDTask extends Task
{
    private String m_xmlFile;
    private String m_inputDir;
    private String m_outputDir;

    public String getXmlFile()
    {
        return m_xmlFile;
    }

    public void setXmlFile(String xmlFile)
    {
        m_xmlFile = xmlFile;
    }

    public String getInputDir()
    {
        return m_inputDir;
    }

    public void setInputDir(String inputDir)
    {
        m_inputDir = inputDir;
    }

    public String getOutputDir()
    {
        return m_outputDir;
    }

    public void setOutputDir(String outputDir)
    {
        m_outputDir = outputDir;
    }

    public void execute() throws BuildException
    {
        try
        {
            SDRun.main(new String[]{m_xmlFile, m_inputDir, m_outputDir});
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
