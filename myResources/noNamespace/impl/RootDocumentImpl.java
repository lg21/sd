/*
 * An XML document type.
 * Localname: root
 * Namespace: 
 * Java type: noNamespace.RootDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one root(@) element.
 *
 * This is a complex type.
 */
public class RootDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument
{
    
    public RootDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("", "root");
    
    
    /**
     * Gets the "root" element
     */
    public noNamespace.RootDocument.Root getRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RootDocument.Root target = null;
            target = (noNamespace.RootDocument.Root)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "root" element
     */
    public void setRoot(noNamespace.RootDocument.Root root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RootDocument.Root target = null;
            target = (noNamespace.RootDocument.Root)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (noNamespace.RootDocument.Root)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "root" element
     */
    public noNamespace.RootDocument.Root addNewRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RootDocument.Root target;
            target = (noNamespace.RootDocument.Root)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
    /**
     * An XML root(@).
     *
     * This is a complex type.
     */
    public static class RootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root
    {
        
        public RootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SNOWDOMES$0 = 
            new javax.xml.namespace.QName("", "snowdomes");
        
        
        /**
         * Gets the "snowdomes" element
         */
        public noNamespace.RootDocument.Root.Snowdomes getSnowdomes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Snowdomes target = null;
                target = (noNamespace.RootDocument.Root.Snowdomes)get_store().find_element_user(SNOWDOMES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "snowdomes" element
         */
        public void setSnowdomes(noNamespace.RootDocument.Root.Snowdomes snowdomes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Snowdomes target = null;
                target = (noNamespace.RootDocument.Root.Snowdomes)get_store().find_element_user(SNOWDOMES$0, 0);
                if (target == null)
                {
                    target = (noNamespace.RootDocument.Root.Snowdomes)get_store().add_element_user(SNOWDOMES$0);
                }
                target.set(snowdomes);
            }
        }
        
        /**
         * Appends and returns a new empty "snowdomes" element
         */
        public noNamespace.RootDocument.Root.Snowdomes addNewSnowdomes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Snowdomes target;
                target = (noNamespace.RootDocument.Root.Snowdomes)get_store().add_element_user(SNOWDOMES$0);
                return target;
            }
        }
        /**
         * An XML snowdomes(@).
         *
         * This is a complex type.
         */
        public static class SnowdomesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.Snowdomes
        {
            
