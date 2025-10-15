import java.util.*;

public class solution {

    //P01
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        boolean sign = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    sign = true;
                    break;
                }
            }
            if (sign)
                break;
        }
        return arr;
    }

    //P13
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romanMap.get(s.charAt(i));
            if (i < n - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    //P14
    public String longestCommonPrefix(String[] strs) {

    }
}
