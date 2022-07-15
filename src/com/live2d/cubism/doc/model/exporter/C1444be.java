package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.be */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/be.class */
final class C1444be extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1444be INSTANCE = new C1444be();


    C1444be() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(0);
        return receiver.getEmModelSource().getEmPartSources().getParentPartIndex();
    }
}
