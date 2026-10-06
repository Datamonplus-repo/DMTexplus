package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdescli extends GXProcedure
{
   public pdescli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdescli.class ), "" );
   }

   public pdescli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pdescli.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pdescli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdescli.this.A2308CliDesCod = aP1[0];
      this.aP1 = aP1;
      pdescli.this.AV9CliDesNom = aP2[0];
      this.aP2 = aP2;
      pdescli.this.AV10Ok_Destino = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Ok_Destino = (byte)(0) ;
      /* Using cursor P02CS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2308CliDesCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2309CliDesNom = P02CS2_A2309CliDesNom[0] ;
         n2309CliDesNom = P02CS2_n2309CliDesNom[0] ;
         A252CliCod = P02CS2_A252CliCod[0] ;
         AV9CliDesNom = A2309CliDesNom ;
         AV10Ok_Destino = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdescli.this.A396EmprCod;
      this.aP1[0] = pdescli.this.A2308CliDesCod;
      this.aP2[0] = pdescli.this.AV9CliDesNom;
      this.aP3[0] = pdescli.this.AV10Ok_Destino;
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
      P02CS2_A396EmprCod = new String[] {""} ;
      P02CS2_A2308CliDesCod = new int[1] ;
      P02CS2_A2309CliDesNom = new String[] {""} ;
      P02CS2_n2309CliDesNom = new boolean[] {false} ;
      P02CS2_A252CliCod = new int[1] ;
      A2309CliDesNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdescli__default(),
         new Object[] {
             new Object[] {
            P02CS2_A396EmprCod, P02CS2_A2308CliDesCod, P02CS2_A2309CliDesNom, P02CS2_n2309CliDesNom, P02CS2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Ok_Destino ;
   private short Gx_err ;
   private int A2308CliDesCod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV9CliDesNom ;
   private String scmdbuf ;
   private String A2309CliDesNom ;
   private boolean n2309CliDesNom ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CS2_A396EmprCod ;
   private int[] P02CS2_A2308CliDesCod ;
   private String[] P02CS2_A2309CliDesNom ;
   private boolean[] P02CS2_n2309CliDesNom ;
   private int[] P02CS2_A252CliCod ;
}

final  class pdescli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CS2", "SELECT EmprCod, CliDesCod, CliDesNom, CliCod FROM TXPCLIDES WHERE EmprCod = ? and CliDesCod = ? ORDER BY EmprCod, CliDesCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
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

