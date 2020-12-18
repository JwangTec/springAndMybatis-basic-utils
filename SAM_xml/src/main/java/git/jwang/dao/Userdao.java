package git.jwang.dao;

import git.jwang.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Userdao {
    /**
     * 通过名字查询用户信息
     */
    User findUserByName(String name);
}
