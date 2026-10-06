package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmmovstwwexportcsv_impl extends GXWebProcedure
{
   public tmmovstwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "PrivateTempStorage" + "TMMovStWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMMovStWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TMMovStWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod. Mov Stock", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "% Descuento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nro Externo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario que crea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha de Creación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha de Aplicación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Tmmovstwwds_1_filterfulltext = AV74FilterFullText ;
      AV81Tmmovstwwds_2_tfmmscod = AV52TFMMSCod ;
      AV82Tmmovstwwds_3_tfmmscod_to = AV53TFMMSCod_To ;
      AV83Tmmovstwwds_4_tfmmstpo_sels = AV55TFMMSTpo_Sels ;
      AV84Tmmovstwwds_5_tfmmsfch = AV60TFMMSFch ;
      AV85Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV86Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV87Tmmovstwwds_8_tfmmsprvnum = AV56TFMMSPrvNum ;
      AV88Tmmovstwwds_9_tfmmsprvnum_to = AV57TFMMSPrvNum_To ;
      AV89Tmmovstwwds_10_tfmmsdto = AV72TFMMSDto ;
      AV90Tmmovstwwds_11_tfmmsdto_to = AV73TFMMSDto_To ;
      AV91Tmmovstwwds_12_tfmmsnroext = AV68TFMMSNroExt ;
      AV92Tmmovstwwds_13_tfmmsnroext_sel = AV69TFMMSNroExt_Sel ;
      AV93Tmmovstwwds_14_tfmmsusucre = AV62TFMMSUsuCre ;
      AV94Tmmovstwwds_15_tfmmsusucre_sel = AV63TFMMSUsuCre_Sel ;
      AV95Tmmovstwwds_16_tfmmsfchcre = AV64TFMMSFchCre ;
      AV96Tmmovstwwds_17_tfmmsfchapl = AV66TFMMSFchApl ;
      AV97Tmmovstwwds_18_tfmmsest_sels = AV71TFMMSEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV83Tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV97Tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV81Tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV82Tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV83Tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV84Tmmovstwwds_5_tfmmsfch ,
                                           AV86Tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV85Tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV87Tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV88Tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV89Tmmovstwwds_10_tfmmsdto ,
                                           AV90Tmmovstwwds_11_tfmmsdto_to ,
                                           AV92Tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV91Tmmovstwwds_12_tfmmsnroext ,
                                           AV94Tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV93Tmmovstwwds_14_tfmmsusucre ,
                                           AV95Tmmovstwwds_16_tfmmsfchcre ,
                                           AV96Tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV97Tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV80Tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV85Tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV85Tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV91Tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV91Tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV93Tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV93Tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor P08DT2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV81Tmmovstwwds_2_tfmmscod), Integer.valueOf(AV82Tmmovstwwds_3_tfmmscod_to), AV84Tmmovstwwds_5_tfmmsfch, lV85Tmmovstwwds_6_tfmmsprvnom, AV86Tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV87Tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV88Tmmovstwwds_9_tfmmsprvnum_to), AV89Tmmovstwwds_10_tfmmsdto, AV90Tmmovstwwds_11_tfmmsdto_to, lV91Tmmovstwwds_12_tfmmsnroext, AV92Tmmovstwwds_13_tfmmsnroext_sel, lV93Tmmovstwwds_14_tfmmsusucre, AV94Tmmovstwwds_15_tfmmsusucre_sel, AV95Tmmovstwwds_16_tfmmsfchcre, AV96Tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08DT2_A396EmprCod[0] ;
         A11304MMSFchApl = P08DT2_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P08DT2_n11304MMSFchApl[0] ;
         A9418MMSFchCre = P08DT2_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P08DT2_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = P08DT2_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = P08DT2_n9417MMSUsuCre[0] ;
         A9419MMSNroExt = P08DT2_A9419MMSNroExt[0] ;
         n9419MMSNroExt = P08DT2_n9419MMSNroExt[0] ;
         A11509MMSDto = P08DT2_A11509MMSDto[0] ;
         n11509MMSDto = P08DT2_n11509MMSDto[0] ;
         A9414MMSPrvNum = P08DT2_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = P08DT2_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = P08DT2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DT2_n9415MMSPrvNom[0] ;
         A9416MMSFch = P08DT2_A9416MMSFch[0] ;
         n9416MMSFch = P08DT2_n9416MMSFch[0] ;
         A9412MMSCod = P08DT2_A9412MMSCod[0] ;
         A9420MMSEst = P08DT2_A9420MMSEst[0] ;
         n9420MMSEst = P08DT2_n9420MMSEst[0] ;
         A9413MMSTpo = P08DT2_A9413MMSTpo[0] ;
         n9413MMSTpo = P08DT2_n9413MMSTpo[0] ;
         A9415MMSPrvNom = P08DT2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DT2_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV80Tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV80Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV80Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV80Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
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
               AV14TextFileLine += GXutil.str( A9412MMSCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), "E") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Entrada", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Salida", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A9416MMSFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9415MMSPrvNom, ";", ","), GXv_char3) ;
               tmmovstwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9414MMSPrvNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A11509MMSDto, 6, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9419MMSNroExt, ";", ","), GXv_char3) ;
               tmmovstwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9417MMSUsuCre, ";", ","), GXv_char3) ;
               tmmovstwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "E") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "En ingreso", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Aplicado", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "C") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Cancelado", "") ;
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMMovStWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSCod", "", "Cod. Mov Stock", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSTpo", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSFch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSPrvNom", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSPrvNum", "", "Cod Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSDto", "", "% Descuento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSNroExt", "", "Nro Externo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSUsuCre", "", "Usuario que crea", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSFchCre", "", "Fecha de Creación", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSFchApl", "", "Fecha de Aplicación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMMovStWWColumnsSelector", GXv_char3) ;
      tmmovstwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMMovStWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMMovStWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("TMMovStWWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV74FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV52TFMMSCod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFMMSCod_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSTPO_SEL") == 0 )
         {
            AV54TFMMSTpo_SelsJson = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFMMSTpo_Sels.fromJSonString(AV54TFMMSTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCH") == 0 )
         {
            AV60TFMMSFch = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM") == 0 )
         {
            AV58TFMMSPrvNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM_SEL") == 0 )
         {
            AV59TFMMSPrvNom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNUM") == 0 )
         {
            AV56TFMMSPrvNum = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFMMSPrvNum_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSDTO") == 0 )
         {
            AV72TFMMSDto = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFMMSDto_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT") == 0 )
         {
            AV68TFMMSNroExt = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT_SEL") == 0 )
         {
            AV69TFMMSNroExt_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE") == 0 )
         {
            AV62TFMMSUsuCre = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE_SEL") == 0 )
         {
            AV63TFMMSUsuCre_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHCRE") == 0 )
         {
            AV64TFMMSFchCre = localUtil.ctot( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHAPL") == 0 )
         {
            AV66TFMMSFchApl = localUtil.ctot( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSEST_SEL") == 0 )
         {
            AV70TFMMSEst_SelsJson = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71TFMMSEst_Sels.fromJSonString(AV70TFMMSEst_SelsJson, null);
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
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
      A9413MMSTpo = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      A9415MMSPrvNom = "" ;
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      A9420MMSEst = "" ;
      AV80Tmmovstwwds_1_filterfulltext = "" ;
      AV74FilterFullText = "" ;
      AV83Tmmovstwwds_4_tfmmstpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55TFMMSTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV84Tmmovstwwds_5_tfmmsfch = GXutil.nullDate() ;
      AV60TFMMSFch = GXutil.nullDate() ;
      AV85Tmmovstwwds_6_tfmmsprvnom = "" ;
      AV58TFMMSPrvNom = "" ;
      AV86Tmmovstwwds_7_tfmmsprvnom_sel = "" ;
      AV59TFMMSPrvNom_Sel = "" ;
      AV89Tmmovstwwds_10_tfmmsdto = DecimalUtil.ZERO ;
      AV72TFMMSDto = DecimalUtil.ZERO ;
      AV90Tmmovstwwds_11_tfmmsdto_to = DecimalUtil.ZERO ;
      AV73TFMMSDto_To = DecimalUtil.ZERO ;
      AV91Tmmovstwwds_12_tfmmsnroext = "" ;
      AV68TFMMSNroExt = "" ;
      AV92Tmmovstwwds_13_tfmmsnroext_sel = "" ;
      AV69TFMMSNroExt_Sel = "" ;
      AV93Tmmovstwwds_14_tfmmsusucre = "" ;
      AV62TFMMSUsuCre = "" ;
      AV94Tmmovstwwds_15_tfmmsusucre_sel = "" ;
      AV63TFMMSUsuCre_Sel = "" ;
      AV95Tmmovstwwds_16_tfmmsfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV64TFMMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV96Tmmovstwwds_17_tfmmsfchapl = GXutil.resetTime( GXutil.nullDate() );
      AV66TFMMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV97Tmmovstwwds_18_tfmmsest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV71TFMMSEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV85Tmmovstwwds_6_tfmmsprvnom = "" ;
      lV91Tmmovstwwds_12_tfmmsnroext = "" ;
      lV93Tmmovstwwds_14_tfmmsusucre = "" ;
      P08DT2_A396EmprCod = new String[] {""} ;
      P08DT2_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08DT2_n11304MMSFchApl = new boolean[] {false} ;
      P08DT2_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08DT2_n9418MMSFchCre = new boolean[] {false} ;
      P08DT2_A9417MMSUsuCre = new String[] {""} ;
      P08DT2_n9417MMSUsuCre = new boolean[] {false} ;
      P08DT2_A9419MMSNroExt = new String[] {""} ;
      P08DT2_n9419MMSNroExt = new boolean[] {false} ;
      P08DT2_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08DT2_n11509MMSDto = new boolean[] {false} ;
      P08DT2_A9414MMSPrvNum = new int[1] ;
      P08DT2_n9414MMSPrvNum = new boolean[] {false} ;
      P08DT2_A9415MMSPrvNom = new String[] {""} ;
      P08DT2_n9415MMSPrvNom = new boolean[] {false} ;
      P08DT2_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DT2_n9416MMSFch = new boolean[] {false} ;
      P08DT2_A9412MMSCod = new int[1] ;
      P08DT2_A9420MMSEst = new String[] {""} ;
      P08DT2_n9420MMSEst = new boolean[] {false} ;
      P08DT2_A9413MMSTpo = new String[] {""} ;
      P08DT2_n9413MMSTpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54TFMMSTpo_SelsJson = "" ;
      AV70TFMMSEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmmovstwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08DT2_A396EmprCod, P08DT2_A11304MMSFchApl, P08DT2_n11304MMSFchApl, P08DT2_A9418MMSFchCre, P08DT2_n9418MMSFchCre, P08DT2_A9417MMSUsuCre, P08DT2_n9417MMSUsuCre, P08DT2_A9419MMSNroExt, P08DT2_n9419MMSNroExt, P08DT2_A11509MMSDto,
            P08DT2_n11509MMSDto, P08DT2_A9414MMSPrvNum, P08DT2_n9414MMSPrvNum, P08DT2_A9415MMSPrvNom, P08DT2_n9415MMSPrvNom, P08DT2_A9416MMSFch, P08DT2_n9416MMSFch, P08DT2_A9412MMSCod, P08DT2_A9420MMSEst, P08DT2_n9420MMSEst,
            P08DT2_A9413MMSTpo, P08DT2_n9413MMSTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9412MMSCod ;
   private int A9414MMSPrvNum ;
   private int AV81Tmmovstwwds_2_tfmmscod ;
   private int AV52TFMMSCod ;
   private int AV82Tmmovstwwds_3_tfmmscod_to ;
   private int AV53TFMMSCod_To ;
   private int AV87Tmmovstwwds_8_tfmmsprvnum ;
   private int AV56TFMMSPrvNum ;
   private int AV88Tmmovstwwds_9_tfmmsprvnum_to ;
   private int AV57TFMMSPrvNum_To ;
   private int AV83Tmmovstwwds_4_tfmmstpo_sels_size ;
   private int AV97Tmmovstwwds_18_tfmmsest_sels_size ;
   private int AV98GXV1 ;
   private java.math.BigDecimal A11509MMSDto ;
   private java.math.BigDecimal AV89Tmmovstwwds_10_tfmmsdto ;
   private java.math.BigDecimal AV72TFMMSDto ;
   private java.math.BigDecimal AV90Tmmovstwwds_11_tfmmsdto_to ;
   private java.math.BigDecimal AV73TFMMSDto_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9413MMSTpo ;
   private String A9415MMSPrvNom ;
   private String A9419MMSNroExt ;
   private String A9417MMSUsuCre ;
   private String A9420MMSEst ;
   private String AV85Tmmovstwwds_6_tfmmsprvnom ;
   private String AV58TFMMSPrvNom ;
   private String AV86Tmmovstwwds_7_tfmmsprvnom_sel ;
   private String AV59TFMMSPrvNom_Sel ;
   private String AV91Tmmovstwwds_12_tfmmsnroext ;
   private String AV68TFMMSNroExt ;
   private String AV92Tmmovstwwds_13_tfmmsnroext_sel ;
   private String AV69TFMMSNroExt_Sel ;
   private String AV93Tmmovstwwds_14_tfmmsusucre ;
   private String AV62TFMMSUsuCre ;
   private String AV94Tmmovstwwds_15_tfmmsusucre_sel ;
   private String AV63TFMMSUsuCre_Sel ;
   private String scmdbuf ;
   private String lV85Tmmovstwwds_6_tfmmsprvnom ;
   private String lV91Tmmovstwwds_12_tfmmsnroext ;
   private String lV93Tmmovstwwds_14_tfmmsusucre ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date AV95Tmmovstwwds_16_tfmmsfchcre ;
   private java.util.Date AV64TFMMSFchCre ;
   private java.util.Date AV96Tmmovstwwds_17_tfmmsfchapl ;
   private java.util.Date AV66TFMMSFchApl ;
   private java.util.Date A9416MMSFch ;
   private java.util.Date AV84Tmmovstwwds_5_tfmmsfch ;
   private java.util.Date AV60TFMMSFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n11304MMSFchApl ;
   private boolean n9418MMSFchCre ;
   private boolean n9417MMSUsuCre ;
   private boolean n9419MMSNroExt ;
   private boolean n11509MMSDto ;
   private boolean n9414MMSPrvNum ;
   private boolean n9415MMSPrvNom ;
   private boolean n9416MMSFch ;
   private boolean n9420MMSEst ;
   private boolean n9413MMSTpo ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV54TFMMSTpo_SelsJson ;
   private String AV70TFMMSEst_SelsJson ;
   private String AV11Filename ;
   private String AV80Tmmovstwwds_1_filterfulltext ;
   private String AV74FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08DT2_A396EmprCod ;
   private java.util.Date[] P08DT2_A11304MMSFchApl ;
   private boolean[] P08DT2_n11304MMSFchApl ;
   private java.util.Date[] P08DT2_A9418MMSFchCre ;
   private boolean[] P08DT2_n9418MMSFchCre ;
   private String[] P08DT2_A9417MMSUsuCre ;
   private boolean[] P08DT2_n9417MMSUsuCre ;
   private String[] P08DT2_A9419MMSNroExt ;
   private boolean[] P08DT2_n9419MMSNroExt ;
   private java.math.BigDecimal[] P08DT2_A11509MMSDto ;
   private boolean[] P08DT2_n11509MMSDto ;
   private int[] P08DT2_A9414MMSPrvNum ;
   private boolean[] P08DT2_n9414MMSPrvNum ;
   private String[] P08DT2_A9415MMSPrvNom ;
   private boolean[] P08DT2_n9415MMSPrvNom ;
   private java.util.Date[] P08DT2_A9416MMSFch ;
   private boolean[] P08DT2_n9416MMSFch ;
   private int[] P08DT2_A9412MMSCod ;
   private String[] P08DT2_A9420MMSEst ;
   private boolean[] P08DT2_n9420MMSEst ;
   private String[] P08DT2_A9413MMSTpo ;
   private boolean[] P08DT2_n9413MMSTpo ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV83Tmmovstwwds_4_tfmmstpo_sels ;
   private GXSimpleCollection<String> AV55TFMMSTpo_Sels ;
   private GXSimpleCollection<String> AV97Tmmovstwwds_18_tfmmsest_sels ;
   private GXSimpleCollection<String> AV71TFMMSEst_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class tmmovstwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV83Tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV97Tmmovstwwds_18_tfmmsest_sels ,
                                          int AV81Tmmovstwwds_2_tfmmscod ,
                                          int AV82Tmmovstwwds_3_tfmmscod_to ,
                                          int AV83Tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV84Tmmovstwwds_5_tfmmsfch ,
                                          String AV86Tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV85Tmmovstwwds_6_tfmmsprvnom ,
                                          int AV87Tmmovstwwds_8_tfmmsprvnum ,
                                          int AV88Tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV89Tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV90Tmmovstwwds_11_tfmmsdto_to ,
                                          String AV92Tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV91Tmmovstwwds_12_tfmmsnroext ,
                                          String AV94Tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV93Tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV95Tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV96Tmmovstwwds_17_tfmmsfchapl ,
                                          int AV97Tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV80Tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst," ;
      scmdbuf += " T1.MMSTpo FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV81Tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV82Tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( AV83Tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV91Tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV93Tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( AV97Tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSTpo" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSTpo DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFch" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSDto" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSDto DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSEst" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSEst DESC" ;
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
                  return conditional_P08DT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
      }
   }

}

