public class Solution_771_Jewels_and_Stones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
    static public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i<stones.length(); i++){
            for(int j = 0; j<jewels.length(); j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
