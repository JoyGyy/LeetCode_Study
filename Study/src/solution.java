import java.util.*;

public class solution {

    //P01 by joygy
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
            if (sign) break;
        }
        return arr;
    }

    //P13 by AI
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

    //P14 by joygy
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String f_str = strs[0];
        for (int i = 0; i < f_str.length(); i++) {
            for (String str : strs) {
                if (i >= str.length() || f_str.charAt(i) != str.charAt(i)) {
                    return res;
                }
            }
            res += f_str.charAt(i);
        }
        return res;
    }

    //P20 by AI
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //P26 by joygy
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i).intValue();
        }
        return list.size();
    }
}
