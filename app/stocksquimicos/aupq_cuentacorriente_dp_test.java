package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aupq_cuentacorriente_dp_test extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aupq_cuentacorriente_dp_test pgm = new aupq_cuentacorriente_dp_test (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aupq_cuentacorriente_dp_test( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aupq_cuentacorriente_dp_test.class ), "" );
   }

   public aupq_cuentacorriente_dp_test( int remoteHandle ,
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
      AV10Emprcod = "001" ;
      AV11Prdnum = "908308" ;
      AV8ccstkfecfrom = localUtil.ctod( "01/09/2023", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV9ccstkfecto = localUtil.ctod( "05/11/2023", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_objcol_SdtUPQ_CuentaCorriente_SDT1 = AV12UPQ_CuentaCorriente_SDT ;
      GXv_objcol_SdtUPQ_CuentaCorriente_SDT2[0] = GXt_objcol_SdtUPQ_CuentaCorriente_SDT1 ;
      new app.stocksquimicos.upq_cuentacorriente_dp(remoteHandle, context).execute( AV10Emprcod, AV11Prdnum, AV8ccstkfecfrom, AV9ccstkfecto, DecimalUtil.doubleToDec(0), GXv_objcol_SdtUPQ_CuentaCorriente_SDT2) ;
      GXt_objcol_SdtUPQ_CuentaCorriente_SDT1 = GXv_objcol_SdtUPQ_CuentaCorriente_SDT2[0] ;
      AV12UPQ_CuentaCorriente_SDT = GXt_objcol_SdtUPQ_CuentaCorriente_SDT1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV12UPQ_CuentaCorriente_SDT.toxml(false, true, "StocksQuimicos.UPQ_CuentaCorriente_SDTCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(upq_cuentacorriente_dp_test.class);
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
      AV10Emprcod = "" ;
      AV11Prdnum = "" ;
      AV8ccstkfecfrom = GXutil.nullDate() ;
      AV9ccstkfecto = GXutil.nullDate() ;
      AV12UPQ_CuentaCorriente_SDT = new GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>(app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT.class, "UPQ_CuentaCorriente_SDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtUPQ_CuentaCorriente_SDT1 = new GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>(app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT.class, "UPQ_CuentaCorriente_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtUPQ_CuentaCorriente_SDT2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10Emprcod ;
   private String AV11Prdnum ;
   private java.util.Date AV8ccstkfecfrom ;
   private java.util.Date AV9ccstkfecto ;
   private GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT> AV12UPQ_CuentaCorriente_SDT ;
   private GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT> GXt_objcol_SdtUPQ_CuentaCorriente_SDT1 ;
   private GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT> GXv_objcol_SdtUPQ_CuentaCorriente_SDT2[] ;
}

