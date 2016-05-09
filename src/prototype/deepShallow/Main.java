package prototype.deepShallow;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("Navi");
		navi.setAge(new Age(2012, 3));
		
		// 주소값을 복사함 -> 낮은 수준 복사 
		// 아예 새로 복사 -> 높은 수준 복사
		Cat yo = navi.copy();
		yo.setName("Yo");
		yo.getAge().setYear(2014);
		yo.getAge().setValue(2);
		
		
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		
		
		System.out.println(yo.getName());
		System.out.println(yo.getAge().getYear());
		System.out.println(yo.getAge().getValue());
	}
}
