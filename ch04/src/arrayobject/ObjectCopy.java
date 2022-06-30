package arrayobject;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼공 자바", "신용권");
		array1[1] = new Book("반응형 웹", "조혜경");
		array1[2] = new Book("스프링부트", "채규태");
		
		//array1을 array2에 복사함
		/*for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}*/
		
		//arraycopy() 사용
		System.arraycopy(array1, 0, array2, 0, 3);
		
		//출력
		System.out.println("=== array2 출력 ===");
		for(int i=0; i<array2.length; i++) {
			array2[i].showInfo();
		}
	}

}
