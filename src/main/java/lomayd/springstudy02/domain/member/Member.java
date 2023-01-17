package lomayd.springstudy02.domain.member;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private Long id;

    private String name;

    private Grade grade;
}
