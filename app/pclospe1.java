package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclospe1 extends GXProcedure
{
   public pclospe1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclospe1.class ), "" );
   }

   public pclospe1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pclospe1.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pclospe1.this.AV12EmprCod = aP0[0];
      this.aP0 = aP0;
      pclospe1.this.AV10PedCod = aP1[0];
      this.aP1 = aP1;
      pclospe1.this.AV11PrdNum = aP2[0];
      this.aP2 = aP2;
      pclospe1.this.AV8OldPedCum = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00WR2 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(AV10PedCod), AV11PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P00WR2_A658PedCod[0] ;
         A719PrdNum = P00WR2_A719PrdNum[0] ;
         A396EmprCod = P00WR2_A396EmprCod[0] ;
         A659PedCum = P00WR2_A659PedCum[0] ;
         AV17PedCum = A659PedCum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV8OldPedCum, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV17PedCum, httpContext.getMessage( "S", "")) == 0 ) )
      {
         /* Using cursor P00WR3 */
         pr_default.execute(1, new Object[] {AV12EmprCod, AV11PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P00WR3_A719PrdNum[0] ;
            A396EmprCod = P00WR3_A396EmprCod[0] ;
            A684PrdCanPen = P00WR3_A684PrdCanPen[0] ;
            AV13CantPdte = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P00WR4 */
            pr_default.execute(2, new Object[] {AV12EmprCod, AV11PrdNum});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A659PedCum = P00WR4_A659PedCum[0] ;
               A719PrdNum = P00WR4_A719PrdNum[0] ;
               A396EmprCod = P00WR4_A396EmprCod[0] ;
               A657PedCanEnt = P00WR4_A657PedCanEnt[0] ;
               A669PedUni = P00WR4_A669PedUni[0] ;
               A658PedCod = P00WR4_A658PedCod[0] ;
               if ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", "")) == 0 )
               {
                  AV14CantPdte2 = A669PedUni.subtract(A657PedCanEnt) ;
                  if ( AV14CantPdte2.doubleValue() < 0 )
                  {
                     AV14CantPdte2 = DecimalUtil.doubleToDec(0) ;
                  }
                  AV13CantPdte = AV13CantPdte.add(AV14CantPdte2) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A684PrdCanPen = AV13CantPdte ;
            /* Using cursor P00WR5 */
            pr_default.execute(3, new Object[] {A684PrdCanPen, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclospe1.this.AV12EmprCod;
      this.aP1[0] = pclospe1.this.AV10PedCod;
      this.aP2[0] = pclospe1.this.AV11PrdNum;
      this.aP3[0] = pclospe1.this.AV8OldPedCum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclospe1");
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
      P00WR2_A658PedCod = new int[1] ;
      P00WR2_A719PrdNum = new String[] {""} ;
      P00WR2_A396EmprCod = new String[] {""} ;
      P00WR2_A659PedCum = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A659PedCum = "" ;
      AV17PedCum = "" ;
      P00WR3_A719PrdNum = new String[] {""} ;
      P00WR3_A396EmprCod = new String[] {""} ;
      P00WR3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV13CantPdte = DecimalUtil.ZERO ;
      P00WR4_A659PedCum = new String[] {""} ;
      P00WR4_A719PrdNum = new String[] {""} ;
      P00WR4_A396EmprCod = new String[] {""} ;
      P00WR4_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WR4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WR4_A658PedCod = new int[1] ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      AV14CantPdte2 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclospe1__default(),
         new Object[] {
             new Object[] {
            P00WR2_A658PedCod, P00WR2_A719PrdNum, P00WR2_A396EmprCod, P00WR2_A659PedCum
            }
            , new Object[] {
            P00WR3_A719PrdNum, P00WR3_A396EmprCod, P00WR3_A684PrdCanPen
            }
            , new Object[] {
            P00WR4_A659PedCum, P00WR4_A719PrdNum, P00WR4_A396EmprCod, P00WR4_A657PedCanEnt, P00WR4_A669PedUni, P00WR4_A658PedCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10PedCod ;
   private int A658PedCod ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal AV13CantPdte ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal AV14CantPdte2 ;
   private String AV12EmprCod ;
   private String AV11PrdNum ;
   private String AV8OldPedCum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A659PedCum ;
   private String AV17PedCum ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P00WR2_A658PedCod ;
   private String[] P00WR2_A719PrdNum ;
   private String[] P00WR2_A396EmprCod ;
   private String[] P00WR2_A659PedCum ;
   private String[] P00WR3_A719PrdNum ;
   private String[] P00WR3_A396EmprCod ;
   private java.math.BigDecimal[] P00WR3_A684PrdCanPen ;
   private String[] P00WR4_A659PedCum ;
   private String[] P00WR4_A719PrdNum ;
   private String[] P00WR4_A396EmprCod ;
   private java.math.BigDecimal[] P00WR4_A657PedCanEnt ;
   private java.math.BigDecimal[] P00WR4_A669PedUni ;
   private int[] P00WR4_A658PedCod ;
}

final  class pclospe1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WR2", "SELECT PedCod, PrdNum, EmprCod, PedCum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? and PrdNum = ? ORDER BY EmprCod, PedCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WR3", "SELECT PrdNum, EmprCod, PrdCanPen FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WR4", "SELECT PedCum, PrdNum, EmprCod, PedCanEnt, PedUni, PedCod FROM TXPLPEDID WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00WR5", "UPDATE TXPPRODUC SET PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

