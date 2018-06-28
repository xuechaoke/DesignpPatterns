package DeckerPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 *
 * 装饰设计模式
    当想要对已有的对象进行功能增强时，可以定义类，将已有对象传入，基于已有的功能，并提供加强功能。
         其中自定义的该类称为装饰类。
         装饰类通常会通过构造方法接收被装饰的对象。并基于被装饰的对象的功能，提供更强的功能。
 优点 
     使用装饰模式，可以提供比继承更灵活的扩展对象的功能，它可以动态的添加对象的功能，并且可以随意的组合这些功能
 缺点
     正因为可以随意组合，所以就可能出现一些不合理的逻辑
 */
public class Main {
    public static void main(String[] args) {
        Phone p = new IPhone();
        PhoneDecorate phoneDecorate = new RingPhoneDecorate(p);
        phoneDecorate.call();

        phoneDecorate=new MusicPhoneDecorate(p);
        phoneDecorate.call();

        phoneDecorate=new RingPhoneDecorate(new MusicPhoneDecorate(p));
        phoneDecorate.call();
    }
}
