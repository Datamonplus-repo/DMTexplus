package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class penslab extends GXProcedure
{
   public penslab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penslab.class ), "" );
   }

   public penslab( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 )
   {
      penslab.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 )
   {
      penslab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      penslab.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      penslab.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      penslab.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      penslab.this.AV18CliCod = aP4[0];
      this.aP4 = aP4;
      penslab.this.AV19BarMat = aP5[0];
      this.aP5 = aP5;
      penslab.this.AV20BarTipArt = aP6[0];
      this.aP6 = aP6;
      penslab.this.AV21BarSer = aP7[0];
      this.aP7 = aP7;
      penslab.this.AV22BarDisNum = aP8[0];
      this.aP8 = aP8;
      penslab.this.AV23BarColNom = aP9[0];
      this.aP9 = aP9;
      penslab.this.AV24BarColNum = aP10[0];
      this.aP10 = aP10;
      penslab.this.AV25CliNom = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Flag = (byte)(0) ;
      /* Using cursor P008T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P008T2_A130BarCodPar[0] ;
         A132BarCodReo = P008T2_A132BarCodReo[0] ;
         A129BarCod = P008T2_A129BarCod[0] ;
         A143BarDisNum = P008T2_A143BarDisNum[0] ;
         A182BarMat = P008T2_A182BarMat[0] ;
         A212BarSer = P008T2_A212BarSer[0] ;
         A217BarTipArt = P008T2_A217BarTipArt[0] ;
         n217BarTipArt = P008T2_n217BarTipArt[0] ;
         A252CliCod = P008T2_A252CliCod[0] ;
         n252CliCod = P008T2_n252CliCod[0] ;
         A135BarColNom = P008T2_A135BarColNom[0] ;
         A136BarColNum = P008T2_A136BarColNum[0] ;
         A279CliNom = P008T2_A279CliNom[0] ;
         A279CliNom = P008T2_A279CliNom[0] ;
         AV22BarDisNum = A143BarDisNum ;
         AV19BarMat = A182BarMat ;
         AV21BarSer = A212BarSer ;
         AV20BarTipArt = A217BarTipArt ;
         AV18CliCod = A252CliCod ;
         AV23BarColNom = A135BarColNom ;
         AV24BarColNum = A136BarColNum ;
         AV25CliNom = A279CliNom ;
         AV26Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV26Flag == 0 )
      {
         /* Using cursor P008T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A507HbaBarPar = P008T3_A507HbaBarPar[0] ;
            A508HbaBarReo = P008T3_A508HbaBarReo[0] ;
            A506HbaBarCod = P008T3_A506HbaBarCod[0] ;
            A516HbaDisCli = P008T3_A516HbaDisCli[0] ;
            n516HbaDisCli = P008T3_n516HbaDisCli[0] ;
            A535HbaSer = P008T3_A535HbaSer[0] ;
            n535HbaSer = P008T3_n535HbaSer[0] ;
            A536HbaTipArt = P008T3_A536HbaTipArt[0] ;
            n536HbaTipArt = P008T3_n536HbaTipArt[0] ;
            A252CliCod = P008T3_A252CliCod[0] ;
            n252CliCod = P008T3_n252CliCod[0] ;
            A509HbaColNom = P008T3_A509HbaColNom[0] ;
            n509HbaColNom = P008T3_n509HbaColNom[0] ;
            A510HbaColNum = P008T3_A510HbaColNum[0] ;
            n510HbaColNum = P008T3_n510HbaColNum[0] ;
            A279CliNom = P008T3_A279CliNom[0] ;
            A279CliNom = P008T3_A279CliNom[0] ;
            AV22BarDisNum = A516HbaDisCli ;
            AV19BarMat = GXutil.space( (short)(16)) ;
            AV21BarSer = A535HbaSer ;
            AV20BarTipArt = A536HbaTipArt ;
            AV18CliCod = A252CliCod ;
            AV23BarColNom = A509HbaColNom ;
            AV24BarColNum = A510HbaColNum ;
            AV25CliNom = A279CliNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = penslab.this.A396EmprCod;
      this.aP1[0] = penslab.this.AV15BarCod;
      this.aP2[0] = penslab.this.AV16BarCodReo;
      this.aP3[0] = penslab.this.AV17BarCodPar;
      this.aP4[0] = penslab.this.AV18CliCod;
      this.aP5[0] = penslab.this.AV19BarMat;
      this.aP6[0] = penslab.this.AV20BarTipArt;
      this.aP7[0] = penslab.this.AV21BarSer;
      this.aP8[0] = penslab.this.AV22BarDisNum;
      this.aP9[0] = penslab.this.AV23BarColNom;
      this.aP10[0] = penslab.this.AV24BarColNum;
      this.aP11[0] = penslab.this.AV25CliNom;
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
      P008T2_A396EmprCod = new String[] {""} ;
      P008T2_A130BarCodPar = new String[] {""} ;
      P008T2_A132BarCodReo = new byte[1] ;
      P008T2_A129BarCod = new int[1] ;
      P008T2_A143BarDisNum = new String[] {""} ;
      P008T2_A182BarMat = new String[] {""} ;
      P008T2_A212BarSer = new String[] {""} ;
      P008T2_A217BarTipArt = new short[1] ;
      P008T2_n217BarTipArt = new boolean[] {false} ;
      P008T2_A252CliCod = new int[1] ;
      P008T2_n252CliCod = new boolean[] {false} ;
      P008T2_A135BarColNom = new String[] {""} ;
      P008T2_A136BarColNum = new int[1] ;
      P008T2_A279CliNom = new String[] {""} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A182BarMat = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      P008T3_A396EmprCod = new String[] {""} ;
      P008T3_A507HbaBarPar = new String[] {""} ;
      P008T3_A508HbaBarReo = new byte[1] ;
      P008T3_A506HbaBarCod = new int[1] ;
      P008T3_A516HbaDisCli = new String[] {""} ;
      P008T3_n516HbaDisCli = new boolean[] {false} ;
      P008T3_A535HbaSer = new String[] {""} ;
      P008T3_n535HbaSer = new boolean[] {false} ;
      P008T3_A536HbaTipArt = new short[1] ;
      P008T3_n536HbaTipArt = new boolean[] {false} ;
      P008T3_A252CliCod = new int[1] ;
      P008T3_n252CliCod = new boolean[] {false} ;
      P008T3_A509HbaColNom = new String[] {""} ;
      P008T3_n509HbaColNom = new boolean[] {false} ;
      P008T3_A510HbaColNum = new int[1] ;
      P008T3_n510HbaColNum = new boolean[] {false} ;
      P008T3_A279CliNom = new String[] {""} ;
      A507HbaBarPar = "" ;
      A516HbaDisCli = "" ;
      A535HbaSer = "" ;
      A509HbaColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.penslab__default(),
         new Object[] {
             new Object[] {
            P008T2_A396EmprCod, P008T2_A130BarCodPar, P008T2_A132BarCodReo, P008T2_A129BarCod, P008T2_A143BarDisNum, P008T2_A182BarMat, P008T2_A212BarSer, P008T2_A217BarTipArt, P008T2_n217BarTipArt, P008T2_A252CliCod,
            P008T2_n252CliCod, P008T2_A135BarColNom, P008T2_A136BarColNum, P008T2_A279CliNom
            }
            , new Object[] {
            P008T3_A396EmprCod, P008T3_A507HbaBarPar, P008T3_A508HbaBarReo, P008T3_A506HbaBarCod, P008T3_A516HbaDisCli, P008T3_n516HbaDisCli, P008T3_A535HbaSer, P008T3_n535HbaSer, P008T3_A536HbaTipArt, P008T3_n536HbaTipArt,
            P008T3_A252CliCod, P008T3_n252CliCod, P008T3_A509HbaColNom, P008T3_n509HbaColNom, P008T3_A510HbaColNum, P008T3_n510HbaColNum, P008T3_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV26Flag ;
   private byte A132BarCodReo ;
   private byte A508HbaBarReo ;
   private short AV20BarTipArt ;
   private short A217BarTipArt ;
   private short A536HbaTipArt ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV18CliCod ;
   private int AV24BarColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV19BarMat ;
   private String AV21BarSer ;
   private String AV22BarDisNum ;
   private String AV23BarColNom ;
   private String AV25CliNom ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A182BarMat ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A507HbaBarPar ;
   private String A516HbaDisCli ;
   private String A535HbaSer ;
   private String A509HbaColNom ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n516HbaDisCli ;
   private boolean n535HbaSer ;
   private boolean n536HbaTipArt ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P008T2_A396EmprCod ;
   private String[] P008T2_A130BarCodPar ;
   private byte[] P008T2_A132BarCodReo ;
   private int[] P008T2_A129BarCod ;
   private String[] P008T2_A143BarDisNum ;
   private String[] P008T2_A182BarMat ;
   private String[] P008T2_A212BarSer ;
   private short[] P008T2_A217BarTipArt ;
   private boolean[] P008T2_n217BarTipArt ;
   private int[] P008T2_A252CliCod ;
   private boolean[] P008T2_n252CliCod ;
   private String[] P008T2_A135BarColNom ;
   private int[] P008T2_A136BarColNum ;
   private String[] P008T2_A279CliNom ;
   private String[] P008T3_A396EmprCod ;
   private String[] P008T3_A507HbaBarPar ;
   private byte[] P008T3_A508HbaBarReo ;
   private int[] P008T3_A506HbaBarCod ;
   private String[] P008T3_A516HbaDisCli ;
   private boolean[] P008T3_n516HbaDisCli ;
   private String[] P008T3_A535HbaSer ;
   private boolean[] P008T3_n535HbaSer ;
   private short[] P008T3_A536HbaTipArt ;
   private boolean[] P008T3_n536HbaTipArt ;
   private int[] P008T3_A252CliCod ;
   private boolean[] P008T3_n252CliCod ;
   private String[] P008T3_A509HbaColNom ;
   private boolean[] P008T3_n509HbaColNom ;
   private int[] P008T3_A510HbaColNum ;
   private boolean[] P008T3_n510HbaColNum ;
   private String[] P008T3_A279CliNom ;
}

final  class penslab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008T2", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarMat, T1.BarSer, T1.BarTipArt, T1.CliCod, T1.BarColNom, T1.BarColNum, T2.CliNom FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008T3", "SELECT T1.EmprCod, T1.HbaBarPar, T1.HbaBarReo, T1.HbaBarCod, T1.HbaDisCli, T1.HbaSer, T1.HbaTipArt, T1.CliCod, T1.HbaColNom, T1.HbaColNum, T2.CliNom FROM (TXPHISBAR T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HbaBarCod = ? and T1.HbaBarReo = ? and T1.HbaBarPar = ? ORDER BY T1.EmprCod, T1.HbaBarCod, T1.HbaBarReo, T1.HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

