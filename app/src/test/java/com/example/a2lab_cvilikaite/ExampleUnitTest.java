package com.example.a2lab_cvilikaite;

import org.junit.Test;

import static org.junit.Assert.*;

import Functions.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void Test1() {
        final String givenString = "";

        final int expectedWordResult = 0;
        final int wordCountResult = TextCounter.wordCount(givenString);

        assertEquals(expectedWordResult, wordCountResult);
    }

    @Test
    public void Test2() {
        final String givenString = "";

        final int expectedCharResult = 0;
        final int charCountResult = TextCounter.charCount(givenString);

        assertEquals(expectedCharResult, charCountResult);
    }

    @Test
    public void Test3() {
        final String givenString = "   Hello     World!    ";

        final int expectedWordResult = 2;
        final int wordCountResult = TextCounter.wordCount(givenString);

        assertEquals(expectedWordResult, wordCountResult);
    }

    @Test
    public void Test4() {
        final String givenString = "   Hello     World!    ";

        final int expectedCharResult = 23;
        final int charCountResult = TextCounter.charCount(givenString);

        assertEquals(expectedCharResult, charCountResult);
    }
    @Test
    public void Test5() {
        final String givenString = "Hello,World";

        final int expectedWordResult = 2;
        final int wordCountResult = TextCounter.wordCount(givenString);

        assertEquals(expectedWordResult, wordCountResult);
    }

    @Test
    public void Test6() {
        final String givenString = "Hello,World";

        final int expectedCharResult = 11;
        final int charCountResult = TextCounter.charCount(givenString);

        assertEquals(expectedCharResult, charCountResult);
    }

    @Test
    public void Test7() {
        final String givenString = "Hello, World";

        final int expectedWordResult = 2;
        final int wordCountResult = TextCounter.wordCount(givenString);

        assertEquals(expectedWordResult, wordCountResult);
    }

    @Test
    public void Test8() {
        final String givenString = "Hello, World";

        final int expectedCharResult = 12;
        final int charCountResult = TextCounter.charCount(givenString);

        assertEquals(expectedCharResult, charCountResult);
    }
    @Test
    public void Test9() {
        final String givenString = null;

        final int expectedWordResult = -1;
        final int wordCountResult = TextCounter.wordCount(givenString);

        assertEquals(expectedWordResult, wordCountResult);
    }

    @Test
    public void Test10() {
        final String givenString = null;

        final int expectedCharResult = -1;
        final int charCountResult = TextCounter.charCount(givenString);

        assertEquals(expectedCharResult, charCountResult);
    }
}