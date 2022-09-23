package com.andes.intellij.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Alias("Delete_DB_UserInfo_Model")
@Data
public class Delete_DB_UserInfo_Model {
    String mmbrId;
}
