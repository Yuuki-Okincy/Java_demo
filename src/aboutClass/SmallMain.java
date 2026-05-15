package aboutClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class SmallMain {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.通过创建对象获取字节码对象
        emp emp1= new emp();
//        Class<?> c1 = emp1.getClass();
//        System.out.println(c1);
//        //2.通过类名获取
//        Class<?> c2 = emp.class;
//        System.out.println(c2);
//        //3.通过复制或引用
//        Class<?> c3 = Class.forName("aboutClass.emp");
//        System.out.println(c3);

        //使用反射调用结构构造器之前要获取字节码文件对象
//        Class<?> c3 = Class.forName("aboutClass.emp");
//        try {
//            //获取无参构造器
//            Constructor<?> constructor = c3.getConstructor(null);
//            System.out.println(constructor);
//            //获取int类型有参构造器
//            Constructor<?> constructor2 = c3.getConstructor(int.class);
//            System.out.println(constructor2);
//            //获取私有有参构造器
//            Constructor<?> constructor3 = c3.getDeclaredConstructor(String.class);
//            System.out.println(constructor3);
//
//
//            //构造器可以实例化对象
//            Object object1 = constructor.newInstance();
//            Object object2 = constructor2.newInstance(18);
//
//            //还可以暴力获取私密成员变量
//            constructor3.setAccessible(true);
//            Object object3 = constructor3.newInstance("xhz");
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }

        //通过反射获取成员变量
        Class<?> clazz = Class.forName("aboutClass.emp");
        try {
            //获取指定的公开权限的变量
            Field field = clazz.getField("name");
            System.out.println(field);
            //获取指定私有权限的变量
            Field field2 = clazz.getDeclaredField("id");
            System.out.println(field2);

            //获取所有公开权限的变量
            Field[] field3 = clazz.getFields();
            System.out.println(Arrays.toString(field3));
            //获取所有权限的变量
            Field[] fiels4 = clazz.getDeclaredFields();
            System.out.println(Arrays.toString(fiels4));


        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
