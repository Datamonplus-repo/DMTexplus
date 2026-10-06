package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partvpe extends GXProcedure
{
   public partvpe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partvpe.class ), "" );
   }

   public partvpe( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      partvpe.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      partvpe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partvpe.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partvpe.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      partvpe.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      partvpe.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      partvpe.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      partvpe.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      partvpe.this.AV8Ok = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = (byte)(1) ;
      /* Using cursor P02YN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P02YN2_A719PrdNum[0] ;
         n719PrdNum = P02YN2_n719PrdNum[0] ;
         A856ValCod = P02YN2_A856ValCod[0] ;
         A2535ForPrdLin = P02YN2_A2535ForPrdLin[0] ;
         A2098MolCod = P02YN2_A2098MolCod[0] ;
         A856ValCod = P02YN2_A856ValCod[0] ;
         AV8Ok = (byte)(0) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partvpe.this.A396EmprCod;
      this.aP1[0] = partvpe.this.A252CliCod;
      this.aP2[0] = partvpe.this.A2141SerEst;
      this.aP3[0] = partvpe.this.A1013DibCli;
      this.aP4[0] = partvpe.this.A1014DibInt;
      this.aP5[0] = partvpe.this.A2074ColCom;
      this.aP6[0] = partvpe.this.A2078ColFon;
      this.aP7[0] = partvpe.this.AV8Ok;
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
      P02YN2_A396EmprCod = new String[] {""} ;
      P02YN2_A252CliCod = new int[1] ;
      P02YN2_A2141SerEst = new String[] {""} ;
      P02YN2_A1013DibCli = new String[] {""} ;
      P02YN2_A1014DibInt = new int[1] ;
      P02YN2_A2074ColCom = new String[] {""} ;
      P02YN2_A2078ColFon = new String[] {""} ;
      P02YN2_A719PrdNum = new String[] {""} ;
      P02YN2_n719PrdNum = new boolean[] {false} ;
      P02YN2_A856ValCod = new byte[1] ;
      P02YN2_A2535ForPrdLin = new short[1] ;
      P02YN2_A2098MolCod = new byte[1] ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partvpe__default(),
         new Object[] {
             new Object[] {
            P02YN2_A396EmprCod, P02YN2_A252CliCod, P02YN2_A2141SerEst, P02YN2_A1013DibCli, P02YN2_A1014DibInt, P02YN2_A2074ColCom, P02YN2_A2078ColFon, P02YN2_A719PrdNum, P02YN2_n719PrdNum, P02YN2_A856ValCod,
            P02YN2_A2535ForPrdLin, P02YN2_A2098MolCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ok ;
   private byte A856ValCod ;
   private byte A2098MolCod ;
   private short A2535ForPrdLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private boolean n719PrdNum ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YN2_A396EmprCod ;
   private int[] P02YN2_A252CliCod ;
   private String[] P02YN2_A2141SerEst ;
   private String[] P02YN2_A1013DibCli ;
   private int[] P02YN2_A1014DibInt ;
   private String[] P02YN2_A2074ColCom ;
   private String[] P02YN2_A2078ColFon ;
   private String[] P02YN2_A719PrdNum ;
   private boolean[] P02YN2_n719PrdNum ;
   private byte[] P02YN2_A856ValCod ;
   private short[] P02YN2_A2535ForPrdLin ;
   private byte[] P02YN2_A2098MolCod ;
}

final  class partvpe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YN2", "SELECT * FROM (SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.PrdNum, T2.ValCod, T1.ForPrdLin, T1.MolCod FROM (TXPRECPR2 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ?) AND (T2.ValCod >= 2) AND (LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) = 6) ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
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
               return;
      }
   }

}

