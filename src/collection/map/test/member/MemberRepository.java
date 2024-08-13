package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    Map<String, Member> user = new HashMap<>();
    public void save(Member member) {
        user.put(member.getId(), member);
    }

    public Member findById(String id) {
        return user.get(id);
    }

    public void remove(String id) {
        user.remove(id);
    }

    public Member findByName(String name) {
        for (Member val : user.values()) {
            if (val.getName().equals(name)) {
                return val;
            }
        }
        return null;
    }
}
