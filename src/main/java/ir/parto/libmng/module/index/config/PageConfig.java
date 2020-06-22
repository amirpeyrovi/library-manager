package ir.parto.libmng.module.index.config;

import org.springframework.stereotype.Controller;

@Controller
public class PageConfig {
    private String pageTitle;
    private String pageName;

    public PageConfig() {
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public PageConfig setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
        return this;
    }

    public String getPageName() {
        return pageName;
    }

    public PageConfig setPageName(String pageName) {
        this.pageName = pageName;
        return this;
    }
}
