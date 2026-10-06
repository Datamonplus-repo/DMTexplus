package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cliente_tabla_barcad extends GXProcedure
{
   public cliente_tabla_barcad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cliente_tabla_barcad.class ), "" );
   }

   public cliente_tabla_barcad( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 )
   {
      cliente_tabla_barcad.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      cliente_tabla_barcad.this.A396EmprCod = aP0;
      cliente_tabla_barcad.this.A129BarCod = aP1;
      cliente_tabla_barcad.this.A132BarCodReo = aP2;
      cliente_tabla_barcad.this.A130BarCodPar = aP3;
      cliente_tabla_barcad.this.aP4 = aP4;
      cliente_tabla_barcad.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P08ZX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P08ZX2_A252CliCod[0] ;
         n252CliCod = P08ZX2_n252CliCod[0] ;
         A279CliNom = P08ZX2_A279CliNom[0] ;
         A279CliNom = P08ZX2_A279CliNom[0] ;
         AV8Clicod = A252CliCod ;
         AV9CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = cliente_tabla_barcad.this.AV8Clicod;
      this.aP5[0] = cliente_tabla_barcad.this.AV9CliNom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CliNom = "" ;
      scmdbuf = "" ;
      P08ZX2_A396EmprCod = new String[] {""} ;
      P08ZX2_A129BarCod = new int[1] ;
      P08ZX2_A132BarCodReo = new byte[1] ;
      P08ZX2_A130BarCodPar = new String[] {""} ;
      P08ZX2_A252CliCod = new int[1] ;
      P08ZX2_n252CliCod = new boolean[] {false} ;
      P08ZX2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cliente_tabla_barcad__default(),
         new Object[] {
             new Object[] {
            P08ZX2_A396EmprCod, P08ZX2_A129BarCod, P08ZX2_A132BarCodReo, P08ZX2_A130BarCodPar, P08ZX2_A252CliCod, P08ZX2_n252CliCod, P08ZX2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Clicod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9CliNom ;
   private String scmdbuf ;
   private String A279CliNom ;
   private boolean n252CliCod ;
   private String[] aP5 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08ZX2_A396EmprCod ;
   private int[] P08ZX2_A129BarCod ;
   private byte[] P08ZX2_A132BarCodReo ;
   private String[] P08ZX2_A130BarCodPar ;
   private int[] P08ZX2_A252CliCod ;
   private boolean[] P08ZX2_n252CliCod ;
   private String[] P08ZX2_A279CliNom ;
}

final  class cliente_tabla_barcad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZX2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T2.CliNom FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

