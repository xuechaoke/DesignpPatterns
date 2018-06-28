package ProxyPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 */
public class ProxyObject extends AbstractObject{
    AbstractObject abstractObject;

    public ProxyObject(AbstractObject abstractObject) {
        this.abstractObject = abstractObject;
    }

    @Override
    public void operation() {
        System.out.println("before");
        abstractObject.operation();
        System.out.println("after");

    }
}

