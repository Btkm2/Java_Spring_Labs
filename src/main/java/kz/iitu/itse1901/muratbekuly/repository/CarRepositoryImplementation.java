package kz.iitu.itse1901.muratbekuly.repository;

import kz.iitu.itse1901.muratbekuly.database.Car;
import org.apache.juli.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class CarRepositoryImplementation{

//    private static final Log logger = (Log) LogFactory.getLog(CarRepositoryImplementation.class);

//    @Autowired
    private final SessionFactory sessionFactory;
//    private Object Car;


    @Autowired
    public CarRepositoryImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Car> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Car ", Car.class).getResultList();
    }


    public Car findCarById(Long id) {
        return sessionFactory.getCurrentSession().get(Car.class, id);
    }

    public Car save(Car car) {
        sessionFactory.getCurrentSession().saveOrUpdate(car);
//        logger.info("Car saved with id: " + car.getId());
        return car;
    }


    public void delete(Car car) {
        sessionFactory.getCurrentSession().delete(car);
//        logger.info("Car deleted with id: " + car.getId());
    }


//    @Bean(name = "entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory(){
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        return sessionFactory;
//    }

    //    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public int saveCars(Car car) {
//        return jdbcTemplate.update("INSERT INTO car(model, milage, condition, manufacturer, year, price) values (?, ?, ?, ?, ?, ?)",
//                car.getModel(), car.getMilage(), car.getCondition(), car.getManufacturer(), car.getYear(), car.getPrice());
//    }
//
//    @Override
//    public int updateCarsById(Car car) {
//        return jdbcTemplate.update("UPDATE car SET model = ?, milage = ?, condition = ?, manufacturer = ?, year = ?, price = ? WHERE id = ?",
//                car.getModel(), car.getMilage(), car.getCondition(), car.getManufacturer(), car.getYear(), car.getPrice(), car.getId());
//    }
//
//    @Override
//    public int deleteCarsById(int id) {
//        return jdbcTemplate.update("DELETE FROM car WHERE id = ?", id);
//    }
//
//    @Override
//    public List<Car> findAllCars() {
//        return jdbcTemplate.query("SELECT * FROM car",
//                new BeanPropertyRowMapper<>(Car.class));
//    }
//
//    @Override
//    public Car findCarById(Long id) {
//        return jdbcTemplate.queryForObject("SELECT * FROM car WHERE id = ?",
//                (rs, rowNum) -> new Car((long) rs.getInt("id"),
//                                        rs.getString("model"),
//                                        rs.getInt("milage"),
//                                        rs.getString("condition"),
//                                        rs.getString("manufacturer"),
//                                        rs.getString("year"),
//                                        rs.getInt("price")
//                                        ), id);
//    }


}
