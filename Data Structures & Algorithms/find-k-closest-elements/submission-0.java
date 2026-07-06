class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> li = new ArrayList<>();
        int l=0, r = arr.length-1;
        int ws = r-l+1;
        while(ws!=k){
            int xl = Math.abs(arr[l]-x);
            int xr = Math.abs(arr[r]-x);
            if(xl<xr){
                r--;
            }else if(xl>xr){
                l++;
            }else if(xl==xr){
                if(arr[l]<arr[r]){
                    r--;
                }else{
                    l++;
                }
            }else{
                break;
            }
            ws = r-l+1;

        }
        for(int i =l;i<=r;i++){
            li.add(arr[i]);
        }
        return li;
    }
}