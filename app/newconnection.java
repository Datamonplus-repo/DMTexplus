package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class newconnection extends GXProcedure
{
   public newconnection( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( newconnection.class ), "" );
   }

   public newconnection( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String aP0 )
   {
      newconnection.this.AV8clientId = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10NotificationInfo.setgxTv_SdtNotificationInfo_Id( httpContext.getMessage( "NewClient", "") );
      AV10NotificationInfo.setgxTv_SdtNotificationInfo_Message( GXutil.trim( AV8clientId) );
      AV9WebNotification.broadcast(AV10NotificationInfo);
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
      AV10NotificationInfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      AV9WebNotification = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8clientId ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV10NotificationInfo ;
   private com.genexuscore.genexus.server.SdtSocket AV9WebNotification ;
}

