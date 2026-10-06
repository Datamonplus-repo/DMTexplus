package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppardsccopy1 extends GXProcedure
{
   public ppardsccopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppardsccopy1.class ), "" );
   }

   public ppardsccopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      ppardsccopy1.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      ppardsccopy1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppardsccopy1.this.A656ParCod = aP1[0];
      this.aP1 = aP1;
      ppardsccopy1.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ParCodNom = " " ;
      /* Using cursor P087D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A656ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A867ParCodNom = P087D2_A867ParCodNom[0] ;
         n867ParCodNom = P087D2_n867ParCodNom[0] ;
         AV9ParCodNom = A867ParCodNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppardsccopy1.this.A396EmprCod;
      this.aP1[0] = ppardsccopy1.this.A656ParCod;
      this.aP2[0] = ppardsccopy1.this.AV9ParCodNom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ParCodNom = "" ;
      scmdbuf = "" ;
      P087D2_A396EmprCod = new String[] {""} ;
      P087D2_A656ParCod = new short[1] ;
      P087D2_A867ParCodNom = new String[] {""} ;
      P087D2_n867ParCodNom = new boolean[] {false} ;
      A867ParCodNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppardsccopy1__default(),
         new Object[] {
             new Object[] {
            P087D2_A396EmprCod, P087D2_A656ParCod, P087D2_A867ParCodNom, P087D2_n867ParCodNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9ParCodNom ;
   private String scmdbuf ;
   private String A867ParCodNom ;
   private boolean n867ParCodNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P087D2_A396EmprCod ;
   private short[] P087D2_A656ParCod ;
   private String[] P087D2_A867ParCodNom ;
   private boolean[] P087D2_n867ParCodNom ;
}

final  class ppardsccopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087D2", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

