package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccser1_del extends GXProcedure
{
   public controlcalidad_ccser1_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccser1_del.class ), "" );
   }

   public controlcalidad_ccser1_del( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        int aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int aP6 )
   {
      controlcalidad_ccser1_del.this.A396EmprCod = aP0;
      controlcalidad_ccser1_del.this.A252CliCod = aP1;
      controlcalidad_ccser1_del.this.A279CliNom = aP2;
      controlcalidad_ccser1_del.this.A65ArtCod = aP3;
      controlcalidad_ccser1_del.this.A4058CCFColNom = aP4;
      controlcalidad_ccser1_del.this.A4059CCFColNum = aP5;
      controlcalidad_ccser1_del.this.A4031CCTCod = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AOM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), A279CliNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Optimized DELETE. */
         /* Using cursor P0AOM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
         /* End optimized DELETE. */
         /* Using cursor P0AOM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccser1_del");
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
      P0AOM2_A396EmprCod = new String[] {""} ;
      P0AOM2_A252CliCod = new int[1] ;
      P0AOM2_A65ArtCod = new String[] {""} ;
      P0AOM2_A4058CCFColNom = new String[] {""} ;
      P0AOM2_A4059CCFColNum = new int[1] ;
      P0AOM2_A4031CCTCod = new int[1] ;
      P0AOM2_A279CliNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccser1_del__default(),
         new Object[] {
             new Object[] {
            P0AOM2_A396EmprCod, P0AOM2_A252CliCod, P0AOM2_A65ArtCod, P0AOM2_A4058CCFColNom, P0AOM2_A4059CCFColNum, P0AOM2_A4031CCTCod, P0AOM2_A279CliNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOM2_A396EmprCod ;
   private int[] P0AOM2_A252CliCod ;
   private String[] P0AOM2_A65ArtCod ;
   private String[] P0AOM2_A4058CCFColNom ;
   private int[] P0AOM2_A4059CCFColNum ;
   private int[] P0AOM2_A4031CCTCod ;
   private String[] P0AOM2_A279CliNom ;
}

final  class controlcalidad_ccser1_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOM2", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T2.CliNom FROM (TXPCCSer1 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ?) AND (T2.CliNom = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AOM3", "DELETE FROM TXPCCSta  WHERE (EmprCod = ? and CliCod = ?) AND (ArtCod = ?) AND (CCFColNom = ?) AND (CCFColNum = ?) AND (CCTCod = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSta")
         ,new UpdateCursor("P0AOM4", "DELETE FROM TXPCCSer1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 30);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

