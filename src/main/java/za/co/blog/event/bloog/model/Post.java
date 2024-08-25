package za.co.blog.event.bloog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "blog")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

	@Id
	@Column(name = "blog_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String topic;

	private String body;

	private LocalDateTime dateCreated;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

}
