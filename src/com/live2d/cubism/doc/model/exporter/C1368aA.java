package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aA */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aA.class */
final class C1368aA extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1368aA f3542a = new C1368aA();


    C1368aA() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        type = Float.TYPE;
        return receiver.getEmModelSource().getEmParameterSources().getDefaultValue();
    }
}
