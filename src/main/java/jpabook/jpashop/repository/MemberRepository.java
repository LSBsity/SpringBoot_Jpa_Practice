package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByName(String name); // 구현체 필요 X
    // select m from Member m where m.name = ? 라는 JPQL을 만들어줌
}
