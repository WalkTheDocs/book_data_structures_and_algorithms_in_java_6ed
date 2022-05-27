package book_data_structures_and_algorithms_in_java_6ed.ch3_fundamental_data_structures.Reinforcement;

/**
 * Class for doing encryption using the Caesar Cipher
 */
public class CaesarCipher {
   protected char[] encoder = new char[26];
   protected char[] decoder = new char[26];

   /**
    * To use this class in another language we would have to change 26 to the number of letters
    * in the alphabet of that language.
    */
   public CaesarCipher(int rotation) {
      for (int k = 0; k < 26; k++) {
         encoder[k] = (char) ('A' + (k + rotation) % 26);
         decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
      }
   }

   public String encrypt(String message) {
      return transform(message, encoder);
   }

   public String decrypt(String message) {
      return transform(message, decoder);
   }

   private String transform(String message, char[] code) {
      char[] msg = message.toCharArray();
      for (int k = 0; k < msg.length; k++) {
         if (Character.isUpperCase(msg[k])) {
            int index = msg[k] - 'A';
            msg[k] = code[index];
         }
      }
      return new String(msg);
   }

   public static void main(String[] args) {
      CaesarCipher cipher = new CaesarCipher(3);
      System.out.println("Encryption code = " + new String(cipher.encoder));
      System.out.println("Decryption code = " + new String(cipher.decoder));
      String message = "The EAGLE IS IN PLAY; MEET AT JOE'S.";
      String coded = cipher.encrypt(message);
      System.out.println("Secret: " + coded);
      String answer = cipher.decrypt(coded);
      System.out.println("Message: " + answer);
   }
}
