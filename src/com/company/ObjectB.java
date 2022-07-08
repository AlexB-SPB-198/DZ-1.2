package com.company;

class ObjectB extends ObjectA {
    @Override
    public void makeVoice() {


    }

    @Override
     final public void makeVoice(String voice) {
        super.makeVoice(voice);
    }
}
