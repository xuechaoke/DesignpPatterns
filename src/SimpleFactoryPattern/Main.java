package SimpleFactoryPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 *
 简单工厂模式概述
 又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
 优点
    客户端不需要再负责对象的创建，从而明确了各个类的职责
 缺点
    这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护。
 */
public class Main {
    public static void main(String[] args) {
        String type="";
        Animal animal = AnimalFactory.createAnimal(type);
        if (animal!=null) {
            animal.eat();
        }else {
            System.out.println("无法创建没有此动物对象");
        }
    }
}
