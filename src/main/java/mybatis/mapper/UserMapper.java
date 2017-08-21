package mybatis.mapper;

import java.util.List;

import mybatis.beans.UserBean;



public interface UserMapper {
    /**
     * �����Ñ�
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(UserBean user) throws Exception;
    /**
     * �޸��Ñ�
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    public int updateUser (UserBean user,int id) throws Exception;
     /**
      * �h���Ñ�
      * @param id
      * @return
      * @throws Exception
      */
    public int deleteUser(int id) throws Exception;
    /**
     * ����id��ѯ�û���Ϣ
     * @param id
     * @return
     * @throws Exception
     */
    public UserBean selectUserById(int id) throws Exception;
     /**
      * ��ѯ���е��û���Ϣ
      * @return
      * @throws Exception
      */
    public List<UserBean> selectAllUser() throws Exception;
}