public class Book {
    String name;
    String handout_date;
    int price;
    String author;
    Book(String name,String author,String handout_date,int price){
        this.author=author;
        this.name = name;
        this.price=price;
        this.handout_date= handout_date;
    }

    Book(){

    }

    void showInfo(){
        System.out.println("书名:"+name+"\n价格:"+price+"\n作者:"+author+"\n出版日期:"+handout_date);
    }
}
