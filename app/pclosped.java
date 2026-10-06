package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclosped extends GXProcedure
{
   public pclosped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclosped.class ), "" );
   }

   public pclosped( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pclosped.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pclosped.this.AV12EmprCod = aP0[0];
      this.aP0 = aP0;
      pclosped.this.AV11PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00W62 */
      pr_default.execute(0, new Object[] {AV12EmprCod, AV11PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P00W62_A719PrdNum[0] ;
         A396EmprCod = P00W62_A396EmprCod[0] ;
         A684PrdCanPen = P00W62_A684PrdCanPen[0] ;
         AV13CantPdte = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P00W63 */
         pr_default.execute(1, new Object[] {AV12EmprCod, AV11PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A659PedCum = P00W63_A659PedCum[0] ;
            A719PrdNum = P00W63_A719PrdNum[0] ;
            A396EmprCod = P00W63_A396EmprCod[0] ;
            A657PedCanEnt = P00W63_A657PedCanEnt[0] ;
            A669PedUni = P00W63_A669PedUni[0] ;
            A658PedCod = P00W63_A658PedCod[0] ;
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
         /* Using cursor P00W64 */
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
      this.aP0[0] = pclosped.this.AV12EmprCod;
      this.aP1[0] = pclosped.this.AV11PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclosped");
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
      P00W62_A719PrdNum = new String[] {""} ;
      P00W62_A396EmprCod = new String[] {""} ;
      P00W62_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV13CantPdte = DecimalUtil.ZERO ;
      P00W63_A659PedCum = new String[] {""} ;
      P00W63_A719PrdNum = new String[] {""} ;
      P00W63_A396EmprCod = new String[] {""} ;
      P00W63_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00W63_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00W63_A658PedCod = new int[1] ;
      A659PedCum = "" ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      AV14CantPdte2 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclosped__default(),
         new Object[] {
             new Object[] {
            P00W62_A719PrdNum, P00W62_A396EmprCod, P00W62_A684PrdCanPen
            }
            , new Object[] {
            P00W63_A659PedCum, P00W63_A719PrdNum, P00W63_A396EmprCod, P00W63_A657PedCanEnt, P00W63_A669PedUni, P00W63_A658PedCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
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
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00W62_A719PrdNum ;
   private String[] P00W62_A396EmprCod ;
   private java.math.BigDecimal[] P00W62_A684PrdCanPen ;
   private String[] P00W63_A659PedCum ;
   private String[] P00W63_A719PrdNum ;
   private String[] P00W63_A396EmprCod ;
   private java.math.BigDecimal[] P00W63_A657PedCanEnt ;
   private java.math.BigDecimal[] P00W63_A669PedUni ;
   private int[] P00W63_A658PedCod ;
}

final  class pclosped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00W62", "SELECT PrdNum, EmprCod, PrdCanPen FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00W63", "SELECT PedCum, PrdNum, EmprCod, PedCanEnt, PedUni, PedCod FROM TXPLPEDID WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00W64", "UPDATE TXPPRODUC SET PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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

