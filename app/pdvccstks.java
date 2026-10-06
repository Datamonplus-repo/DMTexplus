package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdvccstks extends GXProcedure
{
   public pdvccstks( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdvccstks.class ), "" );
   }

   public pdvccstks( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             long[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 )
   {
      pdvccstks.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        long[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             long[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pdvccstks.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdvccstks.this.AV9PrdNum = aP1[0];
      this.aP1 = aP1;
      pdvccstks.this.AV8EntUnient = aP2[0];
      this.aP2 = aP2;
      pdvccstks.this.AV11Pet_cod = aP3[0];
      this.aP3 = aP3;
      pdvccstks.this.AV12Pet_fecha = aP4[0];
      this.aP4 = aP4;
      pdvccstks.this.AV13ENtObs = aP5[0];
      this.aP5 = aP5;
      pdvccstks.this.AV17CCStkDsc = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pdvccstks.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      pdvccstks.this.A396EmprCod = GXv_char2[0] ;
      pdvccstks.this.AV15EmprNom = GXv_char3[0] ;
      pdvccstks.this.AV16UsurCod = GXv_char4[0] ;
      /* Using cursor P04XI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11935DVPrdNum = P04XI2_A11935DVPrdNum[0] ;
         A12054DVCCStKULi = P04XI2_A12054DVCCStKULi[0] ;
         n12054DVCCStKULi = P04XI2_n12054DVCCStKULi[0] ;
         A12006DVPrdPreAc = P04XI2_A12006DVPrdPreAc[0] ;
         n12006DVPrdPreAc = P04XI2_n12006DVPrdPreAc[0] ;
         A12007DVUltLinEn = P04XI2_A12007DVUltLinEn[0] ;
         n12007DVUltLinEn = P04XI2_n12007DVUltLinEn[0] ;
         A12004DVPrvNum = P04XI2_A12004DVPrvNum[0] ;
         n12004DVPrvNum = P04XI2_n12004DVPrvNum[0] ;
         A12054DVCCStKULi = (long)(A12054DVCCStKULi+5) ;
         n12054DVCCStKULi = false ;
         AV18DVCCStKULin = A12054DVCCStKULi ;
         AV19DVPrdPreAct = A12006DVPrdPreAc ;
         AV10DVUltLinEnt = A12007DVUltLinEn ;
         AV20DVPrvNum = A12004DVPrvNum ;
         /* Using cursor P04XI3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n12054DVCCStKULi), Long.valueOf(A12054DVCCStKULi), A396EmprCod, A11935DVPrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE LVNCCSTKS

      */
      A11935DVPrdNum = AV9PrdNum ;
      A11950DVCCStkLin = AV18DVCCStKULin ;
      A11951DVCCStkCE = AV8EntUnient ;
      n11951DVCCStkCE = false ;
      A11952DVCCStkCS = DecimalUtil.doubleToDec(0) ;
      n11952DVCCStkCS = false ;
      A11953DVTipMovCc = httpContext.getMessage( "EN", "") ;
      n11953DVTipMovCc = false ;
      A11954DVCCStkPri = "1" ;
      n11954DVCCStkPri = false ;
      A11955DVCCStkFec = AV12Pet_fecha ;
      n11955DVCCStkFec = false ;
      A11956DVCCStkPre = AV19DVPrdPreAct ;
      n11956DVCCStkPre = false ;
      A11957DVCCStkBar = 0 ;
      n11957DVCCStkBar = false ;
      A11958DVCCStkReo = (byte)(0) ;
      n11958DVCCStkReo = false ;
      A11959DVCCStkPar = " " ;
      n11959DVCCStkPar = false ;
      A11961DVCCStkAlb = GXutil.str( AV11Pet_cod, 10, 0) ;
      n11961DVCCStkAlb = false ;
      A11960DVCCStkPed = 0 ;
      n11960DVCCStkPed = false ;
      A11961DVCCStkAlb = " " ;
      n11961DVCCStkAlb = false ;
      A11962DVCCStkUsu = AV16UsurCod ;
      n11962DVCCStkUsu = false ;
      A11963DVCCStkHor = Gx_time ;
      n11963DVCCStkHor = false ;
      A11964DVCCStkDsc = AV17CCStkDsc ;
      n11964DVCCStkDsc = false ;
      A11965DVCCStkLen = AV10DVUltLinEnt ;
      n11965DVCCStkLen = false ;
      A11968DVCcStkPrv = AV20DVPrvNum ;
      n11968DVCcStkPrv = false ;
      /* Using cursor P04XI4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin), Boolean.valueOf(n11951DVCCStkCE), A11951DVCCStkCE, Boolean.valueOf(n11952DVCCStkCS), A11952DVCCStkCS, Boolean.valueOf(n11953DVTipMovCc), A11953DVTipMovCc, Boolean.valueOf(n11954DVCCStkPri), A11954DVCCStkPri, Boolean.valueOf(n11955DVCCStkFec), A11955DVCCStkFec, Boolean.valueOf(n11956DVCCStkPre), A11956DVCCStkPre, Boolean.valueOf(n11957DVCCStkBar), Integer.valueOf(A11957DVCCStkBar), Boolean.valueOf(n11958DVCCStkReo), Byte.valueOf(A11958DVCCStkReo), Boolean.valueOf(n11959DVCCStkPar), A11959DVCCStkPar, Boolean.valueOf(n11960DVCCStkPed), Integer.valueOf(A11960DVCCStkPed), Boolean.valueOf(n11961DVCCStkAlb), A11961DVCCStkAlb, Boolean.valueOf(n11962DVCCStkUsu), A11962DVCCStkUsu, Boolean.valueOf(n11963DVCCStkHor), A11963DVCCStkHor, Boolean.valueOf(n11964DVCCStkDsc), A11964DVCCStkDsc, Boolean.valueOf(n11965DVCCStkLen), Short.valueOf(A11965DVCCStkLen), Boolean.valueOf(n11968DVCcStkPrv), Integer.valueOf(A11968DVCcStkPrv)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCSTKS");
      if ( (pr_default.getStatus(2) == 1) )
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
      this.aP0[0] = pdvccstks.this.A396EmprCod;
      this.aP1[0] = pdvccstks.this.AV9PrdNum;
      this.aP2[0] = pdvccstks.this.AV8EntUnient;
      this.aP3[0] = pdvccstks.this.AV11Pet_cod;
      this.aP4[0] = pdvccstks.this.AV12Pet_fecha;
      this.aP5[0] = pdvccstks.this.AV13ENtObs;
      this.aP6[0] = pdvccstks.this.AV17CCStkDsc;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdvccstks");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV16UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P04XI2_A396EmprCod = new String[] {""} ;
      P04XI2_A11935DVPrdNum = new String[] {""} ;
      P04XI2_A12054DVCCStKULi = new long[1] ;
      P04XI2_n12054DVCCStKULi = new boolean[] {false} ;
      P04XI2_A12006DVPrdPreAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XI2_n12006DVPrdPreAc = new boolean[] {false} ;
      P04XI2_A12007DVUltLinEn = new short[1] ;
      P04XI2_n12007DVUltLinEn = new boolean[] {false} ;
      P04XI2_A12004DVPrvNum = new int[1] ;
      P04XI2_n12004DVPrvNum = new boolean[] {false} ;
      A11935DVPrdNum = "" ;
      A12006DVPrdPreAc = DecimalUtil.ZERO ;
      AV19DVPrdPreAct = DecimalUtil.ZERO ;
      A11951DVCCStkCE = DecimalUtil.ZERO ;
      A11952DVCCStkCS = DecimalUtil.ZERO ;
      A11953DVTipMovCc = "" ;
      A11954DVCCStkPri = "" ;
      A11955DVCCStkFec = GXutil.nullDate() ;
      A11956DVCCStkPre = DecimalUtil.ZERO ;
      A11959DVCCStkPar = "" ;
      A11961DVCCStkAlb = "" ;
      A11962DVCCStkUsu = "" ;
      A11963DVCCStkHor = "" ;
      Gx_time = "" ;
      A11964DVCCStkDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdvccstks__default(),
         new Object[] {
             new Object[] {
            P04XI2_A396EmprCod, P04XI2_A11935DVPrdNum, P04XI2_A12054DVCCStKULi, P04XI2_n12054DVCCStKULi, P04XI2_A12006DVPrdPreAc, P04XI2_n12006DVPrdPreAc, P04XI2_A12007DVUltLinEn, P04XI2_n12007DVUltLinEn, P04XI2_A12004DVPrvNum, P04XI2_n12004DVPrvNum
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

   private byte A11958DVCCStkReo ;
   private short A12007DVUltLinEn ;
   private short AV10DVUltLinEnt ;
   private short A11965DVCCStkLen ;
   private short Gx_err ;
   private int A12004DVPrvNum ;
   private int AV20DVPrvNum ;
   private int GX_INS1675 ;
   private int A11957DVCCStkBar ;
   private int A11960DVCCStkPed ;
   private int A11968DVCcStkPrv ;
   private long AV11Pet_cod ;
   private long A12054DVCCStKULi ;
   private long AV18DVCCStKULin ;
   private long A11950DVCCStkLin ;
   private java.math.BigDecimal AV8EntUnient ;
   private java.math.BigDecimal A12006DVPrdPreAc ;
   private java.math.BigDecimal AV19DVPrdPreAct ;
   private java.math.BigDecimal A11951DVCCStkCE ;
   private java.math.BigDecimal A11952DVCCStkCS ;
   private java.math.BigDecimal A11956DVCCStkPre ;
   private String A396EmprCod ;
   private String AV9PrdNum ;
   private String AV13ENtObs ;
   private String AV17CCStkDsc ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV15EmprNom ;
   private String GXv_char3[] ;
   private String AV16UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A11935DVPrdNum ;
   private String A11953DVTipMovCc ;
   private String A11954DVCCStkPri ;
   private String A11959DVCCStkPar ;
   private String A11961DVCCStkAlb ;
   private String A11962DVCCStkUsu ;
   private String A11963DVCCStkHor ;
   private String Gx_time ;
   private String A11964DVCCStkDsc ;
   private String Gx_emsg ;
   private java.util.Date AV12Pet_fecha ;
   private java.util.Date A11955DVCCStkFec ;
   private boolean n12054DVCCStKULi ;
   private boolean n12006DVPrdPreAc ;
   private boolean n12007DVUltLinEn ;
   private boolean n12004DVPrvNum ;
   private boolean n11951DVCCStkCE ;
   private boolean n11952DVCCStkCS ;
   private boolean n11953DVTipMovCc ;
   private boolean n11954DVCCStkPri ;
   private boolean n11955DVCCStkFec ;
   private boolean n11956DVCCStkPre ;
   private boolean n11957DVCCStkBar ;
   private boolean n11958DVCCStkReo ;
   private boolean n11959DVCCStkPar ;
   private boolean n11961DVCCStkAlb ;
   private boolean n11960DVCCStkPed ;
   private boolean n11962DVCCStkUsu ;
   private boolean n11963DVCCStkHor ;
   private boolean n11964DVCCStkDsc ;
   private boolean n11965DVCCStkLen ;
   private boolean n11968DVCcStkPrv ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private long[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XI2_A396EmprCod ;
   private String[] P04XI2_A11935DVPrdNum ;
   private long[] P04XI2_A12054DVCCStKULi ;
   private boolean[] P04XI2_n12054DVCCStKULi ;
   private java.math.BigDecimal[] P04XI2_A12006DVPrdPreAc ;
   private boolean[] P04XI2_n12006DVPrdPreAc ;
   private short[] P04XI2_A12007DVUltLinEn ;
   private boolean[] P04XI2_n12007DVUltLinEn ;
   private int[] P04XI2_A12004DVPrvNum ;
   private boolean[] P04XI2_n12004DVPrvNum ;
}

final  class pdvccstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XI2", "SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, CCStKULin, PrdPreAct, UltLinEnt, PrvNum FROM LVNDVPRODUC WHERE Emprcod = ? and Prdnum = ? ORDER BY Emprcod, Prdnum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04XI3", "UPDATE LVNDVPRODUC SET CCStKULin=?  WHERE Emprcod = ? AND Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
         ,new UpdateCursor("P04XI4", "INSERT INTO LVNCCSTKS(Emprcod, Prdnum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcStkPrv, CcoCod, CCStkLot, CCStkExp, CCStkExpF, Ccstkhis) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "LVNCCSTKS")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 4);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 8);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 8);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 30);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[34]).intValue());
               }
               return;
      }
   }

}

