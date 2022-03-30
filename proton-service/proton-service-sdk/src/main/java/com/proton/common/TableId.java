package com.proton.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <h1>主键 ids</h1>
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableId {

    private List<Id> ids;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Id {

        private Long id;
    }
}
