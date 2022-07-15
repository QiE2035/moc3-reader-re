package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.X */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/X.class */
final class C1365X extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1365X f3536a = new C1365X();


    C1365X() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(3);
        return receiver.getEmModelSource().getEmRotationDeformerSpecificSources().getKeyformSourcesBeginIndex();
    }
}
