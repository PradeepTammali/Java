import java.util.*;

class ChefandTypingHelper {
    public static int measureTime(String word) {
        int time = 2;
        boolean usingLeft = false;
        boolean usingRight = false;
        for (char c : word.substring(1).toCharArray()) {
            if(c == 'd' || c == 'f'){
                usingLeft = true;
                time += usingRight ? 2 : 4; 
                usingRight = false;
            } else if (c == 'j' || c == 'k'){
                usingRight =  true;
                time += usingLeft ? 2 : 4;
                usingLeft = false;
            }
        }
        return time;
    }

    public static boolean alreadyExists(String[] words, String word) {
        for(String w: words){
            if(w.equals(word)) return true;
        }
        return false;
    }
};

class ChefandTyping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = 0;
        try {
            testCases = sc.nextInt(); 
        } catch (InputMismatchException e) {
            System.out.println("Error caught!!");
            System.exit(0);
        }
        int result = 0;
        for (int i = 0; i < testCases; i++) {
            int numberOfWords = sc.nextInt();
            String words[] = new String[numberOfWords];
            Arrays.fill(words,"");
            for (int j = 0; j < numberOfWords; j++) {
                String word = sc.next();
                if (ChefandTypingHelper.alreadyExists(words, word)) {
                    result += ChefandTypingHelper.measureTime(word) / 2;
                } else {
                    result += ChefandTypingHelper.measureTime(word);
                }
                words[j] = word;
            }
        }
        System.out.println(result);
        sc.close();
    }
}