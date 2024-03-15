package testResources;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void example() {
		collector.addError(new Throwable("Có lỗi ở dòng đầu tiên"));
		collector.addError(new Throwable("Có lỗi ở dòng 2 "));
		System.out.println("Hello");
//		try {
//			Assert.assertTrue("A" == "B");
//		} catch (Throwable t) {
//			collector.addError(t);
//		}
//		System.out.println("World!!!!");
		// Một số testcase khác
		try {
			Assert.assertEquals("A", "B"); // Sử dụng assertEquals thay vì assertTrue
		} catch (Throwable t) {
			collector.addError(t);
		}

		// Kiểm tra một điều kiện sai để thêm lỗi vào ErrorCollector
		if (1 != 2) {
			collector.addError(new Throwable("1 không bằng 2"));
		}

		// Kiểm tra một điều kiện null để thêm lỗi vào ErrorCollector
		Object obj = null;
		if (obj == null) {
			collector.addError(new Throwable("Đối tượng là null"));
		}

		// Kiểm tra một ngoại lệ để thêm lỗi vào ErrorCollector
		try {
			throw new NullPointerException("NullPointerException tùy chỉnh");
		} catch (NullPointerException e) {
			collector.addError(e);
		}

		// Xuất ra một thông điệp sau khi kiểm thử
		System.out.println("Kiểm thử hoàn thành!");
	}

}