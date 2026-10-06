package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclientwwexportcsv_impl extends GXWebProcedure
{
   public tclientwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV104cliact = AV105WebSession.getValue("&CliAct") ;
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
      S191 ();
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
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
      AV11Filename = "./PrivateTempStorage/" + "TCLIENTWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TCLIENTWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TCLIENTWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Poblacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "C. Postal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "C. Postal(Cont)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Provincia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activo?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV109Tclientwwds_1_filterfulltext = AV100FilterFullText ;
      AV110Tclientwwds_2_tfclicod = AV60TFCliCod ;
      AV111Tclientwwds_3_tfclicod_to = AV61TFCliCod_To ;
      AV112Tclientwwds_4_tfclinom = AV64TFCliNom ;
      AV113Tclientwwds_5_tfclinom_sel = AV65TFCliNom_Sel ;
      AV114Tclientwwds_6_tfclinif = AV62TFCliNif ;
      AV115Tclientwwds_7_tfclinif_sel = AV63TFCliNif_Sel ;
      AV116Tclientwwds_8_tfclidom = AV66TFCliDom ;
      AV117Tclientwwds_9_tfclidom_sel = AV67TFCliDom_Sel ;
      AV118Tclientwwds_10_tfclipob = AV68TFCliPob ;
      AV119Tclientwwds_11_tfclipob_sel = AV69TFCliPob_Sel ;
      AV120Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV121Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV122Tclientwwds_14_tfclicp2 = AV101TFCliCp2 ;
      AV123Tclientwwds_15_tfclicp2_sel = AV102TFCliCp2_Sel ;
      AV124Tclientwwds_16_tfprvdsc = AV74TFPrvDsc ;
      AV125Tclientwwds_17_tfprvdsc_sel = AV75TFPrvDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV109Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV110Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV111Tclientwwds_3_tfclicod_to) ,
                                           AV113Tclientwwds_5_tfclinom_sel ,
                                           AV112Tclientwwds_4_tfclinom ,
                                           AV115Tclientwwds_7_tfclinif_sel ,
                                           AV114Tclientwwds_6_tfclinif ,
                                           AV117Tclientwwds_9_tfclidom_sel ,
                                           AV116Tclientwwds_8_tfclidom ,
                                           AV119Tclientwwds_11_tfclipob_sel ,
                                           AV118Tclientwwds_10_tfclipob ,
                                           AV121Tclientwwds_13_tfclicp_sel ,
                                           AV120Tclientwwds_12_tfclicp ,
                                           AV123Tclientwwds_15_tfclicp2_sel ,
                                           AV122Tclientwwds_14_tfclicp2 ,
                                           AV125Tclientwwds_17_tfprvdsc_sel ,
                                           AV124Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A10045CliAct ,
                                           AV104cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV109Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Tclientwwds_1_filterfulltext), "%", "") ;
      lV112Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_4_tfclinom), 30, "%") ;
      lV114Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_6_tfclinif), 20, "%") ;
      lV116Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_8_tfclidom), 34, "%") ;
      lV118Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_10_tfclipob), 30, "%") ;
      lV120Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV120Tclientwwds_12_tfclicp), 6, "%") ;
      lV122Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV122Tclientwwds_14_tfclicp2), 6, "%") ;
      lV124Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV124Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082J2 */
      pr_default.execute(0, new Object[] {AV104cliact, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, lV109Tclientwwds_1_filterfulltext, Integer.valueOf(AV110Tclientwwds_2_tfclicod), Integer.valueOf(AV111Tclientwwds_3_tfclicod_to), lV112Tclientwwds_4_tfclinom, AV113Tclientwwds_5_tfclinom_sel, lV114Tclientwwds_6_tfclinif, AV115Tclientwwds_7_tfclinif_sel, lV116Tclientwwds_8_tfclidom, AV117Tclientwwds_9_tfclidom_sel, lV118Tclientwwds_10_tfclipob, AV119Tclientwwds_11_tfclipob_sel, lV120Tclientwwds_12_tfclicp, AV121Tclientwwds_13_tfclicp_sel, lV122Tclientwwds_14_tfclicp2, AV123Tclientwwds_15_tfclicp2_sel, lV124Tclientwwds_16_tfprvdsc, AV125Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A781PrvCod = P082J2_A781PrvCod[0] ;
         A10045CliAct = P082J2_A10045CliAct[0] ;
         A787PrvDsc = P082J2_A787PrvDsc[0] ;
         n787PrvDsc = P082J2_n787PrvDsc[0] ;
         A4828CliCp2 = P082J2_A4828CliCp2[0] ;
         A256CliCp = P082J2_A256CliCp[0] ;
         A295CliPob = P082J2_A295CliPob[0] ;
         A260CliDom = P082J2_A260CliDom[0] ;
         A278CliNif = P082J2_A278CliNif[0] ;
         A279CliNom = P082J2_A279CliNom[0] ;
         A252CliCod = P082J2_A252CliCod[0] ;
         A396EmprCod = P082J2_A396EmprCod[0] ;
         A787PrvDsc = P082J2_A787PrvDsc[0] ;
         n787PrvDsc = P082J2_n787PrvDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A278CliNif, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A260CliDom, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A295CliPob, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A256CliCp, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4828CliCp2, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A787PrvDsc, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10045CliAct, ";", ","), GXv_char3) ;
            tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TCLIENTWWExportCSV.csv");
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

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNif", "", "Nif", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliDom", "", "Domicilio ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliPob", "", "Poblacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCp", "", "C. Postal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCp2", "", "C. Postal(Cont)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDsc", "", "Provincia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliAct", "", "Activo?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TCLIENTWWColumnsSelector", GXv_char3) ;
      tclientwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TCLIENTWWGridState"), "") == 0 )
      {
         AV58GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCLIENTWWGridState"), null, null);
      }
      else
      {
         AV58GridState.fromxml(AV19Session.getValue("TCLIENTWWGridState"), null, null);
      }
      AV28OrderedBy = AV58GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV58GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV126GXV1 = 1 ;
      while ( AV126GXV1 <= AV58GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV59GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV58GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV1));
         if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV100FilterFullText = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCliCod_To = (int)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV64TFCliNom = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV65TFCliNom_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF") == 0 )
         {
            AV62TFCliNif = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF_SEL") == 0 )
         {
            AV63TFCliNif_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM") == 0 )
         {
            AV66TFCliDom = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM_SEL") == 0 )
         {
            AV67TFCliDom_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB") == 0 )
         {
            AV68TFCliPob = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB_SEL") == 0 )
         {
            AV69TFCliPob_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP") == 0 )
         {
            AV70TFCliCp = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP_SEL") == 0 )
         {
            AV71TFCliCp_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2") == 0 )
         {
            AV101TFCliCp2 = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2_SEL") == 0 )
         {
            AV102TFCliCp2_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV74TFPrvDsc = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV75TFPrvDsc_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV126GXV1 = (int)(AV126GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
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
      AV104cliact = "" ;
      AV105WebSession = httpContext.getWebSession();
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A279CliNom = "" ;
      A278CliNif = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A4828CliCp2 = "" ;
      A787PrvDsc = "" ;
      A10045CliAct = "" ;
      AV109Tclientwwds_1_filterfulltext = "" ;
      AV100FilterFullText = "" ;
      AV112Tclientwwds_4_tfclinom = "" ;
      AV64TFCliNom = "" ;
      AV113Tclientwwds_5_tfclinom_sel = "" ;
      AV65TFCliNom_Sel = "" ;
      AV114Tclientwwds_6_tfclinif = "" ;
      AV62TFCliNif = "" ;
      AV115Tclientwwds_7_tfclinif_sel = "" ;
      AV63TFCliNif_Sel = "" ;
      AV116Tclientwwds_8_tfclidom = "" ;
      AV66TFCliDom = "" ;
      AV117Tclientwwds_9_tfclidom_sel = "" ;
      AV67TFCliDom_Sel = "" ;
      AV118Tclientwwds_10_tfclipob = "" ;
      AV68TFCliPob = "" ;
      AV119Tclientwwds_11_tfclipob_sel = "" ;
      AV69TFCliPob_Sel = "" ;
      AV120Tclientwwds_12_tfclicp = "" ;
      AV70TFCliCp = "" ;
      AV121Tclientwwds_13_tfclicp_sel = "" ;
      AV71TFCliCp_Sel = "" ;
      AV122Tclientwwds_14_tfclicp2 = "" ;
      AV101TFCliCp2 = "" ;
      AV123Tclientwwds_15_tfclicp2_sel = "" ;
      AV102TFCliCp2_Sel = "" ;
      AV124Tclientwwds_16_tfprvdsc = "" ;
      AV74TFPrvDsc = "" ;
      AV125Tclientwwds_17_tfprvdsc_sel = "" ;
      AV75TFPrvDsc_Sel = "" ;
      scmdbuf = "" ;
      lV109Tclientwwds_1_filterfulltext = "" ;
      lV112Tclientwwds_4_tfclinom = "" ;
      lV114Tclientwwds_6_tfclinif = "" ;
      lV116Tclientwwds_8_tfclidom = "" ;
      lV118Tclientwwds_10_tfclipob = "" ;
      lV120Tclientwwds_12_tfclicp = "" ;
      lV122Tclientwwds_14_tfclicp2 = "" ;
      lV124Tclientwwds_16_tfprvdsc = "" ;
      P082J2_A781PrvCod = new short[1] ;
      P082J2_A10045CliAct = new String[] {""} ;
      P082J2_A787PrvDsc = new String[] {""} ;
      P082J2_n787PrvDsc = new boolean[] {false} ;
      P082J2_A4828CliCp2 = new String[] {""} ;
      P082J2_A256CliCp = new String[] {""} ;
      P082J2_A295CliPob = new String[] {""} ;
      P082J2_A260CliDom = new String[] {""} ;
      P082J2_A278CliNif = new String[] {""} ;
      P082J2_A279CliNom = new String[] {""} ;
      P082J2_A252CliCod = new int[1] ;
      P082J2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV58GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV59GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P082J2_A781PrvCod, P082J2_A10045CliAct, P082J2_A787PrvDsc, P082J2_n787PrvDsc, P082J2_A4828CliCp2, P082J2_A256CliCp, P082J2_A295CliPob, P082J2_A260CliDom, P082J2_A278CliNif, P082J2_A279CliNom,
            P082J2_A252CliCod, P082J2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int AV110Tclientwwds_2_tfclicod ;
   private int AV60TFCliCod ;
   private int AV111Tclientwwds_3_tfclicod_to ;
   private int AV61TFCliCod_To ;
   private int AV126GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV104cliact ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A4828CliCp2 ;
   private String A787PrvDsc ;
   private String A10045CliAct ;
   private String AV112Tclientwwds_4_tfclinom ;
   private String AV64TFCliNom ;
   private String AV113Tclientwwds_5_tfclinom_sel ;
   private String AV65TFCliNom_Sel ;
   private String AV114Tclientwwds_6_tfclinif ;
   private String AV62TFCliNif ;
   private String AV115Tclientwwds_7_tfclinif_sel ;
   private String AV63TFCliNif_Sel ;
   private String AV116Tclientwwds_8_tfclidom ;
   private String AV66TFCliDom ;
   private String AV117Tclientwwds_9_tfclidom_sel ;
   private String AV67TFCliDom_Sel ;
   private String AV118Tclientwwds_10_tfclipob ;
   private String AV68TFCliPob ;
   private String AV119Tclientwwds_11_tfclipob_sel ;
   private String AV69TFCliPob_Sel ;
   private String AV120Tclientwwds_12_tfclicp ;
   private String AV70TFCliCp ;
   private String AV121Tclientwwds_13_tfclicp_sel ;
   private String AV71TFCliCp_Sel ;
   private String AV122Tclientwwds_14_tfclicp2 ;
   private String AV101TFCliCp2 ;
   private String AV123Tclientwwds_15_tfclicp2_sel ;
   private String AV102TFCliCp2_Sel ;
   private String AV124Tclientwwds_16_tfprvdsc ;
   private String AV74TFPrvDsc ;
   private String AV125Tclientwwds_17_tfprvdsc_sel ;
   private String AV75TFPrvDsc_Sel ;
   private String scmdbuf ;
   private String lV112Tclientwwds_4_tfclinom ;
   private String lV114Tclientwwds_6_tfclinif ;
   private String lV116Tclientwwds_8_tfclidom ;
   private String lV118Tclientwwds_10_tfclipob ;
   private String lV120Tclientwwds_12_tfclicp ;
   private String lV122Tclientwwds_14_tfclicp2 ;
   private String lV124Tclientwwds_16_tfprvdsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n787PrvDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV109Tclientwwds_1_filterfulltext ;
   private String AV100FilterFullText ;
   private String lV109Tclientwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV105WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P082J2_A781PrvCod ;
   private String[] P082J2_A10045CliAct ;
   private String[] P082J2_A787PrvDsc ;
   private boolean[] P082J2_n787PrvDsc ;
   private String[] P082J2_A4828CliCp2 ;
   private String[] P082J2_A256CliCp ;
   private String[] P082J2_A295CliPob ;
   private String[] P082J2_A260CliDom ;
   private String[] P082J2_A278CliNif ;
   private String[] P082J2_A279CliNom ;
   private int[] P082J2_A252CliCod ;
   private String[] P082J2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV58GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV59GridStateFilterValue ;
}

final  class tclientwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P082J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV109Tclientwwds_1_filterfulltext ,
                                          int AV110Tclientwwds_2_tfclicod ,
                                          int AV111Tclientwwds_3_tfclicod_to ,
                                          String AV113Tclientwwds_5_tfclinom_sel ,
                                          String AV112Tclientwwds_4_tfclinom ,
                                          String AV115Tclientwwds_7_tfclinif_sel ,
                                          String AV114Tclientwwds_6_tfclinif ,
                                          String AV117Tclientwwds_9_tfclidom_sel ,
                                          String AV116Tclientwwds_8_tfclidom ,
                                          String AV119Tclientwwds_11_tfclipob_sel ,
                                          String AV118Tclientwwds_10_tfclipob ,
                                          String AV121Tclientwwds_13_tfclicp_sel ,
                                          String AV120Tclientwwds_12_tfclicp ,
                                          String AV123Tclientwwds_15_tfclicp2_sel ,
                                          String AV122Tclientwwds_14_tfclicp2 ,
                                          String AV125Tclientwwds_17_tfprvdsc_sel ,
                                          String AV124Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A10045CliAct ,
                                          String AV104cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV110Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV111Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV120Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV122Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliNif" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliNif DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliDom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliDom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliPob" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliPob DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCp" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCp DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCp2" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCp2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliAct" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliAct DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P082J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P082J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
      }
   }

}

