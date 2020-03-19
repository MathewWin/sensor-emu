package com.sensor_emu.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
import com.sensor_emu.model.AbstractEntity;

@Dao
public abstract class GenericDao<T extends AbstractEntity> {

    @Insert
    public abstract void insert(final T params);

    @Update
    public abstract void update(final T param);

    @Delete
    public abstract void delete(final T param);

}
