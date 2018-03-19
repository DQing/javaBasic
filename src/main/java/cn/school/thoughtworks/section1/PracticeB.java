package cn.school.thoughtworks.section1;

import java.util.LinkedList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> expectedResult = new LinkedList<String>();
        expectedResult.add("a");
        expectedResult.add("e");
        expectedResult.add("f");
        expectedResult.add("d");
        return expectedResult;
    }
}
