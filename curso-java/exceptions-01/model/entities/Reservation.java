package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkOut;
	private Date checkIn;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {}

	public Reservation(Integer roomNumber, Date checkOut, Date checkIn) {
		this.roomNumber = roomNumber;
		this.checkOut = checkOut;
		this.checkIn = checkIn;
	}



	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public Date getCheckIn() {
		return checkIn;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDate(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Error in reservation: Reservation dates for update must be future date";
		} 
		if (!checkOut.after(checkIn)) {
			return "Error in reservation: Check-out date must be after check-in date";
		} 
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;
	}
	
	
	@Override
	public String toString() {
		return "Room "
			 + roomNumber
			 + ", check-in: "
			 + sdf.format(checkIn)
			 + ", check-out: "
			 + sdf.format(checkOut)
			 + ", "
			 + duration()
			 + " nights";
	}
}
