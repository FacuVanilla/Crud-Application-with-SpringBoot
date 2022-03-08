package springdata.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
class TennisPlayerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Getting all the Players
		logger.info("All Players Data: {}", dao.getAllPlayers());




		//Inserting a Player
		logger.info("Inserting Player 7: {}", dao.insertPlayer(
				new Player (7, "Thiem", "Austria",
						new Date(System.currentTimeMillis()),
						17 )));
		logger.info("All Players Data: {}", dao.getAllPlayers());



		//Inserting a Player
		logger.info("Inserting Player 8: {}", dao.insertPlayer(
				new Player(8, "CoCo", "USA",
						new Date(System.currentTimeMillis()),
						4)));

		logger.info("All Players Data: {}", dao.getAllPlayers());



		//Inserting a Player
		logger.info("Inserting Player 9: {}",dao.insertPlayer(
				new Player(9, "Federer", "Sweden",
						new Date(System.currentTimeMillis()),
						21)));

		logger.info("All Players Data: {}",dao.getAllPlayers());

		//Inserting a Player
		logger.info("Inserting Player 10: {}", dao.insertPlayer(
				new Player(10, "Nadal", "Spain",
						new Date(System.currentTimeMillis()),
						20)));

		logger.info("All Players Data: {}", dao.getAllPlayers());


		   //Deleting a Player
			logger.info("Deleting Player with Id 8: {}", dao.deletePlayerById(8));

			logger.info("All Players Data: {}", dao.getAllPlayers());

		//Updating a Player
		logger.info("Updating Player with Id 7: {}",  dao.updatePlayer(
				new Player(7, "Thiem", "Austria",
						Date.valueOf("1993-09-03"), 17)));


		logger.info("All Players Data: {}", dao.getAllPlayers());
		}

	}

