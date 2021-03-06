package xmlHandlers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import restaurant.food.Appetizers;
import restaurant.food.Dessert;
import restaurant.Order;
import restaurant.food.Dish;
import restaurant.food.MainCourse;
import restaurant.table.Table;
import restaurantReservationSystem.Person;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "restaurant")
public class Restaurant {

	@XmlElement(name = "users")
	private Users users;

	@XmlElement(name = "tables")
	private Tables tables;

	@XmlElement(name = "dishes")
	private Dishes dishes;

	@XmlElement(name = "reviews")
	private Review reviews = new Review();

	@XmlElement(name = "reservations")
	private Reservation reservations = new Reservation();

	List<Person> persons;
	List<Dish> menu;

	public Review getReviews() {
		return reviews;
	}

	public void setReviews(Review reviews) {
		this.reviews = reviews;
	}

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

	public Reservation getReservations() {
		return reservations;
	}

	public void setReservations(Reservation reservations) {
		this.reservations = reservations;
	}

	public ObservableList<Table> retrieveAvailableTables() {
		ObservableList<Table> list = FXCollections.observableArrayList();
		for(int i = 0; i < tables.getTables().size(); i++) {
			if(tables.getTables().get(i).isAvailable()) {
				list.add(tables.getTables().get(i));
			}
		}
		return list;


	}
	public ObservableList<Dish> retrieveDish(String menuType) {
		ObservableList<Dish> list = FXCollections.observableArrayList();
		if (menuType.equals("Appetizers")) {
			for (int i = 0; i < menu.size(); i++) {
				if (menu.get(i) instanceof Appetizers) {
					list.add(menu.get(i));
				}
			}
		} else if (menuType.equals("Main Course")) {
			for (int i = 0; i < menu.size(); i++) {
				if (menu.get(i) instanceof MainCourse) {
					list.add(menu.get(i));
				}
			}
		} else if (menuType.equals("Desserts")) {
			for (int i = 0; i < menu.size(); i++) {
				if (menu.get(i) instanceof Dessert) {
					list.add(menu.get(i));
				}
			}
		}
		return list;
	}

	public ObservableList<Dish> retrieveDishes() {
		ObservableList<Dish> list = FXCollections.observableArrayList();
		for(int i = 0; i < dishes.getDishes().size(); i++) {
			list.add(menu.get(i));
		}
		return list;
	}

	public ObservableList<Order> retrieveOrders() {
		ObservableList<Order> list = FXCollections.observableArrayList();
		for(int i = 0; i < reservations.getOrders().size(); i++) {
			list.add(reservations.getOrders().get(i));
		}
		return list;
	}
}
