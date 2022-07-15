package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.M */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/M.class */
final class C1354M extends Lambda implements Function1<EmMoc3Source, List<EmDeformerType>> {

    /* renamed from: a */
    public static final C1354M f3525a = new C1354M();


    C1354M() {
        super();
    }

    /* renamed from: a */
    public List<EmDeformerType> invoke(EmMoc3Source receiver) {

        type = EmDeformerType.class;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(1);
        return receiver.getEmModelSource().getEmDeformerSources().getDeformerType();
    }
}
