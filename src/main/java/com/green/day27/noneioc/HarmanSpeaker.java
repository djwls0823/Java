package com.green.day27.noneioc;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    @Override
    public void speakerSound() {
        System.out.println("Harman Speaker: 소리가 웅장하다.");
        woofer.baseSound();
    }

    public HarmanSpeaker() {
        woofer = new HanilWoofer();
    }
}
