package com.glumes.renderpass_and_framebuffer;

import android.view.Surface;

/**
 * Created by glumes on 10/12/2018
 */
public class VulkanTutorial {

    static {
        System.loadLibrary("vulkan_tutorial");
    }

    public static native void run(Surface surface, int width, int height);

    public static native void destroy();
}
