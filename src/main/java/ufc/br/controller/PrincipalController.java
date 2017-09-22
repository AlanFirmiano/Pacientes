package ufc.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
public class PrincipalController {
	@RequestMapping(path="/")
	public String index(){
		return "index";
	}
}
