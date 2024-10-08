package week1.w1_test;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import week1.w1_code.OptimizedMultiplier;

public class OptimizedMultiplierManualTest {

	@Test
	public void tc1() {
		BigInteger bi1 = new BigInteger("460781641541");
		BigInteger bi2 = new BigInteger("893623412240142");
		
		BigInteger ret1 = OptimizedMultiplier.fastMultiply(bi1, bi2);
		BigInteger ret2 = OptimizedMultiplier.standardMultiply(bi1, bi2);
		
		assertEquals(0,ret1.compareTo(ret2));
		
	}

	@Test
	public void tc2() {
		BigInteger bi1 = new BigInteger("-886421817479149");
		BigInteger bi2 = new BigInteger("952669276698546");

		BigInteger ret1 = OptimizedMultiplier.fastMultiply(bi1, bi2);
		BigInteger ret2 = OptimizedMultiplier.standardMultiply(bi1, bi2);

		assertEquals(0,ret1.compareTo(ret2));

	}

}
