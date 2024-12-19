package com.korit.main;

import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 제네릭
public class Main3 {
    public static boolean test() {
        return 10 % 2 == 0;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"a","b","c"};
        Integer[] numbers = new Integer[] {1,2,3};

        List<Integer> list = List.of(1,2,3,4,5); // 요소추가 삭제 안됨
        List<Integer> list2 = new ArrayList<>(); // 가능
        list2.addAll(list); // 새 리스트에 담기
        list.add(10); // 추가

        List<Integer> list3 = list.stream().collect(Collectors.toList());
        list3.add(20);

    }
}
