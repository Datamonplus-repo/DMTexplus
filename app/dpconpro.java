package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpconpro extends GXProcedure
{
   public dpconpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpconpro.class ), "" );
   }

   public dpconpro( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTCONPRO_Registro> executeUdp( )
   {
      dpconpro.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTCONPRO_Registro>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.SdtSDTCONPRO_Registro>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.SdtSDTCONPRO_Registro>[] aP0 )
   {
      dpconpro.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00482 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14297CP_ID = P00482_A14297CP_ID[0] ;
         A14328CP_EMPRCOD = P00482_A14328CP_EMPRCOD[0] ;
         A14326CP_CLICOD = P00482_A14326CP_CLICOD[0] ;
         A14327CP_CLINOM = P00482_A14327CP_CLINOM[0] ;
         A14301CP_BARCOD = P00482_A14301CP_BARCOD[0] ;
         A14302CP_BARCODR = P00482_A14302CP_BARCODR[0] ;
         A14303CP_BARCODP = P00482_A14303CP_BARCODP[0] ;
         A14304CP_BARFECF = P00482_A14304CP_BARFECF[0] ;
         A14305CP_BARNUMC = P00482_A14305CP_BARNUMC[0] ;
         A14306CP_BARPLF = P00482_A14306CP_BARPLF[0] ;
         A14307CP_BARSIT = P00482_A14307CP_BARSIT[0] ;
         A14311CP_BARSER = P00482_A14311CP_BARSER[0] ;
         A14312CP_BARSERD = P00482_A14312CP_BARSERD[0] ;
         A14331CP_BARCOLO = P00482_A14331CP_BARCOLO[0] ;
         A14332CP_BARCOLU = P00482_A14332CP_BARCOLU[0] ;
         A14315CP_BARNOMC = P00482_A14315CP_BARNOMC[0] ;
         A14316CP_BARTIPA = P00482_A14316CP_BARTIPA[0] ;
         A14343CP_TARTDSC = P00482_A14343CP_TARTDSC[0] ;
         A14317CP_BARGIRA = P00482_A14317CP_BARGIRA[0] ;
         A14318CP_BARACAA = P00482_A14318CP_BARACAA[0] ;
         A14319CP_BARAGRE = P00482_A14319CP_BARAGRE[0] ;
         A14320CP_BAREXT = P00482_A14320CP_BAREXT[0] ;
         A14321CP_DISDES = P00482_A14321CP_DISDES[0] ;
         A14322CP_DISCOD = P00482_A14322CP_DISCOD[0] ;
         A14323CP_BARPROP = P00482_A14323CP_BARPROP[0] ;
         A14334CP_DSC_BAR = P00482_A14334CP_DSC_BAR[0] ;
         A14336CP_BARKGM = P00482_A14336CP_BARKGM[0] ;
         A14337CP_BARMTR = P00482_A14337CP_BARMTR[0] ;
         A14338CP_BARPIE = P00482_A14338CP_BARPIE[0] ;
         A14339CP_BARALBK = P00482_A14339CP_BARALBK[0] ;
         A14340CP_BARALBM = P00482_A14340CP_BARALBM[0] ;
         A14341CP_DISUSRC = P00482_A14341CP_DISUSRC[0] ;
         Gxm1sdtconpro = (app.SdtSDTCONPRO_Registro)new app.SdtSDTCONPRO_Registro(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtconpro, 0);
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_id( A14297CP_ID );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_emprcod( A14328CP_EMPRCOD );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_clicod( A14326CP_CLICOD );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_clinom( A14327CP_CLINOM );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barcod( A14301CP_BARCOD );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo( A14302CP_BARCODR );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar( A14303CP_BARCODP );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr( A14304CP_BARFECF );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli( A14305CP_BARNUMC );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barplf( A14306CP_BARPLF );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barsit( A14307CP_BARSIT );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barser( A14311CP_BARSER );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc( A14312CP_BARSERD );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barcolo( A14331CP_BARCOLO );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barcolu( A14332CP_BARCOLU );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barnomcli( A14315CP_BARNOMC );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_bartipart( A14316CP_BARTIPA );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_tartdsc( A14343CP_TARTDSC );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_bargirar( A14317CP_BARGIRA );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh( A14318CP_BARACAA );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_desc_b( "" );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_baragrest( A14319CP_BARAGRE );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barext( A14320CP_BAREXT );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_disdes( A14321CP_DISDES );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_discod( A14322CP_DISCOD );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barproper( A14323CP_BARPROP );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar( A14334CP_DSC_BAR );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barkgm( A14336CP_BARKGM );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barmtr( A14337CP_BARMTR );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_barpie( A14338CP_BARPIE );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_baralbk( A14339CP_BARALBK );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_baralbm( A14340CP_BARALBM );
         Gxm1sdtconpro.setgxTv_SdtSDTCONPRO_Registro_Cp_disusrc( A14341CP_DISUSRC );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpconpro.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTCONPRO_Registro>(app.SdtSDTCONPRO_Registro.class, "Registro", "", remoteHandle);
      scmdbuf = "" ;
      P00482_A14297CP_ID = new long[1] ;
      P00482_A14328CP_EMPRCOD = new String[] {""} ;
      P00482_A14326CP_CLICOD = new int[1] ;
      P00482_A14327CP_CLINOM = new String[] {""} ;
      P00482_A14301CP_BARCOD = new int[1] ;
      P00482_A14302CP_BARCODR = new byte[1] ;
      P00482_A14303CP_BARCODP = new String[] {""} ;
      P00482_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P00482_A14305CP_BARNUMC = new int[1] ;
      P00482_A14306CP_BARPLF = new String[] {""} ;
      P00482_A14307CP_BARSIT = new byte[1] ;
      P00482_A14311CP_BARSER = new String[] {""} ;
      P00482_A14312CP_BARSERD = new String[] {""} ;
      P00482_A14331CP_BARCOLO = new String[] {""} ;
      P00482_A14332CP_BARCOLU = new int[1] ;
      P00482_A14315CP_BARNOMC = new String[] {""} ;
      P00482_A14316CP_BARTIPA = new short[1] ;
      P00482_A14343CP_TARTDSC = new String[] {""} ;
      P00482_A14317CP_BARGIRA = new String[] {""} ;
      P00482_A14318CP_BARACAA = new short[1] ;
      P00482_A14319CP_BARAGRE = new String[] {""} ;
      P00482_A14320CP_BAREXT = new byte[1] ;
      P00482_A14321CP_DISDES = new String[] {""} ;
      P00482_A14322CP_DISCOD = new int[1] ;
      P00482_A14323CP_BARPROP = new String[] {""} ;
      P00482_A14334CP_DSC_BAR = new String[] {""} ;
      P00482_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00482_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00482_A14338CP_BARPIE = new int[1] ;
      P00482_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00482_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00482_A14341CP_DISUSRC = new String[] {""} ;
      A14328CP_EMPRCOD = "" ;
      A14327CP_CLINOM = "" ;
      A14303CP_BARCODP = "" ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14306CP_BARPLF = "" ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14343CP_TARTDSC = "" ;
      A14317CP_BARGIRA = "" ;
      A14319CP_BARAGRE = "" ;
      A14321CP_DISDES = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14341CP_DISUSRC = "" ;
      Gxm1sdtconpro = new app.SdtSDTCONPRO_Registro(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpconpro__default(),
         new Object[] {
             new Object[] {
            P00482_A14297CP_ID, P00482_A14328CP_EMPRCOD, P00482_A14326CP_CLICOD, P00482_A14327CP_CLINOM, P00482_A14301CP_BARCOD, P00482_A14302CP_BARCODR, P00482_A14303CP_BARCODP, P00482_A14304CP_BARFECF, P00482_A14305CP_BARNUMC, P00482_A14306CP_BARPLF,
            P00482_A14307CP_BARSIT, P00482_A14311CP_BARSER, P00482_A14312CP_BARSERD, P00482_A14331CP_BARCOLO, P00482_A14332CP_BARCOLU, P00482_A14315CP_BARNOMC, P00482_A14316CP_BARTIPA, P00482_A14343CP_TARTDSC, P00482_A14317CP_BARGIRA, P00482_A14318CP_BARACAA,
            P00482_A14319CP_BARAGRE, P00482_A14320CP_BAREXT, P00482_A14321CP_DISDES, P00482_A14322CP_DISCOD, P00482_A14323CP_BARPROP, P00482_A14334CP_DSC_BAR, P00482_A14336CP_BARKGM, P00482_A14337CP_BARMTR, P00482_A14338CP_BARPIE, P00482_A14339CP_BARALBK,
            P00482_A14340CP_BARALBM, P00482_A14341CP_DISUSRC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private byte A14320CP_BAREXT ;
   private short A14316CP_BARTIPA ;
   private short A14318CP_BARACAA ;
   private short Gx_err ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14305CP_BARNUMC ;
   private int A14332CP_BARCOLU ;
   private int A14322CP_DISCOD ;
   private int A14338CP_BARPIE ;
   private long A14297CP_ID ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String scmdbuf ;
   private String A14328CP_EMPRCOD ;
   private String A14303CP_BARCODP ;
   private String A14306CP_BARPLF ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14319CP_BARAGRE ;
   private String A14321CP_DISDES ;
   private String A14323CP_BARPROP ;
   private String A14341CP_DISUSRC ;
   private java.util.Date A14304CP_BARFECF ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14315CP_BARNOMC ;
   private String A14343CP_TARTDSC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private GXBaseCollection<app.SdtSDTCONPRO_Registro>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P00482_A14297CP_ID ;
   private String[] P00482_A14328CP_EMPRCOD ;
   private int[] P00482_A14326CP_CLICOD ;
   private String[] P00482_A14327CP_CLINOM ;
   private int[] P00482_A14301CP_BARCOD ;
   private byte[] P00482_A14302CP_BARCODR ;
   private String[] P00482_A14303CP_BARCODP ;
   private java.util.Date[] P00482_A14304CP_BARFECF ;
   private int[] P00482_A14305CP_BARNUMC ;
   private String[] P00482_A14306CP_BARPLF ;
   private byte[] P00482_A14307CP_BARSIT ;
   private String[] P00482_A14311CP_BARSER ;
   private String[] P00482_A14312CP_BARSERD ;
   private String[] P00482_A14331CP_BARCOLO ;
   private int[] P00482_A14332CP_BARCOLU ;
   private String[] P00482_A14315CP_BARNOMC ;
   private short[] P00482_A14316CP_BARTIPA ;
   private String[] P00482_A14343CP_TARTDSC ;
   private String[] P00482_A14317CP_BARGIRA ;
   private short[] P00482_A14318CP_BARACAA ;
   private String[] P00482_A14319CP_BARAGRE ;
   private byte[] P00482_A14320CP_BAREXT ;
   private String[] P00482_A14321CP_DISDES ;
   private int[] P00482_A14322CP_DISCOD ;
   private String[] P00482_A14323CP_BARPROP ;
   private String[] P00482_A14334CP_DSC_BAR ;
   private java.math.BigDecimal[] P00482_A14336CP_BARKGM ;
   private java.math.BigDecimal[] P00482_A14337CP_BARMTR ;
   private int[] P00482_A14338CP_BARPIE ;
   private java.math.BigDecimal[] P00482_A14339CP_BARALBK ;
   private java.math.BigDecimal[] P00482_A14340CP_BARALBM ;
   private String[] P00482_A14341CP_DISUSRC ;
   private GXBaseCollection<app.SdtSDTCONPRO_Registro> Gxm2rootcol ;
   private app.SdtSDTCONPRO_Registro Gxm1sdtconpro ;
}

final  class dpconpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00482", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_DISUSRC FROM TXPCONPRO ORDER BY CP_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 8);
               ((String[]) buf[25])[0] = rslt.getVarchar(26);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,2);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[31])[0] = rslt.getString(32, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

