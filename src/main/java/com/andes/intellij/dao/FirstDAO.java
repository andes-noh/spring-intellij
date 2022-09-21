package com.andes.intellij.dao;

import com.andes.intellij.vo.MmbrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FirstDAO {
    List<MmbrVO> selectMmbrList();
}
