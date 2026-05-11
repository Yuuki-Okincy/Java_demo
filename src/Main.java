import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 地图大小 10x10
        String[][] map = new String[10][10];

        // 初始坐标（和你图案完全对应）
        int human_x = 1, human_y = 1;  // 人 ○
        int box_x = 5, box_y = 6;      // 箱子 ■
        int elf_x = 8, elf_y = 9;      // 终点 ⭐

        // 游戏主循环
        while (true) {
            // 清屏（让画面更干净，美化核心）
            for (int i = 0; i < 30; i++) System.out.println();

            // —————— 绘制地图 ——————
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (human_x == i && human_y == j) {
                        map[i][j] = "○";
                    } else if (box_x == i && box_y == j) {
                        map[i][j] = "■";
                    } else if (elf_x == i && elf_y == j) {
                        map[i][j] = "⭐";
                    } else {
                        map[i][j] = "□";
                    }
                    // 统一输出，排版超级整齐
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

            // —————— 判断胜利条件 ——————
            if (box_x == elf_x && box_y == elf_y) {
                System.out.println("\n🎉 恭喜你！成功把箱子推到目的地！游戏胜利！");
                break;
            }

            // —————— 输入控制 ——————
            Scanner sc = new Scanner(System.in);
            System.out.println("\n┌── 控制说明 ──┐");
            System.out.println("│  w: 向上     │");
            System.out.println("│  s: 向下     │");
            System.out.println("│  a: 向左     │");
            System.out.println("│  d: 向右     │");
            System.out.println("└─────────────┘");
            System.out.print("请输入方向：");
            String dir = sc.nextLine();

            // —————— 移动逻辑（带边界判断 + 推箱子）——————
            switch (dir) {
                case "w": // 上
                    if (human_x <= 0) {
                        System.out.println("❌ 无法向上，已到顶部边界！");
                    }
                    // 如果前面是箱子，且箱子前面不是边界
                    else if (human_x - 1 == box_x && human_y == box_y) {
                        if (box_x - 1 >= 0) {
                            human_x--;
                            box_x--;
                        } else {
                            System.out.println("❌ 箱子无法再向上推！");
                        }
                    } else {
                        human_x--;
                    }
                    break;

                case "s": // 下
                    if (human_x >= 9) {
                        System.out.println("❌ 无法向下，已到底部边界！");
                    }
                    else if (human_x + 1 == box_x && human_y == box_y) {
                        if (box_x + 1 <= 9) {
                            human_x++;
                            box_x++;
                        } else {
                            System.out.println("❌ 箱子无法再向下推！");
                        }
                    } else {
                        human_x++;
                    }
                    break;

                case "a": // 左
                    if (human_y <= 0) {
                        System.out.println("❌ 无法向左，已到左边界！");
                    }
                    else if (human_x == box_x && human_y - 1 == box_y) {
                        if (box_y - 1 >= 0) {
                            human_y--;
                            box_y--;
                        } else {
                            System.out.println("❌ 箱子无法再向左推！");
                        }
                    } else {
                        human_y--;
                    }
                    break;

                case "d": // 右
                    if (human_y >= 9) {
                        System.out.println("❌ 无法向右，已到右边界！");
                    }
                    else if (human_x == box_x && human_y + 1 == box_y) {
                        if (box_y + 1 <= 9) {
                            human_y++;
                            box_y++;
                        } else {
                            System.out.println("❌ 箱子无法再向右推！");
                        }
                    } else {
                        human_y++;
                    }
                    break;

                default:
                    System.out.println("⚠️ 输入错误，请输入 w/s/a/d！");
            }
        }
    }
}