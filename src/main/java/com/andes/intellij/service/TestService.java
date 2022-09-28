package com.andes.intellij.service;

import com.andes.intellij.model.Delete_DB_UserInfo_Model;
import com.andes.intellij.model.Insert_DB_UserInfo_Model;
import com.andes.intellij.model.Return_DB_Json_Model;
import com.andes.intellij.model.Update_DB_UserInfo_Model;
import com.andes.intellij.vo.MmbrVO;

import java.util.List;

public interface TestService {
    public List<MmbrVO> listUser();
    public int insertUser(Insert_DB_UserInfo_Model user);
    public int deleteUser(Delete_DB_UserInfo_Model user);
    public int updateUser(Update_DB_UserInfo_Model user);
}
