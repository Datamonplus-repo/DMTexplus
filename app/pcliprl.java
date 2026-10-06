package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcliprl extends GXProcedure
{
   public pcliprl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcliprl.class ), "" );
   }

   public pcliprl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      pcliprl.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pcliprl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcliprl.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcliprl.this.A5398Cli_Proc = aP2[0];
      this.aP2 = aP2;
      pcliprl.this.AV14Cli_ProPP = aP3[0];
      this.aP3 = aP3;
      pcliprl.this.AV15Cli_ProPK = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Cli_ProPK = DecimalUtil.doubleToDec(0) ;
      AV14Cli_ProPP = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01PO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5398Cli_Proc});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5401Cli_ProPK = P01PO2_A5401Cli_ProPK[0] ;
         n5401Cli_ProPK = P01PO2_n5401Cli_ProPK[0] ;
         A5403Cli_ProPP = P01PO2_A5403Cli_ProPP[0] ;
         n5403Cli_ProPP = P01PO2_n5403Cli_ProPP[0] ;
         AV15Cli_ProPK = A5401Cli_ProPK ;
         AV14Cli_ProPP = A5403Cli_ProPP ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcliprl.this.A396EmprCod;
      this.aP1[0] = pcliprl.this.A252CliCod;
      this.aP2[0] = pcliprl.this.A5398Cli_Proc;
      this.aP3[0] = pcliprl.this.AV14Cli_ProPP;
      this.aP4[0] = pcliprl.this.AV15Cli_ProPK;
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
      P01PO2_A396EmprCod = new String[] {""} ;
      P01PO2_A252CliCod = new int[1] ;
      P01PO2_A5398Cli_Proc = new String[] {""} ;
      P01PO2_A5401Cli_ProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01PO2_n5401Cli_ProPK = new boolean[] {false} ;
      P01PO2_A5403Cli_ProPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01PO2_n5403Cli_ProPP = new boolean[] {false} ;
      A5401Cli_ProPK = DecimalUtil.ZERO ;
      A5403Cli_ProPP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcliprl__default(),
         new Object[] {
             new Object[] {
            P01PO2_A396EmprCod, P01PO2_A252CliCod, P01PO2_A5398Cli_Proc, P01PO2_A5401Cli_ProPK, P01PO2_n5401Cli_ProPK, P01PO2_A5403Cli_ProPP, P01PO2_n5403Cli_ProPP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV14Cli_ProPP ;
   private java.math.BigDecimal AV15Cli_ProPK ;
   private java.math.BigDecimal A5401Cli_ProPK ;
   private java.math.BigDecimal A5403Cli_ProPP ;
   private String A396EmprCod ;
   private String A5398Cli_Proc ;
   private String scmdbuf ;
   private boolean n5401Cli_ProPK ;
   private boolean n5403Cli_ProPP ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PO2_A396EmprCod ;
   private int[] P01PO2_A252CliCod ;
   private String[] P01PO2_A5398Cli_Proc ;
   private java.math.BigDecimal[] P01PO2_A5401Cli_ProPK ;
   private boolean[] P01PO2_n5401Cli_ProPK ;
   private java.math.BigDecimal[] P01PO2_A5403Cli_ProPP ;
   private boolean[] P01PO2_n5403Cli_ProPP ;
}

final  class pcliprl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PO2", "SELECT EmprCod, CliCod, Cli_Proc, Cli_ProPK, Cli_ProPP FROM TXPCLIPRL WHERE EmprCod = ? and CliCod = ? and Cli_Proc = ? ORDER BY EmprCod, CliCod, Cli_Proc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

