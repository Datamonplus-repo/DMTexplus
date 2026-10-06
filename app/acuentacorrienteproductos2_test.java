package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class acuentacorrienteproductos2_test extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      acuentacorrienteproductos2_test pgm = new acuentacorrienteproductos2_test (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public acuentacorrienteproductos2_test( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( acuentacorrienteproductos2_test.class ), "" );
   }

   public acuentacorrienteproductos2_test( int remoteHandle ,
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
      AV12Emprcod = "001" ;
      AV11TipMovCcIN = "" ;
      AV9CCstkfec = localUtil.ctod( "01/10/21", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV10CCstkfec_to = GXutil.serverDate( context, remoteHandle, pr_default) ;
      AV13Existencias = DecimalUtil.stringToDec("124.7938") ;
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 = AV14CuentaCorrienteProductos2s ;
      GXv_objcol_SdtCuentaCorrienteProductos2_SDT2[0] = GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 ;
      new app.cuentacorrienteproductos2_dp(remoteHandle, context).execute( "001", "420106", AV9CCstkfec, AV10CCstkfec_to, " ", AV13Existencias, GXv_objcol_SdtCuentaCorrienteProductos2_SDT2) ;
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 = GXv_objcol_SdtCuentaCorrienteProductos2_SDT2[0] ;
      AV14CuentaCorrienteProductos2s = GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV14CuentaCorrienteProductos2s.toxml(false, true, "CuentaCorrienteProductos2_SDTCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(cuentacorrienteproductos2_test.class);
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
      AV12Emprcod = "" ;
      AV11TipMovCcIN = "" ;
      AV9CCstkfec = GXutil.nullDate() ;
      AV10CCstkfec_to = GXutil.nullDate() ;
      AV13Existencias = DecimalUtil.ZERO ;
      AV14CuentaCorrienteProductos2s = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtCuentaCorrienteProductos2_SDT2 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.acuentacorrienteproductos2_test__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV13Existencias ;
   private String AV12Emprcod ;
   private String AV11TipMovCcIN ;
   private java.util.Date AV9CCstkfec ;
   private java.util.Date AV10CCstkfec_to ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> AV14CuentaCorrienteProductos2s ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> GXv_objcol_SdtCuentaCorrienteProductos2_SDT2[] ;
}

final  class acuentacorrienteproductos2_test__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

