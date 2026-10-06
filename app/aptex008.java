package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptex008 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptex008 pgm = new aptex008 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptex008( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptex008.class ), "" );
   }

   public aptex008( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV58EmprNom ;
      GXv_char3[0] = AV60UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptex008.this.A396EmprCod = GXv_char1[0] ;
      aptex008.this.AV58EmprNom = GXv_char2[0] ;
      aptex008.this.AV60UsurCod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Actualizo datos ACABADOS en HDR,s", "") );
      /* Using cursor P02QV2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02QV2_A252CliCod[0] ;
         n252CliCod = P02QV2_n252CliCod[0] ;
         A212BarSer = P02QV2_A212BarSer[0] ;
         A1226BarGraCru = P02QV2_A1226BarGraCru[0] ;
         A3138BarGraCru2 = P02QV2_A3138BarGraCru2[0] ;
         A125BarAncAca1 = P02QV2_A125BarAncAca1[0] ;
         A126BarAncAca2 = P02QV2_A126BarAncAca2[0] ;
         A1909BarGraAca = P02QV2_A1909BarGraAca[0] ;
         A3137BarGraAca2 = P02QV2_A3137BarGraAca2[0] ;
         A130BarCodPar = P02QV2_A130BarCodPar[0] ;
         A132BarCodReo = P02QV2_A132BarCodReo[0] ;
         A129BarCod = P02QV2_A129BarCod[0] ;
         A396EmprCod = P02QV2_A396EmprCod[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_char1[0] = AV19DisArtDsc ;
         GXv_char5[0] = AV22DisArtMat ;
         GXv_char6[0] = AV48DisPle2 ;
         GXv_char7[0] = AV21DisArtLar ;
         GXv_char8[0] = AV32DisArtSua ;
         GXv_char9[0] = AV14DisArtAca ;
         GXv_char10[0] = AV24DisArtPle ;
         GXv_int11[0] = AV33DisArtTip ;
         GXv_char12[0] = AV20DisArtEnc ;
         GXv_char13[0] = AV18DisArtCor ;
         GXv_char14[0] = AV34DisArtTr1 ;
         GXv_char15[0] = AV35DisArtTr2 ;
         GXv_char16[0] = AV36DisArtTr3 ;
         GXv_int17[0] = AV25DisArtPt1 ;
         GXv_int18[0] = AV26DisArtPt2 ;
         GXv_int19[0] = AV27DisArtPt3 ;
         GXv_decimal20[0] = AV31DisArtRdt ;
         GXv_int21[0] = AV40DisArtUrg ;
         GXv_char22[0] = AV37DisArtUr1 ;
         GXv_char23[0] = AV38DisArtUr2 ;
         GXv_char24[0] = AV39DisArtUr3 ;
         GXv_int25[0] = AV28DisArtPu1 ;
         GXv_int26[0] = AV29DisArtPu2 ;
         GXv_int27[0] = AV30DisArtPu3 ;
         GXv_int28[0] = AV23DisArtPes ;
         GXv_int29[0] = AV45DisGraCru ;
         GXv_int30[0] = AV17DisArtAnh ;
         GXv_int31[0] = AV16DisArtAn1 ;
         GXv_int32[0] = AV15DisArtAcb ;
         GXv_int33[0] = AV13DisArtAc2 ;
         GXv_int34[0] = AV42DisEncCom ;
         GXv_int35[0] = AV41DisEncAnh ;
         GXv_int36[0] = AV47DisNumCor ;
         GXv_int37[0] = AV10DisAncSal1 ;
         GXv_int38[0] = AV11DisAncSal2 ;
         GXv_int39[0] = AV12DisAncSal3 ;
         GXv_int40[0] = AV44DisGraAca2 ;
         GXv_int41[0] = AV46DisGraCru2 ;
         GXv_int42[0] = AV43DisGraAca ;
         GXv_decimal43[0] = AV49DisRdoA ;
         GXv_decimal44[0] = AV50DisRdoN ;
         GXv_char45[0] = " " ;
         GXv_char46[0] = " " ;
         GXv_int47[0] = AV51Flag ;
         new app.partdis(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char1, GXv_char5, GXv_char6, GXv_char7, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_int17, GXv_int18, GXv_int19, GXv_decimal20, GXv_int21, GXv_char22, GXv_char23, GXv_char24, GXv_int25, GXv_int26, GXv_int27, GXv_int28, GXv_int29, GXv_int30, GXv_int31, GXv_int32, GXv_int33, GXv_int34, GXv_int35, GXv_int36, GXv_int37, GXv_int38, GXv_int39, GXv_int40, GXv_int41, GXv_int42, GXv_decimal43, GXv_decimal44, GXv_char45, GXv_char46, GXv_int47) ;
         aptex008.this.A396EmprCod = GXv_char3[0] ;
         aptex008.this.A252CliCod = GXv_int4[0] ;
         aptex008.this.A212BarSer = GXv_char2[0] ;
         aptex008.this.AV19DisArtDsc = GXv_char1[0] ;
         aptex008.this.AV22DisArtMat = GXv_char5[0] ;
         aptex008.this.AV48DisPle2 = GXv_char6[0] ;
         aptex008.this.AV21DisArtLar = GXv_char7[0] ;
         aptex008.this.AV32DisArtSua = GXv_char8[0] ;
         aptex008.this.AV14DisArtAca = GXv_char9[0] ;
         aptex008.this.AV24DisArtPle = GXv_char10[0] ;
         aptex008.this.AV33DisArtTip = GXv_int11[0] ;
         aptex008.this.AV20DisArtEnc = GXv_char12[0] ;
         aptex008.this.AV18DisArtCor = GXv_char13[0] ;
         aptex008.this.AV34DisArtTr1 = GXv_char14[0] ;
         aptex008.this.AV35DisArtTr2 = GXv_char15[0] ;
         aptex008.this.AV36DisArtTr3 = GXv_char16[0] ;
         aptex008.this.AV25DisArtPt1 = GXv_int17[0] ;
         aptex008.this.AV26DisArtPt2 = GXv_int18[0] ;
         aptex008.this.AV27DisArtPt3 = GXv_int19[0] ;
         aptex008.this.AV31DisArtRdt = GXv_decimal20[0] ;
         aptex008.this.AV40DisArtUrg = GXv_int21[0] ;
         aptex008.this.AV37DisArtUr1 = GXv_char22[0] ;
         aptex008.this.AV38DisArtUr2 = GXv_char23[0] ;
         aptex008.this.AV39DisArtUr3 = GXv_char24[0] ;
         aptex008.this.AV28DisArtPu1 = GXv_int25[0] ;
         aptex008.this.AV29DisArtPu2 = GXv_int26[0] ;
         aptex008.this.AV30DisArtPu3 = GXv_int27[0] ;
         aptex008.this.AV23DisArtPes = GXv_int28[0] ;
         aptex008.this.AV45DisGraCru = GXv_int29[0] ;
         aptex008.this.AV17DisArtAnh = GXv_int30[0] ;
         aptex008.this.AV16DisArtAn1 = GXv_int31[0] ;
         aptex008.this.AV15DisArtAcb = GXv_int32[0] ;
         aptex008.this.AV13DisArtAc2 = GXv_int33[0] ;
         aptex008.this.AV42DisEncCom = GXv_int34[0] ;
         aptex008.this.AV41DisEncAnh = GXv_int35[0] ;
         aptex008.this.AV47DisNumCor = GXv_int36[0] ;
         aptex008.this.AV10DisAncSal1 = GXv_int37[0] ;
         aptex008.this.AV11DisAncSal2 = GXv_int38[0] ;
         aptex008.this.AV12DisAncSal3 = GXv_int39[0] ;
         aptex008.this.AV44DisGraAca2 = GXv_int40[0] ;
         aptex008.this.AV46DisGraCru2 = GXv_int41[0] ;
         aptex008.this.AV43DisGraAca = GXv_int42[0] ;
         aptex008.this.AV49DisRdoA = GXv_decimal43[0] ;
         aptex008.this.AV50DisRdoN = GXv_decimal44[0] ;
         aptex008.this.AV51Flag = GXv_int47[0] ;
         A1226BarGraCru = AV45DisGraCru ;
         A3138BarGraCru2 = AV46DisGraCru2 ;
         A125BarAncAca1 = AV17DisArtAnh ;
         A126BarAncAca2 = AV16DisArtAn1 ;
         A1909BarGraAca = AV43DisGraAca ;
         A3137BarGraAca2 = AV44DisGraAca2 ;
         /* Using cursor P02QV3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A1226BarGraCru), Short.valueOf(A3138BarGraCru2), Short.valueOf(A125BarAncAca1), Short.valueOf(A126BarAncAca2), Short.valueOf(A1909BarGraAca), Short.valueOf(A3137BarGraAca2), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Actualizo datos ACABADOS en HDR,s", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptex008.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptex008");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV59Station = "" ;
      A396EmprCod = "" ;
      AV58EmprNom = "" ;
      AV60UsurCod = "" ;
      scmdbuf = "" ;
      P02QV2_A252CliCod = new int[1] ;
      P02QV2_n252CliCod = new boolean[] {false} ;
      P02QV2_A212BarSer = new String[] {""} ;
      P02QV2_A1226BarGraCru = new short[1] ;
      P02QV2_A3138BarGraCru2 = new short[1] ;
      P02QV2_A125BarAncAca1 = new short[1] ;
      P02QV2_A126BarAncAca2 = new short[1] ;
      P02QV2_A1909BarGraAca = new short[1] ;
      P02QV2_A3137BarGraAca2 = new short[1] ;
      P02QV2_A130BarCodPar = new String[] {""} ;
      P02QV2_A132BarCodReo = new byte[1] ;
      P02QV2_A129BarCod = new int[1] ;
      P02QV2_A396EmprCod = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      AV19DisArtDsc = "" ;
      GXv_char1 = new String[1] ;
      AV22DisArtMat = "" ;
      GXv_char5 = new String[1] ;
      AV48DisPle2 = "" ;
      GXv_char6 = new String[1] ;
      AV21DisArtLar = "" ;
      GXv_char7 = new String[1] ;
      AV32DisArtSua = "" ;
      GXv_char8 = new String[1] ;
      AV14DisArtAca = "" ;
      GXv_char9 = new String[1] ;
      AV24DisArtPle = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      AV20DisArtEnc = "" ;
      GXv_char12 = new String[1] ;
      AV18DisArtCor = "" ;
      GXv_char13 = new String[1] ;
      AV34DisArtTr1 = "" ;
      GXv_char14 = new String[1] ;
      AV35DisArtTr2 = "" ;
      GXv_char15 = new String[1] ;
      AV36DisArtTr3 = "" ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      AV31DisArtRdt = DecimalUtil.ZERO ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int21 = new byte[1] ;
      AV37DisArtUr1 = "" ;
      GXv_char22 = new String[1] ;
      AV38DisArtUr2 = "" ;
      GXv_char23 = new String[1] ;
      AV39DisArtUr3 = "" ;
      GXv_char24 = new String[1] ;
      GXv_int25 = new short[1] ;
      GXv_int26 = new short[1] ;
      GXv_int27 = new short[1] ;
      GXv_int28 = new short[1] ;
      GXv_int29 = new short[1] ;
      GXv_int30 = new short[1] ;
      GXv_int31 = new short[1] ;
      GXv_int32 = new short[1] ;
      GXv_int33 = new short[1] ;
      GXv_int34 = new short[1] ;
      GXv_int35 = new short[1] ;
      GXv_int36 = new short[1] ;
      GXv_int37 = new short[1] ;
      GXv_int38 = new short[1] ;
      GXv_int39 = new short[1] ;
      GXv_int40 = new short[1] ;
      GXv_int41 = new short[1] ;
      GXv_int42 = new short[1] ;
      AV49DisRdoA = DecimalUtil.ZERO ;
      GXv_decimal43 = new java.math.BigDecimal[1] ;
      AV50DisRdoN = DecimalUtil.ZERO ;
      GXv_decimal44 = new java.math.BigDecimal[1] ;
      GXv_char45 = new String[1] ;
      GXv_char46 = new String[1] ;
      GXv_int47 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptex008__default(),
         new Object[] {
             new Object[] {
            P02QV2_A252CliCod, P02QV2_n252CliCod, P02QV2_A212BarSer, P02QV2_A1226BarGraCru, P02QV2_A3138BarGraCru2, P02QV2_A125BarAncAca1, P02QV2_A126BarAncAca2, P02QV2_A1909BarGraAca, P02QV2_A3137BarGraAca2, P02QV2_A130BarCodPar,
            P02QV2_A132BarCodReo, P02QV2_A129BarCod, P02QV2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV40DisArtUrg ;
   private byte GXv_int21[] ;
   private byte AV51Flag ;
   private byte GXv_int47[] ;
   private short A1226BarGraCru ;
   private short A3138BarGraCru2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short AV33DisArtTip ;
   private short GXv_int11[] ;
   private short AV25DisArtPt1 ;
   private short GXv_int17[] ;
   private short AV26DisArtPt2 ;
   private short GXv_int18[] ;
   private short AV27DisArtPt3 ;
   private short GXv_int19[] ;
   private short AV28DisArtPu1 ;
   private short GXv_int25[] ;
   private short AV29DisArtPu2 ;
   private short GXv_int26[] ;
   private short AV30DisArtPu3 ;
   private short GXv_int27[] ;
   private short AV23DisArtPes ;
   private short GXv_int28[] ;
   private short AV45DisGraCru ;
   private short GXv_int29[] ;
   private short AV17DisArtAnh ;
   private short GXv_int30[] ;
   private short AV16DisArtAn1 ;
   private short GXv_int31[] ;
   private short AV15DisArtAcb ;
   private short GXv_int32[] ;
   private short AV13DisArtAc2 ;
   private short GXv_int33[] ;
   private short AV42DisEncCom ;
   private short GXv_int34[] ;
   private short AV41DisEncAnh ;
   private short GXv_int35[] ;
   private short AV47DisNumCor ;
   private short GXv_int36[] ;
   private short AV10DisAncSal1 ;
   private short GXv_int37[] ;
   private short AV11DisAncSal2 ;
   private short GXv_int38[] ;
   private short AV12DisAncSal3 ;
   private short GXv_int39[] ;
   private short AV44DisGraAca2 ;
   private short GXv_int40[] ;
   private short AV46DisGraCru2 ;
   private short GXv_int41[] ;
   private short AV43DisGraAca ;
   private short GXv_int42[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV31DisArtRdt ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal AV49DisRdoA ;
   private java.math.BigDecimal GXv_decimal43[] ;
   private java.math.BigDecimal AV50DisRdoN ;
   private java.math.BigDecimal GXv_decimal44[] ;
   private String AV59Station ;
   private String A396EmprCod ;
   private String AV58EmprNom ;
   private String AV60UsurCod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV19DisArtDsc ;
   private String GXv_char1[] ;
   private String AV22DisArtMat ;
   private String GXv_char5[] ;
   private String AV48DisPle2 ;
   private String GXv_char6[] ;
   private String AV21DisArtLar ;
   private String GXv_char7[] ;
   private String AV32DisArtSua ;
   private String GXv_char8[] ;
   private String AV14DisArtAca ;
   private String GXv_char9[] ;
   private String AV24DisArtPle ;
   private String GXv_char10[] ;
   private String AV20DisArtEnc ;
   private String GXv_char12[] ;
   private String AV18DisArtCor ;
   private String GXv_char13[] ;
   private String AV34DisArtTr1 ;
   private String GXv_char14[] ;
   private String AV35DisArtTr2 ;
   private String GXv_char15[] ;
   private String AV36DisArtTr3 ;
   private String GXv_char16[] ;
   private String AV37DisArtUr1 ;
   private String GXv_char22[] ;
   private String AV38DisArtUr2 ;
   private String GXv_char23[] ;
   private String AV39DisArtUr3 ;
   private String GXv_char24[] ;
   private String GXv_char45[] ;
   private String GXv_char46[] ;
   private boolean n252CliCod ;
   private IDataStoreProvider pr_default ;
   private int[] P02QV2_A252CliCod ;
   private boolean[] P02QV2_n252CliCod ;
   private String[] P02QV2_A212BarSer ;
   private short[] P02QV2_A1226BarGraCru ;
   private short[] P02QV2_A3138BarGraCru2 ;
   private short[] P02QV2_A125BarAncAca1 ;
   private short[] P02QV2_A126BarAncAca2 ;
   private short[] P02QV2_A1909BarGraAca ;
   private short[] P02QV2_A3137BarGraAca2 ;
   private String[] P02QV2_A130BarCodPar ;
   private byte[] P02QV2_A132BarCodReo ;
   private int[] P02QV2_A129BarCod ;
   private String[] P02QV2_A396EmprCod ;
}

final  class aptex008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QV2", "SELECT CliCod, BarSer, BarGraCru, BarGraCru2, BarAncAca1, BarAncAca2, BarGraAca, BarGraAca2, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02QV3", "UPDATE TXPBARCAD SET BarGraCru=?, BarGraCru2=?, BarAncAca1=?, BarAncAca2=?, BarGraAca=?, BarGraAca2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
      }
   }

}

