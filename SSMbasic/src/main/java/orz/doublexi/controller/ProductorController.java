package orz.doublexi.controller;

import java.util.List;
import java.util.function.Consumer;

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
ps.forEach(new Consumer<Product>() {

	@Override
	public void accept(Product t) {
		System.out.println(t.toString());
	}
});
	mv.addObject("list",ps);
	mv.setViewName("list");
	
	return mv;
}
}
