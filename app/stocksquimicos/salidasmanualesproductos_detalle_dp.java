package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_detalle_dp extends GXProcedure
{
   public salidasmanualesproductos_detalle_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_detalle_dp.class ), "" );
   }

   public salidasmanualesproductos_detalle_dp( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> executeUdp( String aP0 ,
                                                                                                   int aP1 )
   {
      salidasmanualesproductos_detalle_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>[] aP2 )
   {
      salidasmanualesproductos_detalle_dp.this.AV5Emprcod = aP0;
      salidasmanualesproductos_detalle_dp.this.AV6CumCodCont = aP1;
      salidasmanualesproductos_detalle_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002J2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6CumCodCont)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A859CumCodCont = P002J2_A859CumCodCont[0] ;
         A407EmprNom = P002J2_A407EmprNom[0] ;
         n407EmprNom = P002J2_n407EmprNom[0] ;
         A718PrdNom = P002J2_A718PrdNom[0] ;
         A860CumConCant = P002J2_A860CumConCant[0] ;
         A704PrdExiAlm = P002J2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P002J2_A705PrdExiCC[0] ;
         A685PrdCanRes = P002J2_A685PrdCanRes[0] ;
         A726PrdPreMed = P002J2_A726PrdPreMed[0] ;
         A707PrdFacCon = P002J2_A707PrdFacCon[0] ;
         A5862CumConLot = P002J2_A5862CumConLot[0] ;
         A750PrdValStk = P002J2_A750PrdValStk[0] ;
         A490ForPrdUMe = P002J2_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P002J2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P002J2_n488ForPrdDsc[0] ;
         A8639CumUnidad = P002J2_A8639CumUnidad[0] ;
         A12257PrdComID = P002J2_A12257PrdComID[0] ;
         A10881PrdLote = P002J2_A10881PrdLote[0] ;
         A12700CumUMed = P002J2_A12700CumUMed[0] ;
         A719PrdNum = P002J2_A719PrdNum[0] ;
         A396EmprCod = P002J2_A396EmprCod[0] ;
         A3915EmpNumDec = P002J2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P002J2_n3915EmpNumDec[0] ;
         A724PrdPreAct = P002J2_A724PrdPreAct[0] ;
         A861CumConCbis = P002J2_A861CumConCbis[0] ;
         A407EmprNom = P002J2_A407EmprNom[0] ;
         n407EmprNom = P002J2_n407EmprNom[0] ;
         A3915EmpNumDec = P002J2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P002J2_n3915EmpNumDec[0] ;
         A718PrdNom = P002J2_A718PrdNom[0] ;
         A704PrdExiAlm = P002J2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P002J2_A705PrdExiCC[0] ;
         A685PrdCanRes = P002J2_A685PrdCanRes[0] ;
         A726PrdPreMed = P002J2_A726PrdPreMed[0] ;
         A707PrdFacCon = P002J2_A707PrdFacCon[0] ;
         A750PrdValStk = P002J2_A750PrdValStk[0] ;
         A10881PrdLote = P002J2_A10881PrdLote[0] ;
         A724PrdPreAct = P002J2_A724PrdPreAct[0] ;
         A488ForPrdDsc = P002J2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P002J2_n488ForPrdDsc[0] ;
         if ( A3915EmpNumDec == 0 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            }
            else
            {
               A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            }
         }
         GXt_date1 = A3835UltFecCCs ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date4[0] = GXt_date1 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4) ;
         salidasmanualesproductos_detalle_dp.this.A396EmprCod = GXv_char2[0] ;
         salidasmanualesproductos_detalle_dp.this.A719PrdNum = GXv_char3[0] ;
         salidasmanualesproductos_detalle_dp.this.GXt_date1 = GXv_date4[0] ;
         A3835UltFecCCs = GXt_date1 ;
         Gxm1salidasmanualesproductos_detalle_sdt = (app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)new app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1salidasmanualesproductos_detalle_sdt, 0);
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod( A396EmprCod );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont( A859CumCodCont );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom( A407EmprNom );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum( A719PrdNum );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom( A718PrdNom );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant( A860CumConCant );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis( A861CumConCbis );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro( A863CumCosPro );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact( A724PrdPreAct );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( A704PrdExiAlm );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc( A705PrdExiCC );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( A685PrdCanRes );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed( A726PrdPreMed );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs( A3835UltFecCCs );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( A707PrdFacCon );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot( A5862CumConLot );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk( A750PrdValStk );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume( A490ForPrdUMe );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc( A488ForPrdDsc );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad( A8639CumUnidad );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid( A12257PrdComID );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote( A10881PrdLote );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed( A12700CumUMed );
         Gxm1salidasmanualesproductos_detalle_sdt.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar( false );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = salidasmanualesproductos_detalle_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>(app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT.class, "SalidasManualesProductos_Detalle_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P002J2_A859CumCodCont = new int[1] ;
      P002J2_A407EmprNom = new String[] {""} ;
      P002J2_n407EmprNom = new boolean[] {false} ;
      P002J2_A718PrdNom = new String[] {""} ;
      P002J2_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A5862CumConLot = new String[] {""} ;
      P002J2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A490ForPrdUMe = new byte[1] ;
      P002J2_A488ForPrdDsc = new String[] {""} ;
      P002J2_n488ForPrdDsc = new boolean[] {false} ;
      P002J2_A8639CumUnidad = new byte[1] ;
      P002J2_A12257PrdComID = new String[] {""} ;
      P002J2_A10881PrdLote = new String[] {""} ;
      P002J2_A12700CumUMed = new byte[1] ;
      P002J2_A719PrdNum = new String[] {""} ;
      P002J2_A396EmprCod = new String[] {""} ;
      P002J2_A3915EmpNumDec = new byte[1] ;
      P002J2_n3915EmpNumDec = new boolean[] {false} ;
      P002J2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J2_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A860CumConCant = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A12257PrdComID = "" ;
      A10881PrdLote = "" ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A861CumConCbis = DecimalUtil.ZERO ;
      A863CumCosPro = DecimalUtil.ZERO ;
      A3835UltFecCCs = GXutil.nullDate() ;
      GXt_date1 = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date4 = new java.util.Date[1] ;
      Gxm1salidasmanualesproductos_detalle_sdt = new app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle_dp__default(),
         new Object[] {
             new Object[] {
            P002J2_A859CumCodCont, P002J2_A407EmprNom, P002J2_n407EmprNom, P002J2_A718PrdNom, P002J2_A860CumConCant, P002J2_A704PrdExiAlm, P002J2_A705PrdExiCC, P002J2_A685PrdCanRes, P002J2_A726PrdPreMed, P002J2_A707PrdFacCon,
            P002J2_A5862CumConLot, P002J2_A750PrdValStk, P002J2_A490ForPrdUMe, P002J2_A488ForPrdDsc, P002J2_n488ForPrdDsc, P002J2_A8639CumUnidad, P002J2_A12257PrdComID, P002J2_A10881PrdLote, P002J2_A12700CumUMed, P002J2_A719PrdNum,
            P002J2_A396EmprCod, P002J2_A3915EmpNumDec, P002J2_n3915EmpNumDec, P002J2_A724PrdPreAct, P002J2_A861CumConCbis
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte A8639CumUnidad ;
   private byte A12700CumUMed ;
   private byte A3915EmpNumDec ;
   private short Gx_err ;
   private int AV6CumCodCont ;
   private int A859CumCodCont ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A861CumConCbis ;
   private java.math.BigDecimal A863CumCosPro ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A718PrdNom ;
   private String A5862CumConLot ;
   private String A488ForPrdDsc ;
   private String A12257PrdComID ;
   private String A10881PrdLote ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date GXt_date1 ;
   private java.util.Date GXv_date4[] ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean n3915EmpNumDec ;
   private GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P002J2_A859CumCodCont ;
   private String[] P002J2_A407EmprNom ;
   private boolean[] P002J2_n407EmprNom ;
   private String[] P002J2_A718PrdNom ;
   private java.math.BigDecimal[] P002J2_A860CumConCant ;
   private java.math.BigDecimal[] P002J2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P002J2_A705PrdExiCC ;
   private java.math.BigDecimal[] P002J2_A685PrdCanRes ;
   private java.math.BigDecimal[] P002J2_A726PrdPreMed ;
   private java.math.BigDecimal[] P002J2_A707PrdFacCon ;
   private String[] P002J2_A5862CumConLot ;
   private java.math.BigDecimal[] P002J2_A750PrdValStk ;
   private byte[] P002J2_A490ForPrdUMe ;
   private String[] P002J2_A488ForPrdDsc ;
   private boolean[] P002J2_n488ForPrdDsc ;
   private byte[] P002J2_A8639CumUnidad ;
   private String[] P002J2_A12257PrdComID ;
   private String[] P002J2_A10881PrdLote ;
   private byte[] P002J2_A12700CumUMed ;
   private String[] P002J2_A719PrdNum ;
   private String[] P002J2_A396EmprCod ;
   private byte[] P002J2_A3915EmpNumDec ;
   private boolean[] P002J2_n3915EmpNumDec ;
   private java.math.BigDecimal[] P002J2_A724PrdPreAct ;
   private java.math.BigDecimal[] P002J2_A861CumConCbis ;
   private GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> Gxm2rootcol ;
   private app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT Gxm1salidasmanualesproductos_detalle_sdt ;
}

final  class salidasmanualesproductos_detalle_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002J2", "SELECT T1.CumCodCont, T2.EmprNom, T3.PrdNom, T1.CumConCant, T3.PrdExiAlm, T3.PrdExiCC, T3.PrdCanRes, T3.PrdPreMed, T3.PrdFacCon, T1.CumConLot, T3.PrdValStk, T1.ForPrdUMe, T4.ForPrdDsc, T1.CumUnidad, T1.PrdComID, T3.PrdLote, T1.CumUMed, T1.PrdNum, T1.EmprCod, T2.EmpNumDec, T3.PrdPreAct, T1.CumConCbis FROM (((TXPLCUMCO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = T1.EmprCod AND T4.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.CumCodCont = ? ORDER BY T1.EmprCod, T1.CumCodCont ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 3);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,4);
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
               return;
      }
   }

}

