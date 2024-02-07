// 1299. Replace Elements with Greatest Element on Right Side

class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[] { -1 };
        }

        int[] newArr = new int[arr.length];
        newArr[newArr.length - 1] = -1;
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            int before = arr[i + 1];
            max = Math.max(max, before);
            newArr[i] = max;
        }
        return newArr;
    }
}
