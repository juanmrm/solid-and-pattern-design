package com.demo.pattern.creational.prototype;

import com.demo.pattern.creational.prototype.Hamburguesa.Carne;
import com.demo.pattern.creational.prototype.Hamburguesa.Extra;
import com.demo.pattern.creational.prototype.Hamburguesa.Pan;
import com.demo.pattern.creational.prototype.Hamburguesa.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class HamburguesaFactory {

	private Carne carne;
	private Size size;
	private Pan pan;
	private List<Extra> extras = new ArrayList<>();
	
	public Hamburguesa crea() {
	    return new Hamburguesa(carne, size, pan, extras);
	}

	public static HamburguesaFactory from(Hamburguesa original) {
	    HamburguesaFactory proto = new HamburguesaFactory()
                .setCarne(original.getCarne())
                .setSize(original.getSize())
                .setPan(original.getPan());
	    original.getExtras().forEach(proto::addExtra);
	    return proto;
    }
	
	public HamburguesaFactory setCarne(Carne carne) {
		this.carne = carne;
		return this;
	}

	public HamburguesaFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public HamburguesaFactory setPan(Pan pan) {
		this.pan = pan;
		return this;
	}

	public HamburguesaFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public HamburguesaFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}

	// -- hamburguesas de la carta
	public static Hamburguesa royal() {
		return new Hamburguesa (Carne.VACUNO, Size.GRANDE, Pan.NORMAL, Arrays.asList(Extra.CEBOLLA, Extra.QUESO));
	}

	public static Hamburguesa king() {
		return new Hamburguesa (Carne.VACUNO, Size.EXTRA_GRANDE, Pan.NORMAL, Arrays.asList(Extra.CEBOLLA, Extra.HUEVO));
	}


}
