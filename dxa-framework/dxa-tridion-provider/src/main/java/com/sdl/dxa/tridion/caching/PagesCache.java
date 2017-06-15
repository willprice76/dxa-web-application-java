package com.sdl.dxa.tridion.caching;

import com.sdl.webapp.common.api.model.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.cache.Cache;
import javax.cache.CacheManager;

@Component
public class PagesCache implements SimpleCacheWrapper<String, PageModel> {

    private Cache<String, PageModel> pages;

    @SuppressWarnings("SpringAutowiredFieldsWarningInspection")
    @Autowired(required = false)
    private CacheManager cacheManager;

    @PostConstruct
    public void init() {
        pages = cacheManager == null ? null : cacheManager.getCache("pages");
    }

    @Override
    public Cache<String, PageModel> getCache() {
        return pages;
    }
}
