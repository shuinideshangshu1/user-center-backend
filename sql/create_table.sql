create table user
(
    id           bigint auto_increment
        primary key,
    username     varchar(256)                       null,
    userAccount  varchar(256)                       null,
    avatarUrl    varchar(1024)                      null,
    gender       tinyint                            null,
    userPassword varchar(512)                       not null,
    phone        varchar(128)                       null,
    email        varchar(512)                       null,
    userStatus   int      default 0                 not null,
    createTime   datetime default CURRENT_TIMESTAMP null,
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    idDelete     tinyint  default 0                 not null,
    userRole     int      default 0                 not null comment '用户角色 0 普通用户
	1 管理员',
    planetCode   varchar(512)                       null
)
    comment '用户';