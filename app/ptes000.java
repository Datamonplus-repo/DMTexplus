package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptes000 extends GXProcedure
{
   public ptes000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptes000.class ), "" );
   }

   public ptes000( int remoteHandle ,
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
                          int[] aP5 ,
                          String[] aP6 ,
                          String[] aP7 ,
                          String[] aP8 ,
                          String[] aP9 ,
                          int[] aP10 ,
                          String[] aP11 ,
                          int[] aP12 ,
                          byte[] aP13 ,
                          java.util.Date[] aP14 ,
                          int[] aP15 )
   {
      ptes000.this.aP16 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        byte[] aP13 ,
                        java.util.Date[] aP14 ,
                        int[] aP15 ,
                        int[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             byte[] aP13 ,
                             java.util.Date[] aP14 ,
                             int[] aP15 ,
                             int[] aP16 )
   {
      ptes000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptes000.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ptes000.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ptes000.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ptes000.this.AV8DisCod = aP4[0];
      this.aP4 = aP4;
      ptes000.this.AV18CliCod = aP5[0];
      this.aP5 = aP5;
      ptes000.this.AV12BarSer = aP6[0];
      this.aP6 = aP6;
      ptes000.this.AV13BarSerDsc = aP7[0];
      this.aP7 = aP7;
      ptes000.this.AV16BarDisNum = aP8[0];
      this.aP8 = aP8;
      ptes000.this.AV9BarColNom = aP9[0];
      this.aP9 = aP9;
      ptes000.this.AV10BarColNum = aP10[0];
      this.aP10 = aP10;
      ptes000.this.AV14BarNomCli = aP11[0];
      this.aP11 = aP11;
      ptes000.this.AV15BarNumCli = aP12[0];
      this.aP12 = aP12;
      ptes000.this.AV11BarTipCol = aP13[0];
      this.aP13 = aP13;
      ptes000.this.AV19BarFecGen = aP14[0];
      this.aP14 = aP14;
      ptes000.this.AV20BarNumLot = aP15[0];
      this.aP15 = aP15;
      ptes000.this.AV21BarCliDes = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n252CliCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01MN2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV21BarCliDes), Integer.valueOf(AV20BarNumLot), AV19BarFecGen, Boolean.valueOf(n252CliCod), Integer.valueOf(AV18CliCod), Integer.valueOf(AV8DisCod), AV16BarDisNum, Integer.valueOf(AV15BarNumCli), AV14BarNomCli, AV13BarSerDsc, AV12BarSer, Byte.valueOf(AV11BarTipCol), Integer.valueOf(AV10BarColNum), AV9BarColNom, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptes000.this.A396EmprCod;
      this.aP1[0] = ptes000.this.A129BarCod;
      this.aP2[0] = ptes000.this.A132BarCodReo;
      this.aP3[0] = ptes000.this.A130BarCodPar;
      this.aP4[0] = ptes000.this.AV8DisCod;
      this.aP5[0] = ptes000.this.AV18CliCod;
      this.aP6[0] = ptes000.this.AV12BarSer;
      this.aP7[0] = ptes000.this.AV13BarSerDsc;
      this.aP8[0] = ptes000.this.AV16BarDisNum;
      this.aP9[0] = ptes000.this.AV9BarColNom;
      this.aP10[0] = ptes000.this.AV10BarColNum;
      this.aP11[0] = ptes000.this.AV14BarNomCli;
      this.aP12[0] = ptes000.this.AV15BarNumCli;
      this.aP13[0] = ptes000.this.AV11BarTipCol;
      this.aP14[0] = ptes000.this.AV19BarFecGen;
      this.aP15[0] = ptes000.this.AV20BarNumLot;
      this.aP16[0] = ptes000.this.AV21BarCliDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptes000");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A159BarFecGen = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptes000__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarTipCol ;
   private byte A218BarTipCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8DisCod ;
   private int AV18CliCod ;
   private int AV10BarColNum ;
   private int AV15BarNumCli ;
   private int AV20BarNumLot ;
   private int AV21BarCliDes ;
   private int A2311BarCliDes ;
   private int A2826BarNumLot ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12BarSer ;
   private String AV13BarSerDsc ;
   private String AV16BarDisNum ;
   private String AV9BarColNom ;
   private String AV14BarNomCli ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private java.util.Date AV19BarFecGen ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private int[] aP16 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private byte[] aP13 ;
   private java.util.Date[] aP14 ;
   private int[] aP15 ;
   private IDataStoreProvider pr_default ;
}

final  class ptes000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01MN2", "UPDATE TXPBARCAD SET BarCliDes=?, BarNumLot=?, BarFecGen=?, CliCod=?, DisCod=?, BarDisNum=?, BarNumCli=?, BarNomCli=?, BarSerDsc=?, BarSer=?, BarTipCol=?, BarColNum=?, BarColNom=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 8);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 13);
               stmt.setString(9, (String)parms[9], 26);
               stmt.setString(10, (String)parms[10], 16);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 13);
               stmt.setString(14, (String)parms[14], 3);
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               stmt.setString(17, (String)parms[17], 1);
               return;
      }
   }

}

