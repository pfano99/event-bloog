package za.co.blog.event.bloog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.blog.event.bloog.model.Post;
import za.co.blog.event.bloog.service.PostService;

@RestController
@RequestMapping("/post")
public record PostController(PostService postService) {

	@GetMapping("/{postId}")
	public ResponseEntity<Post> getPostById(@PathVariable Long postId) {
		return ResponseEntity.ok(postService.findPostById(postId));
	}

	@PostMapping
	public ResponseEntity<?> savePost(@RequestBody Post post) {
		Long l = postService.addPost(post);
		return ResponseEntity.ok(l);
	}

	@PutMapping
	public ResponseEntity<Post> updatePost(@RequestBody Post post) {
		return ResponseEntity.ok(postService.updatePost(post));
	}

	@DeleteMapping("/{postId}")
	public ResponseEntity<?> deletePost(@PathVariable Long postId) {
		postService.removePost(postId);
		return ResponseEntity.ok().build();
	}

}
