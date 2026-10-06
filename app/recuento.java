package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuento extends GXProcedure
{
   public recuento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuento.class ), "" );
   }

   public recuento( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.util.Date[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      recuento.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      recuento.this.AV13Emprcod = aP0[0];
      this.aP0 = aP0;
      recuento.this.AV17Prdnum = aP1[0];
      this.aP1 = aP1;
      recuento.this.AV8RecFec = aP2[0];
      this.aP2 = aP2;
      recuento.this.aP3 = aP3;
      recuento.this.aP4 = aP4;
      recuento.this.aP5 = aP5;
      recuento.this.aP6 = aP6;
      recuento.this.aP7 = aP7;
      recuento.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV10RecExiRea = DecimalUtil.doubleToDec(0) ;
      AV11RecExiTcc = DecimalUtil.doubleToDec(0) ;
      AV12RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08R22 */
      pr_default.execute(0, new Object[] {AV13Emprcod, AV17Prdnum, AV8RecFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P08R22_A810RecFec[0] ;
         A719PrdNum = P08R22_A719PrdNum[0] ;
         A396EmprCod = P08R22_A396EmprCod[0] ;
         A809RecExiTeo = P08R22_A809RecExiTeo[0] ;
         A807RecExiRea = P08R22_A807RecExiRea[0] ;
         A808RecExiTcc = P08R22_A808RecExiTcc[0] ;
         A806RecExiRcc = P08R22_A806RecExiRcc[0] ;
         AV9Recexiteo = A809RecExiTeo ;
         AV10RecExiRea = A807RecExiRea ;
         AV11RecExiTcc = A808RecExiTcc ;
         AV12RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char1[0] = AV13Emprcod ;
      GXv_char2[0] = AV17Prdnum ;
      GXv_date3[0] = AV8RecFec ;
      GXv_decimal4[0] = AV15ComprasInv ;
      GXv_decimal5[0] = AV16ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_date3, GXv_decimal4, GXv_decimal5) ;
      recuento.this.AV13Emprcod = GXv_char1[0] ;
      recuento.this.AV17Prdnum = GXv_char2[0] ;
      recuento.this.AV8RecFec = GXv_date3[0] ;
      recuento.this.AV15ComprasInv = GXv_decimal4[0] ;
      recuento.this.AV16ConsumosInv = GXv_decimal5[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = recuento.this.AV13Emprcod;
      this.aP1[0] = recuento.this.AV17Prdnum;
      this.aP2[0] = recuento.this.AV8RecFec;
      this.aP3[0] = recuento.this.AV15ComprasInv;
      this.aP4[0] = recuento.this.AV16ConsumosInv;
      this.aP5[0] = recuento.this.AV12RecExiRcc;
      this.aP6[0] = recuento.this.AV10RecExiRea;
      this.aP7[0] = recuento.this.AV11RecExiTcc;
      this.aP8[0] = recuento.this.AV9Recexiteo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15ComprasInv = DecimalUtil.ZERO ;
      AV16ConsumosInv = DecimalUtil.ZERO ;
      AV12RecExiRcc = DecimalUtil.ZERO ;
      AV10RecExiRea = DecimalUtil.ZERO ;
      AV11RecExiTcc = DecimalUtil.ZERO ;
      AV9Recexiteo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08R22_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08R22_A719PrdNum = new String[] {""} ;
      P08R22_A396EmprCod = new String[] {""} ;
      P08R22_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R22_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R22_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R22_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuento__default(),
         new Object[] {
             new Object[] {
            P08R22_A810RecFec, P08R22_A719PrdNum, P08R22_A396EmprCod, P08R22_A809RecExiTeo, P08R22_A807RecExiRea, P08R22_A808RecExiTcc, P08R22_A806RecExiRcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV15ComprasInv ;
   private java.math.BigDecimal AV16ConsumosInv ;
   private java.math.BigDecimal AV12RecExiRcc ;
   private java.math.BigDecimal AV10RecExiRea ;
   private java.math.BigDecimal AV11RecExiTcc ;
   private java.math.BigDecimal AV9Recexiteo ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String AV13Emprcod ;
   private String AV17Prdnum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private java.util.Date AV8RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date GXv_date3[] ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08R22_A810RecFec ;
   private String[] P08R22_A719PrdNum ;
   private String[] P08R22_A396EmprCod ;
   private java.math.BigDecimal[] P08R22_A809RecExiTeo ;
   private java.math.BigDecimal[] P08R22_A807RecExiRea ;
   private java.math.BigDecimal[] P08R22_A808RecExiTcc ;
   private java.math.BigDecimal[] P08R22_A806RecExiRcc ;
}

final  class recuento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08R22", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

