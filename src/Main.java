/*
    1.Object의 equals toString 을 오버라이드 하는 코드 예제로서 x좌표와 y좌표
    데이터를 갖는 Point 클래스를 작성하시오.
    hashCode는 객체가 유일한것인지 비교하는것이다.

    public class Point() {
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        void equals(int x, int y) {
            if (x == y) {
                return true;
            } else {
                return false;
            }
        }
        @Override
        void String toString() {
            return "x : " + Point.x + "y : " + Point.y;
        }
    }
    public class Main {
    }
 */
/*
    2. 자바의 기본 데이터 타입 8가지를 선언하고 할당.
    Wrapper 클래스 설명 / 읽기 전용 / 수정 불가
    Valueof
    상수 / enum  /  선언하면서 코딩하기 쉽게 해줌.

	byte = 0;
	int = 4;
	short = 2;
	char = 'a';
	long = 10000l;
	float = 3.14f;
	double = 3.14;
	string = "hello"    (참조형)
 */

/*
    3 인스턴스변수, 정적 변수 대하여 예제코드를 작성하시오.
    Public Class main{
	    int Num = 0;
	    private int age;
	    public static String firstName = "Kim";
	    public static int Number = 1;

	    public static void main(String[]args){
            System.out.println(this.age);
            System.out.println(main.firstName);
            main.firstName = "yoon";

            main m = new main();
            m.test1();
        }

        public void test1(){
            System.out.println(this.age);
            System.out.println(main.firstName);
        }
        public static void test2(){
            main m = new main();
            System.out.println(m.age);
            System.out.println(main.firstName);
        }
    }
 */
/*
    4. 실행 메소드에서 객체를 거치지 않고 바로 접근할수 있는 메소드를 선언하고
    호출 하시오.
    public class Point(){
        public Point(){
            System.out.println("Point 생성자 생성");
        }
    }
    public static void main(String[ ] args) {
        Point p = new p();
    }
 */

/*
    5. 제어문의 예를 코드로 작성하시오.
    public boolean equals(int A,int B){
        if( A == B){
            return true;
        } else {
            return false;
        }

        boolean flag = A == B ? true : false;

    }

 */
/*
    6. 추상클래스를 선언하고 하위 클래스에서 상속받아 오버라이드하는 코드를 작성하시오.
    public abstract Vehicle {
    public abstract void run();
    }

    public class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("차가 달립니다.");
    }
    public void checkFare(){
        System.out.println("승차요금 없음.");
    }

    @Override
    public String toString() {
        return "차가 출발합니다.";
    }
}

public interface RemoteControl {
    // 추상 메소드
    public void turnOn();
    public void turnOff();
}
public class Television implements RemoteControl {
    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn() {
        System.out.println("TV 를 켭니다.");
    }
    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
}

 */
/*
    7. 싱글톤을 설명하는 코드를 작성하시오.

    // 어떤 클래스가 최초 한번만 메모리를 할당하고(Static)
    // 그 메모리에 객체를 만들어 사용하는 디자인패턴.

    하나의 큰메인 클래스로 이루어 졌다.
    public class Singleton {
        private static Singleton singleObject;
        private Singleton() {}

        public Singleton getInstance() {
            if(singleObject == null) {
                singleObject = new Singleton();
            }
            return singleObject;
        }
    }

 */
/*
8. 2가지 예외사황(null, index)을 직접 처리하는 코드를 작성하시오.
    (try ~ cartch ~finally) 사용

     public void StratSolvingQuiz(){
            StreamCode sc = new StreamCode();
            try {
                sc.readFile();
            } catch (IOException ie){
                System.out.println("파일을 읽는데 문제가 발생했습니다.");
            }
        }
 */

/*
    9. generic, autoboxing, autounboxing을 코드로 작성하시오.(ArrayList Crud작성)

       재너릭 : 함수의 형을 지정
       ArrayList <Point> list = new ArrayList<Point>();




 */
/*
    10. List, 배열, Map, Set을 설명하는 코드를 작성하시오.

    // List
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.set(0,10);
    list.get(0);

    // 배열
    int []num = new int [5];
    int num2[] = {10,20,30,40,50};

    // Map Map은 값을 key와 value 두 개의 값을 한 쌍으로 저장하는 함수
    Map<Integer> map = new HashMap<Integer>();
    map.put(1, "윤태검");


    // Set
    Set<Integer> Key = map.keySet();    // 모든키를 불러오는 함수.

 */