package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn22wwexportcsv_impl extends GXWebProcedure
{
   public ttrn22wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn22WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += httpContext.getMessage( "N Recepcion", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Codigo", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Nombre", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Fecha", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Hora", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Codigo", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Descripcion", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Entrada", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Utilizada", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Stock", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Unidad", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Entrada", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Utilizada", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Stock", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Estado", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Ttrn22wwds_1_tfclinom = AV38TFCliNom ;
      AV65Ttrn22wwds_2_tfclinom_sel = AV39TFCliNom_Sel ;
      AV66Ttrn22wwds_3_tfalbrhor = AV45TFAlbrHor ;
      AV67Ttrn22wwds_4_tfalbrhor_to = AV46TFAlbrHor_To ;
      AV68Ttrn22wwds_5_tfalbref = AV41TFAlbRef ;
      AV69Ttrn22wwds_6_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV70Ttrn22wwds_7_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV71Ttrn22wwds_8_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV72Ttrn22wwds_9_tfalbrpieent = AV47TFAlbRPieEnt ;
      AV73Ttrn22wwds_10_tfalbrpieent_to = AV48TFAlbRPieEnt_To ;
      AV74Ttrn22wwds_11_tfalbrpieuti = AV49TFAlbRPieUti ;
      AV75Ttrn22wwds_12_tfalbrpieuti_to = AV50TFAlbRPieUti_To ;
      AV76Ttrn22wwds_13_tfalbrpiedis = AV51TFAlbRPieDis ;
      AV77Ttrn22wwds_14_tfalbrpiedis_to = AV52TFAlbRPieDis_To ;
      AV78Ttrn22wwds_15_tfalbruni_sels = AV54TFAlbRUni_Sels ;
      AV79Ttrn22wwds_16_tfalbrunient = AV55TFAlbRUniEnt ;
      AV80Ttrn22wwds_17_tfalbrunient_to = AV56TFAlbRUniEnt_To ;
      AV81Ttrn22wwds_18_tfalbruniuti = AV57TFAlbRUniUti ;
      AV82Ttrn22wwds_19_tfalbruniuti_to = AV58TFAlbRUniUti_To ;
      AV83Ttrn22wwds_20_tfalbrunidis = AV59TFAlbRUniDis ;
      AV84Ttrn22wwds_21_tfalbrunidis_to = AV60TFAlbRUniDis_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV78Ttrn22wwds_15_tfalbruni_sels ,
                                           AV65Ttrn22wwds_2_tfclinom_sel ,
                                           AV64Ttrn22wwds_1_tfclinom ,
                                           AV66Ttrn22wwds_3_tfalbrhor ,
                                           AV67Ttrn22wwds_4_tfalbrhor_to ,
                                           AV69Ttrn22wwds_6_tfalbref_sel ,
                                           AV68Ttrn22wwds_5_tfalbref ,
                                           AV71Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV70Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV72Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV73Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV74Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV75Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV76Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV77Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV78Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV79Ttrn22wwds_16_tfalbrunient ,
                                           AV80Ttrn22wwds_17_tfalbrunient_to ,
                                           AV81Ttrn22wwds_18_tfalbruniuti ,
                                           AV82Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV83Ttrn22wwds_20_tfalbrunidis ,
                                           AV84Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV64Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV64Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV68Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV68Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV70Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV70Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P0ATO2 */
      pr_default.execute(0, new Object[] {lV64Ttrn22wwds_1_tfclinom, AV65Ttrn22wwds_2_tfclinom_sel, AV66Ttrn22wwds_3_tfalbrhor, AV67Ttrn22wwds_4_tfalbrhor_to, lV68Ttrn22wwds_5_tfalbref, AV69Ttrn22wwds_6_tfalbref_sel, lV70Ttrn22wwds_7_tfalbrefdsc, AV71Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV72Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV73Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV74Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV75Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV76Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV77Ttrn22wwds_14_tfalbrpiedis_to), AV79Ttrn22wwds_16_tfalbrunient, AV80Ttrn22wwds_17_tfalbrunient_to, AV81Ttrn22wwds_18_tfalbruniuti, AV82Ttrn22wwds_19_tfalbruniuti_to, AV83Ttrn22wwds_20_tfalbrunidis, AV84Ttrn22wwds_21_tfalbrunidis_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A56AlbRUni = P0ATO2_A56AlbRUni[0] ;
         A3613AlbRefDsc = P0ATO2_A3613AlbRefDsc[0] ;
         A45AlbRef = P0ATO2_A45AlbRef[0] ;
         A6179AlbrHor = P0ATO2_A6179AlbrHor[0] ;
         A279CliNom = P0ATO2_A279CliNom[0] ;
         A47AlbREst = P0ATO2_A47AlbREst[0] ;
         A49AlbRFen = P0ATO2_A49AlbRFen[0] ;
         A252CliCod = P0ATO2_A252CliCod[0] ;
         A44AlbRecCod = P0ATO2_A44AlbRecCod[0] ;
         A396EmprCod = P0ATO2_A396EmprCod[0] ;
         A54AlbRPieUti = P0ATO2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0ATO2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0ATO2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0ATO2_A58AlbRUniEnt[0] ;
         A279CliNom = P0ATO2_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
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
         AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
         ttrn22wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char3) ;
         ttrn22wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3613AlbRefDsc, ";", ","), GXv_char3) ;
         ttrn22wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A52AlbRPieEnt, 6, 0) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A54AlbRPieUti, 6, 0) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A51AlbRPieDis, 6, 0) ;
         AV14TextFileLine += ";" ;
         if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
         {
            AV14TextFileLine += httpContext.getMessage( "K", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
         {
            AV14TextFileLine += httpContext.getMessage( "M", "") ;
         }
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A58AlbRUniEnt, 9, 2) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A60AlbRUniUti, 9, 2) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A57AlbRUniDis, 9, 2) ;
         AV14TextFileLine += ";" ;
         if ( A47AlbREst == 0 )
         {
            AV14TextFileLine += httpContext.getMessage( "Abierta", "") ;
         }
         else if ( A47AlbREst == 1 )
         {
            AV14TextFileLine += httpContext.getMessage( "Cerrada", "") ;
         }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTrn22WWExportCSV.csv");
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn22WWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn22WWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TTrn22WWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV45TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            AV46TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV41TFAlbRef = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV42TFAlbRef_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV43TFAlbRefDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV44TFAlbRefDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV47TFAlbRPieEnt = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFAlbRPieEnt_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV49TFAlbRPieUti = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFAlbRPieUti_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV51TFAlbRPieDis = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRPieDis_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV53TFAlbRUni_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFAlbRUni_Sels.fromJSonString(AV53TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV55TFAlbRUniEnt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFAlbRUniEnt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV57TFAlbRUniUti = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFAlbRUniUti_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV59TFAlbRUniDis = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFAlbRUniDis_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
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
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV64Ttrn22wwds_1_tfclinom = "" ;
      AV38TFCliNom = "" ;
      AV65Ttrn22wwds_2_tfclinom_sel = "" ;
      AV39TFCliNom_Sel = "" ;
      AV66Ttrn22wwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV45TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV67Ttrn22wwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV46TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV68Ttrn22wwds_5_tfalbref = "" ;
      AV41TFAlbRef = "" ;
      AV69Ttrn22wwds_6_tfalbref_sel = "" ;
      AV42TFAlbRef_Sel = "" ;
      AV70Ttrn22wwds_7_tfalbrefdsc = "" ;
      AV43TFAlbRefDsc = "" ;
      AV71Ttrn22wwds_8_tfalbrefdsc_sel = "" ;
      AV44TFAlbRefDsc_Sel = "" ;
      AV78Ttrn22wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV79Ttrn22wwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV55TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV80Ttrn22wwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV56TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV81Ttrn22wwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV57TFAlbRUniUti = DecimalUtil.ZERO ;
      AV82Ttrn22wwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV58TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV83Ttrn22wwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV59TFAlbRUniDis = DecimalUtil.ZERO ;
      AV84Ttrn22wwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV60TFAlbRUniDis_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Ttrn22wwds_1_tfclinom = "" ;
      lV68Ttrn22wwds_5_tfalbref = "" ;
      lV70Ttrn22wwds_7_tfalbrefdsc = "" ;
      P0ATO2_A56AlbRUni = new String[] {""} ;
      P0ATO2_A3613AlbRefDsc = new String[] {""} ;
      P0ATO2_A45AlbRef = new String[] {""} ;
      P0ATO2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATO2_A279CliNom = new String[] {""} ;
      P0ATO2_A47AlbREst = new byte[1] ;
      P0ATO2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATO2_A252CliCod = new int[1] ;
      P0ATO2_A44AlbRecCod = new int[1] ;
      P0ATO2_A396EmprCod = new String[] {""} ;
      P0ATO2_A54AlbRPieUti = new int[1] ;
      P0ATO2_A52AlbRPieEnt = new int[1] ;
      P0ATO2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATO2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV19Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn22wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0ATO2_A56AlbRUni, P0ATO2_A3613AlbRefDsc, P0ATO2_A45AlbRef, P0ATO2_A6179AlbrHor, P0ATO2_A279CliNom, P0ATO2_A47AlbREst, P0ATO2_A49AlbRFen, P0ATO2_A252CliCod, P0ATO2_A44AlbRecCod, P0ATO2_A396EmprCod,
            P0ATO2_A54AlbRPieUti, P0ATO2_A52AlbRPieEnt, P0ATO2_A60AlbRUniUti, P0ATO2_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV72Ttrn22wwds_9_tfalbrpieent ;
   private int AV47TFAlbRPieEnt ;
   private int AV73Ttrn22wwds_10_tfalbrpieent_to ;
   private int AV48TFAlbRPieEnt_To ;
   private int AV74Ttrn22wwds_11_tfalbrpieuti ;
   private int AV49TFAlbRPieUti ;
   private int AV75Ttrn22wwds_12_tfalbrpieuti_to ;
   private int AV50TFAlbRPieUti_To ;
   private int AV76Ttrn22wwds_13_tfalbrpiedis ;
   private int AV51TFAlbRPieDis ;
   private int AV77Ttrn22wwds_14_tfalbrpiedis_to ;
   private int AV52TFAlbRPieDis_To ;
   private int AV78Ttrn22wwds_15_tfalbruni_sels_size ;
   private int AV85GXV1 ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV79Ttrn22wwds_16_tfalbrunient ;
   private java.math.BigDecimal AV55TFAlbRUniEnt ;
   private java.math.BigDecimal AV80Ttrn22wwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV56TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV81Ttrn22wwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV57TFAlbRUniUti ;
   private java.math.BigDecimal AV82Ttrn22wwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV58TFAlbRUniUti_To ;
   private java.math.BigDecimal AV83Ttrn22wwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV59TFAlbRUniDis ;
   private java.math.BigDecimal AV84Ttrn22wwds_21_tfalbrunidis_to ;
   private java.math.BigDecimal AV60TFAlbRUniDis_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String AV64Ttrn22wwds_1_tfclinom ;
   private String AV38TFCliNom ;
   private String AV65Ttrn22wwds_2_tfclinom_sel ;
   private String AV39TFCliNom_Sel ;
   private String AV68Ttrn22wwds_5_tfalbref ;
   private String AV41TFAlbRef ;
   private String AV69Ttrn22wwds_6_tfalbref_sel ;
   private String AV42TFAlbRef_Sel ;
   private String AV70Ttrn22wwds_7_tfalbrefdsc ;
   private String AV43TFAlbRefDsc ;
   private String AV71Ttrn22wwds_8_tfalbrefdsc_sel ;
   private String AV44TFAlbRefDsc_Sel ;
   private String scmdbuf ;
   private String lV64Ttrn22wwds_1_tfclinom ;
   private String lV68Ttrn22wwds_5_tfalbref ;
   private String lV70Ttrn22wwds_7_tfalbrefdsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV66Ttrn22wwds_3_tfalbrhor ;
   private java.util.Date AV45TFAlbrHor ;
   private java.util.Date AV67Ttrn22wwds_4_tfalbrhor_to ;
   private java.util.Date AV46TFAlbrHor_To ;
   private java.util.Date A49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV53TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATO2_A56AlbRUni ;
   private String[] P0ATO2_A3613AlbRefDsc ;
   private String[] P0ATO2_A45AlbRef ;
   private java.util.Date[] P0ATO2_A6179AlbrHor ;
   private String[] P0ATO2_A279CliNom ;
   private byte[] P0ATO2_A47AlbREst ;
   private java.util.Date[] P0ATO2_A49AlbRFen ;
   private int[] P0ATO2_A252CliCod ;
   private int[] P0ATO2_A44AlbRecCod ;
   private String[] P0ATO2_A396EmprCod ;
   private int[] P0ATO2_A54AlbRPieUti ;
   private int[] P0ATO2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATO2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0ATO2_A58AlbRUniEnt ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV78Ttrn22wwds_15_tfalbruni_sels ;
   private GXSimpleCollection<String> AV54TFAlbRUni_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class ttrn22wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV78Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV65Ttrn22wwds_2_tfclinom_sel ,
                                          String AV64Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV66Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV67Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV69Ttrn22wwds_6_tfalbref_sel ,
                                          String AV68Ttrn22wwds_5_tfalbref ,
                                          String AV71Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV70Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV72Ttrn22wwds_9_tfalbrpieent ,
                                          int AV73Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV74Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV75Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV76Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV77Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV78Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV79Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV80Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV81Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV82Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV83Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV84Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbREst, T1.AlbRFen, T1.CliCod, T1.AlbRecCod, T1.EmprCod, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV65Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV67Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV68Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV72Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV75Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( AV78Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrHor" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
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
                  return conditional_P0ATO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
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
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

