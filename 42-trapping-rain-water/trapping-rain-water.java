class Solution {
    public int trap(int[] height) {
        int water=0;
        int l_max=height[0];
        int r_max=height[height.length-1];
        int l=0, r=height.length-1;

        while(l<r){
            l_max=Math.max(l_max,height[l]);
            r_max=Math.max(r_max,height[r]);

            if(l_max<r_max){
                water+=l_max-height[l];
                l++;
            }
            else{
                water+=r_max-height[r];
                r--;
            }
        }
        return water;
    }
}