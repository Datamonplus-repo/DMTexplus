package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccstk20 extends GXProcedure
{
   public pccstk20( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccstk20.class ), "" );
   }

   public pccstk20( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.util.Date[] aP17 ,
                             int[] aP18 ,
                             String[] aP19 )
   {
      pccstk20.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        java.util.Date[] aP17 ,
                        int[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.util.Date[] aP17 ,
                             int[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 )
   {
      pccstk20.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccstk20.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pccstk20.this.AV9CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pccstk20.this.AV10CCStkCanS = aP3[0];
      this.aP3 = aP3;
      pccstk20.this.AV11TipMovCc = aP4[0];
      this.aP4 = aP4;
      pccstk20.this.AV12CCStkPri = aP5[0];
      this.aP5 = aP5;
      pccstk20.this.AV13CCStkPre = aP6[0];
      this.aP6 = aP6;
      pccstk20.this.AV14CCStkBar = aP7[0];
      this.aP7 = aP7;
      pccstk20.this.AV15CCStkReo = aP8[0];
      this.aP8 = aP8;
      pccstk20.this.AV16CCStkPar = aP9[0];
      this.aP9 = aP9;
      pccstk20.this.AV17CCStkPed = aP10[0];
      this.aP10 = aP10;
      pccstk20.this.AV18CCStkAlb = aP11[0];
      this.aP11 = aP11;
      pccstk20.this.AV19CCStkUsu = aP12[0];
      this.aP12 = aP12;
      pccstk20.this.AV20CCStkDsc = aP13[0];
      this.aP13 = aP13;
      pccstk20.this.AV21CCStkLen = aP14[0];
      this.aP14 = aP14;
      pccstk20.this.AV24OldCanE = aP15[0];
      this.aP15 = aP15;
      pccstk20.this.AV25OldCanS = aP16[0];
      this.aP16 = aP16;
      pccstk20.this.AV26Fecha = aP17[0];
      this.aP17 = aP17;
      pccstk20.this.AV29PrvNum = aP18[0];
      this.aP18 = aP18;
      pccstk20.this.AV30CCStkLot = aP19[0];
      this.aP19 = aP19;
      pccstk20.this.AV31CCstkNalb = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pCCstk20", "") );
      /* Using cursor P05K22 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05K22_A719PrdNum[0] ;
         A3341CCStKULin = P05K22_A3341CCStKULin[0] ;
         n3341CCStKULin = P05K22_n3341CCStKULin[0] ;
         AV22CCStkULin = A3341CCStKULin ;
         Gx_msg = httpContext.getMessage( "pCCstk20.Producto= ", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV22CCStkULin = (long)(AV22CCStkULin+5) ;
      AV23FlagEn = (byte)(0) ;
      if ( GXutil.strcmp(AV11TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV8PrdNum ;
         GXv_int3[0] = AV21CCStkLen ;
         GXv_decimal4[0] = AV9CCStkCanE ;
         GXv_decimal5[0] = AV24OldCanE ;
         GXv_decimal6[0] = AV10CCStkCanS ;
         GXv_decimal7[0] = AV25OldCanS ;
         GXv_int8[0] = AV23FlagEn ;
         GXv_char9[0] = AV18CCStkAlb ;
         GXv_decimal10[0] = AV13CCStkPre ;
         GXv_date11[0] = AV26Fecha ;
         GXv_char12[0] = AV31CCstkNalb ;
         GXv_char13[0] = AV30CCStkLot ;
         new app.pccstk21(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_char9, GXv_decimal10, GXv_date11, GXv_char12, GXv_char13) ;
         pccstk20.this.A396EmprCod = GXv_char1[0] ;
         pccstk20.this.AV8PrdNum = GXv_char2[0] ;
         pccstk20.this.AV21CCStkLen = GXv_int3[0] ;
         pccstk20.this.AV9CCStkCanE = GXv_decimal4[0] ;
         pccstk20.this.AV24OldCanE = GXv_decimal5[0] ;
         pccstk20.this.AV10CCStkCanS = GXv_decimal6[0] ;
         pccstk20.this.AV25OldCanS = GXv_decimal7[0] ;
         pccstk20.this.AV23FlagEn = GXv_int8[0] ;
         pccstk20.this.AV18CCStkAlb = GXv_char9[0] ;
         pccstk20.this.AV13CCStkPre = GXv_decimal10[0] ;
         pccstk20.this.AV26Fecha = GXv_date11[0] ;
         pccstk20.this.AV31CCstkNalb = GXv_char12[0] ;
         pccstk20.this.AV30CCStkLot = GXv_char13[0] ;
      }
      if ( AV23FlagEn == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCCSTKS

         */
         A719PrdNum = AV8PrdNum ;
         A3342CCStkLin = AV22CCStkULin ;
         A3343CCStkCanE = AV9CCStkCanE ;
         A3344CCStkCanS = AV10CCStkCanS ;
         A3345TipMovCc = AV11TipMovCc ;
         A3347CCStkPri = AV12CCStkPri ;
         A3348CCStkFec = AV26Fecha ;
         A3349CCStkPre = AV13CCStkPre ;
         A3350CCStkBar = AV14CCStkBar ;
         A3351CCStkReo = AV15CCStkReo ;
         A3352CCStkPar = AV16CCStkPar ;
         A3353CCStkPed = AV17CCStkPed ;
         A3354CCStkAlb = AV18CCStkAlb ;
         A3355CCStkUsu = AV19CCStkUsu ;
         A3356CCStkHor = Gx_time ;
         A3357CCStkDsc = AV20CCStkDsc ;
         A3358CCStkLen = AV21CCStkLen ;
         A6157CcStkPrv = AV29PrvNum ;
         A5722CCStkLot = AV30CCStkLot ;
         A12858CCStkNAlb = AV31CCstkNalb ;
         /* Using cursor P05K23 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, A3345TipMovCc, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), A5722CCStkLot, Integer.valueOf(A6157CcStkPrv), A12858CCStkNAlb});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
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
      n3341CCStKULin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05K24 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n3341CCStKULin), Long.valueOf(AV22CCStkULin), A396EmprCod, AV8PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "Return pCCstk20", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccstk20.this.A396EmprCod;
      this.aP1[0] = pccstk20.this.AV8PrdNum;
      this.aP2[0] = pccstk20.this.AV9CCStkCanE;
      this.aP3[0] = pccstk20.this.AV10CCStkCanS;
      this.aP4[0] = pccstk20.this.AV11TipMovCc;
      this.aP5[0] = pccstk20.this.AV12CCStkPri;
      this.aP6[0] = pccstk20.this.AV13CCStkPre;
      this.aP7[0] = pccstk20.this.AV14CCStkBar;
      this.aP8[0] = pccstk20.this.AV15CCStkReo;
      this.aP9[0] = pccstk20.this.AV16CCStkPar;
      this.aP10[0] = pccstk20.this.AV17CCStkPed;
      this.aP11[0] = pccstk20.this.AV18CCStkAlb;
      this.aP12[0] = pccstk20.this.AV19CCStkUsu;
      this.aP13[0] = pccstk20.this.AV20CCStkDsc;
      this.aP14[0] = pccstk20.this.AV21CCStkLen;
      this.aP15[0] = pccstk20.this.AV24OldCanE;
      this.aP16[0] = pccstk20.this.AV25OldCanS;
      this.aP17[0] = pccstk20.this.AV26Fecha;
      this.aP18[0] = pccstk20.this.AV29PrvNum;
      this.aP19[0] = pccstk20.this.AV30CCStkLot;
      this.aP20[0] = pccstk20.this.AV31CCstkNalb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pccstk20");
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
      P05K22_A396EmprCod = new String[] {""} ;
      P05K22_A719PrdNum = new String[] {""} ;
      P05K22_A3341CCStKULin = new long[1] ;
      P05K22_n3341CCStKULin = new boolean[] {false} ;
      A719PrdNum = "" ;
      Gx_msg = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      Gx_time = "" ;
      A3357CCStkDsc = "" ;
      A5722CCStkLot = "" ;
      A12858CCStkNAlb = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccstk20__default(),
         new Object[] {
             new Object[] {
            P05K22_A396EmprCod, P05K22_A719PrdNum, P05K22_A3341CCStKULin, P05K22_n3341CCStKULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV15CCStkReo ;
   private byte AV23FlagEn ;
   private byte GXv_int8[] ;
   private byte A3351CCStkReo ;
   private short AV21CCStkLen ;
   private short GXv_int3[] ;
   private short A3358CCStkLen ;
   private short Gx_err ;
   private int AV14CCStkBar ;
   private int AV17CCStkPed ;
   private int AV29PrvNum ;
   private int GX_INS484 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int A6157CcStkPrv ;
   private long A3341CCStKULin ;
   private long AV22CCStkULin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV10CCStkCanS ;
   private java.math.BigDecimal AV13CCStkPre ;
   private java.math.BigDecimal AV24OldCanE ;
   private java.math.BigDecimal AV25OldCanS ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV11TipMovCc ;
   private String AV12CCStkPri ;
   private String AV16CCStkPar ;
   private String AV18CCStkAlb ;
   private String AV19CCStkUsu ;
   private String AV20CCStkDsc ;
   private String AV30CCStkLot ;
   private String AV31CCstkNalb ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String A3345TipMovCc ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String Gx_time ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A12858CCStkNAlb ;
   private String Gx_emsg ;
   private java.util.Date AV26Fecha ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date A3348CCStkFec ;
   private boolean n3341CCStKULin ;
   private String[] aP20 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private java.util.Date[] aP17 ;
   private int[] aP18 ;
   private String[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P05K22_A396EmprCod ;
   private String[] P05K22_A719PrdNum ;
   private long[] P05K22_A3341CCStKULin ;
   private boolean[] P05K22_n3341CCStKULin ;
}

final  class pccstk20__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05K22", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05K23", "INSERT INTO TXPCCSTKS(EmprCod, PrdNum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CCStkLot, CcStkPrv, CCStkNAlb, CcoCod, CCStkExp, CCStkExpF, Ccstkhis, CCStkDoc, CCStkLotFe, CCstkLotAl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new UpdateCursor("P05K24", "UPDATE TXPPRODUC SET CCStKULin=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setString(6, (String)parms[5], 2);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 10);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 30);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 26);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 20);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

