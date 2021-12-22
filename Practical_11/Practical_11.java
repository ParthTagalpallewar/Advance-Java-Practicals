package Practical_11;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

public class Practical_11 {
    private final String name = "Practical_11";
    private int size;

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void hello() {
        System.out.println("hello method called");
    }

    public static void main(String[] args) throws IntrospectionException {

        BeanInfo info = Introspector.getBeanInfo(Practical_11.class);

        hello();

        for (PropertyDescriptor pd : info.getPropertyDescriptors())
            System.out.println(pd.getName());

        for (MethodDescriptor md : info.getMethodDescriptors()) {
            System.out.println(md.getDisplayName());
        }
    }
}