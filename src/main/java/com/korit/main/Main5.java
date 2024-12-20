package com.korit.main;

@FunctionalInterface
interface 무기 {
    String 공격(Integer 데미지);

}

class 총 implements 무기 {

    @Override
    public String 공격(Integer 데미지) {

        System.out.println("데미지: " + 데미지);
        System.out.println("총을 쏜다");

        return "총 데미지: " + 데미지;
    }
}

public class Main5 {
    public static void main(String[] args) {

        무기 wp1 = new 총();
        wp1.공격(100);   // 총을 쏜다

        무기 wp2 = new 무기() { // 익명 클래스
            @Override
            public String 공격(Integer 데미지) {

                System.out.println("데미지: " + 데미지);
                System.out.println("내가 만든 무기로 공격");

                return "커스텀 무기 데미지: " + 데미지;
            }
        };
        wp2.공격(50);   // 내가 만든 무기로 공격

/*      람다식
        함수형 인터페이스를 구현할때 사용
        하나의 추상 메서드만 가지고 있어야하며
        new 키워드를 명시적으로 사용하지않고
        메서드의 (파라미터) -> (구현부) 만으로 사용
        파라미터가 하나면 파라미터 -> ()  (소괄호 생락가능)
*/
//      파라미터가 하나면 () 생략가능
        무기 wp3 = 데미지 -> {System.out.println("데미지" + 데미지 +
                ", 람다로 만든 무기로 공격");
            return "람다 무기 데미지: " + 데미지;
        };
        wp3.공격(150);

//      리턴 값이 있는 경우 중괄호 {}  를 생략하고 바로 리턴 값을 입력 할 수 있다
        무기 wp4 = 데미지 -> "람다 무기 데미지: " + 데미지;
        wp4.공격(150);

    }
}