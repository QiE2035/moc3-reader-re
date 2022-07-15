package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bf */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bf.class */
final class C1445bf extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1445bf f3752a = new C1445bf();


    C1445bf() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(18);
        return receiver.getEmModelSource().getEmDrawOrderGroupSources().getDrawOrderGroupObjectSourcesBeginIndex();
    }
}
