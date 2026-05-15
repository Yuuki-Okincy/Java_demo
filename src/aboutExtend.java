public class aboutExtend {
    public static void main(String[] args) {
        students students = new students();
        human hm=new human();
        hm.a=1;
        students.a=2;
        students.name="kami";
        students.show();
    }
}

class human{
    int a;
    private int age;
    public String name;


    public void birth(){
        System.out.println("儿子用super调用了");
    }
}

class students extends  human{
    public int id;
    int a;

    public int age;

    void setName(){
        this.name=super.name;
    }
    String getName(){
        setName();
        return this.name;
    }

    public students(){
        super.birth();
    }

    public void show(){
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(a);
    }
}
