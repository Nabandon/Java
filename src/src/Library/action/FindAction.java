package Library.action;

import Library.book.Book;
import Library.book.BookList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书操作");
        System.out.println("输入查找书籍的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
            }
        }
        System.out.println("无该图书");
    }
}
