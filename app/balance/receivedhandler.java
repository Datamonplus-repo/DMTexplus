package app.balance ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class receivedhandler extends GXProcedure
{
   public receivedhandler( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( receivedhandler.class ), "" );
   }

   public receivedhandler( int remoteHandle ,
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
      receivedhandler.this.AV9Client_id = aP0;
      receivedhandler.this.AV8NotificationInfo = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10WebNotification.broadcast(AV8NotificationInfo);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV8NotificationInfo.toJSonString(false, true), AV13Pgmname) ;
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
      AV10WebNotification = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      AV13Pgmname = "" ;
      AV13Pgmname = "Balance.ReceivedHandler" ;
      /* GeneXus formulas. */
      AV13Pgmname = "Balance.ReceivedHandler" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13Pgmname ;
   private String AV9Client_id ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV8NotificationInfo ;
   private com.genexuscore.genexus.server.SdtSocket AV10WebNotification ;
}

