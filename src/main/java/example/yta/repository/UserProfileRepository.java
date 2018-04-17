package example.yta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import example.yta.model.UserProfile;


public interface UserProfileRepository extends JpaRepository<UserProfile, String> {

	@Query("select max(up.userId) from UserProfile up")
	Integer getLastUserId();

	@Query("SELECT up FROM UserProfile up WHERE up.userId=:uid")
	UserProfile getUserProByuserid(@Param("uid") Integer userId);

	

}
