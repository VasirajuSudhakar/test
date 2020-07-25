package com.test.first;

import java.util.ArrayList;
import java.util.List;

public class CommonEleInSorted {
    public CommonEleInSorted(){
        callM();
    }

    public static void main(String[] s) {
        CommonEleInSorted t = new CommonEleInSorted();

    }

    public void callM(){

        int[] first = {12, 16, 27, 35, 38, 46, 57, 68, 79, 95};
        int[] second = {15, 16, 25, 35, 38, 48, 65, 79};

        int fistLen = first.length;
        int secLen = second.length;
        int i=0, j =0;

        List<Integer> commonElemt = new ArrayList<>();
        while (i < fistLen && j < secLen) {
            if (first[i] < second[j]) {
                i++;
            } else if (first[i] > second[j]) {
                j++;
            } else {
                commonElemt.add(first[i]);
                i++; j++;
            }
        }
        sop(commonElemt);
    }




    public void sop(Object o) {
        System.out.println(o);
    }
}
