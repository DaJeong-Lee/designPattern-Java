package factoryMethod.framework;

public abstract class ItemCreator {
	
	//팩토리 메서드 -> 템플릿 메소드를 사용해서 객체 생성하고 return시킴 
	public Item create(){
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
		
	}
	
	//아이템 생성 전 데이터베이스에서 아이템 정보를 요청
	abstract protected void requestItemsInfo();
	
	//데이터베이스에 아이템 정보를 남김
	abstract protected void createItemLog();
	
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
