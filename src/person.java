public class person {
    String name;
    char gender;
    int age;
    String tel;


    void  setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void  setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void  setGender(char gender){
        this.gender=gender;
    }
    char getGender(){
        return gender;
    }
    void  setTel(String tel){
        this.tel=tel;
    }
    String getTel(){
        return tel;
    }

    person(){
        System.out.println("无参构造函数被调用");
    }
    person(String name,char gender,String tel,int age){
        System.out.println("有参函数构造被调用");
    }
}
