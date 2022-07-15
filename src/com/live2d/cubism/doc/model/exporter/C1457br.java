package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.br */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/br.class */
final class C1457br extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1457br f3764a = new C1457br();


    C1457br() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(20);
        return receiver.getEmModelSource().getEmGlueSources().getKeyformSourcesBeginIndex();
    }
}
