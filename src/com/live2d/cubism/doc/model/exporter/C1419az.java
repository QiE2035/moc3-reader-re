package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.az */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/az.class */
final class C1419az extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1419az f3593a = new C1419az();


    C1419az() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        type = Float.TYPE;
        return receiver.getEmModelSource().getEmParameterSources().getMinValue();
    }
}