            public SnowdomesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SNOWDOME$0 = 
                new javax.xml.namespace.QName("", "snowdome");
            
            
            /**
             * Gets array of all "snowdome" elements
             */
            public noNamespace.RootDocument.Root.Snowdomes.Snowdome[] getSnowdomeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SNOWDOME$0, targetList);
                    noNamespace.RootDocument.Root.Snowdomes.Snowdome[] result = new noNamespace.RootDocument.Root.Snowdomes.Snowdome[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "snowdome" element
             */
            public noNamespace.RootDocument.Root.Snowdomes.Snowdome getSnowdomeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.Snowdomes.Snowdome target = null;
                    target = (noNamespace.RootDocument.Root.Snowdomes.Snowdome)get_store().find_element_user(SNOWDOME$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "snowdome" element
             */
            public int sizeOfSnowdomeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SNOWDOME$0);
                }
            }
            
            /**
             * Sets array of all "snowdome" element
             */
            public void setSnowdomeArray(noNamespace.RootDocument.Root.Snowdomes.Snowdome[] snowdomeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(snowdomeArray, SNOWDOME$0);
                }
            }
            
            /**
             * Sets ith "snowdome" element
             */
            public void setSnowdomeArray(int i, noNamespace.RootDocument.Root.Snowdomes.Snowdome snowdome)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.Snowdomes.Snowdome target = null;
                    target = (noNamespace.RootDocument.Root.Snowdomes.Snowdome)get_store().find_element_user(SNOWDOME$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(snowdome);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "snowdome" element
             */
            public noNamespace.RootDocument.Root.Snowdomes.Snowdome insertNewSnowdome(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.Snowdomes.Snowdome target;
                    target = (noNamespace.RootDocument.Root.Snowdomes.Snowdome)get_store().insert_element_user(SNOWDOME$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "snowdome" element
             */
            public noNamespace.RootDocument.Root.Snowdomes.Snowdome addNewSnowdome()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.Snowdomes.Snowdome target;
                    target = (noNamespace.RootDocument.Root.Snowdomes.Snowdome)get_store().add_element_user(SNOWDOME$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "snowdome" element
             */
            public void removeSnowdome(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SNOWDOME$0, i);
                }
            }
            /**
             * An XML snowdome(@).
             *
             * This is a complex type.
             */
            public static class SnowdomeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.Snowdomes.Snowdome
            {
                
                public SnowdomeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName COUNTER$2 = 
                    new javax.xml.namespace.QName("", "counter");
                private static final javax.xml.namespace.QName AMOUNT$4 = 
                    new javax.xml.namespace.QName("", "amount");
                private static final javax.xml.namespace.QName COUNTRY$6 = 
                    new javax.xml.namespace.QName("", "country");
                private static final javax.xml.namespace.QName COMMON$8 = 
                    new javax.xml.namespace.QName("", "common");
                private static final javax.xml.namespace.QName CONTINENT$10 = 
                    new javax.xml.namespace.QName("", "continent");
                private static final javax.xml.namespace.QName YEAR$12 = 
                    new javax.xml.namespace.QName("", "year");
                private static final javax.xml.namespace.QName GROUP$14 = 
                    new javax.xml.namespace.QName("", "group");
                private static final javax.xml.namespace.QName BY$16 = 
                    new javax.xml.namespace.QName("", "by");
                private static final javax.xml.namespace.QName CLASSIFIED$18 = 
                    new javax.xml.namespace.QName("", "classified");
                private static final javax.xml.namespace.QName SITE$20 = 
                    new javax.xml.namespace.QName("", "site");
                
                
                /**
                 * Gets the "name" attribute
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "name" attribute
                 */
                public void setName(java.lang.String name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                      }
                      target.setStringValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                public void xsetName(org.apache.xmlbeans.XmlString name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Gets the "counter" attribute
                 */
                public int getCounter()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTER$2);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "counter" attribute
                 */
                public org.apache.xmlbeans.XmlInt xgetCounter()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInt target = null;
                      target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COUNTER$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "counter" attribute
                 */
                public void setCounter(int counter)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTER$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTER$2);
                      }
                      target.setIntValue(counter);
                    }
                }
                
                /**
                 * Sets (as xml) the "counter" attribute
                 */
                public void xsetCounter(org.apache.xmlbeans.XmlInt counter)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInt target = null;
                      target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COUNTER$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(COUNTER$2);
                      }
                      target.set(counter);
                    }
                }
                
                /**
                 * Gets the "amount" attribute
                 */
                public int getAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$4);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "amount" attribute
                 */
                public org.apache.xmlbeans.XmlInt xgetAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInt target = null;
                      target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(AMOUNT$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "amount" attribute
                 */
                public void setAmount(int amount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMOUNT$4);
                      }
                      target.setIntValue(amount);
                    }
                }
                
                /**
                 * Sets (as xml) the "amount" attribute
                 */
                public void xsetAmount(org.apache.xmlbeans.XmlInt amount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInt target = null;
                      target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(AMOUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(AMOUNT$4);
                      }
                      target.set(amount);
                    }
                }
                
                /**
                 * Gets the "country" attribute
                 */
                public java.lang.String getCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "country" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$6);
                      return target;
                    }
                }
                
                /**
                 * Sets the "country" attribute
                 */
                public void setCountry(java.lang.String country)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRY$6);
                      }
                      target.setStringValue(country);
                    }
                }
                
                /**
                 * Sets (as xml) the "country" attribute
                 */
                public void xsetCountry(org.apache.xmlbeans.XmlString country)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRY$6);
                      }
                      target.set(country);
                    }
                }
                
                /**
                 * Gets the "common" attribute
                 */
                public java.lang.String getCommon()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMON$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "common" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCommon()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMMON$8);
                      return target;
                    }
                }
                
                /**
                 * Sets the "common" attribute
                 */
                public void setCommon(java.lang.String common)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMON$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMON$8);
                      }
                      target.setStringValue(common);
                    }
                }
                
                /**
                 * Sets (as xml) the "common" attribute
                 */
                public void xsetCommon(org.apache.xmlbeans.XmlString common)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMMON$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMMON$8);
                      }
                      target.set(common);
                    }
                }
                
                /**
                 * Gets the "continent" attribute
                 */
                public java.lang.String getContinent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTINENT$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "continent" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetContinent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTINENT$10);
                      return target;
                    }
                }
                
                /**
                 * Sets the "continent" attribute
                 */
                public void setContinent(java.lang.String continent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTINENT$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTINENT$10);
                      }
                      target.setStringValue(continent);
                    }
                }
                
                /**
                 * Sets (as xml) the "continent" attribute
                 */
                public void xsetContinent(org.apache.xmlbeans.XmlString continent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTINENT$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTINENT$10);
                      }
                      target.set(continent);
                    }
                }
                
                /**
                 * Gets the "year" attribute
                 */
                public java.lang.String getYear()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "year" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetYear()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(YEAR$12);
                      return target;
                    }
                }
                
                /**
                 * Sets the "year" attribute
                 */
                public void setYear(java.lang.String year)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$12);
                      }
                      target.setStringValue(year);
                    }
                }
                
                /**
                 * Sets (as xml) the "year" attribute
                 */
                public void xsetYear(org.apache.xmlbeans.XmlString year)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(YEAR$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(YEAR$12);
                      }
                      target.set(year);
                    }
                }
                
                /**
                 * Gets the "group" attribute
                 */
                public java.lang.String getGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$14);
                      return target;
                    }
                }
                
                /**
                 * Sets the "group" attribute
                 */
                public void setGroup(java.lang.String group)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$14);
                      }
                      target.setStringValue(group);
                    }
                }
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                public void xsetGroup(org.apache.xmlbeans.XmlString group)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$14);
                      }
                      target.set(group);
                    }
                }
                
                /**
                 * Gets the "by" attribute
                 */
                public java.lang.String getBy()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "by" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBy()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$16);
                      return target;
                    }
                }
                
                /**
                 * Sets the "by" attribute
                 */
                public void setBy(java.lang.String by)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BY$16);
                      }
                      target.setStringValue(by);
                    }
                }
                
                /**
                 * Sets (as xml) the "by" attribute
                 */
                public void xsetBy(org.apache.xmlbeans.XmlString by)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BY$16);
                      }
                      target.set(by);
                    }
                }
                
                /**
                 * Gets the "classified" attribute
                 */
                public java.lang.String getClassified()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIED$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "classified" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClassified()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSIFIED$18);
                      return target;
                    }
                }
                
                /**
                 * Sets the "classified" attribute
                 */
                public void setClassified(java.lang.String classified)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIED$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFIED$18);
                      }
                      target.setStringValue(classified);
                    }
                }
                
                /**
                 * Sets (as xml) the "classified" attribute
                 */
                public void xsetClassified(org.apache.xmlbeans.XmlString classified)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSIFIED$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSIFIED$18);
                      }
                      target.set(classified);
                    }
                }
                
                /**
                 * Gets the "site" attribute
                 */
                public java.lang.String getSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "site" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$20);
                      return target;
                    }
                }
                
                /**
                 * Sets the "site" attribute
                 */
                public void setSite(java.lang.String site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SITE$20);
                      }
                      target.setStringValue(site);
                    }
                }
                
                /**
                 * Sets (as xml) the "site" attribute
                 */
                public void xsetSite(org.apache.xmlbeans.XmlString site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SITE$20);
                      }
                      target.set(site);
                    }
                }
            }
        }
    }
}
