package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class newmessagereceived extends GXProcedure
{
   public newmessagereceived( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( newmessagereceived.class ), "" );
   }

   public newmessagereceived( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        com.genexuscore.genexus.server.SdtNotificationInfo aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             com.genexuscore.genexus.server.SdtNotificationInfo aP1 )
   {
      newmessagereceived.this.AV8ClientId = aP0;
      newmessagereceived.this.AV9NotificationInfo = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10NotificationInfoToSend.setgxTv_SdtNotificationInfo_Id( httpContext.getMessage( "Msg", "") );
      AV10NotificationInfoToSend.setgxTv_SdtNotificationInfo_Message( GXutil.format( "%1 (%2)", GXutil.trim( AV9NotificationInfo.getgxTv_SdtNotificationInfo_Message()), AV8ClientId, "", "", "", "", "", "", "") );
      AV11WebNotification.broadcast(AV10NotificationInfoToSend);
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10NotificationInfoToSend = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      AV11WebNotification = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8ClientId ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV10NotificationInfoToSend ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV9NotificationInfo ;
   private com.genexuscore.genexus.server.SdtSocket AV11WebNotification ;
}

