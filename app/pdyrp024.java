package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp024 extends GXProcedure
{
   public pdyrp024( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp024.class ), "" );
   }

   public pdyrp024( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pdyrp024.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pdyrp024.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp024.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdyrp024.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pdyrp024.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pdyrp024.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pdyrp024.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pdyrp024.this.AV26Forcodext = aP6[0];
      this.aP6 = aP6;
      pdyrp024.this.AV18Macprocod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Forcodext = "" ;
      /* Using cursor P099H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5742ForSerDsc = P099H2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P099H2_n5742ForSerDsc[0] ;
         A5337ForCodExt = P099H2_A5337ForCodExt[0] ;
         n5337ForCodExt = P099H2_n5337ForCodExt[0] ;
         A1514MacProCod = P099H2_A1514MacProCod[0] ;
         n1514MacProCod = P099H2_n1514MacProCod[0] ;
         AV26Forcodext = A5337ForCodExt ;
         AV18Macprocod = A1514MacProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp024.this.A396EmprCod;
      this.aP1[0] = pdyrp024.this.A252CliCod;
      this.aP2[0] = pdyrp024.this.A494ForSer;
      this.aP3[0] = pdyrp024.this.A482ForColNom;
      this.aP4[0] = pdyrp024.this.A483ForColNum;
      this.aP5[0] = pdyrp024.this.A831TipColCod;
      this.aP6[0] = pdyrp024.this.AV26Forcodext;
      this.aP7[0] = pdyrp024.this.AV18Macprocod;
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
      P099H2_A396EmprCod = new String[] {""} ;
      P099H2_A252CliCod = new int[1] ;
      P099H2_A494ForSer = new String[] {""} ;
      P099H2_A482ForColNom = new String[] {""} ;
      P099H2_A483ForColNum = new int[1] ;
      P099H2_A831TipColCod = new byte[1] ;
      P099H2_A5742ForSerDsc = new String[] {""} ;
      P099H2_n5742ForSerDsc = new boolean[] {false} ;
      P099H2_A5337ForCodExt = new String[] {""} ;
      P099H2_n5337ForCodExt = new boolean[] {false} ;
      P099H2_A1514MacProCod = new String[] {""} ;
      P099H2_n1514MacProCod = new boolean[] {false} ;
      A5742ForSerDsc = "" ;
      A5337ForCodExt = "" ;
      A1514MacProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp024__default(),
         new Object[] {
             new Object[] {
            P099H2_A396EmprCod, P099H2_A252CliCod, P099H2_A494ForSer, P099H2_A482ForColNom, P099H2_A483ForColNum, P099H2_A831TipColCod, P099H2_A5742ForSerDsc, P099H2_n5742ForSerDsc, P099H2_A5337ForCodExt, P099H2_n5337ForCodExt,
            P099H2_A1514MacProCod, P099H2_n1514MacProCod
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
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV26Forcodext ;
   private String AV18Macprocod ;
   private String scmdbuf ;
   private String A5742ForSerDsc ;
   private String A5337ForCodExt ;
   private String A1514MacProCod ;
   private boolean n5742ForSerDsc ;
   private boolean n5337ForCodExt ;
   private boolean n1514MacProCod ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P099H2_A396EmprCod ;
   private int[] P099H2_A252CliCod ;
   private String[] P099H2_A494ForSer ;
   private String[] P099H2_A482ForColNom ;
   private int[] P099H2_A483ForColNum ;
   private byte[] P099H2_A831TipColCod ;
   private String[] P099H2_A5742ForSerDsc ;
   private boolean[] P099H2_n5742ForSerDsc ;
   private String[] P099H2_A5337ForCodExt ;
   private boolean[] P099H2_n5337ForCodExt ;
   private String[] P099H2_A1514MacProCod ;
   private boolean[] P099H2_n1514MacProCod ;
}

final  class pdyrp024__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099H2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForSerDsc, ForCodExt, MacProCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
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

