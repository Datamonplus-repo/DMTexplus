package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class panucalpro extends GXProcedure
{
   public panucalpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( panucalpro.class ), "" );
   }

   public panucalpro( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      panucalpro.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      panucalpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      panucalpro.this.A13418AlbProID = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      panucalpro.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV27Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      panucalpro.this.A396EmprCod = GXv_char2[0] ;
      panucalpro.this.AV26EmprNom = GXv_char3[0] ;
      panucalpro.this.AV27Usurcod = GXv_char4[0] ;
      AV15NumLin = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P05Z62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      cV15NumLin = P05Z62_AV15NumLin[0] ;
      pr_default.close(0);
      AV15NumLin = (short)(AV15NumLin+cV15NumLin*1) ;
      /* End optimized group. */
      if ( AV15NumLin == 0 )
      {
         /* Using cursor P05Z63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13440AlbProAnul = P05Z63_A13440AlbProAnul[0] ;
            A13440AlbProAnul = "A" ;
            AV33Texto_ii = httpContext.getMessage( "pAnuCALPRO-Documento COMO ANULADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Documento=", "") + GXutil.str( A13418AlbProID, 10, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV27Usurcod, AV25Station, AV33Texto_ii, A13418AlbProID, (byte)(0), "") ;
            /* Using cursor P05Z64 */
            pr_default.execute(2, new Object[] {A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = panucalpro.this.A396EmprCod;
      this.aP1[0] = panucalpro.this.A13418AlbProID;
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.panucalpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV26EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV27Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P05Z62_AV15NumLin = new short[1] ;
      P05Z63_A396EmprCod = new String[] {""} ;
      P05Z63_A13418AlbProID = new int[1] ;
      P05Z63_A13440AlbProAnul = new String[] {""} ;
      A13440AlbProAnul = "" ;
      AV33Texto_ii = "" ;
      AV38Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.panucalpro__default(),
         new Object[] {
             new Object[] {
            P05Z62_AV15NumLin
            }
            , new Object[] {
            P05Z63_A396EmprCod, P05Z63_A13418AlbProID, P05Z63_A13440AlbProAnul
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "StocksQuimicos.PAnuCALPRO" ;
      /* GeneXus formulas. */
      AV38Pgmname = "StocksQuimicos.PAnuCALPRO" ;
      Gx_err = (short)(0) ;
   }

   private short AV15NumLin ;
   private short cV15NumLin ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV25Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV26EmprNom ;
   private String GXv_char3[] ;
   private String AV27Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A13440AlbProAnul ;
   private String AV38Pgmname ;
   private String AV33Texto_ii ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P05Z62_AV15NumLin ;
   private String[] P05Z63_A396EmprCod ;
   private int[] P05Z63_A13418AlbProID ;
   private String[] P05Z63_A13440AlbProAnul ;
}

final  class panucalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Z62", "SELECT COUNT(*) FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z63", "SELECT EmprCod, AlbProID, AlbProAnul FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05Z64", "UPDATE TXPCALPRO SET AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

