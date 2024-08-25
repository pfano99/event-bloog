package za.co.blog.event.bloog.service;

import org.springframework.stereotype.Service;
import za.co.blog.event.bloog.exception.ResourceNotFoundException;
import za.co.blog.event.bloog.model.Post;
import za.co.blog.event.bloog.repository.PostRepository;

@Service
public record PostService(PostRepository postRepository) {

	public Long addPost(Post post) {
		return postRepository.save(post).getId();
	}

	public Post findPostById(Long postId) {

		return postRepository.findById(postId)
									 .orElseThrow(() -> new ResourceNotFoundException("Post with that id is not found"));
	}

	public void removePost(Long postId) {
		postRepository.deleteById(postId);
	}

	public Post updatePost(Post post) {
		return postRepository.save(post);
	}
}
