package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptjhln extends GXProcedure
{
   public ptjhln( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptjhln.class ), "" );
   }

   public ptjhln( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      ptjhln.this.aP2 = new String[] {""};
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
      ptjhln.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptjhln.this.A970ProceCod = aP1[0];
      this.aP1 = aP1;
      ptjhln.this.AV8Procenom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Procenom = httpContext.getMessage( "Error", "") ;
      /* Using cursor P03JJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A970ProceCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A971ProceNom = P03JJ2_A971ProceNom[0] ;
         n971ProceNom = P03JJ2_n971ProceNom[0] ;
         AV8Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptjhln.this.A396EmprCod;
      this.aP1[0] = ptjhln.this.A970ProceCod;
      this.aP2[0] = ptjhln.this.AV8Procenom;
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
      P03JJ2_A396EmprCod = new String[] {""} ;
      P03JJ2_A970ProceCod = new short[1] ;
      P03JJ2_A971ProceNom = new String[] {""} ;
      P03JJ2_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptjhln__default(),
         new Object[] {
             new Object[] {
            P03JJ2_A396EmprCod, P03JJ2_A970ProceCod, P03JJ2_A971ProceNom, P03JJ2_n971ProceNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A970ProceCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Procenom ;
   private String scmdbuf ;
   private String A971ProceNom ;
   private boolean n971ProceNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03JJ2_A396EmprCod ;
   private short[] P03JJ2_A970ProceCod ;
   private String[] P03JJ2_A971ProceNom ;
   private boolean[] P03JJ2_n971ProceNom ;
}

final  class ptjhln__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03JJ2", "SELECT EmprCod, ProceCod, ProceNom FROM TXPPROCED WHERE EmprCod = ? and ProceCod = ? ORDER BY EmprCod, ProceCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

