package com.itsdigitalacademy.corsocyber.eserciziodecisioni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void test() {
		Fibonacci fibonacci = new Fibonacci();
		int n = 1;
		Assert.assertEquals(n,fibonacci.fionacci(1));
	}void test1() {
		Fibonacci fibonacci = new Fibonacci();
		int n = 2;
		Assert.assertEquals(n,fibonacci.fionacci(2));
	}void test2() {
		Fibonacci fibonacci = new Fibonacci();
		int n = 3;
		Assert.assertEquals(n,fibonacci.fionacci(3));
	}void test3() {
		Fibonacci fibonacci = new Fibonacci();
		int n = 5;
		Assert.assertEquals(n,fibonacci.fionacci(4));
	}void test4() {
		Fibonacci fibonacci = new Fibonacci();
		int n = 8;
		Assert.assertEquals(n,fibonacci.fionacci(5));
	}void test5() {
		Fibonacci fibonacci = new Fibonacci();
		int n = 13;
		Assert.assertEquals(n,fibonacci.fionacci(6));
	}

}
