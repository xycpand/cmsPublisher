/**
 * 
 */
package com.hummingbird.PopGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.maven.plugin.logging.Log;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;


/**
 * @author hongten<br>
 * @date 2013-3-10
 */
public class PopGenertorUtils {
	org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(this.getClass());
	
	private static final String BEAN_INDEX_TEMPLATE_VM_PATH = "html.vm";

	 //文件 地址
    //private static final String BEAN_PATH = "com/b510/base/bean";
    private static final String DAO_PATH = "com/b510/base/dao";
    private static final String DAO_IMPL_PATH = "com/b510/base/dao/impl";
    private static final String SERVICE_PATH = "com/b510/base/service";
    private static final String SERVICE_IMPL_PATH = "com/b510/base/service/impl";

    
    
    //包名
    private static final String BEAN_URL = "com.b510.base.bean";
    private static final String DAO_URL = "com.b510.base.dao";
    private static final String DAO_IMPL_URL = "com.b510.base.dao.impl";
    private static final String SERVICE_URL = "com.b510.base.service";
    private static final String SERVICE_IMPL_URL = "com.b510.base.service.impl";

    
    private static BeanModel bean = new BeanModel();
    private static Annotation annotation = new Annotation();
    
    /**
	 * 构造函数
	 * @param bm
     * @param log 
	 */
	public PopGenertorUtils(BeanModel bm) {
		this.bean = bm;
		bean.setLowerName(getLowercaseChar(getLastChar(bm.getName())));
		String methodurl = bean.getMethodurl();
		if(methodurl != null){
			if(methodurl.startsWith("/"+bean.getLowerName())){
				methodurl=methodurl.replaceFirst("/"+bean.getLowerName(), "");
				bean.setMethodurl(methodurl);
			}
			else if(methodurl.startsWith(bean.getLowerName())){
				methodurl=methodurl.replaceFirst(bean.getLowerName(), "");
				bean.setMethodurl(methodurl);
			}
		}
		
		annotation.setAuthorName(bm.getUserName());
//        annotation.setAuthorMail("hongtenzone@foxmail.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd");
		annotation.setDate(simpleDateFormat.format(new Date()));
		annotation.setVersion("1.0");
		
		//解析json生成java
		
	}

	/**
     * 初始化bean和注解
     * @param c
     */
    public void init(Class c){
    	if(c != null){
    		String cName = c.getName();
    		bean.setName(getLastChar(cName));
    		bean.setBeanUrl(cName);
    		bean.setLowerName(getLowercaseChar(getLastChar(cName)));

    		annotation.setAuthorName("hongten");
            annotation.setAuthorMail("hongtenzone@foxmail.com");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
    				"yyyy-MM-dd");
    		annotation.setDate(simpleDateFormat.format(new Date()));
    		annotation.setVersion("1.0");
    	}
    }
    

    
    /**
     * 写文件
     * @param parentFolder
     * @param fileName
     * @param content
     */
    public void writeFile(File parentFolder,String fileName,String content){
    	if(parentFolder==null){
    		log.error("父文件夹不存在");
    	}
    	createFilePath(parentFolder);
         
         File file = new File(parentFolder,fileName);
         if(file.exists()){
        	 file.delete();
         }
         FileOutputStream fos =null;
         try {
        	 fos = new FileOutputStream(file);
        	 Writer fw = new OutputStreamWriter(fos, "UTF-8");
        	 fw.write(content);
        	 fw.flush();
		} catch (Exception e) {
			log.error(String.format("写文件出错"),e);
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				log.error(String.format("关闭出错"),e);
			}
		} 
         
         showInfo(fileName); 
         
    }
    
    
    
    /**
	 * @param beanVoTemplateVmPath
	 * @param bean2
	 * @param annotation2
	 * @param classInfo
	 * @return
	 */
	private String createCode(String fileVMPath, BeanModel bean, Annotation annotation) {
		Properties properties=new Properties();
    	//设置velocity资源加载方式为class
    	properties.setProperty("resource.loader", "class");
    	//设置velocity资源加载方式为file时的处理类
    	properties.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
    	//实例化一个VelocityEngine对象
    	VelocityEngine velocityEngine = new VelocityEngine(properties);
		velocityEngine.setProperty("input.encoding", "UTF-8");
		velocityEngine.setProperty("output.encoding", "UTF-8");
		velocityEngine.init();
		
		
		Template template = velocityEngine.getTemplate(fileVMPath);
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("bean", bean);
		velocityContext.put("annotation", annotation);
		StringWriter stringWriter = new StringWriter();
		template.merge(velocityContext, stringWriter);
		return stringWriter.toString();
	}
    
    
    
    
    
	
	 /**
     * 创建文件
     * @param file
     */
    public void createFilePath(File file){
    	if(!file.exists()){
            System.out.println("创建["+file.getAbsolutePath()+"]情况："+file.mkdirs());
        }else{
            System.out.println("存在目录："+file.getAbsolutePath());
        }
    }
    
 
    
    
    /**
     * 获取路径的最后面字符串<br>
     * 如：<br>
     *     <code>str = "com.b510.base.bean.User"</code><br>
     *     <code> return "User";<code>
     * @param str
     * @return
     */
    public String getLastChar(String str) {
        if ((str != null) && (str.length() > 0)) {
            int dot = str.lastIndexOf('.');
            if ((dot > -1) && (dot < (str.length() - 1))) {
                return str.substring(dot + 1);
            }
        }
        return str;
    }
    
    /**
     * 把第一个字母变为小写<br>
     * 如：<br>
     *     <code>str = "UserDao";</code><br>
     *     <code>return "userDao";</code>
     * @param str
     * @return
     */
    public String getLowercaseChar(String str){
    	if(str != null){
    		 return str.substring(0,1).toLowerCase()+str.substring(1);
    	}
    	return null;  
    }

    /**
     * 显示信息
     * @param info
     */
    public void showInfo(String info){
        System.out.println("创建文件："+ info+ "成功！");
    }
    
    /**
     * 获取系统时间
     * @return
     */
    public static String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }



	/**
	 * 输出文件
	 * @param outputDirectory
	 * @throws Exception 
	 */
	public void createSuite(File outputDirectory) throws Exception {
		String fileName = bean.getName() + ".html";
//		fileName = bean.transOrderBodyClassName + ".java";
//		writeFile(outputDirectory, fileName, createCode(BEAN_VO_TEMPLATE_VM_PATH,bean,annotation));
//		fileName = bean.transOrderBodyClassName + "Result.java";
//		writeFile(outputDirectory, fileName, createCode(BEAN_OUTVO_TEMPLATE_VM_PATH,bean,annotation));
		writeFile(outputDirectory, fileName, createCode(BEAN_INDEX_TEMPLATE_VM_PATH,bean,annotation));
	}

	
}
