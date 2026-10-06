package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existeopeariooperar extends GXProcedure
{
   public existeopeariooperar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existeopeariooperar.class ), "" );
   }

   public existeopeariooperar( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      existeopeariooperar.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      existeopeariooperar.this.A396EmprCod = aP0;
      existeopeariooperar.this.A652OpeCod = aP1;
      existeopeariooperar.this.aP2 = aP2;
      existeopeariooperar.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      AV11OpeNom = " " ;
      /* Using cursor P087Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A653OpeNom = P087Q2_A653OpeNom[0] ;
         n653OpeNom = P087Q2_n653OpeNom[0] ;
         AV8Ok = httpContext.getMessage( "S", "") ;
         AV11OpeNom = A653OpeNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = existeopeariooperar.this.AV11OpeNom;
      this.aP3[0] = existeopeariooperar.this.AV8Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11OpeNom = "" ;
      AV8Ok = "" ;
      scmdbuf = "" ;
      P087Q2_A396EmprCod = new String[] {""} ;
      P087Q2_A652OpeCod = new int[1] ;
      P087Q2_A653OpeNom = new String[] {""} ;
      P087Q2_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existeopeariooperar__default(),
         new Object[] {
             new Object[] {
            P087Q2_A396EmprCod, P087Q2_A652OpeCod, P087Q2_A653OpeNom, P087Q2_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A652OpeCod ;
   private String A396EmprCod ;
   private String AV11OpeNom ;
   private String AV8Ok ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private boolean n653OpeNom ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P087Q2_A396EmprCod ;
   private int[] P087Q2_A652OpeCod ;
   private String[] P087Q2_A653OpeNom ;
   private boolean[] P087Q2_n653OpeNom ;
}

final  class existeopeariooperar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087Q2", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

