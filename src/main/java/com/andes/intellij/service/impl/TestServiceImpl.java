package com.andes.intellij.service.impl;

import com.andes.intellij.dao.FirstDAO;
import com.andes.intellij.model.Delete_DB_UserInfo_Model;
import com.andes.intellij.model.Insert_DB_UserInfo_Model;
import com.andes.intellij.model.Return_DB_Json_Model;
import com.andes.intellij.service.TestService;
import com.andes.intellij.vo.MmbrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private  final FirstDAO dao;

    @Override
    public List<MmbrVO> helloWorld() {
        return dao.selectMmbrList();
    }

    @Override
    public int insertUser(Insert_DB_UserInfo_Model user) {
        return dao.insertUser(user);
    }

    @Override
    public int deleteUser(Delete_DB_UserInfo_Model user) {
        return dao.deleteUser(user);
    }
}
