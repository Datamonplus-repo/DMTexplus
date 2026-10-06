package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdvdccalm extends GXProcedure
{
   public pdvdccalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdvdccalm.class ), "" );
   }

   public pdvdccalm( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 )
   {
      pdvdccalm.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pdvdccalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdvdccalm.this.AV9prdNum = aP1[0];
      this.aP1 = aP1;
      pdvdccalm.this.AV10CC_Numalb = aP2[0];
      this.aP2 = aP2;
      pdvdccalm.this.AV8CC_almcod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04XK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9prdNum, Integer.valueOf(AV10CC_Numalb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11935DVPrdNum = P04XK2_A11935DVPrdNum[0] ;
         A11945DVCC_NumAl = P04XK2_A11945DVCC_NumAl[0] ;
         n11945DVCC_NumAl = P04XK2_n11945DVCC_NumAl[0] ;
         A11943DVCC_Desc = P04XK2_A11943DVCC_Desc[0] ;
         n11943DVCC_Desc = P04XK2_n11943DVCC_Desc[0] ;
         A11942DVTipMvCc = P04XK2_A11942DVTipMvCc[0] ;
         n11942DVTipMvCc = P04XK2_n11942DVTipMvCc[0] ;
         A11940DVCC_Cant = P04XK2_A11940DVCC_Cant[0] ;
         n11940DVCC_Cant = P04XK2_n11940DVCC_Cant[0] ;
         A11936DVCC_Lin = P04XK2_A11936DVCC_Lin[0] ;
         if ( GXutil.strcmp(A11942DVTipMvCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            if ( GXutil.strcmp(A11943DVCC_Desc, httpContext.getMessage( "Consumo Manual Alm Gral,TSAMNAG", "")) == 0 )
            {
               AV11Cc_cant = A11940DVCC_Cant ;
               /* Execute user subroutine: 'PRDALM' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Using cursor P04XK3 */
               pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCALM");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04XK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV9prdNum, Integer.valueOf(AV10CC_Numalb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A11964DVCCStkDsc = P04XK4_A11964DVCCStkDsc[0] ;
         n11964DVCCStkDsc = P04XK4_n11964DVCCStkDsc[0] ;
         A11953DVTipMovCc = P04XK4_A11953DVTipMovCc[0] ;
         n11953DVTipMovCc = P04XK4_n11953DVTipMovCc[0] ;
         A11960DVCCStkPed = P04XK4_A11960DVCCStkPed[0] ;
         n11960DVCCStkPed = P04XK4_n11960DVCCStkPed[0] ;
         A11935DVPrdNum = P04XK4_A11935DVPrdNum[0] ;
         A11950DVCCStkLin = P04XK4_A11950DVCCStkLin[0] ;
         if ( GXutil.strcmp(A11953DVTipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            if ( GXutil.strcmp(A11964DVCCStkDsc, httpContext.getMessage( "Consumo Manual Alm Gral,TSAMNA", "")) == 0 )
            {
               /* Using cursor P04XK5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11950DVCCStkLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCSTKS");
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'PRDALM' Routine */
      returnInSub = false ;
      n12002DVCC_ExisC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XK6 */
      pr_default.execute(4, new Object[] {AV11Cc_cant, A396EmprCod, AV9prdNum, Byte.valueOf(AV8CC_almcod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPRDALM");
      /* End optimized UPDATE. */
      n12018DVPrdExiCC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XK7 */
      pr_default.execute(5, new Object[] {AV11Cc_cant, A396EmprCod, AV9prdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdvdccalm.this.A396EmprCod;
      this.aP1[0] = pdvdccalm.this.AV9prdNum;
      this.aP2[0] = pdvdccalm.this.AV10CC_Numalb;
      this.aP3[0] = pdvdccalm.this.AV8CC_almcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdvdccalm");
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
      P04XK2_A396EmprCod = new String[] {""} ;
      P04XK2_A11935DVPrdNum = new String[] {""} ;
      P04XK2_A11945DVCC_NumAl = new int[1] ;
      P04XK2_n11945DVCC_NumAl = new boolean[] {false} ;
      P04XK2_A11943DVCC_Desc = new String[] {""} ;
      P04XK2_n11943DVCC_Desc = new boolean[] {false} ;
      P04XK2_A11942DVTipMvCc = new String[] {""} ;
      P04XK2_n11942DVTipMvCc = new boolean[] {false} ;
      P04XK2_A11940DVCC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XK2_n11940DVCC_Cant = new boolean[] {false} ;
      P04XK2_A11936DVCC_Lin = new long[1] ;
      A11935DVPrdNum = "" ;
      A11943DVCC_Desc = "" ;
      A11942DVTipMvCc = "" ;
      A11940DVCC_Cant = DecimalUtil.ZERO ;
      AV11Cc_cant = DecimalUtil.ZERO ;
      P04XK4_A396EmprCod = new String[] {""} ;
      P04XK4_A11964DVCCStkDsc = new String[] {""} ;
      P04XK4_n11964DVCCStkDsc = new boolean[] {false} ;
      P04XK4_A11953DVTipMovCc = new String[] {""} ;
      P04XK4_n11953DVTipMovCc = new boolean[] {false} ;
      P04XK4_A11960DVCCStkPed = new int[1] ;
      P04XK4_n11960DVCCStkPed = new boolean[] {false} ;
      P04XK4_A11935DVPrdNum = new String[] {""} ;
      P04XK4_A11950DVCCStkLin = new long[1] ;
      A11964DVCCStkDsc = "" ;
      A11953DVTipMovCc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdvdccalm__default(),
         new Object[] {
             new Object[] {
            P04XK2_A396EmprCod, P04XK2_A11935DVPrdNum, P04XK2_A11945DVCC_NumAl, P04XK2_n11945DVCC_NumAl, P04XK2_A11943DVCC_Desc, P04XK2_n11943DVCC_Desc, P04XK2_A11942DVTipMvCc, P04XK2_n11942DVTipMvCc, P04XK2_A11940DVCC_Cant, P04XK2_n11940DVCC_Cant,
            P04XK2_A11936DVCC_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            P04XK4_A396EmprCod, P04XK4_A11964DVCCStkDsc, P04XK4_n11964DVCCStkDsc, P04XK4_A11953DVTipMovCc, P04XK4_n11953DVTipMovCc, P04XK4_A11960DVCCStkPed, P04XK4_n11960DVCCStkPed, P04XK4_A11935DVPrdNum, P04XK4_A11950DVCCStkLin
            }
            , new Object[] {
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

   private byte AV8CC_almcod ;
   private short Gx_err ;
   private int AV10CC_Numalb ;
   private int A11945DVCC_NumAl ;
   private int A11960DVCCStkPed ;
   private long A11936DVCC_Lin ;
   private long A11950DVCCStkLin ;
   private java.math.BigDecimal A11940DVCC_Cant ;
   private java.math.BigDecimal AV11Cc_cant ;
   private String A396EmprCod ;
   private String AV9prdNum ;
   private String scmdbuf ;
   private String A11935DVPrdNum ;
   private String A11943DVCC_Desc ;
   private String A11942DVTipMvCc ;
   private String A11964DVCCStkDsc ;
   private String A11953DVTipMovCc ;
   private boolean n11945DVCC_NumAl ;
   private boolean n11943DVCC_Desc ;
   private boolean n11942DVTipMvCc ;
   private boolean n11940DVCC_Cant ;
   private boolean returnInSub ;
   private boolean n11964DVCCStkDsc ;
   private boolean n11953DVTipMovCc ;
   private boolean n11960DVCCStkPed ;
   private boolean n12002DVCC_ExisC ;
   private boolean n12018DVPrdExiCC ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XK2_A396EmprCod ;
   private String[] P04XK2_A11935DVPrdNum ;
   private int[] P04XK2_A11945DVCC_NumAl ;
   private boolean[] P04XK2_n11945DVCC_NumAl ;
   private String[] P04XK2_A11943DVCC_Desc ;
   private boolean[] P04XK2_n11943DVCC_Desc ;
   private String[] P04XK2_A11942DVTipMvCc ;
   private boolean[] P04XK2_n11942DVTipMvCc ;
   private java.math.BigDecimal[] P04XK2_A11940DVCC_Cant ;
   private boolean[] P04XK2_n11940DVCC_Cant ;
   private long[] P04XK2_A11936DVCC_Lin ;
   private String[] P04XK4_A396EmprCod ;
   private String[] P04XK4_A11964DVCCStkDsc ;
   private boolean[] P04XK4_n11964DVCCStkDsc ;
   private String[] P04XK4_A11953DVTipMovCc ;
   private boolean[] P04XK4_n11953DVTipMovCc ;
   private int[] P04XK4_A11960DVCCStkPed ;
   private boolean[] P04XK4_n11960DVCCStkPed ;
   private String[] P04XK4_A11935DVPrdNum ;
   private long[] P04XK4_A11950DVCCStkLin ;
}

final  class pdvdccalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XK2", "SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_NumAlb, CC_Desc, TipMovCc AS DVTipMvCc, CC_Cant, CC_lin FROM LVNCCALM WHERE Emprcod = ? and Prdnum = ? and CC_NumAlb = ? ORDER BY Emprcod, Prdnum, CC_NumAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XK3", "DELETE FROM LVNCCALM  WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNCCALM")
         ,new ForEachCursor("P04XK4", "SELECT Emprcod AS EmprCod, CCStkDsc, TipMovCc AS DVTipMovCc, CCStkPed, Prdnum AS DVPrdNum, CCStkLin FROM LVNCCSTKS WHERE (Emprcod = ? and Prdnum = ?) AND (CCStkPed = ?) ORDER BY Emprcod, Prdnum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XK5", "DELETE FROM LVNCCSTKS  WHERE Emprcod = ? AND Prdnum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNCCSTKS")
         ,new UpdateCursor("P04XK6", "UPDATE LVNPRDALM SET CC_ExisCC=CC_ExisCC + ?  WHERE Emprcod = ? and Prdnum = ? and CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNPRDALM")
         ,new UpdateCursor("P04XK7", "UPDATE LVNDVPRODUC SET PrdExiCC=PrdExiCC + ?  WHERE Emprcod = ? and Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((long[]) buf[8])[0] = rslt.getLong(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

