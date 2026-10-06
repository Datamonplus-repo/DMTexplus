package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumdoc extends GXProcedure
{
   public pnumdoc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumdoc.class ), "" );
   }

   public pnumdoc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          String aP1 )
   {
      pnumdoc.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int[] aP2 )
   {
      pnumdoc.this.A396EmprCod = aP0;
      pnumdoc.this.A313ContCod = aP1;
      pnumdoc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pnumdoc.this.GXt_int1 = GXv_int2[0] ;
      AV16NCLec = GXt_int1 ;
      GXt_int1 = AV17Nocommit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCOMM", ""), GXv_int2) ;
      pnumdoc.this.GXt_int1 = GXv_int2[0] ;
      AV17Nocommit = GXt_int1 ;
      /* Using cursor P000D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P000D2_A316ContVal[0] ;
         A316ContVal = (int)(A316ContVal+1) ;
         AV15ContVal = A316ContVal ;
         /* Using cursor P000D3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV16NCLec == 0 ) && ( AV17Nocommit == 0 ) )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pnumdoc");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pnumdoc.this.AV15ContVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P000D2_A396EmprCod = new String[] {""} ;
      P000D2_A313ContCod = new String[] {""} ;
      P000D2_A316ContVal = new int[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pnumdoc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pnumdoc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pnumdoc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumdoc__default(),
         new Object[] {
             new Object[] {
            P000D2_A396EmprCod, P000D2_A313ContCod, P000D2_A316ContVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16NCLec ;
   private byte AV17Nocommit ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV15ContVal ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000D2_A396EmprCod ;
   private String[] P000D2_A313ContCod ;
   private int[] P000D2_A316ContVal ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pnumdoc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pnumdoc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pnumdoc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pnumdoc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000D2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P000D3", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

