package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprogn1 extends GXProcedure
{
   public pprogn1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprogn1.class ), "" );
   }

   public pprogn1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pprogn1.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pprogn1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprogn1.this.A764ProForCod = aP1[0];
      this.aP1 = aP1;
      pprogn1.this.A8877Prg_Cod = aP2[0];
      this.aP2 = aP2;
      pprogn1.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Error", "") ;
      /* Using cursor P03IY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod, Integer.valueOf(A8877Prg_Cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         Gx_msg = httpContext.getMessage( "Ok", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprogn1.this.A396EmprCod;
      this.aP1[0] = pprogn1.this.A764ProForCod;
      this.aP2[0] = pprogn1.this.A8877Prg_Cod;
      this.aP3[0] = pprogn1.this.Gx_msg;
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
      P03IY2_A396EmprCod = new String[] {""} ;
      P03IY2_A764ProForCod = new String[] {""} ;
      P03IY2_A8877Prg_Cod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprogn1__default(),
         new Object[] {
             new Object[] {
            P03IY2_A396EmprCod, P03IY2_A764ProForCod, P03IY2_A8877Prg_Cod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A8877Prg_Cod ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03IY2_A396EmprCod ;
   private String[] P03IY2_A764ProForCod ;
   private int[] P03IY2_A8877Prg_Cod ;
}

final  class pprogn1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03IY2", "SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? and ProForCod = ? and Prg_Cod = ? ORDER BY EmprCod, ProForCod, Prg_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

