import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean runApp = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a Caesar Cipher application!");
        try {
            while(runApp){
                System.out.println("What would you like to do: 1. Encrypt 2. Decrypt 3. Exit(Use a Number)");
                String userChoice = bufferedReader.readLine();
                Integer intUserChoice = Integer.parseInt(userChoice);
                if(intUserChoice == 1  ){
                    System.out.println("Enter Text");
                    String userText = bufferedReader.readLine();
                    System.out.println("Enter key as a Number");
                    String userKey = bufferedReader.readLine();
                    Integer intKey = Integer.parseInt(userKey);
                    CaesarCipher userCipher = new CaesarCipher(userText,intKey);
                    String cipherText = userCipher.encode();
                    System.out.println("-----------------------------------------------------");
                    System.out.println("What you entered ------>  "+ userText  );
                    System.out.println("Encrypted as     ------>  " + cipherText);
                    System.out.println("-----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");
                }
                else if(intUserChoice == 2){
                    System.out.println("Enter Text");
                    String userText = bufferedReader.readLine();
                    System.out.println("Enter key as a Number");
                    String userKey = bufferedReader.readLine();
                    Integer intKey = Integer.parseInt(userKey);
                    CaesarCipher userCipher = new CaesarCipher(userText,intKey);
                    String plainText = userCipher.decode();
                    System.out.println("-----------------------------------------------------");
                    System.out.println("What you entered ------>  "+ userText  );
                    System.out.println("\" Decrypted as  ------>  " + plainText);
                    System.out.println("-----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");
                }
                else if(intUserChoice == 3){
                    runApp = false;
                }
                else{
                    System.out.println(" Sorry  ivalid details entered");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}























































