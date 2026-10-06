package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnummol extends GXProcedure
{
   public pnummol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnummol.class ), "" );
   }

   public pnummol( int remoteHandle ,
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
      pnummol.this.aP4 = new int[] {0};
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
      pnummol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnummol.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      pnummol.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pnummol.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pnummol.this.AV8Numero = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1024DibUltLin = P02XF2_A1024DibUltLin[0] ;
         n1024DibUltLin = P02XF2_n1024DibUltLin[0] ;
         A1024DibUltLin = (short)(A1024DibUltLin+1) ;
         n1024DibUltLin = false ;
         AV8Numero = A1024DibUltLin ;
         /* Using cursor P02XF3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1024DibUltLin), Short.valueOf(A1024DibUltLin), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnummol.this.A396EmprCod;
      this.aP1[0] = pnummol.this.A1013DibCli;
      this.aP2[0] = pnummol.this.A252CliCod;
      this.aP3[0] = pnummol.this.A1014DibInt;
      this.aP4[0] = pnummol.this.AV8Numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnummol");
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
      P02XF2_A396EmprCod = new String[] {""} ;
      P02XF2_A1013DibCli = new String[] {""} ;
      P02XF2_A252CliCod = new int[1] ;
      P02XF2_A1014DibInt = new int[1] ;
      P02XF2_A1024DibUltLin = new short[1] ;
      P02XF2_n1024DibUltLin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnummol__default(),
         new Object[] {
             new Object[] {
            P02XF2_A396EmprCod, P02XF2_A1013DibCli, P02XF2_A252CliCod, P02XF2_A1014DibInt, P02XF2_A1024DibUltLin, P02XF2_n1024DibUltLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1024DibUltLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV8Numero ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private boolean n1024DibUltLin ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XF2_A396EmprCod ;
   private String[] P02XF2_A1013DibCli ;
   private int[] P02XF2_A252CliCod ;
   private int[] P02XF2_A1014DibInt ;
   private short[] P02XF2_A1024DibUltLin ;
   private boolean[] P02XF2_n1024DibUltLin ;
}

final  class pnummol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XF2", "SELECT EmprCod, DibCli, CliCod, DibInt, DibUltLin FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XF3", "UPDATE TXPCDIBUJ SET DibUltLin=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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

