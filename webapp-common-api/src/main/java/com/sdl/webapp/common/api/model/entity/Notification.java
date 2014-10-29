package com.sdl.webapp.common.api.model.entity;

import com.sdl.webapp.common.api.mapping.annotations.SemanticEntity;

import static com.sdl.webapp.common.api.mapping.config.SemanticVocabulary.SDL_CORE;

@SemanticEntity(entityName = "NotificationBar", vocabulary = SDL_CORE, prefix = "nb")
public class Notification extends AbstractEntity {

    private String headline;

    private String text;

    private String continue_;

    private EmbeddedLink link;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContinue() {
        return continue_;
    }

    public void setContinue(String continue_) {
        this.continue_ = continue_;
    }

    public EmbeddedLink getLink() {
        return link;
    }

    public void setLink(EmbeddedLink link) {
        this.link = link;
    }
}
