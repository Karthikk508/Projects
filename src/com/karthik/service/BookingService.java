package com.karthik.service;

import java.util.List;

import com.karthik.beans.HistoryBean;
import com.karthik.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
