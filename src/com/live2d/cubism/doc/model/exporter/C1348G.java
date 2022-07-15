package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.G */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/G.class */
final class C1348G extends Lambda implements Function1<EmMoc3Source, List<Boolean>> {

    /* renamed from: a */
    public static final C1348G f3519a = new C1348G();


    C1348G() {
        super();
    }

    /* renamed from: a */
    public List<Boolean> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = Boolean.TYPE;
        count = -1;
        return receiver.getEmModelSource().getEmAdditional33Sources().getQuadTransform();
    }
}
