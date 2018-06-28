package DeckerPattern;

/**
 * Created by Administrator on 2018/6/28/028.
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
