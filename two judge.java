class Solution {
    public int findJudge(int n, int[][] trust) {
      int[] in = new int[n+1];
      int[] out = new int[n+1];
      for(int[] each:trust){
        out[each[0]]++;in[each[1]]++;
      }  
      for(int it=1;it<=n;it++){
        if(in[it]==n-1&&out[it]==0) return it;
      }
      return -1;
    }
}
