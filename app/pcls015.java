package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls015 extends GXProcedure
{
   public pcls015( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls015.class ), "" );
   }

   public pcls015( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
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
                                     java.math.BigDecimal[] aP16 )
   {
      pcls015.this.aP17 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
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
                        java.util.Date[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
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
                             java.util.Date[] aP17 )
   {
      pcls015.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls015.this.AV28PrdNum = aP1[0];
      this.aP1 = aP1;
      pcls015.this.AV10CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pcls015.this.AV11CCStkCanS = aP3[0];
      this.aP3 = aP3;
      pcls015.this.AV29TipMovCc = aP4[0];
      this.aP4 = aP4;
      pcls015.this.AV17CCStkPri = aP5[0];
      this.aP5 = aP5;
      pcls015.this.AV16CCStkPre = aP6[0];
      this.aP6 = aP6;
      pcls015.this.AV9CCStkBar = aP7[0];
      this.aP7 = aP7;
      pcls015.this.AV18CCStkReo = aP8[0];
      this.aP8 = aP8;
      pcls015.this.AV14CCStkPar = aP9[0];
      this.aP9 = aP9;
      pcls015.this.AV15CCStkPed = aP10[0];
      this.aP10 = aP10;
      pcls015.this.AV8CCStkAlb = aP11[0];
      this.aP11 = aP11;
      pcls015.this.AV20CCStkUsu = aP12[0];
      this.aP12 = aP12;
      pcls015.this.AV12CCStkDsc = aP13[0];
      this.aP13 = aP13;
      pcls015.this.AV13CCStkLen = aP14[0];
      this.aP14 = aP14;
      pcls015.this.AV26OldCanE = aP15[0];
      this.aP15 = aP15;
      pcls015.this.AV27OldCanS = aP16[0];
      this.aP16 = aP16;
      pcls015.this.AV22Fecha = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P055X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV28PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P055X2_A719PrdNum[0] ;
         A3341CCStKULin = P055X2_A3341CCStKULin[0] ;
         n3341CCStKULin = P055X2_n3341CCStKULin[0] ;
         AV19CCStkULin = A3341CCStKULin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV19CCStkULin = (long)(AV19CCStkULin+5) ;
      Gx_msg = AV28PrdNum + " " + httpContext.getMessage( " In PCLs015.New CCSTKS", "") + " " + GXutil.trim( AV12CCStkDsc) ;
      /*
         INSERT RECORD ON TABLE TXPCCSTKS

      */
      A719PrdNum = AV28PrdNum ;
      A3342CCStkLin = AV19CCStkULin ;
      A3343CCStkCanE = AV10CCStkCanE ;
      A3344CCStkCanS = AV11CCStkCanS ;
      A3345TipMovCc = AV29TipMovCc ;
      A3347CCStkPri = AV17CCStkPri ;
      A3348CCStkFec = AV22Fecha ;
      A3349CCStkPre = AV16CCStkPre ;
      A3350CCStkBar = AV9CCStkBar ;
      A3351CCStkReo = AV18CCStkReo ;
      A3352CCStkPar = AV14CCStkPar ;
      A3353CCStkPed = AV15CCStkPed ;
      A3354CCStkAlb = AV8CCStkAlb ;
      A3355CCStkUsu = AV20CCStkUsu ;
      A3356CCStkHor = Gx_time ;
      A3357CCStkDsc = GXutil.substring( AV12CCStkDsc, 1, 30) ;
      A3358CCStkLen = AV13CCStkLen ;
      A3839CcoCod = (short)(0) ;
      /* Using cursor P055X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, A3345TipMovCc, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), Short.valueOf(A3839CcoCod)});
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
      Gx_msg = AV28PrdNum + " " + httpContext.getMessage( " End PCLs015.New CCSTKS", "") + " " + GXutil.trim( AV12CCStkDsc) ;
      /* Using cursor P055X4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV28PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P055X4_A719PrdNum[0] ;
         A3341CCStKULin = P055X4_A3341CCStKULin[0] ;
         n3341CCStKULin = P055X4_n3341CCStKULin[0] ;
         Gx_msg = AV28PrdNum + " " + httpContext.getMessage( " In PCLs015.Act PRODUC", "") ;
         A3341CCStKULin = AV19CCStkULin ;
         n3341CCStKULin = false ;
         Gx_msg = AV28PrdNum + " " + httpContext.getMessage( " End PCLs015.Act PRODUC", "") ;
         /* Using cursor P055X5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n3341CCStKULin), Long.valueOf(A3341CCStKULin), A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls015.this.A396EmprCod;
      this.aP1[0] = pcls015.this.AV28PrdNum;
      this.aP2[0] = pcls015.this.AV10CCStkCanE;
      this.aP3[0] = pcls015.this.AV11CCStkCanS;
      this.aP4[0] = pcls015.this.AV29TipMovCc;
      this.aP5[0] = pcls015.this.AV17CCStkPri;
      this.aP6[0] = pcls015.this.AV16CCStkPre;
      this.aP7[0] = pcls015.this.AV9CCStkBar;
      this.aP8[0] = pcls015.this.AV18CCStkReo;
      this.aP9[0] = pcls015.this.AV14CCStkPar;
      this.aP10[0] = pcls015.this.AV15CCStkPed;
      this.aP11[0] = pcls015.this.AV8CCStkAlb;
      this.aP12[0] = pcls015.this.AV20CCStkUsu;
      this.aP13[0] = pcls015.this.AV12CCStkDsc;
      this.aP14[0] = pcls015.this.AV13CCStkLen;
      this.aP15[0] = pcls015.this.AV26OldCanE;
      this.aP16[0] = pcls015.this.AV27OldCanS;
      this.aP17[0] = pcls015.this.AV22Fecha;
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
      P055X2_A396EmprCod = new String[] {""} ;
      P055X2_A719PrdNum = new String[] {""} ;
      P055X2_A3341CCStKULin = new long[1] ;
      P055X2_n3341CCStKULin = new boolean[] {false} ;
      A719PrdNum = "" ;
      Gx_msg = "" ;
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
      Gx_emsg = "" ;
      P055X4_A396EmprCod = new String[] {""} ;
      P055X4_A719PrdNum = new String[] {""} ;
      P055X4_A3341CCStKULin = new long[1] ;
      P055X4_n3341CCStKULin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls015__default(),
         new Object[] {
             new Object[] {
            P055X2_A396EmprCod, P055X2_A719PrdNum, P055X2_A3341CCStKULin, P055X2_n3341CCStKULin
            }
            , new Object[] {
            }
            , new Object[] {
            P055X4_A396EmprCod, P055X4_A719PrdNum, P055X4_A3341CCStKULin, P055X4_n3341CCStKULin
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

   private byte AV18CCStkReo ;
   private byte A3351CCStkReo ;
   private short AV13CCStkLen ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int AV9CCStkBar ;
   private int AV15CCStkPed ;
   private int GX_INS484 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private long A3341CCStKULin ;
   private long AV19CCStkULin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV10CCStkCanE ;
   private java.math.BigDecimal AV11CCStkCanS ;
   private java.math.BigDecimal AV16CCStkPre ;
   private java.math.BigDecimal AV26OldCanE ;
   private java.math.BigDecimal AV27OldCanS ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String A396EmprCod ;
   private String AV28PrdNum ;
   private String AV29TipMovCc ;
   private String AV17CCStkPri ;
   private String AV14CCStkPar ;
   private String AV8CCStkAlb ;
   private String AV20CCStkUsu ;
   private String AV12CCStkDsc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private String A3345TipMovCc ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String Gx_time ;
   private String A3357CCStkDsc ;
   private String Gx_emsg ;
   private java.util.Date AV22Fecha ;
   private java.util.Date A3348CCStkFec ;
   private boolean n3341CCStKULin ;
   private java.util.Date[] aP17 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P055X2_A396EmprCod ;
   private String[] P055X2_A719PrdNum ;
   private long[] P055X2_A3341CCStKULin ;
   private boolean[] P055X2_n3341CCStKULin ;
   private String[] P055X4_A396EmprCod ;
   private String[] P055X4_A719PrdNum ;
   private long[] P055X4_A3341CCStKULin ;
   private boolean[] P055X4_n3341CCStKULin ;
}

final  class pcls015__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055X2", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055X3", "INSERT INTO TXPCCSTKS(EmprCod, PrdNum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new ForEachCursor("P055X4", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055X5", "UPDATE TXPPRODUC SET CCStKULin=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
            case 2 :
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
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
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

