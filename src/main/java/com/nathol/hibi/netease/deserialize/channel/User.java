package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.UserProfileBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

import java.util.List;

public record User(
        int level,
        int listenSons,
        UserPoint userPoint,
        boolean mobileSign,
        boolean pcSign,
        UserProfileBean profile,
        boolean peopleCanSeeMyPlayRecord,
        List<Binding> bindings,
        boolean adValid,
        int code,
        boolean newUser,
        boolean recallUser,
        long createTime,
        int createDats
) {
    public static User getInstance(long id){
        String request = Netease.user(id).request();
        return Deserialize.deserialize(request, User.class);
    }
    public record UserPoint(
            long userId,
            int balance,
            long updateTime,
            int version,
            int status,
            int blockBalance
    ){}
    public record Binding(
            String url,
            long userId,
            boolean expired,
            long expiresIn,
            long refreshTime,
            long bindingTime,
            long id,
            int type
    ){}
}
