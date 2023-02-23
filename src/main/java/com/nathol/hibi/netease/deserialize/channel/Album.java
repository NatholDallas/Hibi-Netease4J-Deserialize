package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.AlbumBean;
import com.nathol.hibi.netease.deserialize.entity.SongBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

import java.util.List;

@SuppressWarnings("unused")
public record Album(
        boolean resourceState,
        List<SongBean> songs,
        int code,
        AlbumBean album
) {
    public static Album getInstance(long id) {
        String request = Netease.album(id).request();
        return Deserialize.deserialize(request, Album.class);
    }
}
