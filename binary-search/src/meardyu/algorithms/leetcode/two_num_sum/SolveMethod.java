package meardyu.algorithms.leetcode.two_num_sum;

import java.util.*;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * <p>
 * 所以返回 [0, 1]
 */
public class SolveMethod {

    //大致思路没问题，就是还有重复问题
    //重复数据没处理，比如有两个2，两个7，可以考虑加个tag
    public static void main(String[] args) {
        Integer[] a = {2, 7, 11, 15};
        List<ResultDTO> solve = solve(a, 9);
        solve.forEach(s -> System.out.println("[" + s.getNum1() + "," + s.getNum2() + "]"));
    }

    private static List<ResultDTO> solve(Integer[] a, int target) {
        List<ResultDTO> result = new ArrayList<>();
        List<Integer> list = List.of(a);
        Map<Integer, Integer> map = buildSearchMap(list, target);
        for (int i = 0; i < list.size(); i++) {
            Integer key = list.get(i);
            if (map.get(key) != null) {
                result.add(new ResultDTO(i, map.get(key)));
            }
        }
        return result;
    }

    private static Map<Integer, Integer /*index*/> buildSearchMap(List<Integer> list, int target) {
        Map<Integer, Integer> searchMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer num1 = list.get(i);
            Integer num2 = target - num1;
            searchMap.put(num2, i);
        }
        return searchMap;
    }
}
