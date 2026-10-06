package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmasinfe extends GXProcedure
{
   public pmasinfe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmasinfe.class ), "" );
   }

   public pmasinfe( int remoteHandle ,
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
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pmasinfe.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pmasinfe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmasinfe.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmasinfe.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pmasinfe.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pmasinfe.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pmasinfe.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pmasinfe.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pmasinfe.this.A2098MolCod = aP7[0];
      this.aP7 = aP7;
      pmasinfe.this.AV10Molcol = aP8[0];
      this.aP8 = aP8;
      pmasinfe.this.AV9Dg_desc = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03EY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8052Dg_codigo = P03EY2_A8052Dg_codigo[0] ;
         n8052Dg_codigo = P03EY2_n8052Dg_codigo[0] ;
         A8053Dg_Desc = P03EY2_A8053Dg_Desc[0] ;
         n8053Dg_Desc = P03EY2_n8053Dg_Desc[0] ;
         A4420MolCol = P03EY2_A4420MolCol[0] ;
         n4420MolCol = P03EY2_n4420MolCol[0] ;
         A8053Dg_Desc = P03EY2_A8053Dg_Desc[0] ;
         n8053Dg_Desc = P03EY2_n8053Dg_Desc[0] ;
         AV9Dg_desc = A8053Dg_Desc ;
         AV10Molcol = A4420MolCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmasinfe.this.A396EmprCod;
      this.aP1[0] = pmasinfe.this.A252CliCod;
      this.aP2[0] = pmasinfe.this.A2141SerEst;
      this.aP3[0] = pmasinfe.this.A1013DibCli;
      this.aP4[0] = pmasinfe.this.A1014DibInt;
      this.aP5[0] = pmasinfe.this.A2074ColCom;
      this.aP6[0] = pmasinfe.this.A2078ColFon;
      this.aP7[0] = pmasinfe.this.A2098MolCod;
      this.aP8[0] = pmasinfe.this.AV10Molcol;
      this.aP9[0] = pmasinfe.this.AV9Dg_desc;
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
      P03EY2_A8052Dg_codigo = new short[1] ;
      P03EY2_n8052Dg_codigo = new boolean[] {false} ;
      P03EY2_A396EmprCod = new String[] {""} ;
      P03EY2_A252CliCod = new int[1] ;
      P03EY2_A2141SerEst = new String[] {""} ;
      P03EY2_A1013DibCli = new String[] {""} ;
      P03EY2_A1014DibInt = new int[1] ;
      P03EY2_A2074ColCom = new String[] {""} ;
      P03EY2_A2078ColFon = new String[] {""} ;
      P03EY2_A2098MolCod = new byte[1] ;
      P03EY2_A8053Dg_Desc = new String[] {""} ;
      P03EY2_n8053Dg_Desc = new boolean[] {false} ;
      P03EY2_A4420MolCol = new String[] {""} ;
      P03EY2_n4420MolCol = new boolean[] {false} ;
      A8053Dg_Desc = "" ;
      A4420MolCol = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmasinfe__default(),
         new Object[] {
             new Object[] {
            P03EY2_A8052Dg_codigo, P03EY2_n8052Dg_codigo, P03EY2_A396EmprCod, P03EY2_A252CliCod, P03EY2_A2141SerEst, P03EY2_A1013DibCli, P03EY2_A1014DibInt, P03EY2_A2074ColCom, P03EY2_A2078ColFon, P03EY2_A2098MolCod,
            P03EY2_A8053Dg_Desc, P03EY2_n8053Dg_Desc, P03EY2_A4420MolCol, P03EY2_n4420MolCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private short A8052Dg_codigo ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String AV10Molcol ;
   private String AV9Dg_desc ;
   private String scmdbuf ;
   private String A8053Dg_Desc ;
   private String A4420MolCol ;
   private boolean n8052Dg_codigo ;
   private boolean n8053Dg_Desc ;
   private boolean n4420MolCol ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P03EY2_A8052Dg_codigo ;
   private boolean[] P03EY2_n8052Dg_codigo ;
   private String[] P03EY2_A396EmprCod ;
   private int[] P03EY2_A252CliCod ;
   private String[] P03EY2_A2141SerEst ;
   private String[] P03EY2_A1013DibCli ;
   private int[] P03EY2_A1014DibInt ;
   private String[] P03EY2_A2074ColCom ;
   private String[] P03EY2_A2078ColFon ;
   private byte[] P03EY2_A2098MolCod ;
   private String[] P03EY2_A8053Dg_Desc ;
   private boolean[] P03EY2_n8053Dg_Desc ;
   private String[] P03EY2_A4420MolCol ;
   private boolean[] P03EY2_n4420MolCol ;
}

final  class pmasinfe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03EY2", "SELECT T1.Dg_codigo, T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T2.Dg_Desc, T1.MolCol FROM (TXPMFORES T1 LEFT JOIN TXPDEGRA T2 ON T2.EmprCod = T1.EmprCod AND T2.Dg_codigo = T1.Dg_codigo) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

