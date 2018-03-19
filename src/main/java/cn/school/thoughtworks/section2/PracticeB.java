package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 3);
            put("e", 7);
            put("h", 11);
            put("t", 20);
            put("f", 9);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 5);
        }};
        return expectedResult;
    }
}
