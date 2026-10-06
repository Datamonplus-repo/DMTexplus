package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class openom_pr extends GXProcedure
{
   public openom_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( openom_pr.class ), "" );
   }

   public openom_pr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      openom_pr.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      openom_pr.this.A396EmprCod = aP0;
      openom_pr.this.A652OpeCod = aP1;
      openom_pr.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Openom = "" ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P0A6S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A653OpeNom = P0A6S2_A653OpeNom[0] ;
         n653OpeNom = P0A6S2_n653OpeNom[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8Openom = A653OpeNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8Openom = httpContext.getMessage( "Operario Inexistente", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = openom_pr.this.AV8Openom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Openom = "" ;
      scmdbuf = "" ;
      P0A6S2_A396EmprCod = new String[] {""} ;
      P0A6S2_A652OpeCod = new int[1] ;
      P0A6S2_A653OpeNom = new String[] {""} ;
      P0A6S2_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.openom_pr__default(),
         new Object[] {
             new Object[] {
            P0A6S2_A396EmprCod, P0A6S2_A652OpeCod, P0A6S2_A653OpeNom, P0A6S2_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private int A652OpeCod ;
   private String A396EmprCod ;
   private String AV8Openom ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private boolean n653OpeNom ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A6S2_A396EmprCod ;
   private int[] P0A6S2_A652OpeCod ;
   private String[] P0A6S2_A653OpeNom ;
   private boolean[] P0A6S2_n653OpeNom ;
}

final  class openom_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6S2", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

