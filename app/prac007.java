package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac007 extends GXProcedure
{
   public prac007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac007.class ), "" );
   }

   public prac007( int remoteHandle ,
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
                          short[] aP8 ,
                          String[] aP9 )
   {
      prac007.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 )
   {
      prac007.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac007.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prac007.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac007.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prac007.this.AV16CliCod = aP4[0];
      this.aP4 = aP4;
      prac007.this.AV20CliNOm = aP5[0];
      this.aP5 = aP5;
      prac007.this.AV17Serie = aP6[0];
      this.aP6 = aP6;
      prac007.this.AV22BarSerDsc = aP7[0];
      this.aP7 = aP7;
      prac007.this.AV23barancaca1 = aP8[0];
      this.aP8 = aP8;
      prac007.this.AV24Barcolnom = aP9[0];
      this.aP9 = aP9;
      prac007.this.AV25Barcolnum = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P027X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P027X2_A279CliNom[0] ;
         A252CliCod = P027X2_A252CliCod[0] ;
         n252CliCod = P027X2_n252CliCod[0] ;
         A212BarSer = P027X2_A212BarSer[0] ;
         A1652BarSerDsc = P027X2_A1652BarSerDsc[0] ;
         A125BarAncAca1 = P027X2_A125BarAncAca1[0] ;
         A135BarColNom = P027X2_A135BarColNom[0] ;
         A136BarColNum = P027X2_A136BarColNum[0] ;
         A279CliNom = P027X2_A279CliNom[0] ;
         AV20CliNOm = A279CliNom ;
         AV16CliCod = A252CliCod ;
         AV17Serie = A212BarSer ;
         AV22BarSerDsc = A1652BarSerDsc ;
         AV23barancaca1 = A125BarAncAca1 ;
         AV24Barcolnom = A135BarColNom ;
         AV25Barcolnum = A136BarColNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac007.this.A396EmprCod;
      this.aP1[0] = prac007.this.A129BarCod;
      this.aP2[0] = prac007.this.A132BarCodReo;
      this.aP3[0] = prac007.this.A130BarCodPar;
      this.aP4[0] = prac007.this.AV16CliCod;
      this.aP5[0] = prac007.this.AV20CliNOm;
      this.aP6[0] = prac007.this.AV17Serie;
      this.aP7[0] = prac007.this.AV22BarSerDsc;
      this.aP8[0] = prac007.this.AV23barancaca1;
      this.aP9[0] = prac007.this.AV24Barcolnom;
      this.aP10[0] = prac007.this.AV25Barcolnum;
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
      P027X2_A396EmprCod = new String[] {""} ;
      P027X2_A129BarCod = new int[1] ;
      P027X2_A132BarCodReo = new byte[1] ;
      P027X2_A130BarCodPar = new String[] {""} ;
      P027X2_A279CliNom = new String[] {""} ;
      P027X2_A252CliCod = new int[1] ;
      P027X2_n252CliCod = new boolean[] {false} ;
      P027X2_A212BarSer = new String[] {""} ;
      P027X2_A1652BarSerDsc = new String[] {""} ;
      P027X2_A125BarAncAca1 = new short[1] ;
      P027X2_A135BarColNom = new String[] {""} ;
      P027X2_A136BarColNum = new int[1] ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac007__default(),
         new Object[] {
             new Object[] {
            P027X2_A396EmprCod, P027X2_A129BarCod, P027X2_A132BarCodReo, P027X2_A130BarCodPar, P027X2_A279CliNom, P027X2_A252CliCod, P027X2_n252CliCod, P027X2_A212BarSer, P027X2_A1652BarSerDsc, P027X2_A125BarAncAca1,
            P027X2_A135BarColNom, P027X2_A136BarColNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV23barancaca1 ;
   private short A125BarAncAca1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16CliCod ;
   private int AV25Barcolnum ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV20CliNOm ;
   private String AV17Serie ;
   private String AV22BarSerDsc ;
   private String AV24Barcolnom ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private boolean n252CliCod ;
   private int[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P027X2_A396EmprCod ;
   private int[] P027X2_A129BarCod ;
   private byte[] P027X2_A132BarCodReo ;
   private String[] P027X2_A130BarCodPar ;
   private String[] P027X2_A279CliNom ;
   private int[] P027X2_A252CliCod ;
   private boolean[] P027X2_n252CliCod ;
   private String[] P027X2_A212BarSer ;
   private String[] P027X2_A1652BarSerDsc ;
   private short[] P027X2_A125BarAncAca1 ;
   private String[] P027X2_A135BarColNom ;
   private int[] P027X2_A136BarColNum ;
}

final  class prac007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027X2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliNom, T1.CliCod, T1.BarSer, T1.BarSerDsc, T1.BarAncAca1, T1.BarColNom, T1.BarColNum FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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

