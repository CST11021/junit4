package com.whz.runwith;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.theories.*;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

/**
 * @Author: wanghz
 * @Date: 2020/10/31 5:01 PM
 */


@RunWith(Theories.class)
public class TheoriesTest {

    @DataPoint("n1")
    public static int i1 = 1;

    @DataPoint("n2")
    public static int i0 = 0;

    @DataPoints("n3")
    public static int[] arr = new int[] { 1, 2, 3 };

    @Theory
    public void testAdd(@FromDataPoints("n1") int n1, @FromDataPoints("n2") int n2) {

        System.out.println(n1);
        System.out.println(n2);
        assertEquals(1, n1 + n2);

    }

    @Theory
    public void testDataPoints(int i) {
        assertThat(i, anyOf(is(0), is(1), is(2), is(3)));
    }

    @Theory
    public void testTestedOn(@TestedOn(ints = { 4, 5, 6 }) int i) {
        assertThat(i, anyOf(is(4), is(5), is(6)));
    }

}
