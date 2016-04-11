package br.com.letsgoti.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.letsgoti.model.Costumer;

@Controller
@RequestMapping("/")
public class CostumerController {
	
    @RequestMapping(method = RequestMethod.GET)
    public String newForm(ModelMap model) {
        Costumer customer = new Costumer();
                
        model.addAttribute("costumer", customer);
        return "form";
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public String saveCostumer(@Valid Costumer costumer, BindingResult result, ModelMap model){
 
        if(result.hasErrors()) {
                return "form";
        }
 
        model.addAttribute("costumer", costumer);
        return "success";
    }

}
