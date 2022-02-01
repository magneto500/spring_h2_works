package pl.tomcki.springdata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

				private CarRepo carRepo;

				@Autowired
				public Start(CarRepo carRepo) {
								this.carRepo = carRepo;
				}

				@EventListener(ApplicationReadyEvent.class)
				public void runExample() {
								Car car = new Car("Opel","Astra", Color.niebieski);
								Car car1 = new Car("Suzuki","SX4 S-Cross", Color.czarny);
								Car car2 = new Car("VW","Golf", Color.zielony);
								Car car3 = new Car("Peugeot","206+", Color.czarny);

								carRepo.save(car);
								carRepo.save(car1);
								carRepo.save(car2);
								carRepo.save(car3);


								Iterable<Car> CAR = carRepo.findAll();
								CAR.forEach(System.out::println);
				}
}
