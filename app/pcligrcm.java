package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcligrcm extends GXProcedure
{
   public pcligrcm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcligrcm.class ), "" );
   }

   public pcligrcm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 ,
                          int[] aP3 )
   {
      pcligrcm.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 )
   {
      pcligrcm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcligrcm.this.AV19Usurcod = aP1[0];
      this.aP1 = aP1;
      pcligrcm.this.AV20Station = aP2[0];
      this.aP2 = aP2;
      pcligrcm.this.AV16AlbComCod = aP3[0];
      this.aP3 = aP3;
      pcligrcm.this.AV8CliCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02LX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02LX2_A252CliCod[0] ;
         A279CliNom = P02LX2_A279CliNom[0] ;
         AV12ExisCli = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV12ExisCli, httpContext.getMessage( "S", "")) != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe cliente", ""));
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02LX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbComCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14AlbComCod = P02LX3_A14AlbComCod[0] ;
         A252CliCod = P02LX3_A252CliCod[0] ;
         AV18OldClicod = A252CliCod ;
         A252CliCod = AV8CliCod ;
         /* Using cursor P02LX4 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV17Texto_i = httpContext.getMessage( "Cambio Cliente Guia Comercial ", "") + GXutil.str( AV16AlbComCod, 8, 0) + httpContext.getMessage( " OldCliente", "") + GXutil.str( AV18OldClicod, 6, 0) + httpContext.getMessage( " NewCliente=", "") + GXutil.str( AV8CliCod, 6, 0) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV19Usurcod, AV20Station, AV17Texto_i, AV16AlbComCod, (byte)(0), "@") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcligrcm.this.A396EmprCod;
      this.aP1[0] = pcligrcm.this.AV19Usurcod;
      this.aP2[0] = pcligrcm.this.AV20Station;
      this.aP3[0] = pcligrcm.this.AV16AlbComCod;
      this.aP4[0] = pcligrcm.this.AV8CliCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcligrcm");
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
      P02LX2_A396EmprCod = new String[] {""} ;
      P02LX2_A252CliCod = new int[1] ;
      P02LX2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV12ExisCli = "" ;
      P02LX3_A396EmprCod = new String[] {""} ;
      P02LX3_A14AlbComCod = new int[1] ;
      P02LX3_A252CliCod = new int[1] ;
      AV17Texto_i = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcligrcm__default(),
         new Object[] {
             new Object[] {
            P02LX2_A396EmprCod, P02LX2_A252CliCod, P02LX2_A279CliNom
            }
            , new Object[] {
            P02LX3_A396EmprCod, P02LX3_A14AlbComCod, P02LX3_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "PCLIGRCm" ;
      /* GeneXus formulas. */
      AV25Pgmname = "PCLIGRCm" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16AlbComCod ;
   private int AV8CliCod ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private int AV18OldClicod ;
   private String A396EmprCod ;
   private String AV19Usurcod ;
   private String AV20Station ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String AV12ExisCli ;
   private String AV25Pgmname ;
   private boolean returnInSub ;
   private String AV17Texto_i ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LX2_A396EmprCod ;
   private int[] P02LX2_A252CliCod ;
   private String[] P02LX2_A279CliNom ;
   private String[] P02LX3_A396EmprCod ;
   private int[] P02LX3_A14AlbComCod ;
   private int[] P02LX3_A252CliCod ;
}

final  class pcligrcm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LX2", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LX3", "SELECT EmprCod, AlbComCod, CliCod FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LX4", "UPDATE TXPCALCOM SET CliCod=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

