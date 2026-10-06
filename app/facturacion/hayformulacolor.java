package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hayformulacolor extends GXProcedure
{
   public hayformulacolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hayformulacolor.class ), "" );
   }

   public hayformulacolor( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 )
   {
      hayformulacolor.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             boolean[] aP2 )
   {
      hayformulacolor.this.A396EmprCod = aP0;
      hayformulacolor.this.A252CliCod = aP1;
      hayformulacolor.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HayFormula = false ;
      /* Using cursor P0A2H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A494ForSer = P0A2H2_A494ForSer[0] ;
         A482ForColNom = P0A2H2_A482ForColNom[0] ;
         A483ForColNum = P0A2H2_A483ForColNum[0] ;
         A831TipColCod = P0A2H2_A831TipColCod[0] ;
         AV8HayFormula = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = hayformulacolor.this.AV8HayFormula;
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
      P0A2H2_A396EmprCod = new String[] {""} ;
      P0A2H2_A252CliCod = new int[1] ;
      P0A2H2_A494ForSer = new String[] {""} ;
      P0A2H2_A482ForColNom = new String[] {""} ;
      P0A2H2_A483ForColNum = new int[1] ;
      P0A2H2_A831TipColCod = new byte[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.hayformulacolor__default(),
         new Object[] {
             new Object[] {
            P0A2H2_A396EmprCod, P0A2H2_A252CliCod, P0A2H2_A494ForSer, P0A2H2_A482ForColNom, P0A2H2_A483ForColNum, P0A2H2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private boolean AV8HayFormula ;
   private boolean[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A2H2_A396EmprCod ;
   private int[] P0A2H2_A252CliCod ;
   private String[] P0A2H2_A494ForSer ;
   private String[] P0A2H2_A482ForColNom ;
   private int[] P0A2H2_A483ForColNum ;
   private byte[] P0A2H2_A831TipColCod ;
}

final  class hayformulacolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2H2", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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

