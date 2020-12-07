package com.yyc.learnleetcode.learnalgorithms.a905;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input = new int[]{3, 1, 2, 4};
    int[] expected = new int[]{2, 4, 3, 1};
    //这个是指向数组的引用是final修饰的，这个引用指向了一个地址，这个地址里的存的内容是可以改变的。
    final int[] finalInput = new int[]{3, 1, 2, 4};

    @Test
    void sortArrayByParity() {
        assertArrayEquals(expected, new Solution().sortArrayByParity(input));
    }

    @Test
    void simpleSortArrayByParity() {
        assertArrayEquals(expected, new Solution().simpleSortArrayByParity(input));
    }

    @Test
    void finalInputTest() {
        assertArrayEquals(expected, new Solution().simpleSortArrayByParity(finalInput));
    }

    @Test
    @DisplayName("校验int数组")
    void deepCopyIntArrTest() {
        int[] IntArrInput = new int[]{3, 1, 2, 4};
        int[] inputCopy = IntArrInput;
        int[] inputCopy2 = Arrays.copyOf(IntArrInput, input.length);
        System.out.println("input指向的地址:" + IntArrInput);
        System.out.println("inputCopy指向的地址:" + inputCopy);
        System.out.println("inputCopy2指向的地址:" + inputCopy2);
        inputCopy2[0] = 0;
        System.out.println(Arrays.toString(IntArrInput));
        System.out.println(Arrays.toString(inputCopy2));
        assertNotEquals(IntArrInput, inputCopy2);
    }

    @Test
    @DisplayName("校验字符串数组")
    void deepCopyStringArrTest() {
        String[] stringArrInput = new String[]{"3", "1", "2", "4"};
        String[] stringArrCopy = stringArrInput;
        String[] stringArrCopy2 = Arrays.copyOf(stringArrInput, stringArrInput.length);
        System.out.println("stringArrInput指向的地址:" + stringArrInput);
        System.out.println("stringArrCopy指向的地址:" + stringArrCopy);
        System.out.println("stringArrCopy2指向的地址:" + stringArrCopy2);
        stringArrCopy2[0] = "0";
        System.out.println(Arrays.toString(stringArrInput));
        System.out.println(Arrays.toString(stringArrCopy2));
        assertNotEquals(stringArrInput, stringArrCopy2);
    }

    @Test
    @DisplayName("校验对象数组")
    void deepCopyObjectArrTest() {
        Dog kitty = new Dog("kitty", 18);
        Dog Amy = new Dog("Amy", 20);
        Dog[] dogArr = {kitty, Amy};
        Dog[] dogArrCopy = Arrays.copyOf(dogArr, dogArr.length);
        System.out.println("stringArrCopy指向的地址:" + dogArr);
        System.out.println("stringArrCopy2指向的地址:" + dogArrCopy);
        dogArrCopy[0].setAge(21);
        System.out.println(Arrays.toString(dogArr));
        System.out.println(Arrays.toString(dogArrCopy));
        assertNotEquals(dogArr, dogArrCopy);
    }

    @Test
    @DisplayName("校验对象数组,用SerializationUtils")
    void cloneObjectArrTest() {
        Dog kitty = new Dog("kitty", 18);
        Dog Amy = new Dog("Amy", 20);
        Dog[] dogArr = {kitty, Amy};
        Dog[] dogArrCopy = SerializationUtils.clone(dogArr);
        System.out.println("stringArrCopy指向的地址:" + dogArr);
        System.out.println("stringArrCopy2指向的地址:" + dogArrCopy);
        dogArrCopy[0].setAge(21);
        System.out.println(Arrays.toString(dogArr));
        System.out.println(Arrays.toString(dogArrCopy));
        assertNotEquals(dogArr, dogArrCopy);
    }
}