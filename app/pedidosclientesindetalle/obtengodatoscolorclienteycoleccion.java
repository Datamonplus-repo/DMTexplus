package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengodatoscolorclienteycoleccion extends GXProcedure
{
   public obtengodatoscolorclienteycoleccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengodatoscolorclienteycoleccion.class ), "" );
   }

   public obtengodatoscolorclienteycoleccion( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      obtengodatoscolorclienteycoleccion.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 )
   {
      obtengodatoscolorclienteycoleccion.this.A396EmprCod = aP0;
      obtengodatoscolorclienteycoleccion.this.A252CliCod = aP1;
      obtengodatoscolorclienteycoleccion.this.A494ForSer = aP2;
      obtengodatoscolorclienteycoleccion.this.A482ForColNom = aP3;
      obtengodatoscolorclienteycoleccion.this.A483ForColNum = aP4;
      obtengodatoscolorclienteycoleccion.this.A831TipColCod = aP5;
      obtengodatoscolorclienteycoleccion.this.aP6 = aP6;
      obtengodatoscolorclienteycoleccion.this.aP7 = aP7;
      obtengodatoscolorclienteycoleccion.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForTonal = "" ;
      AV10Fornomcli = "" ;
      AV9Fornumcli = 0 ;
      /* Using cursor P0A212 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A995ForTonal = P0A212_A995ForTonal[0] ;
         n995ForTonal = P0A212_n995ForTonal[0] ;
         A1191ForNomCli = P0A212_A1191ForNomCli[0] ;
         n1191ForNomCli = P0A212_n1191ForNomCli[0] ;
         A1192ForNumCli = P0A212_A1192ForNumCli[0] ;
         n1192ForNumCli = P0A212_n1192ForNumCli[0] ;
         AV8ForTonal = A995ForTonal ;
         AV10Fornomcli = A1191ForNomCli ;
         AV9Fornumcli = A1192ForNumCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = obtengodatoscolorclienteycoleccion.this.AV10Fornomcli;
      this.aP7[0] = obtengodatoscolorclienteycoleccion.this.AV9Fornumcli;
      this.aP8[0] = obtengodatoscolorclienteycoleccion.this.AV8ForTonal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Fornomcli = "" ;
      AV8ForTonal = "" ;
      scmdbuf = "" ;
      P0A212_A396EmprCod = new String[] {""} ;
      P0A212_A252CliCod = new int[1] ;
      P0A212_A494ForSer = new String[] {""} ;
      P0A212_A482ForColNom = new String[] {""} ;
      P0A212_A483ForColNum = new int[1] ;
      P0A212_A831TipColCod = new byte[1] ;
      P0A212_A995ForTonal = new String[] {""} ;
      P0A212_n995ForTonal = new boolean[] {false} ;
      P0A212_A1191ForNomCli = new String[] {""} ;
      P0A212_n1191ForNomCli = new boolean[] {false} ;
      P0A212_A1192ForNumCli = new int[1] ;
      P0A212_n1192ForNumCli = new boolean[] {false} ;
      A995ForTonal = "" ;
      A1191ForNomCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.obtengodatoscolorclienteycoleccion__default(),
         new Object[] {
             new Object[] {
            P0A212_A396EmprCod, P0A212_A252CliCod, P0A212_A494ForSer, P0A212_A482ForColNom, P0A212_A483ForColNum, P0A212_A831TipColCod, P0A212_A995ForTonal, P0A212_n995ForTonal, P0A212_A1191ForNomCli, P0A212_n1191ForNomCli,
            P0A212_A1192ForNumCli, P0A212_n1192ForNumCli
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
   private int AV9Fornumcli ;
   private int A1192ForNumCli ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV10Fornomcli ;
   private String AV8ForTonal ;
   private String scmdbuf ;
   private String A995ForTonal ;
   private String A1191ForNomCli ;
   private boolean n995ForTonal ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private String[] aP8 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A212_A396EmprCod ;
   private int[] P0A212_A252CliCod ;
   private String[] P0A212_A494ForSer ;
   private String[] P0A212_A482ForColNom ;
   private int[] P0A212_A483ForColNum ;
   private byte[] P0A212_A831TipColCod ;
   private String[] P0A212_A995ForTonal ;
   private boolean[] P0A212_n995ForTonal ;
   private String[] P0A212_A1191ForNomCli ;
   private boolean[] P0A212_n1191ForNomCli ;
   private int[] P0A212_A1192ForNumCli ;
   private boolean[] P0A212_n1192ForNumCli ;
}

final  class obtengodatoscolorclienteycoleccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A212", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForTonal, ForNomCli, ForNumCli FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

