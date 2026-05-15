public class Main {
    public static void main(String[] args) {
        // 地图大小 10x10
//        String[][] map = new String[10][10];
//
//        // 初始坐标（和你图案完全对应）
//        int human_x = 1, human_y = 1;  // 人 ○
//        int box_x = 5, box_y = 6;      // 箱子 ■
//        int elf_x = 8, elf_y = 9;      // 终点 ⭐
//
//        // 游戏主循环
//        while (true) {
//            // 清屏（让画面更干净，美化核心）
//            for (int i = 0; i < 30; i++) System.out.println();
//
//            // —————— 绘制地图 ——————
//            for (int i = 0; i < 10; i++) {
//                for (int j = 0; j < 10; j++) {
//                    if (human_x == i && human_y == j) {
//                        map[i][j] = "○";
//                    } else if (box_x == i && box_y == j) {
//                        map[i][j] = "■";
//                    } else if (elf_x == i && elf_y == j) {
//                        map[i][j] = "⭐";
//                    } else {
//                        map[i][j] = "□";
//                    }
//                    // 统一输出，排版超级整齐
//                    System.out.print(map[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//            // —————— 判断胜利条件 ——————
//            if (box_x == elf_x && box_y == elf_y) {
//                System.out.println("\n🎉 恭喜你！成功把箱子推到目的地！游戏胜利！");
//                break;
//            }
//
//            // —————— 输入控制 ——————
//            Scanner sc = new Scanner(System.in);
//            System.out.println("\n┌── 控制说明 ──┐");
//            System.out.println("│  w: 向上     │");
//            System.out.println("│  s: 向下     │");
//            System.out.println("│  a: 向左     │");
//            System.out.println("│  d: 向右     │");
//            System.out.println("└─────────────┘");
//            System.out.print("请输入方向：");
//            String dir = sc.nextLine();
//
//            // —————— 移动逻辑（带边界判断 + 推箱子）——————
//            switch (dir) {
//                case "w": // 上
//                    if (human_x <= 0) {
//                        System.out.println("❌ 无法向上，已到顶部边界！");
//                    }
//                    // 如果前面是箱子，且箱子前面不是边界
//                    else if (human_x - 1 == box_x && human_y == box_y) {
//                        if (box_x - 1 >= 0) {
//                            human_x--;
//                            box_x--;
//                        } else {
//                            System.out.println("❌ 箱子无法再向上推！");
//                        }
//                    } else {
//                        human_x--;
//                    }
//                    break;
//
//                case "s": // 下
//                    if (human_x >= 9) {
//                        System.out.println("❌ 无法向下，已到底部边界！");
//                    }
//                    else if (human_x + 1 == box_x && human_y == box_y) {
//                        if (box_x + 1 <= 9) {
//                            human_x++;
//                            box_x++;
//                        } else {
//                            System.out.println("❌ 箱子无法再向下推！");
//                        }
//                    } else {
//                        human_x++;
//                    }
//                    break;
//
//                case "a": // 左
//                    if (human_y <= 0) {
//                        System.out.println("❌ 无法向左，已到左边界！");
//                    }
//                    else if (human_x == box_x && human_y - 1 == box_y) {
//                        if (box_y - 1 >= 0) {
//                            human_y--;
//                            box_y--;
//                        } else {
//                            System.out.println("❌ 箱子无法再向左推！");
//                        }
//                    } else {
//                        human_y--;
//                    }
//                    break;
//
//                case "d": // 右
//                    if (human_y >= 9) {
//                        System.out.println("❌ 无法向右，已到右边界！");
//                    }
//                    else if (human_x == box_x && human_y + 1 == box_y) {
//                        if (box_y + 1 <= 9) {
//                            human_y++;
//                            box_y++;
//                        } else {
//                            System.out.println("❌ 箱子无法再向右推！");
//                        }
//                    } else {
//                        human_y++;
//                    }
//                    break;
//
//                default:
//                    System.out.println("⚠️ 输入错误，请输入 w/s/a/d！");
//            }
//        }

//        AboutComputer computer = new AboutComputer();
//        computer.brand="alies";
//        computer.cpu="9800x3d";
//        computer.disk="1t";
//        computer.gpu="5070";
//        System.out.print(computer.brand+"\t");
//        System.out.print(computer.cpu+"\t");
//        System.out.print(computer.gpu+"\t");
//        System.out.println(computer.disk+"\t");
//        computer.showInfo();
//
//        AboutComputer computer1 = new AboutComputer();
//        computer1.brand="ligion";
//        computer1.cpu="12700k-i5";
//        computer1.disk="1t";
//        computer1.gpu="3060";
//        System.out.print(computer1.brand+"\t");
//        System.out.print(computer1.cpu+"\t");
//        System.out.print(computer1.gpu+"\t");
//        System.out.println(computer1.disk+"\t");
//        computer1.showInfo();

//        cat cat = new cat("哈基米");
//        cat.type="布偶猫";
//        cat.name="公子哥";
//        cat.age=5;
//        cat.color="白色";
//        cat.show();
//        cat.catchMouse();
//        new cat("公子哥");



//        Book book= new Book();
//        book.handout_date="2026-5-12";
//        book.price=99;
//        book.author="孔子";
//        book.name="礼记";
//
//
//        Book book1 = new Book("《经乱离后天恩流夜郎忆旧游书怀赠江夏韦太守良宰》","李白","公元759年秋",48);
//        Book book2 = new Book("剑来","烽火戏诸侯","2017-6-01",66);
//
//        Book[] books= {
//                book1,
//                book,
//                book2
//        };
//        for (int i = 0; i < books.length;i++) {
//            books[i].showInfo();
//        }


//        students[] students_a = new students[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i <students_a.length; i++) {
//            students_a[i]= new students();
//            students_a[i].id=(i+1);
//            System.out.println("请输入第"+(i+1)+"个学生的姓名");
//            students_a[i].name=scanner.next();
//            System.out.println("请输入第"+(i+1)+"个学生的分数");
//            students_a[i].score = scanner.nextDouble();
//            students_a[i].show();
//        }
//        System.out.println(students_a[0].showInt(1,5));
//        System.out.println(students_a[0].func1(5));
//        System.out.println(students_a[0].func2(1,2,3,4));

//        dog dog1= new dog();
//        dog1.setName("大狗");
//        dog1.setType("阿拉斯加");
//        dog1.setGender('公');
//        System.out.println(dog1.toString());

        class Animal{
            private String name;
            public void eat(){
                System.out.println("动物在吃东西");
            }
        }
        class Cat extends Animal{

        }
    }
}