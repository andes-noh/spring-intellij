package com.andes.intellij.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Alias("Insert_DB_UserInfo_Model")
@Data
public class Insert_DB_UserInfo_Model {
    String mmbrId;
    String mmbrPwd;
    String mmbrNm;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime mmbrJoinDtm;
}
