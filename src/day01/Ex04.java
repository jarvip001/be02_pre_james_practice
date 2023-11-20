package day01;

class Player {
    // 속성 = 변수 : 무언가를 저장해둘 때 사용
    // 변수를 만드는 문법
    // 클래스이름 변수이름;
    String name;
    String weapon;
}
public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보

        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.
        // Player 클래스 생성 (이름, 무기)
        int jamesWeapon=0, janeWeapon=0;

        Player james, jane;

        james = new Player();
        jane = new Player();

        james.name = "player1";
        james.weapon = "";

        jane.name = "player2";
        jane.weapon = "";

        while ( jamesWeapon==janeWeapon ) {
            jamesWeapon = (int)(Math.random()*3)+1;
            switch (jamesWeapon) {
                case 1:
                    james.weapon = "가위";
                    break;
                case 2:
                    james.weapon = "바위";
                    break;
                case 3:
                    james.weapon = "보";
                    break;
            }

            janeWeapon = (int)(Math.random()*3)+1;
            switch (janeWeapon) {
                case 1:
                    jane.weapon = "가위";
                    break;
                case 2:
                    jane.weapon = "바위";
                    break;
                case 3:
                    jane.weapon = "보";
                    break;
            }

            System.out.println(james.name + " " + james.weapon + "     vs.    " + jane.name + " " + jane.weapon);

            switch (janeWeapon) {
                case 1:
                    if (jamesWeapon == 2 )
                        System.out.println("player1 Win");
                    else if ( jamesWeapon == 3 )
                        System.out.println("player2 Win");
                    break;
                case 2:
                    if (jamesWeapon == 1 )
                        System.out.println("player2 Win");
                    else if ( jamesWeapon == 3 )
                        System.out.println("player1 Win");
                    break;
                case 3:
                    if (jamesWeapon == 1 )
                        System.out.println("player1 Win");
                    else if ( jamesWeapon == 2 )
                        System.out.println("player2 Win");
                    break;
            }

        }





        // 무승부면 반복
        //      player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
        //      객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장

        //      player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        //      객체 생성, 이름을 player2로 저장, 랜덤으로 가위바위보 중 하나 저장

        //      둘 중에 이긴 사람 이름 출력


    }
}

