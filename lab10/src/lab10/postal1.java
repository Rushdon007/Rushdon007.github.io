package lab10;

public class postal1 {
		
			private String firstname, lastname, zipcode;
			 
			public postal1(String firstname, String lastname, String zipcode){
				this.firstname=firstname;
				this.lastname=lastname;
				this.zipcode=zipcode;
			}
			
			public String toString(){
				return this.firstname.concat(" ").concat(this.lastname).concat("\t").concat(this.zipcode);
		

	}

}
