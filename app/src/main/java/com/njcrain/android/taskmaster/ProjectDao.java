package com.njcrain.android.taskmaster;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ProjectDao {
    @Query("SELECT * FROM project ORDER BY id DESC")
    List<Project> getAll();

    @Insert
    long add(Project p);
}
