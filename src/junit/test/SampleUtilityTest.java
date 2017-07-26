package junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.SampleUtility;

public class SampleUtilityTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}

	@Test
	public void testGetJapaneseHelloMorning() {
		System.out.println("testGetJapaneseHelloMorning()");
		SampleUtility util = new SampleUtility();
		assertEquals("おはよう", util.getJapaneseHello(SampleUtility.MORNING));
	}

	@Test
	public void testGetJapaneseHelloDayTime() {
		System.out.println("testGetJapaneseHelloDayTime()");
		SampleUtility util = new SampleUtility();
		assertEquals("こんにちは", util.getJapaneseHello(SampleUtility.DAYTIME));
	}

	@Test
	public void testGetJapaneseHelloNight() {
		System.out.println("testGetJapaneseHelloNight()");
		SampleUtility util = new SampleUtility();
		assertEquals("こんばんは", util.getJapaneseHello(SampleUtility.NIGHT));
	}

}
