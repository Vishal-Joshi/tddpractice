package com.example.tddpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class MySetTest {

    @Test
    public void testShouldVerifyThatAdditionInSetReturnsTrue() {
        //given
        MySet set = new MySet();

        //when
        boolean isAdditionSuccessful = set.add(1);

        //then
        assertThat(isAdditionSuccessful, is(true));
    }

    @Test
    public void testShouldVerifyThatAdditionOfDuplicateElementShouldReturnFalse() {
        //given
        MySet set = new MySet();

        //when
        set.add(1);
        boolean isAdded = set.add(1);

        //then
        assertThat(isAdded, is(false));
    }

    @Test
    public void testShouldVerifyThat0CanBeAddedToTheSet() {
        //given
        MySet set = new MySet();

        //when
        boolean isAdded = set.add(0);

        //then
        assertThat(isAdded, is(true));
    }

    @Test
    public void testShouldVerifyThatContainsReturnsTrueIfElementIsInTheSet() {
        //given
        MySet set = new MySet();

        //when
        set.add(1);
        boolean hasElement = set.contains(1);

        //then
        assertThat(hasElement, is(true));
    }

    @Test
    public void testShouldVerifyThatContainsReturnsFalseIfElementIsNOTInTheSet() {
        //given
        MySet set = new MySet();

        //when
        boolean hasElement = set.contains(1);

        //then
        assertThat(hasElement, is(false));
    }

    @Test
    public void testShouldVerifyThatSizeOfSetWithNoElementIs0() {
        //given
        MySet set = new MySet();

        //when
        int currentSize = set.size();

        //then
        assertThat(currentSize, is(equalTo(0)));
    }

    @Test
    public void testShouldVerifyThatSizeOfSetIs1With1Element() {
        //given
        MySet set = new MySet();

        //when
        set.add(1);
        int currentSize = set.size();

        //then
        assertThat(currentSize, is(equalTo(1)));
    }


}