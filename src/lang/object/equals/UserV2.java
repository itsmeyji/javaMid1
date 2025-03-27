package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // equals를 override해 id가 같으면 같은 것으로 판단하도록 재정의
//    @Override
//    public boolean equals(Object obj){
//        // 일시적 캐스팅 사용하여 obj 타입을 userv2로 받음
//        UserV2 user = (UserV2) obj;
//        // id가 string 타입, user.id는 인스턴스이기 떄문에 equals를 사용하여 비교 팔요
//        return id.equals(user.id);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
