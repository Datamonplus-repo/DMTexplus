package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpen extends GXProcedure
{
   public pmodpen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpen.class ), "" );
   }

   public pmodpen( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 )
   {
      pmodpen.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pmodpen.this.A396EmprCod = aP0;
      pmodpen.this.A719PrdNum = aP1;
      pmodpen.this.AV15Cantidad = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P003Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A684PrdCanPen = P003Z2_A684PrdCanPen[0] ;
         A714PrdFulPed = P003Z2_A714PrdFulPed[0] ;
         A684PrdCanPen = A684PrdCanPen.add(AV15Cantidad) ;
         A714PrdFulPed = GXutil.today( ) ;
         /* Using cursor P003Z3 */
         pr_default.execute(1, new Object[] {A684PrdCanPen, A714PrdFulPed, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pmodpen.this.AV15Cantidad;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpen");
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
      P003Z2_A396EmprCod = new String[] {""} ;
      P003Z2_A719PrdNum = new String[] {""} ;
      P003Z2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Z2_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A714PrdFulPed = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpen__default(),
         new Object[] {
             new Object[] {
            P003Z2_A396EmprCod, P003Z2_A719PrdNum, P003Z2_A684PrdCanPen, P003Z2_A714PrdFulPed
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV15Cantidad ;
   private java.math.BigDecimal A684PrdCanPen ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private java.util.Date A714PrdFulPed ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P003Z2_A396EmprCod ;
   private String[] P003Z2_A719PrdNum ;
   private java.math.BigDecimal[] P003Z2_A684PrdCanPen ;
   private java.util.Date[] P003Z2_A714PrdFulPed ;
}

final  class pmodpen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Z2", "SELECT EmprCod, PrdNum, PrdCanPen, PrdFulPed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003Z3", "UPDATE TXPPRODUC SET PrdCanPen=?, PrdFulPed=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

