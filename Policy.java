public class Policy
{
   //instance fields
   private int policyNumber, age;
   private String providerName, firstName, lastName;
   private String smokingStatus;
   private double height, weight;
   
   //no-arg constructor
   public Policy()
   {
     policyNumber = 0;
     providerName = "";
     firstName = "";
     lastName = "";
     age = 0;
     smokingStatus = "";
     height = 0.0;
     weight = 0.0;
   }
   
    /**
      Constructor that accepts arguments for each of the fields
      @param policyNum The policy number
      @param provName The provider's name
      @param lastName The last name
      @param firstName The first Name
      @param height The height of the person
      @param weight The weight of the person
     */
     
     public Policy(int policyNum, int policyAge, String provName, String lName, String fName, String smokeStatus, double policyHeight, double policyWeight)
   {
      policyNumber = policyNum;
      providerName = provName; 
      age = policyAge;
      lastName = lName;
      firstName = fName;
      smokingStatus = smokeStatus;
      weight = policyWeight;
      height = policyHeight;   
   }

   //Setters 
   
   /*
      This method assigns a value to the policyNumber field
   */   
   public void setPolicyNumber(int policyNum)
   {
      policyNumber = policyNum;
   }
   
    /*
      This method assigns a value to the age field
   */   
   public void setAge(int policyAge)
   {
      age = policyAge;
   }

   /*
      This method assigns a value to the providerName field
   */   
   public void setProviderName(String provName)
   {
      providerName = provName;
   }

   /*
      This method assigns a string value to the lastName field
   */   
   public void setLastName(String lName)
   {
      lastName = lName;
   }

   /*
      This method assigns a string value to the firstName field
   */   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }

   /*
      This method assigns a value to the weight field
   */   
   public void setWeight(double policyWeight)
   {
      weight = policyWeight;
   }
   
    /*
      This method assigns a value to the height field
   */   
   public void setHeight(double policyHeight)
   {
      height = policyHeight;
   }
   
    /*
      This method assigns a value to the smokingStatus field
   */   
   public void setSmokingStatus(String smokeStatus)
   {
      smokingStatus = smokeStatus;
   }
 
 
 
   //Getters
  
   /**
      This method returns the value of the policyNumber field
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
    /**
      This method returns the value of the age field
   */
   public int getAge()
   {
      return age;
   }

   /**
      This method returns the value of the providerName field
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      This method returns the value of the firstName field
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      This method returns the value of the lastName field
   */
   public String getLastName()
   {
      return lastName;
   }
   
    /**
      This method returns the value of the weight field
    */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      This method returns the value of the height field
    */
   public double getHeight()
   {
      return height;
   }

    /**
      This method returns the value of the smoking status field
    */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
      this method calculates the BMI of the user
   */  
   public double getCalculateBMI()
   {
      return (weight * 703) / (height * height);
   }
   
   public double getCalculatePolicyPrice(int age, String smokingStatus, double BMI)
   {
     double basePrice = 600.00;
     double price = 0.0;
     
     price += basePrice;
     if(age > 50)
     {
       price += 75.00; 
     }
     if(smokingStatus.equalsIgnoreCase("smoker"))
     {
       price += 100.00;
     }
     if(BMI > 35)
     {
       price += (BMI - 35) * 20;
     }
     return price;
      
   }
          
} 