package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precpes extends GXProcedure
{
   public precpes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precpes.class ), "" );
   }

   public precpes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      precpes.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      precpes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precpes.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      precpes.this.AV8AlbRUniEnt = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01WA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P01WA2_A316ContVal[0] ;
         AV8AlbRUniEnt = DecimalUtil.doubleToDec(A316ContVal/ (double) (100)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precpes.this.A396EmprCod;
      this.aP1[0] = precpes.this.A313ContCod;
      this.aP2[0] = precpes.this.AV8AlbRUniEnt;
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
      P01WA2_A396EmprCod = new String[] {""} ;
      P01WA2_A313ContCod = new String[] {""} ;
      P01WA2_A316ContVal = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precpes__default(),
         new Object[] {
             new Object[] {
            P01WA2_A396EmprCod, P01WA2_A313ContCod, P01WA2_A316ContVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A316ContVal ;
   private java.math.BigDecimal AV8AlbRUniEnt ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WA2_A396EmprCod ;
   private String[] P01WA2_A313ContCod ;
   private int[] P01WA2_A316ContVal ;
}

final  class precpes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WA2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

