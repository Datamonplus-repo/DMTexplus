package app.comprasquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioproveedor extends GXProcedure
{
   public precioproveedor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioproveedor.class ), "" );
   }

   public precioproveedor( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           int aP2 )
   {
      precioproveedor.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      precioproveedor.this.AV8EmprCod = aP0;
      precioproveedor.this.AV12PrdNum = aP1;
      precioproveedor.this.AV11PrvNum = aP2;
      precioproveedor.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV9Proprv) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int2) ;
      precioproveedor.this.GXt_int1 = GXv_int2[0] ;
      AV9Proprv = GXt_int1 ;
      if ( AV9Proprv == 1 )
      {
         /* Using cursor P09V42 */
         pr_default.execute(0, new Object[] {AV8EmprCod, AV12PrdNum, Integer.valueOf(AV11PrvNum)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A6158PrdPrv = P09V42_A6158PrdPrv[0] ;
            A719PrdNum = P09V42_A719PrdNum[0] ;
            A396EmprCod = P09V42_A396EmprCod[0] ;
            A7240PrdPrea = P09V42_A7240PrdPrea[0] ;
            AV10pedpre = A7240PrdPrea ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P09V43 */
         pr_default.execute(1, new Object[] {AV8EmprCod, AV12PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P09V43_A719PrdNum[0] ;
            A396EmprCod = P09V43_A396EmprCod[0] ;
            A724PrdPreAct = P09V43_A724PrdPreAct[0] ;
            AV10pedpre = A724PrdPreAct ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = precioproveedor.this.AV10pedpre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10pedpre = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P09V42_A6158PrdPrv = new int[1] ;
      P09V42_A719PrdNum = new String[] {""} ;
      P09V42_A396EmprCod = new String[] {""} ;
      P09V42_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      P09V43_A719PrdNum = new String[] {""} ;
      P09V43_A396EmprCod = new String[] {""} ;
      P09V43_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.precioproveedor__default(),
         new Object[] {
             new Object[] {
            P09V42_A6158PrdPrv, P09V42_A719PrdNum, P09V42_A396EmprCod, P09V42_A7240PrdPrea
            }
            , new Object[] {
            P09V43_A719PrdNum, P09V43_A396EmprCod, P09V43_A724PrdPreAct
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV9Proprv ;
   private short Gx_err ;
   private int AV11PrvNum ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal AV10pedpre ;
   private java.math.BigDecimal A7240PrdPrea ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV8EmprCod ;
   private String AV12PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P09V42_A6158PrdPrv ;
   private String[] P09V42_A719PrdNum ;
   private String[] P09V42_A396EmprCod ;
   private java.math.BigDecimal[] P09V42_A7240PrdPrea ;
   private String[] P09V43_A719PrdNum ;
   private String[] P09V43_A396EmprCod ;
   private java.math.BigDecimal[] P09V43_A724PrdPreAct ;
}

final  class precioproveedor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V42", "SELECT PrdPrv, PrdNum, EmprCod, PrdPrea FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ? ORDER BY EmprCod, PrdNum, PrdPrv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V43", "SELECT PrdNum, EmprCod, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
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
               return;
      }
   }

}

