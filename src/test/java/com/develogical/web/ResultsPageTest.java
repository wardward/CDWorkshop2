package com.develogical.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ResultsPageTest {
	
	private ResultsPage classUnderTest;
	private String query;
	
	@Before
	public void setUp() {
		query = "Test";
		classUnderTest = new ResultsPage(query);
	}

	@Ignore
	@Test
	public void resultsPage() {
		fail("Not yet implemented");
		classUnderTest.toString();
		//assertTrue("ResultsPage must contain query String.", condition);
	}

}
