import java.util.Scanner;
class LongestWord {
    void findLongest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest Word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
public class YashChoudhary_2628mca0242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        LongestWord obj = new LongestWord();
        obj.findLongest(sentence);
        sc.close();
    }
} 
