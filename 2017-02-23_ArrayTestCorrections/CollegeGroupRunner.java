
/**
 * Write a description of class CollegeGroupRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollegeGroupRunner
{
    public static void main(String[] args){
        College colgate   = new College("Colgate University", "Northeast", 27025); 
        College duke      = new College("Duke University", "Southeast", 26000); 
        College kalamazoo = new College("Kalamazoo College", "Midwest", 19764); 
        College stanford  = new College("Stanford University", "West", 25917); 
        College florida   = new College("Florida University", "Southeast", 10800); 
        College dartmouth = new College("Dartmouth college", "Northeast", 27764); 
        College spelman   = new College("Spelman College", "Southeast", 11455);  
        
        College[] myColleges = new College[7];
        
        myColleges[0] = colgate;
        myColleges[1] = duke;
        myColleges[2] = kalamazoo;
        myColleges[3] = stanford;
        myColleges[4] = florida;
        myColleges[5] = dartmouth;
        myColleges[6] = spelman;
    }
}
