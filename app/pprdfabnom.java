package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdfabnom extends GXProcedure
{
   public pprdfabnom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdfabnom.class ), "" );
   }

   public pprdfabnom( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pprdfabnom.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pprdfabnom.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdfabnom.this.A12714PrdFabId = aP1[0];
      this.aP1 = aP1;
      pprdfabnom.this.AV8PrvNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P05GP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A12714PrdFabId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12715PrdFabNm = P05GP2_A12715PrdFabNm[0] ;
         n12715PrdFabNm = P05GP2_n12715PrdFabNm[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8PrvNom = A12715PrdFabNm ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8PrvNom = ((A12714PrdFabId==0) ? " " : httpContext.getMessage( "Error", "")) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdfabnom.this.A396EmprCod;
      this.aP1[0] = pprdfabnom.this.A12714PrdFabId;
      this.aP2[0] = pprdfabnom.this.AV8PrvNom;
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
      P05GP2_A396EmprCod = new String[] {""} ;
      P05GP2_A12714PrdFabId = new int[1] ;
      P05GP2_A12715PrdFabNm = new String[] {""} ;
      P05GP2_n12715PrdFabNm = new boolean[] {false} ;
      A12715PrdFabNm = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdfabnom__default(),
         new Object[] {
             new Object[] {
            P05GP2_A396EmprCod, P05GP2_A12714PrdFabId, P05GP2_A12715PrdFabNm, P05GP2_n12715PrdFabNm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private int A12714PrdFabId ;
   private String A396EmprCod ;
   private String AV8PrvNom ;
   private String scmdbuf ;
   private String A12715PrdFabNm ;
   private boolean n12715PrdFabNm ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05GP2_A396EmprCod ;
   private int[] P05GP2_A12714PrdFabId ;
   private String[] P05GP2_A12715PrdFabNm ;
   private boolean[] P05GP2_n12715PrdFabNm ;
}

final  class pprdfabnom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GP2", "SELECT EmprCod, PrdFabId, PrdFabNm FROM TXPPRDFAB WHERE EmprCod = ? and PrdFabId = ? ORDER BY EmprCod, PrdFabId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
      }
   }

}

