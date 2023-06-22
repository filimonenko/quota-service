package edu.quotaservice.repository;

import edu.quotaservice.model.Quota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuotaRepository extends JpaRepository<Quota, Integer> {

    Quota findByCode(int code);
    List<Quota> findByUserId(int userId);
    Quota findByUserIdAndCode(int id, int code);

}
