package class_part;

public class Order {
    // 멤버 변수
	String orderNumber;
	String customerId;
	String orderDate;
	String customerName;
	String productNumber;
	String Address;
	
    // 주문의 정보 출력하는 메서드
	public void showOrderInfo() {
        System.out.println("주문 번호 : " + orderNumber);
        System.out.println("주문자 아이디 : " + customerId);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문자 이름 : " + customerName);
        System.out.println("주문 상품 번호 : " + productNumber);
        System.out.println("배송 주소 : " + Address);
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public static void main(String[] args) {
        // Order 클래스 생성
		Order abc123 = new Order();
		abc123.orderNumber = "201803120001";
		abc123.customerId = "abc123";
		abc123.orderDate = "2018-03-12";
		abc123.setCustomerName("홍길순");
		abc123.setProductNumber("PD0345-12");
		abc123.setAddress("서울시 영등포구 여의도동 20번지");
		abc123.showOrderInfo();
	}

}
