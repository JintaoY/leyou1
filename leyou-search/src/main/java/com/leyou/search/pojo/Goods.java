package com.leyou.search.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * elasticSearch 有智能判断  String需要加field就够了
 */
@Document(indexName = "goods",type = "docs",shards = 1,replicas = 0)
public class Goods {
    @Id
    private Long id;  //spuId
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String all; //所有需要被查询信息的组合 标题+分类名+品牌名
    @Field(type = FieldType.Keyword,index = false)
    private String subTitle;  //买点 副标题

    private Long brandId;
    private Long cid1;
    private Long cid2;
    private Long cid3;

    private Date createTime;  //创建时间

    private List<Long> price; //价格
    @Field(type = FieldType.Keyword,index = false)
    private String skus; // List<sku>信息json结构 elastic效率
    //会形成spec 里面有keyword  还有text
    private Map<String,Object> specs;//搜索的规格参数


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCid1() {
        return cid1;
    }

    public void setCid1(Long cid1) {
        this.cid1 = cid1;
    }

    public Long getCid2() {
        return cid2;
    }

    public void setCid2(Long cid2) {
        this.cid2 = cid2;
    }

    public Long getCid3() {
        return cid3;
    }

    public void setCid3(Long cid3) {
        this.cid3 = cid3;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Long> getPrice() {
        return price;
    }

    public void setPrice(List<Long> price) {
        this.price = price;
    }

    public String getSkus() {
        return skus;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public Map<String, Object> getSpecs() {
        return specs;
    }

    public void setSpecs(Map<String, Object> specs) {
        this.specs = specs;
    }
}