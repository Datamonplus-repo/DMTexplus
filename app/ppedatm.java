package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedatm extends GXProcedure
{
   public ppedatm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedatm.class ), "" );
   }

   public ppedatm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 )
   {
      ppedatm.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppedatm.this.A396EmprCod = aP0;
      ppedatm.this.A11604PArtId = aP1;
      ppedatm.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P04M92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      c11561PACMtr = P04M92_A11561PACMtr[0] ;
      pr_default.close(0);
      AV9PartMtr = AV9PartMtr.add(c11561PACMtr) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ppedatm.this.AV9PartMtr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9PartMtr = DecimalUtil.ZERO ;
      c11561PACMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04M92_A11561PACMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedatm__default(),
         new Object[] {
             new Object[] {
            P04M92_A11561PACMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11604PArtId ;
   private java.math.BigDecimal AV9PartMtr ;
   private java.math.BigDecimal c11561PACMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P04M92_A11561PACMtr ;
}

final  class ppedatm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04M92", "SELECT SUM(PACMtr) FROM TXPPedACr WHERE EmprCod = ? and PArtId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
      }
   }

}

