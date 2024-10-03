package com.floristeria.floristeria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.floristeria.floristeria.Models.flor;
import com.floristeria.floristeria.Service.florServ;


@RequestMapping(value = "/flores")
@Controller
public class florController {
    @Autowired

    private florServ fp;

    // Contructor

    public florController(florServ fp) {
        this.fp = fp;
    }

    // lista completa

    @GetMapping("/listar")
    public String getflores(Model model) {

        List<flor> flores = fp.findAll();
        model.addAttribute("flores", flores);
        return "flores";
    }

    // vista y metodos post

    @GetMapping("/registrar")
    public String registrarflores(flor f) {
        
        return "registrar_C";
    }

    @PostMapping("/save")
    public String save(flor f) {

        fp.save(f);
        return "redirect:/";
    }

    // Actualizar

    @GetMapping("/modificar/{id}")
    public String FormEdi(flor f,Model model) {
        f = fp.obtener(f);
        model.addAttribute("flor", f);
        
        return "registrar_C";

    }

    @GetMapping("/delete/{id}")
    public String delete(flor f) {
        fp.delete(f);
        return "redirect:/";
    }
    

    

}