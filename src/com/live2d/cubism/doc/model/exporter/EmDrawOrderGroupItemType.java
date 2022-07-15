package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;


/* renamed from: com.live2d.cubism.doc.model.exporter.bN  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bN.class */
public enum EmDrawOrderGroupItemType {
    ArtMesh(0),
    Part(1);


    /* renamed from: e */
    private final int mNumber;

    EmDrawOrderGroupItemType(int number) {
        this.mNumber = number;
    }

    public static EmDrawOrderGroupItemType fromNumber(int number) {
        for (EmDrawOrderGroupItemType type : EmDrawOrderGroupItemType.values()) {
            if (type.getNumber() == number) {
                return type;
            }
        }
        return ArtMesh;
    }

    /* renamed from: a */
    public final int getNumber() {
        return this.mNumber;
    }
}
