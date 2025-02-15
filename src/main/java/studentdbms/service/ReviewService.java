/**
 * The ReviewService class in the studentdbms service package provides methods to find, save, and remove Review entities using a ReviewRepository.
 * @author PUSHKAR D
 * @version 1.0
 */
package studentdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import studentdbms.entity.Review;
import studentdbms.repository.ReviewRepository;

@Service
public class ReviewService 
{
	@Autowired
	private ReviewRepository reviewRepository;
	
	public Review findById(int id) {
		return reviewRepository.findById(id).get();
	}
	
	@Transactional
	public Review save(Review review) {
		return reviewRepository.save(review);
	}
	
	@Transactional
	public void remove(Review review) {
		reviewRepository.delete(review);
	}
}
