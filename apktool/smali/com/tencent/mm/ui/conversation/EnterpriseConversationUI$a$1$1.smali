.class final Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lOr:Landroid/widget/ListView;

.field final synthetic lOs:I

.field final synthetic lQf:Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1;


# direct methods
.method constructor <init>(Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1;Landroid/widget/ListView;I)V
    .locals 0

    .prologue
    .line 236
    iput-object p1, p0, Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1$1;->lQf:Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1;

    iput-object p2, p0, Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1$1;->lOr:Landroid/widget/ListView;

    iput p3, p0, Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1$1;->lOs:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 241
    iget-object v0, p0, Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1$1;->lOr:Landroid/widget/ListView;

    iget v1, p0, Lcom/tencent/mm/ui/conversation/EnterpriseConversationUI$a$1$1;->lOs:I

    const/16 v2, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->smoothScrollBy(II)V

    .line 242
    return-void
.end method
