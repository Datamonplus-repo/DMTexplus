package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adphistoricoreoperadosresumenclientetest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adphistoricoreoperadosresumenclientetest pgm = new adphistoricoreoperadosresumenclientetest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adphistoricoreoperadosresumenclientetest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adphistoricoreoperadosresumenclientetest.class ), "" );
   }

   public adphistoricoreoperadosresumenclientetest( int remoteHandle ,
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
      AV8FechaFinal = GXutil.resetTime(GXutil.now( )) ;
      AV9FechaInicial = GXutil.addmth( AV8FechaFinal, (short)(-1)) ;
      GXt_objcol_SdtSDTHistoricoReoperadosResumenCliente1 = AV10SDTHistoricoReoperadosResumenClienteCollection ;
      GXv_objcol_SdtSDTHistoricoReoperadosResumenCliente2[0] = GXt_objcol_SdtSDTHistoricoReoperadosResumenCliente1 ;
      new app.dphistoricoreoperadosresumencliente(remoteHandle, context).execute( "001", 0, 999999, AV9FechaInicial, AV8FechaFinal, (short)(0), (short)(9999), " ", httpContext.getMessage( "zzzzzz", ""), (short)(0), (short)(9999), (byte)(1), GXv_objcol_SdtSDTHistoricoReoperadosResumenCliente2) ;
      GXt_objcol_SdtSDTHistoricoReoperadosResumenCliente1 = GXv_objcol_SdtSDTHistoricoReoperadosResumenCliente2[0] ;
      AV10SDTHistoricoReoperadosResumenClienteCollection = GXt_objcol_SdtSDTHistoricoReoperadosResumenCliente1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10SDTHistoricoReoperadosResumenClienteCollection.toxml(false, true, "SDTHistoricoReoperadosResumenClienteCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dphistoricoreoperadosresumenclientetest.class);
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
      AV8FechaFinal = GXutil.nullDate() ;
      AV9FechaInicial = GXutil.nullDate() ;
      AV10SDTHistoricoReoperadosResumenClienteCollection = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>(app.SdtSDTHistoricoReoperadosResumenCliente.class, "SDTHistoricoReoperadosResumenCliente", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTHistoricoReoperadosResumenCliente1 = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>(app.SdtSDTHistoricoReoperadosResumenCliente.class, "SDTHistoricoReoperadosResumenCliente", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHistoricoReoperadosResumenCliente2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV8FechaFinal ;
   private java.util.Date AV9FechaInicial ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente> AV10SDTHistoricoReoperadosResumenClienteCollection ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente> GXt_objcol_SdtSDTHistoricoReoperadosResumenCliente1 ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente> GXv_objcol_SdtSDTHistoricoReoperadosResumenCliente2[] ;
}

