package org.ecsoya.demos.coverage2;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloCoverageTest {

	@Test
	public void testGetVersion() {
		HelloCoverage hc = new HelloCoverage();
		String version = "Ecsoya";
		hc.setVersion(version);
		assertEquals(version, hc.getVersion());
	}

	@Test
	public void testSetVersion() {
		HelloCoverage hc = new HelloCoverage();
		String version = "Ecsoya";
		hc.setVersion(version);
		assertEquals(version, hc.getVersion());
	}

}
