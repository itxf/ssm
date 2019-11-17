package cn.xdl.mapper;

import cn.xdl.bean.et_admin;
import org.apache.ibatis.annotations.Param;


import cn.xdl.bean.et_admin;

public interface AccountDao {
	et_admin selectByidaccnoandaccpassword(
            @Param("name") String name, @Param("password") String password);
}
