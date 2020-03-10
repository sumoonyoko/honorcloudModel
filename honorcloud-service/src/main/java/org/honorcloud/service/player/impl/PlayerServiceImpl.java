package org.honorcloud.service.player.impl;

import org.honorcloud.dao.entity.Player;
import org.honorcloud.dao.player.PlayerDao;
import org.honorcloud.service.player.MPPlayerService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sumoon
 * @since 2020-03-09
 */
@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerDao, Player> implements MPPlayerService {

}
