package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/ResumeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "job", "continuation", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)V", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 16})
/* compiled from: JobSupport.kt */
final class ResumeOnCompletion extends JobNode<Job> {
    private final Continuation<Unit> continuation;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ResumeOnCompletion(kotlinx.coroutines.Job r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "job"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            r1.<init>(r2)
            r1.continuation = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.ResumeOnCompletion.<init>(kotlinx.coroutines.Job, kotlin.coroutines.Continuation):void");
    }

    public void invoke(Throwable th) {
        Continuation<Unit> continuation2 = this.continuation;
        Unit unit = Unit.INSTANCE;
        Result.Companion companion = Result.Companion;
        continuation2.resumeWith(Result.m3constructorimpl(unit));
    }

    public String toString() {
        return "ResumeOnCompletion[" + this.continuation + ']';
    }
}
