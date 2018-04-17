package example.yta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import example.yta.model.Address;
import example.yta.model.Photo;
import example.yta.model.UserProfile;


public interface PhotoRepository extends JpaRepository<Photo, String> {

	@Query("SELECT pt FROM Photo pt WHERE pt.photoByUser=:uid")
	Photo getPhotoByuserid(@Param("uid") Integer userId);

}
