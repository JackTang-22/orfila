package com.orfila.primitive;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description pen factory
 * @Author tangye
 * @Time 2020-05-06 20:51
 */
public class PenFactory {
    private static final Map<String, Penli> map = new HashMap<>();
    public static Penli get(String name) {
        Penli penli = map.get(name);
        if (penli == null) {
            penli = new Penli(name);
            map.put(name, penli);
        }
        return penli;
    }
}
