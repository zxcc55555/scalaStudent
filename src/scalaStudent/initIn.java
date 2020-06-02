package scalaStudent;

import scala.Function1;

import java.util.Objects;

public class initIn {
    public static void main(String[] args) {
        System.out.println(Objects.equals("1","1"));
        Integer i = 10;
        Integer j = 10;
        System.out.println(Objects.equals(i,j));
        FunctionAndMethod functionAndMethod = new FunctionAndMethod();
        Function1<Object, Object> f = functionAndMethod.f();
        Object apply = f.apply(1);
        System.out.println(apply);
    }
}
