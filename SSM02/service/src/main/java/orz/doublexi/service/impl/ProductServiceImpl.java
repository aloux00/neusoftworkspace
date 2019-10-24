package orz.doublexi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import orz.doublexi.dao.IProductDao;
import orz.doublexi.domain.Product;
import orz.doublexi.service.IProductService;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
	private IProductDao product;
	
	@Override
	public List<Product> findAll() throws Exception {
		
		return product.findAll();
	}

}
