package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_lineas_forcolnom extends GXProcedure
{
   public tpromd_lineas_forcolnom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_forcolnom.class ), "" );
   }

   public tpromd_lineas_forcolnom( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      tpromd_lineas_forcolnom.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      tpromd_lineas_forcolnom.this.A396EmprCod = aP0;
      tpromd_lineas_forcolnom.this.A252CliCod = aP1;
      tpromd_lineas_forcolnom.this.A483ForColNum = aP2[0];
      this.aP2 = aP2;
      tpromd_lineas_forcolnom.this.aP3 = aP3;
      tpromd_lineas_forcolnom.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Forcolnom = "N/E Cor" ;
      AV9ForBlo = "N" ;
      /* Using cursor P0AN12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A483ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7781ForBlo = P0AN12_A7781ForBlo[0] ;
         n7781ForBlo = P0AN12_n7781ForBlo[0] ;
         A482ForColNom = P0AN12_A482ForColNom[0] ;
         A494ForSer = P0AN12_A494ForSer[0] ;
         A831TipColCod = P0AN12_A831TipColCod[0] ;
         AV9ForBlo = A7781ForBlo ;
         AV8Forcolnom = A482ForColNom ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tpromd_lineas_forcolnom.this.A483ForColNum;
      this.aP3[0] = tpromd_lineas_forcolnom.this.AV8Forcolnom;
      this.aP4[0] = tpromd_lineas_forcolnom.this.AV9ForBlo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Forcolnom = "" ;
      AV9ForBlo = "" ;
      scmdbuf = "" ;
      P0AN12_A396EmprCod = new String[] {""} ;
      P0AN12_A252CliCod = new int[1] ;
      P0AN12_A483ForColNum = new int[1] ;
      P0AN12_A7781ForBlo = new String[] {""} ;
      P0AN12_n7781ForBlo = new boolean[] {false} ;
      P0AN12_A482ForColNom = new String[] {""} ;
      P0AN12_A494ForSer = new String[] {""} ;
      P0AN12_A831TipColCod = new byte[1] ;
      A7781ForBlo = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_forcolnom__default(),
         new Object[] {
             new Object[] {
            P0AN12_A396EmprCod, P0AN12_A252CliCod, P0AN12_A483ForColNum, P0AN12_A7781ForBlo, P0AN12_n7781ForBlo, P0AN12_A482ForColNom, P0AN12_A494ForSer, P0AN12_A831TipColCod
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
   private String AV8Forcolnom ;
   private String AV9ForBlo ;
   private String scmdbuf ;
   private String A7781ForBlo ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n7781ForBlo ;
   private String[] aP4 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AN12_A396EmprCod ;
   private int[] P0AN12_A252CliCod ;
   private int[] P0AN12_A483ForColNum ;
   private String[] P0AN12_A7781ForBlo ;
   private boolean[] P0AN12_n7781ForBlo ;
   private String[] P0AN12_A482ForColNom ;
   private String[] P0AN12_A494ForSer ;
   private byte[] P0AN12_A831TipColCod ;
}

final  class tpromd_lineas_forcolnom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AN12", "SELECT * FROM (SELECT EmprCod, CliCod, ForColNum, ForBlo, ForColNom, ForSer, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForColNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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

