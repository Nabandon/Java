package Library.user;

import Library.action.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        this.name=name;
        actions=new IAction[]{
                new ExitAction(),
                new FindAction(),
                new BorrowedAction(),
                new ReturnAction(),

        };
    }

    @Override
    public int menu() {
        System.out.println("欢迎使用图书馆管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借书");
        System.out.println("3.还书");
        System.out.println("0.退出");
        System.out.println("请输入您的选择");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
