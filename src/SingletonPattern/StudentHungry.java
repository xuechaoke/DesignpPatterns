package SingletonPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 * 饿汉式(开发使用)
    类一加载就创建对象
 */
public class StudentHungry {
    //私有化构造器
    private StudentHungry(){}

    //能让下面静态方法调用需要加静态。
    private static StudentHungry s =new StudentHungry();

    //保证能被外部调用
    public static  StudentHungry getS(){
        return  s;
    }
}
