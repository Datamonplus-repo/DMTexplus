package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcligrc extends GXProcedure
{
   public pcligrc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcligrc.class ), "" );
   }

   public pcligrc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 )
   {
      pcligrc.this.AV17EmprCod = aP0;
      pcligrc.this.AV16Albprocod = aP1;
      pcligrc.this.AV18GuiRemCli = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (0==AV18GuiRemCli) )
      {
         /* Using cursor P02IF2 */
         pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV18GuiRemCli)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P02IF2_A252CliCod[0] ;
            A396EmprCod = P02IF2_A396EmprCod[0] ;
            A279CliNom = P02IF2_A279CliNom[0] ;
            AV12ExisCli = httpContext.getMessage( "S", "") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV12ExisCli, httpContext.getMessage( "S", "")) != 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Cliente", ""));
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV22GXLvl18 = (byte)(0) ;
         /* Optimized UPDATE. */
         /* Using cursor P02IF3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV18GuiRemCli), AV17EmprCod, Long.valueOf(AV16Albprocod)});
         if ( (pr_default.getStatus(1) != 101) )
         {
            AV22GXLvl18 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* End optimized UPDATE. */
         if ( AV22GXLvl18 == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No pudo ser ubicado el Código de Albarán: ", "")+GXutil.str( AV16Albprocod, 10, 0)+httpContext.getMessage( "para la Empresa: ", "")+AV17EmprCod);
         }
         Application.commitDataStores(context, remoteHandle, pr_default, "pcligrc");
      }
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
      P02IF2_A252CliCod = new int[1] ;
      P02IF2_A396EmprCod = new String[] {""} ;
      P02IF2_A279CliNom = new String[] {""} ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      AV12ExisCli = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcligrc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcligrc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcligrc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcligrc__default(),
         new Object[] {
             new Object[] {
            P02IF2_A252CliCod, P02IF2_A396EmprCod, P02IF2_A279CliNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl18 ;
   private short Gx_err ;
   private int AV18GuiRemCli ;
   private int A252CliCod ;
   private int A1243GuiRemCli ;
   private long AV16Albprocod ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String AV12ExisCli ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P02IF2_A252CliCod ;
   private String[] P02IF2_A396EmprCod ;
   private String[] P02IF2_A279CliNom ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcligrc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pcligrc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pcligrc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pcligrc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IF2", "SELECT CliCod, EmprCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02IF3", "UPDATE TXPCALPRD SET GuiRemCli=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

