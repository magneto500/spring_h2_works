package pl.tomcki.springdata;


import javax.persistence.*;

@Entity
@Table(name = "Tablica_pojazdów")
public class Car {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				@Column(name = "ID_pojazdu")
				private Long id;
				@Column(name = "marka_pojazdu")
				private String marka;
				@Column(name = "model_pojazdu")
				private String model;
				@Column(name = "kolor_pojazdu")
				@Enumerated(EnumType.STRING)
				private Color color;

				public Car(String marka, String model, Color color) {
								this.marka = marka;
								this.model = model;
								this.color = color;
				}

				public Car() {
				}

				public Long getId() {
								return id;
				}

				public void setId(Long id) {
								this.id = id;
				}

				public String getMarka() {
								return marka;
				}

				public void setMarka(String marka) {
								this.marka = marka;
				}

				public String getModel() {
								return model;
				}

				public void setModel(String model) {
								this.model = model;
				}

				public Color getColor() {
								return color;
				}

				public void setColor(Color color) {
								this.color = color;
				}

				@Override
				public String toString() {
								return "Car{" +
																							", marka='" + marka + '\'' +
																							", model='" + model + '\'' +
																							", color=" + color +
																							'}';
				}
}