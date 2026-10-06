package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdoctrnwwexportcsv_impl extends GXWebProcedure
{
   public tdoctrnwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TDOCTRNWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TDOCTRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TDOCTRNWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hash", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hash Ctrl", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio envio", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV109Tdoctrnwwds_1_albcompri = AV100AlbComPri ;
      AV110Tdoctrnwwds_2_albcomfch = AV101AlbComFch ;
      AV111Tdoctrnwwds_3_albcomfch_to = AV102AlbComFch_To ;
      AV112Tdoctrnwwds_4_filterfulltext = AV103FilterFullText ;
      AV113Tdoctrnwwds_5_tfalbcomcod = AV52TFAlbComCod ;
      AV114Tdoctrnwwds_6_tfalbcomcod_to = AV53TFAlbComCod_To ;
      AV115Tdoctrnwwds_7_tfalbcompri_sels = AV95TFAlbComPri_Sels ;
      AV116Tdoctrnwwds_8_tfalbcomest_sels = AV99TFAlbComEst_Sels ;
      AV117Tdoctrnwwds_9_tfalbcomfch = AV54TFAlbComFch ;
      AV118Tdoctrnwwds_10_tfclicod = AV60TFCliCod ;
      AV119Tdoctrnwwds_11_tfclicod_to = AV61TFCliCod_To ;
      AV120Tdoctrnwwds_12_tfclinom = AV62TFCliNom ;
      AV121Tdoctrnwwds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV122Tdoctrnwwds_14_tfalbcomfd = AV86TFAlbComFd ;
      AV123Tdoctrnwwds_15_tfalbcomfd_sel = AV87TFAlbComFd_Sel ;
      AV124Tdoctrnwwds_16_tfalbcomfdd = AV96TFAlbComFdD ;
      AV125Tdoctrnwwds_17_tfalbcomfdd_sel = AV97TFAlbComFdD_Sel ;
      AV126Tdoctrnwwds_18_tffinddomenv = AV104TFfindDomEnv ;
      AV127Tdoctrnwwds_19_tffinddomenv_to = AV105TFfindDomEnv_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV115Tdoctrnwwds_7_tfalbcompri_sels ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV116Tdoctrnwwds_8_tfalbcomest_sels ,
                                           AV110Tdoctrnwwds_2_albcomfch ,
                                           AV111Tdoctrnwwds_3_albcomfch_to ,
                                           Integer.valueOf(AV113Tdoctrnwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV114Tdoctrnwwds_6_tfalbcomcod_to) ,
                                           Integer.valueOf(AV115Tdoctrnwwds_7_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV116Tdoctrnwwds_8_tfalbcomest_sels.size()) ,
                                           AV117Tdoctrnwwds_9_tfalbcomfch ,
                                           Integer.valueOf(AV118Tdoctrnwwds_10_tfclicod) ,
                                           Integer.valueOf(AV119Tdoctrnwwds_11_tfclicod_to) ,
                                           AV121Tdoctrnwwds_13_tfclinom_sel ,
                                           AV120Tdoctrnwwds_12_tfclinom ,
                                           AV123Tdoctrnwwds_15_tfalbcomfd_sel ,
                                           AV122Tdoctrnwwds_14_tfalbcomfd ,
                                           AV125Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                           AV124Tdoctrnwwds_16_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV112Tdoctrnwwds_4_filterfulltext ,
                                           Byte.valueOf(A13739findDomEnv) ,
                                           Byte.valueOf(AV126Tdoctrnwwds_18_tffinddomenv) ,
                                           Byte.valueOf(AV127Tdoctrnwwds_19_tffinddomenv_to) ,
                                           AV109Tdoctrnwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING
                                           }
      });
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV112Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV120Tdoctrnwwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV120Tdoctrnwwds_12_tfclinom), 30, "%") ;
      lV122Tdoctrnwwds_14_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV122Tdoctrnwwds_14_tfalbcomfd), 200, "%") ;
      lV124Tdoctrnwwds_16_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV124Tdoctrnwwds_16_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G32 */
      pr_default.execute(0, new Object[] {AV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, lV112Tdoctrnwwds_4_filterfulltext, Byte.valueOf(AV126Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV126Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV127Tdoctrnwwds_19_tffinddomenv_to), Byte.valueOf(AV127Tdoctrnwwds_19_tffinddomenv_to), AV109Tdoctrnwwds_1_albcompri, AV110Tdoctrnwwds_2_albcomfch, AV111Tdoctrnwwds_3_albcomfch_to, Integer.valueOf(AV113Tdoctrnwwds_5_tfalbcomcod), Integer.valueOf(AV114Tdoctrnwwds_6_tfalbcomcod_to), AV117Tdoctrnwwds_9_tfalbcomfch, Integer.valueOf(AV118Tdoctrnwwds_10_tfclicod), Integer.valueOf(AV119Tdoctrnwwds_11_tfclicod_to), lV120Tdoctrnwwds_12_tfclinom, AV121Tdoctrnwwds_13_tfclinom_sel, lV122Tdoctrnwwds_14_tfalbcomfd, AV123Tdoctrnwwds_15_tfalbcomfd_sel, lV124Tdoctrnwwds_16_tfalbcomfdd, AV125Tdoctrnwwds_17_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08G32_A396EmprCod[0] ;
         A5142AlcDomEnv = P08G32_A5142AlcDomEnv[0] ;
         A10015AlbComFdD = P08G32_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G32_A10014AlbComFd[0] ;
         A279CliNom = P08G32_A279CliNom[0] ;
         A252CliCod = P08G32_A252CliCod[0] ;
         A16AlbComEst = P08G32_A16AlbComEst[0] ;
         A14AlbComCod = P08G32_A14AlbComCod[0] ;
         A17AlbComFch = P08G32_A17AlbComFch[0] ;
         A22AlbComPri = P08G32_A22AlbComPri[0] ;
         A13739findDomEnv = P08G32_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G32_n13739findDomEnv[0] ;
         A279CliNom = P08G32_A279CliNom[0] ;
         A13739findDomEnv = P08G32_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G32_n13739findDomEnv[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14AlbComCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "1") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "GR", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "0") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "GT", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A16AlbComEst == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Generado", "") ;
            }
            else if ( A16AlbComEst == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "Impreso", "") ;
            }
            else if ( A16AlbComEst == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Facturado", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A17AlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            tdoctrnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV30NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10014AlbComFd, ";", ","), AV30NewLine, " "), GXv_char3) ;
            tdoctrnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV30NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10015AlbComFdD, ";", ","), AV30NewLine, " "), GXv_char3) ;
            tdoctrnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13739findDomEnv, 1, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TDOCTRNWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComCod", "", "N Documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComPri", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComEst", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComFch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComFd", "", "Hash", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComFdD", "", "Hash Ctrl", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "findDomEnv", "", "Domicilio envio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDOCTRNWWColumnsSelector", GXv_char3) ;
      tdoctrnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TDOCTRNWWGridState"), "") == 0 )
      {
         AV50GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDOCTRNWWGridState"), null, null);
      }
      else
      {
         AV50GridState.fromxml(AV19Session.getValue("TDOCTRNWWGridState"), null, null);
      }
      AV28OrderedBy = AV50GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV50GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV128GXV1 = 1 ;
      while ( AV128GXV1 <= AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV128GXV1));
         if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV100AlbComPri = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV101AlbComFch = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV102AlbComFch_To = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV103FilterFullText = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV52TFAlbComCod = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFAlbComCod_To = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV94TFAlbComPri_SelsJson = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV95TFAlbComPri_Sels.fromJSonString(AV94TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST_SEL") == 0 )
         {
            AV98TFAlbComEst_SelsJson = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV99TFAlbComEst_Sels.fromJSonString(AV98TFAlbComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV54TFAlbComFch = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCliCod_To = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV62TFCliNom = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV63TFCliNom_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV86TFAlbComFd = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV87TFAlbComFd_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV96TFAlbComFdD = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV97TFAlbComFdD_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFINDDOMENV") == 0 )
         {
            AV104TFfindDomEnv = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV105TFfindDomEnv_To = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV128GXV1 = (int)(AV128GXV1+1) ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      AV109Tdoctrnwwds_1_albcompri = "" ;
      AV100AlbComPri = "" ;
      AV110Tdoctrnwwds_2_albcomfch = GXutil.nullDate() ;
      AV101AlbComFch = GXutil.nullDate() ;
      AV111Tdoctrnwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV102AlbComFch_To = GXutil.nullDate() ;
      AV112Tdoctrnwwds_4_filterfulltext = "" ;
      AV103FilterFullText = "" ;
      AV115Tdoctrnwwds_7_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV95TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV116Tdoctrnwwds_8_tfalbcomest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV99TFAlbComEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV117Tdoctrnwwds_9_tfalbcomfch = GXutil.nullDate() ;
      AV54TFAlbComFch = GXutil.nullDate() ;
      AV120Tdoctrnwwds_12_tfclinom = "" ;
      AV62TFCliNom = "" ;
      AV121Tdoctrnwwds_13_tfclinom_sel = "" ;
      AV63TFCliNom_Sel = "" ;
      AV122Tdoctrnwwds_14_tfalbcomfd = "" ;
      AV86TFAlbComFd = "" ;
      AV123Tdoctrnwwds_15_tfalbcomfd_sel = "" ;
      AV87TFAlbComFd_Sel = "" ;
      AV124Tdoctrnwwds_16_tfalbcomfdd = "" ;
      AV96TFAlbComFdD = "" ;
      AV125Tdoctrnwwds_17_tfalbcomfdd_sel = "" ;
      AV97TFAlbComFdD_Sel = "" ;
      lV112Tdoctrnwwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV120Tdoctrnwwds_12_tfclinom = "" ;
      lV122Tdoctrnwwds_14_tfalbcomfd = "" ;
      lV124Tdoctrnwwds_16_tfalbcomfdd = "" ;
      P08G32_A266CliEnvLin = new byte[1] ;
      P08G32_A396EmprCod = new String[] {""} ;
      P08G32_A5142AlcDomEnv = new byte[1] ;
      P08G32_A10015AlbComFdD = new String[] {""} ;
      P08G32_A10014AlbComFd = new String[] {""} ;
      P08G32_A279CliNom = new String[] {""} ;
      P08G32_A252CliCod = new int[1] ;
      P08G32_A16AlbComEst = new byte[1] ;
      P08G32_A14AlbComCod = new int[1] ;
      P08G32_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G32_A22AlbComPri = new String[] {""} ;
      P08G32_A13739findDomEnv = new byte[1] ;
      P08G32_n13739findDomEnv = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV30NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV50GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV94TFAlbComPri_SelsJson = "" ;
      AV98TFAlbComEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdoctrnwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08G32_A266CliEnvLin, P08G32_A396EmprCod, P08G32_A5142AlcDomEnv, P08G32_A10015AlbComFdD, P08G32_A10014AlbComFd, P08G32_A279CliNom, P08G32_A252CliCod, P08G32_A16AlbComEst, P08G32_A14AlbComCod, P08G32_A17AlbComFch,
            P08G32_A22AlbComPri, P08G32_A13739findDomEnv, P08G32_n13739findDomEnv
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A16AlbComEst ;
   private byte A13739findDomEnv ;
   private byte AV126Tdoctrnwwds_18_tffinddomenv ;
   private byte AV104TFfindDomEnv ;
   private byte AV127Tdoctrnwwds_19_tffinddomenv_to ;
   private byte AV105TFfindDomEnv_To ;
   private byte A5142AlcDomEnv ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV113Tdoctrnwwds_5_tfalbcomcod ;
   private int AV52TFAlbComCod ;
   private int AV114Tdoctrnwwds_6_tfalbcomcod_to ;
   private int AV53TFAlbComCod_To ;
   private int AV118Tdoctrnwwds_10_tfclicod ;
   private int AV60TFCliCod ;
   private int AV119Tdoctrnwwds_11_tfclicod_to ;
   private int AV61TFCliCod_To ;
   private int AV115Tdoctrnwwds_7_tfalbcompri_sels_size ;
   private int AV116Tdoctrnwwds_8_tfalbcomest_sels_size ;
   private int AV128GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A22AlbComPri ;
   private String A279CliNom ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String AV109Tdoctrnwwds_1_albcompri ;
   private String AV100AlbComPri ;
   private String AV120Tdoctrnwwds_12_tfclinom ;
   private String AV62TFCliNom ;
   private String AV121Tdoctrnwwds_13_tfclinom_sel ;
   private String AV63TFCliNom_Sel ;
   private String AV122Tdoctrnwwds_14_tfalbcomfd ;
   private String AV86TFAlbComFd ;
   private String AV123Tdoctrnwwds_15_tfalbcomfd_sel ;
   private String AV87TFAlbComFd_Sel ;
   private String AV124Tdoctrnwwds_16_tfalbcomfdd ;
   private String AV96TFAlbComFdD ;
   private String AV125Tdoctrnwwds_17_tfalbcomfdd_sel ;
   private String AV97TFAlbComFdD_Sel ;
   private String scmdbuf ;
   private String lV120Tdoctrnwwds_12_tfclinom ;
   private String lV122Tdoctrnwwds_14_tfalbcomfd ;
   private String lV124Tdoctrnwwds_16_tfalbcomfdd ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV110Tdoctrnwwds_2_albcomfch ;
   private java.util.Date AV101AlbComFch ;
   private java.util.Date AV111Tdoctrnwwds_3_albcomfch_to ;
   private java.util.Date AV102AlbComFch_To ;
   private java.util.Date AV117Tdoctrnwwds_9_tfalbcomfch ;
   private java.util.Date AV54TFAlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13739findDomEnv ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV94TFAlbComPri_SelsJson ;
   private String AV98TFAlbComEst_SelsJson ;
   private String AV11Filename ;
   private String AV112Tdoctrnwwds_4_filterfulltext ;
   private String AV103FilterFullText ;
   private String lV112Tdoctrnwwds_4_filterfulltext ;
   private String AV30NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV116Tdoctrnwwds_8_tfalbcomest_sels ;
   private GXSimpleCollection<Byte> AV99TFAlbComEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08G32_A266CliEnvLin ;
   private String[] P08G32_A396EmprCod ;
   private byte[] P08G32_A5142AlcDomEnv ;
   private String[] P08G32_A10015AlbComFdD ;
   private String[] P08G32_A10014AlbComFd ;
   private String[] P08G32_A279CliNom ;
   private int[] P08G32_A252CliCod ;
   private byte[] P08G32_A16AlbComEst ;
   private int[] P08G32_A14AlbComCod ;
   private java.util.Date[] P08G32_A17AlbComFch ;
   private String[] P08G32_A22AlbComPri ;
   private byte[] P08G32_A13739findDomEnv ;
   private boolean[] P08G32_n13739findDomEnv ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV115Tdoctrnwwds_7_tfalbcompri_sels ;
   private GXSimpleCollection<String> AV95TFAlbComPri_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV50GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV51GridStateFilterValue ;
}

final  class tdoctrnwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV115Tdoctrnwwds_7_tfalbcompri_sels ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV116Tdoctrnwwds_8_tfalbcomest_sels ,
                                          java.util.Date AV110Tdoctrnwwds_2_albcomfch ,
                                          java.util.Date AV111Tdoctrnwwds_3_albcomfch_to ,
                                          int AV113Tdoctrnwwds_5_tfalbcomcod ,
                                          int AV114Tdoctrnwwds_6_tfalbcomcod_to ,
                                          int AV115Tdoctrnwwds_7_tfalbcompri_sels_size ,
                                          int AV116Tdoctrnwwds_8_tfalbcomest_sels_size ,
                                          java.util.Date AV117Tdoctrnwwds_9_tfalbcomfch ,
                                          int AV118Tdoctrnwwds_10_tfclicod ,
                                          int AV119Tdoctrnwwds_11_tfclicod_to ,
                                          String AV121Tdoctrnwwds_13_tfclinom_sel ,
                                          String AV120Tdoctrnwwds_12_tfclinom ,
                                          String AV123Tdoctrnwwds_15_tfalbcomfd_sel ,
                                          String AV122Tdoctrnwwds_14_tfalbcomfd ,
                                          String AV125Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                          String AV124Tdoctrnwwds_16_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV112Tdoctrnwwds_4_filterfulltext ,
                                          byte A13739findDomEnv ,
                                          byte AV126Tdoctrnwwds_18_tffinddomenv ,
                                          byte AV127Tdoctrnwwds_19_tffinddomenv_to ,
                                          String AV109Tdoctrnwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.CliEnvLin, T1.EmprCod, T1.AlcDomEnv, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComEst, T1.AlbComCod, T1.AlbComFch, T1.AlbComPri, COALESCE(" ;
      scmdbuf += " T3.CliEnvLin, 0) AS findDomEnv FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCLIENV T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.CliEnvLin = T1.AlcDomEnv)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliEnvLin, 0),'90'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) <= ?))");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110Tdoctrnwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Tdoctrnwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdoctrnwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV114Tdoctrnwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( AV115Tdoctrnwwds_7_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Tdoctrnwwds_7_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( AV116Tdoctrnwwds_8_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV116Tdoctrnwwds_8_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Tdoctrnwwds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV118Tdoctrnwwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Tdoctrnwwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tdoctrnwwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV120Tdoctrnwwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tdoctrnwwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tdoctrnwwds_15_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV122Tdoctrnwwds_14_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tdoctrnwwds_15_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tdoctrnwwds_17_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV124Tdoctrnwwds_16_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tdoctrnwwds_17_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComEst" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFd" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFd DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD DESC" ;
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
                  return conditional_P08G32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 200);
               }
               return;
      }
   }

}

