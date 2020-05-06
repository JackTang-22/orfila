package com.orfila.primitive;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description pen
 * @Author tangye
 * @Time 2020-05-05 16:56
 */

@Data
@Getter
@Setter
public class Penli implements Pen{

    private int i = 0;
    private String name;
    private String something;

    public Penli(String name) {
        this.name = name;
        i++;
        System.out.println(this.name + " 第" + i + "次创建");
    }
    
    @Override
    public void write() {
        System.out.println(this.name + " 用铅笔 " + something);
    }
}
