package za.co.blog.event.bloog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private LocalDateTime joinDate;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy ="user" )
	private List<Post> postPosts;
}
