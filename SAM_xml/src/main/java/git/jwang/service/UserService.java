package git.jwang.service;

import git.jwang.bean.User;
import git.jwang.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private Userdao userdao;

    /**
     * 根据名字查询用户
     */

    public User selectUserByName(String name) {
        return userdao.findUserByName(name);
    }
}
