package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.ac */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ac.class */
final class C1396ac extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1396ac f3570a = new C1396ac();

    C1396ac() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {

        return cbVar.getEmModelSource().getEmArtMeshSources().getSize();
    }

    /* renamed from: a */
}
