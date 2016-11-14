package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Remito;

@Controller
public class ControladorRemito {
	@RequestMapping(value="/generarRemito")
	public ModelAndView vistaRemito(ModelMap model){
		Remito remito = new Remito();
		model.put("Remito", remito);
		return new ModelAndView("generarRemito",model);
	}
}