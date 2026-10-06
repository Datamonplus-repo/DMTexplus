package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_upd extends GXProcedure
{
   public controlcalidad_cc1_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_upd.class ), "" );
   }

   public controlcalidad_cc1_upd( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        short aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        byte aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             short aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             byte aP11 )
   {
      controlcalidad_cc1_upd.this.A396EmprCod = aP0;
      controlcalidad_cc1_upd.this.A129BarCod = aP1;
      controlcalidad_cc1_upd.this.A132BarCodReo = aP2;
      controlcalidad_cc1_upd.this.A130BarCodPar = aP3;
      controlcalidad_cc1_upd.this.A758ProCod = aP4;
      controlcalidad_cc1_upd.this.A194BarOrdLin = aP5;
      controlcalidad_cc1_upd.this.A4031CCTCod = aP6;
      controlcalidad_cc1_upd.this.A4034CCTLin = aP7;
      controlcalidad_cc1_upd.this.AV9CCSMetodo = aP8;
      controlcalidad_cc1_upd.this.AV10CCSEspecif = aP9;
      controlcalidad_cc1_upd.this.AV14CCSVal = aP10;
      controlcalidad_cc1_upd.this.AV17CCoklin = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0AQ52 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV17CCoklin), AV14CCSVal, AV21CCEspecif, AV20CCMetodo, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_cc1_upd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21CCEspecif = "" ;
      AV20CCMetodo = "" ;
      A4035CCVal = "" ;
      A13252CCEspecif = "" ;
      A13251CCMetodo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_upd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17CCoklin ;
   private byte A12750CCOkLin ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV9CCSMetodo ;
   private String AV10CCSEspecif ;
   private String AV14CCSVal ;
   private String AV21CCEspecif ;
   private String AV20CCMetodo ;
   private String A4035CCVal ;
   private String A13252CCEspecif ;
   private String A13251CCMetodo ;
   private IDataStoreProvider pr_default ;
}

final  class controlcalidad_cc1_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AQ52", "UPDATE TXPCC1 SET CCOkLin=?, CCVal=?, CCEspecif=?, CCMetodo=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
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
            case 0 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

