package jpabook.jpashop.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수입니다.")
    private String name;


    private String city;
    private String street;

    @Size(min = 5, max = 5, message = "우편번호는 5자리여야 합니다.")
    private String zipcode;

}
