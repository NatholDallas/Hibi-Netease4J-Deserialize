package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.UserPlayListBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public record UserPlaylist(
        String version,
        boolean more,
        List<UserPlayListBean> playlist,
        int code
) {
    public static UserPlaylist getInstance(long id, @Nullable Integer limit, @Nullable Integer offset){
        String request = Netease.userPlaylist(id, limit, offset).request();
        return Deserialize.deserialize(request, UserPlaylist.class);
    }
}
