package SingletonPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 * 双重检验
 */
public class StudentDBcheck {
    //私有化构造器
    private StudentDBcheck(){}

    private  static StudentDBcheck s = null;

    public static StudentDBcheck getS(){
        if (s==null) {
            synchronized (StudentDBcheck.class){
                if(s==null){
                    s = new StudentDBcheck();
                }
            }
        }
        return s;
    }
}
