package org.honorcloud.service.album.impl;

import org.honorcloud.dao.album.AlbumDao;
import org.honorcloud.dao.entity.Album;
import org.honorcloud.service.album.MPAlbumService;
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
public class AlbumServiceImpl extends ServiceImpl<AlbumDao, Album> implements MPAlbumService {

}
