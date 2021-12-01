package Functions;

public class TextCounter {
    public static int wordCount(String line) {
        if(line == null) {
            return -1;
        }
        else {
            long numWords = 0;
            int index = 0;
            boolean prevWhiteSpace = true;
            line = line.replace('.', ' ').replace(',', ' ');
            while (index < line.length()) {
                char c = line.charAt(index++);
                boolean currWhiteSpace = Character.isWhitespace(c);
                if (prevWhiteSpace && !currWhiteSpace) {
                    numWords++;
                }
                prevWhiteSpace = currWhiteSpace;
            }
            return (int) numWords;
        }
    }

    public static int charCount(String line) {
        if(line == null) {
            return -1;
        }
        else {
            return line.length();
        }
    }

}
