package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pemprnom extends GXProcedure
{
   public pemprnom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pemprnom.class ), "" );
   }

   public pemprnom( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pemprnom.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pemprnom.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pemprnom.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P020Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P020Z2_A407EmprNom[0] ;
         n407EmprNom = P020Z2_n407EmprNom[0] ;
         AV8EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pemprnom.this.A396EmprCod;
      this.aP1[0] = pemprnom.this.AV8EmprNom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8EmprNom = "" ;
      scmdbuf = "" ;
      P020Z2_A396EmprCod = new String[] {""} ;
      P020Z2_A407EmprNom = new String[] {""} ;
      P020Z2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pemprnom__default(),
         new Object[] {
             new Object[] {
            P020Z2_A396EmprCod, P020Z2_A407EmprNom, P020Z2_n407EmprNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8EmprNom ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private boolean n407EmprNom ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P020Z2_A396EmprCod ;
   private String[] P020Z2_A407EmprNom ;
   private boolean[] P020Z2_n407EmprNom ;
}

final  class pemprnom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020Z2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
      }
   }

}

