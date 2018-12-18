package hangman.test;

import static org.junit.jupiter.api.Assertions.*;
import hangman.util.Alphabet;
import org.junit.jupiter.api.Test;

class AlphabetTest {

	
	@Test
	void testAlphabet() {
		
		//Test getting the fourth letter of the alphabet (index starts at 0)
		assertEquals(Alphabet.getLetter(3), 'D');
		
		// Test the inverse direction
		assertEquals(Alphabet.getNummber('a'), 0);

		
		// Test case insensitivity
		assertEquals(Alphabet.getNummber('A'), 0);
		
	}
}
