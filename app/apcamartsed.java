package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apcamartsed extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apcamartsed pgm = new apcamartsed (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      String[] aP2 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public apcamartsed( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apcamartsed.class ), "" );
   }

   public apcamartsed( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      apcamartsed.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      apcamartsed.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apcamartsed.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      apcamartsed.this.AV76DisArtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02F72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A335DisArtCod = P02F72_A335DisArtCod[0] ;
         A343DisArtPle = P02F72_A343DisArtPle[0] ;
         A359DisArtUrg = P02F72_A359DisArtUrg[0] ;
         A340DisArtMat = P02F72_A340DisArtMat[0] ;
         A352DisArtTip = P02F72_A352DisArtTip[0] ;
         A337DisArtDsc = P02F72_A337DisArtDsc[0] ;
         A342DisArtPes = P02F72_A342DisArtPes[0] ;
         A334DisArtAnh = P02F72_A334DisArtAnh[0] ;
         A1231DisArtAn1 = P02F72_A1231DisArtAn1[0] ;
         A1232DisArtAcb = P02F72_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = P02F72_A1233DisArtAc2[0] ;
         A350DisArtRdt = P02F72_A350DisArtRdt[0] ;
         A339DisArtLar = P02F72_A339DisArtLar[0] ;
         A336DisArtCor = P02F72_A336DisArtCor[0] ;
         A338DisArtEnc = P02F72_A338DisArtEnc[0] ;
         A351DisArtSua = P02F72_A351DisArtSua[0] ;
         A333DisArtAca = P02F72_A333DisArtAca[0] ;
         A353DisArtTr1 = P02F72_A353DisArtTr1[0] ;
         A354DisArtTr2 = P02F72_A354DisArtTr2[0] ;
         A355DisArtTr3 = P02F72_A355DisArtTr3[0] ;
         A344DisArtPt1 = P02F72_A344DisArtPt1[0] ;
         A345DisArtPt2 = P02F72_A345DisArtPt2[0] ;
         A346DisArtPt3 = P02F72_A346DisArtPt3[0] ;
         A356DisArtUr1 = P02F72_A356DisArtUr1[0] ;
         A357DisArtUr2 = P02F72_A357DisArtUr2[0] ;
         A358DisArtUr3 = P02F72_A358DisArtUr3[0] ;
         A347DisArtPu1 = P02F72_A347DisArtPu1[0] ;
         A348DisArtPu2 = P02F72_A348DisArtPu2[0] ;
         A349DisArtPu3 = P02F72_A349DisArtPu3[0] ;
         n349DisArtPu3 = P02F72_n349DisArtPu3[0] ;
         A1225DisGraCru = P02F72_A1225DisGraCru[0] ;
         A1197DisEncCom = P02F72_A1197DisEncCom[0] ;
         A1198DisEncAnh = P02F72_A1198DisEncAnh[0] ;
         A2835DisPle2 = P02F72_A2835DisPle2[0] ;
         A3128DisAncSal1 = P02F72_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = P02F72_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = P02F72_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = P02F72_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = P02F72_A3132DisGraCru2[0] ;
         A3127DisNumCor = P02F72_A3127DisNumCor[0] ;
         A1906DisGraAca = P02F72_A1906DisGraAca[0] ;
         A1908DisRdoA = P02F72_A1908DisRdoA[0] ;
         A1907DisRdoN = P02F72_A1907DisRdoN[0] ;
         A335DisArtCod = AV76DisArtCod ;
         AV42DisArtPle = A343DisArtPle ;
         AV58DisArtUrg = A359DisArtUrg ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = 340 ;
         GXv_char3[0] = AV76DisArtCod ;
         GXv_char4[0] = AV37DisArtDsc ;
         GXv_char5[0] = AV40DisArtMat ;
         GXv_char6[0] = AV65DisPle2 ;
         GXv_char7[0] = AV39DisArtLar ;
         GXv_char8[0] = AV50DisArtSua ;
         GXv_char9[0] = AV32DisArtAca ;
         GXv_char10[0] = "" ;
         GXv_int11[0] = AV51DisArtTip ;
         GXv_char12[0] = AV38DisArtEnc ;
         GXv_char13[0] = AV36DisArtCor ;
         GXv_char14[0] = AV52DisArtTr1 ;
         GXv_char15[0] = AV53DisArtTr2 ;
         GXv_char16[0] = AV54DisArtTr3 ;
         GXv_int17[0] = AV43DisArtPt1 ;
         GXv_int18[0] = AV44DisArtPt2 ;
         GXv_int19[0] = AV45DisArtPt3 ;
         GXv_decimal20[0] = AV49DisArtRdt ;
         GXv_int21[0] = (byte)(0) ;
         GXv_char22[0] = AV55DisArtUr1 ;
         GXv_char23[0] = AV56DisArtUr2 ;
         GXv_char24[0] = AV57DisArtUr3 ;
         GXv_int25[0] = AV46DisArtPu1 ;
         GXv_int26[0] = AV47DisArtPu2 ;
         GXv_int27[0] = AV48DisArtPu3 ;
         GXv_int28[0] = AV41DisArtPes ;
         GXv_int29[0] = AV63DisGraCru ;
         GXv_int30[0] = AV35DisArtAnh ;
         GXv_int31[0] = AV34DisArtAn1 ;
         GXv_int32[0] = AV33DisArtAcb ;
         GXv_int33[0] = AV31DisArtAc2 ;
         GXv_int34[0] = AV60DisEncCom ;
         GXv_int35[0] = AV59DisEncAnh ;
         GXv_int36[0] = AV19DisNumCor ;
         GXv_int37[0] = AV28DisAncSal1 ;
         GXv_int38[0] = AV29DisAncSal2 ;
         GXv_int39[0] = AV30DisAncSal3 ;
         GXv_int40[0] = AV62DisGraAca2 ;
         GXv_int41[0] = AV64DisGraCru2 ;
         GXv_int42[0] = AV61DisGraAca ;
         GXv_decimal43[0] = AV66DisRdoA ;
         GXv_decimal44[0] = AV67DisRdoN ;
         GXv_char45[0] = " " ;
         GXv_char46[0] = " " ;
         GXv_int47[0] = AV80Flag ;
         new app.partdis(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_int17, GXv_int18, GXv_int19, GXv_decimal20, GXv_int21, GXv_char22, GXv_char23, GXv_char24, GXv_int25, GXv_int26, GXv_int27, GXv_int28, GXv_int29, GXv_int30, GXv_int31, GXv_int32, GXv_int33, GXv_int34, GXv_int35, GXv_int36, GXv_int37, GXv_int38, GXv_int39, GXv_int40, GXv_int41, GXv_int42, GXv_decimal43, GXv_decimal44, GXv_char45, GXv_char46, GXv_int47) ;
         apcamartsed.this.A396EmprCod = GXv_char1[0] ;
         apcamartsed.this.AV76DisArtCod = GXv_char3[0] ;
         apcamartsed.this.AV37DisArtDsc = GXv_char4[0] ;
         apcamartsed.this.AV40DisArtMat = GXv_char5[0] ;
         apcamartsed.this.AV65DisPle2 = GXv_char6[0] ;
         apcamartsed.this.AV39DisArtLar = GXv_char7[0] ;
         apcamartsed.this.AV50DisArtSua = GXv_char8[0] ;
         apcamartsed.this.AV32DisArtAca = GXv_char9[0] ;
         apcamartsed.this.AV51DisArtTip = GXv_int11[0] ;
         apcamartsed.this.AV38DisArtEnc = GXv_char12[0] ;
         apcamartsed.this.AV36DisArtCor = GXv_char13[0] ;
         apcamartsed.this.AV52DisArtTr1 = GXv_char14[0] ;
         apcamartsed.this.AV53DisArtTr2 = GXv_char15[0] ;
         apcamartsed.this.AV54DisArtTr3 = GXv_char16[0] ;
         apcamartsed.this.AV43DisArtPt1 = GXv_int17[0] ;
         apcamartsed.this.AV44DisArtPt2 = GXv_int18[0] ;
         apcamartsed.this.AV45DisArtPt3 = GXv_int19[0] ;
         apcamartsed.this.AV49DisArtRdt = GXv_decimal20[0] ;
         apcamartsed.this.AV55DisArtUr1 = GXv_char22[0] ;
         apcamartsed.this.AV56DisArtUr2 = GXv_char23[0] ;
         apcamartsed.this.AV57DisArtUr3 = GXv_char24[0] ;
         apcamartsed.this.AV46DisArtPu1 = GXv_int25[0] ;
         apcamartsed.this.AV47DisArtPu2 = GXv_int26[0] ;
         apcamartsed.this.AV48DisArtPu3 = GXv_int27[0] ;
         apcamartsed.this.AV41DisArtPes = GXv_int28[0] ;
         apcamartsed.this.AV63DisGraCru = GXv_int29[0] ;
         apcamartsed.this.AV35DisArtAnh = GXv_int30[0] ;
         apcamartsed.this.AV34DisArtAn1 = GXv_int31[0] ;
         apcamartsed.this.AV33DisArtAcb = GXv_int32[0] ;
         apcamartsed.this.AV31DisArtAc2 = GXv_int33[0] ;
         apcamartsed.this.AV60DisEncCom = GXv_int34[0] ;
         apcamartsed.this.AV59DisEncAnh = GXv_int35[0] ;
         apcamartsed.this.AV19DisNumCor = GXv_int36[0] ;
         apcamartsed.this.AV28DisAncSal1 = GXv_int37[0] ;
         apcamartsed.this.AV29DisAncSal2 = GXv_int38[0] ;
         apcamartsed.this.AV30DisAncSal3 = GXv_int39[0] ;
         apcamartsed.this.AV62DisGraAca2 = GXv_int40[0] ;
         apcamartsed.this.AV64DisGraCru2 = GXv_int41[0] ;
         apcamartsed.this.AV61DisGraAca = GXv_int42[0] ;
         apcamartsed.this.AV66DisRdoA = GXv_decimal43[0] ;
         apcamartsed.this.AV67DisRdoN = GXv_decimal44[0] ;
         apcamartsed.this.AV80Flag = GXv_int47[0] ;
         A340DisArtMat = AV40DisArtMat ;
         A352DisArtTip = AV51DisArtTip ;
         A337DisArtDsc = AV37DisArtDsc ;
         A342DisArtPes = AV41DisArtPes ;
         A334DisArtAnh = AV35DisArtAnh ;
         A1231DisArtAn1 = AV34DisArtAn1 ;
         A1232DisArtAcb = AV33DisArtAcb ;
         A1233DisArtAc2 = AV31DisArtAc2 ;
         A350DisArtRdt = AV49DisArtRdt ;
         A343DisArtPle = AV42DisArtPle ;
         A339DisArtLar = AV39DisArtLar ;
         A336DisArtCor = AV36DisArtCor ;
         A338DisArtEnc = AV38DisArtEnc ;
         A351DisArtSua = AV50DisArtSua ;
         A333DisArtAca = AV32DisArtAca ;
         A359DisArtUrg = AV58DisArtUrg ;
         A353DisArtTr1 = AV52DisArtTr1 ;
         A354DisArtTr2 = AV53DisArtTr2 ;
         A355DisArtTr3 = AV54DisArtTr3 ;
         A344DisArtPt1 = AV43DisArtPt1 ;
         A345DisArtPt2 = AV44DisArtPt2 ;
         A346DisArtPt3 = AV45DisArtPt3 ;
         A356DisArtUr1 = AV55DisArtUr1 ;
         A357DisArtUr2 = AV56DisArtUr2 ;
         A358DisArtUr3 = AV57DisArtUr3 ;
         A347DisArtPu1 = AV46DisArtPu1 ;
         A348DisArtPu2 = AV47DisArtPu2 ;
         A349DisArtPu3 = AV48DisArtPu3 ;
         n349DisArtPu3 = false ;
         A1225DisGraCru = AV63DisGraCru ;
         A1197DisEncCom = DecimalUtil.doubleToDec(AV60DisEncCom) ;
         A1198DisEncAnh = DecimalUtil.doubleToDec(AV59DisEncAnh) ;
         A2835DisPle2 = AV65DisPle2 ;
         A3128DisAncSal1 = AV28DisAncSal1 ;
         A3129DisAncSal2 = AV29DisAncSal2 ;
         A3130DisAncSal3 = AV30DisAncSal3 ;
         A3131DisGraAca2 = AV62DisGraAca2 ;
         A3132DisGraCru2 = AV64DisGraCru2 ;
         A3127DisNumCor = AV19DisNumCor ;
         A1906DisGraAca = AV61DisGraAca ;
         A1908DisRdoA = AV66DisRdoA ;
         A1907DisRdoN = AV67DisRdoN ;
         /* Using cursor P02F73 */
         pr_default.execute(1, new Object[] {A335DisArtCod, A343DisArtPle, Byte.valueOf(A359DisArtUrg), A340DisArtMat, Short.valueOf(A352DisArtTip), A337DisArtDsc, Short.valueOf(A342DisArtPes), Short.valueOf(A334DisArtAnh), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A350DisArtRdt, A339DisArtLar, A336DisArtCor, A338DisArtEnc, A351DisArtSua, A333DisArtAca, A353DisArtTr1, A354DisArtTr2, A355DisArtTr3, Short.valueOf(A344DisArtPt1), Short.valueOf(A345DisArtPt2), Short.valueOf(A346DisArtPt3), A356DisArtUr1, A357DisArtUr2, A358DisArtUr3, Short.valueOf(A347DisArtPu1), Short.valueOf(A348DisArtPu2), Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A1225DisGraCru), A1197DisEncCom, A1198DisEncAnh, A2835DisPle2, Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), Short.valueOf(A3127DisNumCor), Short.valueOf(A1906DisGraAca), A1908DisRdoA, A1907DisRdoN, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char46[0] = A396EmprCod ;
      GXv_int2[0] = A361DisCod ;
      new app.pbusobs(remoteHandle, context).execute( GXv_char46, GXv_int2) ;
      apcamartsed.this.A396EmprCod = GXv_char46[0] ;
      apcamartsed.this.A361DisCod = GXv_int2[0] ;
      GXv_char46[0] = A396EmprCod ;
      GXv_int2[0] = A361DisCod ;
      GXv_char45[0] = AV76DisArtCod ;
      GXv_int48[0] = 340 ;
      new app.pbuspro(remoteHandle, context).execute( GXv_char46, GXv_int2, GXv_char45, GXv_int48) ;
      apcamartsed.this.A396EmprCod = GXv_char46[0] ;
      apcamartsed.this.A361DisCod = GXv_int2[0] ;
      apcamartsed.this.AV76DisArtCod = GXv_char45[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pcamartsed.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apcamartsed.this.A396EmprCod;
      this.aP1[0] = apcamartsed.this.A361DisCod;
      this.aP2[0] = apcamartsed.this.AV76DisArtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apcamartsed");
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
      P02F72_A396EmprCod = new String[] {""} ;
      P02F72_A361DisCod = new int[1] ;
      P02F72_A335DisArtCod = new String[] {""} ;
      P02F72_A343DisArtPle = new String[] {""} ;
      P02F72_A359DisArtUrg = new byte[1] ;
      P02F72_A340DisArtMat = new String[] {""} ;
      P02F72_A352DisArtTip = new short[1] ;
      P02F72_A337DisArtDsc = new String[] {""} ;
      P02F72_A342DisArtPes = new short[1] ;
      P02F72_A334DisArtAnh = new short[1] ;
      P02F72_A1231DisArtAn1 = new short[1] ;
      P02F72_A1232DisArtAcb = new short[1] ;
      P02F72_A1233DisArtAc2 = new short[1] ;
      P02F72_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F72_A339DisArtLar = new String[] {""} ;
      P02F72_A336DisArtCor = new String[] {""} ;
      P02F72_A338DisArtEnc = new String[] {""} ;
      P02F72_A351DisArtSua = new String[] {""} ;
      P02F72_A333DisArtAca = new String[] {""} ;
      P02F72_A353DisArtTr1 = new String[] {""} ;
      P02F72_A354DisArtTr2 = new String[] {""} ;
      P02F72_A355DisArtTr3 = new String[] {""} ;
      P02F72_A344DisArtPt1 = new short[1] ;
      P02F72_A345DisArtPt2 = new short[1] ;
      P02F72_A346DisArtPt3 = new short[1] ;
      P02F72_A356DisArtUr1 = new String[] {""} ;
      P02F72_A357DisArtUr2 = new String[] {""} ;
      P02F72_A358DisArtUr3 = new String[] {""} ;
      P02F72_A347DisArtPu1 = new short[1] ;
      P02F72_A348DisArtPu2 = new short[1] ;
      P02F72_A349DisArtPu3 = new short[1] ;
      P02F72_n349DisArtPu3 = new boolean[] {false} ;
      P02F72_A1225DisGraCru = new short[1] ;
      P02F72_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F72_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F72_A2835DisPle2 = new String[] {""} ;
      P02F72_A3128DisAncSal1 = new short[1] ;
      P02F72_A3129DisAncSal2 = new short[1] ;
      P02F72_A3130DisAncSal3 = new short[1] ;
      P02F72_A3131DisGraAca2 = new short[1] ;
      P02F72_A3132DisGraCru2 = new short[1] ;
      P02F72_A3127DisNumCor = new short[1] ;
      P02F72_A1906DisGraAca = new short[1] ;
      P02F72_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F72_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A335DisArtCod = "" ;
      A343DisArtPle = "" ;
      A340DisArtMat = "" ;
      A337DisArtDsc = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A339DisArtLar = "" ;
      A336DisArtCor = "" ;
      A338DisArtEnc = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A2835DisPle2 = "" ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      AV42DisArtPle = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV37DisArtDsc = "" ;
      GXv_char4 = new String[1] ;
      AV40DisArtMat = "" ;
      GXv_char5 = new String[1] ;
      AV65DisPle2 = "" ;
      GXv_char6 = new String[1] ;
      AV39DisArtLar = "" ;
      GXv_char7 = new String[1] ;
      AV50DisArtSua = "" ;
      GXv_char8 = new String[1] ;
      AV32DisArtAca = "" ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      AV38DisArtEnc = "" ;
      GXv_char12 = new String[1] ;
      AV36DisArtCor = "" ;
      GXv_char13 = new String[1] ;
      AV52DisArtTr1 = "" ;
      GXv_char14 = new String[1] ;
      AV53DisArtTr2 = "" ;
      GXv_char15 = new String[1] ;
      AV54DisArtTr3 = "" ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      AV49DisArtRdt = DecimalUtil.ZERO ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int21 = new byte[1] ;
      AV55DisArtUr1 = "" ;
      GXv_char22 = new String[1] ;
      AV56DisArtUr2 = "" ;
      GXv_char23 = new String[1] ;
      AV57DisArtUr3 = "" ;
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
      AV66DisRdoA = DecimalUtil.ZERO ;
      GXv_decimal43 = new java.math.BigDecimal[1] ;
      AV67DisRdoN = DecimalUtil.ZERO ;
      GXv_decimal44 = new java.math.BigDecimal[1] ;
      GXv_int47 = new byte[1] ;
      GXv_char46 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char45 = new String[1] ;
      GXv_int48 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apcamartsed__default(),
         new Object[] {
             new Object[] {
            P02F72_A396EmprCod, P02F72_A361DisCod, P02F72_A335DisArtCod, P02F72_A343DisArtPle, P02F72_A359DisArtUrg, P02F72_A340DisArtMat, P02F72_A352DisArtTip, P02F72_A337DisArtDsc, P02F72_A342DisArtPes, P02F72_A334DisArtAnh,
            P02F72_A1231DisArtAn1, P02F72_A1232DisArtAcb, P02F72_A1233DisArtAc2, P02F72_A350DisArtRdt, P02F72_A339DisArtLar, P02F72_A336DisArtCor, P02F72_A338DisArtEnc, P02F72_A351DisArtSua, P02F72_A333DisArtAca, P02F72_A353DisArtTr1,
            P02F72_A354DisArtTr2, P02F72_A355DisArtTr3, P02F72_A344DisArtPt1, P02F72_A345DisArtPt2, P02F72_A346DisArtPt3, P02F72_A356DisArtUr1, P02F72_A357DisArtUr2, P02F72_A358DisArtUr3, P02F72_A347DisArtPu1, P02F72_A348DisArtPu2,
            P02F72_A349DisArtPu3, P02F72_n349DisArtPu3, P02F72_A1225DisGraCru, P02F72_A1197DisEncCom, P02F72_A1198DisEncAnh, P02F72_A2835DisPle2, P02F72_A3128DisAncSal1, P02F72_A3129DisAncSal2, P02F72_A3130DisAncSal3, P02F72_A3131DisGraAca2,
            P02F72_A3132DisGraCru2, P02F72_A3127DisNumCor, P02F72_A1906DisGraAca, P02F72_A1908DisRdoA, P02F72_A1907DisRdoN
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A359DisArtUrg ;
   private byte AV58DisArtUrg ;
   private byte GXv_int21[] ;
   private byte AV80Flag ;
   private byte GXv_int47[] ;
   private short A352DisArtTip ;
   private short A342DisArtPes ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A1225DisGraCru ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A3127DisNumCor ;
   private short A1906DisGraAca ;
   private short AV51DisArtTip ;
   private short GXv_int11[] ;
   private short AV43DisArtPt1 ;
   private short GXv_int17[] ;
   private short AV44DisArtPt2 ;
   private short GXv_int18[] ;
   private short AV45DisArtPt3 ;
   private short GXv_int19[] ;
   private short AV46DisArtPu1 ;
   private short GXv_int25[] ;
   private short AV47DisArtPu2 ;
   private short GXv_int26[] ;
   private short AV48DisArtPu3 ;
   private short GXv_int27[] ;
   private short AV41DisArtPes ;
   private short GXv_int28[] ;
   private short AV63DisGraCru ;
   private short GXv_int29[] ;
   private short AV35DisArtAnh ;
   private short GXv_int30[] ;
   private short AV34DisArtAn1 ;
   private short GXv_int31[] ;
   private short AV33DisArtAcb ;
   private short GXv_int32[] ;
   private short AV31DisArtAc2 ;
   private short GXv_int33[] ;
   private short AV60DisEncCom ;
   private short GXv_int34[] ;
   private short AV59DisEncAnh ;
   private short GXv_int35[] ;
   private short AV19DisNumCor ;
   private short GXv_int36[] ;
   private short AV28DisAncSal1 ;
   private short GXv_int37[] ;
   private short AV29DisAncSal2 ;
   private short GXv_int38[] ;
   private short AV30DisAncSal3 ;
   private short GXv_int39[] ;
   private short AV62DisGraAca2 ;
   private short GXv_int40[] ;
   private short AV64DisGraCru2 ;
   private short GXv_int41[] ;
   private short AV61DisGraAca ;
   private short GXv_int42[] ;
   private short Gx_err ;
   private int A361DisCod ;
   private int GXv_int2[] ;
   private int GXv_int48[] ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal AV49DisArtRdt ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal AV66DisRdoA ;
   private java.math.BigDecimal GXv_decimal43[] ;
   private java.math.BigDecimal AV67DisRdoN ;
   private java.math.BigDecimal GXv_decimal44[] ;
   private String A396EmprCod ;
   private String AV76DisArtCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A343DisArtPle ;
   private String A340DisArtMat ;
   private String A337DisArtDsc ;
   private String A339DisArtLar ;
   private String A336DisArtCor ;
   private String A338DisArtEnc ;
   private String A351DisArtSua ;
   private String A333DisArtAca ;
   private String A353DisArtTr1 ;
   private String A354DisArtTr2 ;
   private String A355DisArtTr3 ;
   private String A356DisArtUr1 ;
   private String A357DisArtUr2 ;
   private String A358DisArtUr3 ;
   private String A2835DisPle2 ;
   private String AV42DisArtPle ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV37DisArtDsc ;
   private String GXv_char4[] ;
   private String AV40DisArtMat ;
   private String GXv_char5[] ;
   private String AV65DisPle2 ;
   private String GXv_char6[] ;
   private String AV39DisArtLar ;
   private String GXv_char7[] ;
   private String AV50DisArtSua ;
   private String GXv_char8[] ;
   private String AV32DisArtAca ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String AV38DisArtEnc ;
   private String GXv_char12[] ;
   private String AV36DisArtCor ;
   private String GXv_char13[] ;
   private String AV52DisArtTr1 ;
   private String GXv_char14[] ;
   private String AV53DisArtTr2 ;
   private String GXv_char15[] ;
   private String AV54DisArtTr3 ;
   private String GXv_char16[] ;
   private String AV55DisArtUr1 ;
   private String GXv_char22[] ;
   private String AV56DisArtUr2 ;
   private String GXv_char23[] ;
   private String AV57DisArtUr3 ;
   private String GXv_char24[] ;
   private String GXv_char46[] ;
   private String GXv_char45[] ;
   private boolean n349DisArtPu3 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02F72_A396EmprCod ;
   private int[] P02F72_A361DisCod ;
   private String[] P02F72_A335DisArtCod ;
   private String[] P02F72_A343DisArtPle ;
   private byte[] P02F72_A359DisArtUrg ;
   private String[] P02F72_A340DisArtMat ;
   private short[] P02F72_A352DisArtTip ;
   private String[] P02F72_A337DisArtDsc ;
   private short[] P02F72_A342DisArtPes ;
   private short[] P02F72_A334DisArtAnh ;
   private short[] P02F72_A1231DisArtAn1 ;
   private short[] P02F72_A1232DisArtAcb ;
   private short[] P02F72_A1233DisArtAc2 ;
   private java.math.BigDecimal[] P02F72_A350DisArtRdt ;
   private String[] P02F72_A339DisArtLar ;
   private String[] P02F72_A336DisArtCor ;
   private String[] P02F72_A338DisArtEnc ;
   private String[] P02F72_A351DisArtSua ;
   private String[] P02F72_A333DisArtAca ;
   private String[] P02F72_A353DisArtTr1 ;
   private String[] P02F72_A354DisArtTr2 ;
   private String[] P02F72_A355DisArtTr3 ;
   private short[] P02F72_A344DisArtPt1 ;
   private short[] P02F72_A345DisArtPt2 ;
   private short[] P02F72_A346DisArtPt3 ;
   private String[] P02F72_A356DisArtUr1 ;
   private String[] P02F72_A357DisArtUr2 ;
   private String[] P02F72_A358DisArtUr3 ;
   private short[] P02F72_A347DisArtPu1 ;
   private short[] P02F72_A348DisArtPu2 ;
   private short[] P02F72_A349DisArtPu3 ;
   private boolean[] P02F72_n349DisArtPu3 ;
   private short[] P02F72_A1225DisGraCru ;
   private java.math.BigDecimal[] P02F72_A1197DisEncCom ;
   private java.math.BigDecimal[] P02F72_A1198DisEncAnh ;
   private String[] P02F72_A2835DisPle2 ;
   private short[] P02F72_A3128DisAncSal1 ;
   private short[] P02F72_A3129DisAncSal2 ;
   private short[] P02F72_A3130DisAncSal3 ;
   private short[] P02F72_A3131DisGraAca2 ;
   private short[] P02F72_A3132DisGraCru2 ;
   private short[] P02F72_A3127DisNumCor ;
   private short[] P02F72_A1906DisGraAca ;
   private java.math.BigDecimal[] P02F72_A1908DisRdoA ;
   private java.math.BigDecimal[] P02F72_A1907DisRdoN ;
}

final  class apcamartsed__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02F72", "SELECT EmprCod, DisCod, DisArtCod, DisArtPle, DisArtUrg, DisArtMat, DisArtTip, DisArtDsc, DisArtPes, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisArtRdt, DisArtLar, DisArtCor, DisArtEnc, DisArtSua, DisArtAca, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisGraCru, DisEncCom, DisEncAnh, DisPle2, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisNumCor, DisGraAca, DisRdoA, DisRdoN FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02F73", "UPDATE TXPDISPOS SET DisArtCod=?, DisArtPle=?, DisArtUrg=?, DisArtMat=?, DisArtTip=?, DisArtDsc=?, DisArtPes=?, DisArtAnh=?, DisArtAn1=?, DisArtAcb=?, DisArtAc2=?, DisArtRdt=?, DisArtLar=?, DisArtCor=?, DisArtEnc=?, DisArtSua=?, DisArtAca=?, DisArtTr1=?, DisArtTr2=?, DisArtTr3=?, DisArtPt1=?, DisArtPt2=?, DisArtPt3=?, DisArtUr1=?, DisArtUr2=?, DisArtUr3=?, DisArtPu1=?, DisArtPu2=?, DisArtPu3=?, DisGraCru=?, DisEncCom=?, DisEncAnh=?, DisPle2=?, DisAncSal1=?, DisAncSal2=?, DisAncSal3=?, DisGraAca2=?, DisGraCru2=?, DisNumCor=?, DisGraAca=?, DisRdoA=?, DisRdoN=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((String[]) buf[19])[0] = rslt.getString(20, 4);
               ((String[]) buf[20])[0] = rslt.getString(21, 4);
               ((String[]) buf[21])[0] = rslt.getString(22, 4);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 4);
               ((String[]) buf[26])[0] = rslt.getString(27, 4);
               ((String[]) buf[27])[0] = rslt.getString(28, 4);
               ((short[]) buf[28])[0] = rslt.getShort(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(32);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((String[]) buf[35])[0] = rslt.getString(35, 30);
               ((short[]) buf[36])[0] = rslt.getShort(36);
               ((short[]) buf[37])[0] = rslt.getShort(37);
               ((short[]) buf[38])[0] = rslt.getShort(38);
               ((short[]) buf[39])[0] = rslt.getShort(39);
               ((short[]) buf[40])[0] = rslt.getShort(40);
               ((short[]) buf[41])[0] = rslt.getShort(41);
               ((short[]) buf[42])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(44,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 26);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 6);
               stmt.setString(17, (String)parms[16], 6);
               stmt.setString(18, (String)parms[17], 4);
               stmt.setString(19, (String)parms[18], 4);
               stmt.setString(20, (String)parms[19], 4);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 4);
               stmt.setString(25, (String)parms[24], 4);
               stmt.setString(26, (String)parms[25], 4);
               stmt.setShort(27, ((Number) parms[26]).shortValue());
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[29]).shortValue());
               }
               stmt.setShort(30, ((Number) parms[30]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 2);
               stmt.setString(33, (String)parms[33], 30);
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setShort(39, ((Number) parms[39]).shortValue());
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 2);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[42], 2);
               stmt.setString(43, (String)parms[43], 3);
               stmt.setInt(44, ((Number) parms[44]).intValue());
               return;
      }
   }

}

