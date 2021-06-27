

# 单例设计模式

单例模式的通用类图如图：

<img src="../../../../../image.png" height="150" />

### 实现方式：

1. 私有化构造方法
2. 实例化一个static修饰的private对象
3. 提供一个public 修饰的static



### 单例模式的通用代码

```java
public class Singleton{
    private static final Singleton singleton  = new Singleton();
   	private Singleton(){
        
    }
   	public static Singleton getSingleton(){
        return singleton();
    }
}
```

单例模式的优缺点：

优点：

1. 保证一个类只有一个实例
2. 获得一个指向该实例的全局访问节点
3. 仅在首次请求单例对象时，对其进行初始化。

缺点：

1. 违反单一职责原则。
2. 在多线程情况下，需要进行特殊的处理，避免多个线程多次创建单例对象

### 伪代码

```c
// 数据库类会对`getInstance（获取实例）`方法进行定义以让客户端在程序各处
// 都能访问相同的数据库连接实例。
class Database is
    // 保存单例实例的成员变量必须被声明为静态类型。
    private static field instance: Database

    // 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构
    // 造方法。
    private constructor Database() is
        // 部分初始化代码（例如到数据库服务器的实际连接）。
        // ...

    // 用于控制对单例实例的访问权限的静态方法。
    public static method getInstance() is
        if (Database.instance == null) then
            acquireThreadLock() and then
                // 确保在该线程等待解锁时，其他线程没有初始化该实例。
                if (Database.instance == null) then
                    Database.instance = new Database()
        return Database.instance

    // 最后，任何单例都必须定义一些可在其实例上执行的业务逻辑。
    public method query(sql) is
        // 比如应用的所有数据库查询请求都需要通过该方法进行。因此，你可以
        // 在这里添加限流或缓冲逻辑。
        // ...

class Application is
    method main() is
        Database foo = Database.getInstance()
        foo.query("SELECT ...")
        // ...
        Database bar = Database.getInstance()
        bar.query("SELECT ...")
        // 变量 `bar` 和 `foo` 中将包含同一个对象。
```

