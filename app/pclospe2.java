package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclospe2 extends GXProcedure
{
   public pclospe2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclospe2.class ), "" );
   }

   public pclospe2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      pclospe2.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pclospe2.this.AV12EmprCod = aP0[0];
      this.aP0 = aP0;
      pclospe2.this.AV11PrdNum = aP1[0];
      this.aP1 = aP1;
      pclospe2.this.AV10PedCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P018A2 */
      pr_default.execute(0, new Object[] {AV12EmprCod, AV11PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P018A2_A719PrdNum[0] ;
         A396EmprCod = P018A2_A396EmprCod[0] ;
         A684PrdCanPen = P018A2_A684PrdCanPen[0] ;
         AV13CantPdte = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P018A3 */
         pr_default.execute(1, new Object[] {AV12EmprCod, AV11PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A659PedCum = P018A3_A659PedCum[0] ;
            A719PrdNum = P018A3_A719PrdNum[0] ;
            A396EmprCod = P018A3_A396EmprCod[0] ;
            A657PedCanEnt = P018A3_A657PedCanEnt[0] ;
            A669PedUni = P018A3_A669PedUni[0] ;
            A658PedCod = P018A3_A658PedCod[0] ;
            if ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", "")) == 0 )
            {
               AV14CantPdte2 = A669PedUni.subtract(A657PedCanEnt) ;
               if ( AV14CantPdte2.doubleValue() < 0 )
               {
                  AV14CantPdte2 = DecimalUtil.doubleToDec(0) ;
               }
               AV13CantPdte = AV13CantPdte.add(AV14CantPdte2) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A684PrdCanPen = AV13CantPdte ;
         /* Using cursor P018A4 */
         pr_default.execute(2, new Object[] {A684PrdCanPen, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclospe2.this.AV12EmprCod;
      this.aP1[0] = pclospe2.this.AV11PrdNum;
      this.aP2[0] = pclospe2.this.AV10PedCod;
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
      P018A2_A719PrdNum = new String[] {""} ;
      P018A2_A396EmprCod = new String[] {""} ;
      P018A2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV13CantPdte = DecimalUtil.ZERO ;
      P018A3_A659PedCum = new String[] {""} ;
      P018A3_A719PrdNum = new String[] {""} ;
      P018A3_A396EmprCod = new String[] {""} ;
      P018A3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018A3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018A3_A658PedCod = new int[1] ;
      A659PedCum = "" ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      AV14CantPdte2 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclospe2__default(),
         new Object[] {
             new Object[] {
            P018A2_A719PrdNum, P018A2_A396EmprCod, P018A2_A684PrdCanPen
            }
            , new Object[] {
            P018A3_A659PedCum, P018A3_A719PrdNum, P018A3_A396EmprCod, P018A3_A657PedCanEnt, P018A3_A669PedUni, P018A3_A658PedCod
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
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A659PedCum ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P018A2_A719PrdNum ;
   private String[] P018A2_A396EmprCod ;
   private java.math.BigDecimal[] P018A2_A684PrdCanPen ;
   private String[] P018A3_A659PedCum ;
   private String[] P018A3_A719PrdNum ;
   private String[] P018A3_A396EmprCod ;
   private java.math.BigDecimal[] P018A3_A657PedCanEnt ;
   private java.math.BigDecimal[] P018A3_A669PedUni ;
   private int[] P018A3_A658PedCod ;
}

final  class pclospe2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018A2", "SELECT PrdNum, EmprCod, PrdCanPen FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P018A3", "SELECT PedCum, PrdNum, EmprCod, PedCanEnt, PedUni, PedCod FROM TXPLPEDID WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018A4", "UPDATE TXPPRODUC SET PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               return;
            case 1 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

