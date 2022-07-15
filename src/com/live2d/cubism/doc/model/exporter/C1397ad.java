package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.ad */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ad.class */
final class C1397ad extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1397ad f3571a = new C1397ad();

    C1397ad() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {

        return cbVar.getEmModelSource().getEmArtMeshSources().getSize();
    }

    /* renamed from: a */
}
