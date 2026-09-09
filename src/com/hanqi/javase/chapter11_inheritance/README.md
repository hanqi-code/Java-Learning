# Chapter11 - 继承 Inheritance

## 📌 本章学习内容

本章主要学习 Java 面向对象中的 **继承（Inheritance）**。

继承的核心目的：

> 把多个类中相同的属性和方法抽取到父类中，子类只保留自己特有的内容。

基本结构：

```java
public class Student extends Person {

}
```

其中：

- `Person`：父类
- `Student`：子类
- `extends`：表示继承关系

---

# 1. 为什么需要继承

如果多个类都有相同内容：

```text
Student
- name
- age
- eat()
- sleep()

Teacher
- name
- age
- eat()
- sleep()
```

可以把共同部分抽取：

```text
Person
├── name
├── age
├── eat()
└── sleep()

Person
├── Student
└── Teacher
```

这样：

```java
public class Student extends Person {
}

public class Teacher extends Person {
}
```

避免重复代码。

---

# 2. 继承关系

一个类可以继承另一个类：

```java
public class Student extends Person {
}
```

也可以继续向下继承：

```text
Person
    ↓
Student
    ↓
GraduateStudent
```

即：

```java
public class Student extends Person {
}

public class GraduateStudent extends Student {
}
```

理解方式：

```text
GraduateStudent
爸爸 → Student
爷爷 → Person
```

看多层继承时，不需要一次看整棵树。

只需要从当前类开始，一层一层向父类看。

---

# 3. 子类可以使用父类成员

例如：

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
}
```

子类：

```java
public class Student extends Person {

    public void study() {
        System.out.println(getName() + " is studying.");
    }
}
```

父类中的 `private` 属性不能在子类中直接访问：

```java
name
```

可以通过父类提供的：

```java
getName()
setName()
```

进行访问。

---

# 4. super

`super` 表示当前对象的 **父类部分**。

常见使用方式：

```java
super(...)
```

调用父类构造方法。

例如：

```java
public Student(String name, int age, String grade) {
    super(name, age);
    this.grade = grade;
}
```

执行关系：

```text
new Student(...)
       ↓
Student(...)
       ↓
super(name, age)
       ↓
Person(name, age)
       ↓
初始化 name、age
       ↓
返回 Student
       ↓
初始化 grade
```

---

# 5. 多层继承中的 super

例如：

```text
Lecturer
    ↓
Teacher
    ↓
Employee
```

构造方法：

```java
public Lecturer(String employeeId,
                String name,
                String responsibility) {

    super(employeeId, name, responsibility);
}
```

先进入：

```text
Teacher(...)
```

Teacher 再：

```java
super(employeeId, name, responsibility);
```

最后进入：

```text
Employee(...)
```

可以理解为：

> 子类把父类需要的数据一层一层向上传递，
> 最后由真正拥有这些属性的类完成初始化。

---

# 6. 方法重写 Override

如果父类已经存在一个方法：

```java
public void work() {
    System.out.println("working");
}
```

但是不同子类的工作方式不同，可以进行方法重写：

```java
@Override
public void work() {
    System.out.println("Teaching Java");
}
```

基本格式：

```java
@Override
public void 方法名() {

}
```

例如：

```text
Employee
└── work()

Lecturer
└── work() → 授课

Tutor
└── work() → 辅导学生

Maintainer
└── work() → 维护设备

Buyer
└── work() → 采购物资
```

核心思想：

> 方法名字相同，但不同子类拥有不同的具体行为。

---

# 7. 构造方法与继承

构造方法本身不会被子类继承。

但是子类创建对象时，需要先完成父类部分的初始化。

例如：

```java
public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

子类：

```java
public class Student extends Person {

    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
}
```

执行顺序：

```text
父类构造方法
    ↓
子类构造方法
```

---

# 8. JavaBean + 继承

本章练习了带有继承结构的 JavaBean。

例如：

```text
Person
├── Student
│   ├── UndergraduateStudent
│   └── GraduateStudent
│
└── Teacher
    ├── MajorCourseTeacher
    └── GeneralCourseTeacher
```

