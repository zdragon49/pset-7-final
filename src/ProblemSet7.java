public class ProblemSet7 {
    public static void main(String[] args) {

    }

    public String surroundMe(String in, String out) {
        if (out == null || out.length() != 4 || in == null) {
            return in;
        } else {
            return out.substring(0, 2) + in + out.substring(2);
        }
    }

    public String endsMeet(String charecter, int n) {
        if (charecter == null || charecter.length() < 1 || charecter.length() > 10 || n < 1 || n > charecter.length()) {
            return charecter;
        } else {
            return charecter.substring(0, n) + charecter.substring(charecter.length() - n);
        }
    }

    public String middleMan(String charecter) {
        if (charecter == null || !(charecter.length() >= 3 && charecter.length() % 2 == 1)) {
            return charecter;
        } else {
            return charecter.substring(charecter.length() - (2 + charecter.length() / 2), (charecter.length() / 2) + 2);
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {

    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {

    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {

    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {

    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {

    }
}
