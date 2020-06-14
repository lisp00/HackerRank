public class Solution {
    public static void main(String[] args) {
        long arr[] = {256741038,623958417,467905213,714532089,938071625};

        miniMaxSum(arr);
    }

    private static void miniMaxSum(long[] arr) {
        long sumArr[] = new long[arr.length];
        long sum = 0;
        long min;
        long max;

        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            sumArr[i] = sum - arr[i];
        }

        min = sumArr[0];
        max = sumArr[0];

        for(int i=0;i<sumArr.length;i++) {
            if(min > sumArr[i]) {
                min = sumArr[i];
            }
            if(max < sumArr[i]) {
                max = sumArr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
