package aboutClass;

public class emp {
    private int id;
    public String name;
    protected int age;
    char gender;



    emp(String name){
        System.out.println("默认的名字有参构造函数");
    }
    public emp(){
        System.out.println("公开的无参构造函数");
    }
    public emp(int age){
        System.out.println("受保护的年龄有参构造函数");
    }
    private emp(char gender){
        System.out.println("私有的性别有参构造函数");
    }
    public void fun1(){
        System.out.println("公开的成员方法");
    }
    private void fun2(){
        System.out.println("私有的成员方法");
    }
    protected void fun3(){
        System.out.println("受保护的成员方法");
    }
    void fun4(){
        System.out.println("默认的成员方法");
    }
}
