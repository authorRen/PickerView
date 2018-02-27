package com.rex.pickerview.bean;

import com.rex.android_pickerview.model.IPickerViewData;

/**
 * @author Ren ZeQiang
 * @since 2018/2/27.
 */

public class CardBean implements IPickerViewData {

    private int id;
    private String cardNo;

    public CardBean(int id, String cardNo) {
        this.id = id;
        this.cardNo = cardNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String getPickerViewText() {
        return cardNo;
    }
}
