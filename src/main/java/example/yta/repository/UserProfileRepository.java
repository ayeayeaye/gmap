package example.yta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import example.yta.model.UserProfile;


public interface UserProfileRepository extends JpaRepository<UserProfile, String> {

	@Query("select max(up.userId) from UserProfile up")
	Integer getLastUserId();

	

}
