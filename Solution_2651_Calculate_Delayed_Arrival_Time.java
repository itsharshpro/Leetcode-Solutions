public class Solution_2651_Calculate_Delayed_Arrival_Time {
    public static void main(String[] args) {
        int arrivalTime = 15;
        int delayedTime = 5;
        System.out.println(findDelayedArrivalTime(arrivalTime, delayedTime));
    }
    static public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
    }
}
