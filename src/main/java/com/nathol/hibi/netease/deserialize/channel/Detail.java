package com.nathol.hibi.netease.deserialize.channel;

import com.nathol.hibi.netease.deserialize.Netease;
import com.nathol.hibi.netease.deserialize.entity.PrivilegeBean;
import com.nathol.hibi.netease.deserialize.entity.SongBean;
import com.nathol.hibi.netease.deserialize.util.Deserialize;

import java.util.List;

public record Detail(
        List<SongBean> songs,
        List<PrivilegeBean> privileges,
        int code
) {
    public static Detail getInstance(long id){
        String request = Netease.detail(id).request();
        return Deserialize.deserialize(request, Detail.class);
    }
}
