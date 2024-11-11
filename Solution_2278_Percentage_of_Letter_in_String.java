public class Solution_2278_Percentage_of_Letter_in_String {
    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
    }
    static public int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        return ((count*100/s.length()));
    }
}
