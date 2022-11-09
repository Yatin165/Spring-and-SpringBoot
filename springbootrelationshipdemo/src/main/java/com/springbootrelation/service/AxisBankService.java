package com.springbootrelation.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrelation.onetomany.AxisBankCards;
import com.springbootrelation.onetomany.AxisBankCustomer;
import com.springbootrelation.repository.AxisBankRepo;

@Service
public class AxisBankService {
	
	@Autowired
	private AxisBankRepo axisrepo;
	
	public AxisBankCustomer addDataToDataBase(AxisBankCustomer ax) {
		return axisrepo.save(ax);
	}
	
/*	public AxisBankCustomer getDataFromDataBase(int id){
		Optional<AxisBankCustomer> oplist = axisrepo.findById(id);
		AxisBankCustomer cust = oplist.get();
		List<AxisBankCards> list = cust.getCardlist();
		List<AxisBankCards> validlist = list.stream().filter(card->card.getExpirydate().compareTo(LocalDate.now())>0).collect(Collectors.toList);
	} */

//	public String updateDataIntoDataBase(AxisBankCustomer  payload) {
//		Optional<AxisBankCustomer> optionalobj = axisrepo.findById(payload.getAxisbankcustomerid());
//		AxisBankCustomer existingcustomer = optionalobj.get();
//		
//		if(payload.getEmailid() != null  || payload.getName() != null ) {
//		
//		 	return "Data is updated for " + existingcustomer.getAxisbankcustomerid();
//		}else {
//			return "No data was updated";
//		}
//	}
	
	
	@Transactional
	public AxisBankCustomer updateCardDetails(AxisBankCustomer customerFromPayload) {

		Optional<AxisBankCustomer> optionalCustomerFromDB = axisrepo.findById(customerFromPayload.getAxisbankcustomerid());
		if (optionalCustomerFromDB.isPresent()) {
			// object we got from customer
			AxisBankCustomer customerFromDB = optionalCustomerFromDB.get();
			// customerFromDB.setcId(customerFromPayload.getcId());
			if (customerFromPayload.getName() != null) {
				customerFromDB.setName(customerFromPayload.getName());
			}
			if (customerFromPayload.getEmailid() != null) {
				customerFromDB.setEmailid(customerFromPayload.getEmailid());
			}
			// got this list from payload
			List<AxisBankCards> cardsToUpdate = customerFromPayload.getCardlist();
			if (cardsToUpdate != null) {
				// filter card ids of all cards to be updated given in the payload

				List<Integer> listOfCardIds = cardsToUpdate.stream().map(e -> e.getCardid())
						.collect(Collectors.toList());

				// all cards from database stored in the cardsFromDB list
				List<AxisBankCards> cardsFromDB = customerFromDB.getCardlist();
				// filter cards to be updated using their ids
				List<AxisBankCards> cardsFromDBToUpdate = cardsFromDB.stream()
						.filter(card -> listOfCardIds.contains(card.getCardid())).collect(Collectors.toList());

				for (AxisBankCards card : cardsToUpdate) {
					AxisBankCards dbCard = cardsFromDBToUpdate.stream()
							.filter(cardInDB -> cardInDB.getCardid() == (card.getCardid())).findFirst().get();
					if (card.getCardnumber() != null) {
						dbCard.setCardnumber(card.getCardnumber());
					}
					if (card.getExpirydate() != null) {
						dbCard.setExpirydate(card.getExpirydate());
					}
					if (card.getIssuedate() != null) {
						dbCard.setIssuedate(card.getIssuedate());
					}
				}
			}
			return customerFromDB;
		}
		return null;
	}
}
