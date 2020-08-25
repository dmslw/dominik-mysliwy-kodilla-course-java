package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("checking when have odd and even numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add (2);
        normalList.add (2);
        normalList.add (6);
        normalList.add (4);
        normalList.add (2);



        //When
        ArrayList<Integer> normalTestList = exterminator.exterminate(new ArrayList<Integer>(normalList));
        System.out.println("Testing " + normalList);
        //Then

        Assertions.assertEquals(4, normalTestList.size());
        Assertions.assertEquals(4, normalTestList.size());
    }
    @DisplayName("checking if the class behaves correctly when the list is empty"
    )
    @Test
    public void estOddNumbersExterminatorEmptyList(){

    //Given
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    ArrayList<Integer> normalList = new ArrayList<>();
    List<Integer> actual = Arrays.asList();
    ArrayList<Integer> normalTestList = exterminator.exterminate(new ArrayList<Integer>(normalList));
    System.out.println("Testing is not null " + actual);
    //Then

    Assertions.assertEquals(actual, 0);

}
}
