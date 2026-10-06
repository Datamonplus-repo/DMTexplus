package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc125 extends GXProcedure
{
   public pprc125( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc125.class ), "" );
   }

   public pprc125( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           java.util.Date[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 )
   {
      pprc125.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pprc125.this.AV31Emprcod = aP0[0];
      this.aP0 = aP0;
      pprc125.this.AV37fec1 = aP1[0];
      this.aP1 = aP1;
      pprc125.this.AV32Prdnum = aP2[0];
      this.aP2 = aP2;
      pprc125.this.AV38PrdLote = aP3[0];
      this.aP3 = aP3;
      pprc125.this.AV33Exis = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV34EntSalInv ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV31Emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int2) ;
      pprc125.this.GXt_int1 = GXv_int2[0] ;
      AV34EntSalInv = GXt_int1 ;
      AV33Exis = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05LM2 */
      pr_default.execute(0, new Object[] {AV31Emprcod, AV32Prdnum, AV37fec1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05LM2_A396EmprCod[0] ;
         A719PrdNum = P05LM2_A719PrdNum[0] ;
         A3348CCStkFec = P05LM2_A3348CCStkFec[0] ;
         A5722CCStkLot = P05LM2_A5722CCStkLot[0] ;
         A3343CCStkCanE = P05LM2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P05LM2_A3344CCStkCanS[0] ;
         A3345TipMovCc = P05LM2_A3345TipMovCc[0] ;
         A3356CCStkHor = P05LM2_A3356CCStkHor[0] ;
         A3342CCStkLin = P05LM2_A3342CCStkLin[0] ;
         if ( ( GXutil.strcmp(A5722CCStkLot, AV38PrdLote) == 0 ) || ( GXutil.strcmp(AV38PrdLote, httpContext.getMessage( "S/N", "")) == 0 ) )
         {
            AV35Ccstkcane = A3343CCStkCanE ;
            AV36Ccstkcans = A3344CCStkCanS ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
               AV24Recfec = A3348CCStkFec ;
               /* Execute user subroutine: 'RECUENTO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV33Exis = ((AV34EntSalInv==0) ? AV26RecExiRea : AV26RecExiRea.add(AV29ComprasInv).subtract(AV30ConsumosInv)) ;
            }
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
               AV35Ccstkcane = DecimalUtil.doubleToDec(0) ;
               AV36Ccstkcans = DecimalUtil.doubleToDec(0) ;
            }
            AV33Exis = AV33Exis.add((AV35Ccstkcane.subtract(AV36Ccstkcans))) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'RECUENTO' Routine */
      returnInSub = false ;
      AV25Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV26RecExiRea = DecimalUtil.doubleToDec(0) ;
      AV27RecExiTcc = DecimalUtil.doubleToDec(0) ;
      AV28RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05LM3 */
      pr_default.execute(1, new Object[] {AV31Emprcod, AV32Prdnum, AV24Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12285RecLot = P05LM3_A12285RecLot[0] ;
         A810RecFec = P05LM3_A810RecFec[0] ;
         A719PrdNum = P05LM3_A719PrdNum[0] ;
         A396EmprCod = P05LM3_A396EmprCod[0] ;
         A809RecExiTeo = P05LM3_A809RecExiTeo[0] ;
         A807RecExiRea = P05LM3_A807RecExiRea[0] ;
         A808RecExiTcc = P05LM3_A808RecExiTcc[0] ;
         A806RecExiRcc = P05LM3_A806RecExiRcc[0] ;
         if ( ( GXutil.strcmp(A12285RecLot, AV38PrdLote) == 0 ) || ( GXutil.strcmp(AV38PrdLote, httpContext.getMessage( "S/N", "")) == 0 ) )
         {
            AV25Recexiteo = A809RecExiTeo ;
            AV26RecExiRea = A807RecExiRea ;
            AV27RecExiTcc = A808RecExiTcc ;
            AV28RecExiRcc = A806RecExiRcc ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV34EntSalInv == 1 )
      {
         GXv_char3[0] = AV31Emprcod ;
         GXv_char4[0] = AV32Prdnum ;
         GXv_date5[0] = AV24Recfec ;
         GXv_char6[0] = AV38PrdLote ;
         GXv_decimal7[0] = AV29ComprasInv ;
         GXv_decimal8[0] = AV30ConsumosInv ;
         new app.pprc126(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_char6, GXv_decimal7, GXv_decimal8) ;
         pprc125.this.AV31Emprcod = GXv_char3[0] ;
         pprc125.this.AV32Prdnum = GXv_char4[0] ;
         pprc125.this.AV24Recfec = GXv_date5[0] ;
         pprc125.this.AV38PrdLote = GXv_char6[0] ;
         pprc125.this.AV29ComprasInv = GXv_decimal7[0] ;
         pprc125.this.AV30ConsumosInv = GXv_decimal8[0] ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc125.this.AV31Emprcod;
      this.aP1[0] = pprc125.this.AV37fec1;
      this.aP2[0] = pprc125.this.AV32Prdnum;
      this.aP3[0] = pprc125.this.AV38PrdLote;
      this.aP4[0] = pprc125.this.AV33Exis;
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
      P05LM2_A396EmprCod = new String[] {""} ;
      P05LM2_A719PrdNum = new String[] {""} ;
      P05LM2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05LM2_A5722CCStkLot = new String[] {""} ;
      P05LM2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LM2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LM2_A3345TipMovCc = new String[] {""} ;
      P05LM2_A3356CCStkHor = new String[] {""} ;
      P05LM2_A3342CCStkLin = new long[1] ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A5722CCStkLot = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3356CCStkHor = "" ;
      AV35Ccstkcane = DecimalUtil.ZERO ;
      AV36Ccstkcans = DecimalUtil.ZERO ;
      AV24Recfec = GXutil.nullDate() ;
      AV26RecExiRea = DecimalUtil.ZERO ;
      AV29ComprasInv = DecimalUtil.ZERO ;
      AV30ConsumosInv = DecimalUtil.ZERO ;
      AV25Recexiteo = DecimalUtil.ZERO ;
      AV27RecExiTcc = DecimalUtil.ZERO ;
      AV28RecExiRcc = DecimalUtil.ZERO ;
      P05LM3_A12285RecLot = new String[] {""} ;
      P05LM3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05LM3_A719PrdNum = new String[] {""} ;
      P05LM3_A396EmprCod = new String[] {""} ;
      P05LM3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LM3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LM3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LM3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A12285RecLot = "" ;
      A810RecFec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc125__default(),
         new Object[] {
             new Object[] {
            P05LM2_A396EmprCod, P05LM2_A719PrdNum, P05LM2_A3348CCStkFec, P05LM2_A5722CCStkLot, P05LM2_A3343CCStkCanE, P05LM2_A3344CCStkCanS, P05LM2_A3345TipMovCc, P05LM2_A3356CCStkHor, P05LM2_A3342CCStkLin
            }
            , new Object[] {
            P05LM3_A12285RecLot, P05LM3_A810RecFec, P05LM3_A719PrdNum, P05LM3_A396EmprCod, P05LM3_A809RecExiTeo, P05LM3_A807RecExiRea, P05LM3_A808RecExiTcc, P05LM3_A806RecExiRcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34EntSalInv ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV33Exis ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV35Ccstkcane ;
   private java.math.BigDecimal AV36Ccstkcans ;
   private java.math.BigDecimal AV26RecExiRea ;
   private java.math.BigDecimal AV29ComprasInv ;
   private java.math.BigDecimal AV30ConsumosInv ;
   private java.math.BigDecimal AV25Recexiteo ;
   private java.math.BigDecimal AV27RecExiTcc ;
   private java.math.BigDecimal AV28RecExiRcc ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV31Emprcod ;
   private String AV32Prdnum ;
   private String AV38PrdLote ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A5722CCStkLot ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String A12285RecLot ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private java.util.Date AV37fec1 ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV24Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date GXv_date5[] ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LM2_A396EmprCod ;
   private String[] P05LM2_A719PrdNum ;
   private java.util.Date[] P05LM2_A3348CCStkFec ;
   private String[] P05LM2_A5722CCStkLot ;
   private java.math.BigDecimal[] P05LM2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05LM2_A3344CCStkCanS ;
   private String[] P05LM2_A3345TipMovCc ;
   private String[] P05LM2_A3356CCStkHor ;
   private long[] P05LM2_A3342CCStkLin ;
   private String[] P05LM3_A12285RecLot ;
   private java.util.Date[] P05LM3_A810RecFec ;
   private String[] P05LM3_A719PrdNum ;
   private String[] P05LM3_A396EmprCod ;
   private java.math.BigDecimal[] P05LM3_A809RecExiTeo ;
   private java.math.BigDecimal[] P05LM3_A807RecExiRea ;
   private java.math.BigDecimal[] P05LM3_A808RecExiTcc ;
   private java.math.BigDecimal[] P05LM3_A806RecExiRcc ;
}

final  class pprc125__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LM2", "SELECT EmprCod, PrdNum, CCStkFec, CCStkLot, CCStkCanE, CCStkCanS, TipMovCc, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkFec < ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LM3", "SELECT RecLot, RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
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

