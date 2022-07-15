package com.live2d.cubism.doc.model.exporter;

import java.util.ArrayList;

/* renamed from: com.live2d.cubism.doc.model.exporter.bK  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bK.class */
public final class EmCountInfo {


    /* renamed from: a */
    public static final Companion COMPANION = new Companion();
    /* renamed from: c */
    private static final int BODY_BYTE_SIZE = 128;
    /* renamed from: d */
    private static final int MAX_COUNT = 23;
    /* renamed from: b */
    private final ArrayList<Integer> counts = new ArrayList<>();

    /* renamed from: a */
    public ArrayList<Integer> getCounts() {
        return this.counts;
    }

    /* renamed from: com.live2d.cubism.doc.model.exporter.bK$a */
    /* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bK$a.class */
    public static final class Companion {

        private  /* synthetic */ Companion() {
        }

        /* renamed from: a */
        public int getBODY_BYTE_SIZE() {
            return EmCountInfo.BODY_BYTE_SIZE;
        }

        public int getMAX_COUNT() {
            return EmCountInfo.MAX_COUNT;
        }
    }
}
