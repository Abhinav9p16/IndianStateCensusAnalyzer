package com.cg.censusanalyzer;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateCensusTest {
    StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
    @Test
    public void when_ReadCSVFile_Count_Records_Should_Return_True() {
        try {
            Assert.assertEquals(37, stateCensusAnalyser.getCountStateRecords("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCode.csv","com.cg.censusanalyzer.State"));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(CustomException.ExceptionType.FILE_NOT_FOUND, e.type);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void when_InCorrectCSV_FileType_Should_Return_False() throws IOException {
        try {
            Assert.assertEquals(37, stateCensusAnalyser.getCountStateRecords("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCode.csv","com.cg.censusanalyzer.State"));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(CustomException.ExceptionType.BINDING_PROBLEM_AT_RUNTIME, e.type);
        }

    }
    @Test
    public void when_CorrectCSVFile_But_Delimiter_Incorrect_Should_Return1_False() throws IOException {
        try {
            Assert.assertEquals(37, stateCensusAnalyser.getCountStateRecords("/Users/abhinavthakur/Desktop/Intellij/IndianStatesCensusAnalyzer/StateCode.csv","com.cg.censusanalyzer.State"));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(CustomException.ExceptionType.BINDING_PROBLEM_AT_RUNTIME, e.type);
        }

    }


    }

