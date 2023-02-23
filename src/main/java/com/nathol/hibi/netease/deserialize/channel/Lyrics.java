package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.LyricBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

public record Lyrics(
        boolean sgc,
        boolean sfy,
        boolean qfy,
        LyricBean lrc,
        LyricBean klyric,
        LyricBean tlyric,
        int code
) {
    public static Lyrics getInstance(long id){
        String request = Netease.lyric(id).request();
        return Deserialize.deserialize(request, Lyrics.class);
    }
}
