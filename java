class Solution {
    public int maxDepth(String s) {
        Stack st=new Stack();
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(s.charAt(i)==')' && !st.isEmpty()){
                st.pop();
                count--;
            }
        }
        return max;
    }
}
