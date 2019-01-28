package com.njcrain.android.taskmaster;

import java.net.PortUnreachableException;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Project {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;

    public Project() {}

    public Project(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project " + this.id + ": " + this.name;
    }
}
