package com.andes.intellij.service;

import com.andes.intellij.model.Insert_DB_UserInfo_Model;
import com.andes.intellij.model.Return_DB_Json_Model;
import com.andes.intellij.vo.MmbrVO;

import java.util.List;

public interface TestService {
    public List<MmbrVO> helloWorld();
    public int insertUser(Insert_DB_UserInfo_Model user);
}
