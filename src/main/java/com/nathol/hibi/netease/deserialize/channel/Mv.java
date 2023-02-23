package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

import java.util.List;

public record Mv(
        String loadingPic,
        String bufferPic,
        String loadingPicFS,
        String bufferPicFS,
        boolean subed,
        Mp mp,
        Data data,
        int code
) {
    public static Mv getInstance(long id){
        String request = Netease.mv(id).request();
        return Deserialize.deserialize(request, Mv.class);
    }
    public record Mp(
            int id,
            int fee,
            int mvFee,
            int payed,
            int pl,
            int dl,
            int cp,
            int sid,
            int st,
            boolean normal,
            boolean unauthorized,
            Object msg
    ){}
    public record Data(
            int id,
            String name,
            int artistId,
            String artistName,
            String cover,
            long coverId,
            int playCount,
            int subCount,
            int shareCount,
            int commentCount,
            int duration,
            String publishTime,
            List<Artist> artists
    ) {
        public record Artist(
                int id,
                String name
        ){}
    }
}
