package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenciondelcolor extends GXProcedure
{
   public obtenciondelcolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenciondelcolor.class ), "" );
   }

   public obtenciondelcolor( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 )
   {
      obtenciondelcolor.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String[] aP3 )
   {
      obtenciondelcolor.this.AV8emprcod = aP0;
      obtenciondelcolor.this.AV9clicod = aP1;
      obtenciondelcolor.this.AV10PMDConCod = aP2;
      obtenciondelcolor.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Forcolnom = "N/E Cor" ;
      /* Using cursor P0A8E2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9clicod), Integer.valueOf(AV10PMDConCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A8E2_A396EmprCod[0] ;
         A252CliCod = P0A8E2_A252CliCod[0] ;
         A483ForColNum = P0A8E2_A483ForColNum[0] ;
         A482ForColNom = P0A8E2_A482ForColNom[0] ;
         A494ForSer = P0A8E2_A494ForSer[0] ;
         A831TipColCod = P0A8E2_A831TipColCod[0] ;
         AV11Forcolnom = A482ForColNom ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtenciondelcolor.this.AV11Forcolnom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Forcolnom = "" ;
      scmdbuf = "" ;
      P0A8E2_A396EmprCod = new String[] {""} ;
      P0A8E2_A252CliCod = new int[1] ;
      P0A8E2_A483ForColNum = new int[1] ;
      P0A8E2_A482ForColNom = new String[] {""} ;
      P0A8E2_A494ForSer = new String[] {""} ;
      P0A8E2_A831TipColCod = new byte[1] ;
      A396EmprCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.obtenciondelcolor__default(),
         new Object[] {
             new Object[] {
            P0A8E2_A396EmprCod, P0A8E2_A252CliCod, P0A8E2_A483ForColNum, P0A8E2_A482ForColNom, P0A8E2_A494ForSer, P0A8E2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV9clicod ;
   private int AV10PMDConCod ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String AV8emprcod ;
   private String AV11Forcolnom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A8E2_A396EmprCod ;
   private int[] P0A8E2_A252CliCod ;
   private int[] P0A8E2_A483ForColNum ;
   private String[] P0A8E2_A482ForColNom ;
   private String[] P0A8E2_A494ForSer ;
   private byte[] P0A8E2_A831TipColCod ;
}

final  class obtenciondelcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8E2", "SELECT * FROM (SELECT EmprCod, CliCod, ForColNum, ForColNom, ForSer, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForColNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

