package com.nathol.hibi.netease.deserialize.entity;

import java.util.List;

public record PrivilegeBean(
        long id,
        int maxbr,
        int playMaxbr,
        int downloadMaxbr,
        String maxBrLevel,
        String playMaxBrLevel,
        String plLevel,
        String dlLevel,
        String flLevel,
        List<ChargeInfoList> chargeInfoList
) {
    public record ChargeInfoList(
            int rate,
            Object chargeUrl,
            Object chargeMessage,
            int chargeType
    ){}
}
