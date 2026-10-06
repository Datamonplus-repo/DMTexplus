package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_ins_upd_lmetpi extends GXProcedure
{
   public documentodetransporteproduccion_ins_upd_lmetpi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_ins_upd_lmetpi.class ), "" );
   }

   public documentodetransporteproduccion_ins_upd_lmetpi( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        short aP8 ,
                        java.math.BigDecimal aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             short aP8 ,
                             java.math.BigDecimal aP9 )
   {
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV8emprcod = aP0;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV9MetTerCod = aP1;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV10Barcod = aP2;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV11Barcodreo = aP3;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV12barcodpar = aP4;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV13metpiecod = aP5;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV14metpiekil = aP6;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV15metpiemet = aP7;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV16MetPieAnc = aP8;
      documentodetransporteproduccion_ins_upd_lmetpi.this.AV17MetPieMtD = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20GXLvl2 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AKY2 */
      pr_default.execute(0, new Object[] {AV17MetPieMtD, Short.valueOf(AV16MetPieAnc), AV15metpiemet, AV14metpiekil, AV8emprcod, AV9MetTerCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV11Barcodreo), AV12barcodpar, AV13metpiecod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV20GXLvl2 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
      /* End optimized UPDATE. */
      if ( AV20GXLvl2 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLMETPI

         */
         A396EmprCod = AV8emprcod ;
         A2809MetTerCod = AV9MetTerCod ;
         A129BarCod = AV10Barcod ;
         A132BarCodReo = AV11Barcodreo ;
         A130BarCodPar = AV12barcodpar ;
         A2813MetPieCod = AV13metpiecod ;
         A2814MetPieKil = AV14metpiekil ;
         A2815MetPieMet = AV15metpiemet ;
         A6635MetPieAnc = AV16MetPieAnc ;
         A4910MetPieMtD = AV17MetPieMtD ;
         A10780MetPiectr = " " ;
         /* Using cursor P0AKY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, A4910MetPieMtD, Short.valueOf(A6635MetPieAnc), A10780MetPiectr});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_ins_upd_lmetpi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A10780MetPiectr = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_ins_upd_lmetpi__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte AV20GXLvl2 ;
   private byte A132BarCodReo ;
   private short AV16MetPieAnc ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV10Barcod ;
   private int GX_INS413 ;
   private int A129BarCod ;
   private java.math.BigDecimal AV14metpiekil ;
   private java.math.BigDecimal AV15metpiemet ;
   private java.math.BigDecimal AV17MetPieMtD ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private String AV8emprcod ;
   private String AV9MetTerCod ;
   private String AV12barcodpar ;
   private String AV13metpiecod ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String A10780MetPiectr ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class documentodetransporteproduccion_ins_upd_lmetpi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AKY2", "UPDATE TXPLMETPI SET MetPieMtD=?, MetPieAnc=?, MetPieMet=?, MetPieKil=?  WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new UpdateCursor("P0AKY3", "INSERT INTO TXPLMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieMtD, MetPieAnc, MetPiectr, MetPieEst, MetPieDsc, MetPieDef, MetPieFch, MetPieOb, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 40);
               return;
      }
   }

}

