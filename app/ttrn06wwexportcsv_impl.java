package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn06wwexportcsv_impl extends GXWebProcedure
{
   public ttrn06wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn06WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn06WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TTrn06WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Guia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Data", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nome", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo AT", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hash", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Ttrn06wwds_1_albpropri = AV51AlbProPri ;
      AV70Ttrn06wwds_2_albprofch = AV30AlbProFch ;
      AV71Ttrn06wwds_3_albprofch_to = AV31AlbProFch_To ;
      AV72Ttrn06wwds_4_filterfulltext = AV65FilterFullText ;
      AV73Ttrn06wwds_5_tfalbprocod = AV35TFAlbProCod ;
      AV74Ttrn06wwds_6_tfalbprocod_to = AV36TFAlbProCod_To ;
      AV75Ttrn06wwds_7_tfalbpropri = AV52TFAlbProPri ;
      AV76Ttrn06wwds_8_tfalbpropri_sel = AV53TFAlbProPri_Sel ;
      AV77Ttrn06wwds_9_tfalbprofch = AV37TFAlbProfch ;
      AV78Ttrn06wwds_10_tfguiremcli = AV39TFGuiRemCli ;
      AV79Ttrn06wwds_11_tfguiremcli_to = AV40TFGuiRemCli_To ;
      AV80Ttrn06wwds_12_tfguiremcln = AV41TFGuiRemCln ;
      AV81Ttrn06wwds_13_tfguiremcln_sel = AV42TFGuiRemCln_Sel ;
      AV82Ttrn06wwds_14_tfalbmarca_sels = AV64TFAlbMarca_Sels ;
      AV83Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV84Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV85Ttrn06wwds_17_tfalbproat_sels = AV50TFAlbProAT_Sels ;
      AV86Ttrn06wwds_18_tfalbproest_sels = AV57TFAlbProEst_Sels ;
      AV87Ttrn06wwds_19_tfalbfmd = AV59TFAlbFmd ;
      AV88Ttrn06wwds_20_tfalbfmd_sel = AV60TFAlbFmd_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV82Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV85Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV86Ttrn06wwds_18_tfalbproest_sels ,
                                           AV70Ttrn06wwds_2_albprofch ,
                                           AV71Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV73Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV74Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV76Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV75Ttrn06wwds_7_tfalbpropri ,
                                           AV77Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV78Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV79Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV81Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV80Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV82Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV84Ttrn06wwds_16_tfalblic_sel ,
                                           AV83Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV85Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV86Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV88Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV87Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV72Ttrn06wwds_4_filterfulltext ,
                                           AV69Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV75Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV75Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV80Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV80Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV83Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV83Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV87Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV87Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor P08DW2 */
      pr_default.execute(0, new Object[] {AV69Ttrn06wwds_1_albpropri, AV70Ttrn06wwds_2_albprofch, AV71Ttrn06wwds_3_albprofch_to, Long.valueOf(AV73Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV74Ttrn06wwds_6_tfalbprocod_to), lV75Ttrn06wwds_7_tfalbpropri, AV76Ttrn06wwds_8_tfalbpropri_sel, AV77Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV78Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV79Ttrn06wwds_11_tfguiremcli_to), lV80Ttrn06wwds_12_tfguiremcln, AV81Ttrn06wwds_13_tfguiremcln_sel, lV83Ttrn06wwds_15_tfalblic, AV84Ttrn06wwds_16_tfalblic_sel, lV87Ttrn06wwds_19_tfalbfmd, AV88Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = P08DW2_A1253EmprGuiRem[0] ;
         A10017AlbFmd = P08DW2_A10017AlbFmd[0] ;
         n10017AlbFmd = P08DW2_n10017AlbFmd[0] ;
         A33AlbProEst = P08DW2_A33AlbProEst[0] ;
         A7101AlbLic = P08DW2_A7101AlbLic[0] ;
         A1244GuiRemCln = P08DW2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08DW2_A1243GuiRemCli[0] ;
         A30AlbProCod = P08DW2_A30AlbProCod[0] ;
         A10765AlbProAT = P08DW2_A10765AlbProAT[0] ;
         A5140AlbMarca = P08DW2_A5140AlbMarca[0] ;
         A34AlbProfch = P08DW2_A34AlbProfch[0] ;
         A39AlbProPri = P08DW2_A39AlbProPri[0] ;
         A396EmprCod = P08DW2_A396EmprCod[0] ;
         A1244GuiRemCln = P08DW2_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV72Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV72Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV72Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automatico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s/d", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV72Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV72Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
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
               AV14TextFileLine += GXutil.str( A30AlbProCod, 10, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A39AlbProPri, ";", ","), GXv_char3) ;
               ttrn06wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A1243GuiRemCli, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1244GuiRemCln, ";", ","), GXv_char3) ;
               ttrn06wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), "") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Activo", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Anulado", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7101AlbLic, ";", ","), GXv_char3) ;
               ttrn06wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A10765AlbProAT), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Automatico", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A10765AlbProAT), "M") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Manual", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A33AlbProEst == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Generado", "") ;
               }
               else if ( A33AlbProEst == 1 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Editado", "") ;
               }
               else if ( A33AlbProEst == 2 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Facturado", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV58NewLine = GXutil.chr( (short)(10)) ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10017AlbFmd, ";", ","), AV58NewLine, " "), GXv_char3) ;
               ttrn06wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTrn06WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProCod", "", "Nº Guia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProPri", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProfch", "", "Data", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiRemCli", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiRemCln", "", "Nome", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbMarca", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbLic", "", "Codigo AT", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProAT", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbFmd", "", "Hash", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn06WWColumnsSelector", GXv_char3) ;
      ttrn06wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn06WWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn06WWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("TTrn06WWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROPRI") == 0 )
         {
            AV51AlbProPri = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV30AlbProFch = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV31AlbProFch_To = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV65FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV35TFAlbProCod = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV36TFAlbProCod_To = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV52TFAlbProPri = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV53TFAlbProPri_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV37TFAlbProfch = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV39TFGuiRemCli = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFGuiRemCli_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV41TFGuiRemCln = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV42TFGuiRemCln_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV63TFAlbMarca_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFAlbMarca_Sels.fromJSonString(AV63TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV45TFAlbLic = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV46TFAlbLic_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROAT_SEL") == 0 )
         {
            AV49TFAlbProAT_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFAlbProAT_Sels.fromJSonString(AV49TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV56TFAlbProEst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV57TFAlbProEst_Sels.fromJSonString(AV56TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD") == 0 )
         {
            AV59TFAlbFmd = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD_SEL") == 0 )
         {
            AV60TFAlbFmd_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
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
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      A10017AlbFmd = "" ;
      AV69Ttrn06wwds_1_albpropri = "" ;
      AV51AlbProPri = "" ;
      AV70Ttrn06wwds_2_albprofch = GXutil.nullDate() ;
      AV30AlbProFch = GXutil.nullDate() ;
      AV71Ttrn06wwds_3_albprofch_to = GXutil.nullDate() ;
      AV31AlbProFch_To = GXutil.nullDate() ;
      AV72Ttrn06wwds_4_filterfulltext = "" ;
      AV65FilterFullText = "" ;
      AV75Ttrn06wwds_7_tfalbpropri = "" ;
      AV52TFAlbProPri = "" ;
      AV76Ttrn06wwds_8_tfalbpropri_sel = "" ;
      AV53TFAlbProPri_Sel = "" ;
      AV77Ttrn06wwds_9_tfalbprofch = GXutil.nullDate() ;
      AV37TFAlbProfch = GXutil.nullDate() ;
      AV80Ttrn06wwds_12_tfguiremcln = "" ;
      AV41TFGuiRemCln = "" ;
      AV81Ttrn06wwds_13_tfguiremcln_sel = "" ;
      AV42TFGuiRemCln_Sel = "" ;
      AV82Ttrn06wwds_14_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV83Ttrn06wwds_15_tfalblic = "" ;
      AV45TFAlbLic = "" ;
      AV84Ttrn06wwds_16_tfalblic_sel = "" ;
      AV46TFAlbLic_Sel = "" ;
      AV85Ttrn06wwds_17_tfalbproat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86Ttrn06wwds_18_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV57TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV87Ttrn06wwds_19_tfalbfmd = "" ;
      AV59TFAlbFmd = "" ;
      AV88Ttrn06wwds_20_tfalbfmd_sel = "" ;
      AV60TFAlbFmd_Sel = "" ;
      lV72Ttrn06wwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV75Ttrn06wwds_7_tfalbpropri = "" ;
      lV80Ttrn06wwds_12_tfguiremcln = "" ;
      lV83Ttrn06wwds_15_tfalblic = "" ;
      lV87Ttrn06wwds_19_tfalbfmd = "" ;
      P08DW2_A1253EmprGuiRem = new String[] {""} ;
      P08DW2_A10017AlbFmd = new String[] {""} ;
      P08DW2_n10017AlbFmd = new boolean[] {false} ;
      P08DW2_A33AlbProEst = new byte[1] ;
      P08DW2_A7101AlbLic = new String[] {""} ;
      P08DW2_A1244GuiRemCln = new String[] {""} ;
      P08DW2_A1243GuiRemCli = new int[1] ;
      P08DW2_A30AlbProCod = new long[1] ;
      P08DW2_A10765AlbProAT = new String[] {""} ;
      P08DW2_A5140AlbMarca = new String[] {""} ;
      P08DW2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DW2_A39AlbProPri = new String[] {""} ;
      P08DW2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      AV58NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV63TFAlbMarca_SelsJson = "" ;
      AV49TFAlbProAT_SelsJson = "" ;
      AV56TFAlbProEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08DW2_A1253EmprGuiRem, P08DW2_A10017AlbFmd, P08DW2_n10017AlbFmd, P08DW2_A33AlbProEst, P08DW2_A7101AlbLic, P08DW2_A1244GuiRemCln, P08DW2_A1243GuiRemCli, P08DW2_A30AlbProCod, P08DW2_A10765AlbProAT, P08DW2_A5140AlbMarca,
            P08DW2_A34AlbProfch, P08DW2_A39AlbProPri, P08DW2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1243GuiRemCli ;
   private int AV78Ttrn06wwds_10_tfguiremcli ;
   private int AV39TFGuiRemCli ;
   private int AV79Ttrn06wwds_11_tfguiremcli_to ;
   private int AV40TFGuiRemCli_To ;
   private int AV82Ttrn06wwds_14_tfalbmarca_sels_size ;
   private int AV85Ttrn06wwds_17_tfalbproat_sels_size ;
   private int AV86Ttrn06wwds_18_tfalbproest_sels_size ;
   private int AV89GXV1 ;
   private long A30AlbProCod ;
   private long AV73Ttrn06wwds_5_tfalbprocod ;
   private long AV35TFAlbProCod ;
   private long AV74Ttrn06wwds_6_tfalbprocod_to ;
   private long AV36TFAlbProCod_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A39AlbProPri ;
   private String A1244GuiRemCln ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String A10765AlbProAT ;
   private String AV69Ttrn06wwds_1_albpropri ;
   private String AV51AlbProPri ;
   private String AV75Ttrn06wwds_7_tfalbpropri ;
   private String AV52TFAlbProPri ;
   private String AV76Ttrn06wwds_8_tfalbpropri_sel ;
   private String AV53TFAlbProPri_Sel ;
   private String AV80Ttrn06wwds_12_tfguiremcln ;
   private String AV41TFGuiRemCln ;
   private String AV81Ttrn06wwds_13_tfguiremcln_sel ;
   private String AV42TFGuiRemCln_Sel ;
   private String AV83Ttrn06wwds_15_tfalblic ;
   private String AV45TFAlbLic ;
   private String AV84Ttrn06wwds_16_tfalblic_sel ;
   private String AV46TFAlbLic_Sel ;
   private String scmdbuf ;
   private String lV75Ttrn06wwds_7_tfalbpropri ;
   private String lV80Ttrn06wwds_12_tfguiremcln ;
   private String lV83Ttrn06wwds_15_tfalblic ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV70Ttrn06wwds_2_albprofch ;
   private java.util.Date AV30AlbProFch ;
   private java.util.Date AV71Ttrn06wwds_3_albprofch_to ;
   private java.util.Date AV31AlbProFch_To ;
   private java.util.Date AV77Ttrn06wwds_9_tfalbprofch ;
   private java.util.Date AV37TFAlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n10017AlbFmd ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV63TFAlbMarca_SelsJson ;
   private String AV49TFAlbProAT_SelsJson ;
   private String AV56TFAlbProEst_SelsJson ;
   private String AV11Filename ;
   private String A10017AlbFmd ;
   private String AV72Ttrn06wwds_4_filterfulltext ;
   private String AV65FilterFullText ;
   private String AV87Ttrn06wwds_19_tfalbfmd ;
   private String AV59TFAlbFmd ;
   private String AV88Ttrn06wwds_20_tfalbfmd_sel ;
   private String AV60TFAlbFmd_Sel ;
   private String lV72Ttrn06wwds_4_filterfulltext ;
   private String lV87Ttrn06wwds_19_tfalbfmd ;
   private String AV58NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV86Ttrn06wwds_18_tfalbproest_sels ;
   private GXSimpleCollection<Byte> AV57TFAlbProEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08DW2_A1253EmprGuiRem ;
   private String[] P08DW2_A10017AlbFmd ;
   private boolean[] P08DW2_n10017AlbFmd ;
   private byte[] P08DW2_A33AlbProEst ;
   private String[] P08DW2_A7101AlbLic ;
   private String[] P08DW2_A1244GuiRemCln ;
   private int[] P08DW2_A1243GuiRemCli ;
   private long[] P08DW2_A30AlbProCod ;
   private String[] P08DW2_A10765AlbProAT ;
   private String[] P08DW2_A5140AlbMarca ;
   private java.util.Date[] P08DW2_A34AlbProfch ;
   private String[] P08DW2_A39AlbProPri ;
   private String[] P08DW2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV82Ttrn06wwds_14_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV64TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV85Ttrn06wwds_17_tfalbproat_sels ;
   private GXSimpleCollection<String> AV50TFAlbProAT_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class ttrn06wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV82Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV85Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV86Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV70Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV71Ttrn06wwds_3_albprofch_to ,
                                          long AV73Ttrn06wwds_5_tfalbprocod ,
                                          long AV74Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV76Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV75Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV77Ttrn06wwds_9_tfalbprofch ,
                                          int AV78Ttrn06wwds_10_tfguiremcli ,
                                          int AV79Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV81Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV80Ttrn06wwds_12_tfguiremcln ,
                                          int AV82Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV84Ttrn06wwds_16_tfalblic_sel ,
                                          String AV83Ttrn06wwds_15_tfalblic ,
                                          int AV85Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV86Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV88Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV87Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV72Ttrn06wwds_4_filterfulltext ,
                                          String AV69Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbFmd, T1.AlbProEst, T1.AlbLic, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbProAT, T1.AlbMarca," ;
      scmdbuf += " T1.AlbProfch, T1.AlbProPri, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV74Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV75Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV80Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( AV82Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV82Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV84Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV83Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( AV85Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV86Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV88Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV87Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPri" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAT" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAT DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbFmd" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbFmd DESC" ;
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
                  return conditional_P08DW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
      }
   }

}

