package griffith;
//Vsevolod Yushchuk 3132335

public class Word {
 private char[] letters;

 // Constructor
 public Word(char[] letters) {
     this.letters = letters;
 }

 // Method to check if a symbol exists in the letters array
 public boolean contains(char symbol) {
     for (char letter : letters) {
         if (letter == symbol) {
             return true;
         }
     }
     return false;
 }

 // Method to get the length of the letters array
 public int length() {
     return letters.length;
 }

 // Getter method for letters array
 public char[] getLetters() {
     return letters;
 }
}
