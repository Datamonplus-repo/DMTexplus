package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedatk extends GXProcedure
{
   public ppedatk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedatk.class ), "" );
   }

   public ppedatk( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 )
   {
      ppedatk.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      ppedatk.this.A396EmprCod = aP0;
      ppedatk.this.A11604PArtId = aP1;
      ppedatk.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P04M82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      c11560PACKgm = P04M82_A11560PACKgm[0] ;
      pr_default.close(0);
      AV10PartKgm = AV10PartKgm.add(c11560PACKgm) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ppedatk.this.AV10PartKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10PartKgm = DecimalUtil.ZERO ;
      c11560PACKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04M82_A11560PACKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedatk__default(),
         new Object[] {
             new Object[] {
            P04M82_A11560PACKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11604PArtId ;
   private java.math.BigDecimal AV10PartKgm ;
   private java.math.BigDecimal c11560PACKgm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P04M82_A11560PACKgm ;
}

final  class ppedatk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04M82", "SELECT SUM(PACKgm) FROM TXPPedACr WHERE EmprCod = ? and PArtId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

