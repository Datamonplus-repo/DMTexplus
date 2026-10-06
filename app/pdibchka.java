package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibchka extends GXProcedure
{
   public pdibchka( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibchka.class ), "" );
   }

   public pdibchka( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           int aP2 )
   {
      pdibchka.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte[] aP3 )
   {
      pdibchka.this.A396EmprCod = aP0;
      pdibchka.this.A1013DibCli = aP1;
      pdibchka.this.A1014DibInt = aP2;
      pdibchka.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl1 = (byte)(0) ;
      /* Using cursor P03052 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P03052_A252CliCod[0] ;
         AV13GXLvl1 = (byte)(1) ;
         AV10ExisteDibujo = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl1 == 0 )
      {
         AV10ExisteDibujo = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pdibchka.this.AV10ExisteDibujo;
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
      P03052_A396EmprCod = new String[] {""} ;
      P03052_A1013DibCli = new String[] {""} ;
      P03052_A1014DibInt = new int[1] ;
      P03052_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibchka__default(),
         new Object[] {
             new Object[] {
            P03052_A396EmprCod, P03052_A1013DibCli, P03052_A1014DibInt, P03052_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10ExisteDibujo ;
   private byte AV13GXLvl1 ;
   private short Gx_err ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03052_A396EmprCod ;
   private String[] P03052_A1013DibCli ;
   private int[] P03052_A1014DibInt ;
   private int[] P03052_A252CliCod ;
}

final  class pdibchka__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03052", "SELECT * FROM (SELECT EmprCod, DibCli, DibInt, CliCod FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and DibInt = ? ORDER BY EmprCod, DibCli, DibInt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

