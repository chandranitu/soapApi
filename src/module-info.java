/**
 * 
 */
/**
 * 
 */

module test {
	requires java.base;                   // Required by default in every module
    requires com.fasterxml.jackson.core;  // Jackson Core dependency
    requires com.fasterxml.jackson.databind;  // Jackson Databind dependency
    requires com.fasterxml.jackson.annotation; // Jackson Annotations
    requires jakarta.xml.ws; 
    requires java.sql;
    
    // You can add exports if you want to expose your packages to other modules
    exports soap;
	
}