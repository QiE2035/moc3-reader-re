package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ao */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ao.class */
final class C1408ao extends Lambda implements Function1<EmMoc3Source, List<Byte>> {

    /* renamed from: a */
    public static final C1408ao f3582a = new C1408ao();


    C1408ao() {
        super();
    }

    /* renamed from: a */
    public List<Byte> invoke(EmMoc3Source receiver) {

        type = Byte.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getDrawableFlag();
    }
}
