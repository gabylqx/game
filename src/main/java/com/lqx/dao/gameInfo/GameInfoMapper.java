package com.lqx.dao.gameInfo;

import com.game.dao.gameInfo.model.GameInfo;
import com.lqx.dao.gameInfo.model.GameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameInfoMapper {
    int countByExample(GameInfoExample example);

    int deleteByExample(GameInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameInfo record);

    int insertSelective(GameInfo record);

    List<GameInfo> selectByExample(GameInfoExample example);

    GameInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameInfo record, @Param("example") GameInfoExample example);

    int updateByExample(@Param("record") GameInfo record, @Param("example") GameInfoExample example);

    int updateByPrimaryKeySelective(GameInfo record);

    int updateByPrimaryKey(GameInfo record);
}