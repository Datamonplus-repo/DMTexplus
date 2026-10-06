package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclimarcas extends GXProcedure
{
   public pclimarcas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclimarcas.class ), "" );
   }

   public pclimarcas( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pclimarcas.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pclimarcas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclimarcas.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclimarcas.this.A12907CliMarcaID = aP2[0];
      this.aP2 = aP2;
      pclimarcas.this.AV9Existe = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Existe = (byte)(0) ;
      /* Using cursor P05LT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12907CliMarcaID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV9Existe = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclimarcas.this.A396EmprCod;
      this.aP1[0] = pclimarcas.this.A252CliCod;
      this.aP2[0] = pclimarcas.this.A12907CliMarcaID;
      this.aP3[0] = pclimarcas.this.AV9Existe;
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
      P05LT2_A396EmprCod = new String[] {""} ;
      P05LT2_A252CliCod = new int[1] ;
      P05LT2_A12907CliMarcaID = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclimarcas__default(),
         new Object[] {
             new Object[] {
            P05LT2_A396EmprCod, P05LT2_A252CliCod, P05LT2_A12907CliMarcaID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Existe ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A12907CliMarcaID ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LT2_A396EmprCod ;
   private int[] P05LT2_A252CliCod ;
   private String[] P05LT2_A12907CliMarcaID ;
}

final  class pclimarcas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LT2", "SELECT EmprCod, CliCod, CliMarcaID FROM TXPCLIMAR WHERE EmprCod = ? and CliCod = ? and CliMarcaID = ? ORDER BY EmprCod, CliCod, CliMarcaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

