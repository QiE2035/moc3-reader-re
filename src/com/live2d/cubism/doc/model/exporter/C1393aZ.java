package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aZ */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aZ.class */
final class C1393aZ extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1393aZ f3567a = new C1393aZ();


    C1393aZ() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(13);
        return receiver.getEmModelSource().mEmKeyformBindingSources().getKeysSourcesCount();
    }
}
