package com.masachu.android.journalapp.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "journal")
public class JournalEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private String journalTitle;
    @ColumnInfo(name = "updated_at")
    private Date updatedAt;

    @Ignore
    public JournalEntry(String description, String journalTitle, Date updatedAt) {
        this.description = description;
        this.journalTitle = journalTitle;
        this.updatedAt = updatedAt;
    }

    public JournalEntry(int id, String description, String journalTitle, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.journalTitle = journalTitle;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
