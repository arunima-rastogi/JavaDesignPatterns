package ProxyDesignPattern;

public class RealInternetAccess implements OfficeInternetAccess {
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void checkInternetAccess() {
		System.out.println("Internet Access for " + employeeName);
	}
}