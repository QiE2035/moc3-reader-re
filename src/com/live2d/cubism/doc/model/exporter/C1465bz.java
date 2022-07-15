package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bz */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bz.class */
final class C1465bz extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1465bz f3772a = new C1465bz();


    C1465bz() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(22);
        return receiver.getEmModelSource().getEmGlueKeyformSources().getIntensity();
    }
}
