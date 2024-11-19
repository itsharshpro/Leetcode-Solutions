public class Solution_1051_Height_Checker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    static public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        bubbleSort(expected);
        int count = 0;
        for(int i = 0; i<heights.length; i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
    static public void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
