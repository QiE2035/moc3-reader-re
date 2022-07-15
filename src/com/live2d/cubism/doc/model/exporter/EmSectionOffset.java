package com.live2d.cubism.doc.model.exporter;

import java.util.ArrayList;
//import kotlin.Metadata;


/* renamed from: com.live2d.cubism.doc.model.exporter.cl  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cl.class */
public final class EmSectionOffset {


    /* renamed from: a */
    public static final Companion COMPANION = new Companion();
    /* renamed from: c */
    private static final int BODY_BYTE_SIZE = 640;
    /* renamed from: b */
    private final ArrayList<Integer> mOffsets = new ArrayList<>();

    /* renamed from: a */
    public ArrayList<Integer> getOffsets() {
        return this.mOffsets;
    }

    /* renamed from: com.live2d.cubism.doc.model.exporter.cl$a */
    /* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cl$a.class */
    public static final class Companion {
        private  /* synthetic */ Companion() {
        }

        /* renamed from: a */
        public int getBODY_BYTE_SIZE() {
            return EmSectionOffset.BODY_BYTE_SIZE;
        }
    }


}
