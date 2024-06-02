import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String secrectWord = "corvette";
        boolean isCorrect = false;
        int attempts = 10;
        int currentAttempts = 0;
        
        char[] guessedLetter = new char[secrectWord.length()];
        
        for(int i = 0; i < guessedLetter.length; i++) {
            guessedLetter[i] = '_';
        }

        while(!isCorrect && currentAttempts < attempts) {
            System.out.println("Palabra de " + secrectWord.length() + " letras: " + String.valueOf(guessedLetter));
            System.out.println("Ingresa una letra: ");

            char letter = Character.toLowerCase(scanner.next().charAt(0));

            boolean letterCorrect = false;

            for (int i = 0; i < secrectWord.length(); i++) {
                if(secrectWord.charAt(i) == letter) {
                    guessedLetter[i] = letter;
                    letterCorrect = true;
                }
            }

            if(!letterCorrect) {
                currentAttempts++;
                System.out.println("Incorrecto! Te quedan " + (attempts - currentAttempts) + " intentos.");
            }

            if(String.valueOf(guessedLetter).equals(secrectWord)) {
                isCorrect = true;
                System.out.println("GANASTE, adivinaste la palabra: " + secrectWord);
            }
        }

        if(!isCorrect) {
            System.out.println("PERDISTE, Te quedaste sin intentos!");
        }

    }

 
}
