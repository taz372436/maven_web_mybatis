package mybatis.service;


import java.util.List;

import mybatis.beans.UserBean;
import mybatis.mapper.UserMapper;
import mybatis.tools.DBTools;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



public class UserService {

   
    public static void main(String[] args) {
          insertUser();
//        deleteUser();
//        selectUserById();
//        selectAllUser();
    }

    
    /**
     * 新增用户
     */
    @Test
    public static void insertUser() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserBean user = new UserBean("taz", "taz372436", 500.0);
        try {
            mapper.insertUser(user);
            System.out.println(user.toString());
             session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
    
    
    /**
     * 删除用户
     */
    private static void deleteUser(){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser(1);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
    
    
    /**
     * 根据id查询用户
     */
    private static void selectUserById(){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
        UserBean user=    mapper.selectUserById(2);
        System.out.println(user.toString());
            
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
    
    /**
     * 查询所有的用户
     */
    private static void selectAllUser(){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
        List<UserBean> user=mapper.selectAllUser();
        System.out.println(user.toString());
        session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
    

}