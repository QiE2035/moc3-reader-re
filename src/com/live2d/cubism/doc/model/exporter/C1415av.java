package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.av */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/av.class */
final class C1415av extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1415av f3589a = new C1415av();

    C1415av() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {
        return m23971a(cbVar);
    }

    /* renamed from: a */
    public int m23971a(EmMoc3Source receiver) {

        return receiver.getEmModelSource().getEmParameterSources().getSize();
    }
}
