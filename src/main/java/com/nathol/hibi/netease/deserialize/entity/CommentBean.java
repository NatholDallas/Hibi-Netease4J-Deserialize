package com.nathol.hibi.netease.deserialize.entity;

public record CommentBean(
        User user,
        long commentId,
        String content,
        long time,
        int likedCount
) {
    public record User(
            long userId,
            String avatarUrl,
            String nickname
    ){}
}
