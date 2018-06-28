package ProxyPattern;

import java.util.Properties;

/**
 * Created by Administrator on 2018/6/28/028.
 * 1，什么是代理模式？
 代理模式的作用是：为其他对象提供一种代理以控制对这个对象的访问。

 2，代理模式有什么好处？
 在某些情况下，一个客户不想或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用。

 3，代理模式一般涉及到的角色有：

 抽象角色：声明真实对象和代理对象的共同接口,这样一来在任何可以使用目标对象的地方都可以使用代理对象。
 代理角色：代理对象内部含有目标对象的引用，从而可以在任何时候操作目标对象；代理对象提供一个与目标对象相同的接口，以便可以在任何时候替代目标对象。代理对象通常在客户端调用传递给目标对象之前或之后，执行某个操作，而不是单纯地将调用传递给目标对象，同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 真实角色：定义了代理对象所代表的目标对象，代理角色所代表的真实对象，是我们最终要引用的对象,定义了代理对象所代表的目标对象。
 */
public class Client {
    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject(new PlayGameOperation());
        proxyObject.operation();

    }
}
