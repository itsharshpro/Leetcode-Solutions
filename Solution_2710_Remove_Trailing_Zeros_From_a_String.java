public class Solution_2710_Remove_Trailing_Zeros_From_a_String {
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }
    static public String removeTrailingZeros(String num) {
        int index = num.length();
        for(int i = num.length()-1; i>0; i--){
            if(num.charAt(i)=='0'){
                index--;
            }
            else{
                break;
            }
        }
        return num.substring(0,index);
    }
}
