package SimpleFactoryPattern;

/**
 * Created by Administrator on 2018/6/28/028.
 */
public class AnimalFactory {
    public static  Animal createAnimal(String type){
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }

        return  null;
    }
}
