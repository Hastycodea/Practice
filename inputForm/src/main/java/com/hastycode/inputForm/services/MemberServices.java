package com.hastycode.inputForm.services;

import com.hastycode.inputForm.model.Member;
import com.hastycode.inputForm.repo.MemberRepo;
import org.springframework.stereotype.Service;

@Service
public class MemberServices {

    private MemberRepo repo;

    public MemberServices(MemberRepo repo) {
        this.repo = repo;
    }

    public void addMember(Member member) {
        repo.save(member);
    }
}
