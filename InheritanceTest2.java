class InheritanceTest2 {
  public static void main(String[] args) {
    
    Car car = new Car();
    car.maxSpeed = 20;

    Car car1 = new Car();
    car1.maxSpeed = 100;

    Car car2 = new Car();
    car2.maxSpeed = 40;

    SportsCar superCar = new SportsCar();
    superCar.maxSpeed = 200;

    System.out.println("자동차의 최고속력은 " + car.maxSpeed + "km입니다.");
    car.run();
    
    System.out.println("자동차의 최고속력은 " + car1.maxSpeed + "km입니다.");
    car1.run();
    
    System.out.println("자동차의 최고속력은 " + car2.maxSpeed + "km입니다.");
    car2.run();

    System.out.println("슈퍼카의 최고속력은 " + superCar.maxSpeed + "km입니다.");
    System.out.println("슈퍼카의 색상은 " + superCar.color + "입니다.");
    superCar.run();

  }
}

class Car {

  int maxSpeed;

  void run() {
    System.out.println("자동차가 달립니다.");
  
  }
}

class SportsCar extends Car {

  String color = "red";

  void run() {
    System.out.println("자동차가 매우 빨리 달립니다.");
  
  }
}
