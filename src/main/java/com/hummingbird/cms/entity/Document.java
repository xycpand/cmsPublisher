package com.hummingbird.cms.entity;

/**
 * t_document
 */
public class Document {
    /**
     * id
     */
    private Integer id;

    /**
     * uid
     */
    private Integer uid;

    /**
     * name
     */
    private String name;

    /**
     * title
     */
    private String title;

    /**
     * category_id
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
    private Byte type;

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
     * comment
     */
    private Integer comment;

    /**
     * extend
     */
    private Integer extend;

    /**
     * level
     */
    private Integer level;

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
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid 
	 *            uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
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
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId 
	 *            category_id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return group_id
     */
    public Short getGroupId() {
        return groupId;
    }

    /**
     * @param groupId 
	 *            group_id
     */
    public void setGroupId(Short groupId) {
        this.groupId = groupId;
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
     * @return root
     */
    public Integer getRoot() {
        return root;
    }

    /**
     * @param root 
	 *            root
     */
    public void setRoot(Integer root) {
        this.root = root;
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
     * @return model_id
     */
    public Byte getModelId() {
        return modelId;
    }

    /**
     * @param modelId 
	 *            model_id
     */
    public void setModelId(Byte modelId) {
        this.modelId = modelId;
    }

    /**
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type 
	 *            type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return position
     */
    public Short getPosition() {
        return position;
    }

    /**
     * @param position 
	 *            position
     */
    public void setPosition(Short position) {
        this.position = position;
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
     * @return cover_id
     */
    public Integer getCoverId() {
        return coverId;
    }

    /**
     * @param coverId 
	 *            cover_id
     */
    public void setCoverId(Integer coverId) {
        this.coverId = coverId;
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
     * @return deadline
     */
    public Integer getDeadline() {
        return deadline;
    }

    /**
     * @param deadline 
	 *            deadline
     */
    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    /**
     * @return attach
     */
    public Byte getAttach() {
        return attach;
    }

    /**
     * @param attach 
	 *            attach
     */
    public void setAttach(Byte attach) {
        this.attach = attach;
    }

    /**
     * @return view
     */
    public Integer getView() {
        return view;
    }

    /**
     * @param view 
	 *            view
     */
    public void setView(Integer view) {
        this.view = view;
    }

    /**
     * @return comment
     */
    public Integer getComment() {
        return comment;
    }

    /**
     * @param comment 
	 *            comment
     */
    public void setComment(Integer comment) {
        this.comment = comment;
    }

    /**
     * @return extend
     */
    public Integer getExtend() {
        return extend;
    }

    /**
     * @param extend 
	 *            extend
     */
    public void setExtend(Integer extend) {
        this.extend = extend;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level 
	 *            level
     */
    public void setLevel(Integer level) {
        this.level = level;
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
}