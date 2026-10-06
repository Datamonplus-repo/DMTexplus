package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class marcaclienteexisteproduccion extends GXProcedure
{
   public marcaclienteexisteproduccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( marcaclienteexisteproduccion.class ), "" );
   }

   public marcaclienteexisteproduccion( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 )
   {
      marcaclienteexisteproduccion.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      marcaclienteexisteproduccion.this.AV11Emprcod = aP0;
      marcaclienteexisteproduccion.this.AV9Clicod = aP1;
      marcaclienteexisteproduccion.this.AV8MarcaId = aP2;
      marcaclienteexisteproduccion.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ExisteMarca = (short)(0) ;
      /* Using cursor P0A9T2 */
      pr_default.execute(0, new Object[] {AV11Emprcod, Integer.valueOf(AV9Clicod), AV8MarcaId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A9T2_A396EmprCod[0] ;
         A252CliCod = P0A9T2_A252CliCod[0] ;
         n252CliCod = P0A9T2_n252CliCod[0] ;
         A181BarMaqPro = P0A9T2_A181BarMaqPro[0] ;
         A129BarCod = P0A9T2_A129BarCod[0] ;
         A132BarCodReo = P0A9T2_A132BarCodReo[0] ;
         A130BarCodPar = P0A9T2_A130BarCodPar[0] ;
         AV10ExisteMarca = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = marcaclienteexisteproduccion.this.AV10ExisteMarca;
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
      P0A9T2_A396EmprCod = new String[] {""} ;
      P0A9T2_A252CliCod = new int[1] ;
      P0A9T2_n252CliCod = new boolean[] {false} ;
      P0A9T2_A181BarMaqPro = new String[] {""} ;
      P0A9T2_A129BarCod = new int[1] ;
      P0A9T2_A132BarCodReo = new byte[1] ;
      P0A9T2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A181BarMaqPro = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.marcaclienteexisteproduccion__default(),
         new Object[] {
             new Object[] {
            P0A9T2_A396EmprCod, P0A9T2_A252CliCod, P0A9T2_n252CliCod, P0A9T2_A181BarMaqPro, P0A9T2_A129BarCod, P0A9T2_A132BarCodReo, P0A9T2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV10ExisteMarca ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private String AV11Emprcod ;
   private String AV8MarcaId ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A181BarMaqPro ;
   private String A130BarCodPar ;
   private boolean n252CliCod ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9T2_A396EmprCod ;
   private int[] P0A9T2_A252CliCod ;
   private boolean[] P0A9T2_n252CliCod ;
   private String[] P0A9T2_A181BarMaqPro ;
   private int[] P0A9T2_A129BarCod ;
   private byte[] P0A9T2_A132BarCodReo ;
   private String[] P0A9T2_A130BarCodPar ;
}

final  class marcaclienteexisteproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9T2", "SELECT * FROM (SELECT EmprCod, CliCod, BarMaqPro, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and CliCod = ? and BarMaqPro = ? ORDER BY EmprCod, CliCod, BarMaqPro) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
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

