package com.spring61.rest.model;

import java.util.Date;

public class ModelBoard {
    
    private String boardcd            =  "";     // VARCHAR(20) NOT NULL COMMENT '게시판 코드   ',
    private String boardnm            =  "";     // VARCHAR(40) NOT NULL COMMENT '게시판 이름   ',
    private Boolean UseYN             =   null;  // TINYINT(1) NULL DEFAULT '1' COMMENT '게시판 사용 여부',
    private String InsertUID          =  "";     // VARCHAR(40) NULL DEFAULT NULL COMMENT '최초 작성자      ',
    private java.util.Date InsertDT   =   null;  // DATETIME NULL DEFAULT NULL COMMENT '최초 작성 날짜와 시간',
    private String UpdateUID          =  "";     // VARCHAR(40) NULL DEFAULT NULL COMMENT '최종 수정자      ',
    private java.util.Date UpdateDT   =   null;  // DATETIME NULL DEFAULT NULL COMMENT '최종 작성 날짜와 시간',
    
    
    public String getBoardcd() {
        return boardcd;
    }
    public void setBoardcd(String boardcd) {
        this.boardcd = boardcd;
    }
    public String getBoardnm() {
        return boardnm;
    }
    public void setBoardnm(String boardnm) {
        this.boardnm = boardnm;
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
    public java.util.Date getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(java.util.Date insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public java.util.Date getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(java.util.Date updateDT) {
        UpdateDT = updateDT;
    }
    
    @Override
    public String toString() {
        return "ModelBoard [boardcd=" + boardcd + ", boardnm=" + boardnm
                + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }
    
    public ModelBoard() {
        super();
    }
    
    public ModelBoard(String boardcd, String boardnm, Boolean useYN,
            String insertUID, Date insertDT, String updateUID, Date updateDT) {
        super();
        this.boardcd = boardcd;
        this.boardnm = boardnm;
        UseYN = useYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }
    
    
    
}
