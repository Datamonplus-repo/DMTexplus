package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptest00 extends GXProcedure
{
   public ptest00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptest00.class ), "" );
   }

   public ptest00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ptest00.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ptest00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptest00.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ptest00.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      ptest00.this.AV8Usurcod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04F72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4353ArtUsrCod = P04F72_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = P04F72_n4353ArtUsrCod[0] ;
         A4354ArtFecMod = P04F72_A4354ArtFecMod[0] ;
         n4354ArtFecMod = P04F72_n4354ArtFecMod[0] ;
         A4353ArtUsrCod = AV8Usurcod ;
         n4353ArtUsrCod = false ;
         A4354ArtFecMod = GXutil.today( ) ;
         n4354ArtFecMod = false ;
         /* Using cursor P04F73 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptest00.this.A396EmprCod;
      this.aP1[0] = ptest00.this.A252CliCod;
      this.aP2[0] = ptest00.this.A65ArtCod;
      this.aP3[0] = ptest00.this.AV8Usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptest00");
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
      P04F72_A396EmprCod = new String[] {""} ;
      P04F72_A252CliCod = new int[1] ;
      P04F72_A65ArtCod = new String[] {""} ;
      P04F72_A4353ArtUsrCod = new String[] {""} ;
      P04F72_n4353ArtUsrCod = new boolean[] {false} ;
      P04F72_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P04F72_n4354ArtFecMod = new boolean[] {false} ;
      A4353ArtUsrCod = "" ;
      A4354ArtFecMod = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptest00__default(),
         new Object[] {
             new Object[] {
            P04F72_A396EmprCod, P04F72_A252CliCod, P04F72_A65ArtCod, P04F72_A4353ArtUsrCod, P04F72_n4353ArtUsrCod, P04F72_A4354ArtFecMod, P04F72_n4354ArtFecMod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8Usurcod ;
   private String scmdbuf ;
   private String A4353ArtUsrCod ;
   private java.util.Date A4354ArtFecMod ;
   private boolean n4353ArtUsrCod ;
   private boolean n4354ArtFecMod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04F72_A396EmprCod ;
   private int[] P04F72_A252CliCod ;
   private String[] P04F72_A65ArtCod ;
   private String[] P04F72_A4353ArtUsrCod ;
   private boolean[] P04F72_n4353ArtUsrCod ;
   private java.util.Date[] P04F72_A4354ArtFecMod ;
   private boolean[] P04F72_n4354ArtFecMod ;
}

final  class ptest00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04F72", "SELECT EmprCod, CliCod, ArtCod, ArtUsrCod, ArtFecMod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04F73", "UPDATE TXPARTICU SET ArtUsrCod=?, ArtFecMod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               return;
      }
   }

}

