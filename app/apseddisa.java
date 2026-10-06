package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apseddisa extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apseddisa pgm = new apseddisa (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public apseddisa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apseddisa.class ), "" );
   }

   public apseddisa( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      apseddisa.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      apseddisa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apseddisa.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P036D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A335DisArtCod = P036D2_A335DisArtCod[0] ;
         A340DisArtMat = P036D2_A340DisArtMat[0] ;
         A352DisArtTip = P036D2_A352DisArtTip[0] ;
         A337DisArtDsc = P036D2_A337DisArtDsc[0] ;
         A342DisArtPes = P036D2_A342DisArtPes[0] ;
         A334DisArtAnh = P036D2_A334DisArtAnh[0] ;
         A1231DisArtAn1 = P036D2_A1231DisArtAn1[0] ;
         A1232DisArtAcb = P036D2_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = P036D2_A1233DisArtAc2[0] ;
         A350DisArtRdt = P036D2_A350DisArtRdt[0] ;
         A343DisArtPle = P036D2_A343DisArtPle[0] ;
         A339DisArtLar = P036D2_A339DisArtLar[0] ;
         A336DisArtCor = P036D2_A336DisArtCor[0] ;
         A338DisArtEnc = P036D2_A338DisArtEnc[0] ;
         A351DisArtSua = P036D2_A351DisArtSua[0] ;
         A333DisArtAca = P036D2_A333DisArtAca[0] ;
         A359DisArtUrg = P036D2_A359DisArtUrg[0] ;
         A353DisArtTr1 = P036D2_A353DisArtTr1[0] ;
         A354DisArtTr2 = P036D2_A354DisArtTr2[0] ;
         A355DisArtTr3 = P036D2_A355DisArtTr3[0] ;
         A344DisArtPt1 = P036D2_A344DisArtPt1[0] ;
         A345DisArtPt2 = P036D2_A345DisArtPt2[0] ;
         A346DisArtPt3 = P036D2_A346DisArtPt3[0] ;
         A356DisArtUr1 = P036D2_A356DisArtUr1[0] ;
         A357DisArtUr2 = P036D2_A357DisArtUr2[0] ;
         A358DisArtUr3 = P036D2_A358DisArtUr3[0] ;
         A347DisArtPu1 = P036D2_A347DisArtPu1[0] ;
         A348DisArtPu2 = P036D2_A348DisArtPu2[0] ;
         A349DisArtPu3 = P036D2_A349DisArtPu3[0] ;
         n349DisArtPu3 = P036D2_n349DisArtPu3[0] ;
         A1225DisGraCru = P036D2_A1225DisGraCru[0] ;
         A1197DisEncCom = P036D2_A1197DisEncCom[0] ;
         A1198DisEncAnh = P036D2_A1198DisEncAnh[0] ;
         A2835DisPle2 = P036D2_A2835DisPle2[0] ;
         A3128DisAncSal1 = P036D2_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = P036D2_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = P036D2_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = P036D2_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = P036D2_A3132DisGraCru2[0] ;
         A3127DisNumCor = P036D2_A3127DisNumCor[0] ;
         A1906DisGraAca = P036D2_A1906DisGraAca[0] ;
         A1908DisRdoA = P036D2_A1908DisRdoA[0] ;
         A1907DisRdoN = P036D2_A1907DisRdoN[0] ;
         AV139DisArtCod = A335DisArtCod ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = 340 ;
         GXv_char3[0] = A335DisArtCod ;
         GXv_char4[0] = AV100DisArtDsc ;
         GXv_char5[0] = AV103DisArtMat ;
         GXv_char6[0] = AV128DisPle2 ;
         GXv_char7[0] = AV102DisArtLar ;
         GXv_char8[0] = AV113DisArtSua ;
         GXv_char9[0] = AV95DisArtAca ;
         GXv_char10[0] = "" ;
         GXv_int11[0] = AV114DisArtTip ;
         GXv_char12[0] = AV101DisArtEnc ;
         GXv_char13[0] = AV99DisArtCor ;
         GXv_char14[0] = AV115DisArtTr1 ;
         GXv_char15[0] = AV116DisArtTr2 ;
         GXv_char16[0] = AV117DisArtTr3 ;
         GXv_int17[0] = AV106DisArtPt1 ;
         GXv_int18[0] = AV107DisArtPt2 ;
         GXv_int19[0] = AV108DisArtPt3 ;
         GXv_decimal20[0] = AV112DisArtRdt ;
         GXv_int21[0] = (byte)(0) ;
         GXv_char22[0] = AV118DisArtUr1 ;
         GXv_char23[0] = AV119DisArtUr2 ;
         GXv_char24[0] = AV120DisArtUr3 ;
         GXv_int25[0] = AV109DisArtPu1 ;
         GXv_int26[0] = AV110DisArtPu2 ;
         GXv_int27[0] = AV111DisArtPu3 ;
         GXv_int28[0] = AV104DisArtPes ;
         GXv_int29[0] = AV126DisGraCru ;
         GXv_int30[0] = AV98DisArtAnh ;
         GXv_int31[0] = AV97DisArtAn1 ;
         GXv_int32[0] = AV96DisArtAcb ;
         GXv_int33[0] = AV94DisArtAc2 ;
         GXv_int34[0] = AV123DisEncCom ;
         GXv_int35[0] = AV122DisEncAnh ;
         GXv_int36[0] = AV82DisNumCor ;
         GXv_int37[0] = AV91DisAncSal1 ;
         GXv_int38[0] = AV92DisAncSal2 ;
         GXv_int39[0] = AV93DisAncSal3 ;
         GXv_int40[0] = AV125DisGraAca2 ;
         GXv_int41[0] = AV127DisGraCru2 ;
         GXv_int42[0] = AV124DisGraAca ;
         GXv_decimal43[0] = AV129DisRdoA ;
         GXv_decimal44[0] = AV130DisRdoN ;
         GXv_char45[0] = " " ;
         GXv_char46[0] = " " ;
         GXv_int47[0] = AV142Flag ;
         new app.partdis(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_int17, GXv_int18, GXv_int19, GXv_decimal20, GXv_int21, GXv_char22, GXv_char23, GXv_char24, GXv_int25, GXv_int26, GXv_int27, GXv_int28, GXv_int29, GXv_int30, GXv_int31, GXv_int32, GXv_int33, GXv_int34, GXv_int35, GXv_int36, GXv_int37, GXv_int38, GXv_int39, GXv_int40, GXv_int41, GXv_int42, GXv_decimal43, GXv_decimal44, GXv_char45, GXv_char46, GXv_int47) ;
         apseddisa.this.A396EmprCod = GXv_char1[0] ;
         apseddisa.this.A335DisArtCod = GXv_char3[0] ;
         apseddisa.this.AV100DisArtDsc = GXv_char4[0] ;
         apseddisa.this.AV103DisArtMat = GXv_char5[0] ;
         apseddisa.this.AV128DisPle2 = GXv_char6[0] ;
         apseddisa.this.AV102DisArtLar = GXv_char7[0] ;
         apseddisa.this.AV113DisArtSua = GXv_char8[0] ;
         apseddisa.this.AV95DisArtAca = GXv_char9[0] ;
         apseddisa.this.AV114DisArtTip = GXv_int11[0] ;
         apseddisa.this.AV101DisArtEnc = GXv_char12[0] ;
         apseddisa.this.AV99DisArtCor = GXv_char13[0] ;
         apseddisa.this.AV115DisArtTr1 = GXv_char14[0] ;
         apseddisa.this.AV116DisArtTr2 = GXv_char15[0] ;
         apseddisa.this.AV117DisArtTr3 = GXv_char16[0] ;
         apseddisa.this.AV106DisArtPt1 = GXv_int17[0] ;
         apseddisa.this.AV107DisArtPt2 = GXv_int18[0] ;
         apseddisa.this.AV108DisArtPt3 = GXv_int19[0] ;
         apseddisa.this.AV112DisArtRdt = GXv_decimal20[0] ;
         apseddisa.this.AV118DisArtUr1 = GXv_char22[0] ;
         apseddisa.this.AV119DisArtUr2 = GXv_char23[0] ;
         apseddisa.this.AV120DisArtUr3 = GXv_char24[0] ;
         apseddisa.this.AV109DisArtPu1 = GXv_int25[0] ;
         apseddisa.this.AV110DisArtPu2 = GXv_int26[0] ;
         apseddisa.this.AV111DisArtPu3 = GXv_int27[0] ;
         apseddisa.this.AV104DisArtPes = GXv_int28[0] ;
         apseddisa.this.AV126DisGraCru = GXv_int29[0] ;
         apseddisa.this.AV98DisArtAnh = GXv_int30[0] ;
         apseddisa.this.AV97DisArtAn1 = GXv_int31[0] ;
         apseddisa.this.AV96DisArtAcb = GXv_int32[0] ;
         apseddisa.this.AV94DisArtAc2 = GXv_int33[0] ;
         apseddisa.this.AV123DisEncCom = GXv_int34[0] ;
         apseddisa.this.AV122DisEncAnh = GXv_int35[0] ;
         apseddisa.this.AV82DisNumCor = GXv_int36[0] ;
         apseddisa.this.AV91DisAncSal1 = GXv_int37[0] ;
         apseddisa.this.AV92DisAncSal2 = GXv_int38[0] ;
         apseddisa.this.AV93DisAncSal3 = GXv_int39[0] ;
         apseddisa.this.AV125DisGraAca2 = GXv_int40[0] ;
         apseddisa.this.AV127DisGraCru2 = GXv_int41[0] ;
         apseddisa.this.AV124DisGraAca = GXv_int42[0] ;
         apseddisa.this.AV129DisRdoA = GXv_decimal43[0] ;
         apseddisa.this.AV130DisRdoN = GXv_decimal44[0] ;
         apseddisa.this.AV142Flag = GXv_int47[0] ;
         A340DisArtMat = AV103DisArtMat ;
         A352DisArtTip = AV114DisArtTip ;
         A337DisArtDsc = AV100DisArtDsc ;
         A342DisArtPes = AV104DisArtPes ;
         A334DisArtAnh = AV98DisArtAnh ;
         A1231DisArtAn1 = AV97DisArtAn1 ;
         A1232DisArtAcb = AV96DisArtAcb ;
         A1233DisArtAc2 = AV94DisArtAc2 ;
         A350DisArtRdt = AV112DisArtRdt ;
         A343DisArtPle = AV105DisArtPle ;
         A339DisArtLar = AV102DisArtLar ;
         A336DisArtCor = AV99DisArtCor ;
         A338DisArtEnc = AV101DisArtEnc ;
         A351DisArtSua = AV113DisArtSua ;
         A333DisArtAca = AV95DisArtAca ;
         A359DisArtUrg = AV121DisArtUrg ;
         A353DisArtTr1 = AV115DisArtTr1 ;
         A354DisArtTr2 = AV116DisArtTr2 ;
         A355DisArtTr3 = AV117DisArtTr3 ;
         A344DisArtPt1 = AV106DisArtPt1 ;
         A345DisArtPt2 = AV107DisArtPt2 ;
         A346DisArtPt3 = AV108DisArtPt3 ;
         A356DisArtUr1 = AV118DisArtUr1 ;
         A357DisArtUr2 = AV119DisArtUr2 ;
         A358DisArtUr3 = AV120DisArtUr3 ;
         A347DisArtPu1 = AV109DisArtPu1 ;
         A348DisArtPu2 = AV110DisArtPu2 ;
         A349DisArtPu3 = AV111DisArtPu3 ;
         n349DisArtPu3 = false ;
         A1225DisGraCru = AV126DisGraCru ;
         A1197DisEncCom = DecimalUtil.doubleToDec(AV123DisEncCom) ;
         A1198DisEncAnh = DecimalUtil.doubleToDec(AV122DisEncAnh) ;
         A2835DisPle2 = AV128DisPle2 ;
         A3128DisAncSal1 = AV91DisAncSal1 ;
         A3129DisAncSal2 = AV92DisAncSal2 ;
         A3130DisAncSal3 = AV93DisAncSal3 ;
         A3131DisGraAca2 = AV125DisGraAca2 ;
         A3132DisGraCru2 = AV127DisGraCru2 ;
         A3127DisNumCor = AV82DisNumCor ;
         A1906DisGraAca = AV124DisGraAca ;
         A1908DisRdoA = AV129DisRdoA ;
         A1907DisRdoN = AV130DisRdoN ;
         /* Optimized DELETE. */
         /* Using cursor P036D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P036D4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P036D5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P036D6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         /* End optimized DELETE. */
         GXv_char46[0] = A396EmprCod ;
         GXv_int2[0] = A361DisCod ;
         GXv_char45[0] = A335DisArtCod ;
         GXv_int48[0] = 340 ;
         new app.pbuspro(remoteHandle, context).execute( GXv_char46, GXv_int2, GXv_char45, GXv_int48) ;
         apseddisa.this.A396EmprCod = GXv_char46[0] ;
         apseddisa.this.A361DisCod = GXv_int2[0] ;
         apseddisa.this.A335DisArtCod = GXv_char45[0] ;
         /* Using cursor P036D7 */
         pr_default.execute(5, new Object[] {A340DisArtMat, Short.valueOf(A352DisArtTip), A337DisArtDsc, Short.valueOf(A342DisArtPes), Short.valueOf(A334DisArtAnh), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A350DisArtRdt, A343DisArtPle, A339DisArtLar, A336DisArtCor, A338DisArtEnc, A351DisArtSua, A333DisArtAca, Byte.valueOf(A359DisArtUrg), A353DisArtTr1, A354DisArtTr2, A355DisArtTr3, Short.valueOf(A344DisArtPt1), Short.valueOf(A345DisArtPt2), Short.valueOf(A346DisArtPt3), A356DisArtUr1, A357DisArtUr2, A358DisArtUr3, Short.valueOf(A347DisArtPu1), Short.valueOf(A348DisArtPu2), Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A1225DisGraCru), A1197DisEncCom, A1198DisEncAnh, A2835DisPle2, Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), Short.valueOf(A3127DisNumCor), Short.valueOf(A1906DisGraAca), A1908DisRdoA, A1907DisRdoN, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pseddisa.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apseddisa.this.A396EmprCod;
      this.aP1[0] = apseddisa.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apseddisa");
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
      P036D2_A396EmprCod = new String[] {""} ;
      P036D2_A361DisCod = new int[1] ;
      P036D2_A335DisArtCod = new String[] {""} ;
      P036D2_A340DisArtMat = new String[] {""} ;
      P036D2_A352DisArtTip = new short[1] ;
      P036D2_A337DisArtDsc = new String[] {""} ;
      P036D2_A342DisArtPes = new short[1] ;
      P036D2_A334DisArtAnh = new short[1] ;
      P036D2_A1231DisArtAn1 = new short[1] ;
      P036D2_A1232DisArtAcb = new short[1] ;
      P036D2_A1233DisArtAc2 = new short[1] ;
      P036D2_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036D2_A343DisArtPle = new String[] {""} ;
      P036D2_A339DisArtLar = new String[] {""} ;
      P036D2_A336DisArtCor = new String[] {""} ;
      P036D2_A338DisArtEnc = new String[] {""} ;
      P036D2_A351DisArtSua = new String[] {""} ;
      P036D2_A333DisArtAca = new String[] {""} ;
      P036D2_A359DisArtUrg = new byte[1] ;
      P036D2_A353DisArtTr1 = new String[] {""} ;
      P036D2_A354DisArtTr2 = new String[] {""} ;
      P036D2_A355DisArtTr3 = new String[] {""} ;
      P036D2_A344DisArtPt1 = new short[1] ;
      P036D2_A345DisArtPt2 = new short[1] ;
      P036D2_A346DisArtPt3 = new short[1] ;
      P036D2_A356DisArtUr1 = new String[] {""} ;
      P036D2_A357DisArtUr2 = new String[] {""} ;
      P036D2_A358DisArtUr3 = new String[] {""} ;
      P036D2_A347DisArtPu1 = new short[1] ;
      P036D2_A348DisArtPu2 = new short[1] ;
      P036D2_A349DisArtPu3 = new short[1] ;
      P036D2_n349DisArtPu3 = new boolean[] {false} ;
      P036D2_A1225DisGraCru = new short[1] ;
      P036D2_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036D2_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036D2_A2835DisPle2 = new String[] {""} ;
      P036D2_A3128DisAncSal1 = new short[1] ;
      P036D2_A3129DisAncSal2 = new short[1] ;
      P036D2_A3130DisAncSal3 = new short[1] ;
      P036D2_A3131DisGraAca2 = new short[1] ;
      P036D2_A3132DisGraCru2 = new short[1] ;
      P036D2_A3127DisNumCor = new short[1] ;
      P036D2_A1906DisGraAca = new short[1] ;
      P036D2_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036D2_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A335DisArtCod = "" ;
      A340DisArtMat = "" ;
      A337DisArtDsc = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A343DisArtPle = "" ;
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
      AV139DisArtCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV100DisArtDsc = "" ;
      GXv_char4 = new String[1] ;
      AV103DisArtMat = "" ;
      GXv_char5 = new String[1] ;
      AV128DisPle2 = "" ;
      GXv_char6 = new String[1] ;
      AV102DisArtLar = "" ;
      GXv_char7 = new String[1] ;
      AV113DisArtSua = "" ;
      GXv_char8 = new String[1] ;
      AV95DisArtAca = "" ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      AV101DisArtEnc = "" ;
      GXv_char12 = new String[1] ;
      AV99DisArtCor = "" ;
      GXv_char13 = new String[1] ;
      AV115DisArtTr1 = "" ;
      GXv_char14 = new String[1] ;
      AV116DisArtTr2 = "" ;
      GXv_char15 = new String[1] ;
      AV117DisArtTr3 = "" ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      AV112DisArtRdt = DecimalUtil.ZERO ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int21 = new byte[1] ;
      AV118DisArtUr1 = "" ;
      GXv_char22 = new String[1] ;
      AV119DisArtUr2 = "" ;
      GXv_char23 = new String[1] ;
      AV120DisArtUr3 = "" ;
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
      AV129DisRdoA = DecimalUtil.ZERO ;
      GXv_decimal43 = new java.math.BigDecimal[1] ;
      AV130DisRdoN = DecimalUtil.ZERO ;
      GXv_decimal44 = new java.math.BigDecimal[1] ;
      GXv_int47 = new byte[1] ;
      AV105DisArtPle = "" ;
      GXv_char46 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char45 = new String[1] ;
      GXv_int48 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apseddisa__default(),
         new Object[] {
             new Object[] {
            P036D2_A396EmprCod, P036D2_A361DisCod, P036D2_A335DisArtCod, P036D2_A340DisArtMat, P036D2_A352DisArtTip, P036D2_A337DisArtDsc, P036D2_A342DisArtPes, P036D2_A334DisArtAnh, P036D2_A1231DisArtAn1, P036D2_A1232DisArtAcb,
            P036D2_A1233DisArtAc2, P036D2_A350DisArtRdt, P036D2_A343DisArtPle, P036D2_A339DisArtLar, P036D2_A336DisArtCor, P036D2_A338DisArtEnc, P036D2_A351DisArtSua, P036D2_A333DisArtAca, P036D2_A359DisArtUrg, P036D2_A353DisArtTr1,
            P036D2_A354DisArtTr2, P036D2_A355DisArtTr3, P036D2_A344DisArtPt1, P036D2_A345DisArtPt2, P036D2_A346DisArtPt3, P036D2_A356DisArtUr1, P036D2_A357DisArtUr2, P036D2_A358DisArtUr3, P036D2_A347DisArtPu1, P036D2_A348DisArtPu2,
            P036D2_A349DisArtPu3, P036D2_n349DisArtPu3, P036D2_A1225DisGraCru, P036D2_A1197DisEncCom, P036D2_A1198DisEncAnh, P036D2_A2835DisPle2, P036D2_A3128DisAncSal1, P036D2_A3129DisAncSal2, P036D2_A3130DisAncSal3, P036D2_A3131DisGraAca2,
            P036D2_A3132DisGraCru2, P036D2_A3127DisNumCor, P036D2_A1906DisGraAca, P036D2_A1908DisRdoA, P036D2_A1907DisRdoN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A359DisArtUrg ;
   private byte GXv_int21[] ;
   private byte AV142Flag ;
   private byte GXv_int47[] ;
   private byte AV121DisArtUrg ;
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
   private short AV114DisArtTip ;
   private short GXv_int11[] ;
   private short AV106DisArtPt1 ;
   private short GXv_int17[] ;
   private short AV107DisArtPt2 ;
   private short GXv_int18[] ;
   private short AV108DisArtPt3 ;
   private short GXv_int19[] ;
   private short AV109DisArtPu1 ;
   private short GXv_int25[] ;
   private short AV110DisArtPu2 ;
   private short GXv_int26[] ;
   private short AV111DisArtPu3 ;
   private short GXv_int27[] ;
   private short AV104DisArtPes ;
   private short GXv_int28[] ;
   private short AV126DisGraCru ;
   private short GXv_int29[] ;
   private short AV98DisArtAnh ;
   private short GXv_int30[] ;
   private short AV97DisArtAn1 ;
   private short GXv_int31[] ;
   private short AV96DisArtAcb ;
   private short GXv_int32[] ;
   private short AV94DisArtAc2 ;
   private short GXv_int33[] ;
   private short AV123DisEncCom ;
   private short GXv_int34[] ;
   private short AV122DisEncAnh ;
   private short GXv_int35[] ;
   private short AV82DisNumCor ;
   private short GXv_int36[] ;
   private short AV91DisAncSal1 ;
   private short GXv_int37[] ;
   private short AV92DisAncSal2 ;
   private short GXv_int38[] ;
   private short AV93DisAncSal3 ;
   private short GXv_int39[] ;
   private short AV125DisGraAca2 ;
   private short GXv_int40[] ;
   private short AV127DisGraCru2 ;
   private short GXv_int41[] ;
   private short AV124DisGraAca ;
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
   private java.math.BigDecimal AV112DisArtRdt ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal AV129DisRdoA ;
   private java.math.BigDecimal GXv_decimal43[] ;
   private java.math.BigDecimal AV130DisRdoN ;
   private java.math.BigDecimal GXv_decimal44[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A340DisArtMat ;
   private String A337DisArtDsc ;
   private String A343DisArtPle ;
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
   private String AV139DisArtCod ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV100DisArtDsc ;
   private String GXv_char4[] ;
   private String AV103DisArtMat ;
   private String GXv_char5[] ;
   private String AV128DisPle2 ;
   private String GXv_char6[] ;
   private String AV102DisArtLar ;
   private String GXv_char7[] ;
   private String AV113DisArtSua ;
   private String GXv_char8[] ;
   private String AV95DisArtAca ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String AV101DisArtEnc ;
   private String GXv_char12[] ;
   private String AV99DisArtCor ;
   private String GXv_char13[] ;
   private String AV115DisArtTr1 ;
   private String GXv_char14[] ;
   private String AV116DisArtTr2 ;
   private String GXv_char15[] ;
   private String AV117DisArtTr3 ;
   private String GXv_char16[] ;
   private String AV118DisArtUr1 ;
   private String GXv_char22[] ;
   private String AV119DisArtUr2 ;
   private String GXv_char23[] ;
   private String AV120DisArtUr3 ;
   private String GXv_char24[] ;
   private String AV105DisArtPle ;
   private String GXv_char46[] ;
   private String GXv_char45[] ;
   private boolean n349DisArtPu3 ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P036D2_A396EmprCod ;
   private int[] P036D2_A361DisCod ;
   private String[] P036D2_A335DisArtCod ;
   private String[] P036D2_A340DisArtMat ;
   private short[] P036D2_A352DisArtTip ;
   private String[] P036D2_A337DisArtDsc ;
   private short[] P036D2_A342DisArtPes ;
   private short[] P036D2_A334DisArtAnh ;
   private short[] P036D2_A1231DisArtAn1 ;
   private short[] P036D2_A1232DisArtAcb ;
   private short[] P036D2_A1233DisArtAc2 ;
   private java.math.BigDecimal[] P036D2_A350DisArtRdt ;
   private String[] P036D2_A343DisArtPle ;
   private String[] P036D2_A339DisArtLar ;
   private String[] P036D2_A336DisArtCor ;
   private String[] P036D2_A338DisArtEnc ;
   private String[] P036D2_A351DisArtSua ;
   private String[] P036D2_A333DisArtAca ;
   private byte[] P036D2_A359DisArtUrg ;
   private String[] P036D2_A353DisArtTr1 ;
   private String[] P036D2_A354DisArtTr2 ;
   private String[] P036D2_A355DisArtTr3 ;
   private short[] P036D2_A344DisArtPt1 ;
   private short[] P036D2_A345DisArtPt2 ;
   private short[] P036D2_A346DisArtPt3 ;
   private String[] P036D2_A356DisArtUr1 ;
   private String[] P036D2_A357DisArtUr2 ;
   private String[] P036D2_A358DisArtUr3 ;
   private short[] P036D2_A347DisArtPu1 ;
   private short[] P036D2_A348DisArtPu2 ;
   private short[] P036D2_A349DisArtPu3 ;
   private boolean[] P036D2_n349DisArtPu3 ;
   private short[] P036D2_A1225DisGraCru ;
   private java.math.BigDecimal[] P036D2_A1197DisEncCom ;
   private java.math.BigDecimal[] P036D2_A1198DisEncAnh ;
   private String[] P036D2_A2835DisPle2 ;
   private short[] P036D2_A3128DisAncSal1 ;
   private short[] P036D2_A3129DisAncSal2 ;
   private short[] P036D2_A3130DisAncSal3 ;
   private short[] P036D2_A3131DisGraAca2 ;
   private short[] P036D2_A3132DisGraCru2 ;
   private short[] P036D2_A3127DisNumCor ;
   private short[] P036D2_A1906DisGraAca ;
   private java.math.BigDecimal[] P036D2_A1908DisRdoA ;
   private java.math.BigDecimal[] P036D2_A1907DisRdoN ;
}

final  class apseddisa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036D2", "SELECT EmprCod, DisCod, DisArtCod, DisArtMat, DisArtTip, DisArtDsc, DisArtPes, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisArtRdt, DisArtPle, DisArtLar, DisArtCor, DisArtEnc, DisArtSua, DisArtAca, DisArtUrg, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisGraCru, DisEncCom, DisEncAnh, DisPle2, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisNumCor, DisGraAca, DisRdoA, DisRdoN FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P036D3", "DELETE FROM TXPDISQUI  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new UpdateCursor("P036D4", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P036D5", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P036D6", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P036D7", "UPDATE TXPDISPOS SET DisArtMat=?, DisArtTip=?, DisArtDsc=?, DisArtPes=?, DisArtAnh=?, DisArtAn1=?, DisArtAcb=?, DisArtAc2=?, DisArtRdt=?, DisArtPle=?, DisArtLar=?, DisArtCor=?, DisArtEnc=?, DisArtSua=?, DisArtAca=?, DisArtUrg=?, DisArtTr1=?, DisArtTr2=?, DisArtTr3=?, DisArtPt1=?, DisArtPt2=?, DisArtPt3=?, DisArtUr1=?, DisArtUr2=?, DisArtUr3=?, DisArtPu1=?, DisArtPu2=?, DisArtPu3=?, DisGraCru=?, DisEncCom=?, DisEncAnh=?, DisPle2=?, DisAncSal1=?, DisAncSal2=?, DisAncSal3=?, DisGraAca2=?, DisGraCru2=?, DisNumCor=?, DisGraAca=?, DisRdoA=?, DisRdoN=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 26);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 6);
               stmt.setString(15, (String)parms[14], 6);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 4);
               stmt.setString(18, (String)parms[17], 4);
               stmt.setString(19, (String)parms[18], 4);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 4);
               stmt.setString(24, (String)parms[23], 4);
               stmt.setString(25, (String)parms[24], 4);
               stmt.setShort(26, ((Number) parms[25]).shortValue());
               stmt.setShort(27, ((Number) parms[26]).shortValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[28]).shortValue());
               }
               stmt.setShort(29, ((Number) parms[29]).shortValue());
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[31], 2);
               stmt.setString(32, (String)parms[32], 30);
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setShort(39, ((Number) parms[39]).shortValue());
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[40], 2);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 2);
               stmt.setString(42, (String)parms[42], 3);
               stmt.setInt(43, ((Number) parms[43]).intValue());
               return;
      }
   }

}

