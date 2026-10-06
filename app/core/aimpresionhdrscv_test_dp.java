package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aimpresionhdrscv_test_dp extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aimpresionhdrscv_test_dp pgm = new aimpresionhdrscv_test_dp (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aimpresionhdrscv_test_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aimpresionhdrscv_test_dp.class ), "" );
   }

   public aimpresionhdrscv_test_dp( int remoteHandle ,
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
      AV15BarFecGen = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(2)) ;
      AV16BarFecGen_to = GXutil.serverDate( context, remoteHandle, pr_default) ;
      AV17BarLis = (byte)(1) ;
      AV18BarEnccli = httpContext.getMessage( "SEMAA20210950", "") ;
      GXt_objcol_SdtImpresionHdrCv_SDT1 = AV10ImpresionHdrCv_SDTCollection ;
      GXv_objcol_SdtImpresionHdrCv_SDT2[0] = GXt_objcol_SdtImpresionHdrCv_SDT1 ;
      new app.impresionhdrscv_dp(remoteHandle, context).execute( "001", 0, (byte)(0), "", 99999999, (byte)(9), httpContext.getMessage( "z", ""), AV15BarFecGen, AV16BarFecGen_to, AV17BarLis, AV18BarEnccli, GXv_objcol_SdtImpresionHdrCv_SDT2) ;
      GXt_objcol_SdtImpresionHdrCv_SDT1 = GXv_objcol_SdtImpresionHdrCv_SDT2[0] ;
      AV10ImpresionHdrCv_SDTCollection = GXt_objcol_SdtImpresionHdrCv_SDT1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10ImpresionHdrCv_SDTCollection.toxml(false, true, "ImpresionHdrCv_SDTCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(impresionhdrscv_test_dp.class);
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
      AV15BarFecGen = GXutil.nullDate() ;
      AV16BarFecGen_to = GXutil.nullDate() ;
      AV18BarEnccli = "" ;
      AV10ImpresionHdrCv_SDTCollection = new GXBaseCollection<app.SdtImpresionHdrCv_SDT>(app.SdtImpresionHdrCv_SDT.class, "ImpresionHdrCv_SDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtImpresionHdrCv_SDT1 = new GXBaseCollection<app.SdtImpresionHdrCv_SDT>(app.SdtImpresionHdrCv_SDT.class, "ImpresionHdrCv_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtImpresionHdrCv_SDT2 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.aimpresionhdrscv_test_dp__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarLis ;
   private short Gx_err ;
   private String AV18BarEnccli ;
   private java.util.Date AV15BarFecGen ;
   private java.util.Date AV16BarFecGen_to ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> AV10ImpresionHdrCv_SDTCollection ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> GXt_objcol_SdtImpresionHdrCv_SDT1 ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> GXv_objcol_SdtImpresionHdrCv_SDT2[] ;
}

final  class aimpresionhdrscv_test_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

