package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aO */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aO.class */
final class C1382aO extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1382aO f3556a = new C1382aO();


    C1382aO() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {

        type = Boolean.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(8);
        return receiver.getEmModelSource().getEmRotationDeformerKeyformSources().getReflectX();
    }
}
