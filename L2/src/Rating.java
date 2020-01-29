/**
 * Created by garethhalladay on 8/27/17
 */
public class Rating {

    /**
     * ReviewType enum that allows users to distinguish between CRITIC, AUDIENCE, or an average of both
     */
    public enum ReviewType{CRITIC, AUDIENCE, BOTH}
    
    private double criticScore;
    private int numCritics;
    private double audienceScore;
    private int numAudience;
    
    public Rating() {
    	this(-1,-1,-1,-1);
    }
    
    public Rating(double criticScore, int numCritics, double audienceScore, int numAudience) {
    	this.criticScore = criticScore;
    	this.numCritics = numCritics;
    	this.audienceScore = audienceScore;
    	this.numAudience = numAudience;
    }
    
   public double getCriticScore() {
		return criticScore;
	}
    
   public int getNumCritics() {
	   return numCritics;
   }
   
   public double getAudienceScore() {
	   return audienceScore;
   }
   
   public int getNumAudience() {
	   return numAudience;
   }
   
   public double getAverageRating() {
	   return (audienceScore + criticScore)/2;
   }
   
   public String toString(){
	   return String.format("Critics Score: %.0f, Critics Count: %d, Audience Score: %.0f, Audience Count: %d", this.getCriticScore(), this.getNumCritics(), this.getAudienceScore(), this.getNumAudience());
   }
    
    public static void main(String [] args){
        Rating noargs = new Rating();
        Rating rating1 = new Rating(30, 10, 45, 100);
        System.out.printf("Critic Score: %.0f\nNumber of Critics: %d\nAudience Score: %.0f\nNumber of people: %d\n",
                           rating1.getCriticScore(), rating1.getNumCritics(), rating1.getAudienceScore(), rating1.getNumCritics());
        System.out.println(noargs);
        System.out.println(rating1);

    }



	
}
