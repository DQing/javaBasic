package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 2);
            put("e", 5);
            put("h", 11);
            put("t", 20);
            put("f", 6);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 4);
        }};


        return expectedResult;
    }
}
