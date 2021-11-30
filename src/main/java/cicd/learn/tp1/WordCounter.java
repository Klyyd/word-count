package cicd.learn.tp1;

public class WordCounter {

    public int counter(String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ')
                count++;
        }
        return count;
    }
}