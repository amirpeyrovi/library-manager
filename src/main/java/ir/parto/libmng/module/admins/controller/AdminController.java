package ir.parto.libmng.module.admins.controller;

import ir.parto.libmng.module.index.config.PageConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/")
public class AdminController {
    private PageConfig pageConfig;

    public AdminController(PageConfig pageConfig) {
        this.pageConfig = pageConfig;
    }

    @RequestMapping("")
    public String listPage(Model model){
        pageConfig.setPageTitle("کاربران").setPageName("admins");
        model.addAttribute("pageConfig", pageConfig);
        return "adminList";
    }
}
