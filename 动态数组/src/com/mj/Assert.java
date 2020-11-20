package com.mj;

public class Assert {
	public static void  test(boolean val) {
		if (!val) {
				throw new IllegalArgumentException("测试失败");
		}
		
	}

}
