/*
 * Copyright (c) 2018. Aberic - All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.aberic.fabric.dao.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 作者：Aberic on 2018/6/27 21:12
 * 邮箱：abericyang@gmail.com
 */
@Setter
@Getter
@ToString
@Table(name = "fns_user")
public class User {

    @Column(name = "id",type = MySqlTypeConstant.INT,length = 9,isKey = true,isAutoIncrement = true)
    private int id; // required
    @Column(name = "username",type = MySqlTypeConstant.VARCHAR,length = 32)
    private String username; // required
    @Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 32)
    private String password; // required
    @Column(name = "role_id",type = MySqlTypeConstant.INT,length = 3)
    private int roleId; // 1-超级管理员、2-管理员、8-普通会员
    @Column(name = "date",type = MySqlTypeConstant.VARCHAR,length = 14)
    private String date;

    private String roleName;

}
