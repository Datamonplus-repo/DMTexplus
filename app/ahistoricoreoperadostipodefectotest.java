package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ahistoricoreoperadostipodefectotest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ahistoricoreoperadostipodefectotest pgm = new ahistoricoreoperadostipodefectotest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public ahistoricoreoperadostipodefectotest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ahistoricoreoperadostipodefectotest.class ), "" );
   }

   public ahistoricoreoperadostipodefectotest( int remoteHandle ,
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
      AV10FechaInicial = localUtil.ctod( "01/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV9FechaFinal = localUtil.ctod( "19/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_objcol_SdtSDTHistoricoReoperadosTipoDefecto1 = AV12SDTHistoricoReoperadosTipoDefectoCollection ;
      GXv_objcol_SdtSDTHistoricoReoperadosTipoDefecto2[0] = GXt_objcol_SdtSDTHistoricoReoperadosTipoDefecto1 ;
      new app.dphistoricoreoperadostipodefecto(remoteHandle, context).execute( "001", 0, 999999, AV10FechaInicial, AV9FechaFinal, (short)(0), (short)(9999), " ", httpContext.getMessage( "zzzzzz", ""), (short)(0), (short)(9999), (byte)(1), GXv_objcol_SdtSDTHistoricoReoperadosTipoDefecto2) ;
      GXt_objcol_SdtSDTHistoricoReoperadosTipoDefecto1 = GXv_objcol_SdtSDTHistoricoReoperadosTipoDefecto2[0] ;
      AV12SDTHistoricoReoperadosTipoDefectoCollection = GXt_objcol_SdtSDTHistoricoReoperadosTipoDefecto1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV13SDTHistoricoReoperadosTipoDefecto.toxml(false, true, "SDTHistoricoReoperadosTipoDefecto", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(historicoreoperadostipodefectotest.class);
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
      AV10FechaInicial = GXutil.nullDate() ;
      AV9FechaFinal = GXutil.nullDate() ;
      AV12SDTHistoricoReoperadosTipoDefectoCollection = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto>(app.SdtSDTHistoricoReoperadosTipoDefecto.class, "SDTHistoricoReoperadosTipoDefecto", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTHistoricoReoperadosTipoDefecto1 = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto>(app.SdtSDTHistoricoReoperadosTipoDefecto.class, "SDTHistoricoReoperadosTipoDefecto", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHistoricoReoperadosTipoDefecto2 = new GXBaseCollection[1] ;
      AV13SDTHistoricoReoperadosTipoDefecto = new app.SdtSDTHistoricoReoperadosTipoDefecto(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV10FechaInicial ;
   private java.util.Date AV9FechaFinal ;
   private app.SdtSDTHistoricoReoperadosTipoDefecto AV13SDTHistoricoReoperadosTipoDefecto ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto> AV12SDTHistoricoReoperadosTipoDefectoCollection ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto> GXt_objcol_SdtSDTHistoricoReoperadosTipoDefecto1 ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto> GXv_objcol_SdtSDTHistoricoReoperadosTipoDefecto2[] ;
}

