package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.CommentBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public record Comments(
        boolean isMusician,
        int userId,
        List<?> topComments,
        boolean moreHot,
        List<CommentBean> hotComments,
        Object commentBanner,
        int code,
        List<CommentBean> comments,
        int total,
        boolean more
) {
    public static Comments getInstance(long id, @Nullable Integer limit, @Nullable Integer offset){
        String request = Netease.comments(id, limit, offset).request();
        return Deserialize.deserialize(request, Comments.class);
    }
}
