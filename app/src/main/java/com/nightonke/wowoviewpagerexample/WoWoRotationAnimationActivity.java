package com.nightonke.wowoviewpagerexample;

import android.os.Bundle;

import com.nightonke.wowoviewpager.Animation.ViewAnimation;
import com.nightonke.wowoviewpager.Animation.WoWoRotationAnimation;

public class WoWoRotationAnimationActivity extends WoWoActivity {

    @Override
    protected int contentViewRes() {
        return R.layout.activity_wowo_rotation_animation;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewAnimation animation = new ViewAnimation(findViewById(R.id.test));
        animation.add(WoWoRotationAnimation.builder().page(0).start(0).end(1).fromX(0).toX(180).keepY(0).keepZ(0).build());
        animation.add(WoWoRotationAnimation.builder().page(1).start(0).end(1).keepX(180).fromY(0).toY(180).keepZ(0).build());
        animation.add(WoWoRotationAnimation.builder().page(2).start(0).end(1).keepX(180).keepY(180).fromZ(0).toZ(180).build());
        animation.add(WoWoRotationAnimation.builder().page(3).start(0).end(0.5).keepX(180).keepY(180).fromZ(180).toZ(90).build());
        animation.add(WoWoRotationAnimation.builder().page(3).start(0.5).end(1).fromX(180).toX(90).keepY(180).keepZ(90).build());
        wowo.addAnimation(animation);

        wowo.setEase(ease);
        wowo.setUseSameEaseBack(useSameEaseTypeBack);
        wowo.ready();
    }
}
