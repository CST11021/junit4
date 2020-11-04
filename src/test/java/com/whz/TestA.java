package com.whz;

import org.junit.*;

public class TestA {

    // @FixMethodOrder

    public TestA() {

    }

    @Before
    public void before() {
        System.out.println("@Before");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass");
    }

    @After
    public void after() {
        System.out.println("@After");
    }

    /**
     *
     *
     * @BeforeClass
     * @Before
     * A.testAdd
     * @After
     * @AfterClass
     *
     */
    @Test
    public void testAdd() {
        System.out.println("A.testAdd");
    }

    /**
     *
     */
    @Test
    @Ignore
    public void testIgnore() {
        throw new RuntimeException();
    }
}