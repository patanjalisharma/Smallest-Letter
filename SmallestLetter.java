//This code will only run on leetcode problem no. 744

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[end]) {
            return letters[0];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}



//This code can run on any code editior
public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

     static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[end]) {
            return letters[0];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}