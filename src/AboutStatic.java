public class AboutStatic {
    int var1 = 1;
     int var2=2;
     int var3 = 3;
     static final int var4 =4 ;
     void varFun1(){
         System.out.println("这是一个成员方法");
     }
     static void varFun2(){
         System.out.println("这是一个静态成员方法");
     }

    public static void main(String[] args) {
        varFun2();
        System.out.println(var4);
        AboutStatic aboutStatic = new AboutStatic();
        System.out.println(aboutStatic.var1);
        System.out.println(aboutStatic.var2);

//        var4=5;
        System.out.println(var4);
    }
}
