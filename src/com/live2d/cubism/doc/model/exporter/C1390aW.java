package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aW */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aW.class */
final class C1390aW extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1390aW f3564a = new C1390aW();


    C1390aW() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(12);
        return receiver.getEmModelSource().getEmKeyformBindingBandSources().getKeyformBindingIndexSourcesBeginIndex();
    }
}
