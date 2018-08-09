package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SortServer {

    public String sort(String sortNum) {
        if (sortNum != null) {
            String[] sorts = sortNum.split("@");
            if (sorts.length != 0) {
                return sortStr(sorts);
            }
        }

        return null;
    }

    private String sortStr(String[] sortNums) {
        int[] arr = new int[sortNums.length];
        for (int i = 0; i < sortNums.length; i++) {
            try {
                arr[i] = Integer.parseInt(sortNums[i]);
            } catch (Exception e) {
                e.printStackTrace();
                return "{\"massage\":\"input error\"}";
            }
        }
        long[] times = new long[1];

        sortInt(arr, 0, arr.length - 1, times);
        return "{\"cycleTimes\":" + times[0] + ",\"data\":" + Arrays.toString(arr) + "}";
    }

    /**
     * @param arr        排序数组
     * @param startIndex 开始索引
     * @param endIndex   结束索引
     */
    private void sortInt(int[] arr, int startIndex, int endIndex, long[] times) {
        if (startIndex > endIndex) {
            return;
        }

        int i = startIndex;
        int j = endIndex;
        int baseValue = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= baseValue) {
                j--;
                times[0]++;
            }
            while (i < j && arr[i] <= baseValue) {
                i++;
                times[0]++;
            }
            if (i < j) {
                int tempValue = arr[j];
                arr[j] = arr[i];
                arr[i] = tempValue;
            }
        }
        times[0]++;

        arr[startIndex] = arr[i];
        arr[i] = baseValue;

        sortInt(arr, startIndex, j - 1, times);
        sortInt(arr, j + 1, endIndex, times);
    }
}
