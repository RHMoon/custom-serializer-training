package com.devland.defaultSerializer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Folder {
    private Long id;
    private String name;
    private String owner;
    private Date created;
    private Date modified;
    private Date lastAccess;

    @JsonIgnore
    private List<File> files = new ArrayList<>();

    public Folder() {
        
    }

    public Folder(Long id, String name, String owner, Date created, Date modified, Date lastAccess, List<File> files) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.created = created;
        this.modified = modified;
        this.lastAccess = lastAccess;
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    
}
