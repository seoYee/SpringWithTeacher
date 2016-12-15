package test02_transaction;

import java.util.Date;
import java.util.Random;

public class ProductService {
	private int saleQuantity=1;
	private String buyer="Leelee";
	private Date saleDate = new Date();
	private int productNum = 3;
	
	private ProductDao dao = new ProductDao();
	
	public void saleProduct(){
		try {
		dao.startTransaction();
		dao.updateProductQuantity(productNum, saleQuantity);
		if(new Random().nextBoolean()){
				throw new Exception("에러 발생함");
		}
		dao.insertSaleRecord(productNum, saleDate, buyer, saleQuantity);
		dao.commitTransaction();
		System.out.println("상품판매 완료");
		}catch (Exception e) {
			dao.rollbackTransaction();
			System.out.println("판매취소됨");
			e.printStackTrace();
		}
		
	}
}
