package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpcesartloadredundancy extends GXProcedure
{
   public txpcesartloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpcesartloadredundancy.class ), "" );
   }

   public txpcesartloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPCESART ...", "") );
      /* Using cursor TXPCESARTL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = TXPCESARTL2_A829TipArtCod[0] ;
         A829TipArtCod = TXPCESARTL2_A829TipArtCod[0] ;
         A71ArtEstAny = TXPCESARTL2_A71ArtEstAny[0] ;
         A65ArtCod = TXPCESARTL2_A65ArtCod[0] ;
         A252CliCod = TXPCESARTL2_A252CliCod[0] ;
         A396EmprCod = TXPCESARTL2_A396EmprCod[0] ;
         A2756ArtEstSer = TXPCESARTL2_A2756ArtEstSer[0] ;
         O829TipArtCod = A829TipArtCod ;
         A829TipArtCod = TXPCESARTL2_A829TipArtCod[0] ;
         O829TipArtCod = A829TipArtCod ;
         A829TipArtCod = O829TipArtCod ;
         O829TipArtCod = A829TipArtCod ;
         /* Using cursor TXPCESARTL3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A829TipArtCod), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpcesartloadredundancy");
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
      TXPCESARTL2_A829TipArtCod = new short[1] ;
      TXPCESARTL2_A71ArtEstAny = new short[1] ;
      TXPCESARTL2_A65ArtCod = new String[] {""} ;
      TXPCESARTL2_A252CliCod = new int[1] ;
      TXPCESARTL2_A396EmprCod = new String[] {""} ;
      TXPCESARTL2_A2756ArtEstSer = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A2756ArtEstSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpcesartloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPCESARTL2_A829TipArtCod, TXPCESARTL2_A829TipArtCod, TXPCESARTL2_A71ArtEstAny, TXPCESARTL2_A65ArtCod, TXPCESARTL2_A252CliCod, TXPCESARTL2_A396EmprCod, TXPCESARTL2_A2756ArtEstSer
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short A71ArtEstAny ;
   private short O829TipArtCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A2756ArtEstSer ;
   private IDataStoreProvider pr_default ;
   private short[] TXPCESARTL2_A829TipArtCod ;
   private short[] TXPCESARTL2_A71ArtEstAny ;
   private String[] TXPCESARTL2_A65ArtCod ;
   private int[] TXPCESARTL2_A252CliCod ;
   private String[] TXPCESARTL2_A396EmprCod ;
   private String[] TXPCESARTL2_A2756ArtEstSer ;
}

final  class txpcesartloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPCESARTL2", "SELECT T1.TipArtCod, T2.TipArtCod, T1.ArtEstAny, T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtEstSer FROM (TXPCESART T1 INNER JOIN TXPARTICU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtEstAny, T1.ArtEstSer  FOR UPDATE OF T1.TipArtCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPCESARTL3", "UPDATE TXPCESART SET TipArtCod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtEstAny = ? AND ArtEstSer = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
      }
   }

}

