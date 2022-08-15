package contactapp.beans;

public class CategoryBean {
	
	private int categoryid;
	private String categoryname;
	
	
	  @Override public String toString() { 
		  return categoryname; 
		  }
	 
	
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	public CategoryBean() {
		super();
	}
	public CategoryBean(int categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	
	
	

}
