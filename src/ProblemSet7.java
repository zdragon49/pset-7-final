public class ProblemSet7 {
    public static void main(String[] args) {
        ProblemSet7 test = new ProblemSet7();
        System.out.println(test.surroundMe(null));
    }

    public String surroundMe(String in, String out) {
        if (out == null || out.length() != 4 || in == null) {
           return in;
        } else {
           return out.substring(0, 2) + in + out.substring(2);
      }
    }

   public String endsMeet(String text, int n) {
       if (text == null || text.length() < 1 || text.length() > 10 || n < 1 || n > text.length()) {
            return text;
        } else {
           return text.substring(0, n) + text.substring(text.length() - n);
       }
   }

    public String middleMan(String text) {
        if (text == null || !(text.length() >= 3 && text.length() % 2 == 1)) {
            return text;
        } else {
            return text.substring(text.length() - (2 + text.length() / 2), (text.length() / 2) + 2);
        }
    }

    public boolean isCentered(String text, String target) {
        if (text == null || target == null || !(text.length() >= 3 && text.length() % 2 == 1) || target.length() != 3) {
            return false;
        } else {
            return target.equals(text.substring(text.length() - (2 + text.length() / 2), (text.length() / 2) + 2));
        }
    }

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
