package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ay */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ay.class */
final class C1418ay extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1418ay f3592a = new C1418ay();


    C1418ay() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        type = Float.TYPE;
        return receiver.getEmModelSource().getEmParameterSources().getMaxValue();
    }
}
