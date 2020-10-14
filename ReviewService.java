package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import target.classes.com.powerreviews.project.model.Review;


@Service
public class ReviewService {
	
	
	    private static List<Review> reviews = new ArrayList<Review>();
	    private static int ReviewCount = 5;
	    
	    static {
	    	reviews.add(new Review(1, "Terrence", "I ate and really enjoyed the spinach pasta would definitely Reccomend this restaurant!", new Date(),
	                true, 5.0));
	    	reviews.add(new Review(2, "Brett", "I waited a long time for my food and decided to just leave!", new Date(), false, 2.5));
	    	reviews.add(new Review(3, "Jennifer", "Had a great time here, they made my aniversarry dinner special.", new Date(),
	                true,4.4));
	    	reviews.add(new Review(4, "Adam", "The deserts are amazing!", new Date(),
	                true, 4.3));
	    	reviews.add(new Review(5, "Batman", "Had a LOT of family visit from out of town and the were extremly accomadating.", new Date(),
	                true, 4.5));
	    }
	    
	    public List<Review> returnReviews(String user) {
	        List<Review> filteredTodos = new ArrayList<Review>();
	        for (Review review : reviews) {
	            if (review.getUser().equalsIgnoreCase(user)) {
	                filteredTodos.add(review);
	            }
	        }
	        return filteredTodos;
	    }
	    
	    public Review retrieveRating(int rating) {
	        for (Review review : reviews) {
	            if (review.getrating()==rating) {
	                return review;
	            }
	        }
	        return null;
	    }
	    
	    public void updateReview(Review review){
    		reviews.remove(review);
    		reviews.add(review);
    }
	    public void addReview(String user, String desc, Date datevisited,
	            boolean visitAgain, double rating) {
	        reviews.add(new Review(++ReviewCount, user, desc, datevisited, visitAgain,rating));
	    }
	    
}
