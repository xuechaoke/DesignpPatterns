package DeckerPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 */
public class RingPhoneDecorate extends PhoneDecorate {
    public RingPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        System.out.println("打通电话之前有铃声");
        super.call();
    }
}
