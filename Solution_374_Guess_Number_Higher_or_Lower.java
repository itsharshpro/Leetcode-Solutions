public class Solution_374_Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    static public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start+((end-start)/+2);
            if (guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==-1){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int guess(int num){
        int pick = 6;
        if(num==pick){
            return 0;
        }
        else if(num<pick){
            return 1;
        }
        else{
            return -1;
        }
    }
}
