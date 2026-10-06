package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreuni extends GXProcedure
{
   public ppreuni( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreuni.class ), "" );
   }

   public ppreuni( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      ppreuni.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ppreuni.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreuni.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      ppreuni.this.AV8DisPreKgm = aP2[0];
      this.aP2 = aP2;
      ppreuni.this.AV9DisPreMtr = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02852 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A388DisPreKgm = P02852_A388DisPreKgm[0] ;
         A389DisPreMtr = P02852_A389DisPreMtr[0] ;
         AV8DisPreKgm = A388DisPreKgm ;
         AV9DisPreMtr = A389DisPreMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreuni.this.A396EmprCod;
      this.aP1[0] = ppreuni.this.A361DisCod;
      this.aP2[0] = ppreuni.this.AV8DisPreKgm;
      this.aP3[0] = ppreuni.this.AV9DisPreMtr;
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
      P02852_A396EmprCod = new String[] {""} ;
      P02852_A361DisCod = new int[1] ;
      P02852_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02852_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreuni__default(),
         new Object[] {
             new Object[] {
            P02852_A396EmprCod, P02852_A361DisCod, P02852_A388DisPreKgm, P02852_A389DisPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private java.math.BigDecimal AV8DisPreKgm ;
   private java.math.BigDecimal AV9DisPreMtr ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02852_A396EmprCod ;
   private int[] P02852_A361DisCod ;
   private java.math.BigDecimal[] P02852_A388DisPreKgm ;
   private java.math.BigDecimal[] P02852_A389DisPreMtr ;
}

final  class ppreuni__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02852", "SELECT EmprCod, DisCod, DisPreKgm, DisPreMtr FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
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

