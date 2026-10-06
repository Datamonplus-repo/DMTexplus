package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_obtengodatos extends GXProcedure
{
   public documentotransporteproveedor_obtengodatos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_obtengodatos.class ), "" );
   }

   public documentotransporteproveedor_obtengodatos( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            short aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            String[] aP6 ,
                            short[] aP7 ,
                            String[] aP8 ,
                            java.math.BigDecimal[] aP9 ,
                            String[] aP10 ,
                            String[] aP11 ,
                            String[] aP12 )
   {
      documentotransporteproveedor_obtengodatos.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 )
   {
      documentotransporteproveedor_obtengodatos.this.AV10emprcod = aP0;
      documentotransporteproveedor_obtengodatos.this.AV8AlbProID = aP1;
      documentotransporteproveedor_obtengodatos.this.AV9AlbProLinea = aP2;
      documentotransporteproveedor_obtengodatos.this.aP3 = aP3;
      documentotransporteproveedor_obtengodatos.this.aP4 = aP4;
      documentotransporteproveedor_obtengodatos.this.aP5 = aP5;
      documentotransporteproveedor_obtengodatos.this.aP6 = aP6;
      documentotransporteproveedor_obtengodatos.this.aP7 = aP7;
      documentotransporteproveedor_obtengodatos.this.aP8 = aP8;
      documentotransporteproveedor_obtengodatos.this.aP9 = aP9;
      documentotransporteproveedor_obtengodatos.this.aP10 = aP10;
      documentotransporteproveedor_obtengodatos.this.aP11 = aP11;
      documentotransporteproveedor_obtengodatos.this.aP12 = aP12;
      documentotransporteproveedor_obtengodatos.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12AlbProCnt = DecimalUtil.ZERO ;
      AV18AlbProCntold = DecimalUtil.ZERO ;
      AV16AlbProDsc = "" ;
      AV19AlbProDscold = "" ;
      AV11Prdnum = "" ;
      AV20prdnumold = "" ;
      AV17lalpro = (short)(0) ;
      AV15AlbProObsLin = "" ;
      AV21albprolote = "" ;
      AV14AlbProCajas = (short)(1) ;
      AV13AlbProUnd = "Kg" ;
      /* Using cursor P0AIH2 */
      pr_default.execute(0, new Object[] {AV10emprcod, Integer.valueOf(AV8AlbProID), Short.valueOf(AV9AlbProLinea)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13442AlbProLine = P0AIH2_A13442AlbProLine[0] ;
         A13418AlbProID = P0AIH2_A13418AlbProID[0] ;
         A396EmprCod = P0AIH2_A396EmprCod[0] ;
         A13449AlbProCaja = P0AIH2_A13449AlbProCaja[0] ;
         n13449AlbProCaja = P0AIH2_n13449AlbProCaja[0] ;
         A13443AlbProCnt = P0AIH2_A13443AlbProCnt[0] ;
         n13443AlbProCnt = P0AIH2_n13443AlbProCnt[0] ;
         A13448AlbProDsc = P0AIH2_A13448AlbProDsc[0] ;
         n13448AlbProDsc = P0AIH2_n13448AlbProDsc[0] ;
         A719PrdNum = P0AIH2_A719PrdNum[0] ;
         A13444AlbProUnd = P0AIH2_A13444AlbProUnd[0] ;
         n13444AlbProUnd = P0AIH2_n13444AlbProUnd[0] ;
         A13447AlbProObsL = P0AIH2_A13447AlbProObsL[0] ;
         n13447AlbProObsL = P0AIH2_n13447AlbProObsL[0] ;
         A14401AlbProLote = P0AIH2_A14401AlbProLote[0] ;
         n14401AlbProLote = P0AIH2_n14401AlbProLote[0] ;
         AV14AlbProCajas = A13449AlbProCaja ;
         AV12AlbProCnt = A13443AlbProCnt ;
         AV18AlbProCntold = A13443AlbProCnt ;
         AV16AlbProDsc = A13448AlbProDsc ;
         AV19AlbProDscold = A13448AlbProDsc ;
         AV11Prdnum = A719PrdNum ;
         AV20prdnumold = A719PrdNum ;
         AV17lalpro = (short)(1) ;
         AV13AlbProUnd = A13444AlbProUnd ;
         AV15AlbProObsLin = A13447AlbProObsL ;
         AV21albprolote = A14401AlbProLote ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransporteproveedor_obtengodatos.this.AV11Prdnum;
      this.aP4[0] = documentotransporteproveedor_obtengodatos.this.AV16AlbProDsc;
      this.aP5[0] = documentotransporteproveedor_obtengodatos.this.AV12AlbProCnt;
      this.aP6[0] = documentotransporteproveedor_obtengodatos.this.AV13AlbProUnd;
      this.aP7[0] = documentotransporteproveedor_obtengodatos.this.AV14AlbProCajas;
      this.aP8[0] = documentotransporteproveedor_obtengodatos.this.AV15AlbProObsLin;
      this.aP9[0] = documentotransporteproveedor_obtengodatos.this.AV18AlbProCntold;
      this.aP10[0] = documentotransporteproveedor_obtengodatos.this.AV19AlbProDscold;
      this.aP11[0] = documentotransporteproveedor_obtengodatos.this.AV20prdnumold;
      this.aP12[0] = documentotransporteproveedor_obtengodatos.this.AV21albprolote;
      this.aP13[0] = documentotransporteproveedor_obtengodatos.this.AV17lalpro;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Prdnum = "" ;
      AV16AlbProDsc = "" ;
      AV12AlbProCnt = DecimalUtil.ZERO ;
      AV13AlbProUnd = "" ;
      AV15AlbProObsLin = "" ;
      AV18AlbProCntold = DecimalUtil.ZERO ;
      AV19AlbProDscold = "" ;
      AV20prdnumold = "" ;
      AV21albprolote = "" ;
      scmdbuf = "" ;
      P0AIH2_A13442AlbProLine = new short[1] ;
      P0AIH2_A13418AlbProID = new int[1] ;
      P0AIH2_A396EmprCod = new String[] {""} ;
      P0AIH2_A13449AlbProCaja = new short[1] ;
      P0AIH2_n13449AlbProCaja = new boolean[] {false} ;
      P0AIH2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIH2_n13443AlbProCnt = new boolean[] {false} ;
      P0AIH2_A13448AlbProDsc = new String[] {""} ;
      P0AIH2_n13448AlbProDsc = new boolean[] {false} ;
      P0AIH2_A719PrdNum = new String[] {""} ;
      P0AIH2_A13444AlbProUnd = new String[] {""} ;
      P0AIH2_n13444AlbProUnd = new boolean[] {false} ;
      P0AIH2_A13447AlbProObsL = new String[] {""} ;
      P0AIH2_n13447AlbProObsL = new boolean[] {false} ;
      P0AIH2_A14401AlbProLote = new String[] {""} ;
      P0AIH2_n14401AlbProLote = new boolean[] {false} ;
      A396EmprCod = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13448AlbProDsc = "" ;
      A719PrdNum = "" ;
      A13444AlbProUnd = "" ;
      A13447AlbProObsL = "" ;
      A14401AlbProLote = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_obtengodatos__default(),
         new Object[] {
             new Object[] {
            P0AIH2_A13442AlbProLine, P0AIH2_A13418AlbProID, P0AIH2_A396EmprCod, P0AIH2_A13449AlbProCaja, P0AIH2_n13449AlbProCaja, P0AIH2_A13443AlbProCnt, P0AIH2_n13443AlbProCnt, P0AIH2_A13448AlbProDsc, P0AIH2_n13448AlbProDsc, P0AIH2_A719PrdNum,
            P0AIH2_A13444AlbProUnd, P0AIH2_n13444AlbProUnd, P0AIH2_A13447AlbProObsL, P0AIH2_n13447AlbProObsL, P0AIH2_A14401AlbProLote, P0AIH2_n14401AlbProLote
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9AlbProLinea ;
   private short AV14AlbProCajas ;
   private short AV17lalpro ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short Gx_err ;
   private int AV8AlbProID ;
   private int A13418AlbProID ;
   private java.math.BigDecimal AV12AlbProCnt ;
   private java.math.BigDecimal AV18AlbProCntold ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String AV10emprcod ;
   private String AV11Prdnum ;
   private String AV16AlbProDsc ;
   private String AV13AlbProUnd ;
   private String AV15AlbProObsLin ;
   private String AV19AlbProDscold ;
   private String AV20prdnumold ;
   private String AV21albprolote ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A13448AlbProDsc ;
   private String A719PrdNum ;
   private String A13444AlbProUnd ;
   private String A13447AlbProObsL ;
   private String A14401AlbProLote ;
   private boolean n13449AlbProCaja ;
   private boolean n13443AlbProCnt ;
   private boolean n13448AlbProDsc ;
   private boolean n13444AlbProUnd ;
   private boolean n13447AlbProObsL ;
   private boolean n14401AlbProLote ;
   private short[] aP13 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AIH2_A13442AlbProLine ;
   private int[] P0AIH2_A13418AlbProID ;
   private String[] P0AIH2_A396EmprCod ;
   private short[] P0AIH2_A13449AlbProCaja ;
   private boolean[] P0AIH2_n13449AlbProCaja ;
   private java.math.BigDecimal[] P0AIH2_A13443AlbProCnt ;
   private boolean[] P0AIH2_n13443AlbProCnt ;
   private String[] P0AIH2_A13448AlbProDsc ;
   private boolean[] P0AIH2_n13448AlbProDsc ;
   private String[] P0AIH2_A719PrdNum ;
   private String[] P0AIH2_A13444AlbProUnd ;
   private boolean[] P0AIH2_n13444AlbProUnd ;
   private String[] P0AIH2_A13447AlbProObsL ;
   private boolean[] P0AIH2_n13447AlbProObsL ;
   private String[] P0AIH2_A14401AlbProLote ;
   private boolean[] P0AIH2_n14401AlbProLote ;
}

final  class documentotransporteproveedor_obtengodatos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIH2", "SELECT AlbProLine, AlbProID, EmprCod, AlbProCaja, AlbProCnt, AlbProDsc, PrdNum, AlbProUnd, AlbProObsL, AlbProLote FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? and AlbProLine = ? ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

