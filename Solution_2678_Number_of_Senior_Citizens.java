public class Solution_2678_Number_of_Senior_Citizens{
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    static public int countSeniors(String[] details) {
        int count = 0;
        for(String x : details){
            int y = Integer.parseInt(x.substring(11, 13));
            if(y>60){
                count++;
            }
        }
        return count;
    }
}