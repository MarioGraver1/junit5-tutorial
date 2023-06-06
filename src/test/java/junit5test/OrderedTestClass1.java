package junit5test;

import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTestClass1 {

    @BeforeAll
    void beforeAll(){
        System.out.println("This is the before all method");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("This is the before each method");
    }
    @AfterAll
    void afterAll(){
        System.out.println("This is the after all method");
    }
    @AfterEach
    void afterEach(){
        System.out.println("This is the after Each method");
    }
    @Test
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US1234 - TC12 - this method is the secnd one")
    void secondMethod(){
        System.out.println("This is the second test method");
    }
}
