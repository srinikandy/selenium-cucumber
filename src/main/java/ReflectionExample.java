import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {

    public static void main(String[] args) {

        var person = new Person();
        Class clazz = person.getClass();



//        Class clazz = person.getClass();
//        Field fields[] = clazz.getDeclaredFields();
//        for (var field: fields)
//            System.out.println(field);
//        System.out.println("#####");
//        Method methods[] = clazz.getMethods();
//        for (var method: methods)
//            System.out.println(method);
//        System.out.println("#####");
//        int modifiers =clazz.getModifiers();
//            System.out.println(modifiers);
    }
}
