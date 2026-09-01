class Solution {
    public int maxArea(int[] hts) {
        int start = 0 , end = hts.length-1, mArea = 0;
        while(start<end){
            int ht = Math.min(hts[start],hts[end]);
            int wd = end-start;
            mArea = Math.max(mArea,(ht*wd));
            if(hts[start]<hts[end]) start++;
            else end--;
        }
    
        return mArea;
    }
}
