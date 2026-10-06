package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork05 extends GXProcedure
{
   public pwork05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork05.class ), "" );
   }

   public pwork05( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            java.util.Date[] aP2 ,
                            int[] aP3 ,
                            byte[] aP4 ,
                            String[] aP5 ,
                            int[] aP6 ,
                            short[] aP7 ,
                            java.math.BigDecimal[] aP8 ,
                            java.math.BigDecimal[] aP9 ,
                            String[] aP10 ,
                            short[] aP11 ,
                            String[] aP12 )
   {
      pwork05.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 )
   {
      pwork05.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      pwork05.this.AV9Mancod = aP1[0];
      this.aP1 = aP1;
      pwork05.this.AV10RpExHdFe = aP2[0];
      this.aP2 = aP2;
      pwork05.this.AV13BarCod = aP3[0];
      this.aP3 = aP3;
      pwork05.this.AV14BarCodReo = aP4[0];
      this.aP4 = aP4;
      pwork05.this.AV15BarCodPar = aP5[0];
      this.aP5 = aP5;
      pwork05.this.AV16RpExHdAlb = aP6[0];
      this.aP6 = aP6;
      pwork05.this.AV18RpExHdCns = aP7[0];
      this.aP7 = aP7;
      pwork05.this.AV17RpExHdKgs = aP8[0];
      this.aP8 = aP8;
      pwork05.this.AV20RpExHdMts = aP9[0];
      this.aP9 = aP9;
      pwork05.this.AV19RpExHdTip = aP10[0];
      this.aP10 = aP10;
      pwork05.this.AV21RpExSalLn = aP11[0];
      this.aP11 = aP11;
      pwork05.this.AV11RpExtDoc = aP12[0];
      this.aP12 = aP12;
      pwork05.this.AV12RpExHdUl = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12RpExHdUl = (short)(5) ;
      /*
         INSERT RECORD ON TABLE TXPCREXHD

      */
      A396EmprCod = AV8Emprcod ;
      A2248ManCod = AV9Mancod ;
      A2711RpExHdFe = AV10RpExHdFe ;
      A11300RpExtDoc = AV11RpExtDoc ;
      n11300RpExtDoc = false ;
      A2712RpExHdUl = AV12RpExHdUl ;
      n2712RpExHdUl = false ;
      /* Using cursor P05YD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Boolean.valueOf(n2712RpExHdUl), Short.valueOf(A2712RpExHdUl), Boolean.valueOf(n11300RpExtDoc), A11300RpExtDoc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P05YD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P05YD3_A396EmprCod[0] ;
            A2248ManCod = P05YD3_A2248ManCod[0] ;
            A2711RpExHdFe = P05YD3_A2711RpExHdFe[0] ;
            A2712RpExHdUl = P05YD3_A2712RpExHdUl[0] ;
            n2712RpExHdUl = P05YD3_n2712RpExHdUl[0] ;
            AV12RpExHdUl = (short)(A2712RpExHdUl+5) ;
            A2712RpExHdUl = AV12RpExHdUl ;
            n2712RpExHdUl = false ;
            /* Using cursor P05YD4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n2712RpExHdUl), Short.valueOf(A2712RpExHdUl), A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLREXHD

      */
      A396EmprCod = AV8Emprcod ;
      A2248ManCod = AV9Mancod ;
      A2711RpExHdFe = AV10RpExHdFe ;
      A2713RpExHdLi = AV12RpExHdUl ;
      A129BarCod = AV13BarCod ;
      A132BarCodReo = AV14BarCodReo ;
      A130BarCodPar = AV15BarCodPar ;
      A2714RpExHdAlb = AV16RpExHdAlb ;
      n2714RpExHdAlb = false ;
      A2715RpExHdKgs = AV17RpExHdKgs ;
      n2715RpExHdKgs = false ;
      A2716RpExHdCns = AV18RpExHdCns ;
      n2716RpExHdCns = false ;
      A2717RpExHdTip = AV19RpExHdTip ;
      n2717RpExHdTip = false ;
      A2718RpExHdRes = httpContext.getMessage( "N", "") ;
      n2718RpExHdRes = false ;
      A2719RpExHdLoc = " " ;
      n2719RpExHdLoc = false ;
      A2847RpExHdMts = AV20RpExHdMts ;
      n2847RpExHdMts = false ;
      A6262RpExSalLn = AV21RpExSalLn ;
      n6262RpExSalLn = false ;
      /* Using cursor P05YD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Boolean.valueOf(n2715RpExHdKgs), A2715RpExHdKgs, Boolean.valueOf(n2716RpExHdCns), Short.valueOf(A2716RpExHdCns), Boolean.valueOf(n2717RpExHdTip), A2717RpExHdTip, Boolean.valueOf(n2718RpExHdRes), A2718RpExHdRes, Boolean.valueOf(n2719RpExHdLoc), A2719RpExHdLoc, Boolean.valueOf(n2847RpExHdMts), A2847RpExHdMts, Boolean.valueOf(n6262RpExSalLn), Short.valueOf(A6262RpExSalLn)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork05.this.AV8Emprcod;
      this.aP1[0] = pwork05.this.AV9Mancod;
      this.aP2[0] = pwork05.this.AV10RpExHdFe;
      this.aP3[0] = pwork05.this.AV13BarCod;
      this.aP4[0] = pwork05.this.AV14BarCodReo;
      this.aP5[0] = pwork05.this.AV15BarCodPar;
      this.aP6[0] = pwork05.this.AV16RpExHdAlb;
      this.aP7[0] = pwork05.this.AV18RpExHdCns;
      this.aP8[0] = pwork05.this.AV17RpExHdKgs;
      this.aP9[0] = pwork05.this.AV20RpExHdMts;
      this.aP10[0] = pwork05.this.AV19RpExHdTip;
      this.aP11[0] = pwork05.this.AV21RpExSalLn;
      this.aP12[0] = pwork05.this.AV11RpExtDoc;
      this.aP13[0] = pwork05.this.AV12RpExHdUl;
      Application.commitDataStores(context, remoteHandle, pr_default, "pwork05");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A11300RpExtDoc = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P05YD3_A396EmprCod = new String[] {""} ;
      P05YD3_A2248ManCod = new short[1] ;
      P05YD3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P05YD3_A2712RpExHdUl = new short[1] ;
      P05YD3_n2712RpExHdUl = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      A2718RpExHdRes = "" ;
      A2719RpExHdLoc = "" ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwork05__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P05YD3_A396EmprCod, P05YD3_A2248ManCod, P05YD3_A2711RpExHdFe, P05YD3_A2712RpExHdUl, P05YD3_n2712RpExHdUl
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14BarCodReo ;
   private byte A132BarCodReo ;
   private short AV9Mancod ;
   private short AV18RpExHdCns ;
   private short AV21RpExSalLn ;
   private short AV12RpExHdUl ;
   private short A2248ManCod ;
   private short A2712RpExHdUl ;
   private short Gx_err ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A6262RpExSalLn ;
   private int AV13BarCod ;
   private int AV16RpExHdAlb ;
   private int GX_INS384 ;
   private int GX_INS385 ;
   private int A129BarCod ;
   private int A2714RpExHdAlb ;
   private java.math.BigDecimal AV17RpExHdKgs ;
   private java.math.BigDecimal AV20RpExHdMts ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private String AV8Emprcod ;
   private String AV15BarCodPar ;
   private String AV19RpExHdTip ;
   private String AV11RpExtDoc ;
   private String A396EmprCod ;
   private String A11300RpExtDoc ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2717RpExHdTip ;
   private String A2718RpExHdRes ;
   private String A2719RpExHdLoc ;
   private java.util.Date AV10RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private boolean n11300RpExtDoc ;
   private boolean n2712RpExHdUl ;
   private boolean n2714RpExHdAlb ;
   private boolean n2715RpExHdKgs ;
   private boolean n2716RpExHdCns ;
   private boolean n2717RpExHdTip ;
   private boolean n2718RpExHdRes ;
   private boolean n2719RpExHdLoc ;
   private boolean n2847RpExHdMts ;
   private boolean n6262RpExSalLn ;
   private short[] aP13 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private short[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P05YD3_A396EmprCod ;
   private short[] P05YD3_A2248ManCod ;
   private java.util.Date[] P05YD3_A2711RpExHdFe ;
   private short[] P05YD3_A2712RpExHdUl ;
   private boolean[] P05YD3_n2712RpExHdUl ;
}

final  class pwork05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05YD2", "INSERT INTO TXPCREXHD(EmprCod, ManCod, RpExHdFe, RpExHdUl, RpExtDoc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
         ,new ForEachCursor("P05YD3", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdUl FROM TXPCREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05YD4", "UPDATE TXPCREXHD SET RpExHdUl=?  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
         ,new UpdateCursor("P05YD5", "INSERT INTO TXPLREXHD(EmprCod, ManCod, RpExHdFe, RpExHdLi, BarCod, BarCodReo, BarCodPar, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLREXHD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 20);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[22]).shortValue());
               }
               return;
      }
   }

}

