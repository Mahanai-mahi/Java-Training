class TrappingRainWater{
    public int trap(int[] height){
        int h[]=new int[height.length];
        h=height.clone();
        int maxwater=0;
        int water=0;
        int n=h.length;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=h[0];
        r[n-1]=h[n-1];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],h[i]);
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],h[i]);
        }
        for(int i=0;i<n;i++){
            maxwater=Math.min(l[i],r[i]);
            water+=maxwater-h[i];
        }
        return water;
    }
}
