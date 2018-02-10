package com.demo.pattern.creational.prototype;

import com.demo.pattern.creational.prototype.Hamburguesa.Carne;
import com.demo.pattern.creational.prototype.Hamburguesa.Extra;
import com.demo.pattern.creational.prototype.Hamburguesa.Pan;
import com.demo.pattern.creational.prototype.Hamburguesa.Size;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestHamburguesaFactory {

	@Test
	public void test_carta() {
		Hamburguesa royal = HamburguesaFactory.royal();

		assertEquals(Carne.VACUNO, royal.getCarne());
		assertEquals(Size.GRANDE, royal.getSize());
		assertEquals(Pan.NORMAL, royal.getPan());
		assertTrue(royal.getExtras().contains(Extra.CEBOLLA));
		assertTrue(royal.getExtras().contains(Extra.QUESO));
		assertFalse(royal.getExtras().contains(Extra.PEPINO));
		assertFalse(royal.getExtras().contains(Extra.MAYONESA));
	}

	@Test
	public void test_royal_si_cebolla() {
		// queremos simplificar pedir esta hamburguesa !!
		Hamburguesa royaSinCebolla = HamburguesaFactory.from(HamburguesaFactory.royal())
                .removeExtra(Extra.CEBOLLA)
                .crea();

		assertEquals(Carne.VACUNO, royaSinCebolla.getCarne());
		assertEquals(Size.GRANDE, royaSinCebolla.getSize());
		assertEquals(Pan.NORMAL, royaSinCebolla.getPan());
		assertFalse(royaSinCebolla.getExtras().contains(Extra.CEBOLLA));
		assertTrue(royaSinCebolla.getExtras().contains(Extra.QUESO));
		assertFalse(royaSinCebolla.getExtras().contains(Extra.PEPINO));
		assertFalse(royaSinCebolla.getExtras().contains(Extra.MAYONESA));
		
	}
}
