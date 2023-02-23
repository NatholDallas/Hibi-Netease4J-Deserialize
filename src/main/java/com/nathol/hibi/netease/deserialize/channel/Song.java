package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.util.Deserialize;
import com.nathol.hibi.netease.deserialize.vo.Br;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public record Song(
        List<Data> data,
        int code
) {
    public static Song getInstance(long id, @Nullable Br br){
        String request = Netease.song(id, br).request();
        return Deserialize.deserialize(request, Song.class);
    }
    public record Data(
            long id,
            String url,
            int br,
            int size,
            String md5,
            int code,
            int expi,
            String type,
            String level,
            long time
    ){}
}
