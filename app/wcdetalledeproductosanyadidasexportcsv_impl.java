package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdetalledeproductosanyadidasexportcsv_impl extends GXWebProcedure
{
   public wcdetalledeproductosanyadidasexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "WCDetalledeProductosAnyadidasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      AV14TextFileLine += httpContext.getMessage( "Producto", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Descripcion", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Cantidad", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Adicion", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Nº Orden", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Tq", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Usuario", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Fecha", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Wcdetalledeproductosanyadidasds_1_tfprdnum = AV34TFPrdNum ;
      AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV36TFHrdPrdDsc ;
      AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV37TFHrdPrdDsc_Sel ;
      AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV38TFHreLanyCan ;
      AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV39TFHreLanyCan_To ;
      AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV40TFHrePrdCFin ;
      AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV41TFHrePrdCFin_To ;
      AV67Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV42TFHreLanyNro ;
      AV68Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV43TFHreLanyNro_To ;
      AV69Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV44TFHreLanyTnq ;
      AV70Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV45TFHreLanyTnq_To ;
      AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV46TFHreLanyUsr ;
      AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV47TFHreLanyUsr_Sel ;
      AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV48TFHreLanyFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                           AV59Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                           AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                           AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                           AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                           AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                           AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                           AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                           Byte.valueOf(AV67Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                           Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                           Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                           Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                           AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                           AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                           AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A4513HreLanyCan ,
                                           A4511HrePrdCFin ,
                                           Byte.valueOf(A4514HreLanyNro) ,
                                           Byte.valueOf(A4515HreLanyTnq) ,
                                           A4580HreLanyUsr ,
                                           A4581HreLanyFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV50EmprCod ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           AV53HreBarPar ,
                                           Byte.valueOf(AV54HreNumCie) ,
                                           Short.valueOf(AV55HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4508HreLinMAL) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV59Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV59Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
      lV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
      lV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
      /* Using cursor P08ZG2 */
      pr_default.execute(0, new Object[] {AV50EmprCod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarPar, Byte.valueOf(AV54HreNumCie), Short.valueOf(AV55HreLinMaq), lV59Wcdetalledeproductosanyadidasds_1_tfprdnum, AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV67Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4508HreLinMAL = P08ZG2_A4508HreLinMAL[0] ;
         A4495HreNumCie = P08ZG2_A4495HreNumCie[0] ;
         A4494HreBarPar = P08ZG2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08ZG2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08ZG2_A4492HreBarCod[0] ;
         A396EmprCod = P08ZG2_A396EmprCod[0] ;
         A4581HreLanyFec = P08ZG2_A4581HreLanyFec[0] ;
         n4581HreLanyFec = P08ZG2_n4581HreLanyFec[0] ;
         A4580HreLanyUsr = P08ZG2_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = P08ZG2_n4580HreLanyUsr[0] ;
         A4515HreLanyTnq = P08ZG2_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = P08ZG2_n4515HreLanyTnq[0] ;
         A4514HreLanyNro = P08ZG2_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P08ZG2_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P08ZG2_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P08ZG2_n4511HrePrdCFin[0] ;
         A4513HreLanyCan = P08ZG2_A4513HreLanyCan[0] ;
         n4513HreLanyCan = P08ZG2_n4513HreLanyCan[0] ;
         A4510HrdPrdDsc = P08ZG2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P08ZG2_n4510HrdPrdDsc[0] ;
         A719PrdNum = P08ZG2_A719PrdNum[0] ;
         A4509HreNumAny = P08ZG2_A4509HreNumAny[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
         wcdetalledeproductosanyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4510HrdPrdDsc, ";", ","), GXv_char3) ;
         wcdetalledeproductosanyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4513HreLanyCan, 11, 3) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4511HrePrdCFin, 11, 3) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4514HreLanyNro, 2, 0) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4515HreLanyTnq, 2, 0) ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4580HreLanyUsr, ";", ","), GXv_char3) ;
         wcdetalledeproductosanyadidasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.ttoc( A4581HreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10TextFile.writeLine(AV14TextFileLine);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCDetalledeProductosAnyadidasExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCDetalledeProductosAnyadidasGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetalledeProductosAnyadidasGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCDetalledeProductosAnyadidasGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV36TFHrdPrdDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV37TFHrdPrdDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYCAN") == 0 )
         {
            AV38TFHreLanyCan = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFHreLanyCan_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCFIN") == 0 )
         {
            AV40TFHrePrdCFin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHrePrdCFin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYNRO") == 0 )
         {
            AV42TFHreLanyNro = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFHreLanyNro_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYTNQ") == 0 )
         {
            AV44TFHreLanyTnq = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFHreLanyTnq_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR") == 0 )
         {
            AV46TFHreLanyUsr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR_SEL") == 0 )
         {
            AV47TFHreLanyUsr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYFEC") == 0 )
         {
            AV48TFHreLanyFec = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV50EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV51HreBarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV52HreBarReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV53HreBarPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV54HreNumCie = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV55HreLinMaq = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S162( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV59Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      AV34TFPrdNum = "" ;
      AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = "" ;
      AV35TFPrdNum_Sel = "" ;
      AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      AV36TFHrdPrdDsc = "" ;
      AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = "" ;
      AV37TFHrdPrdDsc_Sel = "" ;
      AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan = DecimalUtil.ZERO ;
      AV38TFHreLanyCan = DecimalUtil.ZERO ;
      AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = DecimalUtil.ZERO ;
      AV39TFHreLanyCan_To = DecimalUtil.ZERO ;
      AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = DecimalUtil.ZERO ;
      AV40TFHrePrdCFin = DecimalUtil.ZERO ;
      AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = DecimalUtil.ZERO ;
      AV41TFHrePrdCFin_To = DecimalUtil.ZERO ;
      AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      AV46TFHreLanyUsr = "" ;
      AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = "" ;
      AV47TFHreLanyUsr_Sel = "" ;
      AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = GXutil.resetTime( GXutil.nullDate() );
      AV48TFHreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV59Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      lV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      lV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      AV50EmprCod = "" ;
      AV53HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08ZG2_A4508HreLinMAL = new short[1] ;
      P08ZG2_A4495HreNumCie = new byte[1] ;
      P08ZG2_A4494HreBarPar = new String[] {""} ;
      P08ZG2_A4493HreBarReo = new byte[1] ;
      P08ZG2_A4492HreBarCod = new int[1] ;
      P08ZG2_A396EmprCod = new String[] {""} ;
      P08ZG2_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZG2_n4581HreLanyFec = new boolean[] {false} ;
      P08ZG2_A4580HreLanyUsr = new String[] {""} ;
      P08ZG2_n4580HreLanyUsr = new boolean[] {false} ;
      P08ZG2_A4515HreLanyTnq = new byte[1] ;
      P08ZG2_n4515HreLanyTnq = new boolean[] {false} ;
      P08ZG2_A4514HreLanyNro = new byte[1] ;
      P08ZG2_n4514HreLanyNro = new boolean[] {false} ;
      P08ZG2_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZG2_n4511HrePrdCFin = new boolean[] {false} ;
      P08ZG2_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZG2_n4513HreLanyCan = new boolean[] {false} ;
      P08ZG2_A4510HrdPrdDsc = new String[] {""} ;
      P08ZG2_n4510HrdPrdDsc = new boolean[] {false} ;
      P08ZG2_A719PrdNum = new String[] {""} ;
      P08ZG2_A4509HreNumAny = new byte[1] ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV19Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalledeproductosanyadidasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08ZG2_A4508HreLinMAL, P08ZG2_A4495HreNumCie, P08ZG2_A4494HreBarPar, P08ZG2_A4493HreBarReo, P08ZG2_A4492HreBarCod, P08ZG2_A396EmprCod, P08ZG2_A4581HreLanyFec, P08ZG2_n4581HreLanyFec, P08ZG2_A4580HreLanyUsr, P08ZG2_n4580HreLanyUsr,
            P08ZG2_A4515HreLanyTnq, P08ZG2_n4515HreLanyTnq, P08ZG2_A4514HreLanyNro, P08ZG2_n4514HreLanyNro, P08ZG2_A4511HrePrdCFin, P08ZG2_n4511HrePrdCFin, P08ZG2_A4513HreLanyCan, P08ZG2_n4513HreLanyCan, P08ZG2_A4510HrdPrdDsc, P08ZG2_n4510HrdPrdDsc,
            P08ZG2_A719PrdNum, P08ZG2_A4509HreNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4514HreLanyNro ;
   private byte A4515HreLanyTnq ;
   private byte AV67Wcdetalledeproductosanyadidasds_9_tfhrelanynro ;
   private byte AV42TFHreLanyNro ;
   private byte AV68Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ;
   private byte AV43TFHreLanyNro_To ;
   private byte AV69Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ;
   private byte AV44TFHreLanyTnq ;
   private byte AV70Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ;
   private byte AV45TFHreLanyTnq_To ;
   private byte AV52HreBarReo ;
   private byte AV54HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV55HreLinMaq ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV51HreBarCod ;
   private int A4492HreBarCod ;
   private int AV74GXV1 ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan ;
   private java.math.BigDecimal AV38TFHreLanyCan ;
   private java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ;
   private java.math.BigDecimal AV39TFHreLanyCan_To ;
   private java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ;
   private java.math.BigDecimal AV40TFHrePrdCFin ;
   private java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ;
   private java.math.BigDecimal AV41TFHrePrdCFin_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A4510HrdPrdDsc ;
   private String A4580HreLanyUsr ;
   private String AV59Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String AV34TFPrdNum ;
   private String AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ;
   private String AV35TFPrdNum_Sel ;
   private String AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String AV36TFHrdPrdDsc ;
   private String AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ;
   private String AV37TFHrdPrdDsc_Sel ;
   private String AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String AV46TFHreLanyUsr ;
   private String AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ;
   private String AV47TFHreLanyUsr_Sel ;
   private String scmdbuf ;
   private String lV59Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String lV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String lV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String AV50EmprCod ;
   private String AV53HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4581HreLanyFec ;
   private java.util.Date AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ;
   private java.util.Date AV48TFHreLanyFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n4581HreLanyFec ;
   private boolean n4580HreLanyUsr ;
   private boolean n4515HreLanyTnq ;
   private boolean n4514HreLanyNro ;
   private boolean n4511HrePrdCFin ;
   private boolean n4513HreLanyCan ;
   private boolean n4510HrdPrdDsc ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08ZG2_A4508HreLinMAL ;
   private byte[] P08ZG2_A4495HreNumCie ;
   private String[] P08ZG2_A4494HreBarPar ;
   private byte[] P08ZG2_A4493HreBarReo ;
   private int[] P08ZG2_A4492HreBarCod ;
   private String[] P08ZG2_A396EmprCod ;
   private java.util.Date[] P08ZG2_A4581HreLanyFec ;
   private boolean[] P08ZG2_n4581HreLanyFec ;
   private String[] P08ZG2_A4580HreLanyUsr ;
   private boolean[] P08ZG2_n4580HreLanyUsr ;
   private byte[] P08ZG2_A4515HreLanyTnq ;
   private boolean[] P08ZG2_n4515HreLanyTnq ;
   private byte[] P08ZG2_A4514HreLanyNro ;
   private boolean[] P08ZG2_n4514HreLanyNro ;
   private java.math.BigDecimal[] P08ZG2_A4511HrePrdCFin ;
   private boolean[] P08ZG2_n4511HrePrdCFin ;
   private java.math.BigDecimal[] P08ZG2_A4513HreLanyCan ;
   private boolean[] P08ZG2_n4513HreLanyCan ;
   private String[] P08ZG2_A4510HrdPrdDsc ;
   private boolean[] P08ZG2_n4510HrdPrdDsc ;
   private String[] P08ZG2_A719PrdNum ;
   private byte[] P08ZG2_A4509HreNumAny ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class wcdetalledeproductosanyadidasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV59Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV67Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV68Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV69Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV70Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV50EmprCod ,
                                          int AV51HreBarCod ,
                                          byte AV52HreBarReo ,
                                          String AV53HreBarPar ,
                                          byte AV54HreNumCie ,
                                          short AV55HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4508HreLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT HreLinMAL, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreLanyFec, HreLanyUsr, HreLanyTnq, HreLanyNro, HrePrdCFin, HreLanyCan, HrdPrdDsc, PrdNum," ;
      scmdbuf += " HreNumAny FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY HreNumAny" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrdPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrdPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyCan" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyCan DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCFin" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdCFin DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyNro" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyNro DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyTnq" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyTnq DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyUsr" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyUsr DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyFec" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyFec DESC" ;
      }
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08ZG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               return;
      }
   }

}

