package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print(">> ");
            String cmd = in.nextLine();

            if(cmd.equals("help")){
                System.out.println("도움말 기능을 실행합니다.");
            }else if(cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("알 수 없는 명령어입니다.");
            }
        }
    }
}
