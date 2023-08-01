package ProgrammersPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 문자열개수구하기Test {

    @Test
    void generatePermutation() {
        문자열개수구하기 문자열개수구하기 = new 문자열개수구하기();
        int result = 문자열개수구하기.generatePermutation(new String("abcde"));
        assertEquals(120,result);
    }
}