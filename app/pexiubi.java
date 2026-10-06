package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexiubi extends GXProcedure
{
   public pexiubi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexiubi.class ), "" );
   }

   public pexiubi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pexiubi.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pexiubi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexiubi.this.A9743Emp_CUb = aP1[0];
      this.aP1 = aP1;
      pexiubi.this.AV8Emp_dUb = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Emp_dUb = httpContext.getMessage( "Error", "") ;
      /* Using cursor P03SQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A9743Emp_CUb});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9744Emp_DUb = P03SQ2_A9744Emp_DUb[0] ;
         n9744Emp_DUb = P03SQ2_n9744Emp_DUb[0] ;
         AV8Emp_dUb = A9744Emp_DUb ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexiubi.this.A396EmprCod;
      this.aP1[0] = pexiubi.this.A9743Emp_CUb;
      this.aP2[0] = pexiubi.this.AV8Emp_dUb;
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
      P03SQ2_A396EmprCod = new String[] {""} ;
      P03SQ2_A9743Emp_CUb = new String[] {""} ;
      P03SQ2_A9744Emp_DUb = new String[] {""} ;
      P03SQ2_n9744Emp_DUb = new boolean[] {false} ;
      A9744Emp_DUb = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexiubi__default(),
         new Object[] {
             new Object[] {
            P03SQ2_A396EmprCod, P03SQ2_A9743Emp_CUb, P03SQ2_A9744Emp_DUb, P03SQ2_n9744Emp_DUb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A9743Emp_CUb ;
   private String AV8Emp_dUb ;
   private String scmdbuf ;
   private String A9744Emp_DUb ;
   private boolean n9744Emp_DUb ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SQ2_A396EmprCod ;
   private String[] P03SQ2_A9743Emp_CUb ;
   private String[] P03SQ2_A9744Emp_DUb ;
   private boolean[] P03SQ2_n9744Emp_DUb ;
}

final  class pexiubi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SQ2", "SELECT EmprCod, Emp_CUb, Emp_DUb FROM TXPUBIALB WHERE EmprCod = ? and Emp_CUb = ? ORDER BY EmprCod, Emp_CUb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

