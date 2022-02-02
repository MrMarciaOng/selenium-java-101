/**
 * 
 */
package com.sddevops.selenium_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author marcia
 *
 */
class SongCollectionTest {
	private SongCollection sc;
	private Song s1;
//	private Song s2;
//	private Song s3;
//	private Song s4;
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		sc = new SongCollection();
		s1 = new Song("001","asdad","asdasd",4);
		sc.addSong(s1);
	}

	@Test
	void testGetSong() {
		System.out.println("asd");
		List<Song> testSc = sc.getSongs();
		assertTrue(!testSc.isEmpty());
	}

}
