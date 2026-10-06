package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productosalternativos_wc1exportcsv_impl extends GXWebProcedure
{
   public productosalternativos_wc1exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ProductosAlternativos_WC1ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProductosAlternativos_WC1ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ProductosAlternativos_WC1ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cambiar?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV33FilterFullText ;
      AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV37TFPrdNum ;
      AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV38TFPrdNum_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV39TFPrdNom ;
      AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV40TFPrdNom_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV41TFPrdAltNum ;
      AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV42TFPrdAltNum_Sel ;
      AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV43TFPrdAltNom ;
      AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV44TFPrdAltNom_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV45TFPrvAltNum ;
      AV67Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV46TFPrvAltNum_To ;
      AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV47TFPrvAltNom ;
      AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV48TFPrvAltNom_Sel ;
      AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV49TFPrdAltFac ;
      AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV50TFPrdAltFac_To ;
      AV72Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV53TFPrdAltCam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV72Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV29Prdnumfrom ,
                                           AV30prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV66Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV67Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EG2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV66Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV66Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV67Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV67Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV29Prdnumfrom, AV30prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11718PrdAltCam = P09EG2_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EG2_A678PrdAltFac[0] ;
         A680PrdAltNum = P09EG2_A680PrdAltNum[0] ;
         A718PrdNom = P09EG2_A718PrdNom[0] ;
         A719PrdNum = P09EG2_A719PrdNum[0] ;
         A679PrdAltNom = P09EG2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EG2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EG2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EG2_n778PrvAltNum[0] ;
         A396EmprCod = P09EG2_A396EmprCod[0] ;
         A718PrdNom = P09EG2_A718PrdNom[0] ;
         A679PrdAltNom = P09EG2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EG2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EG2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EG2_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         productosalternativos_wc1exportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         productosalternativos_wc1exportcsv_impl.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
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
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char5) ;
                     productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char5) ;
                     productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A680PrdAltNum, ";", ","), GXv_char5) ;
                     productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A679PrdAltNom, ";", ","), GXv_char5) ;
                     productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A778PrvAltNum, 6, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A777PrvAltNom, ";", ","), GXv_char5) ;
                     productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A678PrdAltFac, 7, 4) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A11718PrdAltCam, 1, 0) ;
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
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ProductosAlternativos_WC1ExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAltNum", "Alternativos", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAltNom", "Alternativos", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvAltNum", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvAltNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAltFac", "", "Factor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAltCam", "", "Cambiar?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_WC1ColumnsSelector", GXv_char5) ;
      productosalternativos_wc1exportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV19Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      AV31OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV33FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV37TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV38TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV39TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV40TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV41TFPrdAltNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV42TFPrdAltNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV43TFPrdAltNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV44TFPrdAltNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV45TFPrvAltNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFPrvAltNum_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV47TFPrvAltNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV48TFPrvAltNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV49TFPrdAltFac = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFPrdAltFac_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTCAM_SEL") == 0 )
         {
            AV53TFPrdAltCam_Sel = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV29Prdnumfrom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV30prdnumto = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      AV33FilterFullText = "" ;
      AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      AV37TFPrdNum = "" ;
      AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = "" ;
      AV38TFPrdNum_Sel = "" ;
      AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      AV39TFPrdNom = "" ;
      AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = "" ;
      AV40TFPrdNom_Sel = "" ;
      AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV41TFPrdAltNum = "" ;
      AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = "" ;
      AV42TFPrdAltNum_Sel = "" ;
      AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      AV43TFPrdAltNom = "" ;
      AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = "" ;
      AV44TFPrdAltNom_Sel = "" ;
      AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = "" ;
      AV47TFPrvAltNom = "" ;
      AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = "" ;
      AV48TFPrvAltNom_Sel = "" ;
      AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV49TFPrdAltFac = DecimalUtil.ZERO ;
      AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      AV50TFPrdAltFac_To = DecimalUtil.ZERO ;
      lV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      lV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      lV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      lV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV29Prdnumfrom = "" ;
      AV30prdnumto = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P09EG2_A11718PrdAltCam = new byte[1] ;
      P09EG2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EG2_A680PrdAltNum = new String[] {""} ;
      P09EG2_A718PrdNom = new String[] {""} ;
      P09EG2_A719PrdNum = new String[] {""} ;
      P09EG2_A679PrdAltNom = new String[] {""} ;
      P09EG2_n679PrdAltNom = new boolean[] {false} ;
      P09EG2_A778PrvAltNum = new int[1] ;
      P09EG2_n778PrvAltNum = new boolean[] {false} ;
      P09EG2_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_wc1exportcsv__default(),
         new Object[] {
             new Object[] {
            P09EG2_A11718PrdAltCam, P09EG2_A678PrdAltFac, P09EG2_A680PrdAltNum, P09EG2_A718PrdNom, P09EG2_A719PrdNum, P09EG2_A679PrdAltNom, P09EG2_n679PrdAltNom, P09EG2_A778PrvAltNum, P09EG2_n778PrvAltNum, P09EG2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11718PrdAltCam ;
   private byte AV72Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ;
   private byte AV53TFPrdAltCam_Sel ;
   private short gxcookieaux ;
   private short AV31OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A778PrvAltNum ;
   private int AV66Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ;
   private int AV45TFPrvAltNum ;
   private int AV67Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ;
   private int AV46TFPrvAltNum_To ;
   private int GXv_int4[] ;
   private int AV73GXV1 ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ;
   private java.math.BigDecimal AV49TFPrdAltFac ;
   private java.math.BigDecimal AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ;
   private java.math.BigDecimal AV50TFPrdAltFac_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String AV37TFPrdNum ;
   private String AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ;
   private String AV38TFPrdNum_Sel ;
   private String AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String AV39TFPrdNom ;
   private String AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ;
   private String AV40TFPrdNom_Sel ;
   private String AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV41TFPrdAltNum ;
   private String AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ;
   private String AV42TFPrdAltNum_Sel ;
   private String AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String AV43TFPrdAltNom ;
   private String AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ;
   private String AV44TFPrdAltNom_Sel ;
   private String AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ;
   private String AV47TFPrvAltNom ;
   private String AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ;
   private String AV48TFPrvAltNom_Sel ;
   private String scmdbuf ;
   private String lV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String lV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String lV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String lV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV29Prdnumfrom ;
   private String AV30prdnumto ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String AV33FilterFullText ;
   private String lV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09EG2_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EG2_A678PrdAltFac ;
   private String[] P09EG2_A680PrdAltNum ;
   private String[] P09EG2_A718PrdNom ;
   private String[] P09EG2_A719PrdNum ;
   private String[] P09EG2_A679PrdAltNom ;
   private boolean[] P09EG2_n679PrdAltNom ;
   private int[] P09EG2_A778PrvAltNum ;
   private boolean[] P09EG2_n778PrvAltNum ;
   private String[] P09EG2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class productosalternativos_wc1exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV72Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV29Prdnumfrom ,
                                          String AV30prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV66Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV67Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV69Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV68Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( AV72Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV72Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV29Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltCam" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltCam DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09EG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
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
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

