package com.hastycode.inputForm.repo;

import com.hastycode.inputForm.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepo extends JpaRepository<Member, String> {
}
