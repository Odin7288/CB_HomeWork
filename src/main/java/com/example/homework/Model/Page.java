package com.example.homework.Model;

import java.util.Objects;

public class Page {
    protected Integer count;
    protected Integer itemNum = 10;
    protected Integer page = 1;

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 取得起始位置
     *
     * @return
     */
    public int getOffset() {
        if (Objects.isNull(count) || count <= 0 || page <= 0) return 0;
        int maxPageSize = (count / itemNum) + Math.min(count % itemNum, 1);
        if (page > maxPageSize) return (maxPageSize - 1) * itemNum;
        return (page - 1) * itemNum;
    }

}
