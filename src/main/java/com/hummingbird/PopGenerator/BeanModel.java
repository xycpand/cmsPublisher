/**
 * 
 * BeanModel.java
 * 版本所有 深圳市蜂鸟娱乐有限公司 2013-2014
 */
package com.hummingbird.PopGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.plexus.util.StringUtils;

/**
 * @author john huang
 * 2015年10月31日 上午8:23:22
 * 本类主要做为 保存需要生成的内容
 */
public class BeanModel {

	/** bean 功能名称 */
	private String name;
	/** bean 首字母小写名称 */
	private String lowerName;
	/** bean 路径 */
	private String beanUrl;
	/** dao 路径 */
	private String beanDaoUrl;
	/** dao 实现路径 */
	private String beanDaoImplUrl;
	/** service 路径 */
	private String beanServiceUrl;
	/** service 实现路径 */
	private String beanServiceImplUrl;
	
	/**
	 * 项目名称英文
	 */
	String projectName;
	/**
	 * controller中的url
	 */
	String controllerurl;
	/**
	 * controller中的url
	 */
	String methodurl;
	
	/**
	 * 访问完整路径
	 */
	String methodFullUrl;
	
	/**
	 * 功能中文描述
	 */
	String beanNameCN;
	/**
	 * 方法名
	 */
	String methodName;
	/**
	 * 方法功能代号
	 */
	String methodCode;
	
	/**
	 * 方法中文描述
	 */
	String methodNameCN;
	/**
	 * 参数类名
	 */
	String transOrderBodyClassName;
	
	/**
	 * json转换的类名
	 */
	String transOrderClassName;
	/**
	 * json的内容，主要用于生成测试数据
	 */
	String jsonContent;
	
	/**
	 * 子类的全名
	 */
	private String transOrderBodyClassFullName;
	/**
	 * transorder 的全名
	 */
	private String transOrderClassFullName;
	/**
	 * 基本路径
	 */
	private String classBasePath;
//	/**
//	 * 字段属性
//	 */
//	List<ClassProperty> classPropertys = new ArrayList<ClassProperty>();
	

	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 类型,normal 普通,page 分页
	 */
	private String type = "normal";
	private boolean hadReturn;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLowerName() {
		return lowerName;
	}

	public void setLowerName(String lowerName) {
		this.lowerName = lowerName;
	}

	public String getBeanUrl() {
		return beanUrl;
	}

	public void setBeanUrl(String beanUrl) {
		this.beanUrl = beanUrl;
	}

	public String getBeanDaoUrl() {
		return beanDaoUrl;
	}

	public void setBeanDaoUrl(String beanDaoUrl) {
		this.beanDaoUrl = beanDaoUrl;
	}

	public String getBeanDaoImplUrl() {
		return beanDaoImplUrl;
	}

	public void setBeanDaoImplUrl(String beanDaoImplUrl) {
		this.beanDaoImplUrl = beanDaoImplUrl;
	}

	public String getBeanServiceUrl() {
		return beanServiceUrl;
	}

	public void setBeanServiceUrl(String beanServiceUrl) {
		this.beanServiceUrl = beanServiceUrl;
	}

	public String getBeanServiceImplUrl() {
		return beanServiceImplUrl;
	}

	public void setBeanServiceImplUrl(String beanServiceImplUrl) {
		this.beanServiceImplUrl = beanServiceImplUrl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BeanModel [name=" + name + ", lowerName=" + lowerName + ", beanUrl=" + beanUrl + ", beanDaoUrl="
				+ beanDaoUrl + ", beanDaoImplUrl=" + beanDaoImplUrl + ", beanServiceUrl=" + beanServiceUrl
				+ ", beanServiceImplUrl=" + beanServiceImplUrl + ", projectName=" + projectName  + "]";
	}

	/**
	 * 项目名称英文 
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * 项目名称英文 
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * controller中的url 
	 */
	public String getControllerurl() {
		return controllerurl;
	}

	/**
	 * controller中的url 
	 */
	public void setControllerurl(String controllerurl) {
		this.controllerurl = controllerurl;
	}

	/**
	 * controller中的url 
	 */
	public String getMethodurl() {
		return methodurl;
	}

	/**
	 * controller中的url 
	 */
	public void setMethodurl(String methodurl) {
		this.methodurl = methodurl;
	}

	/**
	 * 功能中文描述 
	 */
	public String getBeanNameCN() {
		return beanNameCN;
	}

	/**
	 * 功能中文描述 
	 */
	public void setBeanNameCN(String beanNameCN) {
		this.beanNameCN = beanNameCN;
	}

	/**
	 * 方法名 
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * 方法名 
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * 方法功能代号 
	 */
	public String getMethodCode() {
		return methodCode;
	}

	/**
	 * 方法功能代号 
	 */
	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	/**
	 * 方法中文描述 
	 */
	public String getMethodNameCN() {
		return methodNameCN;
	}

	/**
	 * 方法中文描述 
	 */
	public void setMethodNameCN(String methodNameCN) {
		this.methodNameCN = methodNameCN;
	}




	/**
	 * 参数类名 
	 */
	public String getTransOrderBodyClassName() {
		return transOrderBodyClassName;
	}

	/**
	 * 参数类名 
	 */
	public void setTransOrderBodyClassName(String transOrderBodyClassName) {
		this.transOrderBodyClassName = transOrderBodyClassName;
	}

	/**
	 * json转换的类名 
	 */
	public String getTransOrderClassName() {
		return transOrderClassName;
	}

	/**
	 * json转换的类名 
	 */
	public void setTransOrderClassName(String transOrderClassName) {
		this.transOrderClassName = transOrderClassName;
	}


	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 用户名 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * @param string
	 */
	public void setType(String type) {
		this.type = type;
		
	}

	/**
	 * 类型normal 普通page 分页 
	 */
	public String getType() {
		return type;
	}

	/**
	 * 基本路径 
	 */
	public String getClassBasePath() {
		return classBasePath;
	}

	/**
	 * 基本路径 
	 */
	public void setClassBasePath(String classBasePath) {
		this.classBasePath = classBasePath;
	}

	/**
	 * 访问完整路径 
	 */
	public String getMethodFullUrl() {
		return methodFullUrl;
	}

	/**
	 * 访问完整路径 
	 */
	public void setMethodFullUrl(String methodFullUrl) {
		this.methodFullUrl = methodFullUrl;
	}

	/**
	 * json的内容，主要用于生成测试数据 
	 */
	public String getJsonContent() {
		return jsonContent;
	}
	/**
	 * json的内容，主要用于生成测试数据 
	 */
	public String getJsonContent4String() {
		String temp = jsonContent;
		temp = StringUtils.replace(temp, "\r", "");
		temp = StringUtils.replace(temp, "\n", "");
		temp = StringUtils.replace(temp, "\t", "");
		temp = StringUtils.replace(temp, "\"", "\\\"");
		return temp;
	}

	/**
	 * json的内容，主要用于生成测试数据 
	 */
	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
	}


