package com.nathol.hibi.netease.deserialize.entity;

public record AlbumBean(
        long pic,
        Artist artist,
        String picUrl,
        String name,
        long id
) {
    public record Artist(
            long img1v1Id,
            long picId,
            int musicSize,
            int albumSize,
            String picUrl,
            String img1v1Url,
            String name,
            long id
    ) {}
}
