package com.develogical;

public class QueryProcessor {

    public String process(String query) {
    	System.out.println("QueryProcessor.process() Query: " + query);
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
