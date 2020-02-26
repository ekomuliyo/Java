package com.ekomuliyo.java;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.ekomuliyo.java.kendaraan.Kereta;
import com.ekomuliyo.java.kendaraan.Mobil;
import com.ekomuliyo.java.kendaraan.Motor;
import com.ekomuliyo.java.music.Gitar;

public class Main {
	public static void main(String[] args) {
		Gitar.bunyi();
		
		Mobil.jumlahBan();
		Motor.jumlahBan();
		Kereta.jumlahBan();
		
		Date today = new Date();
		System.out.println("hari ini : "+ today);
		Date tomorrow = DateUtils.addDays(today, 1);
		System.out.println("besok = "+ tomorrow);
	}
}
