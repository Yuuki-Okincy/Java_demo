public class dog {
    String name;
    char gender;
    String type;
    void run(){
        System.out.println(type+"的狗跑得好快");

    }
    void develop(){
        System.out.println(name+"的狗长的好快");
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name= name;
    }

    String getType(){
        return type;
    }
    void setType(String type){
        this.type=type;
    }

    char getGender(){
        return gender;
    }
    void setGender(char gender){
        this.gender=gender;
    }

    public String toString(){
        return getName()+getType()+getGender();
    }
}
