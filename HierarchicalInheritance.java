import java.util.Arrays;
class Google{
    String username;
    String pass;
    String dob;
    String emailID;
    long contact;
    String gender;

    Google(String username,String pass,String dob,String emailID,long contact,String gender){
         this.username=username;
         this.pass=pass;
         this.dob=dob;
         this.contact=contact;
         this.emailID=emailID;
         this.gender=gender;
    }
    public void displayGoogle(){
         System.out.println(" Google details");
         System.out.println("username : "+username+"\npassword : "+pass+"\ndate of birth : "
         +dob+"\ncontact : "+contact+"\nemail ID : "+emailID+"\ngender : "+gender);
    }
}
class GooglePay extends Google{
    String name;
    long accountNum;
    String ifscCode;
    int upiPin;
    long debitCard;

    GooglePay(String name,long accountNum,String ifscCode,int upiPin,long debitCard,
             String username,String pass,String dob,String emailID,long contact,String gender){
    	super(username,pass,dob,emailID,contact,gender);
        this.name=name;
        this.ifscCode=ifscCode;
        this.accountNum=accountNum;
        this.upiPin=upiPin;
        this.debitCard=debitCard;
    }

    public void displayGooglePay(){
        System.out.println("Google Pay details");
         System.out.println("Name : "+name+"\nIFSC Code : "+ifscCode+"\nAccount Number : "
         +accountNum+"\nUPI Pin : "+upiPin+"\ndebit Card details : "+debitCard);
    }
}
class GoogleMap extends Google{
    String currentLoc;
    String [] bookmarks;
    String modeTravel;

    GoogleMap(String currentLoc,String [] bookmarks,String modeTravel,
              String username,String pass,String dob,String emailID,long contact,String gender){
    	 super(username,pass,dob,emailID,contact,gender);
         this.currentLoc=currentLoc;
         this.bookmarks=bookmarks;
         this.modeTravel=modeTravel;
    }

    public void displayGoogleMap(){
         System.out.println("Google Map details");
         System.out.println("current Location: "+currentLoc+"\nbookmarks : "+Arrays.toString(bookmarks)+
         	"\nmode of Travel : "+modeTravel); 
    }
}
class GoogleMeet extends Google{
    String hostName;
    String joiningLink;
    String schedule;
    String meetID;

    GoogleMeet(String hostName,String joiningLink,String schedule,String meetID,
               String username,String pass,String dob,String emailID,long contact,String gender)
    {
    	super(username,pass,dob,emailID,contact,gender);
        this.hostName=hostName;
        this.schedule=schedule;
        this.meetID=meetID;
        this.joiningLink=joiningLink;
    }

    public void displayGoogleMeet(){
         System.out.println("Google Meet details");
         System.out.println("Host Name: "+hostName+"\nschedule : "+schedule+
         	"\nmeet ID : "+meetID+"\njoining Link : "+joiningLink);
    }

}
class GoogleClassRoom extends Google{
    String className;
    String subject;
    String teacherName;
    String classId;
    int countStudent;

    GoogleClassRoom(String className,String subject,String teacherName,String classId,int countStudent,
           String username,String pass,String dob,String emailID,long contact,String gender){
    	       super(username,pass,dob,emailID,contact,gender);
    	       this.className=className;
    	       this.subject=subject;
    	       this.teacherName=teacherName;
    	       this.classId=classId;
    	       this.countStudent=countStudent;
          
    }
    public void displayGoogleClassRoom(){
         System.out.println("Google ClassRoom details");
         System.out.println("class Name: "+className+"\nsubject: "+subject+
         	"\nteacher Name : "+teacherName+"\nclass Id :"+classId+"\nno of students :"+countStudent);
    }
}

class HierarchicalInheritance{
	public static void main(String[] args) {
		 GooglePay obj=new GooglePay("Ramesh kumar",212454543321l,"ABCD1245",1234,154578643512l,
		 	"ramesh","ramesh123","01/01/2000","ramesh@gmail.com",9887458755l,"Male");
		 obj.displayGoogle();
		 System.out.println();
		 obj.displayGooglePay();
		 System.out.println();
  
         GoogleMap obj1=new GoogleMap("JM road deccan pune",(new String[]{"fc road","JM road"}),
                       "Bike","ramesh","ramesh123","01/01/2000","ramesh@gmail.com",9887458755l,"Male");
         obj1.displayGoogle();
         System.out.println();
         obj1.displayGoogleMap();
         System.out.println();

         GoogleMeet obj2=new GoogleMeet("pooja","https.googlemeet.in","10 am - 12 pm","POOJA125","ramesh",
         	"ramesh123","01/01/2000","ramesh@gmail.com",9887458755l,"Male");
         obj2.displayGoogle();
         System.out.println();
         obj2.displayGoogleMeet();
         System.out.println();

         GoogleClassRoom  obj3=new GoogleClassRoom("java@qspiders","JAVA","Shrikant Sir","java124",50,
         	"ramesh","ramesh123","01/01/2000","ramesh@gmail.com",9887458755l,"Male");
         obj3.displayGoogle();
         System.out.println();
         obj3.displayGoogleClassRoom();
         System.out.println();
	}
}