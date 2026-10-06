package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsauxtablaalcalis extends GXProcedure
{
   public pinsauxtablaalcalis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsauxtablaalcalis.class ), "" );
   }

   public pinsauxtablaalcalis( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 ,
                           byte[] aP6 ,
                           byte[] aP7 ,
                           short[] aP8 ,
                           byte[] aP9 ,
                           byte[] aP10 )
   {
      pinsauxtablaalcalis.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        byte[] aP9 ,
                        byte[] aP10 ,
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 )
   {
      pinsauxtablaalcalis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsauxtablaalcalis.this.A6310Lb_TaAuxC = aP1[0];
      this.aP1 = aP1;
      pinsauxtablaalcalis.this.AV8ForCanSum = aP2[0];
      this.aP2 = aP2;
      pinsauxtablaalcalis.this.AV9Lb_numero = aP3[0];
      this.aP3 = aP3;
      pinsauxtablaalcalis.this.AV10Lb_opcion = aP4[0];
      this.aP4 = aP4;
      pinsauxtablaalcalis.this.AV11Lb_fam1 = aP5[0];
      this.aP5 = aP5;
      pinsauxtablaalcalis.this.AV12Lb_fam2 = aP6[0];
      this.aP6 = aP6;
      pinsauxtablaalcalis.this.AV13Lb_fam3 = aP7[0];
      this.aP7 = aP7;
      pinsauxtablaalcalis.this.AV14Lb_lineaPr = aP8[0];
      this.aP8 = aP8;
      pinsauxtablaalcalis.this.AV15Fibra = aP9[0];
      this.aP9 = aP9;
      pinsauxtablaalcalis.this.AV16InsAuxiliares = aP10[0];
      this.aP10 = aP10;
      pinsauxtablaalcalis.this.AV17Nfibra = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16InsAuxiliares = (byte)(0) ;
      /* Using cursor P06012 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6310Lb_TaAuxC, AV8ForCanSum, AV8ForCanSum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6378Lb_TauxLP = P06012_A6378Lb_TauxLP[0] ;
         A6315Lb_TaAuxCf = P06012_A6315Lb_TaAuxCf[0] ;
         A6314Lb_TaAuxCi = P06012_A6314Lb_TaAuxCi[0] ;
         A719PrdNum = P06012_A719PrdNum[0] ;
         A6316Lb_TaAuxCt = P06012_A6316Lb_TaAuxCt[0] ;
         A490ForPrdUMe = P06012_A490ForPrdUMe[0] ;
         A6317Lb_TauxOrd = P06012_A6317Lb_TauxOrd[0] ;
         A6313lb_TaAuxL = P06012_A6313lb_TaAuxL[0] ;
         A6315Lb_TaAuxCf = P06012_A6315Lb_TaAuxCf[0] ;
         A6314Lb_TaAuxCi = P06012_A6314Lb_TaAuxCi[0] ;
         AV16InsAuxiliares = (byte)(1) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV14Lb_lineaPr ;
         GXv_int3[0] = AV9Lb_numero ;
         GXv_char4[0] = AV10Lb_opcion ;
         GXv_char5[0] = A719PrdNum ;
         GXv_decimal6[0] = A6316Lb_TaAuxCt ;
         GXv_int7[0] = A490ForPrdUMe ;
         GXv_int8[0] = A6317Lb_TauxOrd ;
         GXv_int9[0] = AV17Nfibra ;
         new app.pauxproductos(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_decimal6, GXv_int7, GXv_int8, GXv_int9) ;
         pinsauxtablaalcalis.this.A396EmprCod = GXv_char1[0] ;
         pinsauxtablaalcalis.this.AV14Lb_lineaPr = GXv_int2[0] ;
         pinsauxtablaalcalis.this.AV9Lb_numero = GXv_int3[0] ;
         pinsauxtablaalcalis.this.AV10Lb_opcion = GXv_char4[0] ;
         pinsauxtablaalcalis.this.A719PrdNum = GXv_char5[0] ;
         pinsauxtablaalcalis.this.A6316Lb_TaAuxCt = GXv_decimal6[0] ;
         pinsauxtablaalcalis.this.A490ForPrdUMe = GXv_int7[0] ;
         pinsauxtablaalcalis.this.A6317Lb_TauxOrd = GXv_int8[0] ;
         pinsauxtablaalcalis.this.AV17Nfibra = GXv_int9[0] ;
         AV14Lb_lineaPr = (short)(AV14Lb_lineaPr+10) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsauxtablaalcalis.this.A396EmprCod;
      this.aP1[0] = pinsauxtablaalcalis.this.A6310Lb_TaAuxC;
      this.aP2[0] = pinsauxtablaalcalis.this.AV8ForCanSum;
      this.aP3[0] = pinsauxtablaalcalis.this.AV9Lb_numero;
      this.aP4[0] = pinsauxtablaalcalis.this.AV10Lb_opcion;
      this.aP5[0] = pinsauxtablaalcalis.this.AV11Lb_fam1;
      this.aP6[0] = pinsauxtablaalcalis.this.AV12Lb_fam2;
      this.aP7[0] = pinsauxtablaalcalis.this.AV13Lb_fam3;
      this.aP8[0] = pinsauxtablaalcalis.this.AV14Lb_lineaPr;
      this.aP9[0] = pinsauxtablaalcalis.this.AV15Fibra;
      this.aP10[0] = pinsauxtablaalcalis.this.AV16InsAuxiliares;
      this.aP11[0] = pinsauxtablaalcalis.this.AV17Nfibra;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P06012_A396EmprCod = new String[] {""} ;
      P06012_A6310Lb_TaAuxC = new String[] {""} ;
      P06012_A6378Lb_TauxLP = new short[1] ;
      P06012_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06012_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06012_A719PrdNum = new String[] {""} ;
      P06012_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06012_A490ForPrdUMe = new byte[1] ;
      P06012_A6317Lb_TauxOrd = new short[1] ;
      P06012_A6313lb_TaAuxL = new short[1] ;
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsauxtablaalcalis__default(),
         new Object[] {
             new Object[] {
            P06012_A396EmprCod, P06012_A6310Lb_TaAuxC, P06012_A6378Lb_TauxLP, P06012_A6315Lb_TaAuxCf, P06012_A6314Lb_TaAuxCi, P06012_A719PrdNum, P06012_A6316Lb_TaAuxCt, P06012_A490ForPrdUMe, P06012_A6317Lb_TauxOrd, P06012_A6313lb_TaAuxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Lb_fam1 ;
   private byte AV12Lb_fam2 ;
   private byte AV13Lb_fam3 ;
   private byte AV15Fibra ;
   private byte AV16InsAuxiliares ;
   private byte AV17Nfibra ;
   private byte A490ForPrdUMe ;
   private byte GXv_int7[] ;
   private byte GXv_int9[] ;
   private short AV14Lb_lineaPr ;
   private short A6378Lb_TauxLP ;
   private short A6317Lb_TauxOrd ;
   private short A6313lb_TaAuxL ;
   private short GXv_int2[] ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV9Lb_numero ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV8ForCanSum ;
   private java.math.BigDecimal A6315Lb_TaAuxCf ;
   private java.math.BigDecimal A6314Lb_TaAuxCi ;
   private java.math.BigDecimal A6316Lb_TaAuxCt ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String AV10Lb_opcion ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private byte[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private byte[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P06012_A396EmprCod ;
   private String[] P06012_A6310Lb_TaAuxC ;
   private short[] P06012_A6378Lb_TauxLP ;
   private java.math.BigDecimal[] P06012_A6315Lb_TaAuxCf ;
   private java.math.BigDecimal[] P06012_A6314Lb_TaAuxCi ;
   private String[] P06012_A719PrdNum ;
   private java.math.BigDecimal[] P06012_A6316Lb_TaAuxCt ;
   private byte[] P06012_A490ForPrdUMe ;
   private short[] P06012_A6317Lb_TauxOrd ;
   private short[] P06012_A6313lb_TaAuxL ;
}

final  class pinsauxtablaalcalis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06012", "SELECT T1.EmprCod, T1.Lb_TaAuxC, T1.Lb_TauxLP, T2.Lb_TaAuxCf, T2.Lb_TaAuxCi, T1.PrdNum, T1.Lb_TaAuxCt, T1.ForPrdUMe, T1.Lb_TauxOrd, T1.lb_TaAuxL FROM (TXPENS007 T1 INNER JOIN TXPENS008 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_TaAuxC = T1.Lb_TaAuxC AND T2.lb_TaAuxL = T1.lb_TaAuxL) WHERE (T1.EmprCod = ? and T1.Lb_TaAuxC = ?) AND (? >= T2.Lb_TaAuxCi) AND (? <= T2.Lb_TaAuxCf) AND (T1.Lb_TauxLP > 0) ORDER BY T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               stmt.setString(2, (String)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
      }
   }

}

