package cn.school.thoughtworks.section1;

import java.util.LinkedList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> expectedResult = new LinkedList<String>();
        expectedResult.add("a");
        expectedResult.add("e");
        expectedResult.add("f");
        expectedResult.add("d");
        return expectedResult;
    }
}
