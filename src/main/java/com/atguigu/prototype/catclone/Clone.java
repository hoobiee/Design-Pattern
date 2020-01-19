package com.atguigu.prototype.catclone;

import cn.hutool.core.clone.Cloneable;

/**
 * @author hoobie
 * @version 1.0.0
 * @ClassName Clone.java
 * @Description TODO
 * @createTime 2020��01��19�� 00:36:00
 */
public class Clone {

    /**
     * èè�࣬ʹ��ʵ��Cloneable��ʽ
     *
     * @author Looly
     */

    private static class Cat implements Cloneable<Cat> {

        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public Cat clone() {

            try {
                return (Cat) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
    }
}

