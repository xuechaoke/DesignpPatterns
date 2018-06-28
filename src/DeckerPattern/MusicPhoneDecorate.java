package DeckerPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 */
public class MusicPhoneDecorate extends PhoneDecorate {
    public MusicPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("打完电话可以听音乐");
    }
}
