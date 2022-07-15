package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.Y */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/Y.class */
final class C1366Y extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1366Y f3537a = new C1366Y();


    C1366Y() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(3);
        return receiver.getEmModelSource().getEmRotationDeformerSpecificSources().getBaseAngle();
    }
}
