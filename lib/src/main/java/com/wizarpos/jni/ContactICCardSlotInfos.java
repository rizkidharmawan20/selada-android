package com.wizarpos.jni;

public class ContactICCardSlotInfos {
    public short FIDI;
    public short EGT;
    public short WI;
    public short WTX;
    public short EDC;
    public short protocol;
    public short power;
    public short conv;
    public short IFSC;
    public long cwt;
    public long bwt;
    public long nSlotInfoItem;

    public ContactICCardSlotInfos() {
        FIDI = -1;
        EGT = -1;
        WI = -1;
        WTX = -1;
        EDC = -1;
        protocol = -1;
        power = -1;
        conv = -1;
        IFSC = -1;
        cwt = -1;
        bwt = -1;
        nSlotInfoItem = 0;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // wastodo
    }
}
