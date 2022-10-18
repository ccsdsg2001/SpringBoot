package com.example.springbootweb;

import io.undertow.util.StatusCodes;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/**
 * @author cc
 * @date 2022年10月18日 20:05
 */

@DisplayName("测试")
public class TEST1 {


    @DisplayName("庵")
    @Test
    void testsimpleassertions(int i,int j){
          i = 2;
          j =3 ;
          int cal = 2+3;
          Assertions.assertEquals(6,cal); // 第一个为变量值 第二个为变量
        Object o = new Object();
        Object o1 = new Object();
        Assertions.assertSame(o, o1);
        Assertions.assertArrayEquals(new int[]{1,2}, new int[]{2,3});

        Assertions.assertThrows(ArithmeticException.class, () -> {
            int ad = 10 /0;
        },"asd");

        Assumptions.assumeTrue(false,"jieguobushit");

    }






    @DisplayName("test")
    @RepeatedTest(value = 5)
    @Test
    void test12(){
        System.out.println(1);
    }

    @Disabled
    @BeforeEach
    void beforeeach(){
        System.out.println("kaishil");
    }
    @Timeout(value = 6,unit = TimeUnit.MILLISECONDS)
    @Test
    void testtimeout(){}

    @AfterEach
    void aftereach(){
        System.out.println("测试结束");
    }


    @BeforeAll
    static void testbeforall(){
        System.out.println("kcsc");
    }

    @AfterAll
    static void afterall(){
        System.out.println("jieshl");
    }








}
