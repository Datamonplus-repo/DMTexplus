package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pempesa extends GXProcedure
{
   public pempesa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pempesa.class ), "" );
   }

   public pempesa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 )
   {
      pempesa.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pempesa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pempesa.this.A1031EmpesCod = aP1[0];
      this.aP1 = aP1;
      pempesa.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pempesa.this.AV15Flag1 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag1 = (byte)(0) ;
      /* Using cursor P00Z32 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1032FonCod = P00Z32_A1032FonCod[0] ;
         AV15Flag1 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pempesa.this.A396EmprCod;
      this.aP1[0] = pempesa.this.A1031EmpesCod;
      this.aP2[0] = pempesa.this.A252CliCod;
      this.aP3[0] = pempesa.this.AV15Flag1;
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
      P00Z32_A396EmprCod = new String[] {""} ;
      P00Z32_A1031EmpesCod = new String[] {""} ;
      P00Z32_A252CliCod = new int[1] ;
      P00Z32_A1032FonCod = new String[] {""} ;
      A1032FonCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pempesa__default(),
         new Object[] {
             new Object[] {
            P00Z32_A396EmprCod, P00Z32_A1031EmpesCod, P00Z32_A252CliCod, P00Z32_A1032FonCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag1 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A1031EmpesCod ;
   private String scmdbuf ;
   private String A1032FonCod ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Z32_A396EmprCod ;
   private String[] P00Z32_A1031EmpesCod ;
   private int[] P00Z32_A252CliCod ;
   private String[] P00Z32_A1032FonCod ;
}

final  class pempesa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Z32", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? ORDER BY EmprCod, EmpesCod, CliCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

