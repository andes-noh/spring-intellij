package com.andes.intellij.dao;

import com.andes.intellij.model.Delete_DB_UserInfo_Model;
import com.andes.intellij.model.Insert_DB_UserInfo_Model;
import com.andes.intellij.model.Return_DB_Json_Model;
import com.andes.intellij.vo.MmbrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FirstDAO {
    List<MmbrVO> selectMmbrList();

    int insertUser(Insert_DB_UserInfo_Model user);

    int deleteUser(Delete_DB_UserInfo_Model user);
}
