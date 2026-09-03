# Chapter10：static、final、enum

本章主要练习 Java OOP 中的 `static`、`final`、`static final` 和 `enum`，并通过一个游戏账号系统把这些知识串起来。

## 1. 核心知识

### static

`static` 表示成员属于类，而不是某一个具体对象。

```java
private static String gameName = "Block World";
```

所有 `GameAccount` 对象共享同一个 `gameName`。

调用静态成员时通常使用类名：

```java
GameAccount.setGameName("Block World Online");
```

### final

`final` 表示变量只能赋值一次，之后不能重新赋值。

```java
private final String accountId;
```

账号创建后，`accountId` 不能再换成其他值。

### static final

`static final` 常用于定义常量：

```java
public static final int MAX_LEVEL = 100;
```

含义：

- `static`：整个类共享一份
- `final`：不能重新赋值

常量通常使用全大写命名：

```text
MAX_LEVEL
MAX_COUNT
DEFAULT_PORT
```

### enum

`enum` 用来表示“一组固定的合法选项”。

```java
public enum AccountStatus {
    NORMAL("正常"),
    BANNED("封禁"),
    CANCELLED("注销");
}
```

枚举也可以作为一种数据类型：

```java
private AccountStatus status;
```

赋值时：

```java
AccountStatus.NORMAL
AccountStatus.BANNED
AccountStatus.CANCELLED
```

相比普通字符串，枚举可以限制状态只能从规定好的选项中选择。

## 2. Game Account System

综合项目文件：

```text
test/
├── AccountStatus.java
├── GameAccount.java
└── GameAccountProject.java
```

### GameAccount 主要字段

| 中文 | 英文变量名 |
|---|---|
| 账号ID | `accountId` |
| 玩家昵称 | `nickname` |
| 等级 | `level` |
| 游戏名称 | `gameName` |
| 最高等级 | `MAX_LEVEL` |
| 账号状态 | `status` |

设计思路：

| 字段 | 设计 |
|---|---|
| `accountId` | 每个账号独立，创建后不能修改 |
| `nickname` | 每个账号独立，可以修改 |
| `level` | 每个账号独立，可以修改 |
| `gameName` | 所有账号共享，可以修改 |
| `MAX_LEVEL` | 所有账号共享，固定为 100 |
| `status` | 使用 `AccountStatus` 枚举限制合法状态 |

### 创建账号

```java
GameAccount steve =
        new GameAccount("USER001", "Steve", 10, AccountStatus.NORMAL);

GameAccount alex =
        new GameAccount("USER002", "Alex", 20, AccountStatus.NORMAL);
```

### 修改游戏名称

```java
GameAccount.setGameName("Block World Online");
```

### 修改账号状态

```java
alex.setStatus(AccountStatus.BANNED);
```

状态可以变化，但只能从枚举定义的值中选择：

```text
NORMAL
BANNED
CANCELLED
```

## 3. 本章判断口诀

```text
private      → 不让其他类直接碰字段
static       → 整个类共享
final        → 不能重新赋值
static final → 常量
enum         → 固定几个合法选项
```

判断业务需求时：

```text
是不是固定几个选项？
→ enum

是不是所有对象共享？
→ static

创建后还能不能重新赋值？
→ 不能就 final

字段是否需要让其他类直接访问？
→ 一般优先 private
```

## 4. 本章完成内容

- [x] static 成员变量
- [x] static 方法
- [x] static 访问规则
- [x] 工具类
- [x] final 变量
- [x] final 引用
- [x] static final 常量
- [x] enum 枚举
- [x] Game Account System 综合练习


