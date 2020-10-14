package target.classes.com.powerreviews.project.model;

import java.util.Date;


public class Review {

	
	private String user;
	private String desc;
	private Date dateVisited;
	private boolean visitAgain;
	private double rating;
	
	
	 public Review() {
 		super();
 }
	 
	 public Review(int id, String user, String desc, Date dateVisited,
	            boolean visitAgain, double rating) {
	        super();
	        this.rating = id;
	        this.user = user;
	        this.desc = desc;
	        this.dateVisited =dateVisited;
	        this.visitAgain = visitAgain;
	        this.rating = rating;
	    }

	public Date getDateVisited() {
		return dateVisited;
	}

	public void setDateVisited(Date dateVisited) {
		this.dateVisited = dateVisited;
	}

	public boolean isVisitAgain() {
		return visitAgain;
	}

	public void setVisitAgain(boolean visitAgain) {
		this.visitAgain = visitAgain;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getrating() {
		return rating;
	}

	public void setId(int id) {
		this.rating = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	 
	 public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        Review other = (Review) obj;
	        if (rating != other.rating) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return String.format(
	                "Review [user=%s, desc=%s, dateVisited=%s, visitAgain=%s rating=%s,]", rating,
	                user, desc, dateVisited, visitAgain);
	    }
}
