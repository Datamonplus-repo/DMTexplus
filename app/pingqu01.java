package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pingqu01 extends GXProcedure
{
   public pingqu01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pingqu01.class ), "" );
   }

   public pingqu01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pingqu01.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 )
   {
      pingqu01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pingqu01.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pingqu01.this.A6158PrdPrv = aP2[0];
      this.aP2 = aP2;
      pingqu01.this.AV8PRDPREA = aP3[0];
      this.aP3 = aP3;
      pingqu01.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV8PRDPREA = DecimalUtil.doubleToDec(0) ;
      AV12GXLvl3 = (byte)(0) ;
      /* Using cursor P05292 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7240PrdPrea = P05292_A7240PrdPrea[0] ;
         AV12GXLvl3 = (byte)(1) ;
         AV8PRDPREA = ((A7240PrdPrea.doubleValue()>0) ? A7240PrdPrea : AV8PRDPREA) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl3 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Error.Este Producto no pertenece a este Proveedor", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pingqu01.this.A396EmprCod;
      this.aP1[0] = pingqu01.this.A719PrdNum;
      this.aP2[0] = pingqu01.this.A6158PrdPrv;
      this.aP3[0] = pingqu01.this.AV8PRDPREA;
      this.aP4[0] = pingqu01.this.Gx_msg;
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
      P05292_A396EmprCod = new String[] {""} ;
      P05292_A719PrdNum = new String[] {""} ;
      P05292_A6158PrdPrv = new int[1] ;
      P05292_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pingqu01__default(),
         new Object[] {
             new Object[] {
            P05292_A396EmprCod, P05292_A719PrdNum, P05292_A6158PrdPrv, P05292_A7240PrdPrea
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl3 ;
   private short Gx_err ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal AV8PRDPREA ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05292_A396EmprCod ;
   private String[] P05292_A719PrdNum ;
   private int[] P05292_A6158PrdPrv ;
   private java.math.BigDecimal[] P05292_A7240PrdPrea ;
}

final  class pingqu01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05292", "SELECT EmprCod, PrdNum, PrdPrv, PrdPrea FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ? ORDER BY EmprCod, PrdNum, PrdPrv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
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
      }
   }

}

