package cn.qtech.domain;

public class PaperCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_category.category_id
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    private String categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_category.type
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_category.name
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_category.description
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_category.category_id
     *
     * @return the value of paper_category.category_id
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_category.category_id
     *
     * @param categoryId the value for paper_category.category_id
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_category.type
     *
     * @return the value of paper_category.type
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_category.type
     *
     * @param type the value for paper_category.type
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_category.name
     *
     * @return the value of paper_category.name
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_category.name
     *
     * @param name the value for paper_category.name
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_category.description
     *
     * @return the value of paper_category.description
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_category.description
     *
     * @param description the value for paper_category.description
     *
     * @mbggenerated Tue Mar 21 14:23:05 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}