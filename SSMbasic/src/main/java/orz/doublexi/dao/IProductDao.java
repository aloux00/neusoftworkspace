package orz.doublexi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import orz.doublexi.domain.Product;

public interface IProductDao {
	@Select("select * from product")
public List<Product> findAll() throws Exception;
}
