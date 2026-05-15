public class Pig {
    String type;
    String color;
    int atk;
    void walk(){
        System.out.println(type+"品种"+color+"颜色的猪走来走去");
    }
    void attack(){
        System.out.println(type+"品种"+color+"的猪打人了，攻击力为"+atk);
    }
    void eat(){
        System.out.println(type+"品种"+color+"颜色的猪吃的真多");
    }

    public String toString(){
        return type+"品种"+color+"颜色的猪的攻击力是"+atk;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return this.type;
    }
    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return this.color;
    }

    void setAtk(int atk){
        this.color=color;
    }
    int getAtk(){
        return this.atk;
    }

}
