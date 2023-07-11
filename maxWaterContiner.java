class maxWaterContainer {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while (left < right) {
            int hgt = Math.min(arr[left], arr[right]);
            int area = hgt * Math.abs(left - right);
            ans = Math.max(ans, area);
        }
        if(arr[left]<arr[right]){
            left++;
        }
        else{
            right--;
        }
        System.out.println(ans);
    }
}