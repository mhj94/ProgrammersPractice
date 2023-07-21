package ProgrammersPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 여행경로Test {

    @Test
    void solution() {
        여행경로 여행경로 = new 여행경로();
        String[] result = 여행경로.solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
        String[] expectedResult = {"ICN", "JFK", "HND", "IAD"};
        assertArrayEquals(expectedResult, result);
    }
}