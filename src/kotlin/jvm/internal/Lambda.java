package kotlin.jvm.internal;

/* compiled from: Lambda.kt */

/* loaded from: kotlin-stdlib-1.3.72.jar:kotlin/jvm/internal/Lambda.class */
public abstract class Lambda
//        implements
//        FunctionBase<R>, Serializable
{
    protected Class<?> type = Integer.TYPE;
    protected int count = 0;

    public Lambda() {
    }

    public String toString() {
        String renderLambdaToString = "Lambda";
//        String renderLambdaToString = Reflection.renderLambdaToString((Lambda) this);
        Intrinsics.checkExpressionValueIsNotNull(renderLambdaToString, "Reflection.renderLambdaToString(this)");
        return renderLambdaToString;
    }

    public Class<?> getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}
