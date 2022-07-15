package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aU */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aU.class */
final class C1388aU extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1388aU f3562a = new C1388aU();


    C1388aU() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(10);
        return receiver.getEmModelSource().getEmKeyformPositionSources().getXY();
    }
}
