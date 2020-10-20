import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gb1, gb2;

	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(95);
		gb1.addScore(85);
		gb1.addScore(75);
		
		gb2.addScore(90);
		gb2.addScore(88);
		gb2.addScore(86);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1=gb2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("95.0 85.0 75.0 "));
		assertTrue(gb2.toString().equals("90.0 88.0 86.0 "));
		
		assertEquals(gb1.getScoresSize(), 3);
		assertEquals(gb2.getScoresSize(), 3);
	}

	@Test
	void testSum() {
		assertEquals(gb1.sum(), 255.0);
		assertEquals(gb2.sum(), 264.0);
	}

	@Test
	void testMinimum() {
		assertEquals(gb1.minimum(), 75.0);
		assertEquals(gb2.minimum(), 86.0);
	}

	@Test
	void testFinalScore() {
		assertEquals(gb1.finalScore(), 180.0);
		assertEquals(gb2.finalScore(), 178.0);
	}

}
