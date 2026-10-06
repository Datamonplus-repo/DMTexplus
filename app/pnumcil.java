package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumcil extends GXProcedure
{
   public pnumcil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumcil.class ), "" );
   }

   public pnumcil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          int[] aP3 )
   {
      pnumcil.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 )
   {
      pnumcil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumcil.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      pnumcil.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pnumcil.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pnumcil.this.AV8Numero = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1824DibUltCil = P02XE2_A1824DibUltCil[0] ;
         n1824DibUltCil = P02XE2_n1824DibUltCil[0] ;
         A1824DibUltCil = (short)(A1824DibUltCil+1) ;
         n1824DibUltCil = false ;
         AV8Numero = A1824DibUltCil ;
         /* Using cursor P02XE3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1824DibUltCil), Short.valueOf(A1824DibUltCil), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumcil.this.A396EmprCod;
      this.aP1[0] = pnumcil.this.A1013DibCli;
      this.aP2[0] = pnumcil.this.A252CliCod;
      this.aP3[0] = pnumcil.this.A1014DibInt;
      this.aP4[0] = pnumcil.this.AV8Numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumcil");
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
      P02XE2_A396EmprCod = new String[] {""} ;
      P02XE2_A1013DibCli = new String[] {""} ;
      P02XE2_A252CliCod = new int[1] ;
      P02XE2_A1014DibInt = new int[1] ;
      P02XE2_A1824DibUltCil = new short[1] ;
      P02XE2_n1824DibUltCil = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumcil__default(),
         new Object[] {
             new Object[] {
            P02XE2_A396EmprCod, P02XE2_A1013DibCli, P02XE2_A252CliCod, P02XE2_A1014DibInt, P02XE2_A1824DibUltCil, P02XE2_n1824DibUltCil
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1824DibUltCil ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV8Numero ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private boolean n1824DibUltCil ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XE2_A396EmprCod ;
   private String[] P02XE2_A1013DibCli ;
   private int[] P02XE2_A252CliCod ;
   private int[] P02XE2_A1014DibInt ;
   private short[] P02XE2_A1824DibUltCil ;
   private boolean[] P02XE2_n1824DibUltCil ;
}

final  class pnumcil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XE2", "SELECT EmprCod, DibCli, CliCod, DibInt, DibUltCil FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XE3", "UPDATE TXPCDIBUJ SET DibUltCil=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
      }
   }

}

