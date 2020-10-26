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
    @Test
    public void whenReadFileTyeisIncorrect_shouldReturnfalse() throws IOException, CustomException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCensusData.csv");
        try {
            analyser.getStateCensusRecord();
        } catch (CustomException e) {
            e.printStackTrace();
            Assert.assertEquals("Incorrect File_Type", e.getMessage());
        }
    }
    @Test
    public void givenTheState_StateCensusCSVFile_Whencorrect_ButDelimiterIncorrect_ReturnsCustomException() throws IOException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCensusData.csv");
        try {
            analyser.getStateCensusRecord();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            Assert.assertEquals(CustomException.ExceptionType.BINDING_PROBLEM_AT_RUNTIME, e.type);
        }
    }
    @Test
    public void givenTheStateCensusCSVFile_CorrectCsvHeader_Incorrect_ReturnCustomException() throws IOException {

        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCensusData.csv");
        try {
            analyser.getStateCensusRecord();
        } catch ( CustomException e) {
            e.printStackTrace();
            Assert.assertEquals(CustomException.ExceptionType.BINDING_PROBLEM_AT_RUNTIME,e.type);
        }

    }
}



