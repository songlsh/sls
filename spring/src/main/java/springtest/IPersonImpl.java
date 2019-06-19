package springtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class IPersonImpl implements IPerson {

    private Car car;

    public IPersonImpl(Car car) {
        this.car = car;
    }



    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void sing() {
        System.out.println(car);
    }
}
