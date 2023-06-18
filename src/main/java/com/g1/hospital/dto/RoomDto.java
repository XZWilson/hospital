package com.g1.hospital.dto;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class RoomDto {
    private Long roomId;
    private String roomName;
    private Long scheduleId;

    public RoomDto() {
    }

    public RoomDto(Long roomId, String roomName, Long scheduleId) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.scheduleId = scheduleId;
    }

    /**
     * 获取
     * @return roomId
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置
     * @param roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 获取
     * @return scheduleId
     */
    public Long getScheduleId() {
        return scheduleId;
    }

    /**
     * 设置
     * @param scheduleId
     */
    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String toString() {
        return "RoomDto{roomId = " + roomId + ", roomName = " + roomName + ", scheduleId = " + scheduleId + "}";
    }
}
