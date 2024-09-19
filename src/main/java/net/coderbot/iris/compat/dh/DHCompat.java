package net.coderbot.iris.compat.dh;

import net.coderbot.iris.gl.framebuffer.GlFramebuffer;

public class DHCompat {
    private GlFramebuffer framebuffer;

    public int getFramebuffer() {
        return framebuffer.getId();
    }

    public void setFramebuffer(GlFramebuffer framebuffer) {
        this.framebuffer = framebuffer;
    }
}
