package com.whz.runwith;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;

/**
 * @Author: wanghz
 * @Date: 2020/10/31 4:45 PM
 */
@RunWith(Theories.class)
public class RunWithTest {

    @Test
    public void testAdd() {
        System.out.println("A.testAdd");
    }

}
