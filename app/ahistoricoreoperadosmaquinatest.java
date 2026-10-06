package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ahistoricoreoperadosmaquinatest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ahistoricoreoperadosmaquinatest pgm = new ahistoricoreoperadosmaquinatest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public ahistoricoreoperadosmaquinatest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ahistoricoreoperadosmaquinatest.class ), "" );
   }

   public ahistoricoreoperadosmaquinatest( int remoteHandle ,
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
      AV8FechaInicial = localUtil.ctod( "01/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV9FechaFinal = localUtil.ctod( "19/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_objcol_SdtSDTHistoricoReoperadosMaquina1 = AV11SDTHistoricoReoperadosMaquinaCollection ;
      GXv_objcol_SdtSDTHistoricoReoperadosMaquina2[0] = GXt_objcol_SdtSDTHistoricoReoperadosMaquina1 ;
      new app.dphistoricoreoperadosmaquina(remoteHandle, context).execute( "001", 0, 999999, AV8FechaInicial, AV9FechaFinal, (short)(0), (short)(9999), " ", httpContext.getMessage( "zzzzzz", ""), (short)(0), (short)(9999), (byte)(1), GXv_objcol_SdtSDTHistoricoReoperadosMaquina2) ;
      GXt_objcol_SdtSDTHistoricoReoperadosMaquina1 = GXv_objcol_SdtSDTHistoricoReoperadosMaquina2[0] ;
      AV11SDTHistoricoReoperadosMaquinaCollection = GXt_objcol_SdtSDTHistoricoReoperadosMaquina1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV12SDTHistoricoReoperadosMaquina.toxml(false, true, "SDTHistoricoReoperadosMaquina", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(historicoreoperadosmaquinatest.class);
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
      AV8FechaInicial = GXutil.nullDate() ;
      AV9FechaFinal = GXutil.nullDate() ;
      AV11SDTHistoricoReoperadosMaquinaCollection = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>(app.SdtSDTHistoricoReoperadosMaquina.class, "SDTHistoricoReoperadosMaquina", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTHistoricoReoperadosMaquina1 = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>(app.SdtSDTHistoricoReoperadosMaquina.class, "SDTHistoricoReoperadosMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHistoricoReoperadosMaquina2 = new GXBaseCollection[1] ;
      AV12SDTHistoricoReoperadosMaquina = new app.SdtSDTHistoricoReoperadosMaquina(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV8FechaInicial ;
   private java.util.Date AV9FechaFinal ;
   private app.SdtSDTHistoricoReoperadosMaquina AV12SDTHistoricoReoperadosMaquina ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina> AV11SDTHistoricoReoperadosMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina> GXt_objcol_SdtSDTHistoricoReoperadosMaquina1 ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina> GXv_objcol_SdtSDTHistoricoReoperadosMaquina2[] ;
}

