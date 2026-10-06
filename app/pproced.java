package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pproced extends GXProcedure
{
   public pproced( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pproced.class ), "" );
   }

   public pproced( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           short aP1 ,
                           String[] aP2 )
   {
      pproced.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pproced.this.A396EmprCod = aP0;
      pproced.this.A970ProceCod = aP1;
      pproced.this.aP2 = aP2;
      pproced.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P00ZY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A970ProceCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A971ProceNom = P00ZY2_A971ProceNom[0] ;
         n971ProceNom = P00ZY2_n971ProceNom[0] ;
         AV16ProceNom = A971ProceNom ;
         AV15Flag = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pproced.this.AV16ProceNom;
      this.aP3[0] = pproced.this.AV15Flag;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16ProceNom = "" ;
      scmdbuf = "" ;
      P00ZY2_A396EmprCod = new String[] {""} ;
      P00ZY2_A970ProceCod = new short[1] ;
      P00ZY2_A971ProceNom = new String[] {""} ;
      P00ZY2_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pproced__default(),
         new Object[] {
             new Object[] {
            P00ZY2_A396EmprCod, P00ZY2_A970ProceCod, P00ZY2_A971ProceNom, P00ZY2_n971ProceNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short A970ProceCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV16ProceNom ;
   private String scmdbuf ;
   private String A971ProceNom ;
   private boolean n971ProceNom ;
   private byte[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZY2_A396EmprCod ;
   private short[] P00ZY2_A970ProceCod ;
   private String[] P00ZY2_A971ProceNom ;
   private boolean[] P00ZY2_n971ProceNom ;
}

final  class pproced__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZY2", "SELECT * FROM (SELECT EmprCod, ProceCod, ProceNom FROM TXPPROCED WHERE EmprCod = ? and ProceCod = ? ORDER BY EmprCod, ProceCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

