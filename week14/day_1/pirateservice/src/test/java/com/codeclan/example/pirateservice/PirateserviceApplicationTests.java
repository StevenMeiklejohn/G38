package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.models.Ship;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import com.codeclan.example.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createPirate(){
//		Ship ship = new Ship("The Black Pearl");
//		shipRepository.save(ship);
//		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship);
//		pirateRepository.save(jack);
//
//		Raid raid = new Raid("Ram raiding John Menzies", 200);
//		raidRepository.save(raid);
//
//		raid.addPirate(jack);
//		raidRepository.save(raid);
//	}

	@Test
	public void canFindPiratesOver30(){
		List<Pirate> found = pirateRepository.findByAgeGreaterThan(30);
		assertTrue(found.size() > 0);
	}

	@Test
	public void findRaidByLocation(){
		List<Raid> found = raidRepository.findRaidByName("Tortuga");
		assertEquals("Tortuga", found.get(0).getName());
	}

	@Test
	public void findPiratesByRaidId(){
		List<Pirate> foundPirates = pirateRepository.findByRaidsId(1L);
		assertEquals(1, foundPirates.size());
		assertEquals("Jack", foundPirates.get(0).getFirstName());
	}

	@Test
	public void canFindShipsWithPiratesFirstName(){
		List<Ship> foundShips = shipRepository.findByPiratesFirstName("Maggie");
		assertEquals(14, foundShips.size());
	}

	@Test
	public void canFindAllRaidsForAGivenShip(){
		Ship foundShip = shipRepository.getOne(3L);
		List<Raid> foundRaids = raidRepository.findByPiratesShip(foundShip);
		assertEquals(2, foundRaids.size());
	}

}
