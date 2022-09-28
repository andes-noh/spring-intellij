package com.andes.intellij.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("Update_DB_UserInfo_Model")
@Data

public class Update_DB_UserInfo_Model {
    String mmbrId;
    String mmbrPwd;
    String mmbrNm;
}
