package sec;

public class Controller {
	 private Student model;
	   private View view;
	   
	   public Controller(Student model, View view){
		      this.model = model;
		      this.view = view;
		   }	 
	   
	   public void setStudentID(String ID){
		      model.setID(ID);    
		   }	   
	   public void setStudentName(String name){
		      model.setName(name);    
		   }	   	   
	   public void setStudenMArk(String Mark){
		      model.setMark(Mark);    
		   }
	   
	   public String getStudentID(){
		      return model.getID();    
		   }
	   public String getStudentName(){
		      return model.getName();    
		   }
	   public String getStudentMark(){
		      return model.getMark();    
		   }
	 
}
