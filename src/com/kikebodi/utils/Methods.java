package com.kikebodi.utils;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This class will be used to save those methods that aren't related to any code and are useful
 * for data representation, management or system functionalities.
 * @author Kike Bodi (www.kikebodi.com)
 *
 */
public class Methods {
	
		/**
	    * This method guarantees that garbage collection is done.
	    * http://stackoverflow.com/questions/1481178/how-to-force-garbage-collection-in-java
	    */
	   public static void forceGarbageCollector() {
	     Object obj = new Object();
	     WeakReference ref = new WeakReference<Object>(obj);
	     obj = null;
	     while(ref.get() != null) {
	       System.gc();
	     }
	   }
	   
	   /**
	    * Method for HTTP Proxy setting.
	    * http://viralpatel.net/blogs/http-proxy-setting-java-setting-proxy-java/
	    * @param host
	    * @param port
	    * @param user
	    * @param pass
	    */
	   public static void setProxy(String host, String port, String user, String pass){
		   System.getProperties().put("http.proxyHost", host);
		   System.getProperties().put("http.proxyPort", port);
		   System.getProperties().put("http.proxyUser", user);
		   System.getProperties().put("http.proxyPassword", pass);	   
	   }
	   
	   /**
	    * It returns the MIME type from the given file.
	    * @param filename
	    * @return It will return null in case of exception.
	    */
	   public static String getMIMEType(Path filename){
		   String response = "";
		   try {
			    response = Files.probeContentType(filename);
			    if (response == null) {
			    	response = "Unknown";
			    }
			} catch (IOException x) {
				response = null;
			}
		   return response;
	   }
}
