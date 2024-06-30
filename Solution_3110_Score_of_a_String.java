public class Solution_3110_Score_of_a_String {
    public static void main(String[] args) {
        String str = "zaz";
        System.out.println(function(str));
    }
    static int function(String s){
        int x = 0;
        for (int i = 0; i < s.length()-1; i++) {
            x += Math.abs(s.charAt(i)-s.charAt(i+1));
            // If a char is given to the Math.abs() method, it will return the ASCII value of the character. 
            // The ASCII value of a character is its numerical representation in the ASCII character set. 
            // For example, the ASCII value of the character 'A' is 65.
        }
        return x;
    }
}
