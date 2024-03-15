package testResources;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import resources.JUnitMessage;

public class AirthematicTest {
	public String message = "Fpoly exception";
	JUnitMessage junitMessage = new JUnitMessage(message);

	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage() throws Exception {
		System.out.println("fpoly Junit Message exception is printing ");
		junitMessage.printMessage();
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

	@Test
	public void testJUnitHiMessage() {
		message = "Hi!" + message;
		System.out.println("Fpoly Junit Message is printing ");
		assertEquals(message, junitMessage.printHiMessage());
	}
}
