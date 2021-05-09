package Entitles;

public class Campaign {
	String name;
	String numberOfCampaign;
	double awardOfCampaign;
	double percent;
	String dueDate;
	String startDate;
	
	public Campaign(String name, String numberOfCampaign,  String dueDate, String startDate,double percent) {
		
		this.name = name;
		this.numberOfCampaign = numberOfCampaign;
		
		this.dueDate = dueDate;
		this.startDate = startDate;
		this.percent=percent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberOfCampaign() {
		return numberOfCampaign;
	}
	public void setNumberOfCampaign(String numberOfCampaign) {
		this.numberOfCampaign = numberOfCampaign;
	}
	public double getAwardOfCampaign(double price) {
		return price-(price*percent/100);
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
}
