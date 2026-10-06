package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aforcegenerateobjs extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aforcegenerateobjs pgm = new aforcegenerateobjs (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aforcegenerateobjs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aforcegenerateobjs.class ), "" );
   }

   public aforcegenerateobjs( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.newmessagereceived(remoteHandle, context).execute( "", AV8notificationinfo) ;
      new app.newconnection(remoteHandle, context).execute( "") ;
      new app.wsocketerror(remoteHandle, context).execute( "", "") ;
      new app.lostconnection(remoteHandle, context).execute( "") ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(forcegenerateobjs.class);
      return new app.GXcfg();
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
      AV8notificationinfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV8notificationinfo ;
}

