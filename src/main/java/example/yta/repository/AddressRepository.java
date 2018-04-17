package example.yta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import example.yta.model.Address;
import example.yta.model.Photo;
import example.yta.model.UserProfile;


public interface AddressRepository extends JpaRepository<Address, String> {

	@Query("SELECT add FROM Address add WHERE add.addByUser=:uid")
	Address getAddressByuserid(@Param("uid") Integer userId);

}
