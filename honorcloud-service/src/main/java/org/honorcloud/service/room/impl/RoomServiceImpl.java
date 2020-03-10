package org.honorcloud.service.room.impl;

import org.honorcloud.dao.entity.Room;
import org.honorcloud.dao.room.RoomDao;
import org.honorcloud.service.room.MPRoomService;
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
public class RoomServiceImpl extends ServiceImpl<RoomDao, Room> implements MPRoomService {

}
