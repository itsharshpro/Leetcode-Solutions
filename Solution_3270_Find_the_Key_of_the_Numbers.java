public class Solution_3270_Find_the_Key_of_the_Numbers {
    public static void main(String[] args) {
        int num1 = 987;
        int num2 = 879;
        int num3 = 798;
        System.out.println(generateKey(num1, num2, num3));
    }
    static public int generateKey(int num1, int num2, int num3) {
        String ans = "";

        String str1 = leadingZeros(num1);
        String str2 = leadingZeros(num2);
        String str3 = leadingZeros(num3);

        for(int i = 0; i<4; i++){
            int x1 = str1.charAt(i)-'0';
            int x2 = str2.charAt(i)-'0';
            int x3 = str3.charAt(i)-'0';
            int minimumNumber = min(x1, x2, x3);
            ans+=minimumNumber;
        }
        for(int i = 0; i<4; i++){
            if(ans.charAt(i)=='0'){
                continue;
            }
            return Integer.parseInt(ans.substring(i));
        }
        return 0;
    }

    static public String leadingZeros(int num){
        String temp = ""+num;
        int x = 4-temp.length();
        String str = "";
        for(int i = x; i>0; i--){
            str+="0";
        }
        str+=temp;
        return str;
    }

    static public int min(int num1, int num2, int num3){
        int min = num1;
        if(min>num2){
            min = num2;
        }
        if(min>num3){
            min = num3;
        }
        return min;
    }
}
