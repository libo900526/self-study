package com.my.study.eurekaclient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EurekaServerApplicationTest {

	@BeforeAll
	public static void beforeAllMet() {
		System.out.println("beforeAll");
	}
	@BeforeEach
	public void beforeEachMet() {
		System.out.println("beforeEach");
	}
	@Test
	public void test01() {
		System.out.println("test01");
	}
	@Test
	public void test02() {
		System.out.println("test02");
		int a = 2;
		Assertions.assertEquals(1,a);
	}

}
