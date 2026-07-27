# Chapter 07：方法

## 本章学习内容

- 方法的基本概念
- 无参数无返回值方法
- 有参数无返回值方法
- 有参数有返回值方法
- return 返回值
- 数组作为方法参数
- 方法返回数组
- 方法重载
- 使用方法重构学生成绩统计系统

## 核心理解

方法的作用是把一段代码封装起来，并给它起一个名字。

以后需要这段功能时，可以直接调用方法，而不是重复写同一段代码。

方法可以让代码更清楚：

- main 方法负责控制流程
- 普通方法负责完成具体功能
- 一个方法最好只负责一件事

## 1. 无参数无返回值方法

这种方法不需要传入数据，也不会返回结果。

```java
public static void printMenu() {
    System.out.println("===== 学生成绩系统 =====");
    System.out.println("1. 输入成绩");
    System.out.println("2. 输出成绩");
    System.out.println("3. 退出系统");
}
```

调用方式：

```java
printMenu();
```

## 2. 有参数无返回值方法

这种方法需要外部传入数据，但方法自己完成输出或操作，不返回结果。

```java
public static void printStudentScore(String name, int score) {
    System.out.println(name + "的成绩是：" + score);
}
```

调用方式：

```java
printStudentScore("张三", 90);
printStudentScore("李四", 85);
```

参数的作用是让同一个方法可以处理不同的数据。

## 3. 有参数有返回值方法

这种方法接收数据，处理后把结果返回给调用处。

```java
public static int getSum(int a, int b) {
    return a + b;
}
```

调用方式：

```java
int result = getSum(10, 20);
```

执行流程：

```text
10 传给 a
20 传给 b
方法计算 a + b
return 把结果返回
result 接收返回值
```

## 4. void 和返回值

```java
void
```

表示方法只做事，不返回结果。

```java
int
double
boolean
String
int[]
```

表示方法执行结束后，会返回对应类型的结果。

例如：

```java
public static boolean isPass(int score) {
    return score >= 60;
}
```

## 5. 数组作为方法参数

数组可以作为参数传给方法。

```java
public static int getSum(int[] scores) {
    int sum = 0;

    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
    }

    return sum;
}
```

调用方式：

```java
int[] scores = {90, 85, 76, 88, 95};
int sum = getSum(scores);
```

理解：

```text
main 把数组交给 getSum 方法
getSum 方法遍历数组并计算总分
return 把总分返回给 main
```

## 6. 方法返回数组

方法也可以返回数组。

```java
public static int[] reverseArray(int[] nums) {
    int[] result = new int[nums.length];

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        result[left] = nums[right];
        result[right] = nums[left];

        left++;
        right--;
    }

    return result;
}
```

调用方式：

```java
int[] newNums = reverseArray(nums);
```

理解：

```text
方法内部创建一个新数组 result
把 nums 的数据反向放进 result
最后 return result
```

注意：

```text
new int[nums.length] 只是创建同样长度的新数组
不会自动复制原数组的数据
数据需要自己赋值进去
```

## 7. 方法重载

方法重载指：

```text
方法名相同
参数列表不同
```

参数列表不同包括：

- 参数个数不同
- 参数类型不同
- 参数顺序不同

例如：

```java
public static int getSum(int a, int b) {
    return a + b;
}

public static int getSum(int a, int b, int c) {
    return a + b + c;
}

public static double getSum(double a, double b) {
    return a + b;
}
```

注意：

```text
只改返回值，不算方法重载
```

## 本章练习

- MethodMenuPractice
- MethodParameterPractice
- ReturnValueDemo
- MethodReturnPractice
- ArrayParameterDemo
- MethodArrayParameterPractice
- MethodReturnArrayPractice
- MethodOverloadDemo
- MethodOverloadPractice
- StudentScoreMethodBigLab

## 本章 Big Lab

### StudentScoreMethodBigLab

本章综合练习是把 Chapter 06 的学生成绩统计系统，用方法重新拆分。

功能包括：

- 输出所有成绩
- 计算总分
- 计算平均分
- 查找最高分
- 查找最低分
- 统计高于平均分的人数
- 查找某个成绩是否存在
- 使用冒泡排序排列成绩

拆分后的方法包括：

```text
printScores
getSum
getAverage
getMax
getMin
countAboveAverage
containsScore
bubbleSort
```

## 本章总结

方法主要解决代码重复和 main 方法过长的问题。

通过方法，可以把复杂程序拆成多个小功能。

本章最重要的理解是：

```text
main 负责指挥流程
方法负责完成具体任务
一个方法最好只做一件事
```

方法是后面学习面向对象、JavaBean、工具类、项目开发和 AI Agent 工具函数的基础。