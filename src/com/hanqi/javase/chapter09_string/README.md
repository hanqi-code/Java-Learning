# Chapter 09 - String & StringBuilder

## 1. String 基础

- String 是引用数据类型。
- String 对象的内容不可变。
- `==` 比较的是两个引用是否指向同一个对象。
- `equals()` 比较的是字符串内容是否相同。
- 字符串字面量会涉及 String Pool（字符串常量池）。

## 2. String 常用 API

- `length()`：获取字符串长度
- `charAt(index)`：根据索引获取字符
- `contains()`：判断是否包含指定内容
- `startsWith()`：判断是否以指定内容开头
- `endsWith()`：判断是否以指定内容结尾
- `indexOf()`：查找内容第一次出现的位置
- `indexOf(content, fromIndex)`：从指定位置继续查找
- `substring(start)`：从指定位置截取到结尾
- `substring(start, end)`：截取指定范围，包头不包尾
- `replace()`：替换字符串中的内容
- `toUpperCase()`：转换为大写
- `toLowerCase()`：转换为小写
- `trim()`：删除字符串首尾空格

## 3. String 遍历

使用 `for + length() + charAt()` 可以逐个处理字符串中的字符。

```java
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
}
```

## 4. StringBuilder

StringBuilder 的内容可以修改，适合进行多次字符串拼接。

本章学习的方法：

- `append()`：追加内容
- `reverse()`：反转内容
- `toString()`：转换为普通 String

示例：

```java
StringBuilder sb = new StringBuilder();
sb.append("Java");
sb.append(" + ");
sb.append("Python");

String result = sb.toString();
```

## 5. 本章核心区别

### String 与 StringBuilder

- String：内容不可变
- StringBuilder：内容可变，适合频繁拼接

### String 与 char 的比较

```text
String 内容比较 -> equals()
char 比较       -> ==
```

### length 的区别

```text
数组长度   -> arr.length
String长度 -> text.length()
```

## 6. 本章综合练习

### StringProcessorBigLab

综合使用 String API 完成：

- 文本清理
- 长度判断
- 内容查找
- 开头和结尾判断
- 替换
- 大小写转换
- 字符串遍历
- StringBuilder 拼接

### LoginSystemChapterTest

模拟真实登录业务：

- 使用 `trim()` 清理用户名输入
- 使用 `length()` 校验用户名和密码长度
- 使用 `contains()` 检查密码内容
- 使用 `equals()` 判断账号密码是否正确
- 使用 `indexOf()` 找到邮箱中的 `@`
- 使用 `substring()` 拆分邮箱用户名和域名
- 使用 StringBuilder 生成登录结果

## 7. 本章总结

看到需求时，可以快速想到：

```text
长度             -> length()
比较内容         -> equals()
取一个字符       -> charAt()
判断包含         -> contains()
判断开头         -> startsWith()
判断结尾         -> endsWith()
查找位置         -> indexOf()
截取内容         -> substring()
替换内容         -> replace()
转大写           -> toUpperCase()
转小写           -> toLowerCase()
删除首尾空格     -> trim()

StringBuilder：
追加内容         -> append()
反转内容         -> reverse()
转换为 String    -> toString()
```