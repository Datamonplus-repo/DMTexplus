package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albproatcud extends GXProcedure
{
   public albproatcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albproatcud.class ), "" );
   }

   public albproatcud( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 )
   {
      albproatcud.this.A396EmprCod = aP0;
      albproatcud.this.A13418AlbProID = aP1;
      albproatcud.this.AV24AlbProIDAT = aP2;
      albproatcud.this.AV18AlbProStAT = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Inc_obs = "" ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albproatcud.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      albproatcud.this.A396EmprCod = GXv_char2[0] ;
      albproatcud.this.AV21EmprNom = GXv_char3[0] ;
      albproatcud.this.AV22UsurCod = GXv_char4[0] ;
      /* Using cursor P0A7M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13438AlbProStAT = P0A7M2_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P0A7M2_A13436AlbProIDAT[0] ;
         A13435AlbProEnvA = P0A7M2_A13435AlbProEnvA[0] ;
         A13440AlbProAnul = P0A7M2_A13440AlbProAnul[0] ;
         A13438AlbProStAT = AV18AlbProStAT ;
         A13436AlbProIDAT = AV24AlbProIDAT ;
         A13435AlbProEnvA = "M" ;
         A13440AlbProAnul = "F" ;
         AV20Inc_obs = httpContext.getMessage( "Act. Manual Cod. AT", "") + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Cod. AT = ", "") + GXutil.trim( AV24AlbProIDAT) + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "M", "") + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         /* Using cursor P0A7M3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A13438AlbProStAT), A13436AlbProIDAT, A13435AlbProEnvA, A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV20Inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV22UsurCod, AV23Station, AV20Inc_obs, A13418AlbProID, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.albproatcud");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Inc_obs = "" ;
      AV23Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV22UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P0A7M2_A396EmprCod = new String[] {""} ;
      P0A7M2_A13418AlbProID = new int[1] ;
      P0A7M2_A13438AlbProStAT = new byte[1] ;
      P0A7M2_A13436AlbProIDAT = new String[] {""} ;
      P0A7M2_A13435AlbProEnvA = new String[] {""} ;
      P0A7M2_A13440AlbProAnul = new String[] {""} ;
      A13436AlbProIDAT = "" ;
      A13435AlbProEnvA = "" ;
      A13440AlbProAnul = "" ;
      AV28Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.albproatcud__default(),
         new Object[] {
             new Object[] {
            P0A7M2_A396EmprCod, P0A7M2_A13418AlbProID, P0A7M2_A13438AlbProStAT, P0A7M2_A13436AlbProIDAT, P0A7M2_A13435AlbProEnvA, P0A7M2_A13440AlbProAnul
            }
            , new Object[] {
            }
         }
      );
      AV28Pgmname = "StocksQuimicos.AlbProATCUD" ;
      /* GeneXus formulas. */
      AV28Pgmname = "StocksQuimicos.AlbProATCUD" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18AlbProStAT ;
   private byte A13438AlbProStAT ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV24AlbProIDAT ;
   private String AV23Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char3[] ;
   private String AV22UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A13436AlbProIDAT ;
   private String A13435AlbProEnvA ;
   private String A13440AlbProAnul ;
   private String AV28Pgmname ;
   private String AV20Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7M2_A396EmprCod ;
   private int[] P0A7M2_A13418AlbProID ;
   private byte[] P0A7M2_A13438AlbProStAT ;
   private String[] P0A7M2_A13436AlbProIDAT ;
   private String[] P0A7M2_A13435AlbProEnvA ;
   private String[] P0A7M2_A13440AlbProAnul ;
}

final  class albproatcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7M2", "SELECT EmprCod, AlbProID, AlbProStAT, AlbProIDAT, AlbProEnvA, AlbProAnul FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A7M3", "UPDATE TXPCALPRO SET AlbProStAT=?, AlbProIDAT=?, AlbProEnvA=?, AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

