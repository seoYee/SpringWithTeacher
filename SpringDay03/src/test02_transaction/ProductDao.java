package test02_transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ProductDao {
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/spring";
	public static final String DB_ID = "root";
	public static final String DB_PW = "sds902";
	
	private Connection con;
	
	//생성자에서 드라이버 로딩한다.
	public ProductDao(){
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 오류!!");
		}
	}
	
	//커넥션 생성, 트랜잭션 시작 기능
	public void startTransaction(){
		try {
			con = DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
			con.setAutoCommit(false); //기본값이 true
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류!!");
			e.printStackTrace();
		}
	}
	
	public void commitTransaction(){
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("커밋 오류");
			e.printStackTrace();
		}
	}
	
	public void rollbackTransaction(){
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("롤백 오류");
			e.printStackTrace();
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("커넥션 종료 오류");
			e.printStackTrace();
		}
	}

	public int updateProductQuantity(int productNum, int quantity){
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "update product set quantity=quantity-? where product_num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, quantity);
			pstmt.setInt(2, productNum);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update Product Quantity 에러");
			e.printStackTrace();
		} finally { 
			try {
				pstmt.close();
			} catch (SQLException e) {}
		}
		return result;
	}
	
	public int insertSaleRecord(int productNum, Date saleDate, String buyer, int saleQuantity){
		PreparedStatement pstmt = null;
		int result = 0;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(saleDate);
		String sql = "insert into sale (product_num, sale_date, buyer, sale_count) values (?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, productNum);
			pstmt.setString(2, currentDate);
			pstmt.setString(3, buyer);
			pstmt.setInt(4, saleQuantity);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insertSaleRecord 실패");
		}finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
}

