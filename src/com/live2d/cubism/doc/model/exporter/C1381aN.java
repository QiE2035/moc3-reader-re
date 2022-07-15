package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aN */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aN.class */
final class C1381aN extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1381aN f3555a = new C1381aN();


    C1381aN() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(8);
        return receiver.getEmModelSource().getEmRotationDeformerKeyformSources().getScale();
    }
}
