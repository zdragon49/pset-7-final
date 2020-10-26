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

    public boolean isCentered(String charecter, String aim) {
        if (charecter == null || aim == null || !(charecter.length() >= 3 && charecter.length() % 2 == 1) || aim.length() != 3) {
            return false;
        } else {
            return aim.equals(charecter.substring(charecter.length() - (2 + charecter.length() / 2), (charecter.length() / 2) + 2));
        }
    }

    public int countMe(String charecter, char suff) {
        if (charecter == null || !Character.isLetter(suff)) {
            return -1;
        } else {
            int count = 0;
            if (charecter.contains(" ")) {
                count += (charecter.substring(0, charecter.indexOf(" ")).endsWith(String.valueOf(suff))) ? 1 : 0;
                for (int i = 0; i < charecter.lastIndexOf(" "); i++) {
                    if (charecter.charAt(i) == ' ') {
                        count += (charecter.substring(i, i + 1 + charecter.substring(i + 1).indexOf(" ")).endsWith(String.valueOf(suff))) ? 1 : 0;
                    }
                }
                count += (charecter.substring(charecter.lastIndexOf(" ")).endsWith(String.valueOf(suff))) ? 1 : 0;
            } else {
                count += (charecter.endsWith(String.valueOf(suff))) ? 1 : 0;
            } return count;
        }
    }

    public int triplets(String charecter) {
        if (charecter == null) {
            return -1;
        } else {
            int num = 0;
            char seq = (charecter.length() > 0) ? charecter.charAt(0) : ' ';
            int conse = 0;
            for (int i = 0; i < charecter.length(); i++) {
                if (charecter.charAt(i) == seq) {
                    conse += 1;
                    if (conse >= 3) {
                        num += 1;
                    }
                } else {
                    seq = charecter.charAt(i);
                    conse = 1;
                }
            }return num;
        }
    }

    public long addMe(String charecter) {
        if (charecter == null) {
            return -1;
        } else {
            long total = 0;
            for (int i = 0; i < charecter.length(); i++) {
                total += (Character.isDigit(charecter.charAt(i))) ? Long.parseLong(String.valueOf(charecter.charAt(i))) : 0;
            } return total;
        }
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
