package com.bothsavage.basic.project.service;

import com.bothsavage.basic.project.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bothsavage.basic.project.form.user.AddUserForm;
import com.bothsavage.basic.project.form.user.ListUserForm;
import com.bothsavage.basic.project.vo.PageVo;
import com.bothsavage.basic.project.vo.UserVo;

/**
 *
 * @date Created in 2020/3/6 4:51 下午
 * Utils: Intellij Idea
 * Description: 用户服务类
 */
public interface IUserService extends IService<User> {

    /**
     * 添加用户
     * @param userForm 表单数据
     * @return true 或者 false
     */
    boolean addUser(AddUserForm userForm);

    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    PageVo<UserVo> listUser(ListUserForm listUserForm);

    /**
     * 删除用户
     * @param id id
     */
    void deleteUser(String id);

}
