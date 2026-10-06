package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ahistoricoreoperadosresumentipodefectotest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ahistoricoreoperadosresumentipodefectotest pgm = new ahistoricoreoperadosresumentipodefectotest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public ahistoricoreoperadosresumentipodefectotest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ahistoricoreoperadosresumentipodefectotest.class ), "" );
   }

   public ahistoricoreoperadosresumentipodefectotest( int remoteHandle ,
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
      AV9FechaInicial = localUtil.ctod( "01/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV8FechaFinal = localUtil.ctod( "19/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto1 = AV10SDTHistoricoReoperadosResumenTipoDefectoCollection ;
      GXv_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto2[0] = GXt_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto1 ;
      new app.dphistoricoreoperadosresumentipodefecto(remoteHandle, context).execute( "001", 0, 999999, AV9FechaInicial, AV8FechaFinal, (short)(0), (short)(9999), " ", httpContext.getMessage( "zzzzzz", ""), (short)(0), (short)(9999), (byte)(1), GXv_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto2) ;
      GXt_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto1 = GXv_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto2[0] ;
      AV10SDTHistoricoReoperadosResumenTipoDefectoCollection = GXt_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10SDTHistoricoReoperadosResumenTipoDefectoCollection.toxml(false, true, "SDTHistoricoReoperadosResumenTipoDefectoCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(historicoreoperadosresumentipodefectotest.class);
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
      AV9FechaInicial = GXutil.nullDate() ;
      AV8FechaFinal = GXutil.nullDate() ;
      AV10SDTHistoricoReoperadosResumenTipoDefectoCollection = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto.class, "SDTHistoricoReoperadosResumenTipoDefecto", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto1 = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto.class, "SDTHistoricoReoperadosResumenTipoDefecto", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV9FechaInicial ;
   private java.util.Date AV8FechaFinal ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto> AV10SDTHistoricoReoperadosResumenTipoDefectoCollection ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto> GXt_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto1 ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto> GXv_objcol_SdtSDTHistoricoReoperadosResumenTipoDefecto2[] ;
}

