package com.chengshuo.service;

import com.chengshuo.Book;

import java.util.List;
import java.util.Scanner;

public class BookService extends ICopeService<Book> {
    Scanner sc = new Scanner(System.in);
    public void addbook(){
        Book book = new Book();
        System.out.println("请输入书籍名称");
        String name = sc.next();
        book.setName(name);
        System.out.println("请输入书籍价格");
        double price = sc.nextDouble();
        book.setPrice(price);
        System.out.println("请输入书籍库存");
        int store = sc.nextInt();
        book.setStore(store);

        add(book);
    }
    public  void  querbook(){
        List<Book> querybook = super.query();
        int n = 0;
        System.out.println("序号\t书籍名\t书籍价格\t书籍库存");
        for (Book b : querybook) {
            System.out.println(++n+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getStore());
        }
    }
    public boolean buybook(int number,int buynum){
        List<Book> querybook = super.query();
        Book book = querybook.get(number - 1);
        book.setBuynumber(book.getBuynumber()+buynum);
        book.setStore(book.getStore()-buynum);
        return true;
    }

}
