package com.hummingbird.cms.entity;

/**
 * t_document_article
 */
public class DocumentArticle {
    /**
     * id
     */
    private Integer id;

    /**
     * parse
     */
    private Byte parse;

    /**
     * template
     */
    private String template;

    /**
     * bookmark
     */
    private Integer bookmark;

    /**
     * content
     */
    private String content;

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
     * @return parse
     */
    public Byte getParse() {
        return parse;
    }

    /**
     * @param parse 
	 *            parse
     */
    public void setParse(Byte parse) {
        this.parse = parse;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    /**
     * @param template 
	 *            template
     */
    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    /**
     * @return bookmark
     */
    public Integer getBookmark() {
        return bookmark;
    }

    /**
     * @param bookmark 
	 *            bookmark
     */
    public void setBookmark(Integer bookmark) {
        this.bookmark = bookmark;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content 
	 *            content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}