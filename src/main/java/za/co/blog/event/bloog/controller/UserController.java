package za.co.blog.event.bloog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.blog.event.bloog.model.User;
import za.co.blog.event.bloog.service.UserService;

@RestController
@RequestMapping("/user")
public record UserController(UserService userService) {

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Long userId) {
		return ResponseEntity.ok(userService.findUserById(userId));
	}

	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		Long l = userService.addUser(user);
		return ResponseEntity.ok(l);
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Long userId){
		userService.removeUser(userId);
		return ResponseEntity.ok().build();
	}

}
