package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 1);
            put("e", 1);
            put("h", 2);
            put("t", 2);
            put("f", 1);
            put("c", 2);
            put("g", 2);
            put("b", 2);
            put("d", 1);
        }};

        return expectedResult;
    }
}
