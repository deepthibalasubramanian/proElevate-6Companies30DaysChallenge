class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int arr1[] = new int[uniqueCnt1];
        int arr2[] = new int[uniqueCnt2];
        int indarr1 = 0;
        int indarr2 = 0;
        int i = 1;

        while (indarr1 < uniqueCnt1 || indarr2 < uniqueCnt2) {
            if (i % divisor1 != 0 && indarr1 < uniqueCnt1) {
                arr1[indarr1++] = i;
                // System.out.println("arr1 " + i);
            } else if (i % divisor2 != 0 && indarr2 < uniqueCnt2) {
                arr2[indarr2++] = i;
                // System.out.println("arr2 " + i);
            }
            i++;
        }

        // System.out.println("arr1 " + arr1[indarr1 - 1]);
        // System.out.println("arr2 " + arr2[indarr2 - 1]);

        return Math.max(arr1[indarr1 - 1], arr2[indarr2 - 1]);
    }
}
