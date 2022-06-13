package org.chengshuo.bookpuls.service;

import org.chengshuo.bookpuls.dao.UserDao;
import org.chengshuo.bookpuls.pojo.User;

public class UserService {
    /*
    *
    * 实现DAO 层
    * 专用于 实现业务逻辑层
    * */
    UserDao userDao = new UserDao();

    /*
    * 登录方法
    *
    * */
    public String signUp(User user){
        //调用  DAO 层的user
        User select = userDao.select(user);
        if(select == null){
            return  "该用户不存在或已删除";
        }else{
//            看状态
            if(select.getUstype() == 1){
                return "该用户以被禁用，请更换";
            }else{
                return "登录成功";
            }
        }
    }



}
