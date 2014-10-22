package com.sdl.webapp.common.api.model.entity;

import java.util.List;

public class LinkList<T> extends AbstractEntity {

    private String headline;

    private List<T> links;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public List<T> getLinks() {
        return links;
    }

    public void setLinks(List<T> links) {
        this.links = links;
    }
}
