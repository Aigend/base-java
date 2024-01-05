package com.itheima.batismy;

import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    Blog selectBlog(@Param("id") int id);
}
