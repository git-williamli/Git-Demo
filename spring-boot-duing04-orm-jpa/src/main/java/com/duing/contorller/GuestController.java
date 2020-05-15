package com.duing.contorller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 业务控制类  返回视图
 */
@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/guest/list")
    public String guestList(Model model){
        List<Guest> guestList = guestService.guestList();
        model.addAttribute("guestList",guestList);
        return "guestlist";
    }
}
