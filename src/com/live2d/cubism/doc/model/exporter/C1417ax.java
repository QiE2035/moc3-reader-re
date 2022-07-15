package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ax */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ax.class */
final class C1417ax extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1417ax INSTANCE = new C1417ax();


    C1417ax() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(0);
        return receiver.getEmModelSource().getEmPartSources().getKeyformSourcesCount();
    }
}
