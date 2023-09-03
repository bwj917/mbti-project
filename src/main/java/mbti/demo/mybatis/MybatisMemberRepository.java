package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Member;
import mbti.demo.repository.MemberInterface;
import mbti.demo.repository.MemberUpdateDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisMemberRepository implements MemberInterface {
    private final MemberMapper memberMapper;
    @Override
    public Member save(Member member) {
        if(validateDuplicateLogin(member))
            return null;
        memberMapper.save(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return memberMapper.findById(id);
    }

    @Override
    public Optional<Member> findByLoginId(String loginId) {
        return memberMapper.findByLoginId(loginId);
    }

    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }

    @Override
    public Optional<Member> findByNameEmail(String name, String email) {
        return memberMapper.findByNameEmail(name, email);
    }

    @Override
    public Optional<Member> findByNamePhone(String name, String phone) {
        return memberMapper.findByNamePhone(name, phone);
    }

    @Override
    public Optional<Member> findPasswordNameEmail(String loginId, String name, String email) {
        return memberMapper.findPasswordNameEmail(loginId, name, email);
    }

    @Override
    public Optional<Member> findPasswordNamePhone(String loginId, String name, String email) {
        return memberMapper.findPasswordNamePhone(loginId, name, email);
    }

    @Override
    public void update(String loginId, MemberUpdateDto UpdateParam) {
        memberMapper.update(loginId, UpdateParam);

    }

    //중복 id check
    private boolean validateDuplicateLogin(Member member) {
        Optional<Member> result = memberMapper.findByLoginId(member.getLoginId());
        return result.isPresent();
    }
}
