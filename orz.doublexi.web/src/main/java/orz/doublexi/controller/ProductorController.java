package orz.doublexi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import orz.doublexi.domain.Product;
import orz.doublexi.service.IProductService;


@Controller
@RequestMapping("/product")
public class ProductorController {
	@Autowired
	private IProductService productService;
	@RequestMapping("findAll.do")
public ModelAndView findAll() throws Exception {
		System.out.println("成功进入");
	ModelAndView  mv=new ModelAndView();
	List<Product> ps = productService.findAll();

	mv.addObject("list",ps);
	mv.setViewName("list");
	
	return mv;
}
}
