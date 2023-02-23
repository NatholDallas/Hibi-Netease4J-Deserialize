package com.nathol.hibi.netease.deserialize.entity;

public record PlayListBean(
        long id,
        String name,
        long coverImgId,
        String coverImgUrl,
        long userId,
        long createTime,
        int status,
        long updateTime,
        String description,
        UserProfileBean creator
) {}
