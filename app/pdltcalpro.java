package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdltcalpro extends GXProcedure
{
   public pdltcalpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdltcalpro.class ), "" );
   }

   public pdltcalpro( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pdltcalpro.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pdltcalpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdltcalpro.this.AV15AlbComcod = aP1[0];
      this.aP1 = aP1;
      pdltcalpro.this.AV18Usurcod = aP2[0];
      this.aP2 = aP2;
      pdltcalpro.this.AV19Station = aP3[0];
      this.aP3 = aP3;
      pdltcalpro.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Proceso NO REALIZADO ¡¡¡", "") ;
      /* Using cursor P05Z12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbComcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13418AlbProID = P05Z12_A13418AlbProID[0] ;
         A13440AlbProAnul = P05Z12_A13440AlbProAnul[0] ;
         /* Optimized DELETE. */
         /* Using cursor P05Z13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
         /* End optimized DELETE. */
         AV17Texto_i = httpContext.getMessage( "TCALPRO-Documento Transporte Proveedor", "") + GXutil.newLine( ) ;
         AV17Texto_i += httpContext.getMessage( "ELIMINACION TOTAL.", "") + GXutil.str( AV15AlbComcod, 8, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TCALPRO", ""), AV18Usurcod, AV19Station, AV17Texto_i, 99999999, (byte)(0), " ") ;
         A13440AlbProAnul = "A" ;
         Gx_msg = httpContext.getMessage( "Proceso REALIZADO ¡¡¡", "") ;
         /* Using cursor P05Z14 */
         pr_default.execute(2, new Object[] {A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdltcalpro.this.A396EmprCod;
      this.aP1[0] = pdltcalpro.this.AV15AlbComcod;
      this.aP2[0] = pdltcalpro.this.AV18Usurcod;
      this.aP3[0] = pdltcalpro.this.AV19Station;
      this.aP4[0] = pdltcalpro.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdltcalpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P05Z12_A396EmprCod = new String[] {""} ;
      P05Z12_A13418AlbProID = new int[1] ;
      P05Z12_A13440AlbProAnul = new String[] {""} ;
      A13440AlbProAnul = "" ;
      AV17Texto_i = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdltcalpro__default(),
         new Object[] {
             new Object[] {
            P05Z12_A396EmprCod, P05Z12_A13418AlbProID, P05Z12_A13440AlbProAnul
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
   private int AV15AlbComcod ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV18Usurcod ;
   private String AV19Station ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A13440AlbProAnul ;
   private String AV17Texto_i ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Z12_A396EmprCod ;
   private int[] P05Z12_A13418AlbProID ;
   private String[] P05Z12_A13440AlbProAnul ;
}

final  class pdltcalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Z12", "SELECT EmprCod, AlbProID, AlbProAnul FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05Z13", "DELETE FROM TXPLALPRO  WHERE EmprCod = ? and AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRO")
         ,new UpdateCursor("P05Z14", "UPDATE TXPCALPRO SET AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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