共同属性：

```text
Person
├── name
└── age
```

学生共同属性：

```text
Student
└── grade
```

专业课老师自己的属性：

```text
MajorCourseTeacher
└── subject
```

设计原则：

> 谁都需要的 → 放父类  
> 一部分需要的 → 放中间父类  
> 只有自己需要的 → 留在当前子类

---

# 9. 餐厅员工继承练习

继承结构：

```text
Employee
├── Manager
└── Chef
```

共同内容：

```text
employeeId
name
salary
eat()
work()
```

经理特有：

```text
managementBonus
```

经理和厨师拥有不同的：

```java
work()
```

因此可以分别重写。

---

# 10. 员工继承体系练习

更复杂的继承结构：

```text
Employee
├── Teacher
│   ├── Lecturer
│   └── Tutor
│
└── AdminStaff
    ├── Maintainer
    └── Buyer
```

Employee 保存共同信息：

```text
employeeId
name
responsibility
```

四种具体员工分别重写：

```java
work()
```

例如：

```text
Lecturer   → Give lectures
Tutor      → Tutor students
Maintainer → Maintain equipment
Buyer      → Purchase supplies
```

---

# 11. 本章核心设计思想

看到多个类时，先找：

```text
哪些东西一样？
```

一样的内容：

```text
↑ 往父类抽
```

不同的内容：

```text
↓ 留在子类
```

例如：

```text
Employee
├── employeeId
├── name
└── work()

        ↓

Lecturer
└── 重写 work()

Tutor
└── 重写 work()
```

---

# 12. 多层继承的阅读方法

类多的时候不要同时看所有文件。

例如：

```text
Employee
├── Teacher
│   ├── Lecturer
│   └── Tutor
└── AdminStaff
    ├── Maintainer
    └── Buyer
```

如果正在看 `Lecturer`，只看：

```text
Lecturer
   ↓
Teacher
   ↓
Employee
```

然后从上往下叠加：

```text
Employee 的内容
        +
Teacher 的内容
        +
Lecturer 自己的内容
```

这样更容易理解。

---

# 13. 本章容易混淆的地方

### `this`

表示当前对象：

```java
this.name = name;
```

---

### `super`

表示父类部分：

```java
super(name, age);
```

调用父类构造方法。

也可以：

```java
super.getName();
```

调用父类提供的方法。

---

### `extends`

建立父子类关系：

```java
class Student extends Person
```

---

### `@Override`

告诉 Java：

> 当前方法是在重写父类的方法。

```java
@Override
public void work() {

}
```

---

# 14. 本章练习

```text
demo/
└── 基础 extends 继承练习

lab/
├── pet/
│   └── Pet / Dog / Cat
│
├── phone/
│   └── 手机版本升级与方法重写
│
├── person/
│   └── 构造方法继承练习
│
├── javabean/
│   └── JavaBean 多层继承练习
│
├── restaurant/
│   └── Manager / Chef 餐厅员工练习
│
└── employee/
    └── 黑马程序员员工继承体系练习
```

---

# ✅ Chapter11 总结

完成本章后，我已经能够：

- [x] 使用 `extends` 创建继承关系
- [x] 区分父类和子类
- [x] 阅读多层继承关系
- [x] 把共同属性和方法抽取到父类
- [x] 使用 `super(...)` 调用父类构造方法
- [x] 理解构造方法的调用链
- [x] 使用 `@Override` 重写父类方法
- [x] 使用 getter / setter 访问父类的 private 属性
- [x] 编写带继承结构的 JavaBean
- [x] 根据业务场景设计多层继承体系

---

## 💡 一句话总结

> 继承 = 把共同的东西放到父类，让子类复用；  
> 重写 = 子类保留相同的方法名，但实现自己的行为。

```text
相同 → 父类
不同 → 子类
需要父类初始化 → super(...)
需要改变父类行为 → @Override
```

**Chapter11 Inheritance ✅ Completed**