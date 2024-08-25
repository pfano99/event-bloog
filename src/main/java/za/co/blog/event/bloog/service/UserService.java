package za.co.blog.event.bloog.service;

import org.springframework.stereotype.Service;
import za.co.blog.event.bloog.exception.ResourceNotFoundException;
import za.co.blog.event.bloog.model.User;
import za.co.blog.event.bloog.repository.UserRepository;

@Service
public record UserService(UserRepository userRepository) {

	public Long addUser(User user) {
		return userRepository.save(user).getId();
	}

	public User findUserById(Long userId) {
		return userRepository.findById(userId)
									 .orElseThrow(() ->
																				new ResourceNotFoundException("User with that id is not found"));
	}

	public void removeUser(Long userId) {
		userRepository.deleteById(userId);
	}
}
