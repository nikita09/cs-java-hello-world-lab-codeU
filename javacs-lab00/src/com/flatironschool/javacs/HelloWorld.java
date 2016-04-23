package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
    	String version = System.getProperty("java.specification.version");
    	double ver = Double.parseDouble(version);
    	//System.out.println("in main: " + version);
        return ver;
    }

    /*public HelloWorld()
    {
    	System.out.println("new hello");
    }*/

    public static void main(String[] args) {
    	//System.out.println("Hello, World!");
    	//System.out.println(getVersion());
	    // you can test the output of getVersion() here
    }
}
