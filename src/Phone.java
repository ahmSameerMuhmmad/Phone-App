public interface Phone {

    boolean powerOn();
    void callNumner(String phoneNo);
    void recieveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}
