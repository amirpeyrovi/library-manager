package ir.parto.libmng.module.index.controller;

import ir.parto.libmng.module.index.config.PageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {
    private PageConfig pageConfig;

    @Autowired
    public IndexController(PageConfig pageConfig) {
        this.pageConfig = pageConfig;
    }

    @RequestMapping("")
    public String index(Model model){
        pageConfig.setPageTitle("داشبورد").setPageName("dashboard");
        model.addAttribute("pageConfig", pageConfig);
        return "index";
    }
}

