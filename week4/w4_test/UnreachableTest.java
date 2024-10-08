package week4.w4_test;

import static org.junit.Assert.*;

import org.junit.Test;

import week4.w4_code.Unreachable;

public class UnreachableTest {
	@Test
	public void test1() {
		boolean ret = Unreachable.test(1, 1);
		assertTrue(ret);
	}
	
	@Test
	public void test2() {
		boolean ret = Unreachable.test(-1, 1);
		assertTrue(ret);
	}

	@Test
	public void test3() {
		boolean ret = Unreachable.test(1, -1);
		assertTrue(ret);
	}
}
