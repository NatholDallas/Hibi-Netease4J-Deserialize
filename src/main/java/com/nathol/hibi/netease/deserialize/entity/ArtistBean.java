package com.nathol.hibi.netease.deserialize.entity;

public record ArtistBean(
        long img1v1Id,
        long picId,
        String brieDesc,
        int musicSize,
        int albumSize,
        String picUrl,
        String img1v1Url,
        String name,
        long id,
        long publishTime,
        int mvSize
) {}
