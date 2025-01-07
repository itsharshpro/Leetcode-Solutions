public class Solution_3019_Number_of_Changing_Keys {
    public static void main(String[] args) {
        String s = "aAbBcC";
        System.out.println(countKeyChanges(s));
    }
    static public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0; i<s.length()-1; i++){
            int ch = s.charAt(i);
            int temp = s.charAt(i+1);
            if(ch!=temp){
                count++;
                continue;
            }
        }
        return count;
    }
}
