package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpentregasresumenclientetest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpentregasresumenclientetest pgm = new adpentregasresumenclientetest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpentregasresumenclientetest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpentregasresumenclientetest.class ), "" );
   }

   public adpentregasresumenclientetest( int remoteHandle ,
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
      AV9AlbProFch_To = GXutil.resetTime(GXutil.now( )) ;
      AV8AlbProFch = GXutil.dadd( AV9AlbProFch_To, (-15)) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10sdtEntregasresumenclientecollection.toxml(false, true, "SDTEntregasResumenClienteCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpentregasresumenclientetest.class);
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
      AV9AlbProFch_To = GXutil.nullDate() ;
      AV8AlbProFch = GXutil.nullDate() ;
      AV10sdtEntregasresumenclientecollection = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV9AlbProFch_To ;
   private java.util.Date AV8AlbProFch ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> AV10sdtEntregasresumenclientecollection ;
}