	/**
	 * @param equalsIgnoreCase
	 */
	public void setHadReturn(boolean hadReturn) {
		this.hadReturn = hadReturn;
		
	}

	/**
	 * #{bare_field_comment} 
	 */
	public boolean isHadReturn() {
		return hadReturn;
	}
	
	
	
	 /**
     * 文档id
     */
    private Integer docId;


    /**
     * name
     */
    private String docName;

    /**
     * title
     */
    private String title;

    /**
     * 文档类别
     */
    private Integer categoryId;

    /**
     * group_id
     */
    private Short groupId;

    /**
     * description
     */
    private String description;

    /**
     * root
     */
    private Integer root;

    /**
     * pid
     */
    private Integer pid;

    /**
     * model_id
     */
    private Byte modelId;

    /**
     * type
     */
    private Byte docType;

    /**
     * position
     */
    private Short position;

    /**
     * link_id
     */
    private Integer linkId;

    /**
     * cover_id
     */
    private Integer coverId;

    /**
     * display
     */
    private Byte display;

    /**
     * deadline
     */
    private Integer deadline;

    /**
     * attach
     */
    private Byte attach;

    /**
     * view
     */
    private Integer view;

    /**
     * parse
     */
    private Byte parse;

    /**
     * 模板
     */
    private String template;

    /**
     * bookmark
     */
    private Integer bookmark;

    /**
     * 文档内容
     */
    private String content;



	/**
	 * @return the docId
	 */
	public Integer getDocId() {
		return docId;
	}

	/**
	 * @return the docName
	 */
	public String getDocName() {
		return docName;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @return the groupId
	 */
	public Short getGroupId() {
		return groupId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the root
	 */
	public Integer getRoot() {
		return root;
	}

	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * @return the modelId
	 */
	public Byte getModelId() {
		return modelId;
	}

	/**
	 * @return the docType
	 */
	public Byte getDocType() {
		return docType;
	}

	/**
	 * @return the position
	 */
	public Short getPosition() {
		return position;
	}

	/**
	 * @return the linkId
	 */
	public Integer getLinkId() {
		return linkId;
	}

	/**
	 * @return the coverId
	 */
	public Integer getCoverId() {
		return coverId;
	}

	/**
	 * @return the display
	 */
	public Byte getDisplay() {
		return display;
	}

	/**
	 * @return the deadline
	 */
	public Integer getDeadline() {
		return deadline;
	}

	/**
	 * @return the attach
	 */
	public Byte getAttach() {
		return attach;
	}

	/**
	 * @return the view
	 */
	public Integer getView() {
		return view;
	}

	/**
	 * @return the parse
	 */
	public Byte getParse() {
		return parse;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @return the bookmark
	 */
	public Integer getBookmark() {
		return bookmark;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param docId the docId to set
	 */
	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	/**
	 * @param docName the docName to set
	 */
	public void setDocName(String docName) {
		this.docName = docName;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Short groupId) {
		this.groupId = groupId;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Integer root) {
		this.root = root;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(Byte modelId) {
		this.modelId = modelId;
	}

	/**
	 * @param docType the docType to set
	 */
	public void setDocType(Byte docType) {
		this.docType = docType;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Short position) {
		this.position = position;
	}

	/**
	 * @param linkId the linkId to set
	 */
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	/**
	 * @param coverId the coverId to set
	 */
	public void setCoverId(Integer coverId) {
		this.coverId = coverId;
	}

	/**
	 * @param display the display to set
	 */
	public void setDisplay(Byte display) {
		this.display = display;
	}

	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	/**
	 * @param attach the attach to set
	 */
	public void setAttach(Byte attach) {
		this.attach = attach;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(Integer view) {
		this.view = view;
	}

	/**
	 * @param parse the parse to set
	 */
	public void setParse(Byte parse) {
		this.parse = parse;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @param bookmark the bookmark to set
	 */
	public void setBookmark(Integer bookmark) {
		this.bookmark = bookmark;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
    

}
