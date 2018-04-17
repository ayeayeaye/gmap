package example.yta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.yta.model.Photo;
import example.yta.model.UserProfile;


public interface PhotoRepository extends JpaRepository<Photo, String> {

}
