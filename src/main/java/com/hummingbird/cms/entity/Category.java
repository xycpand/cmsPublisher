package com.hummingbird.cms.entity;

/**
 * t_category
 */
public class Category {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * title
     */
    private String title;

    /**
     * pid
     */
    private Integer pid;

    /**
     * sort
     */
    private Integer sort;

    /**
     * list_row
     */
    private Byte listRow;

    /**
     * meta_title
     */
    private String metaTitle;

    /**
     * keywords
     */
    private String keywords;

    /**
     * description
     */
    private String description;

    /**
     * template_index
     */
    private String templateIndex;

    /**
     * template_lists
     */
    private String templateLists;

    /**
     * template_detail
     */
    private String templateDetail;

    /**
     * template_edit
     */
    private String templateEdit;

    /**
     * model
     */
    private String model;

    /**
     * model_sub
     */
    private String modelSub;

    /**
     * type
     */
    private String type;

    /**
     * link_id
     */
    private Integer linkId;

    /**
     * allow_publish
     */
    private Byte allowPublish;

    /**
     * display
     */
    private Byte display;

    /**
     * reply
     */
    private Byte reply;

    /**
     * check
     */
    private Byte check;

    /**
     * reply_model
     */
    private String replyModel;

    /**
     * create_time
     */
    private Integer createTime;

    /**
     * update_time
     */
    private Integer updateTime;

    /**
     * status
     */
    private Byte status;

    /**
     * icon
     */
    private Integer icon;

    /**
     * groups
     */
    private String groups;

    /**
     * extend
     */
    private String extend;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id 
	 *            id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
	 *            name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title 
	 *            title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid 
	 *            pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort 
	 *            sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return list_row
     */
    public Byte getListRow() {
        return listRow;
    }

    /**
     * @param listRow 
	 *            list_row
     */
    public void setListRow(Byte listRow) {
        this.listRow = listRow;
    }

    /**
     * @return meta_title
     */
    public String getMetaTitle() {
        return metaTitle;
    }

    /**
     * @param metaTitle 
	 *            meta_title
     */
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords 
	 *            keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 
	 *            description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return template_index
     */
    public String getTemplateIndex() {
        return templateIndex;
    }

    /**
     * @param templateIndex 
	 *            template_index
     */
    public void setTemplateIndex(String templateIndex) {
        this.templateIndex = templateIndex == null ? null : templateIndex.trim();
    }

    /**
     * @return template_lists
     */
    public String getTemplateLists() {
        return templateLists;
    }

    /**
     * @param templateLists 
	 *            template_lists
     */
    public void setTemplateLists(String templateLists) {
        this.templateLists = templateLists == null ? null : templateLists.trim();
    }

    /**
     * @return template_detail
     */
    public String getTemplateDetail() {
        return templateDetail;
    }

    /**
     * @param templateDetail 
	 *            template_detail
     */
    public void setTemplateDetail(String templateDetail) {
        this.templateDetail = templateDetail == null ? null : templateDetail.trim();
    }

    /**
     * @return template_edit
     */
    public String getTemplateEdit() {
        return templateEdit;
    }

    /**
     * @param templateEdit 
	 *            template_edit
     */
    public void setTemplateEdit(String templateEdit) {
        this.templateEdit = templateEdit == null ? null : templateEdit.trim();
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model 
	 *            model
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * @return model_sub
     */
    public String getModelSub() {
        return modelSub;
    }

    /**
     * @param modelSub 
	 *            model_sub
     */
    public void setModelSub(String modelSub) {
        this.modelSub = modelSub == null ? null : modelSub.trim();
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 
	 *            type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return link_id
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * @param linkId 
	 *            link_id
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * @return allow_publish
     */
    public Byte getAllowPublish() {
        return allowPublish;
    }

    /**
     * @param allowPublish 
	 *            allow_publish
     */
    public void setAllowPublish(Byte allowPublish) {
        this.allowPublish = allowPublish;
    }

    /**
     * @return display
     */
    public Byte getDisplay() {
        return display;
    }

    /**
     * @param display 
	 *            display
     */
    public void setDisplay(Byte display) {
        this.display = display;
    }

    /**
     * @return reply
     */
    public Byte getReply() {
        return reply;
    }

    /**
     * @param reply 
	 *            reply
     */
    public void setReply(Byte reply) {
        this.reply = reply;
    }

    /**
     * @return check
     */
    public Byte getCheck() {
        return check;
    }

    /**
     * @param check 
	 *            check
     */
    public void setCheck(Byte check) {
        this.check = check;
    }

    /**
     * @return reply_model
     */
    public String getReplyModel() {
        return replyModel;
    }

    /**
     * @param replyModel 
	 *            reply_model
     */
    public void setReplyModel(String replyModel) {
        this.replyModel = replyModel == null ? null : replyModel.trim();
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime 
	 *            create_time
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime 
	 *            update_time
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status 
	 *            status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return icon
     */
    public Integer getIcon() {
        return icon;
    }

    /**
     * @param icon 
	 *            icon
     */
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    /**
     * @return groups
     */
    public String getGroups() {
        return groups;
    }

    /**
     * @param groups 
	 *            groups
     */
    public void setGroups(String groups) {
        this.groups = groups == null ? null : groups.trim();
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    /**
     * @param extend 
	 *            extend
     */
    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }
}