package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_verproductospesadosexportcsv_impl extends GXWebProcedure
{
   public cierrerecetastinte_verproductospesadosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_VerProductosPesadosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"##" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad Medida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Unidades Medida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Teorica", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV30FilterFullText ;
      AV58Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV34TFRecLinPro ;
      AV59Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV35TFRecLinPro_To ;
      AV60Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV36TFRecLin ;
      AV61Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV37TFRecLin_To ;
      AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV38TFRecPrdNum ;
      AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV39TFRecPrdNum_Sel ;
      AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV40TFRecPrdDsc ;
      AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV41TFRecPrdDsc_Sel ;
      AV66Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV42TFForPrdUMe ;
      AV67Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV43TFForPrdUMe_To ;
      AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV44TFForPrdDsc ;
      AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV45TFForPrdDsc_Sel ;
      AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV46TFPrdCant ;
      AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV47TFPrdCant_To ;
      AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV48TFPrdCanFin ;
      AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV49TFPrdCanFin_To ;
      AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV50TFRecLinUsr ;
      AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV51TFRecLinUsr_Sel ;
      AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV52TFRecPesFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV58Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV59Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV60Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV61Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV66Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV67Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094W2 */
      pr_default.execute(0, new Object[] {lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV58Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV59Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV60Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV61Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV66Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV67Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P094W2_A396EmprCod[0] ;
         A4577RecPesFec = P094W2_A4577RecPesFec[0] ;
         A4576RecLinUsr = P094W2_A4576RecLinUsr[0] ;
         A683PrdCanFin = P094W2_A683PrdCanFin[0] ;
         A686PrdCant = P094W2_A686PrdCant[0] ;
         A488ForPrdDsc = P094W2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094W2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P094W2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094W2_n490ForPrdUMe[0] ;
         A875RecPrdDsc = P094W2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P094W2_A872RecPrdNum[0] ;
         A811RecLin = P094W2_A811RecLin[0] ;
         A1273RecLinPro = P094W2_A1273RecLinPro[0] ;
         A129BarCod = P094W2_A129BarCod[0] ;
         A132BarCodReo = P094W2_A132BarCodReo[0] ;
         A130BarCodPar = P094W2_A130BarCodPar[0] ;
         A2804RecLinMaq = P094W2_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094W2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094W2_n488ForPrdDsc[0] ;
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
            AV14TextFileLine += GXutil.str( A1273RecLinPro, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A811RecLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A872RecPrdNum, ";", ","), GXv_char3) ;
            cierrerecetastinte_verproductospesadosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A875RecPrdDsc, ";", ","), GXv_char3) ;
            cierrerecetastinte_verproductospesadosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A490ForPrdUMe, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A488ForPrdDsc, ";", ","), GXv_char3) ;
            cierrerecetastinte_verproductospesadosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A686PrdCant, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A683PrdCanFin, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4576RecLinUsr, ";", ","), GXv_char3) ;
            cierrerecetastinte_verproductospesadosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CierreRecetasTinte_VerProductosPesadosExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecLinPro", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecLin", "", "##", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecPrdNum", "", "Codigo Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecPrdDsc", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForPrdUMe", "", "Unidad Medida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForPrdDsc", "", "Descripcion Unidades Medida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCant", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanFin", "", "Cantidad Teorica", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecLinUsr", "Pesaje", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecPesFec", "Pesaje", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CierreRecetasTinte_VerProductosPesadosColumnsSelector", GXv_char3) ;
      cierrerecetastinte_verproductospesadosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV34TFRecLinPro = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFRecLinPro_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV36TFRecLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFRecLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV38TFRecPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV39TFRecPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV40TFRecPrdDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV41TFRecPrdDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV42TFForPrdUMe = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFForPrdUMe_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV44TFForPrdDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV45TFForPrdDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV46TFPrdCant = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdCant_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV48TFPrdCanFin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdCanFin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV50TFRecLinUsr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV51TFRecLinUsr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV52TFRecPesFec = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
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
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      AV38TFRecPrdNum = "" ;
      AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = "" ;
      AV39TFRecPrdNum_Sel = "" ;
      AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      AV40TFRecPrdDsc = "" ;
      AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = "" ;
      AV41TFRecPrdDsc_Sel = "" ;
      AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      AV44TFForPrdDsc = "" ;
      AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = "" ;
      AV45TFForPrdDsc_Sel = "" ;
      AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant = DecimalUtil.ZERO ;
      AV46TFPrdCant = DecimalUtil.ZERO ;
      AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV47TFPrdCant_To = DecimalUtil.ZERO ;
      AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = DecimalUtil.ZERO ;
      AV48TFPrdCanFin = DecimalUtil.ZERO ;
      AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = DecimalUtil.ZERO ;
      AV49TFPrdCanFin_To = DecimalUtil.ZERO ;
      AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      AV50TFRecLinUsr = "" ;
      AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = "" ;
      AV51TFRecLinUsr_Sel = "" ;
      AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      AV52TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      lV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      lV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      lV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      lV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      P094W2_A396EmprCod = new String[] {""} ;
      P094W2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094W2_A4576RecLinUsr = new String[] {""} ;
      P094W2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094W2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094W2_A488ForPrdDsc = new String[] {""} ;
      P094W2_n488ForPrdDsc = new boolean[] {false} ;
      P094W2_A490ForPrdUMe = new byte[1] ;
      P094W2_n490ForPrdUMe = new boolean[] {false} ;
      P094W2_A875RecPrdDsc = new String[] {""} ;
      P094W2_A872RecPrdNum = new String[] {""} ;
      P094W2_A811RecLin = new short[1] ;
      P094W2_A1273RecLinPro = new byte[1] ;
      P094W2_A129BarCod = new int[1] ;
      P094W2_A132BarCodReo = new byte[1] ;
      P094W2_A130BarCodPar = new String[] {""} ;
      P094W2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_verproductospesadosexportcsv__default(),
         new Object[] {
             new Object[] {
            P094W2_A396EmprCod, P094W2_A4577RecPesFec, P094W2_A4576RecLinUsr, P094W2_A683PrdCanFin, P094W2_A686PrdCant, P094W2_A488ForPrdDsc, P094W2_n488ForPrdDsc, P094W2_A490ForPrdUMe, P094W2_n490ForPrdUMe, P094W2_A875RecPrdDsc,
            P094W2_A872RecPrdNum, P094W2_A811RecLin, P094W2_A1273RecLinPro, P094W2_A129BarCod, P094W2_A132BarCodReo, P094W2_A130BarCodPar, P094W2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte AV58Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ;
   private byte AV34TFRecLinPro ;
   private byte AV59Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ;
   private byte AV35TFRecLinPro_To ;
   private byte AV66Cierrerecetastinte_verproductospesadosds_10_tfforprdume ;
   private byte AV42TFForPrdUMe ;
   private byte AV67Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ;
   private byte AV43TFForPrdUMe_To ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A811RecLin ;
   private short AV60Cierrerecetastinte_verproductospesadosds_4_tfreclin ;
   private short AV36TFRecLin ;
   private short AV61Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ;
   private short AV37TFRecLin_To ;
   private short AV28OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int AV77GXV1 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant ;
   private java.math.BigDecimal AV46TFPrdCant ;
   private java.math.BigDecimal AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ;
   private java.math.BigDecimal AV47TFPrdCant_To ;
   private java.math.BigDecimal AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ;
   private java.math.BigDecimal AV48TFPrdCanFin ;
   private java.math.BigDecimal AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ;
   private java.math.BigDecimal AV49TFPrdCanFin_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A4576RecLinUsr ;
   private String AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String AV38TFRecPrdNum ;
   private String AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ;
   private String AV39TFRecPrdNum_Sel ;
   private String AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String AV40TFRecPrdDsc ;
   private String AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ;
   private String AV41TFRecPrdDsc_Sel ;
   private String AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String AV44TFForPrdDsc ;
   private String AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ;
   private String AV45TFForPrdDsc_Sel ;
   private String AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String AV50TFRecLinUsr ;
   private String AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ;
   private String AV51TFRecLinUsr_Sel ;
   private String scmdbuf ;
   private String lV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String lV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String lV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String lV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ;
   private java.util.Date AV52TFRecPesFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P094W2_A396EmprCod ;
   private java.util.Date[] P094W2_A4577RecPesFec ;
   private String[] P094W2_A4576RecLinUsr ;
   private java.math.BigDecimal[] P094W2_A683PrdCanFin ;
   private java.math.BigDecimal[] P094W2_A686PrdCant ;
   private String[] P094W2_A488ForPrdDsc ;
   private boolean[] P094W2_n488ForPrdDsc ;
   private byte[] P094W2_A490ForPrdUMe ;
   private boolean[] P094W2_n490ForPrdUMe ;
   private String[] P094W2_A875RecPrdDsc ;
   private String[] P094W2_A872RecPrdNum ;
   private short[] P094W2_A811RecLin ;
   private byte[] P094W2_A1273RecLinPro ;
   private int[] P094W2_A129BarCod ;
   private byte[] P094W2_A132BarCodReo ;
   private String[] P094W2_A130BarCodPar ;
   private short[] P094W2_A2804RecLinMaq ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class cierrerecetastinte_verproductospesadosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV58Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV59Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV60Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV61Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV66Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV67Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[28];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecPesFec, T1.RecLinUsr, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV57Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV58Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV59Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV60Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV61Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV67Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV74Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanFin" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanFin DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPesFec" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPesFec DESC" ;
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
                  return conditional_P094W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[55], false);
               }
               return;
      }
   }

}

