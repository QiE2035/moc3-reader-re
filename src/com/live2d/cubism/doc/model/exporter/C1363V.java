package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.V */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/V.class */
final class C1363V extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1363V f3534a = new C1363V();


    C1363V() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(3);
        return receiver.getEmModelSource().getEmRotationDeformerSpecificSources().getKeyformBindingBandSourcesIndex();
    }
}
