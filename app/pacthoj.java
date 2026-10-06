package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacthoj extends GXProcedure
{
   public pacthoj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacthoj.class ), "" );
   }

   public pacthoj( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pacthoj.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pacthoj.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacthoj.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pacthoj.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pacthoj.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pacthoj.this.AV16BarColNom = aP4[0];
      this.aP4 = aP4;
      pacthoj.this.AV17BarColNum = aP5[0];
      this.aP5 = aP5;
      pacthoj.this.AV20BarTipCol = aP6[0];
      this.aP6 = aP6;
      pacthoj.this.AV18BarNomCli = aP7[0];
      this.aP7 = aP7;
      pacthoj.this.AV19BarNumCli = aP8[0];
      this.aP8 = aP8;
      pacthoj.this.AV21CliCod = aP9[0];
      this.aP9 = aP9;
      pacthoj.this.AV22ForSer = aP10[0];
      this.aP10 = aP10;
      pacthoj.this.AV23ForTonal = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24FlagBros = (byte)(0) ;
      GXv_int1[0] = AV24FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      pacthoj.this.AV24FlagBros = GXv_int1[0] ;
      /* Using cursor P00NU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod), AV22ForSer, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV16BarColNom, Integer.valueOf(AV17BarColNum), Byte.valueOf(AV20BarTipCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A218BarTipCol = P00NU2_A218BarTipCol[0] ;
         A136BarColNum = P00NU2_A136BarColNum[0] ;
         A135BarColNom = P00NU2_A135BarColNom[0] ;
         A212BarSer = P00NU2_A212BarSer[0] ;
         A252CliCod = P00NU2_A252CliCod[0] ;
         n252CliCod = P00NU2_n252CliCod[0] ;
         A213BarSit = P00NU2_A213BarSit[0] ;
         A1234BarNomCli = P00NU2_A1234BarNomCli[0] ;
         A1235BarNumCli = P00NU2_A1235BarNumCli[0] ;
         A3313BarNumTon = P00NU2_A3313BarNumTon[0] ;
         if ( A213BarSit == 2 )
         {
            A213BarSit = (byte)(1) ;
            if ( (0==AV24FlagBros) )
            {
               A1234BarNomCli = AV18BarNomCli ;
               A1235BarNumCli = AV19BarNumCli ;
            }
            A3313BarNumTon = GXutil.substring( AV23ForTonal, 1, 10) ;
         }
         /* Using cursor P00NU3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A3313BarNumTon, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacthoj.this.A396EmprCod;
      this.aP1[0] = pacthoj.this.A129BarCod;
      this.aP2[0] = pacthoj.this.A132BarCodReo;
      this.aP3[0] = pacthoj.this.A130BarCodPar;
      this.aP4[0] = pacthoj.this.AV16BarColNom;
      this.aP5[0] = pacthoj.this.AV17BarColNum;
      this.aP6[0] = pacthoj.this.AV20BarTipCol;
      this.aP7[0] = pacthoj.this.AV18BarNomCli;
      this.aP8[0] = pacthoj.this.AV19BarNumCli;
      this.aP9[0] = pacthoj.this.AV21CliCod;
      this.aP10[0] = pacthoj.this.AV22ForSer;
      this.aP11[0] = pacthoj.this.AV23ForTonal;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacthoj");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00NU2_A396EmprCod = new String[] {""} ;
      P00NU2_A129BarCod = new int[1] ;
      P00NU2_A132BarCodReo = new byte[1] ;
      P00NU2_A130BarCodPar = new String[] {""} ;
      P00NU2_A218BarTipCol = new byte[1] ;
      P00NU2_A136BarColNum = new int[1] ;
      P00NU2_A135BarColNom = new String[] {""} ;
      P00NU2_A212BarSer = new String[] {""} ;
      P00NU2_A252CliCod = new int[1] ;
      P00NU2_n252CliCod = new boolean[] {false} ;
      P00NU2_A213BarSit = new byte[1] ;
      P00NU2_A1234BarNomCli = new String[] {""} ;
      P00NU2_A1235BarNumCli = new int[1] ;
      P00NU2_A3313BarNumTon = new String[] {""} ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1234BarNomCli = "" ;
      A3313BarNumTon = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacthoj__default(),
         new Object[] {
             new Object[] {
            P00NU2_A396EmprCod, P00NU2_A129BarCod, P00NU2_A132BarCodReo, P00NU2_A130BarCodPar, P00NU2_A218BarTipCol, P00NU2_A136BarColNum, P00NU2_A135BarColNom, P00NU2_A212BarSer, P00NU2_A252CliCod, P00NU2_n252CliCod,
            P00NU2_A213BarSit, P00NU2_A1234BarNomCli, P00NU2_A1235BarNumCli, P00NU2_A3313BarNumTon
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV20BarTipCol ;
   private byte AV24FlagBros ;
   private byte GXv_int1[] ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17BarColNum ;
   private int AV19BarNumCli ;
   private int AV21CliCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16BarColNom ;
   private String AV18BarNomCli ;
   private String AV22ForSer ;
   private String AV23ForTonal ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A3313BarNumTon ;
   private boolean n252CliCod ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NU2_A396EmprCod ;
   private int[] P00NU2_A129BarCod ;
   private byte[] P00NU2_A132BarCodReo ;
   private String[] P00NU2_A130BarCodPar ;
   private byte[] P00NU2_A218BarTipCol ;
   private int[] P00NU2_A136BarColNum ;
   private String[] P00NU2_A135BarColNom ;
   private String[] P00NU2_A212BarSer ;
   private int[] P00NU2_A252CliCod ;
   private boolean[] P00NU2_n252CliCod ;
   private byte[] P00NU2_A213BarSit ;
   private String[] P00NU2_A1234BarNomCli ;
   private int[] P00NU2_A1235BarNumCli ;
   private String[] P00NU2_A3313BarNumTon ;
}

final  class pacthoj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NU2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTipCol, BarColNum, BarColNom, BarSer, CliCod, BarSit, BarNomCli, BarNumCli, BarNumTon FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarSer = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarColNom = ?) AND (BarColNum = ?) AND (BarTipCol = ?) ORDER BY EmprCod, CliCod, BarSer, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00NU3", "UPDATE TXPBARCAD SET BarSit=?, BarNomCli=?, BarNumCli=?, BarNumTon=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 10);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

