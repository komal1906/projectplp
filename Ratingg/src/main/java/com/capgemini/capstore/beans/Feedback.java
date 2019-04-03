package com.capgemini.capstore.beans;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback
{
	@Id
	@Column(name="feedId",length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long feedbackId;
	@Column(name="describe")
	private String description;
	private Double rating; 
	/*@OneToOne(cascade=CascadeType.ALL)
	private Product product;
*/
	public long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Feedback(long feedbackId, String description, Double rating) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
		this.rating = rating;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", description=" + description + ", rating=" + rating + "]";
	}

}
