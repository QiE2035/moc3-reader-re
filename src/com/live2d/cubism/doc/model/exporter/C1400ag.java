package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ag */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ag.class */
final class C1400ag extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1400ag f3574a = new C1400ag();


    C1400ag() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getKeyformSourcesBeginIndex();
    }
}
