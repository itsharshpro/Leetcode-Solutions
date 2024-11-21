public class Solution_1678_Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    static public String interpret(String command) {
        String ans = "";
        for(int i = 0; i<command.length(); i++){
            char x = command.charAt(i);
            if(x=='G'){
                ans+=x;
            }
            else if(x==')'){
                if(command.charAt(i-1)=='('){
                    ans+='o';
                }
                else if(command.charAt(i-1)=='l'){
                    ans+="al";
                }
            }
        }
        return ans;
    }
}
