package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewcc8 extends GXProcedure
{
   public pnewcc8( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewcc8.class ), "" );
   }

   public pnewcc8( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.math.BigDecimal aP2 ,
                        java.math.BigDecimal aP3 ,
                        String aP4 ,
                        String aP5 ,
                        java.math.BigDecimal aP6 ,
                        int aP7 ,
                        byte aP8 ,
                        String aP9 ,
                        int aP10 ,
                        String aP11 ,
                        String aP12 ,
                        String aP13 ,
                        short aP14 ,
                        java.math.BigDecimal aP15 ,
                        java.math.BigDecimal aP16 ,
                        java.util.Date aP17 ,
                        short aP18 ,
                        String aP19 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.math.BigDecimal aP2 ,
                             java.math.BigDecimal aP3 ,
                             String aP4 ,
                             String aP5 ,
                             java.math.BigDecimal aP6 ,
                             int aP7 ,
                             byte aP8 ,
                             String aP9 ,
                             int aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String aP13 ,
                             short aP14 ,
                             java.math.BigDecimal aP15 ,
                             java.math.BigDecimal aP16 ,
                             java.util.Date aP17 ,
                             short aP18 ,
                             String aP19 )
   {
      pnewcc8.this.A396EmprCod = aP0;
      pnewcc8.this.AV8PrdNum = aP1;
      pnewcc8.this.AV9CCStkCanE = aP2;
      pnewcc8.this.AV10CCStkCanS = aP3;
      pnewcc8.this.AV11TipMovCc = aP4;
      pnewcc8.this.AV12CCStkPri = aP5;
      pnewcc8.this.AV13CCStkPre = aP6;
      pnewcc8.this.AV14CCStkBar = aP7;
      pnewcc8.this.AV15CCStkReo = aP8;
      pnewcc8.this.AV16CCStkPar = aP9;
      pnewcc8.this.AV17CCStkPed = aP10;
      pnewcc8.this.AV18CCStkAlb = aP11;
      pnewcc8.this.AV19CCStkUsu = aP12;
      pnewcc8.this.AV20CCStkDsc = aP13;
      pnewcc8.this.AV21CCStkLen = aP14;
      pnewcc8.this.AV24OldCanE = aP15;
      pnewcc8.this.AV25OldCanS = aP16;
      pnewcc8.this.AV26Fecha = aP17;
      pnewcc8.this.AV28CCoCod = aP18;
      pnewcc8.this.AV31CumConLot = aP19;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23FlagEn = (byte)(0) ;
      /* Using cursor P020P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum, Integer.valueOf(AV17CCStkPed), AV20CCStkDsc});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3357CCStkDsc = P020P2_A3357CCStkDsc[0] ;
         A3345TipMovCc = P020P2_A3345TipMovCc[0] ;
         A3353CCStkPed = P020P2_A3353CCStkPed[0] ;
         A719PrdNum = P020P2_A719PrdNum[0] ;
         A3344CCStkCanS = P020P2_A3344CCStkCanS[0] ;
         A5722CCStkLot = P020P2_A5722CCStkLot[0] ;
         A3342CCStkLin = P020P2_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            A3344CCStkCanS = A3344CCStkCanS.subtract(AV24OldCanE).add(AV10CCStkCanS) ;
            A5722CCStkLot = AV31CumConLot ;
            AV23FlagEn = (byte)(1) ;
            /* Using cursor P020P3 */
            pr_default.execute(1, new Object[] {A3344CCStkCanS, A5722CCStkLot, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23FlagEn == 0 )
      {
         /* Using cursor P020P4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P020P4_A719PrdNum[0] ;
            A3341CCStKULin = P020P4_A3341CCStKULin[0] ;
            n3341CCStKULin = P020P4_n3341CCStKULin[0] ;
            AV22CCStkULin = A3341CCStKULin ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV22CCStkULin = (long)(AV22CCStkULin+5) ;
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
         A5722CCStkLot = AV31CumConLot ;
         /* Using cursor P020P5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, A3345TipMovCc, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), Short.valueOf(A3839CcoCod), A5722CCStkLot});
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
         n3341CCStKULin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P020P6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n3341CCStKULin), Long.valueOf(AV22CCStkULin), A396EmprCod, AV8PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewcc8");
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
      P020P2_A396EmprCod = new String[] {""} ;
      P020P2_A3357CCStkDsc = new String[] {""} ;
      P020P2_A3345TipMovCc = new String[] {""} ;
      P020P2_A3353CCStkPed = new int[1] ;
      P020P2_A719PrdNum = new String[] {""} ;
      P020P2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020P2_A5722CCStkLot = new String[] {""} ;
      P020P2_A3342CCStkLin = new long[1] ;
      A3357CCStkDsc = "" ;
      A3345TipMovCc = "" ;
      A719PrdNum = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      P020P4_A396EmprCod = new String[] {""} ;
      P020P4_A719PrdNum = new String[] {""} ;
      P020P4_A3341CCStKULin = new long[1] ;
      P020P4_n3341CCStKULin = new boolean[] {false} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewcc8__default(),
         new Object[] {
             new Object[] {
            P020P2_A396EmprCod, P020P2_A3357CCStkDsc, P020P2_A3345TipMovCc, P020P2_A3353CCStkPed, P020P2_A719PrdNum, P020P2_A3344CCStkCanS, P020P2_A5722CCStkLot, P020P2_A3342CCStkLin
            }
            , new Object[] {
            }
            , new Object[] {
            P020P4_A396EmprCod, P020P4_A719PrdNum, P020P4_A3341CCStKULin, P020P4_n3341CCStKULin
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
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int AV14CCStkBar ;
   private int AV17CCStkPed ;
   private int A3353CCStkPed ;
   private int GX_INS484 ;
   private int A3350CCStkBar ;
   private long A3342CCStkLin ;
   private long A3341CCStKULin ;
   private long AV22CCStkULin ;
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
   private String AV31CumConLot ;
   private String scmdbuf ;
   private String A3357CCStkDsc ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private String A5722CCStkLot ;
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
   private IDataStoreProvider pr_default ;
   private String[] P020P2_A396EmprCod ;
   private String[] P020P2_A3357CCStkDsc ;
   private String[] P020P2_A3345TipMovCc ;
   private int[] P020P2_A3353CCStkPed ;
   private String[] P020P2_A719PrdNum ;
   private java.math.BigDecimal[] P020P2_A3344CCStkCanS ;
   private String[] P020P2_A5722CCStkLot ;
   private long[] P020P2_A3342CCStkLin ;
   private String[] P020P4_A396EmprCod ;
   private String[] P020P4_A719PrdNum ;
   private long[] P020P4_A3341CCStKULin ;
   private boolean[] P020P4_n3341CCStKULin ;
}

final  class pnewcc8__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020P2", "SELECT EmprCod, CCStkDsc, TipMovCc, CCStkPed, PrdNum, CCStkCanS, CCStkLot, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkPed = ?) AND (CCStkDsc = ?) ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020P3", "UPDATE TXPCCSTKS SET CCStkCanS=?, CCStkLot=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new ForEachCursor("P020P4", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P020P5", "INSERT INTO TXPCCSTKS(EmprCod, PrdNum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new UpdateCursor("P020P6", "UPDATE TXPPRODUC SET CCStKULin=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 30);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(20, (String)parms[19], 26);
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

