package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//WordTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WordTest {

 @Test
 public void testContains() {
     Word word = new Word(new char[] {'h', 'e', 'l', 'l', 'o'});
     // Stub, will fail until implemented
     assertTrue(word.contains('e'));
     assertTrue(word.contains('o'));
     assertTrue(word.contains('l'));
 }

 @Test
 public void testLength() {
     Word word = new Word(new char[] {'h', 'e', 'l', 'l', 'o'});
     // Stub, will fail until implemented
     assertEquals(5, word.length());
     assertEquals(3, new Word(new char[] {'a', 'b', 'c'}).length());
     assertEquals(0, new Word(new char[] {}).length());
 }

 @Test
 public void testNotNull() {
     Word word = new Word(new char[] {'h', 'e', 'l', 'l', 'o'});
     // Stub, will fail until implemented
     assertNotNull(word.getLetters());
     assertNotNull(new Word(new char[] {'a'}).getLetters());
     assertNotNull(new Word(new char[] {}).getLetters());
 }
}

