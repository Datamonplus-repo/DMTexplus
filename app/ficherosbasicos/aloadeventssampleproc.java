package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aloadeventssampleproc extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aloadeventssampleproc pgm = new aloadeventssampleproc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      java.util.Date aP0 = GXutil.nullDate();
      java.util.Date aP1 = GXutil.nullDate();
      app.ficherosbasicos.SdtSchedulerEvents[] aP2 = new app.ficherosbasicos.SdtSchedulerEvents[] {new app.ficherosbasicos.SdtSchedulerEvents()};

      try
      {
         aP0 = (java.util.Date) localUtil.ctod( args[0], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP1 = (java.util.Date) localUtil.ctod( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public aloadeventssampleproc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aloadeventssampleproc.class ), "" );
   }

   public aloadeventssampleproc( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.SdtSchedulerEvents executeUdp( java.util.Date aP0 ,
                                                             java.util.Date aP1 )
   {
      aloadeventssampleproc.this.aP2 = new app.ficherosbasicos.SdtSchedulerEvents[] {new app.ficherosbasicos.SdtSchedulerEvents()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        java.util.Date aP1 ,
                        app.ficherosbasicos.SdtSchedulerEvents[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             java.util.Date aP1 ,
                             app.ficherosbasicos.SdtSchedulerEvents[] aP2 )
   {
      aloadeventssampleproc.this.AV10dateFrom = aP0;
      aloadeventssampleproc.this.AV11dateTo = aP1;
      aloadeventssampleproc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8event.setgxTv_SdtSchedulerEvents_event_Id( httpContext.getMessage( "Sample1", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Name( httpContext.getMessage( "Wimbledon Match", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Notes( httpContext.getMessage( "Wimbledon Match", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Link( httpContext.getMessage( "http://www.genexus.com", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Starttime( localUtil.ymdhmsToT( (short)(GXutil.year( Gx_date)), (byte)(GXutil.month( Gx_date)), (byte)(GXutil.day( Gx_date)), (byte)(15), (byte)(30), (byte)(0)) );
      AV8event.setgxTv_SdtSchedulerEvents_event_Endtime( localUtil.ymdhmsToT( (short)(GXutil.year( Gx_date)), (byte)(GXutil.month( Gx_date)), (byte)(GXutil.day( Gx_date)), (byte)(17), (byte)(30), (byte)(0)) );
      AV8event.setgxTv_SdtSchedulerEvents_event_Additionalinformation( "" );
      AV9events.getgxTv_SdtSchedulerEvents_Items().add(AV8event, 0);
      AV8event = (app.ficherosbasicos.SdtSchedulerEvents_event)new app.ficherosbasicos.SdtSchedulerEvents_event(remoteHandle, context);
      AV8event.setgxTv_SdtSchedulerEvents_event_Id( httpContext.getMessage( "Sample2", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Name( httpContext.getMessage( "NBA Finals", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Notes( httpContext.getMessage( "NBA Finals", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Link( httpContext.getMessage( "http://www.gxtechnical.com", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Starttime( localUtil.ymdhmsToT( (short)(GXutil.year( Gx_date)), (byte)(GXutil.month( Gx_date)), (byte)(GXutil.day( Gx_date)), (byte)(21), (byte)(0), (byte)(0)) );
      AV8event.setgxTv_SdtSchedulerEvents_event_Endtime( localUtil.ymdhmsToT( (short)(GXutil.year( Gx_date)), (byte)(GXutil.month( Gx_date)), (byte)(GXutil.day( Gx_date)), (byte)(22), (byte)(45), (byte)(0)) );
      AV8event.setgxTv_SdtSchedulerEvents_event_Additionalinformation( "" );
      AV9events.getgxTv_SdtSchedulerEvents_Items().add(AV8event, 0);
      AV8event = (app.ficherosbasicos.SdtSchedulerEvents_event)new app.ficherosbasicos.SdtSchedulerEvents_event(remoteHandle, context);
      AV8event.setgxTv_SdtSchedulerEvents_event_Id( httpContext.getMessage( "Sample3", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Name( httpContext.getMessage( "Meeting with clients", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Notes( httpContext.getMessage( "Meeting with clients", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Link( httpContext.getMessage( "http://www.gxtechnical.com/gxsearch", "") );
      AV8event.setgxTv_SdtSchedulerEvents_event_Starttime( localUtil.ymdhmsToT( (short)(GXutil.year( Gx_date)), (byte)(GXutil.month( Gx_date)), (byte)(GXutil.day( Gx_date)+1), (byte)(8), (byte)(30), (byte)(0)) );
      AV8event.setgxTv_SdtSchedulerEvents_event_Endtime( localUtil.ymdhmsToT( (short)(GXutil.year( Gx_date)), (byte)(GXutil.month( Gx_date)), (byte)(GXutil.day( Gx_date)+1), (byte)(11), (byte)(30), (byte)(0)) );
      AV8event.setgxTv_SdtSchedulerEvents_event_Additionalinformation( "" );
      AV9events.getgxTv_SdtSchedulerEvents_Items().add(AV8event, 0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(loadeventssampleproc.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP2[0] = aloadeventssampleproc.this.AV9events;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9events = new app.ficherosbasicos.SdtSchedulerEvents(remoteHandle, context);
      AV8event = new app.ficherosbasicos.SdtSchedulerEvents_event(remoteHandle, context);
      Gx_date = GXutil.nullDate() ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV10dateFrom ;
   private java.util.Date AV11dateTo ;
   private java.util.Date Gx_date ;
   private app.ficherosbasicos.SdtSchedulerEvents_event AV8event ;
   private app.ficherosbasicos.SdtSchedulerEvents[] aP2 ;
   private app.ficherosbasicos.SdtSchedulerEvents AV9events ;
}

