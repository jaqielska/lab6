/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Basia
 */
@Controller
public class CalculatorController {
    
    @RequestMapping("/calculator")
    public String calculator(Model model, Integer x, Integer y) {
        model.addAttribute("x", x);   
        model.addAttribute("y", y);
        model.addAttribute("operacja", "+");
        model.addAttribute("wynik",x+y);
        return "calculator";
    }
    
    @RequestMapping("/calculatordwa")
    public String calculator(Model model, CalculatorForm form) {
        switch (form.operacja)
        {
            case "+":
                    form.wynik=form.x+form.y;
                    break;
            case "-":
                    form.wynik=form.x-form.y;
                    break;
            case "*":
                    form.wynik=form.x*form.y;
                    break;
            case "/":
                    form.wynik=form.x/form.y;
                    break;
            
        }
        model.addAttribute("form",form);
        return "calculatordwa";
    }
    
}
