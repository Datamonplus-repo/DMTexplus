package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewcc3 extends GXProcedure
{
   public pnewcc3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewcc3.class ), "" );
   }

   public pnewcc3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
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
                            java.util.Date[] aP17 )
   {
      pnewcc3.this.aP18 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
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
                        short[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
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
                             short[] aP18 )
   {
      pnewcc3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewcc3.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pnewcc3.this.AV9CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pnewcc3.this.AV10CCStkCanS = aP3[0];
      this.aP3 = aP3;
      pnewcc3.this.AV11TipMovCc = aP4[0];
      this.aP4 = aP4;
      pnewcc3.this.AV12CCStkPri = aP5[0];
      this.aP5 = aP5;
      pnewcc3.this.AV13CCStkPre = aP6[0];
      this.aP6 = aP6;
      pnewcc3.this.AV14CCStkBar = aP7[0];
      this.aP7 = aP7;
      pnewcc3.this.AV15CCStkReo = aP8[0];
      this.aP8 = aP8;
      pnewcc3.this.AV16CCStkPar = aP9[0];
      this.aP9 = aP9;
      pnewcc3.this.AV17CCStkPed = aP10[0];
      this.aP10 = aP10;
      pnewcc3.this.AV18CCStkAlb = aP11[0];
      this.aP11 = aP11;
      pnewcc3.this.AV19CCStkUsu = aP12[0];
      this.aP12 = aP12;
      pnewcc3.this.AV20CCStkDsc = aP13[0];
      this.aP13 = aP13;
      pnewcc3.this.AV21CCStkLen = aP14[0];
      this.aP14 = aP14;
      pnewcc3.this.AV24OldCanE = aP15[0];
      this.aP15 = aP15;
      pnewcc3.this.AV25OldCanS = aP16[0];
      this.aP16 = aP16;
      pnewcc3.this.AV26Fecha = aP17[0];
      this.aP17 = aP17;
      pnewcc3.this.AV28CCoCod = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00WW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P00WW2_A719PrdNum[0] ;
         A3341CCStKULin = P00WW2_A3341CCStKULin[0] ;
         n3341CCStKULin = P00WW2_n3341CCStKULin[0] ;
         AV22CCStkULin = A3341CCStKULin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV22CCStkULin = (long)(AV22CCStkULin+5) ;
      AV23FlagEn = (byte)(0) ;
      /* Using cursor P00WW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdNum, Integer.valueOf(AV17CCStkPed)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3357CCStkDsc = P00WW3_A3357CCStkDsc[0] ;
         A3345TipMovCc = P00WW3_A3345TipMovCc[0] ;
         A3353CCStkPed = P00WW3_A3353CCStkPed[0] ;
         A719PrdNum = P00WW3_A719PrdNum[0] ;
         A3344CCStkCanS = P00WW3_A3344CCStkCanS[0] ;
         A3839CcoCod = P00WW3_A3839CcoCod[0] ;
         A3342CCStkLin = P00WW3_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            if ( ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual", "")) == 0 ) || ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual CC,TCONMAC", "")) == 0 ) || ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,TCONMAC", "")) == 0 ) )
            {
               A3344CCStkCanS = A3344CCStkCanS.subtract(AV24OldCanE).add(AV10CCStkCanS) ;
               A3839CcoCod = AV28CCoCod ;
               AV23FlagEn = (byte)(1) ;
               /* Using cursor P00WW4 */
               pr_default.execute(2, new Object[] {A3344CCStkCanS, Short.valueOf(A3839CcoCod), A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
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
         A3839CcoCod = AV28CCoCod ;
         /* Using cursor P00WW5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, A3345TipMovCc, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), Short.valueOf(A3839CcoCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         if ( (pr_default.getStatus(3) == 1) )
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
      /* Using cursor P00WW6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n3341CCStKULin), Long.valueOf(AV22CCStkULin), A396EmprCod, AV8PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewcc3.this.A396EmprCod;
      this.aP1[0] = pnewcc3.this.AV8PrdNum;
      this.aP2[0] = pnewcc3.this.AV9CCStkCanE;
      this.aP3[0] = pnewcc3.this.AV10CCStkCanS;
      this.aP4[0] = pnewcc3.this.AV11TipMovCc;
      this.aP5[0] = pnewcc3.this.AV12CCStkPri;
      this.aP6[0] = pnewcc3.this.AV13CCStkPre;
      this.aP7[0] = pnewcc3.this.AV14CCStkBar;
      this.aP8[0] = pnewcc3.this.AV15CCStkReo;
      this.aP9[0] = pnewcc3.this.AV16CCStkPar;
      this.aP10[0] = pnewcc3.this.AV17CCStkPed;
      this.aP11[0] = pnewcc3.this.AV18CCStkAlb;
      this.aP12[0] = pnewcc3.this.AV19CCStkUsu;
      this.aP13[0] = pnewcc3.this.AV20CCStkDsc;
      this.aP14[0] = pnewcc3.this.AV21CCStkLen;
      this.aP15[0] = pnewcc3.this.AV24OldCanE;
      this.aP16[0] = pnewcc3.this.AV25OldCanS;
      this.aP17[0] = pnewcc3.this.AV26Fecha;
      this.aP18[0] = pnewcc3.this.AV28CCoCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewcc3");
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
      P00WW2_A396EmprCod = new String[] {""} ;
      P00WW2_A719PrdNum = new String[] {""} ;
      P00WW2_A3341CCStKULin = new long[1] ;
      P00WW2_n3341CCStKULin = new boolean[] {false} ;
      A719PrdNum = "" ;
      P00WW3_A396EmprCod = new String[] {""} ;
      P00WW3_A3357CCStkDsc = new String[] {""} ;
      P00WW3_A3345TipMovCc = new String[] {""} ;
      P00WW3_A3353CCStkPed = new int[1] ;
      P00WW3_A719PrdNum = new String[] {""} ;
      P00WW3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WW3_A3839CcoCod = new short[1] ;
      P00WW3_A3342CCStkLin = new long[1] ;
      A3357CCStkDsc = "" ;
      A3345TipMovCc = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      Gx_time = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewcc3__default(),
         new Object[] {
             new Object[] {
            P00WW2_A396EmprCod, P00WW2_A719PrdNum, P00WW2_A3341CCStKULin, P00WW2_n3341CCStKULin
            }
            , new Object[] {
            P00WW3_A396EmprCod, P00WW3_A3357CCStkDsc, P00WW3_A3345TipMovCc, P00WW3_A3353CCStkPed, P00WW3_A719PrdNum, P00WW3_A3344CCStkCanS, P00WW3_A3839CcoCod, P00WW3_A3342CCStkLin
            }
            , new Object[] {
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
   private byte A3351CCStkReo ;
   private short AV21CCStkLen ;
   private short AV28CCoCod ;
   private short A3839CcoCod ;
   private short A3358CCStkLen ;
   private short Gx_err ;
   private int AV14CCStkBar ;
   private int AV17CCStkPed ;
   private int A3353CCStkPed ;
   private int GX_INS484 ;
   private int A3350CCStkBar ;
   private long A3341CCStKULin ;
   private long AV22CCStkULin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV10CCStkCanS ;
   private java.math.BigDecimal AV13CCStkPre ;
   private java.math.BigDecimal AV24OldCanE ;
   private java.math.BigDecimal AV25OldCanS ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV11TipMovCc ;
   private String AV12CCStkPri ;
   private String AV16CCStkPar ;
   private String AV18CCStkAlb ;
   private String AV19CCStkUsu ;
   private String AV20CCStkDsc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3357CCStkDsc ;
   private String A3345TipMovCc ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String Gx_time ;
   private String Gx_emsg ;
   private java.util.Date AV26Fecha ;
   private java.util.Date A3348CCStkFec ;
   private boolean n3341CCStKULin ;
   private short[] aP18 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P00WW2_A396EmprCod ;
   private String[] P00WW2_A719PrdNum ;
   private long[] P00WW2_A3341CCStKULin ;
   private boolean[] P00WW2_n3341CCStKULin ;
   private String[] P00WW3_A396EmprCod ;
   private String[] P00WW3_A3357CCStkDsc ;
   private String[] P00WW3_A3345TipMovCc ;
   private int[] P00WW3_A3353CCStkPed ;
   private String[] P00WW3_A719PrdNum ;
   private java.math.BigDecimal[] P00WW3_A3344CCStkCanS ;
   private short[] P00WW3_A3839CcoCod ;
   private long[] P00WW3_A3342CCStkLin ;
}

final  class pnewcc3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WW2", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WW3", "SELECT EmprCod, CCStkDsc, TipMovCc, CCStkPed, PrdNum, CCStkCanS, CcoCod, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkPed = ?) ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00WW4", "UPDATE TXPCCSTKS SET CCStkCanS=?, CcoCod=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new UpdateCursor("P00WW5", "INSERT INTO TXPCCSTKS(EmprCod, PrdNum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new UpdateCursor("P00WW6", "UPDATE TXPPRODUC SET CCStKULin=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 3 :
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
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               return;
            case 4 :
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

