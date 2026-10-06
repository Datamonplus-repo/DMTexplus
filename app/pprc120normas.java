package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc120normas extends GXProcedure
{
   public pprc120normas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc120normas.class ), "" );
   }

   public pprc120normas( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      pprc120normas.this.A396EmprCod = aP0;
      pprc120normas.this.A719PrdNum = aP1;
      pprc120normas.this.A13217NormaID = aP2;
      pprc120normas.this.AV11UsurCod = aP3;
      pprc120normas.this.AV12Station = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P095Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A13217NormaID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13218NormaDsc = P095Y2_A13218NormaDsc[0] ;
         n13218NormaDsc = P095Y2_n13218NormaDsc[0] ;
         A718PrdNom = P095Y2_A718PrdNom[0] ;
         A718PrdNom = P095Y2_A718PrdNom[0] ;
         A13218NormaDsc = P095Y2_A13218NormaDsc[0] ;
         n13218NormaDsc = P095Y2_n13218NormaDsc[0] ;
         AV13inc_obs = httpContext.getMessage( "Eliminacion Caderno Norma ", "") + A13217NormaID + " " + GXutil.trim( A13218NormaDsc) ;
         AV13inc_obs += httpContext.getMessage( "Producto ", "") + A719PrdNum + " " + A718PrdNom ;
         /* Using cursor P095Y3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A13217NormaID});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPrdNor");
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV17Pgmname, 1, 10), AV11UsurCod, AV12Station, AV13inc_obs, 99999999, (byte)(0), " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
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
      P095Y2_A396EmprCod = new String[] {""} ;
      P095Y2_A719PrdNum = new String[] {""} ;
      P095Y2_A13217NormaID = new String[] {""} ;
      P095Y2_A13218NormaDsc = new String[] {""} ;
      P095Y2_n13218NormaDsc = new boolean[] {false} ;
      P095Y2_A718PrdNom = new String[] {""} ;
      A13218NormaDsc = "" ;
      A718PrdNom = "" ;
      AV13inc_obs = "" ;
      AV17Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc120normas__default(),
         new Object[] {
             new Object[] {
            P095Y2_A396EmprCod, P095Y2_A719PrdNum, P095Y2_A13217NormaID, P095Y2_A13218NormaDsc, P095Y2_n13218NormaDsc, P095Y2_A718PrdNom
            }
            , new Object[] {
            }
         }
      );
      AV17Pgmname = "PPrc120Normas" ;
      /* GeneXus formulas. */
      AV17Pgmname = "PPrc120Normas" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A13217NormaID ;
   private String AV11UsurCod ;
   private String AV12Station ;
   private String scmdbuf ;
   private String A13218NormaDsc ;
   private String A718PrdNom ;
   private String AV17Pgmname ;
   private boolean n13218NormaDsc ;
   private String AV13inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P095Y2_A396EmprCod ;
   private String[] P095Y2_A719PrdNum ;
   private String[] P095Y2_A13217NormaID ;
   private String[] P095Y2_A13218NormaDsc ;
   private boolean[] P095Y2_n13218NormaDsc ;
   private String[] P095Y2_A718PrdNom ;
}

final  class pprc120normas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095Y2", "SELECT T1.EmprCod, T1.PrdNum, T1.NormaID, T3.NormaDsc, T2.PrdNom FROM ((TXPPrdNor T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPNORMAS T3 ON T3.EmprCod = T1.EmprCod AND T3.NormaID = T1.NormaID) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.NormaID = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.NormaID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P095Y3", "DELETE FROM TXPPrdNor  WHERE EmprCod = ? AND PrdNum = ? AND NormaID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPrdNor")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
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
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
      }
   }

}

