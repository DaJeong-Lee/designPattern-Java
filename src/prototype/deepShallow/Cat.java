package prototype.deepShallow;

public class Cat implements Cloneable{
	private String name;
	private Age age;
	
	public Cat copy() throws CloneNotSupportedException{
		Cat ret = (Cat) this.clone();
		
		//Age에 대해 깊은 복사를 하기 위해 사용
		ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
		
		return ret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}
}
