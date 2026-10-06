package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_evaluariniciarpr extends GXProcedure
{
   public mrec_evaluariniciarpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_evaluariniciarpr.class ), "" );
   }

   public mrec_evaluariniciarpr( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      mrec_evaluariniciarpr.this.AV16EmprCod = aP0;
      mrec_evaluariniciarpr.this.AV9ContCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09SC2 */
      pr_default.execute(0, new Object[] {AV16EmprCod, AV9ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P09SC2_A313ContCod[0] ;
         A396EmprCod = P09SC2_A396EmprCod[0] ;
         A7208ContDsc2 = P09SC2_A7208ContDsc2[0] ;
         AV8Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(A7208ContDsc2,"\\|")) ;
         if ( AV8Col_ContDsc2.size() >= 1 )
         {
            AV11Data1 = (String)AV8Col_ContDsc2.elementAt(-1+1) ;
         }
         if ( AV8Col_ContDsc2.size() >= 2 )
         {
            AV12Data2 = (String)AV8Col_ContDsc2.elementAt(-1+2) ;
         }
         if ( AV8Col_ContDsc2.size() >= 3 )
         {
            AV13Data3 = (String)AV8Col_ContDsc2.elementAt(-1+3) ;
         }
         if ( AV8Col_ContDsc2.size() >= 4 )
         {
            AV14Data4 = (String)AV8Col_ContDsc2.elementAt(-1+4) ;
         }
         if ( AV8Col_ContDsc2.size() >= 5 )
         {
            AV15Data5 = (String)AV8Col_ContDsc2.elementAt(-1+5) ;
         }
         AV15Data5 = httpContext.getMessage( "Iniciado", "") ;
         AV10ContDsc2 = GXutil.trim( AV11Data1) + "|" + GXutil.trim( AV12Data2) + "|" + GXutil.trim( AV13Data3) + "|" + GXutil.trim( AV14Data4) + "|" + GXutil.trim( AV15Data5) ;
         A7208ContDsc2 = GXutil.substring( AV10ContDsc2, 1, 100) ;
         /* Using cursor P09SC3 */
         pr_default.execute(1, new Object[] {A7208ContDsc2, A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_evaluariniciarpr");
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
      P09SC2_A313ContCod = new String[] {""} ;
      P09SC2_A396EmprCod = new String[] {""} ;
      P09SC2_A7208ContDsc2 = new String[] {""} ;
      A313ContCod = "" ;
      A396EmprCod = "" ;
      A7208ContDsc2 = "" ;
      AV8Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "");
      AV11Data1 = "" ;
      AV12Data2 = "" ;
      AV13Data3 = "" ;
      AV14Data4 = "" ;
      AV15Data5 = "" ;
      AV10ContDsc2 = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluariniciarpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluariniciarpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluariniciarpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluariniciarpr__default(),
         new Object[] {
             new Object[] {
            P09SC2_A313ContCod, P09SC2_A396EmprCod, P09SC2_A7208ContDsc2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV16EmprCod ;
   private String AV9ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A396EmprCod ;
   private String A7208ContDsc2 ;
   private String AV10ContDsc2 ;
   private String AV11Data1 ;
   private String AV12Data2 ;
   private String AV13Data3 ;
   private String AV14Data4 ;
   private String AV15Data5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09SC2_A313ContCod ;
   private String[] P09SC2_A396EmprCod ;
   private String[] P09SC2_A7208ContDsc2 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXSimpleCollection<String> AV8Col_ContDsc2 ;
}

final  class mrec_evaluariniciarpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_evaluariniciarpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_evaluariniciarpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_evaluariniciarpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SC2", "SELECT ContCod, EmprCod, ContDsc2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09SC3", "UPDATE TXPEMPLIN SET ContDsc2=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

