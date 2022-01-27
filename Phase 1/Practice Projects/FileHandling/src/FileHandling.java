import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileHandling 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        String option,contain = "y";        
        
        while( contain.equalsIgnoreCase("y") ) 
        {        	
        	   System.out.println("       Student Details\n       ");
        
	        System.out.println("Enter 1 to Add New Student Record ");
	        System.out.println("Enter 2 to View All Student Record ");	
	        System.out.println("Enter 3 to Delete Student Record ");
	        System.out.println("Enter 4 to Search Student Record ");
	        System.out.println("Enter 5 to Update Student Record ");	 
	        
	        System.out.println(" ");
	    
	        System.out.println("Enter your option : ");
	        option = scan.nextLine();
	        
	        if( option.equals("1") ) 
	        {
	        		try 
	        		{
						AddingDetails();
					} catch (IOException e) 
	        		{
						e.printStackTrace();
					}
	        } 
	        else if( option.equals("2") ) 
	        {
	        		try 
	        		{
						ViewAllData();
					} 
	        		catch (IOException e) 
	        		{
						e.printStackTrace();
					}
	        } 
	        else if( option.equals("3") ) 
	        {
	        		try 
	        		{
						DeleteDataByID();
					} 
	        		catch (IOException e) 
	        		{
						e.printStackTrace();
					}
	        }	
	        else if( option.equals("4") ) 
	        {
	        		try 
	        		{
	        			SearchStudenByID();
					} 
	        		catch (IOException e) 
	        		{
						e.printStackTrace();
					}
	        }	
	        else if( option.equals("5") ) 
	        {
	        		try 
	        		{
						updateStudentByID();
					} 
	        		catch (IOException e) 
	        		{
						e.printStackTrace();
					}
	        }	
		        	
	        System.out.println("If you want to add some more information Y/N");
	        contain = scan.nextLine();
	       	
        }

}

  public static void AddingDetails() throws IOException 
  {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("records.txt",true) );
		Scanner scan = new Scanner(System.in);
		
		String ID, name, age, addr;
		
		System.out.print("Enter the Student ID: ");
		ID = scan.nextLine();
		System.out.print("Enter the Student Name: ");
		name = scan.nextLine();
		System.out.print("Enter the Student Age: ");
		age = scan.nextLine();
		System.out.print("Enter the Student Address: ");
		addr = scan.nextLine();    		
		   		
		bw.write("ID = "+ID+", Name = "+name+", Age = "+age+", Address = "+addr);
		bw.flush();
		bw.newLine();
		bw.close();		
	
}
  
  
public static void ViewAllData() throws IOException 
{
    	BufferedReader br = new BufferedReader( new FileReader("records.txt") );
    		
    	String record;
    	while( ( record = br.readLine() ) != null ) 
    	{
    			
    		StringTokenizer st = new StringTokenizer(record,",");
    			
    		System.out.println("ID = "+st.nextToken()+", Name = "+st.nextToken()
    		                    +", Age = "+st.nextToken()+", Address = "+st.nextToken());
	
    	}
    	
    	br.close();    		
    		
    }



public static void DeleteDataByID() throws IOException 
{
    		Scanner scan =  new Scanner(System.in);
    		String ID, record;
    		
    		
    		File tempDB = new File("records_temp.txt");
    		File db = new File("records.txt");
    		
    		
    		BufferedReader br = new BufferedReader( new FileReader( db ) );
    		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
    		
    		
    		System.out.println("\t\t Delete Employee Record\n");
    		
    		System.out.println("Enter the Employee ID: ");
    		ID =  scan.nextLine();
    		
    		
    		while( ( record = br.readLine() ) != null ) 
    		{
    			
    			if( record.contains(ID) ) 
    				continue;
   
    			bw.write(record);
    			bw.flush();
    			bw.newLine();
 
    		}
    		
    		br.close();
    		bw.close();
    		
    		db.delete();
    		
    		tempDB.renameTo(db);

    }


public static void SearchStudenByID() throws IOException {
    		String ID,record;
    		Scanner scan = new Scanner(System.in);
    		
    		BufferedReader br = new BufferedReader( new FileReader("records.txt") );
    		
    		System.out.println("\t\t Search Employee Record\n");
    	
    		
    		System.out.println("Enter the Employee ID: ");
    		ID = scan.nextLine();
    		
    		while( ( record = br.readLine() ) != null ) 
    		{
    			
    			StringTokenizer st = new StringTokenizer(record,",");
    			if( record.contains(ID) ) 
    			{
    				System.out.println("ID = "+st.nextToken()+", Name = "+st.nextToken()
    				            +", Age = "+st.nextToken()+", Address = "+st.nextToken());
    			}
    			
    		}
    		
    		br.close();	
    }


public static void updateStudentByID() throws IOException 
{
    		String newName, newAge, newAddr, record, ID,record2;
    		
    		File db = new File("records.txt");
    		File tempDB = new File("recordstemp.txt");
    		
    		BufferedReader br = new BufferedReader( new FileReader(db) );
    		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
    		    		
    		Scanner scan = new Scanner(System.in);
    		
    		System.out.println("\t\t Update Student Record\n\n");   
			System.out.println("Enter the Student ID: ");
	    		ID = scan.nextLine();	    		
	 	
	    		while( ( record = br.readLine() ) != null ) 
	    		{
	    			
	    			StringTokenizer st = new StringTokenizer(record,",");
	    			if( record.contains(ID) ) 
	    			{
	    				System.out.println("ID = "+st.nextToken()+", Name	= "+st.nextToken()
	    				                   +", Age = "+st.nextToken()+", Address = "+st.nextToken());
	    			}
	    			
	    		}	    		
	    		
	    		
	    	br.close();
	    	
    		System.out.println("Enter the new Name of Student: ");
    		newName = scan.nextLine();    		
    		System.out.println("Enter the new Age of Student: ");
    		newAge = scan.nextLine();  
    		System.out.println("Enter the new Address of Student: ");
    		newAddr = scan.nextLine();  
    		
    		BufferedReader br2 = new BufferedReader( new FileReader(db) );
    			
    		while( (record2 = br2.readLine() ) != null ) 
    		{    			
    			if(record2.contains(ID)) 
    			{
    				bw.write("ID = "+ID+", Name = "+newName+", Age = "+newAge+", Address = "+newAddr);
    			} 
    			else 
    			
    				bw.write(record2);	
    			}    			
    			bw.flush();
    			bw.newLine();
    		}
    		
    	
	}
