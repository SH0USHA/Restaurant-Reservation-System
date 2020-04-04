package xmlHandlers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import restaurant.food.Dish;
import restaurantReservationSystem.Person;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "restaurant")
public class Restaurant {
	
	@XmlElement(name = "users")
	private Users users;
	
	@XmlElement(name = "tables")
	private Tables tables;
	
	@XmlElement(name = "dishes")
	private Dishes dishes;
	
	List<Person> persons;
	List<Dish> menu;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Tables getTables() {
		return tables;
	}

	public void setTables(Tables tables) {
		this.tables = tables;
	}

	public Dishes getDishes() {
		return dishes;
	}

	public void setDishes(Dishes dishes) {
		this.dishes = dishes;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public List<Dish> getMenu() {
		return menu;
	}

	public void setMenu(List<Dish> menu) {
		this.menu = menu;
	}
	

}