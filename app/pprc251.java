package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc251 extends GXProcedure
{
   public pprc251( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc251.class ), "" );
   }

   public pprc251( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
                           String aP3 ,
                           int aP4 ,
                           short aP5 ,
                           int aP6 ,
                           byte aP7 ,
                           byte aP8 )
   {
      pprc251.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        short aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             short aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             byte[] aP9 )
   {
      pprc251.this.AV8EmprCod = aP0;
      pprc251.this.AV9CliCod = aP1;
      pprc251.this.AV10Artcod = aP2;
      pprc251.this.AV11CCFColNom = aP3;
      pprc251.this.AV12CCFColNum = aP4;
      pprc251.this.AV13Cuaderno = aP5;
      pprc251.this.AV14CCTCod = aP6;
      pprc251.this.AV15CCCno5 = aP7;
      pprc251.this.AV16Ccser1 = aP8;
      pprc251.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV16Ccser1 == 1 )
      {
         AV17ErrControl = (byte)(1) ;
         /* Using cursor P05WB2 */
         pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV14CCTCod), AV10Artcod, AV11CCFColNom, Integer.valueOf(AV12CCFColNum), Integer.valueOf(AV9CliCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4031CCTCod = P05WB2_A4031CCTCod[0] ;
            A4059CCFColNum = P05WB2_A4059CCFColNum[0] ;
            A4058CCFColNom = P05WB2_A4058CCFColNom[0] ;
            A65ArtCod = P05WB2_A65ArtCod[0] ;
            A252CliCod = P05WB2_A252CliCod[0] ;
            A396EmprCod = P05WB2_A396EmprCod[0] ;
            AV17ErrControl = (byte)(0) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else if ( AV15CCCno5 == 1 )
      {
         AV17ErrControl = (byte)(1) ;
         /* Using cursor P05WB3 */
         pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), Short.valueOf(AV13Cuaderno), Integer.valueOf(AV14CCTCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4031CCTCod = P05WB3_A4031CCTCod[0] ;
            A9713Tb1_Cod = P05WB3_A9713Tb1_Cod[0] ;
            A252CliCod = P05WB3_A252CliCod[0] ;
            A396EmprCod = P05WB3_A396EmprCod[0] ;
            A11750IntId = P05WB3_A11750IntId[0] ;
            A11749CCCTc = P05WB3_A11749CCCTc[0] ;
            A11738CCColNum = P05WB3_A11738CCColNum[0] ;
            A11737CCColNom = P05WB3_A11737CCColNom[0] ;
            A11748TipArtiId = P05WB3_A11748TipArtiId[0] ;
            A11736CCArtCod = P05WB3_A11736CCArtCod[0] ;
            AV17ErrControl = (byte)(0) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP9[0] = pprc251.this.AV17ErrControl;
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
      P05WB2_A4031CCTCod = new int[1] ;
      P05WB2_A4059CCFColNum = new int[1] ;
      P05WB2_A4058CCFColNom = new String[] {""} ;
      P05WB2_A65ArtCod = new String[] {""} ;
      P05WB2_A252CliCod = new int[1] ;
      P05WB2_A396EmprCod = new String[] {""} ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      P05WB3_A4031CCTCod = new int[1] ;
      P05WB3_A9713Tb1_Cod = new short[1] ;
      P05WB3_A252CliCod = new int[1] ;
      P05WB3_A396EmprCod = new String[] {""} ;
      P05WB3_A11750IntId = new short[1] ;
      P05WB3_A11749CCCTc = new byte[1] ;
      P05WB3_A11738CCColNum = new int[1] ;
      P05WB3_A11737CCColNom = new String[] {""} ;
      P05WB3_A11748TipArtiId = new short[1] ;
      P05WB3_A11736CCArtCod = new String[] {""} ;
      A11737CCColNom = "" ;
      A11736CCArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc251__default(),
         new Object[] {
             new Object[] {
            P05WB2_A4031CCTCod, P05WB2_A4059CCFColNum, P05WB2_A4058CCFColNom, P05WB2_A65ArtCod, P05WB2_A252CliCod, P05WB2_A396EmprCod
            }
            , new Object[] {
            P05WB3_A4031CCTCod, P05WB3_A9713Tb1_Cod, P05WB3_A252CliCod, P05WB3_A396EmprCod, P05WB3_A11750IntId, P05WB3_A11749CCCTc, P05WB3_A11738CCColNum, P05WB3_A11737CCColNom, P05WB3_A11748TipArtiId, P05WB3_A11736CCArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15CCCno5 ;
   private byte AV16Ccser1 ;
   private byte AV17ErrControl ;
   private byte A11749CCCTc ;
   private short AV13Cuaderno ;
   private short A9713Tb1_Cod ;
   private short A11750IntId ;
   private short A11748TipArtiId ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12CCFColNum ;
   private int AV14CCTCod ;
   private int A4031CCTCod ;
   private int A4059CCFColNum ;
   private int A252CliCod ;
   private int A11738CCColNum ;
   private String AV8EmprCod ;
   private String AV10Artcod ;
   private String AV11CCFColNom ;
   private String scmdbuf ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A11737CCColNom ;
   private String A11736CCArtCod ;
   private byte[] aP9 ;
   private IDataStoreProvider pr_default ;
   private int[] P05WB2_A4031CCTCod ;
   private int[] P05WB2_A4059CCFColNum ;
   private String[] P05WB2_A4058CCFColNom ;
   private String[] P05WB2_A65ArtCod ;
   private int[] P05WB2_A252CliCod ;
   private String[] P05WB2_A396EmprCod ;
   private int[] P05WB3_A4031CCTCod ;
   private short[] P05WB3_A9713Tb1_Cod ;
   private int[] P05WB3_A252CliCod ;
   private String[] P05WB3_A396EmprCod ;
   private short[] P05WB3_A11750IntId ;
   private byte[] P05WB3_A11749CCCTc ;
   private int[] P05WB3_A11738CCColNum ;
   private String[] P05WB3_A11737CCColNom ;
   private short[] P05WB3_A11748TipArtiId ;
   private String[] P05WB3_A11736CCArtCod ;
}

final  class pprc251__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05WB2", "SELECT CCTCod, CCFColNum, CCFColNom, ArtCod, CliCod, EmprCod FROM TXPCCSer1 WHERE (EmprCod = ? and CCTCod = ?) AND (ArtCod = ? or (rtrim(ArtCod) IS NULL AND NOT(ArtCod IS NULL))) AND (CCFColNom = ? or (rtrim(CCFColNom) IS NULL AND NOT(CCFColNom IS NULL))) AND (CCFColNum = ? or (CCFColNum = 0)) AND (CliCod = ?) ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05WB3", "SELECT CCTCod, Tb1_Cod, CliCod, EmprCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno5 WHERE (EmprCod = ? and CliCod = ? and Tb1_Cod = ?) AND (CCTCod = ?) ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

