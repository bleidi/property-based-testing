package io.github.bleidi;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class AppTest {

	private static final double DELTA = 0.0001d;

	@Property
	public void divisionDistributiveWithDivisonByZero(double n1, double n2,double n3) {
		assertEquals((n1 + n2) / n3, n1 / n3 + n2 / n3, DELTA);
	}

	@Property
	public void divisionDistributive(double n1, double n2, @InRange(min = "0") double n3) {
		assertEquals((n1 + n2) / n3, n1 / n3 + n2 / n3, DELTA);
	}
}
