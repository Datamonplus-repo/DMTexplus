package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psetalbenvmail extends GXProcedure
{
   public psetalbenvmail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psetalbenvmail.class ), "" );
   }

   public psetalbenvmail( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long aP0 )
   {
      psetalbenvmail.this.AV8AlbProCod = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17GXLvl1 = (byte)(0) ;
      /* Using cursor P0ALN2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Long.valueOf(AV8AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxtALN2 = (byte)(0) ;
         A30AlbProCod = P0ALN2_A30AlbProCod[0] ;
         A396EmprCod = P0ALN2_A396EmprCod[0] ;
         A14404AlbEnvMail = P0ALN2_A14404AlbEnvMail[0] ;
         AV17GXLvl1 = (byte)(1) ;
         A14404AlbEnvMail = GXutil.serverNow( context, remoteHandle, pr_default) ;
         gxtALN2 = (byte)(1) ;
         /* Using cursor P0ALN3 */
         pr_default.execute(1, new Object[] {A14404AlbEnvMail, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         if ( gxtALN2 == 1 )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.psetalbenvmail");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl1 == 0 )
      {
         System.out.println( GXutil.format( httpContext.getMessage( "Empresa: %1 - AlbProCod : %2", ""), AV11EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0), "", "", "", "", "", "", "") );
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
      AV11EmprCod = "" ;
      P0ALN2_A30AlbProCod = new long[1] ;
      P0ALN2_A396EmprCod = new String[] {""} ;
      P0ALN2_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albaranes.psetalbenvmail__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albaranes.psetalbenvmail__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albaranes.psetalbenvmail__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.psetalbenvmail__default(),
         new Object[] {
             new Object[] {
            P0ALN2_A30AlbProCod, P0ALN2_A396EmprCod, P0ALN2_A14404AlbEnvMail
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl1 ;
   private byte gxtALN2 ;
   private short Gx_err ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private String scmdbuf ;
   private String AV11EmprCod ;
   private String A396EmprCod ;
   private java.util.Date A14404AlbEnvMail ;
   private IDataStoreProvider pr_default ;
   private long[] P0ALN2_A30AlbProCod ;
   private String[] P0ALN2_A396EmprCod ;
   private java.util.Date[] P0ALN2_A14404AlbEnvMail ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class psetalbenvmail__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetalbenvmail__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetalbenvmail__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetalbenvmail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALN2", "SELECT AlbProCod, EmprCod, AlbEnvMail FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0ALN3", "UPDATE TXPCALPRD SET AlbEnvMail=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

