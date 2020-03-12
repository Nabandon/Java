package Library.action;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class DelAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除的图书书名:");
        String name=scanner.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("删除失败,没有匹配书籍");
            return;
        }
        int size=bookList.getSize();
        bookList.setBooks(i,bookList.getBook(size-1));
        System.out.println("删除成功");
        bookList.setSize(size-1);
    }
}
