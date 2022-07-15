package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

/* renamed from: com.live2d.cubism.doc.model.exporter.bJ  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bJ.class */
public final class EmCanvasInfo {

    /* renamed from: a */
    public static final Companion COMPANION = new Companion();
    /* renamed from: h */
    private static final int BODY_BYTE_SIZE = 64;
    /* renamed from: b */
    private float mPixelsPerUnit;
    /* renamed from: c */
    private float mOriginX;
    /* renamed from: d */
    private float mOriginY;
    /* renamed from: e */
    private float mCanvasWidth;
    /* renamed from: f */
    private float mCanvasHeight;
    /* renamed from: g */
    private byte mCanvasFlag;

    /* renamed from: a */
    public float getPixelsPerUnit() {
        return this.mPixelsPerUnit;
    }

    /* renamed from: a */
    public void setPixelsPerUnit(float pixelsPerUnit) {
        this.mPixelsPerUnit = pixelsPerUnit;
    }

    /* renamed from: b */
    public float getOriginX() {
        return this.mOriginX;
    }

    /* renamed from: b */
    public void setOriginX(float originX) {
        this.mOriginX = originX;
    }

    /* renamed from: c */
    public float getOriginY() {
        return this.mOriginY;
    }

    /* renamed from: c */
    public void setOriginY(float originY) {
        this.mOriginY = originY;
    }

    /* renamed from: d */
    public float getCanvasWidth() {
        return this.mCanvasWidth;
    }

    /* renamed from: d */
    public void setCanvasWidth(float canvasWidth) {
        this.mCanvasWidth = canvasWidth;
    }

    /* renamed from: e */
    public float getCanvasHeight() {
        return this.mCanvasHeight;
    }

    /* renamed from: e */
    public void setCanvasHeight(float canvasHeight) {
        this.mCanvasHeight = canvasHeight;
    }

    /* renamed from: f */
    public byte getCanvasFlag() {
        return this.mCanvasFlag;
    }

    /* renamed from: a */
    public void setCanvasFlag(byte canvasFlag) {
        this.mCanvasFlag = canvasFlag;
    }

    /* renamed from: com.live2d.cubism.doc.model.exporter.bJ$a */
    /* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bJ$a.class */
    public static final class Companion {
        private /* synthetic */ Companion() {
        }

        /* renamed from: a */
        public int getBODY_BYTE_SIZE() {
            return EmCanvasInfo.BODY_BYTE_SIZE;
        }
    }

}
