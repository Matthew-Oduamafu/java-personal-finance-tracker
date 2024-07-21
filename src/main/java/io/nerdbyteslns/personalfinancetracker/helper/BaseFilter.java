package io.nerdbyteslns.personalfinancetracker.helper;

public class BaseFilter {
    private int page;
    private int pageSize;

    public BaseFilter() {
        this.page = 1;
        this.pageSize = 10;
    }

    public BaseFilter(int page, int pageSize) {
        this.page = Math.max(page, 1);
        this.pageSize = Math.max(pageSize, 10);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = Math.max(page, 1);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = Math.max(pageSize, 10);
    }
}
