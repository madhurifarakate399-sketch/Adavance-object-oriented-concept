import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {

        String path = "sample.txt";

        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }

                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    }

                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Number of times 'a' appears: " + countA);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}