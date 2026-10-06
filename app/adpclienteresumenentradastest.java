package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpclienteresumenentradastest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpclienteresumenentradastest pgm = new adpclienteresumenentradastest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpclienteresumenentradastest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpclienteresumenentradastest.class ), "" );
   }

   public adpclienteresumenentradastest( int remoteHandle ,
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
      AV13FechaFinal = GXutil.resetTime(GXutil.now( )) ;
      AV14FechaInicial = GXutil.addmth( AV13FechaFinal, (short)(-1)) ;
      GXt_objcol_SdtSDTClienteResumenEntradas1 = AV15sdtClienteResumenEntradasCollection ;
      GXv_objcol_SdtSDTClienteResumenEntradas2[0] = GXt_objcol_SdtSDTClienteResumenEntradas1 ;
      new app.dpclienteresumenentradas(remoteHandle, context).execute( "001", 1, 999999, AV14FechaInicial, AV13FechaFinal, " ", httpContext.getMessage( "zzzzzzzzzzzzzzzz", ""), (byte)(0), GXv_objcol_SdtSDTClienteResumenEntradas2) ;
      GXt_objcol_SdtSDTClienteResumenEntradas1 = GXv_objcol_SdtSDTClienteResumenEntradas2[0] ;
      AV15sdtClienteResumenEntradasCollection = GXt_objcol_SdtSDTClienteResumenEntradas1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV15sdtClienteResumenEntradasCollection.toxml(false, true, "SDTClienteResumenEntradasCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpclienteresumenentradastest.class);
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
      AV13FechaFinal = GXutil.nullDate() ;
      AV14FechaInicial = GXutil.nullDate() ;
      AV15sdtClienteResumenEntradasCollection = new GXBaseCollection<app.SdtSDTClienteResumenEntradas>(app.SdtSDTClienteResumenEntradas.class, "SDTClienteResumenEntradas", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTClienteResumenEntradas1 = new GXBaseCollection<app.SdtSDTClienteResumenEntradas>(app.SdtSDTClienteResumenEntradas.class, "SDTClienteResumenEntradas", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTClienteResumenEntradas2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV13FechaFinal ;
   private java.util.Date AV14FechaInicial ;
   private GXBaseCollection<app.SdtSDTClienteResumenEntradas> AV15sdtClienteResumenEntradasCollection ;
   private GXBaseCollection<app.SdtSDTClienteResumenEntradas> GXt_objcol_SdtSDTClienteResumenEntradas1 ;
   private GXBaseCollection<app.SdtSDTClienteResumenEntradas> GXv_objcol_SdtSDTClienteResumenEntradas2[] ;
}

