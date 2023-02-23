package com.nathol.hibi.netease.deserialize.entity;

import java.util.List;

public record SongBean(
        List<Artist> ar,
        Album al,
        Br h,
        Br l,
        Br m,
        String name,
        long id
) {
    public record Artist(
            long id,
            String name
    ) {}

    public record Album(
            long id,
            String name,
            String picUrl,
            String pic
    ) {}

    public record Br(
            int br,
            int size
    ) {}
}
