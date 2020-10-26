package com.cg.censusanalyzer;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateCensusTest {


    @Test
    public void when_ReadstateCensusCSV_File_Count_Records_Should_Return_True() throws IOException, CustomException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCensusData.csv");
        System.out.println("No of Records in StateCSV: " + analyser.getStateCensusRecord());
        Assert.assertEquals(28, analyser.getStateCensusRecord());
    }
}



