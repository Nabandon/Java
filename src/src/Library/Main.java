package Library;

import Library.book.Book;
import Library.book.BookList;
import Library.user.Admin;
import Library.user.NormalUser;
import Library.user.User;

import java.util.Scanner;

public class Main {
    public static void main_bak(String[] args) {
        BookList bookList=new BookList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入登录名:");
        String name=scanner.next();
        System.out.println("选择您的身份 :1.管理员 2.普通用户");
        int who=scanner.nextInt();
        if(who==1){
            Admin admin=new Admin(name);
            while(true){
                int choice=admin.menu();
                admin.doAction(choice,bookList);
            }
        }else {
            NormalUser user=new NormalUser(name);
            while(true){
                int choice=user.menu();
                user.doAction(choice,bookList);
            }
        }
    }
    public static void main(String[] args){
        BookList bookList=new BookList();
        User user=login();
        while (true){
            int choice =user.menu();
            user.doAction(choice,bookList);
        }
    }
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入登录名");
        String name=scanner.next();
        System.out.println("选择您的身份:1.管理员 2.普通用户");
        int who=scanner.nextInt();
        if(who==1){
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
}
