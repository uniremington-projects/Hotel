package co.edu.miremington.programming.entity;

import co.edu.miremington.programming.Enum.Documents;
import org.apache.log4j.Logger;

import java.util.Date;

/**
 * Registration of a job factory
 * @author devnix
 */
public class Reception {

    private Integer id;
    private String name;



    static final Logger logger = Logger.getLogger(Reception.class);

    public Reception() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        logger.info("-----------------------------------------");
        logger.info("id: " + id);
        logger.info("name: " + name);
        logger.info("-----------------------------------------");
        return "Reception{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
