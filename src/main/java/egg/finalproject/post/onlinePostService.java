 package egg.finalproject.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egg.finalproject.product.ProductDTO;

@Service
public class onlinePostService {
	@Autowired
	private onlinePostDAO dao;
	
	public List<String> getParentCategory() throws Exception{
		return dao.getParentCategory();
	}
	
	public List<String> getChildCategory(String bigCategory) throws Exception{
		System.out.println("getChildCategory service 진입");
		return dao.getChildCategory(bigCategory);
	}
	
	public List<ProductDTO> searchProduct(String value) throws Exception{
		System.out.println("sevice 진입"+value);
		return dao.searchProduct(value);
	}
}
