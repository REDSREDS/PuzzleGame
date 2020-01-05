public class LongestSubString {
    /*
    This idea is to get the longest number when the substring ends at index i then traverse i from n-1 to 0 and find the longest overall number.
     */
    public static int getLength(int[] arr, int pos, int[] length) {
        int curLength = 1;
        if(pos == 0) {
            return 1;
        } else {
            int maxPre = 0;
            for(int i = 0; i < pos; i++) {
                if(arr[i] < arr[pos])
                    if(length[i] == 0)
                        maxPre = getLength(arr, i, length) > maxPre ? getLength(arr, i, length) : maxPre;
                    else
                        maxPre = length[i] > maxPre? length[i] : maxPre;
            }
            curLength = maxPre + 1;
        }
        return curLength;
    }

    public static int traverse(int[] arr) {
        int[] length = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            length[i] = getLength(arr, i, length);
        }
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(length[i] > max)
                max = length[i];
        }
        return max;
    }
}
