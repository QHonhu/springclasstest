package springexp;

public class BraveKnightTest {
	
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest=mock(Quest.class);
		BraveKnightTest knight =new BraveKnightTest();
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
		
	}

	

	private void embarkOnQuest() {
		// TODO Auto-generated method stub
		
	}



	private Quest verify(Quest mockQuest, Object times) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object times(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private Quest mock(Class<Quest> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
