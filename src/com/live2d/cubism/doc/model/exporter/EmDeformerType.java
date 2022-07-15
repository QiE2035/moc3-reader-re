package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;


/* renamed from: com.live2d.cubism.doc.model.exporter.bM  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bM.class */
public enum EmDeformerType {
    Warp(0),
    Rotation(1);


    /* renamed from: e */
    private final int mNumber;

    EmDeformerType(int number) {
        this.mNumber = number;
    }

    public static EmDeformerType fromNumber(int number) {
        for (EmDeformerType type : EmDeformerType.values()) {
            if (type.getNumber() == number) {
                return type;
            }
        }
        return Warp;
    }

    /* renamed from: a */
    public final int getNumber() {
        return this.mNumber;
    }

}
