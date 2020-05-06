package com.orfila.primitive;

import org.junit.Test;

/**
 * @Description penli test
 * @Author tangye
 * @Time 2020-05-06 20:53
 */
public class PenliTest {

    @Test
    public void penliTest() {
        String[] names = {"张三", "李四", "王五", "鲁智深"};
        for (int i = 0; i < 8; i++) {
            Penli penli = PenFactory.get(names[i > 3 ? i - 4 : i]);
            penli.setSomething("画了一条鱼");
            penli.write();
        }
    }
}
