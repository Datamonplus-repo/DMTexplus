package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclimodd extends GXProcedure
{
   public pclimodd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclimodd.class ), "" );
   }

   public pclimodd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pclimodd.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pclimodd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclimodd.this.AV15Discod = aP1[0];
      this.aP1 = aP1;
      pclimodd.this.AV8CliCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02GG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02GG2_A252CliCod[0] ;
         A279CliNom = P02GG2_A279CliNom[0] ;
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
      /* Using cursor P02GG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15Discod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A361DisCod = P02GG3_A361DisCod[0] ;
         A44AlbRecCod = P02GG3_A44AlbRecCod[0] ;
         AV16AlbReccod = A44AlbRecCod ;
         /* Execute user subroutine: 'ALBREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized UPDATE. */
      /* Using cursor P02GG4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV8CliCod), A396EmprCod, Integer.valueOf(AV15Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02GG5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV8CliCod), A396EmprCod, Integer.valueOf(AV16AlbReccod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclimodd.this.A396EmprCod;
      this.aP1[0] = pclimodd.this.AV15Discod;
      this.aP2[0] = pclimodd.this.AV8CliCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclimodd");
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
      P02GG2_A396EmprCod = new String[] {""} ;
      P02GG2_A252CliCod = new int[1] ;
      P02GG2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV12ExisCli = "" ;
      P02GG3_A396EmprCod = new String[] {""} ;
      P02GG3_A361DisCod = new int[1] ;
      P02GG3_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclimodd__default(),
         new Object[] {
             new Object[] {
            P02GG2_A396EmprCod, P02GG2_A252CliCod, P02GG2_A279CliNom
            }
            , new Object[] {
            P02GG3_A396EmprCod, P02GG3_A361DisCod, P02GG3_A44AlbRecCod
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
   private int AV15Discod ;
   private int AV8CliCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV16AlbReccod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String AV12ExisCli ;
   private boolean returnInSub ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02GG2_A396EmprCod ;
   private int[] P02GG2_A252CliCod ;
   private String[] P02GG2_A279CliNom ;
   private String[] P02GG3_A396EmprCod ;
   private int[] P02GG3_A361DisCod ;
   private int[] P02GG3_A44AlbRecCod ;
}

final  class pclimodd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02GG2", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02GG3", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02GG4", "UPDATE TXPDISPOS SET CliCod=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P02GG5", "UPDATE TXPALBREC SET CliCod=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

