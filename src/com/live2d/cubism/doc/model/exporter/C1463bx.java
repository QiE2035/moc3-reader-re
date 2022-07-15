package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bx */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bx.class */
final class C1463bx extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1463bx f3770a = new C1463bx();


    C1463bx() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(21);
        return receiver.getEmModelSource().getEmGlueInfoSources().getWeight();
    }
}
