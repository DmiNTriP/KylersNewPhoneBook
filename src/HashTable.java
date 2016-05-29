/**
 * Created by Kyler on 4/20/2016.
 */
public class HashTable {

    MyLinkedList[] linkListArray; // this will be a linked list array
    MyLinkedList link;

    int arraySize = 13;
    Employee newEmployee;

    public HashTable() {// the size here will determine how big we want the array to be and in this case it will be 13
        //creating the Array for the linkedlist
        linkListArray = new MyLinkedList[arraySize];
       newEmployee = null;
/*
     addInformation(newEmployee);
*/
    }
/*
    public int nameHashingFunction(String fullNameHash) {
        int hKeyValue = 0;

        //K has a unicde character value of 75. 75 -1 will start the letter count at 1

        for (int i = 0; i < fullNameHash.length(); i++) {
            int charCodeK = fullNameHash.charAt(i) - 47;
            //This is the formula for the hashcode method ion Employee
//            int hashFormula = fullNameHash.hashCode();
            int temphashKeyValue = hKeyValue;

            //calculate hash key using the 26 letters in alphabet + a blank
            hKeyValue = (hKeyValue * 67 + charCodeK) % arraySize;

            System.out.println("The Hash Key Value is: " + temphashKeyValue +
                    " * 47 + Character code (unicode) " + "%" +
                    " arraySize " + arraySize + " = " + hKeyValue);
        }
        return hKeyValue;
    }
*/
    //Use Java's hashCode method
    public int nameHashingFunction(String fullNameHash){
    	
    	int hKeyValue = Math.abs(fullNameHash.hashCode());
    	return hKeyValue;
    }
    
    
    public void insertEmployee(Employee newEmployee) {
        String fullNameToHash = newEmployee.fullName();
        /*Create hashKey - done
        / Once we have hash key, we use % to find the bucket.
        */
        
        int hashKey = newEmployee.nameToHash();
        
        int hashBucket = hashKey % 13;
        
        /* Now, we want to take the hashBuket and insert into that linked list.*/
        //  int hashKey = nameHashingFunction(fullNameToHash);
      /* for (int i = 0; i < arraySize; i++) {
            linkListArray[i].insert(newEmployee);
        }
       */
        linkListArray[hashBucket].insert(newEmployee);
    }

    public boolean find(String nameToFind) {
        int hashKey = nameHashingFunction(nameToFind);
        int bucket = hashKey % 13;
        boolean found = true;
        if(found) {
            Employee employee= linkListArray[bucket].search(hashKey, nameToFind);
            System.out.println(nameToFind + "was found");

            return found;
        }
        else{
            System.out.print("employee not found");
        }
        return  false;
   }

    public void addInformation(Employee anEmployee) {
        int hashKey = anEmployee.nameToHash();
        anEmployee.setKey(hashKey);
        Employee current = null;
        current = anEmployee;

        if (anEmployee == current && current.getKey() == hashKey) {
            String firstName = anEmployee.getFirstName();
            String lastName = anEmployee.getLastName();
            String eMail = anEmployee.getEmail();
            String phoneNum = anEmployee.getPhoneNum();
            anEmployee = new Employee(firstName, lastName, eMail, phoneNum);
            
            linkListArray[anEmployee.getHashBucketKey()] = link;
            System.out.println(anEmployee + " has been added");
        }
    }

        public boolean isEmpty() {
        return false;
        }

    public MyLinkedList remove() {
        return null;
    }
}




/*    public void displayTheEmployees() {
//get hashBucket
//If the bucket is empty/null then the employee cannot be listed.
        if(! isEmpty()){

            link = linkListArray[link.hashCode();
    	



            System.out.println("theArray Index " + i);


        }*/

