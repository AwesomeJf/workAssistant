package com.chenxu.workassistant.dao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class CollectionEntity {

    @Id(autoincrement = true)
    private Long id;
    private String path;
    private long time;
    @Generated(hash = 2038337557)
    public CollectionEntity(Long id, String path, long time) {
        this.id = id;
        this.path = path;
        this.time = time;
    }
    @Generated(hash = 1951715304)
    public CollectionEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public long getTime() {
        return this.time;
    }
    public void setTime(long time) {
        this.time = time;
    }
}
