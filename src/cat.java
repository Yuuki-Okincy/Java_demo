public class cat{
    String name;
    String type;
    String color;
    int age;
    void show(){
        System.out.println("姓名:"+name+"\t品种:"+type+"\t颜色:"+color+"\t年龄:"+age);
    }

    void catchMouse(){
        System.out.println(name+"去抓老鼠了");
    }

    cat(String name){
        System.out.println("小猫"+name+"出生了");
    }
}
