package SingletonPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 *
 * 懒汉式(面试常问)： 用的时候，才去创建对象
        线程安全问题
        懒加载思想(延迟加载)
 */
public class StudentLazy {
    //私有化构造器
    private StudentLazy(){}

    private static StudentLazy s=null;

    public synchronized  static StudentLazy getS(){
        if (s==null) {
            s=new StudentLazy();
        }
        return  s;
    }
}
