public class Solution_2011_Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        String[] arr = {"++X","X++","X--","--X"};
        System.out.println(finalValueAfterOperations(arr));
    }
    static public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("X++")||operations[i].equals("++X")){
                sum+=1;
            }
            else{
                sum-=1;
            }
        }
        return sum;
    }
}
