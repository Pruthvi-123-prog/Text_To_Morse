import java.util.Scanner;
public class morse {
    public static void main(String[] args) {
        String[] morse = {
            ".- ",    // A
            "-... ",  // B
            "-.-. ",  // C
            "-.. ",   // D
            ". ",     // E
            "..-. ",  // F
            "--. ",   // G
            ".... ",  // H
            ".. ",    // I
            ".--- ",  // J
            "-.- ",   // K
            ".-.. ",  // L
            "-- ",    // M
            "-. ",    // N
            "--- ",   // O
            ".--. ",  // P
            "--.- ",  // Q
            ".-. ",   // R
            "... ",   // S
            "- ",     // T
            "..- ",   // U
            "...- ",  // V
            ".-- ",   // W
            "-..- ",  // X
            "-.-- ",  // Y
            "--.. "   // Z
        };

        System.out.println("Enter the text you want to convert to morse:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] morse_char = word.toUpperCase().toCharArray();
        System.out.print("Here is your morse code: ");
        for(char i : morse_char){
            if (i == ' ') {
                System.out.print("  "); 
            } else if (i >= 'A' && i <= 'Z') {
                int morse_index = i - 'A';
                System.out.print(morse[morse_index]);
            }
        }
        scanner.close();
    }        
}
