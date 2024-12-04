import java.util.Arrays;

public class Solution_344_Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            // Swap elements at i and j
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
