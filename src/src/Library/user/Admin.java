package Library.user;

import Library.action.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name){
        this.name=name;
        actions=new IAction[]{
                new ExitAction(),
                new AddAction(),
                new DelAction(),
                new FindAction(),
                new DisplayAction(),
        };

    }

    @Override
    public int menu() {
        System.out.println("欢迎管理员使用图书馆管理系统");
        System.out.println("1.新增图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书");
        System.out.println("4.显示图书列表");
        System.out.println("0.退出");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
