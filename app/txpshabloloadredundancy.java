package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpshabloloadredundancy extends GXProcedure
{
   public txpshabloloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpshabloloadredundancy.class ), "" );
   }

   public txpshabloloadredundancy( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPShablo ...", "") );
      /* Using cursor TXPSHABLOL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7037ShaTipMaq = TXPSHABLOL2_A7037ShaTipMaq[0] ;
         n7037ShaTipMaq = TXPSHABLOL2_n7037ShaTipMaq[0] ;
         A7031ShaCod = TXPSHABLOL2_A7031ShaCod[0] ;
         A396EmprCod = TXPSHABLOL2_A396EmprCod[0] ;
         A7041ShaDibCli = TXPSHABLOL2_A7041ShaDibCli[0] ;
         A7042ShaDibInt = TXPSHABLOL2_A7042ShaDibInt[0] ;
         GXt_char1 = A7041ShaDibCli ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A7031ShaCod ;
         GXv_char4[0] = A7037ShaTipMaq ;
         GXv_char5[0] = GXt_char1 ;
         new app.pshadibcli(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         txpshabloloadredundancy.this.A396EmprCod = GXv_char2[0] ;
         txpshabloloadredundancy.this.A7031ShaCod = GXv_char3[0] ;
         txpshabloloadredundancy.this.A7037ShaTipMaq = GXv_char4[0] ;
         txpshabloloadredundancy.this.GXt_char1 = GXv_char5[0] ;
         A7041ShaDibCli = GXt_char1 ;
         GXt_int6 = A7042ShaDibInt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A7031ShaCod ;
         GXv_char3[0] = A7037ShaTipMaq ;
         GXv_int7[0] = GXt_int6 ;
         new app.pshadibint(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_int7) ;
         txpshabloloadredundancy.this.A396EmprCod = GXv_char5[0] ;
         txpshabloloadredundancy.this.A7031ShaCod = GXv_char4[0] ;
         txpshabloloadredundancy.this.A7037ShaTipMaq = GXv_char3[0] ;
         txpshabloloadredundancy.this.GXt_int6 = GXv_int7[0] ;
         A7042ShaDibInt = GXt_int6 ;
         /* Using cursor TXPSHABLOL3 */
         pr_default.execute(1, new Object[] {A7041ShaDibCli, Integer.valueOf(A7042ShaDibInt), A396EmprCod, A7031ShaCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShablo");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpshabloloadredundancy");
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
      TXPSHABLOL2_A7037ShaTipMaq = new String[] {""} ;
      TXPSHABLOL2_n7037ShaTipMaq = new boolean[] {false} ;
      TXPSHABLOL2_A7031ShaCod = new String[] {""} ;
      TXPSHABLOL2_A396EmprCod = new String[] {""} ;
      TXPSHABLOL2_A7041ShaDibCli = new String[] {""} ;
      TXPSHABLOL2_A7042ShaDibInt = new int[1] ;
      A7037ShaTipMaq = "" ;
      A7031ShaCod = "" ;
      A396EmprCod = "" ;
      A7041ShaDibCli = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpshabloloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPSHABLOL2_A7037ShaTipMaq, TXPSHABLOL2_n7037ShaTipMaq, TXPSHABLOL2_A7031ShaCod, TXPSHABLOL2_A396EmprCod, TXPSHABLOL2_A7041ShaDibCli, TXPSHABLOL2_A7042ShaDibInt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A7042ShaDibInt ;
   private int GXt_int6 ;
   private int GXv_int7[] ;
   private String scmdbuf ;
   private String A7037ShaTipMaq ;
   private String A7031ShaCod ;
   private String A396EmprCod ;
   private String A7041ShaDibCli ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean n7037ShaTipMaq ;
   private IDataStoreProvider pr_default ;
   private String[] TXPSHABLOL2_A7037ShaTipMaq ;
   private boolean[] TXPSHABLOL2_n7037ShaTipMaq ;
   private String[] TXPSHABLOL2_A7031ShaCod ;
   private String[] TXPSHABLOL2_A396EmprCod ;
   private String[] TXPSHABLOL2_A7041ShaDibCli ;
   private int[] TXPSHABLOL2_A7042ShaDibInt ;
}

final  class txpshabloloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPSHABLOL2", "SELECT ShaTipMaq, ShaCod, EmprCod, ShaDibCli, ShaDibInt FROM TXPShablo ORDER BY EmprCod, ShaCod  FOR UPDATE OF ShaDibCli, ShaDibInt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPSHABLOL3", "UPDATE TXPShablo SET ShaDibCli=?, ShaDibInt=?  WHERE EmprCod = ? AND ShaCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShablo")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 10);
               return;
      }
   }

}

