package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bl */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bl.class */
final class C1451bl extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1451bl f3758a = new C1451bl();


    C1451bl() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(19);
        return receiver.getEmModelSource().getEmDrawOrderGroupObjectSources().getIndex();
    }
}
