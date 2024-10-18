import java.util.ArrayList;

public class Solution_682_Baseball_Game {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
    static public int calPoints(String[] op) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<op.length; i++){
            if(!op[i].equals("C")&&!op[i].equals("D")&&!op[i].equals("+")){
                arr.add(Integer.parseInt(op[i]));
            }
            else if(op[i].equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(op[i].equals("D")){
                arr.add(arr.get(arr.size() - 1)*2);
            }
            else{
                arr.add(arr.get(arr.size() - 1)+arr.get(arr.size() - 2));
            }
        }
        int sum = 0;
        for(int i = 0; i<arr.size(); i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}
