package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodanalyzer = new MoodAnalyzer();

    @Test
    public void givenMessageWhenSadShouldReturnSad() throws MoodAnalysisException {

        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
        try {
            String actualResult = moodanalyzer.analyseMood();
            Assert.assertEquals("Sad", actualResult);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessageWhenHappyShouldReturnHappy() throws MoodAnalysisException {

        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Happy Mood");
        try {
            String actualResult = moodanalyzer.analyseMood();
            Assert.assertEquals("Happy", actualResult);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessageWhenEmptyThrowsException() {

        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        try {
            String actualResult = moodanalyzer.analyseMood();
            Assert.assertEquals("Happy", actualResult);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }
}
