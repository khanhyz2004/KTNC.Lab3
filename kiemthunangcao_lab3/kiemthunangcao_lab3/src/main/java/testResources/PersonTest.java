package testResources;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import resources.Person;

public class PersonTest {
	// Bài 1
	// @Rule
//	public ExpectedException exception = ExpectedException.none();
//
//	@Test
//	public void testExpectedException() {
//		exception.expect(IllegalArgumentException.class);
//		new Person("Fpoly", -1);
//	}

	// Bài 2
//	@Test(expected = IllegalArgumentException.class)
//	public void testExpectedException2() {
//	new Person("Fpoly", -1);
//	
//	}

	// Bài 3

	@Test
	public void testExpectedException3() {
		try {
			new Person("Fpoly", -1);
			fail("Should have thrown an IllegalArgumentException because age is invalid!");
		} catch (IllegalArgumentException e) {
		}
	}
}