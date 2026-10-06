package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc123 extends GXProcedure
{
   public pprc123( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc123.class ), "" );
   }

   public pprc123( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           java.util.Date[] aP1 ,
                                           String[] aP2 )
   {
      pprc123.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pprc123.this.AV15Emprcod = aP0[0];
      this.aP0 = aP0;
      pprc123.this.AV21fec1 = aP1[0];
      this.aP1 = aP1;
      pprc123.this.AV16Prdnum = aP2[0];
      this.aP2 = aP2;
      pprc123.this.AV17Exis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV18EntSalInv ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15Emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int2) ;
      pprc123.this.GXt_int1 = GXv_int2[0] ;
      AV18EntSalInv = GXt_int1 ;
      AV17Exis = DecimalUtil.ZERO ;
      /* Using cursor P05LK2 */
      pr_default.execute(0, new Object[] {AV15Emprcod, AV16Prdnum, AV21fec1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05LK2_A396EmprCod[0] ;
         A719PrdNum = P05LK2_A719PrdNum[0] ;
         A3345TipMovCc = P05LK2_A3345TipMovCc[0] ;
         A3348CCStkFec = P05LK2_A3348CCStkFec[0] ;
         A3343CCStkCanE = P05LK2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P05LK2_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05LK2_A3356CCStkHor[0] ;
         A3342CCStkLin = P05LK2_A3342CCStkLin[0] ;
         AV19Ccstkcane = A3343CCStkCanE ;
         AV20Ccstkcans = A3344CCStkCanS ;
         if ( GXutil.strcmp(A3345TipMovCc, "SR") == 0 )
         {
            AV8Recfec = A3348CCStkFec ;
            /* Execute user subroutine: 'RECUENTO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV17Exis = ((AV18EntSalInv==0) ? AV10RecExiRea : AV10RecExiRea.add(AV13ComprasInv).subtract(AV14ConsumosInv)) ;
         }
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV19Ccstkcane = DecimalUtil.doubleToDec(0) ;
            AV20Ccstkcans = DecimalUtil.doubleToDec(0) ;
         }
         AV17Exis = AV17Exis.add((AV19Ccstkcane.subtract(AV20Ccstkcans))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'RECUENTO' Routine */
      returnInSub = false ;
      AV9Recexiteo = DecimalUtil.ZERO ;
      AV10RecExiRea = DecimalUtil.ZERO ;
      AV11RecExiTcc = DecimalUtil.ZERO ;
      AV12RecExiRcc = DecimalUtil.ZERO ;
      /* Using cursor P05LK3 */
      pr_default.execute(1, new Object[] {AV15Emprcod, AV16Prdnum, AV8Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A810RecFec = P05LK3_A810RecFec[0] ;
         A719PrdNum = P05LK3_A719PrdNum[0] ;
         A396EmprCod = P05LK3_A396EmprCod[0] ;
         A809RecExiTeo = P05LK3_A809RecExiTeo[0] ;
         A807RecExiRea = P05LK3_A807RecExiRea[0] ;
         A808RecExiTcc = P05LK3_A808RecExiTcc[0] ;
         A806RecExiRcc = P05LK3_A806RecExiRcc[0] ;
         AV9Recexiteo = A809RecExiTeo ;
         AV10RecExiRea = A807RecExiRea ;
         AV11RecExiTcc = A808RecExiTcc ;
         AV12RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXv_char3[0] = AV15Emprcod ;
      GXv_char4[0] = AV16Prdnum ;
      GXv_date5[0] = AV8Recfec ;
      GXv_decimal6[0] = AV13ComprasInv ;
      GXv_decimal7[0] = AV14ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_decimal6, GXv_decimal7) ;
      pprc123.this.AV15Emprcod = GXv_char3[0] ;
      pprc123.this.AV16Prdnum = GXv_char4[0] ;
      pprc123.this.AV8Recfec = GXv_date5[0] ;
      pprc123.this.AV13ComprasInv = GXv_decimal6[0] ;
      pprc123.this.AV14ConsumosInv = GXv_decimal7[0] ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc123.this.AV15Emprcod;
      this.aP1[0] = pprc123.this.AV21fec1;
      this.aP2[0] = pprc123.this.AV16Prdnum;
      this.aP3[0] = pprc123.this.AV17Exis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P05LK2_A396EmprCod = new String[] {""} ;
      P05LK2_A719PrdNum = new String[] {""} ;
      P05LK2_A3345TipMovCc = new String[] {""} ;
      P05LK2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05LK2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LK2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LK2_A3356CCStkHor = new String[] {""} ;
      P05LK2_A3342CCStkLin = new long[1] ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3356CCStkHor = "" ;
      AV19Ccstkcane = DecimalUtil.ZERO ;
      AV20Ccstkcans = DecimalUtil.ZERO ;
      AV8Recfec = GXutil.nullDate() ;
      AV10RecExiRea = DecimalUtil.ZERO ;
      AV13ComprasInv = DecimalUtil.ZERO ;
      AV14ConsumosInv = DecimalUtil.ZERO ;
      AV9Recexiteo = DecimalUtil.ZERO ;
      AV11RecExiTcc = DecimalUtil.ZERO ;
      AV12RecExiRcc = DecimalUtil.ZERO ;
      P05LK3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05LK3_A719PrdNum = new String[] {""} ;
      P05LK3_A396EmprCod = new String[] {""} ;
      P05LK3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LK3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LK3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LK3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc123__default(),
         new Object[] {
             new Object[] {
            P05LK2_A396EmprCod, P05LK2_A719PrdNum, P05LK2_A3345TipMovCc, P05LK2_A3348CCStkFec, P05LK2_A3343CCStkCanE, P05LK2_A3344CCStkCanS, P05LK2_A3356CCStkHor, P05LK2_A3342CCStkLin
            }
            , new Object[] {
            P05LK3_A810RecFec, P05LK3_A719PrdNum, P05LK3_A396EmprCod, P05LK3_A809RecExiTeo, P05LK3_A807RecExiRea, P05LK3_A808RecExiTcc, P05LK3_A806RecExiRcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18EntSalInv ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV17Exis ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV19Ccstkcane ;
   private java.math.BigDecimal AV20Ccstkcans ;
   private java.math.BigDecimal AV10RecExiRea ;
   private java.math.BigDecimal AV13ComprasInv ;
   private java.math.BigDecimal AV14ConsumosInv ;
   private java.math.BigDecimal AV9Recexiteo ;
   private java.math.BigDecimal AV11RecExiTcc ;
   private java.math.BigDecimal AV12RecExiRcc ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String AV15Emprcod ;
   private String AV16Prdnum ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private java.util.Date AV21fec1 ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV8Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date GXv_date5[] ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LK2_A396EmprCod ;
   private String[] P05LK2_A719PrdNum ;
   private String[] P05LK2_A3345TipMovCc ;
   private java.util.Date[] P05LK2_A3348CCStkFec ;
   private java.math.BigDecimal[] P05LK2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05LK2_A3344CCStkCanS ;
   private String[] P05LK2_A3356CCStkHor ;
   private long[] P05LK2_A3342CCStkLin ;
   private java.util.Date[] P05LK3_A810RecFec ;
   private String[] P05LK3_A719PrdNum ;
   private String[] P05LK3_A396EmprCod ;
   private java.math.BigDecimal[] P05LK3_A809RecExiTeo ;
   private java.math.BigDecimal[] P05LK3_A807RecExiRea ;
   private java.math.BigDecimal[] P05LK3_A808RecExiTcc ;
   private java.math.BigDecimal[] P05LK3_A806RecExiRcc ;
}

final  class pprc123__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LK2", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (TipMovCc <> 'EC') AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LK3", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 1 :
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

