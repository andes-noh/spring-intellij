package com.andes.intellij.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Alias("MmbrVO")
@Getter
@Setter
public class MmbrVO {
    String mmbrId;
    String mmbrPwd;
    String mmbrNm;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime mmbrJoinDtm;
}
