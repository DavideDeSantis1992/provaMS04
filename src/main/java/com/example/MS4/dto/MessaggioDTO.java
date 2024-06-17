package com.example.MS4.dto;

import java.util.List;

public class MessaggioDTO {

    private String bodyEmail;
    private List<String> ccList;
    private List<String> addresseeList;
    /**
     * @param bodyEmail
     * @param ccList
     * @param addresseeList
     */
    public MessaggioDTO(String bodyEmail, List<String> ccList, List<String> addresseeList) {
        super();
        this.bodyEmail = bodyEmail;
        this.ccList = ccList;
        this.addresseeList = addresseeList;
    }

    public MessaggioDTO(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }


    /**
     *
     */
    public MessaggioDTO() {
        super();
    }

    public String getBodyEmail() {
        return bodyEmail;
    }
    public void setBodyEmail(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }
    public List<String> getCcList() {
        return ccList;
    }
    public void setCcList(List<String> ccList) {
        this.ccList = ccList;
    }
    public List<String> getAddresseeList() {
        return addresseeList;
    }
    public void setAddresseeList(List<String> addresseeList) {
        this.addresseeList = addresseeList;
    }

    @Override
    public String toString() {
        return "MessaggioDTO [bodyEmail=" + bodyEmail + "]";
    }

//	@Override
//	public String toString() {
//		return "MessaggioDTO [bodyEmail=" + bodyEmail + ", ccList=" + ccList + ", addresseeList=" + addresseeList + "]";
//	}

}
