package com.proton.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>用户账户余额信息</h1>
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BalanceInfo {

    private Long userId;

    private Long balance;

    private Long freeze;
}
