package arraypla;

public class longstrwithoutrepeat {

		
		
		    public static void ans(String s) {
		        int maxLen = 0;
		        int start = 0; // start index of longest substring
		        String longest = "";

		        for (int i = 0; i < s.length(); i++) {
		            String current = "";
		            for (int j = i; j < s.length(); j++) {
		                char c = s.charAt(j);
		                if (current.indexOf(c) == -1) {
		                    current += c;
		                } else {
		                    break; // character repeated, stop here
		                }
		                if (current.length() > maxLen) {
		                    maxLen = current.length();
		                    longest = current;
		                    start = i;
		                }
		            }
		        }

		        System.out.println("Longest substring without repeating characters: " + longest);
		        System.out.println("Length: " + maxLen);
		    }

		    public static void main(String[] args) {
		        String s = "abcabcbb";
		        ans(s);
		    }
		}
