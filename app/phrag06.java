package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phrag06 extends GXProcedure
{
   public phrag06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phrag06.class ), "" );
   }

   public phrag06( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          String[] aP7 ,
                          int[] aP8 )
   {
      phrag06.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 )
   {
      phrag06.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phrag06.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phrag06.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phrag06.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phrag06.this.AV16CliCod = aP4[0];
      this.aP4 = aP4;
      phrag06.this.AV20CliNOm = aP5[0];
      this.aP5 = aP5;
      phrag06.this.AV17Serie = aP6[0];
      this.aP6 = aP6;
      phrag06.this.AV18Color = aP7[0];
      this.aP7 = aP7;
      phrag06.this.AV19ColNum = aP8[0];
      this.aP8 = aP8;
      phrag06.this.AV21DisCod = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01S32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P01S32_A279CliNom[0] ;
         A252CliCod = P01S32_A252CliCod[0] ;
         n252CliCod = P01S32_n252CliCod[0] ;
         A136BarColNum = P01S32_A136BarColNum[0] ;
         A135BarColNom = P01S32_A135BarColNom[0] ;
         A212BarSer = P01S32_A212BarSer[0] ;
         A361DisCod = P01S32_A361DisCod[0] ;
         A279CliNom = P01S32_A279CliNom[0] ;
         AV20CliNOm = A279CliNom ;
         AV16CliCod = A252CliCod ;
         AV19ColNum = A136BarColNum ;
         AV18Color = A135BarColNom ;
         AV17Serie = A212BarSer ;
         AV21DisCod = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phrag06.this.A396EmprCod;
      this.aP1[0] = phrag06.this.A129BarCod;
      this.aP2[0] = phrag06.this.A132BarCodReo;
      this.aP3[0] = phrag06.this.A130BarCodPar;
      this.aP4[0] = phrag06.this.AV16CliCod;
      this.aP5[0] = phrag06.this.AV20CliNOm;
      this.aP6[0] = phrag06.this.AV17Serie;
      this.aP7[0] = phrag06.this.AV18Color;
      this.aP8[0] = phrag06.this.AV19ColNum;
      this.aP9[0] = phrag06.this.AV21DisCod;
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
      P01S32_A396EmprCod = new String[] {""} ;
      P01S32_A129BarCod = new int[1] ;
      P01S32_A132BarCodReo = new byte[1] ;
      P01S32_A130BarCodPar = new String[] {""} ;
      P01S32_A279CliNom = new String[] {""} ;
      P01S32_A252CliCod = new int[1] ;
      P01S32_n252CliCod = new boolean[] {false} ;
      P01S32_A136BarColNum = new int[1] ;
      P01S32_A135BarColNom = new String[] {""} ;
      P01S32_A212BarSer = new String[] {""} ;
      P01S32_A361DisCod = new int[1] ;
      A279CliNom = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phrag06__default(),
         new Object[] {
             new Object[] {
            P01S32_A396EmprCod, P01S32_A129BarCod, P01S32_A132BarCodReo, P01S32_A130BarCodPar, P01S32_A279CliNom, P01S32_A252CliCod, P01S32_n252CliCod, P01S32_A136BarColNum, P01S32_A135BarColNom, P01S32_A212BarSer,
            P01S32_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16CliCod ;
   private int AV19ColNum ;
   private int AV21DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV20CliNOm ;
   private String AV17Serie ;
   private String AV18Color ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private boolean n252CliCod ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01S32_A396EmprCod ;
   private int[] P01S32_A129BarCod ;
   private byte[] P01S32_A132BarCodReo ;
   private String[] P01S32_A130BarCodPar ;
   private String[] P01S32_A279CliNom ;
   private int[] P01S32_A252CliCod ;
   private boolean[] P01S32_n252CliCod ;
   private int[] P01S32_A136BarColNum ;
   private String[] P01S32_A135BarColNom ;
   private String[] P01S32_A212BarSer ;
   private int[] P01S32_A361DisCod ;
}

final  class phrag06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01S32", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliNom, T1.CliCod, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.DisCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((int[]) buf[10])[0] = rslt.getInt(10);
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

