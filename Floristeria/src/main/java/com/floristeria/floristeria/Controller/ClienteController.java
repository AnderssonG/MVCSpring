package com.floristeria.floristeria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.floristeria.floristeria.Models.cliente;
import com.floristeria.floristeria.Service.clienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@RequestMapping(value ="/cliente")


public class ClienteController {
    @Autowired
    private clienteService cliente_s;

    

    public ClienteController(clienteService cliente_s) {
        this.cliente_s = cliente_s;
    }

    @GetMapping("/listar")
    public String listarclientes(Model model){
        List<cliente> clientes = cliente_s.findAll();
        
        model.addAttribute("clientes",clientes);
        return "cliente";
    }

    


    

}
