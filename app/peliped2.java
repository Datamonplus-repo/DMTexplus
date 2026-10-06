package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliped2 extends GXProcedure
{
   public peliped2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliped2.class ), "" );
   }

   public peliped2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      peliped2.this.aP1 = new int[] {0};
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
      peliped2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliped2.this.AV23PedCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      peliped2.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      peliped2.this.A396EmprCod = GXv_char2[0] ;
      peliped2.this.AV20EmprNom = GXv_char3[0] ;
      peliped2.this.AV21UsurCod = GXv_char4[0] ;
      AV22Texto_i = "" ;
      /* Using cursor P02OF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV23PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P02OF2_A658PedCod[0] ;
         AV22Texto_i = httpContext.getMessage( "COMPRAS ELI-PEDIDO CABECERA: ", "") + GXutil.str( A658PedCod, 8, 0) ;
         /* Using cursor P02OF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV22Texto_i)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV21UsurCod, AV19Station, AV22Texto_i, AV23PedCod, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliped2.this.A396EmprCod;
      this.aP1[0] = peliped2.this.AV23PedCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliped2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV21UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV22Texto_i = "" ;
      scmdbuf = "" ;
      P02OF2_A396EmprCod = new String[] {""} ;
      P02OF2_A658PedCod = new int[1] ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliped2__default(),
         new Object[] {
             new Object[] {
            P02OF2_A396EmprCod, P02OF2_A658PedCod
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "PELIPED2" ;
      /* GeneXus formulas. */
      AV27Pgmname = "PELIPED2" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV23PedCod ;
   private int A658PedCod ;
   private String A396EmprCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20EmprNom ;
   private String GXv_char3[] ;
   private String AV21UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV27Pgmname ;
   private String AV22Texto_i ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02OF2_A396EmprCod ;
   private int[] P02OF2_A658PedCod ;
}

final  class peliped2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02OF2", "SELECT EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02OF3", "DELETE FROM TXPCPEDID  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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
      }
   }

}

