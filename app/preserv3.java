package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preserv3 extends GXProcedure
{
   public preserv3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preserv3.class ), "" );
   }

   public preserv3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      String [] sP0 = aP0;
      String [] sP1 = aP1;
      String [] sP2 = aP2;
      execute_int(sP0, sP1, sP2);
      aP0[0] = sP0[0];
      aP1[0] = sP1[0];
      aP2[0] = sP2[0];
   }

   protected void execute_int( String[] aP0 ,
                               String[] aP1 ,
                               String[] aP2 )
   {
      preserv3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preserv3.this.AV14Prd1 = aP1[0];
      this.aP1 = aP1;
      preserv3.this.AV15Prd2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04IO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV14Prd1, AV15Prd2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P04IO2_A719PrdNum[0] ;
         A684PrdCanPen = P04IO2_A684PrdCanPen[0] ;
         AV16PrdNum = A719PrdNum ;
         AV19Prdcanpen = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'COMPRAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A684PrdCanPen = AV19Prdcanpen ;
         /* Using cursor P04IO3 */
         pr_default.execute(1, new Object[] {A684PrdCanPen, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPRAS' Routine */
      returnInSub = false ;
      AV19Prdcanpen = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04IO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV16PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P04IO4_A719PrdNum[0] ;
         A658PedCod = P04IO4_A658PedCod[0] ;
         A657PedCanEnt = P04IO4_A657PedCanEnt[0] ;
         A669PedUni = P04IO4_A669PedUni[0] ;
         A659PedCum = P04IO4_A659PedCum[0] ;
         AV20Pedcod = A658PedCod ;
         /* Execute user subroutine: 'CPEDID' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         if ( AV21cpedid == 1 )
         {
            AV19Prdcanpen = AV19Prdcanpen.add((((GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", ""))==0) ? (A669PedUni.subtract(A657PedCanEnt)) : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S123( )
   {
      /* 'CPEDID' Routine */
      returnInSub = false ;
      AV21cpedid = (byte)(0) ;
      /* Using cursor P04IO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV20Pedcod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A658PedCod = P04IO5_A658PedCod[0] ;
         AV21cpedid = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = preserv3.this.A396EmprCod;
      this.aP1[0] = preserv3.this.AV14Prd1;
      this.aP2[0] = preserv3.this.AV15Prd2;
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
      P04IO2_A396EmprCod = new String[] {""} ;
      P04IO2_A719PrdNum = new String[] {""} ;
      P04IO2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV16PrdNum = "" ;
      AV19Prdcanpen = DecimalUtil.ZERO ;
      P04IO4_A396EmprCod = new String[] {""} ;
      P04IO4_A719PrdNum = new String[] {""} ;
      P04IO4_A658PedCod = new int[1] ;
      P04IO4_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04IO4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04IO4_A659PedCum = new String[] {""} ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      P04IO5_A396EmprCod = new String[] {""} ;
      P04IO5_A658PedCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preserv3__default(),
         new Object[] {
             new Object[] {
            P04IO2_A396EmprCod, P04IO2_A719PrdNum, P04IO2_A684PrdCanPen
            }
            , new Object[] {
            }
            , new Object[] {
            P04IO4_A396EmprCod, P04IO4_A719PrdNum, P04IO4_A658PedCod, P04IO4_A657PedCanEnt, P04IO4_A669PedUni, P04IO4_A659PedCum
            }
            , new Object[] {
            P04IO5_A396EmprCod, P04IO5_A658PedCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21cpedid ;
   private short Gx_err ;
   private int A658PedCod ;
   private int AV20Pedcod ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal AV19Prdcanpen ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private String A396EmprCod ;
   private String AV14Prd1 ;
   private String AV15Prd2 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV16PrdNum ;
   private String A659PedCum ;
   private boolean returnInSub ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04IO2_A396EmprCod ;
   private String[] P04IO2_A719PrdNum ;
   private java.math.BigDecimal[] P04IO2_A684PrdCanPen ;
   private String[] P04IO4_A396EmprCod ;
   private String[] P04IO4_A719PrdNum ;
   private int[] P04IO4_A658PedCod ;
   private java.math.BigDecimal[] P04IO4_A657PedCanEnt ;
   private java.math.BigDecimal[] P04IO4_A669PedUni ;
   private String[] P04IO4_A659PedCum ;
   private String[] P04IO5_A396EmprCod ;
   private int[] P04IO5_A658PedCod ;
}

final  class preserv3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04IO2", "SELECT EmprCod, PrdNum, PrdCanPen FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04IO3", "UPDATE TXPPRODUC SET PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P04IO4", "SELECT EmprCod, PrdNum, PedCod, PedCanEnt, PedUni, PedCum FROM TXPLPEDID WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04IO5", "SELECT EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

