public class Solution_2455_Average_Value_of_Even_Numbers_That_Are_Divisible_by_Three {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,12,15};
        System.out.println(averageValue(arr));
    }
    static public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int num: nums){
            if(num%6==0){
                count++;
                sum+=num;
            }
        }
        if (count==0){
            return count;
        }
        if(count == 1){
            return sum;
        }
        return sum/count;
    }
}
