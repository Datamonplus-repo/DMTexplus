package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofasnot extends GXProcedure
{
   public pprofasnot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofasnot.class ), "" );
   }

   public pprofasnot( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pprofasnot.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pprofasnot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofasnot.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pprofasnot.this.A774ProNumLin = aP2[0];
      this.aP2 = aP2;
      pprofasnot.this.AV8ProFasNot = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01ZZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5735ProFasNot = P01ZZ2_A5735ProFasNot[0] ;
         n5735ProFasNot = P01ZZ2_n5735ProFasNot[0] ;
         AV8ProFasNot = A5735ProFasNot ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofasnot.this.A396EmprCod;
      this.aP1[0] = pprofasnot.this.A758ProCod;
      this.aP2[0] = pprofasnot.this.A774ProNumLin;
      this.aP3[0] = pprofasnot.this.AV8ProFasNot;
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
      P01ZZ2_A396EmprCod = new String[] {""} ;
      P01ZZ2_A758ProCod = new String[] {""} ;
      P01ZZ2_A774ProNumLin = new short[1] ;
      P01ZZ2_A5735ProFasNot = new String[] {""} ;
      P01ZZ2_n5735ProFasNot = new boolean[] {false} ;
      A5735ProFasNot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofasnot__default(),
         new Object[] {
             new Object[] {
            P01ZZ2_A396EmprCod, P01ZZ2_A758ProCod, P01ZZ2_A774ProNumLin, P01ZZ2_A5735ProFasNot, P01ZZ2_n5735ProFasNot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A774ProNumLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private boolean n5735ProFasNot ;
   private String AV8ProFasNot ;
   private String A5735ProFasNot ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01ZZ2_A396EmprCod ;
   private String[] P01ZZ2_A758ProCod ;
   private short[] P01ZZ2_A774ProNumLin ;
   private String[] P01ZZ2_A5735ProFasNot ;
   private boolean[] P01ZZ2_n5735ProFasNot ;
}

final  class pprofasnot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ZZ2", "SELECT EmprCod, ProCod, ProNumLin, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

