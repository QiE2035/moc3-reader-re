package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.W */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/W.class */
final class C1364W extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1364W f3535a = new C1364W();


    C1364W() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(3);
        return receiver.getEmModelSource().getEmRotationDeformerSpecificSources().getKeyformSourcesBeginIndex();
    }
}
