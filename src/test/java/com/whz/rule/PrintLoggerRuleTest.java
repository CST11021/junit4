package com.whz.rule;

import org.junit.Rule;
import org.junit.Test;

/**
 * @Author: wanghz
 * @Date: 2020/10/31 3:38 PM
 */
public class PrintLoggerRuleTest {

    /**
     * @Before/@After Vs @Rule
     * 如果我们想再多个测试类中服用编写的@Before装饰的setUp()方法和@After装饰的tearDown()方法时，可以考虑使用@Rule注解。
     * 在使用@Rule注解时，@Rule修饰的类需要实现TestRule或MethodRule(计划被@TestRule所取代)接口中的apply方法。
     *
     * @Rule Vs @ClassRule
     * @ClassRule对标@BeforeClass/@AfterClass
     * @Rule对标@Before/@After
     * @ClassRule 是 static方法，@Rule不是。但@ClassRule和@Rule修饰的成员变量都必须为public。
     */
    @Rule
    public PrintLoggerRule printLoggerRule = new PrintLoggerRule();

    @Test
    public void printTest() {
        System.out.println("测试。。。");
    }

}
