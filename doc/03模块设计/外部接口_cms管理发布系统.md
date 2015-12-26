#目的

该文档定义cms内容管理模块接口，并指导开发。

#接口

##这个功能主要实现从数据库中读取内容,生成静态页面,并且进行发布

这个功能主要实现从数据库中读取内容,生成静态页面,并且进行发布.

1）请求说明

http请求方式: post

    http://if:port/if/cmsManager/publish


POST数据格式：JSON

   {"docId":120}


参数|必须|说明
------|------|-------
docId|是|文档id



2）返回说明

正常时的返回JSON数据包示例：

    {
        "errcode":0,"errmsg":"cms系统文档发布成功"
        
    }

错误时的JSON数据包示例：

    {
        "errcode":10000,"errmsg":"cms系统文档发布失败"
    }







