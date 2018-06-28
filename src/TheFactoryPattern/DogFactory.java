package TheFactoryPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 */
public class DogFactory implements Factory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
