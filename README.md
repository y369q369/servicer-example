<h1><center>servicer-example</center></h1>

### 1. 简介

- 微信小程序后台程序

- 对接阿里云服务器测试demo

### 2. 核心依赖

| 名称                           | 作用                |
| ------------------------------ | ------------------- |
| mybatis-plus-boot-starter      | mybatis框架增强版   |
| mysql-connector-java           | 关系型数据库mysql   |
| spring-boot-starter-data-redis | 非关系型数据库redis |
| spring-boot-starter-web        | 内嵌tomcat          |
| spring-kafka                   | 消息队形kafka       |

### 3. 实战

#### 3.1 配置ssl证书

​	** 微信小程序需要域名， 故本例使用的阿里云的免费ssl证书

1.  安装ssl证书：  https://blog.csdn.net/binbinczsohu/article/details/107287448

2.  配置ssl证书:     https://www.jianshu.com/p/07381c68c403

   ​						   https://www.cnblogs.com/yjq520/p/12784857.html

#### 3.2 mybatisPlus

官网： https://mp.baomidou.com/guide/quick-start.html