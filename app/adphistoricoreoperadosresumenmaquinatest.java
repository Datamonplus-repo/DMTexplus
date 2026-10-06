package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adphistoricoreoperadosresumenmaquinatest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adphistoricoreoperadosresumenmaquinatest pgm = new adphistoricoreoperadosresumenmaquinatest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adphistoricoreoperadosresumenmaquinatest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adphistoricoreoperadosresumenmaquinatest.class ), "" );
   }

   public adphistoricoreoperadosresumenmaquinatest( int remoteHandle ,
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
      GXt_objcol_SdtSDTHistoricoReoperadosResumenMaquina1 = AV8SDTHistoricoReoperadosResumenMaquinaCollection ;
      GXv_objcol_SdtSDTHistoricoReoperadosResumenMaquina2[0] = GXt_objcol_SdtSDTHistoricoReoperadosResumenMaquina1 ;
      new app.dphistoricoreoperadosresumenmaquina(remoteHandle, context).execute( "001", 0, 999999, AV10FechaInicial, AV9FechaFinal, (short)(0), (short)(9999), " ", httpContext.getMessage( "zzzzzz", ""), (short)(0), (short)(9999), (byte)(1), GXv_objcol_SdtSDTHistoricoReoperadosResumenMaquina2) ;
      GXt_objcol_SdtSDTHistoricoReoperadosResumenMaquina1 = GXv_objcol_SdtSDTHistoricoReoperadosResumenMaquina2[0] ;
      AV8SDTHistoricoReoperadosResumenMaquinaCollection = GXt_objcol_SdtSDTHistoricoReoperadosResumenMaquina1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV8SDTHistoricoReoperadosResumenMaquinaCollection.toxml(false, true, "SDTHistoricoReoperadosResumenMaquinaCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dphistoricoreoperadosresumenmaquinatest.class);
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
      AV8SDTHistoricoReoperadosResumenMaquinaCollection = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>(app.SdtSDTHistoricoReoperadosResumenMaquina.class, "SDTHistoricoReoperadosResumenMaquina", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTHistoricoReoperadosResumenMaquina1 = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>(app.SdtSDTHistoricoReoperadosResumenMaquina.class, "SDTHistoricoReoperadosResumenMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHistoricoReoperadosResumenMaquina2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV10FechaInicial ;
   private java.util.Date AV9FechaFinal ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina> AV8SDTHistoricoReoperadosResumenMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina> GXt_objcol_SdtSDTHistoricoReoperadosResumenMaquina1 ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina> GXv_objcol_SdtSDTHistoricoReoperadosResumenMaquina2[] ;
}

