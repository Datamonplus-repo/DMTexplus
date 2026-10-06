package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc77 extends GXProcedure
{
   public pprc77( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc77.class ), "" );
   }

   public pprc77( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      pprc77.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pprc77.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc77.this.A9492MRCod = aP1[0];
      this.aP1 = aP1;
      pprc77.this.AV8MComSolPre = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MComSolPre = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05GJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11052MComSolPre = P05GJ2_A11052MComSolPre[0] ;
         A11055MComCod = P05GJ2_A11055MComCod[0] ;
         AV8MComSolPre = A11052MComSolPre ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc77.this.A396EmprCod;
      this.aP1[0] = pprc77.this.A9492MRCod;
      this.aP2[0] = pprc77.this.AV8MComSolPre;
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
      P05GJ2_A396EmprCod = new String[] {""} ;
      P05GJ2_A9492MRCod = new int[1] ;
      P05GJ2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05GJ2_A11055MComCod = new long[1] ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc77__default(),
         new Object[] {
             new Object[] {
            P05GJ2_A396EmprCod, P05GJ2_A9492MRCod, P05GJ2_A11052MComSolPre, P05GJ2_A11055MComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9492MRCod ;
   private long A11055MComCod ;
   private java.math.BigDecimal AV8MComSolPre ;
   private java.math.BigDecimal A11052MComSolPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05GJ2_A396EmprCod ;
   private int[] P05GJ2_A9492MRCod ;
   private java.math.BigDecimal[] P05GJ2_A11052MComSolPre ;
   private long[] P05GJ2_A11055MComCod ;
}

final  class pprc77__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GJ2", "SELECT * FROM (SELECT EmprCod, MRCod, MComSolPre, MComCod FROM TXPMRepC1 WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod, MComCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
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

