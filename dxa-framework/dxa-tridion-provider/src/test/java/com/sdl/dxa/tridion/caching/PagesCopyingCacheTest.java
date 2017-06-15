package com.sdl.dxa.tridion.caching;

import com.sdl.webapp.common.api.model.PageModel;
import org.junit.Test;

import javax.cache.Cache;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PagesCopyingCacheTest {

    @Test
    public void shouldUseSimplePagesCache_ToGetCache() {
        //given 
        PagesCache pagesCache = mock(PagesCache.class);
        //noinspection unchecked
        Cache<String, PageModel> cache = mock(Cache.class);
        when(pagesCache.getCache()).thenReturn(cache);

        //when
        Cache<String, PageModel> actual = new PagesCopyingCache(pagesCache).getCache();

        //then
        assertSame(cache, actual);
    }
}