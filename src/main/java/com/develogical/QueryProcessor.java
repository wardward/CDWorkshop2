package com.develogical;

public class QueryProcessor {

    public String process(String query) {
    	System.out.println("QueryProcessor.process() Query: " + query);
    	
    	if (query.contains("Spain")) {
            return "peseta";
        }
        if (query.contains("which of the following numbers is the largest")) {
        	String tmpResult[] = query.split(":");
        	System.out.println("largerst tmpResult: " + tmpResult[2]);
        	String[] result = tmpResult[2].split(", ");
        	System.out.println("largerst result: " + result[0]);
        	
        	Integer largest = -1;
        	for (int i=0; i<result.length; i++) {
        		int temp = Integer.valueOf(result[i].trim());
        		if (temp > largest) {
        			largest = temp;
    			};
        	}
        	
            return String.valueOf(largest);
        }
        if (query.contains("multiplied by")) {
        	//63629770: what is 14 multiplied by 6
        	String[] result = query.split(" ");
        	Integer m1 = Integer.valueOf(result[3]);
        	Integer m2 = Integer.valueOf(result[6]);
        	
        	System.out.println("milti 1: " + m1);
        	System.out.println("multi 2: " + m2);
            return String.valueOf(m1 * m2);
        }
        if (query.contains("what is")) {
        	String[] result = query.split(" ");
            return String.valueOf(Integer.valueOf(result[3]) + Integer.valueOf(result[5]));
        }
        if (query.contains("SPA2012")) {
            return "SPA is a conference";
        }
        if (query.contains("ward")) {
            return "Ward is een Eclipse expert ;-)";
        }
        if (query.contains("robert")) {
            return "Robert is een teamcity expert ;-)";
        }
        return "";
    }
}
