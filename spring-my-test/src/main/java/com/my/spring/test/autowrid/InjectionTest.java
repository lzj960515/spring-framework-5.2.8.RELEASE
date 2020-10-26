package com.my.spring.test.autowrid;

/**
 * @author Zijian Liao
 * @since
 */
public class InjectionTest {

//	public static final InjectionTest injectionTest1 = new InjectionTest()

	public static final InjectionTest injectionTest = new InjectionTest(){
		@Override
		public String toString() {
			return "123";
		}
	};
	public DependBean dependBean = new DependBean();

	@Override
	public String toString() {
		return "InjectionTest{" +
				"dependBean=" + injectionTest +
				'}';
	}
}
