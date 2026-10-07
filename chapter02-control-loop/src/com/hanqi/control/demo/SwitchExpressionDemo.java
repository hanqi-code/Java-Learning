package com.hanqi.control.demo;

/**
 * switch 表达式：根据分支产生一个值，再赋给变量。
 */
public class SwitchExpressionDemo {
    public static void main(String[] args) {
        int score = 85;

        String level = switch (score / 10) {
            case 10, 9 -> "优秀";
            case 8 -> {
                System.out.println("分数在 80 到 89 之间");
                yield "良好"; // 分支里有多句代码时，用 yield 给出结果
            }
            case 7, 6 -> "及格";
            default -> "继续努力";
        };

        System.out.println("成绩等级：" + level);
        // 练习：把 score 改成 95、60 和 50，观察 level 的值。
    }
}
