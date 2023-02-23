package com.nathol.hibi.netease.deserialize;

import com.nathol.hibi.netease.deserialize.channel.*;
import com.nathol.hibi.netease.deserialize.vo.Br;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("all")
public class Core {
    public static Album album(long id){
        return Album.getInstance(id);
    }
    public static Artist artist(long id){
        return Artist.getInstance(id);
    }
    public static Comments comments(long id, @Nullable Integer limit, @Nullable Integer offset){
        return Comments.getInstance(id, limit, offset);
    }
    public static Detail detail(long id){
        return Detail.getInstance(id);
    }
    public static Djradio djradio(long id){
        return Djradio.getInstance(id);
    }
    public static Lyrics lyrics(long id){
        return Lyrics.getInstance(id);
    }
    public static Mv mv(long id){
        return Mv.getInstance(id);
    }
    public static PlayList playList(long id){
        return PlayList.getInstance(id);
    }
    public static Song song(long id, @Nullable Br br){
        return Song.getInstance(id, br);
    }
    public static User user(long id){
        return User.getInstance(id);
    }
    public static UserPlaylist userPlaylist(long id, @Nullable Integer limit, @Nullable Integer offset){
        return UserPlaylist.getInstance(id, limit, offset);
    }
}
