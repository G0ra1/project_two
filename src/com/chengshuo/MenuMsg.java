package com.chengshuo;

import com.chengshuo.service.AdminSystem;
import com.chengshuo.service.BookService;

import java.util.Scanner;

public class MenuMsg {
    BookService bookService = new BookService();
    AdminSystem adminSystem = new AdminSystem();
    private final static String MENU="欢迎进入书籍管理系统";
    Scanner sc = new Scanner(System.in);
    public  void showmenu(){
        System.out.println("----------------"+MENU+"--------------");
        System.out.println("1：书籍添加 2、书籍查询   3、书籍购买  4、管理员添加   5、管理员查询  6、退出 ");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                addbook();
                break;
            case 2:
                querybook();
                break;
            case 3:
                buybook();
                break;
            case 4:
                addadmin();
                break;
            case 5:
                queryadmin();
                break;
            default:
                System.exit(0);

        }
    }

    /*
    * 添加书籍
    * */
    private void addbook(){
        bookService.addbook();
        System.out.println("继续添加吗(Y/N)");
        String choose = sc.next();
        if("Y".equals(choose)){
            addbook();
        }else {
            showmenu();
        }
    }
    /*
    * 查询书籍
    * */
    private  void  querybook(){
        bookService.querbook();
        showmenu();
    }


    /*
    *购买书籍
    * */
    private  void  buybook(){
        bookService.querbook();
        System.out.println("请按序号进行购买");
        int xh = sc.nextInt();
        System.out.println("请输入购买数量");
        int number = sc.nextInt();
        boolean b = bookService.buybook(xh, number);
        if(b){
            System.out.println("继续购买吗？(Y/N)");
            String next = sc.next();
            if("Y".equals(next)){
                buybook();
            }else {
                showmenu();
            }
        }
    }
    /*
    *
    * 用户添加
    * */
    private  void addadmin(){
        adminSystem.addadmin();
        System.out.println("继续添加吗(Y/N)");
        String choose = sc.next();
        if("Y".equals(choose)){
            addadmin();
        }else {
            showmenu();
        }

    }

    /*
    *
    * 用户查询
    *
    * */
    private  void queryadmin(){
        adminSystem.queryadmin();
        showmenu();
    }


}
