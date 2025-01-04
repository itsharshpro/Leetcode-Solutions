public class Solution_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
    static public int numberOfSteps(int num) {
        int x = 1;
        if(num==0){
            return 0;
        }
        if(num%2==0){
            return x + numberOfSteps(num/2);
        }
        else{
            return x + numberOfSteps(num-1);
        }
    }
}
