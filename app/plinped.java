package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinped extends GXProcedure
{
   public plinped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinped.class ), "" );
   }

   public plinped( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 )
   {
      plinped.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 )
   {
      plinped.this.AV15EmprCod = aP0;
      plinped.this.AV16PedCod = aP1[0];
      this.aP1 = aP1;
      plinped.this.AV17PrdNum = aP2[0];
      this.aP2 = aP2;
      plinped.this.AV18PedUni = aP3[0];
      this.aP3 = aP3;
      plinped.this.AV19PedPre = aP4[0];
      this.aP4 = aP4;
      plinped.this.AV20PedDto = aP5[0];
      this.aP5 = aP5;
      plinped.this.AV23PedFecPEn = aP6[0];
      this.aP6 = aP6;
      plinped.this.AV22PedLinObs = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001E2 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P001E2_A396EmprCod[0] ;
         A3915EmpNumDec = P001E2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P001E2_n3915EmpNumDec[0] ;
         AV21EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPLPEDID

      */
      A396EmprCod = AV15EmprCod ;
      A658PedCod = AV16PedCod ;
      A719PrdNum = AV17PrdNum ;
      A669PedUni = AV18PedUni ;
      A665PedPre = AV19PedPre ;
      A660PedDto = AV20PedDto ;
      A659PedCum = httpContext.getMessage( "N", "") ;
      GXt_decimal1 = A670PedVal ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_int3[0] = AV16PedCod ;
      GXv_char4[0] = AV17PrdNum ;
      GXv_decimal5[0] = AV18PedUni ;
      GXv_decimal6[0] = AV19PedPre ;
      GXv_decimal7[0] = AV20PedDto ;
      GXv_int8[0] = AV21EmpNumDec ;
      GXv_decimal9[0] = GXt_decimal1 ;
      new app.ppedval(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_decimal9) ;
      plinped.this.AV15EmprCod = GXv_char2[0] ;
      plinped.this.AV16PedCod = GXv_int3[0] ;
      plinped.this.AV17PrdNum = GXv_char4[0] ;
      plinped.this.AV18PedUni = GXv_decimal5[0] ;
      plinped.this.AV19PedPre = GXv_decimal6[0] ;
      plinped.this.AV20PedDto = GXv_decimal7[0] ;
      plinped.this.AV21EmpNumDec = GXv_int8[0] ;
      plinped.this.GXt_decimal1 = GXv_decimal9[0] ;
      A670PedVal = GXt_decimal1 ;
      A3372PedNumCoP = (short)(0) ;
      A3375PedNumCoE = (short)(0) ;
      A3373PedConInP = 0 ;
      A3376PedConInE = 0 ;
      A3374PedConFiP = 0 ;
      A3377PedConFiE = 0 ;
      A3378PedEtiPrd = (byte)(0) ;
      A8158PedFecPEn = AV23PedFecPEn ;
      A8159PedLinObs = AV22PedLinObs ;
      /* Using cursor P001E3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum, A669PedUni, A665PedPre, A660PedDto, A670PedVal, A659PedCum, Short.valueOf(A3372PedNumCoP), Integer.valueOf(A3373PedConInP), Integer.valueOf(A3374PedConFiP), Short.valueOf(A3375PedNumCoE), Integer.valueOf(A3376PedConInE), Integer.valueOf(A3377PedConFiE), Byte.valueOf(A3378PedEtiPrd), A8158PedFecPEn, A8159PedLinObs});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plinped.this.AV16PedCod;
      this.aP2[0] = plinped.this.AV17PrdNum;
      this.aP3[0] = plinped.this.AV18PedUni;
      this.aP4[0] = plinped.this.AV19PedPre;
      this.aP5[0] = plinped.this.AV20PedDto;
      this.aP6[0] = plinped.this.AV23PedFecPEn;
      this.aP7[0] = plinped.this.AV22PedLinObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "plinped");
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
      P001E2_A396EmprCod = new String[] {""} ;
      P001E2_A3915EmpNumDec = new byte[1] ;
      P001E2_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      A670PedVal = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      A8158PedFecPEn = GXutil.nullDate() ;
      A8159PedLinObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinped__default(),
         new Object[] {
             new Object[] {
            P001E2_A396EmprCod, P001E2_A3915EmpNumDec, P001E2_n3915EmpNumDec
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private byte AV21EmpNumDec ;
   private byte GXv_int8[] ;
   private byte A3378PedEtiPrd ;
   private short A3372PedNumCoP ;
   private short A3375PedNumCoE ;
   private short Gx_err ;
   private int AV16PedCod ;
   private int GX_INS77 ;
   private int A658PedCod ;
   private int GXv_int3[] ;
   private int A3373PedConInP ;
   private int A3376PedConInE ;
   private int A3374PedConFiP ;
   private int A3377PedConFiE ;
   private java.math.BigDecimal AV18PedUni ;
   private java.math.BigDecimal AV19PedPre ;
   private java.math.BigDecimal AV20PedDto ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A670PedVal ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV15EmprCod ;
   private String AV17PrdNum ;
   private String AV22PedLinObs ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A659PedCum ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String A8159PedLinObs ;
   private String Gx_emsg ;
   private java.util.Date AV23PedFecPEn ;
   private java.util.Date A8158PedFecPEn ;
   private boolean n3915EmpNumDec ;
   private String[] aP7 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P001E2_A396EmprCod ;
   private byte[] P001E2_A3915EmpNumDec ;
   private boolean[] P001E2_n3915EmpNumDec ;
}

final  class plinped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001E2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001E3", "INSERT INTO TXPLPEDID(EmprCod, PedCod, PrdNum, PedUni, PedPre, PedDto, PedVal, PedCum, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedFecPEn, PedLinObs, PedCanEnt, PedFulEnt, PedNumRq) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setString(17, (String)parms[16], 60);
               return;
      }
   }

}

