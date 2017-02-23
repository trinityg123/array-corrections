    
/**
 * Write a description of class CollegeGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollegeGroup
{
    private College[] myColleges;
    
    /**
     * @param collegeName a string that exists in myColleges
     * param newTuition an int that represents a new tuition for collegeName
     */
    public void updateTuition(String collegeName, int newTuition){        
        for(int i=0; i< myColleges.length; i++){
            if(myColleges[i].equals(collegeName)){
                myColleges[i].setTuition(newTuition);
            }
        }
    }
    
    /**
     * @param region perrfered region of college to be checked
     * @param low low end of tution price to be checked
     * @param high high end of tution price to be checked
     * @return an array of colleges in region where
     *          low <= tuition <=high
     *          the length of the array returned is equal to the number of 
     *          colleges that meet the criteria
     */
    public College[] getCollegeList(String region, int low, int high){
        int count = 0;
        for(int i=0; i<myColleges.length; i++){
            if(myColleges[i].getTuition >= low && myColleges[i].getTuition <= high && myColleges[i].getRegion.equals(region)){
                count++;
            }
        }
        
        String[] collegeList = new String[count];
        
        for(int i=0; i<myColleges.length; i++){
            if(myColleges[i].getRegion.equals(region) && myColleges[i].getTuition >= low && myColleges[i].getTuition <= high){
                collegeList[i] = myColleges[i];
            }
        }
        
        return collegeList;
    }
}
