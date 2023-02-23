package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.UserProfileBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

import java.util.List;

public record Djradio(
        int code,
        Object msg,
        DataBean data
) {
    public static Djradio getInstance(long id){
        String request = Netease.djradio(id).request();
        return Deserialize.deserialize(request, Djradio.class);
    }
    public record DataBean(
            int id,
            String name,
            Dj dj,
            long picId,
            String picUrl,
            String desc,
            int subCount,
            int shareCount,
            int likedCount,
            int programCount,
            int commentCount,
            long createTime,
            long categoryId,
            String category,
            long secondCategoryId,
            String secondCategory,
            List<CommentData> commentDatas
    ) {
        public record Dj(
                int province,
                String avatarUrl,
                int gender,
                int city,
                long birthday,
                long userId,
                String nickname,
                String signature,
                long backgroundImgId,
                String backgroundUrl,
                int djStatus
        ){}
        public record CommentData(
                UserProfileBean userProfile,
                String content,
                String programName,
                long programId,
                long commentId
        ){}
    }
}
