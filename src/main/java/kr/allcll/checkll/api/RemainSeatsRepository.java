package kr.allcll.checkll.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainSeatsRepository extends JpaRepository<RemainSeats, Long> {

}
