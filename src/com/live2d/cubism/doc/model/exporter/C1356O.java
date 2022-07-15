package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.O */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/O.class */
final class C1356O extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1356O f3527a = new C1356O();


    C1356O() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(2);
        return receiver.getEmModelSource().getEmWarpDeformerSpecificSources().getKeyformBindingBandSourcesIndex();
    }
}
