public class Solution_1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int []nums= {-12,12324,1231,12311,123123,2421,123,1244,124,4};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int x = 0;
        /*  More optimised solution to find number of digits of an integer is even or not :
            for(int num:nums){
		        if(((int)(Math.log10(num))+1)%2==0){
		        x++;
		        }
            } */
        for (int i : nums) {
            //case for negative numbers
            if (i < 0) {
                i = i * -1;
            }
            if (String.valueOf(i).length() % 2 == 0) {
                x++;
            }
        }
        return x;
    }
}
