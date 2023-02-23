package com.nathol.hibi.netease.deserialize.entity;

public record UserProfileBean(
        int province,
        String avatarUrl,
        int gender,
        int city,
        long birthday,
        long userId,
        String nickname,
        long avatarImgId,
        long backgroundImgId,
        String backgroundUrl
) {}
