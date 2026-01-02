/*
 * An XML document type.
 * Localname: root
 * Namespace: 
 * Java type: noNamespace.RootDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one root(@) element.
 *
 * This is a complex type.
 */
public interface RootDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s02C8EEF636F299C0C736480BBC7FB8E6.TypeSystemHolder.typeSystem.resolveHandle("roota4dbdoctype");
    
    /**
     * Gets the "root" element
     */
    noNamespace.RootDocument.Root getRoot();
    
    /**
     * Sets the "root" element
     */
    void setRoot(noNamespace.RootDocument.Root root);
    
    /**
     * Appends and returns a new empty "root" element
     */
    noNamespace.RootDocument.Root addNewRoot();
    
    /**
     * An XML root(@).
     *
     * This is a complex type.
     */
    public interface Root extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s02C8EEF636F299C0C736480BBC7FB8E6.TypeSystemHolder.typeSystem.resolveHandle("root05adelemtype");
        
        /**
         * Gets the "snowdomes" element
         */
        noNamespace.RootDocument.Root.Snowdomes getSnowdomes();
        
        /**
         * Sets the "snowdomes" element
         */
        void setSnowdomes(noNamespace.RootDocument.Root.Snowdomes snowdomes);
        
        /**
         * Appends and returns a new empty "snowdomes" element
         */
        noNamespace.RootDocument.Root.Snowdomes addNewSnowdomes();
        
        /**
         * An XML snowdomes(@).
         *
         * This is a complex type.
         */
        public interface Snowdomes extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s02C8EEF636F299C0C736480BBC7FB8E6.TypeSystemHolder.typeSystem.resolveHandle("snowdomes7236elemtype");
            
            /**
             * Gets array of all "snowdome" elements
             */
            noNamespace.RootDocument.Root.Snowdomes.Snowdome[] getSnowdomeArray();
            
            /**
             * Gets ith "snowdome" element
             */
            noNamespace.RootDocument.Root.Snowdomes.Snowdome getSnowdomeArray(int i);
            
            /**
             * Returns number of "snowdome" element
             */
            int sizeOfSnowdomeArray();
            
            /**
             * Sets array of all "snowdome" element
             */
            void setSnowdomeArray(noNamespace.RootDocument.Root.Snowdomes.Snowdome[] snowdomeArray);
            
            /**
             * Sets ith "snowdome" element
             */
            void setSnowdomeArray(int i, noNamespace.RootDocument.Root.Snowdomes.Snowdome snowdome);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "snowdome" element
             */
            noNamespace.RootDocument.Root.Snowdomes.Snowdome insertNewSnowdome(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "snowdome" element
             */
            noNamespace.RootDocument.Root.Snowdomes.Snowdome addNewSnowdome();
            
            /**
             * Removes the ith "snowdome" element
             */
            void removeSnowdome(int i);
            
            /**
             * An XML snowdome(@).
             *
             * This is a complex type.
             */
            public interface Snowdome extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s02C8EEF636F299C0C736480BBC7FB8E6.TypeSystemHolder.typeSystem.resolveHandle("snowdomea5a8elemtype");
                
                /**
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * Gets the "counter" attribute
                 */
                int getCounter();
                
                /**
                 * Gets (as xml) the "counter" attribute
                 */
                org.apache.xmlbeans.XmlInt xgetCounter();
                
                /**
                 * Sets the "counter" attribute
                 */
                void setCounter(int counter);
                
                /**
                 * Sets (as xml) the "counter" attribute
                 */
                void xsetCounter(org.apache.xmlbeans.XmlInt counter);
                
                /**
                 * Gets the "amount" attribute
                 */
                int getAmount();
                
                /**
                 * Gets (as xml) the "amount" attribute
                 */
                org.apache.xmlbeans.XmlInt xgetAmount();
                
                /**
                 * Sets the "amount" attribute
                 */
                void setAmount(int amount);
                
                /**
                 * Sets (as xml) the "amount" attribute
                 */
                void xsetAmount(org.apache.xmlbeans.XmlInt amount);
                
                /**
                 * Gets the "country" attribute
                 */
                java.lang.String getCountry();
                
                /**
                 * Gets (as xml) the "country" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCountry();
                
                /**
                 * Sets the "country" attribute
                 */
                void setCountry(java.lang.String country);
                
                /**
                 * Sets (as xml) the "country" attribute
                 */
                void xsetCountry(org.apache.xmlbeans.XmlString country);
                
                /**
                 * Gets the "common" attribute
                 */
                java.lang.String getCommon();
                
                /**
                 * Gets (as xml) the "common" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCommon();
                
                /**
                 * Sets the "common" attribute
                 */
                void setCommon(java.lang.String common);
                
                /**
                 * Sets (as xml) the "common" attribute
                 */
                void xsetCommon(org.apache.xmlbeans.XmlString common);
                
                /**
                 * Gets the "continent" attribute
                 */
                java.lang.String getContinent();
                
                /**
                 * Gets (as xml) the "continent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetContinent();
                
                /**
                 * Sets the "continent" attribute
                 */
                void setContinent(java.lang.String continent);
                
                /**
                 * Sets (as xml) the "continent" attribute
                 */
                void xsetContinent(org.apache.xmlbeans.XmlString continent);
                
                /**
                 * Gets the "year" attribute
                 */
                java.lang.String getYear();
                
                /**
                 * Gets (as xml) the "year" attribute
                 */
                org.apache.xmlbeans.XmlString xgetYear();
                
                /**
                 * Sets the "year" attribute
                 */
                void setYear(java.lang.String year);
                
                /**
                 * Sets (as xml) the "year" attribute
                 */
                void xsetYear(org.apache.xmlbeans.XmlString year);
                
                /**
                 * Gets the "group" attribute
                 */
                java.lang.String getGroup();
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                org.apache.xmlbeans.XmlString xgetGroup();
                
                /**
                 * Sets the "group" attribute
                 */
                void setGroup(java.lang.String group);
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                void xsetGroup(org.apache.xmlbeans.XmlString group);
                
                /**
                 * Gets the "by" attribute
                 */
                java.lang.String getBy();
                
                /**
                 * Gets (as xml) the "by" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBy();
                
                /**
                 * Sets the "by" attribute
                 */
                void setBy(java.lang.String by);
                
                /**
                 * Sets (as xml) the "by" attribute
                 */
                void xsetBy(org.apache.xmlbeans.XmlString by);
                
                /**
                 * Gets the "classified" attribute
                 */
                java.lang.String getClassified();
                
                /**
                 * Gets (as xml) the "classified" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClassified();
                
                /**
                 * Sets the "classified" attribute
                 */
                void setClassified(java.lang.String classified);
                
                /**
                 * Sets (as xml) the "classified" attribute
                 */
                void xsetClassified(org.apache.xmlbeans.XmlString classified);
                
                /**
                 * Gets the "site" attribute
                 */
                java.lang.String getSite();
                
                /**
                 * Gets (as xml) the "site" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSite();
                
                /**
                 * Sets the "site" attribute
                 */
                void setSite(java.lang.String site);
                
                /**
                 * Sets (as xml) the "site" attribute
                 */
                void xsetSite(org.apache.xmlbeans.XmlString site);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RootDocument.Root.Snowdomes.Snowdome newInstance() {
                      return (noNamespace.RootDocument.Root.Snowdomes.Snowdome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RootDocument.Root.Snowdomes.Snowdome newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RootDocument.Root.Snowdomes.Snowdome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RootDocument.Root.Snowdomes newInstance() {
                  return (noNamespace.RootDocument.Root.Snowdomes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RootDocument.Root.Snowdomes newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RootDocument.Root.Snowdomes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.RootDocument.Root newInstance() {
              return (noNamespace.RootDocument.Root) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.RootDocument.Root newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.RootDocument.Root) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.RootDocument newInstance() {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.RootDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static noNamespace.RootDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static noNamespace.RootDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static noNamespace.RootDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static noNamespace.RootDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static noNamespace.RootDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.RootDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.RootDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.RootDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.RootDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.RootDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.RootDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.RootDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static noNamespace.RootDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static noNamespace.RootDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
