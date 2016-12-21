package ua.controller;

import ua.interfaces.SystemRealization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileSystemController {

    @Autowired

    private SystemRealization service;

    @RequestMapping(value="/", method = RequestMethod.GET)

    public String ViewHome(Model model , @RequestParam(defaultValue = "/") String path) {
       model.addAttribute("datas", service.getListFilesAndFolders(path));
       model.addAttribute( "back", service.backFolder(path));

        return "home";
    }
}
