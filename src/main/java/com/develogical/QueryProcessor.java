package com.develogical;

public class QueryProcessor {

    public String process(String query) {
    	System.out.println("QueryProcessor.process() Query: " + query);
    	
        if (query.contains("which of the following numbers is the largest")) {
        	String tmpResult[] = query.split(":");
        	System.out.println("largerst tmpResult: " + tmpResult[2]);
        	String[] result = tmpResult[2].split(", ");
        	System.out.println("largerst result: " + result[0]);
        	
        	Integer largest = -1;
        	for (int i=0; i<result.length; i++) {
        		int temp = Integer.valueOf(result[i]);
        		if (temp > largest) {
        			largest = temp;
    			};
        	}
        	
            return String.valueOf(largest);
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
        if (query.contains("what is")) {
        	String[] result = query.split(" ");
            return result[3] + result[5];
        }
        return "";
    }
}
