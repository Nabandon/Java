package Library.action;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class AddAction implements IAction {
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("新增图书 请输入书名:");
        String name=scanner.next();
        System.out.println("请输入作者:");
        String author=scanner.next();
        System.out.println("请输入价格:");
        int price=scanner.nextInt();
        System.out.println("请输入类型:");
        String type=scanner.next();
        Book book=new Book(name,author,price,type,false);
        int size=bookList.getSize();
        bookList.setBooks(size,book);
        bookList.setSize(size+1);
        System.out.println("新增图书成功!");
    }
}
