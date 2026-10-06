package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls006 extends GXProcedure
{
   public pcls006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls006.class ), "" );
   }

   public pcls006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pcls006.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pcls006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls006.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pcls006.this.AV8PrdCanFin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P055P2 */
      pr_default.execute(0, new Object[] {AV8PrdCanFin, AV8PrdCanFin, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls006.this.A396EmprCod;
      this.aP1[0] = pcls006.this.A719PrdNum;
      this.aP2[0] = pcls006.this.AV8PrdCanFin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls006__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV8PrdCanFin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pcls006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P055P2", "UPDATE TXPPRODUC SET PrdCanRes=PrdCanRes - ( CASE  WHEN PrdCanRes - ( CAST(( ? * CAST(PrdFacCon AS NUMERIC(22,10))) / 1000 AS NUMERIC(25,10))) < 0 THEN 0 ELSE ( CAST(( ? * CAST(PrdFacCon AS NUMERIC(22,10))) / 1000 AS NUMERIC(25,10))) END)  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

