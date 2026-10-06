package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ahistoricoreoperadosporclientetest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ahistoricoreoperadosporclientetest pgm = new ahistoricoreoperadosporclientetest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public ahistoricoreoperadosporclientetest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ahistoricoreoperadosporclientetest.class ), "" );
   }

   public ahistoricoreoperadosporclientetest( int remoteHandle ,
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
      GXt_objcol_SdtHistoricoReoperadosporCliente1 = AV13SDTHistoricoReoperadosporClienteCollection ;
      GXv_objcol_SdtHistoricoReoperadosporCliente2[0] = GXt_objcol_SdtHistoricoReoperadosporCliente1 ;
      new app.dphistoricoreoperadosporcliente(remoteHandle, context).execute( "001", 0, 999999, AV9FechaInicial, AV8FechaFinal, (short)(0), (short)(9999), " ", httpContext.getMessage( "zzzzzz", ""), (short)(0), (short)(9999), (byte)(1), GXv_objcol_SdtHistoricoReoperadosporCliente2) ;
      GXt_objcol_SdtHistoricoReoperadosporCliente1 = GXv_objcol_SdtHistoricoReoperadosporCliente2[0] ;
      AV13SDTHistoricoReoperadosporClienteCollection = GXt_objcol_SdtHistoricoReoperadosporCliente1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV13SDTHistoricoReoperadosporClienteCollection.toxml(false, true, "HistoricoReoperadosporClienteCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(historicoreoperadosporclientetest.class);
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
      AV13SDTHistoricoReoperadosporClienteCollection = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente>(app.SdtHistoricoReoperadosporCliente.class, "HistoricoReoperadosporCliente", "TexplusNET", remoteHandle);
      GXt_objcol_SdtHistoricoReoperadosporCliente1 = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente>(app.SdtHistoricoReoperadosporCliente.class, "HistoricoReoperadosporCliente", "TexplusNET", remoteHandle);
      GXv_objcol_SdtHistoricoReoperadosporCliente2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV9FechaInicial ;
   private java.util.Date AV8FechaFinal ;
   private GXBaseCollection<app.SdtHistoricoReoperadosporCliente> AV13SDTHistoricoReoperadosporClienteCollection ;
   private GXBaseCollection<app.SdtHistoricoReoperadosporCliente> GXt_objcol_SdtHistoricoReoperadosporCliente1 ;
   private GXBaseCollection<app.SdtHistoricoReoperadosporCliente> GXv_objcol_SdtHistoricoReoperadosporCliente2[] ;
}

