# kotlin-spring-boot
一个测试用的小demo，主要实现sharding加解密功能，数据库为oracle，数据源选用的是hikari

##profile介绍
**oracle**不使用加密工具，直接读写oracle的
**dm**使用sharding加密数据

##controller介绍
**/index**插入数据的接口，测试入库加密
**/count**查询记录数的接口
**one?id=xxx**根据id查询的接口，测试出库解密

##数据表结构  
-- Create table  
 create table CONFIG  
 (  
   id          NUMBER(5) not null,  
   name        VARCHAR2(255),  
   value       VARCHAR2(255),  
   category    VARCHAR2(255),  
   update_time TIMESTAMP(6)  
 )  
 tablespace USERS  
   pctfree 10  
   initrans 1  
   maxtrans 255  
   storage  
   (  
     initial 64K  
     next 1M  
     minextents 1  
     maxextents unlimited  
   );  
 -- Create/Recreate primary, unique and foreign key constraints   
 alter table CONFIG  
   add constraint PK primary key (ID)  
   using index   
   tablespace USERS  
   pctfree 10  
   initrans 2  
   maxtrans 255  
   storage  
   (  
     initial 64K  
     next 1M  
     minextents 1  
     maxextents unlimited  
   );  
