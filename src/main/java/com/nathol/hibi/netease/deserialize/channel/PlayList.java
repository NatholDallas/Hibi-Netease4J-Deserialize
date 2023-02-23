package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.PlayListBean;
import com.nathol.hibi.netease.deserialize.entity.PrivilegeBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

import java.util.List;

public record PlayList(
        int code,
        Object relatedVideos,
        PlayListBean playlist,
        Object urls,
        List<PrivilegeBean> privileges,
        Object sharedPrivilege,
        Object resEntrance,
        Object fromUsers,
        int fromUserCounts,
        Object songFromUsers
) {
    public static PlayList getInstance(long id){
        String request = Netease.playlist(id).request();
        return Deserialize.deserialize(request, PlayList.class);
    }
}
