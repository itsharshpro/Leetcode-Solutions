public class Solution_278_First_Bad_Version {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }
    static public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start+((end-start)/2);
            if (isBadVersion(mid)==true){
                if(isBadVersion(mid-1)==true){
                    end = mid-1;
                    continue;
                }
                else{
                    return mid;
                }
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static boolean isBadVersion(int version){
        int bad = 6;
        if(version>=bad){
            return true;
        }
        return false;
    }
    
}
