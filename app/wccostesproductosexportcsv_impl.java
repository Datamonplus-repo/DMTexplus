package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccostesproductosexportcsv_impl extends GXWebProcedure
{
   public wccostesproductosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCCostesProductosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += httpContext.getMessage( "Cant Ad", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Und", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Coste", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Precio", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Factor", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Wccostesproductosds_1_tfhreprdnum = AV45TFHrePrdNum ;
      AV62Wccostesproductosds_2_tfhreprdnum_sel = AV46TFHrePrdNum_Sel ;
      AV63Wccostesproductosds_3_tfhreprddsc = AV47TFHrePrdDsc ;
      AV64Wccostesproductosds_4_tfhreprddsc_sel = AV48TFHrePrdDsc_Sel ;
      AV65Wccostesproductosds_5_tfhreprdcant = AV49TFHrePrdCant ;
      AV66Wccostesproductosds_6_tfhreprdcant_to = AV50TFHrePrdCant_To ;
      AV67Wccostesproductosds_7_tfhreprduds = AV51TFHrePrdUDs ;
      AV68Wccostesproductosds_8_tfhreprduds_sel = AV52TFHrePrdUDs_Sel ;
      AV69Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV70Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV71Wccostesproductosds_11_tfprdfaccon = AV55TFPrdFacCon ;
      AV72Wccostesproductosds_12_tfprdfaccon_to = AV56TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV61Wccostesproductosds_1_tfhreprdnum ,
                                           AV64Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV63Wccostesproductosds_3_tfhreprddsc ,
                                           AV65Wccostesproductosds_5_tfhreprdcant ,
                                           AV66Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV68Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV67Wccostesproductosds_7_tfhreprduds ,
                                           AV69Wccostesproductosds_9_tfhrepreprd ,
                                           AV70Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV71Wccostesproductosds_11_tfprdfaccon ,
                                           AV72Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           A719PrdNum ,
                                           AV28Emprcod ,
                                           Integer.valueOf(AV29HreBarCod) ,
                                           Byte.valueOf(AV30HreBarReo) ,
                                           AV31HreBarpar ,
                                           Byte.valueOf(AV32HreNumCie) ,
                                           Short.valueOf(AV33HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV61Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV61Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV63Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV63Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV67Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV67Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor P08L62 */
      pr_default.execute(0, new Object[] {AV28Emprcod, Integer.valueOf(AV29HreBarCod), Byte.valueOf(AV30HreBarReo), AV31HreBarpar, Byte.valueOf(AV32HreNumCie), Short.valueOf(AV33HreLinMaq), lV61Wccostesproductosds_1_tfhreprdnum, AV62Wccostesproductosds_2_tfhreprdnum_sel, lV63Wccostesproductosds_3_tfhreprddsc, AV64Wccostesproductosds_4_tfhreprddsc_sel, AV65Wccostesproductosds_5_tfhreprdcant, AV66Wccostesproductosds_6_tfhreprdcant_to, lV67Wccostesproductosds_7_tfhreprduds, AV68Wccostesproductosds_8_tfhreprduds_sel, AV69Wccostesproductosds_9_tfhrepreprd, AV70Wccostesproductosds_10_tfhrepreprd_to, AV71Wccostesproductosds_11_tfprdfaccon, AV72Wccostesproductosds_12_tfprdfaccon_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P08L62_A719PrdNum[0] ;
         n719PrdNum = P08L62_n719PrdNum[0] ;
         A4545HreLinMaq = P08L62_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08L62_A4495HreNumCie[0] ;
         A4494HreBarPar = P08L62_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L62_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L62_A4492HreBarCod[0] ;
         A396EmprCod = P08L62_A396EmprCod[0] ;
         A707PrdFacCon = P08L62_A707PrdFacCon[0] ;
         A4967HrePrePrd = P08L62_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08L62_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P08L62_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08L62_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08L62_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08L62_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P08L62_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08L62_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08L62_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08L62_n4558HrePrdNum[0] ;
         A4565HreCanAny = P08L62_A4565HreCanAny[0] ;
         n4565HreCanAny = P08L62_n4565HreCanAny[0] ;
         A4557HreRecLin = P08L62_A4557HreRecLin[0] ;
         A4550HreLinPro = P08L62_A4550HreLinPro[0] ;
         A707PrdFacCon = P08L62_A707PrdFacCon[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4558HrePrdNum, ";", ","), GXv_char3) ;
         wccostesproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4559HrePrdDsc, ";", ","), GXv_char3) ;
         wccostesproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4563HrePrdCant, 11, 3) ;
         AV36HrePrdCant = ((A4565HreCanAny.doubleValue()>0) ? A4565HreCanAny : DecimalUtil.doubleToDec(0)) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV36HrePrdCant, 11, 3) ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4561HrePrdUDs, ";", ","), GXv_char3) ;
         wccostesproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV37Costelinea = GXutil.roundDecimal( (A4563HrePrdCant.add(AV73Cantad)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV37Costelinea, 11, 5) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4967HrePrePrd, 14, 5) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A707PrdFacCon, 7, 4) ;
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCCostesProductosExportCSV.csv");
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
      if ( GXutil.strcmp(AV19Session.getValue("WCCostesProductosGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCostesProductosGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV19Session.getValue("WCCostesProductosGridState"), null, null);
      }
      AV34OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV35OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV45TFHrePrdNum = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV46TFHrePrdNum_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV47TFHrePrdDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV48TFHrePrdDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV49TFHrePrdCant = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFHrePrdCant_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV51TFHrePrdUDs = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV52TFHrePrdUDs_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV53TFHrePrePrd = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFHrePrePrd_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV55TFPrdFacCon = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFPrdFacCon_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV29HreBarCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV30HreBarReo = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV31HreBarpar = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV32HreNumCie = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV33HreLinMaq = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      AV61Wccostesproductosds_1_tfhreprdnum = "" ;
      AV45TFHrePrdNum = "" ;
      AV62Wccostesproductosds_2_tfhreprdnum_sel = "" ;
      AV46TFHrePrdNum_Sel = "" ;
      AV63Wccostesproductosds_3_tfhreprddsc = "" ;
      AV47TFHrePrdDsc = "" ;
      AV64Wccostesproductosds_4_tfhreprddsc_sel = "" ;
      AV48TFHrePrdDsc_Sel = "" ;
      AV65Wccostesproductosds_5_tfhreprdcant = DecimalUtil.ZERO ;
      AV49TFHrePrdCant = DecimalUtil.ZERO ;
      AV66Wccostesproductosds_6_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV50TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV67Wccostesproductosds_7_tfhreprduds = "" ;
      AV51TFHrePrdUDs = "" ;
      AV68Wccostesproductosds_8_tfhreprduds_sel = "" ;
      AV52TFHrePrdUDs_Sel = "" ;
      AV69Wccostesproductosds_9_tfhrepreprd = DecimalUtil.ZERO ;
      AV53TFHrePrePrd = DecimalUtil.ZERO ;
      AV70Wccostesproductosds_10_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV54TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV71Wccostesproductosds_11_tfprdfaccon = DecimalUtil.ZERO ;
      AV55TFPrdFacCon = DecimalUtil.ZERO ;
      AV72Wccostesproductosds_12_tfprdfaccon_to = DecimalUtil.ZERO ;
      AV56TFPrdFacCon_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV61Wccostesproductosds_1_tfhreprdnum = "" ;
      lV63Wccostesproductosds_3_tfhreprddsc = "" ;
      lV67Wccostesproductosds_7_tfhreprduds = "" ;
      A719PrdNum = "" ;
      AV28Emprcod = "" ;
      AV31HreBarpar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08L62_A719PrdNum = new String[] {""} ;
      P08L62_n719PrdNum = new boolean[] {false} ;
      P08L62_A4545HreLinMaq = new short[1] ;
      P08L62_A4495HreNumCie = new byte[1] ;
      P08L62_A4494HreBarPar = new String[] {""} ;
      P08L62_A4493HreBarReo = new byte[1] ;
      P08L62_A4492HreBarCod = new int[1] ;
      P08L62_A396EmprCod = new String[] {""} ;
      P08L62_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L62_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L62_n4967HrePrePrd = new boolean[] {false} ;
      P08L62_A4561HrePrdUDs = new String[] {""} ;
      P08L62_n4561HrePrdUDs = new boolean[] {false} ;
      P08L62_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L62_n4563HrePrdCant = new boolean[] {false} ;
      P08L62_A4559HrePrdDsc = new String[] {""} ;
      P08L62_n4559HrePrdDsc = new boolean[] {false} ;
      P08L62_A4558HrePrdNum = new String[] {""} ;
      P08L62_n4558HrePrdNum = new boolean[] {false} ;
      P08L62_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L62_n4565HreCanAny = new boolean[] {false} ;
      P08L62_A4557HreRecLin = new short[1] ;
      P08L62_A4550HreLinPro = new byte[1] ;
      AV36HrePrdCant = DecimalUtil.ZERO ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV37Costelinea = DecimalUtil.ZERO ;
      AV73Cantad = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV19Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccostesproductosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08L62_A719PrdNum, P08L62_n719PrdNum, P08L62_A4545HreLinMaq, P08L62_A4495HreNumCie, P08L62_A4494HreBarPar, P08L62_A4493HreBarReo, P08L62_A4492HreBarCod, P08L62_A396EmprCod, P08L62_A707PrdFacCon, P08L62_A4967HrePrePrd,
            P08L62_n4967HrePrePrd, P08L62_A4561HrePrdUDs, P08L62_n4561HrePrdUDs, P08L62_A4563HrePrdCant, P08L62_n4563HrePrdCant, P08L62_A4559HrePrdDsc, P08L62_n4559HrePrdDsc, P08L62_A4558HrePrdNum, P08L62_n4558HrePrdNum, P08L62_A4565HreCanAny,
            P08L62_n4565HreCanAny, P08L62_A4557HreRecLin, P08L62_A4550HreLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30HreBarReo ;
   private byte AV32HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short gxcookieaux ;
   private short AV34OrderedBy ;
   private short AV33HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV29HreBarCod ;
   private int A4492HreBarCod ;
   private int AV74GXV1 ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal AV65Wccostesproductosds_5_tfhreprdcant ;
   private java.math.BigDecimal AV49TFHrePrdCant ;
   private java.math.BigDecimal AV66Wccostesproductosds_6_tfhreprdcant_to ;
   private java.math.BigDecimal AV50TFHrePrdCant_To ;
   private java.math.BigDecimal AV69Wccostesproductosds_9_tfhrepreprd ;
   private java.math.BigDecimal AV53TFHrePrePrd ;
   private java.math.BigDecimal AV70Wccostesproductosds_10_tfhrepreprd_to ;
   private java.math.BigDecimal AV54TFHrePrePrd_To ;
   private java.math.BigDecimal AV71Wccostesproductosds_11_tfprdfaccon ;
   private java.math.BigDecimal AV55TFPrdFacCon ;
   private java.math.BigDecimal AV72Wccostesproductosds_12_tfprdfaccon_to ;
   private java.math.BigDecimal AV56TFPrdFacCon_To ;
   private java.math.BigDecimal AV36HrePrdCant ;
   private java.math.BigDecimal AV37Costelinea ;
   private java.math.BigDecimal AV73Cantad ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String AV61Wccostesproductosds_1_tfhreprdnum ;
   private String AV45TFHrePrdNum ;
   private String AV62Wccostesproductosds_2_tfhreprdnum_sel ;
   private String AV46TFHrePrdNum_Sel ;
   private String AV63Wccostesproductosds_3_tfhreprddsc ;
   private String AV47TFHrePrdDsc ;
   private String AV64Wccostesproductosds_4_tfhreprddsc_sel ;
   private String AV48TFHrePrdDsc_Sel ;
   private String AV67Wccostesproductosds_7_tfhreprduds ;
   private String AV51TFHrePrdUDs ;
   private String AV68Wccostesproductosds_8_tfhreprduds_sel ;
   private String AV52TFHrePrdUDs_Sel ;
   private String scmdbuf ;
   private String lV61Wccostesproductosds_1_tfhreprdnum ;
   private String lV63Wccostesproductosds_3_tfhreprddsc ;
   private String lV67Wccostesproductosds_7_tfhreprduds ;
   private String A719PrdNum ;
   private String AV28Emprcod ;
   private String AV31HreBarpar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV35OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n4565HreCanAny ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08L62_A719PrdNum ;
   private boolean[] P08L62_n719PrdNum ;
   private short[] P08L62_A4545HreLinMaq ;
   private byte[] P08L62_A4495HreNumCie ;
   private String[] P08L62_A4494HreBarPar ;
   private byte[] P08L62_A4493HreBarReo ;
   private int[] P08L62_A4492HreBarCod ;
   private String[] P08L62_A396EmprCod ;
   private java.math.BigDecimal[] P08L62_A707PrdFacCon ;
   private java.math.BigDecimal[] P08L62_A4967HrePrePrd ;
   private boolean[] P08L62_n4967HrePrePrd ;
   private String[] P08L62_A4561HrePrdUDs ;
   private boolean[] P08L62_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08L62_A4563HrePrdCant ;
   private boolean[] P08L62_n4563HrePrdCant ;
   private String[] P08L62_A4559HrePrdDsc ;
   private boolean[] P08L62_n4559HrePrdDsc ;
   private String[] P08L62_A4558HrePrdNum ;
   private boolean[] P08L62_n4558HrePrdNum ;
   private java.math.BigDecimal[] P08L62_A4565HreCanAny ;
   private boolean[] P08L62_n4565HreCanAny ;
   private short[] P08L62_A4557HreRecLin ;
   private byte[] P08L62_A4550HreLinPro ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class wccostesproductosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08L62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV61Wccostesproductosds_1_tfhreprdnum ,
                                          String AV64Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV63Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV65Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV66Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV68Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV67Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV69Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV70Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV71Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV72Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV28Emprcod ,
                                          int AV29HreBarCod ,
                                          byte AV30HreBarReo ,
                                          String AV31HreBarpar ,
                                          byte AV32HreNumCie ,
                                          short AV33HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant, T1.HrePrdDsc," ;
      scmdbuf += " T1.HrePrdNum, T1.HreCanAny, T1.HreRecLin, T1.HreLinPro FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      if ( (GXutil.strcmp("", AV62Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV67Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.HreLinPro" ;
      }
      else if ( AV34OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY T1.HreRecLin" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon DESC" ;
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
                  return conditional_P08L62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08L62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((byte[]) buf[22])[0] = rslt.getByte(16);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

