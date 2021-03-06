/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 * @Author chen qian @Edit Time 11:34:40 PM Given an array of integers, find two
 * numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9 
 * Output: index1=1, index2=2
 */
public class Two_Sum {

    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int i = -1;
        while (i < numbers.length) {
            ++i;
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] + numbers[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                    i = numbers.length;
                    break;
                }
            }
        }
        return ret;
    }
}
