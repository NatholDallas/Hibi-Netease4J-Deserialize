package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.ArtistBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;
import com.nathol.hibi.netease.deserialize.entity.SongBean;

import java.util.List;

public record Artist(
        ArtistBean artist,
        List<SongBean> hotSongs,
        boolean more,
        int code
) {
    public static Artist getInstance(long id){
        String request = Netease.artist(id).request();
        return Deserialize.deserialize(request, Artist.class);
    }
}
