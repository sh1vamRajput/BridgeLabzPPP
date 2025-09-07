import java.util.Scanner;

class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); // convert to lowercase to handle both cases

        int vowels = 0, consonants = 0;

        // Loop through each character
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {  // check only alphabets
                if ("aeiou".indexOf(ch) != -1)  // check if vowel
                    vowels++;
                else
                    consonants++;
            }
        }

        // Output results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
