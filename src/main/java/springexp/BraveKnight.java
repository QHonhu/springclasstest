package springexp;

public class BraveKnight implements Knight {
	private Quest quest;
	
	public BraveKnight(Quest quest){
		this.quest=quest;
	}
	public void embarkOnQuest1(){
		quest.embark();
	}

}
