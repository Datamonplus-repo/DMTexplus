package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmarcacliente extends GXProcedure
{
   public pmarcacliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmarcacliente.class ), "" );
   }

   public pmarcacliente( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pmarcacliente.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pmarcacliente.this.A396EmprCod = aP0;
      pmarcacliente.this.A11659MarcaId = aP1;
      pmarcacliente.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MarcaDsc = " " ;
      /* Using cursor P04Q22 */
      pr_default.execute(0, new Object[] {A396EmprCod, A11659MarcaId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11660MarcaDsc = P04Q22_A11660MarcaDsc[0] ;
         n11660MarcaDsc = P04Q22_n11660MarcaDsc[0] ;
         AV8MarcaDsc = A11660MarcaDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pmarcacliente.this.AV8MarcaDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8MarcaDsc = "" ;
      scmdbuf = "" ;
      P04Q22_A396EmprCod = new String[] {""} ;
      P04Q22_A11659MarcaId = new String[] {""} ;
      P04Q22_A11660MarcaDsc = new String[] {""} ;
      P04Q22_n11660MarcaDsc = new boolean[] {false} ;
      A11660MarcaDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmarcacliente__default(),
         new Object[] {
             new Object[] {
            P04Q22_A396EmprCod, P04Q22_A11659MarcaId, P04Q22_A11660MarcaDsc, P04Q22_n11660MarcaDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A11659MarcaId ;
   private String AV8MarcaDsc ;
   private String scmdbuf ;
   private String A11660MarcaDsc ;
   private boolean n11660MarcaDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04Q22_A396EmprCod ;
   private String[] P04Q22_A11659MarcaId ;
   private String[] P04Q22_A11660MarcaDsc ;
   private boolean[] P04Q22_n11660MarcaDsc ;
}

final  class pmarcacliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04Q22", "SELECT EmprCod, MarcaId, MarcaDsc FROM TXPMARCAS WHERE EmprCod = ? and MarcaId = ? ORDER BY EmprCod, MarcaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

