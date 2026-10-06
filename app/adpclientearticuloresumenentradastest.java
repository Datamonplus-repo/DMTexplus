package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpclientearticuloresumenentradastest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpclientearticuloresumenentradastest pgm = new adpclientearticuloresumenentradastest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpclientearticuloresumenentradastest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpclientearticuloresumenentradastest.class ), "" );
   }

   public adpclientearticuloresumenentradastest( int remoteHandle ,
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
      GXt_objcol_SdtSDTClienteArticuloResumenEntradas1 = AV15sdtClienteArticuloResumenEntradasCollection ;
      GXv_objcol_SdtSDTClienteArticuloResumenEntradas2[0] = GXt_objcol_SdtSDTClienteArticuloResumenEntradas1 ;
      new app.dpclientearticuloresumenentradas(remoteHandle, context).execute( "001", 1, 2, AV14FechaInicial, AV13FechaFinal, " ", "zzzzzzzzzzzzzzzz", (byte)(0), GXv_objcol_SdtSDTClienteArticuloResumenEntradas2) ;
      GXt_objcol_SdtSDTClienteArticuloResumenEntradas1 = GXv_objcol_SdtSDTClienteArticuloResumenEntradas2[0] ;
      AV15sdtClienteArticuloResumenEntradasCollection = GXt_objcol_SdtSDTClienteArticuloResumenEntradas1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV15sdtClienteArticuloResumenEntradasCollection.toxml(false, true, "SDTClienteArticuloResumenEntradasCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpclientearticuloresumenentradastest.class);
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
      AV15sdtClienteArticuloResumenEntradasCollection = new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>(app.SdtSDTClienteArticuloResumenEntradas.class, "SDTClienteArticuloResumenEntradas", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTClienteArticuloResumenEntradas1 = new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>(app.SdtSDTClienteArticuloResumenEntradas.class, "SDTClienteArticuloResumenEntradas", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTClienteArticuloResumenEntradas2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV13FechaFinal ;
   private java.util.Date AV14FechaInicial ;
   private GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas> AV15sdtClienteArticuloResumenEntradasCollection ;
   private GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas> GXt_objcol_SdtSDTClienteArticuloResumenEntradas1 ;
   private GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas> GXv_objcol_SdtSDTClienteArticuloResumenEntradas2[] ;
}

