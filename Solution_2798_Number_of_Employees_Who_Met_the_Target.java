public class Solution_2798_Number_of_Employees_Who_Met_the_Target {
    public static void main(String[] args) {
        int[] hours = {1,2,3,4,5};
        int target = 3;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
    static public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i: hours){
            if(i>=target){
                count++;
            }
        }
        return count;
    }
}
