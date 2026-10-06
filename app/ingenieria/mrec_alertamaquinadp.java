package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_alertamaquinadp extends GXProcedure
{
   public mrec_alertamaquinadp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertamaquinadp.class ), "" );
   }

   public mrec_alertamaquinadp( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> executeUdp( String aP0 ,
                                                                           java.util.Date aP1 ,
                                                                           java.util.Date aP2 ,
                                                                           GXSimpleCollection<String> aP3 ,
                                                                           GXSimpleCollection<String> aP4 ,
                                                                           GXSimpleCollection<String> aP5 ,
                                                                           GXSimpleCollection<Short> aP6 ,
                                                                           boolean aP7 ,
                                                                           String aP8 ,
                                                                           String aP9 ,
                                                                           java.util.Date aP10 ,
                                                                           String aP11 ,
                                                                           byte aP12 )
   {
      mrec_alertamaquinadp.this.aP13 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        GXSimpleCollection<String> aP3 ,
                        GXSimpleCollection<String> aP4 ,
                        GXSimpleCollection<String> aP5 ,
                        GXSimpleCollection<Short> aP6 ,
                        boolean aP7 ,
                        String aP8 ,
                        String aP9 ,
                        java.util.Date aP10 ,
                        String aP11 ,
                        byte aP12 ,
                        GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             GXSimpleCollection<String> aP3 ,
                             GXSimpleCollection<String> aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             GXSimpleCollection<Short> aP6 ,
                             boolean aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.util.Date aP10 ,
                             String aP11 ,
                             byte aP12 ,
                             GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>[] aP13 )
   {
      mrec_alertamaquinadp.this.AV6EmprCod = aP0;
      mrec_alertamaquinadp.this.AV5Desde = aP1;
      mrec_alertamaquinadp.this.AV9Hasta = aP2;
      mrec_alertamaquinadp.this.AV12MaqCodCollection = aP3;
      mrec_alertamaquinadp.this.AV7FasCodCollection = aP4;
      mrec_alertamaquinadp.this.AV10HdrCollection = aP5;
      mrec_alertamaquinadp.this.AV14ParFasCodCollection = aP6;
      mrec_alertamaquinadp.this.AV8FueraRango = aP7;
      mrec_alertamaquinadp.this.AV15UsurCod = aP8;
      mrec_alertamaquinadp.this.AV11Ip = aP9;
      mrec_alertamaquinadp.this.AV16Now = aP10;
      mrec_alertamaquinadp.this.AV17MTkn = aP11;
      mrec_alertamaquinadp.this.AV18Espacios = aP12;
      mrec_alertamaquinadp.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14790MAlqMaqCod ,
                                           AV12MaqCodCollection ,
                                           A14792MAlqFasCod ,
                                           AV7FasCodCollection ,
                                           A14797MAlqHdr ,
                                           AV10HdrCollection ,
                                           A14798MAlqHdr2 ,
                                           Short.valueOf(A14799MAlqParCod) ,
                                           AV14ParFasCodCollection ,
                                           Integer.valueOf(AV12MaqCodCollection.size()) ,
                                           Integer.valueOf(AV7FasCodCollection.size()) ,
                                           Integer.valueOf(AV10HdrCollection.size()) ,
                                           Byte.valueOf(AV18Espacios) ,
                                           Integer.valueOf(AV14ParFasCodCollection.size()) ,
                                           Boolean.valueOf(AV8FueraRango) ,
                                           Boolean.valueOf(A14808MAlqEr) ,
                                           A14813MAlqReg ,
                                           AV16Now ,
                                           A14789MAlqEmprCo ,
                                           AV6EmprCod ,
                                           A14811MAlqUsu ,
                                           AV15UsurCod ,
                                           A14812MAlqIp ,
                                           AV11Ip ,
                                           A14814MAlqTkn ,
                                           AV17MTkn ,
                                           AV5Desde ,
                                           A14804MAlqFec ,
                                           AV9Hasta } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P005B2 */
      pr_default.execute(0, new Object[] {AV5Desde, AV16Now, AV6EmprCod, AV15UsurCod, AV11Ip, AV17MTkn, AV9Hasta});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14789MAlqEmprCo = P005B2_A14789MAlqEmprCo[0] ;
         A14811MAlqUsu = P005B2_A14811MAlqUsu[0] ;
         A14812MAlqIp = P005B2_A14812MAlqIp[0] ;
         A14814MAlqTkn = P005B2_A14814MAlqTkn[0] ;
         A14813MAlqReg = P005B2_A14813MAlqReg[0] ;
         A14808MAlqEr = P005B2_A14808MAlqEr[0] ;
         A14799MAlqParCod = P005B2_A14799MAlqParCod[0] ;
         A14798MAlqHdr2 = P005B2_A14798MAlqHdr2[0] ;
         A14797MAlqHdr = P005B2_A14797MAlqHdr[0] ;
         A14792MAlqFasCod = P005B2_A14792MAlqFasCod[0] ;
         A14790MAlqMaqCod = P005B2_A14790MAlqMaqCod[0] ;
         A14804MAlqFec = P005B2_A14804MAlqFec[0] ;
         A14805MAlqVal = P005B2_A14805MAlqVal[0] ;
         A14810MAlqParId = P005B2_A14810MAlqParId[0] ;
         A14788MAlqId = P005B2_A14788MAlqId[0] ;
         Gxm1mrec_analisissdt = (app.ingenieria.SdtMRec_AnalisisSDT)new app.ingenieria.SdtMRec_AnalisisSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mrec_analisissdt, 0);
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecfec( A14804MAlqFec );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_1( ((A14810MAlqParId==1) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_2( ((A14810MAlqParId==2) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_3( ((A14810MAlqParId==3) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_4( ((A14810MAlqParId==4) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_5( ((A14810MAlqParId==5) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_6( ((A14810MAlqParId==6) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_7( ((A14810MAlqParId==7) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_8( ((A14810MAlqParId==8) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_9( ((A14810MAlqParId==9) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_10( ((A14810MAlqParId==10) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_11( ((A14810MAlqParId==11) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_12( ((A14810MAlqParId==12) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_13( ((A14810MAlqParId==13) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_14( ((A14810MAlqParId==14) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_15( ((A14810MAlqParId==15) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_16( ((A14810MAlqParId==16) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_17( ((A14810MAlqParId==17) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_18( ((A14810MAlqParId==18) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_19( ((A14810MAlqParId==19) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_20( ((A14810MAlqParId==20) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_21( ((A14810MAlqParId==21) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_22( ((A14810MAlqParId==22) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_23( ((A14810MAlqParId==23) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_24( ((A14810MAlqParId==24) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_25( ((A14810MAlqParId==25) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_26( ((A14810MAlqParId==26) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_27( ((A14810MAlqParId==27) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_28( ((A14810MAlqParId==28) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_29( ((A14810MAlqParId==29) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_30( ((A14810MAlqParId==30) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_31( ((A14810MAlqParId==31) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_32( ((A14810MAlqParId==32) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_33( ((A14810MAlqParId==33) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_34( ((A14810MAlqParId==34) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_35( ((A14810MAlqParId==35) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_36( ((A14810MAlqParId==36) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_37( ((A14810MAlqParId==37) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_38( ((A14810MAlqParId==38) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_39( ((A14810MAlqParId==39) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_40( ((A14810MAlqParId==40) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_41( ((A14810MAlqParId==41) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_42( ((A14810MAlqParId==42) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_43( ((A14810MAlqParId==43) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_44( ((A14810MAlqParId==44) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_45( ((A14810MAlqParId==45) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_46( ((A14810MAlqParId==46) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_47( ((A14810MAlqParId==47) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_48( ((A14810MAlqParId==48) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_49( ((A14810MAlqParId==49) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_50( ((A14810MAlqParId==50) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_51( ((A14810MAlqParId==51) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_52( ((A14810MAlqParId==52) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_53( ((A14810MAlqParId==53) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_54( ((A14810MAlqParId==54) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_55( ((A14810MAlqParId==55) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_56( ((A14810MAlqParId==56) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_57( ((A14810MAlqParId==57) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_58( ((A14810MAlqParId==58) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_59( ((A14810MAlqParId==59) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_60( ((A14810MAlqParId==60) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_61( ((A14810MAlqParId==61) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_62( ((A14810MAlqParId==62) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_63( ((A14810MAlqParId==63) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_64( ((A14810MAlqParId==64) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_65( ((A14810MAlqParId==65) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_66( ((A14810MAlqParId==66) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_67( ((A14810MAlqParId==67) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_68( ((A14810MAlqParId==68) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_69( ((A14810MAlqParId==69) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_70( ((A14810MAlqParId==70) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_71( ((A14810MAlqParId==71) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_72( ((A14810MAlqParId==72) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_73( ((A14810MAlqParId==73) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_74( ((A14810MAlqParId==74) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_75( ((A14810MAlqParId==75) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_76( ((A14810MAlqParId==76) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_77( ((A14810MAlqParId==77) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_78( ((A14810MAlqParId==78) ? A14805MAlqVal : "0") );
         Gxm1mrec_analisissdt.setgxTv_SdtMRec_AnalisisSDT_Mprecplc_79( ((A14810MAlqParId==79) ? A14805MAlqVal : "0") );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP13[0] = mrec_alertamaquinadp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>(app.ingenieria.SdtMRec_AnalisisSDT.class, "MRec_AnalisisSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A14790MAlqMaqCod = "" ;
      A14792MAlqFasCod = "" ;
      A14797MAlqHdr = "" ;
      A14798MAlqHdr2 = "" ;
      A14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
      A14789MAlqEmprCo = "" ;
      A14811MAlqUsu = "" ;
      A14812MAlqIp = "" ;
      A14814MAlqTkn = "" ;
      A14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
      P005B2_A14789MAlqEmprCo = new String[] {""} ;
      P005B2_A14811MAlqUsu = new String[] {""} ;
      P005B2_A14812MAlqIp = new String[] {""} ;
      P005B2_A14814MAlqTkn = new String[] {""} ;
      P005B2_A14813MAlqReg = new java.util.Date[] {GXutil.nullDate()} ;
      P005B2_A14808MAlqEr = new boolean[] {false} ;
      P005B2_A14799MAlqParCod = new short[1] ;
      P005B2_A14798MAlqHdr2 = new String[] {""} ;
      P005B2_A14797MAlqHdr = new String[] {""} ;
      P005B2_A14792MAlqFasCod = new String[] {""} ;
      P005B2_A14790MAlqMaqCod = new String[] {""} ;
      P005B2_A14804MAlqFec = new java.util.Date[] {GXutil.nullDate()} ;
      P005B2_A14805MAlqVal = new String[] {""} ;
      P005B2_A14810MAlqParId = new long[1] ;
      P005B2_A14788MAlqId = new long[1] ;
      A14805MAlqVal = "" ;
      Gxm1mrec_analisissdt = new app.ingenieria.SdtMRec_AnalisisSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_alertamaquinadp__default(),
         new Object[] {
             new Object[] {
            P005B2_A14789MAlqEmprCo, P005B2_A14811MAlqUsu, P005B2_A14812MAlqIp, P005B2_A14814MAlqTkn, P005B2_A14813MAlqReg, P005B2_A14808MAlqEr, P005B2_A14799MAlqParCod, P005B2_A14798MAlqHdr2, P005B2_A14797MAlqHdr, P005B2_A14792MAlqFasCod,
            P005B2_A14790MAlqMaqCod, P005B2_A14804MAlqFec, P005B2_A14805MAlqVal, P005B2_A14810MAlqParId, P005B2_A14788MAlqId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Espacios ;
   private short A14799MAlqParCod ;
   private short Gx_err ;
   private int AV12MaqCodCollection_size ;
   private int AV7FasCodCollection_size ;
   private int AV10HdrCollection_size ;
   private int AV14ParFasCodCollection_size ;
   private long A14810MAlqParId ;
   private long A14788MAlqId ;
   private String AV6EmprCod ;
   private String AV15UsurCod ;
   private String scmdbuf ;
   private String A14790MAlqMaqCod ;
   private String A14792MAlqFasCod ;
   private String A14797MAlqHdr ;
   private String A14789MAlqEmprCo ;
   private String A14811MAlqUsu ;
   private String A14805MAlqVal ;
   private java.util.Date AV5Desde ;
   private java.util.Date AV9Hasta ;
   private java.util.Date AV16Now ;
   private java.util.Date A14813MAlqReg ;
   private java.util.Date A14804MAlqFec ;
   private boolean AV8FueraRango ;
   private boolean A14808MAlqEr ;
   private String AV11Ip ;
   private String AV17MTkn ;
   private String A14798MAlqHdr2 ;
   private String A14812MAlqIp ;
   private String A14814MAlqTkn ;
   private GXSimpleCollection<Short> AV14ParFasCodCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P005B2_A14789MAlqEmprCo ;
   private String[] P005B2_A14811MAlqUsu ;
   private String[] P005B2_A14812MAlqIp ;
   private String[] P005B2_A14814MAlqTkn ;
   private java.util.Date[] P005B2_A14813MAlqReg ;
   private boolean[] P005B2_A14808MAlqEr ;
   private short[] P005B2_A14799MAlqParCod ;
   private String[] P005B2_A14798MAlqHdr2 ;
   private String[] P005B2_A14797MAlqHdr ;
   private String[] P005B2_A14792MAlqFasCod ;
   private String[] P005B2_A14790MAlqMaqCod ;
   private java.util.Date[] P005B2_A14804MAlqFec ;
   private String[] P005B2_A14805MAlqVal ;
   private long[] P005B2_A14810MAlqParId ;
   private long[] P005B2_A14788MAlqId ;
   private GXSimpleCollection<String> AV12MaqCodCollection ;
   private GXSimpleCollection<String> AV7FasCodCollection ;
   private GXSimpleCollection<String> AV10HdrCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> Gxm2rootcol ;
   private app.ingenieria.SdtMRec_AnalisisSDT Gxm1mrec_analisissdt ;
}

final  class mrec_alertamaquinadp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P005B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14790MAlqMaqCod ,
                                          GXSimpleCollection<String> AV12MaqCodCollection ,
                                          String A14792MAlqFasCod ,
                                          GXSimpleCollection<String> AV7FasCodCollection ,
                                          String A14797MAlqHdr ,
                                          GXSimpleCollection<String> AV10HdrCollection ,
                                          String A14798MAlqHdr2 ,
                                          short A14799MAlqParCod ,
                                          GXSimpleCollection<Short> AV14ParFasCodCollection ,
                                          int AV12MaqCodCollection_size ,
                                          int AV7FasCodCollection_size ,
                                          int AV10HdrCollection_size ,
                                          byte AV18Espacios ,
                                          int AV14ParFasCodCollection_size ,
                                          boolean AV8FueraRango ,
                                          boolean A14808MAlqEr ,
                                          java.util.Date A14813MAlqReg ,
                                          java.util.Date AV16Now ,
                                          String A14789MAlqEmprCo ,
                                          String AV6EmprCod ,
                                          String A14811MAlqUsu ,
                                          String AV15UsurCod ,
                                          String A14812MAlqIp ,
                                          String AV11Ip ,
                                          String A14814MAlqTkn ,
                                          String AV17MTkn ,
                                          java.util.Date AV5Desde ,
                                          java.util.Date A14804MAlqFec ,
                                          java.util.Date AV9Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT MAlqEmprCo, MAlqUsu, MAlqIp, MAlqTkn, MAlqReg, MAlqEr, MAlqParCod, MAlqHdr2, MAlqHdr, MAlqFasCod, MAlqMaqCod, MAlqFec, MAlqVal, MAlqParId, MAlqId FROM MAlq" ;
      addWhere(sWhereString, "(MAlqFec >= ?)");
      addWhere(sWhereString, "(MAlqReg >= ?)");
      addWhere(sWhereString, "(MAlqEmprCo = ?)");
      addWhere(sWhereString, "(MAlqUsu = ?)");
      addWhere(sWhereString, "(MAlqIp = ?)");
      addWhere(sWhereString, "(MAlqTkn = ?)");
      addWhere(sWhereString, "(MAlqFec <= ?)");
      if ( AV12MaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV12MaqCodCollection, "MAlqMaqCod IN (", ")")+")");
      }
      if ( AV7FasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV7FasCodCollection, "MAlqFasCod IN (", ")")+")");
      }
      if ( ( AV10HdrCollection_size > 0 ) && ( AV18Espacios == 1 ) )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10HdrCollection, "MAlqHdr IN (", ")")+")");
      }
      if ( ( AV10HdrCollection_size > 0 ) && ( AV18Espacios == 2 ) )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10HdrCollection, "MAlqHdr2 IN (", ")")+")");
      }
      if ( AV14ParFasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV14ParFasCodCollection, "MAlqParCod IN (", ")")+")");
      }
      if ( AV8FueraRango )
      {
         addWhere(sWhereString, "(MAlqEr = 1)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAlqFec" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P005B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Boolean) dynConstraints[14]).booleanValue() , ((Boolean) dynConstraints[15]).booleanValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 12);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 256);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

