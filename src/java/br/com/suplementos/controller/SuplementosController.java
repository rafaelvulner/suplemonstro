/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.suplementos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Rafael Monteiro
 */

@Controller
public class SuplementosController {
    
    @RequestMapping("/whey")
    public String whey(){
    
    
	return "whey";
    }
    
}
