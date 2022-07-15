package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ba */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ba.class */
final class C1440ba extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1440ba f3747a = new C1440ba();


    C1440ba() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(14);
        return receiver.getEmModelSource().getEmKeysSources().m23789a();
    }
}
