package org.honorcloud.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author sumoon
 * @since 2020-03-09
 */
public class Room extends Model<Room> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 玩家ID
     */
    private Integer playerCode;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(Integer playerCode) {
        this.playerCode = playerCode;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static final String ID = "id";

    public static final String ROOM_NAME = "room_name";

    public static final String PLAYER_CODE = "player_code";

    public static final String CREATE_TIME = "create_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Room{" +
        "id=" + id +
        ", roomName=" + roomName +
        ", playerCode=" + playerCode +
        ", createTime=" + createTime +
        "}";
    }
}
