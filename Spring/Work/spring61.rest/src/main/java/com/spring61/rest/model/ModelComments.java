package com.spring61.rest.model;

import java.util.Date;

public class ModelComments {
    
       private Integer commentno = null; // NUMBER(10)     generated as identity 
       private Integer articleno = null; // NUMBER(10)     NOT NULL     
       private String  email     = ""; // VARCHAR2(60)  
       private String  memo      = ""; // VARCHAR2(4000)
       private Date    regdate   = null; // Date
       private Boolean UseYN     = null; // NUMBER(1)       DEFAULT 1 NOT NULL ENABLE
       private String  InsertUID = ""; // VARCHAR(40)      NULL                            
       private Date    InsertDT  = null; // Date         NULL
       private String  UpdateUID = ""; // VARCHAR(40)      NULL                            
       private Date    UpdateDT  = null; // Date         NULL
    
       
    public Integer getCommentno() {
        return commentno;
    }
    public void setCommentno(Integer commentno) {
        this.commentno = commentno;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    public Boolean getUseYN() {
        return UseYN;
    }
    public void setUseYN(Boolean useYN) {
        UseYN = useYN;
    }
    public String getInsertUID() {
        return InsertUID;
    }
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    public Date getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(Date insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public Date getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(Date updateDT) {
        UpdateDT = updateDT;
    }
    
    @Override
    public String toString() {
        return "ModelComments [commentno=" + commentno + ", articleno="
                + articleno + ", email=" + email + ", memo=" + memo
                + ", regdate=" + regdate + ", UseYN=" + UseYN + ", InsertUID="
                + InsertUID + ", InsertDT=" + InsertDT + ", UpdateUID="
                + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
    }
    
    public ModelComments() {
        super();
    }
    
    public ModelComments(Integer commentno, Integer articleno, String email,
            String memo, Date regdate, Boolean useYN, String insertUID,
            Date insertDT, String updateUID, Date updateDT) {
        super();
        this.commentno = commentno;
        this.articleno = articleno;
        this.email = email;
        this.memo = memo;
        this.regdate = regdate;
        UseYN = useYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }
    
    
    
       
}
