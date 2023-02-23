package com.nathol.hibi.netease.deserialize.entity;

public record UserPlayListBean(
        UserProfileBean creator,
        long userId,
        long coverImgId,
        long trackUpdateTime,
        int trackCount,
        long updateTime,
        String coverImgUrl,
        String name,
        long id
) {
}
