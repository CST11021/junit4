## @Rule与@ClassRule注解



### @Before/@After Vs @Rule

如果我们想再多个测试类中服用编写的`@Before`装饰的`setUp()`方法和`@After`装饰的`tearDown()`方法时，可以考虑使用`@Rule`注解。
在使用`@Rule`注解时，`@Rule`修饰的类需要实现`TestRule`或`MethodRule`(计划被`@TestRule`所取代)接口中的`apply`方法。

### @Rule Vs @ClassRule

`@ClassRule`对标`@BeforeClass/@AfterClass`
`@Rule`对标`@Before/@After`
`@ClassRule` 是 static方法，`@Rule`不是。但`@ClassRule`和`@Rule`修饰的成员变量都必须为`public`。

### TestRule 示例:



参考：https://blog.csdn.net/Dream_Weave/article/details/83860755



