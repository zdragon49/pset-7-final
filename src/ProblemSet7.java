public class ProblemSet7 {
    public static void main(String[] args) {
    }
    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        if (out == null || out.length() != 4 || in == null) {
           return in;
        } else {
           return out.substring(0, 2) + in + out.substring(2);
      }
    }
    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
   public String endsMeet(String text, int n) {
       if (text == null || text.length() < 1 || text.length() > 10 || n < 1 || n > text.length()) {
            return text;
        } else {
           return text.substring(0, n) + text.substring(text.length() - n);
       }
   }
    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        if (text == null || !(text.length() >= 3 && text.length() % 2 == 1)) {
            return text;
        } else {
            return text.substring(text.length() - (2 + text.length() / 2), (text.length() / 2) + 2);
        }
    }
    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if (text == null || target == null || !(text.length() >= 3 && text.length() % 2 == 1) || target.length() != 3) {
            return false;
        } else {
            return target.equals(text.substring(text.length() - (2 + text.length() / 2), (text.length() / 2) + 2));
        }
    }
    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        if (text == null || !Character.isLetter(suffix)) {
            return -1;
        } else {
            int count = 0;
            if (text.contains(" ")) {
                count += (text.substring(0, text.indexOf(" ")).endsWith(String.valueOf(suffix))) ? 1 : 0;
                for (int i = 0; i < text.lastIndexOf(" "); i++) {
                    if (text.charAt(i) == ' ') {
                        count += (text.substring(i, i + 1 + text.substring(i + 1).indexOf(" ")).endsWith(String.valueOf(suffix))) ? 1 : 0;
                    }
                }
                count += (text.substring(text.lastIndexOf(" ")).endsWith(String.valueOf(suffix))) ? 1 : 0;
            } else {
                count += (text.endsWith(String.valueOf(suffix))) ? 1 : 0;
            }return count;
        }
    }
    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        if (text == null) {
            return -1;
        } else {
            int count = 0;
            char seq = (text.length() > 0) ? text.charAt(0) : ' ';
            int consec = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == seq) {
                    consec += 1;
                    if (consec >= 3) {
                        count += 1;
                    }
                } else {
                    seq = text.charAt(i);
                    consec = 1;
                }
            } return count;
        }
    }
    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        if (text == null) {
            return -1;
        } else {
            long total = 0;
            for (int i = 0; i < text.length(); i++) {
                total += (Character.isDigit(text.charAt(i))) ? Long.parseLong(String.valueOf(text.charAt(i))) : 0;
            } return total;
        }
    }
    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        if (text == null) {
            return -1;
        } else {
            char next = (text.length() > 0) ? text.charAt(0) : ' ';
            long conse = 0;
            long longest = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == next) {
                    conse += 1;
                    if (conse > longest) {
                        longest = conse;
                    }
                } else {
                    next = text.charAt(i);
                    conse = 1;
                }
            }return longest;
        }
    }
    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        if (a == null || b == null) {
            return null;
        } else {
            String output = "";
            String c = (a.length() < b.length()) ? a : b;
            String d = (a.length() < b.length()) ? b : a;
            for (int i = 0; i < c.length(); i++) {
                output += String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
            }
            for (int j = 0; j < d.substring(c.length()).length(); j++) {
                output += String.valueOf(d.substring(c.length()).charAt(j));
            } return output;
        }
    }
    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        } else {
            String reverse = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reverse += String.valueOf(text.charAt(i));
            } return reverse.equals(text);
        }
    }
}
