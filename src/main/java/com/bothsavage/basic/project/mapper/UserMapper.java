package com.bothsavage.basic.project.mapper;

import com.bothsavage.basic.project.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bothsavage.basic.project.form.user.ListUserForm;
import com.bothsavage.basic.project.vo.UserVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description: 数据库资源操作类
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    @Select("SELECT id,nickname,username,birthday FROM `user` WHERE `status`= #{status} LIMIT #{current},#{size}")
    List<UserVo> listUser(ListUserForm listUserForm);

}
