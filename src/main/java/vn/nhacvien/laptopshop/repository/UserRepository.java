package vn.nhacvien.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.nhacvien.laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User anhduy93);

    List<User> findOneByEmail(String email);

    List<User> findAll();

    User findById(long id); // null

}
