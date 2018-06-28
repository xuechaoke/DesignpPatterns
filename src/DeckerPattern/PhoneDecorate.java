package DeckerPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 */
public class PhoneDecorate implements  Phone {
    private Phone p;

    public PhoneDecorate(Phone p) {
        this.p = p;
    }

    @Override
    public void call() {
        this.p.call();

    }
}
