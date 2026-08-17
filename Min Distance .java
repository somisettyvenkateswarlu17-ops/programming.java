class Solution {
    public int minDistance(String word1, String word2) {
        int rSize=word1.length(),cSize=word2.length();
        int[][] grid=new int[rSize+1][cSize+1];
        for(int rIn=0;rIn<rSize;rIn++) grid[rIn][0]=rIn;
        for(int cIn=0;cIn<cSize;cIn++) grid[0][cIn]=cIn;
        for(int rIn=1;rIn<=rSize;rIn++){
            for(int cIn=1;cIn<=cSize;cIn++){
                if(word1.charAt(rIn-1)==word2.charAt(cIn-1))
                    grid[rIn][cIn]=grid[rIn-1][cIn-1];
                else{
                    grid[rIn][cIn]=1+Math.min(grid[rIn-1][cIn-1],Math.min(grid[rIn-1][cIn],grid[rIn][cIn-1]));
                }
            }
        }
        return grid[rSize][cSize];
    }
}
