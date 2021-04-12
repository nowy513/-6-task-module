package com.kodilla.testing.forum.statistic;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCounterSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beggining of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test number " + testCounter + "\n");
    }

    @Test
    public void statisticsWithMock1() {

//        Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNames.add("User" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        Counter counter = new Counter();

//        When
        int totalNumberOfUsers = 100;
        counter.calculateAdvStatistics(statisticsMock);
//        Then
        Assert.assertEquals(totalNumberOfUsers, counter.usersNumber);
        counter.showStatistics();
    }

    @Test
    public void statisticsWithMock2() throws java.lang.ArithmeticException {

//        Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 0; i++) {
            userNames.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Counter counter = new Counter();

//        When
        int totalNumberOfUsers = 0;
        counter.calculateAdvStatistics(statisticsMock);
//        Then
        Assert.assertEquals(totalNumberOfUsers, counter.usersNumber);
        counter.showStatistics();
    }

    @Test
    public void statisticsWithMock3() throws java.lang.ArithmeticException {

//        Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userNames.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Counter counter = new Counter();

//        When
        int totalNumberOfUsers = 10;
        counter.calculateAdvStatistics(statisticsMock);
//        Then
        Assert.assertEquals(totalNumberOfUsers, counter.usersNumber);
        counter.showStatistics();
    }


    @Test
    public void statisticsWithMock4() {

//        Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userNames.add("User" + i);
        }
        ArrayList<Integer> postCount = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            postCount.add(i);
        }
        ArrayList<Integer> commentsCount = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            commentsCount.add(i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        Counter counter = new Counter();

//        When
        counter.calculateAdvStatistics(statisticsMock);
//        Then
        Assert.assertTrue(counter.getCommentsNumber() < counter.getPostsNumber());
        counter.showStatistics();
    }

    @Test
    public void statisticsWithMock5() {

//        Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userNames.add("User" + i);
        }
        ArrayList<Integer> postCount = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            postCount.add(i);
        }
        ArrayList<Integer> commentsCount = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            commentsCount.add(i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        Counter counter = new Counter();

//        When
        counter.calculateAdvStatistics(statisticsMock);

//        Then
        Assert.assertTrue(counter.commentsNumber > counter.postsNumber);
        counter.showStatistics();
    }
}