package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlectorwwexportcsv_impl extends GXWebProcedure
{
   public tlectorwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TLECTORWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TLECTORWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TLECTORWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV89Tlectorwwds_1_filterfulltext = AV77FilterFullText ;
      AV90Tlectorwwds_2_tflecmaqcod = AV45TFLecMaqCod ;
      AV91Tlectorwwds_3_tflecmaqcod_sel = AV46TFLecMaqCod_Sel ;
      AV92Tlectorwwds_4_tflechdr = AV78TFLecHdr ;
      AV93Tlectorwwds_5_tflechdr_sel = AV79TFLecHdr_Sel ;
      AV94Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV95Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV96Tlectorwwds_8_tflecopenom = AV80TFlecOpeNom ;
      AV97Tlectorwwds_9_tflecopenom_sel = AV81TFlecOpeNom_Sel ;
      AV98Tlectorwwds_10_tflecfascod = AV59TFLecFasCod ;
      AV99Tlectorwwds_11_tflecfascod_sel = AV60TFLecFasCod_Sel ;
      AV100Tlectorwwds_12_tflecfasdsc = AV82TFLecFasDsc ;
      AV101Tlectorwwds_13_tflecfasdsc_sel = AV83TFLecFasDsc_Sel ;
      AV102Tlectorwwds_14_tflecfasord = AV63TFLecFasOrd ;
      AV103Tlectorwwds_15_tflecfasord_to = AV64TFLecFasOrd_To ;
      AV104Tlectorwwds_16_tflecparcod = AV65TFLecParCod ;
      AV105Tlectorwwds_17_tflecparcod_to = AV66TFLecParCod_To ;
      AV106Tlectorwwds_18_tflecparnom = AV84TFLecParNom ;
      AV107Tlectorwwds_19_tflecparnom_sel = AV85TFLecParNom_Sel ;
      AV108Tlectorwwds_20_tflechor = AV69TFLecHor ;
      AV109Tlectorwwds_21_tflechor_sel = AV70TFLecHor_Sel ;
      AV110Tlectorwwds_22_tflecfec = AV71TFLecFec ;
      AV111Tlectorwwds_23_tflectipent = AV73TFLecTipEnt ;
      AV112Tlectorwwds_24_tflectipent_sel = AV74TFLecTipEnt_Sel ;
      AV113Tlectorwwds_25_tflecestado_sels = AV76TFLecEstado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV113Tlectorwwds_25_tflecestado_sels ,
                                           AV91Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV90Tlectorwwds_2_tflecmaqcod ,
                                           AV93Tlectorwwds_5_tflechdr_sel ,
                                           AV92Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV94Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV95Tlectorwwds_7_tflecopecod_to) ,
                                           AV99Tlectorwwds_11_tflecfascod_sel ,
                                           AV98Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV102Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV103Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV104Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV105Tlectorwwds_17_tflecparcod_to) ,
                                           AV109Tlectorwwds_21_tflechor_sel ,
                                           AV108Tlectorwwds_20_tflechor ,
                                           AV110Tlectorwwds_22_tflecfec ,
                                           AV112Tlectorwwds_24_tflectipent_sel ,
                                           AV111Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV89Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV97Tlectorwwds_9_tflecopenom_sel ,
                                           AV96Tlectorwwds_8_tflecopenom ,
                                           AV101Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV100Tlectorwwds_12_tflecfasdsc ,
                                           AV107Tlectorwwds_19_tflecparnom_sel ,
                                           AV106Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV113Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV90Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV90Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV92Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV92Tlectorwwds_4_tflechdr), 11, "%") ;
      lV98Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV98Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV108Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV108Tlectorwwds_20_tflechor), 8, "%") ;
      lV111Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV111Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08BA2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV113Tlectorwwds_25_tflecestado_sels.size()), lV90Tlectorwwds_2_tflecmaqcod, AV91Tlectorwwds_3_tflecmaqcod_sel, lV92Tlectorwwds_4_tflechdr, AV93Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV94Tlectorwwds_6_tflecopecod), Integer.valueOf(AV95Tlectorwwds_7_tflecopecod_to), lV98Tlectorwwds_10_tflecfascod, AV99Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV102Tlectorwwds_14_tflecfasord), Short.valueOf(AV103Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV104Tlectorwwds_16_tflecparcod), Short.valueOf(AV105Tlectorwwds_17_tflecparcod_to), lV108Tlectorwwds_20_tflechor, AV109Tlectorwwds_21_tflechor_sel, AV110Tlectorwwds_22_tflecfec, lV111Tlectorwwds_23_tflectipent, AV112Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = P08BA2_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08BA2_n1796LecTipEnt[0] ;
         A1174LecFec = P08BA2_A1174LecFec[0] ;
         n1174LecFec = P08BA2_n1174LecFec[0] ;
         A1173LecHor = P08BA2_A1173LecHor[0] ;
         n1173LecHor = P08BA2_n1173LecHor[0] ;
         A13721LecHdr = P08BA2_A13721LecHdr[0] ;
         A1166LecMaqCod = P08BA2_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08BA2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08BA2_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08BA2_A1169LecBarPar[0] ;
         n1169LecBarPar = P08BA2_n1169LecBarPar[0] ;
         A1168LecBarReo = P08BA2_A1168LecBarReo[0] ;
         n1168LecBarReo = P08BA2_n1168LecBarReo[0] ;
         A1167LecBarCod = P08BA2_A1167LecBarCod[0] ;
         n1167LecBarCod = P08BA2_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08BA2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08BA2_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08BA2_A1171LecFasCod[0] ;
         n1171LecFasCod = P08BA2_n1171LecFasCod[0] ;
         A1172LecParCod = P08BA2_A1172LecParCod[0] ;
         n1172LecParCod = P08BA2_n1172LecParCod[0] ;
         A396EmprCod = P08BA2_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV113Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV113Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV97Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV96Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV96Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV97Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV101Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV100Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV101Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV101Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV89Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV89Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV89Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV89Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV107Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV106Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV107Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV107Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV14TextFileLine = "" ;
                                 /* Execute user subroutine: 'BEFOREWRITELINE' */
                                 S162 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1166LecMaqCod, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13721LecHdr, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( A1170LecOpeCod, 6, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14259lecOpeNom, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1171LecFasCod, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14260LecFasDsc, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( A1188LecFasOrd, 4, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( A1172LecParCod, 4, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14261LecParNom, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1173LecHor, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += localUtil.dtoc( A1174LecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1796LecTipEnt, ";", ","), GXv_char3) ;
                                    tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "P") == 0 )
                                    {
                                       AV14TextFileLine += httpContext.getMessage( "Proceso", "") ;
                                    }
                                    else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "F") == 0 )
                                    {
                                       AV14TextFileLine += httpContext.getMessage( "Finalizadas", "") ;
                                    }
                                 }
                                 /* Execute user subroutine: 'AFTERWRITELINE' */
                                 S172 ();
                                 if ( returnInSub )
                                 {
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
                     }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TLECTORWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecMaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecHdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "lecOpeNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFasCod", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFasDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFasOrd", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecParNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecHor", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecTipEnt", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecEstado", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TLECTORWWColumnsSelector", GXv_char3) ;
      tlectorwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TLECTORWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TLECTORWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("TLECTORWWGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV77FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV45TFLecMaqCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV46TFLecMaqCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV78TFLecHdr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV79TFLecHdr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV55TFLecOpeCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFLecOpeCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV80TFlecOpeNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV81TFlecOpeNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV59TFLecFasCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD_SEL") == 0 )
         {
            AV60TFLecFasCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV82TFLecFasDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV83TFLecFasDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV63TFLecFasOrd = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFLecFasOrd_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV65TFLecParCod = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFLecParCod_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV84TFLecParNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV85TFLecParNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV69TFLecHor = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR_SEL") == 0 )
         {
            AV70TFLecHor_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV71TFLecFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV73TFLecTipEnt = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT_SEL") == 0 )
         {
            AV74TFLecTipEnt_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV75TFLecEstado_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFLecEstado_Sels.fromJSonString(AV75TFLecEstado_SelsJson, null);
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
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
      A1166LecMaqCod = "" ;
      A13721LecHdr = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13722LecEstado = "" ;
      AV89Tlectorwwds_1_filterfulltext = "" ;
      AV77FilterFullText = "" ;
      AV90Tlectorwwds_2_tflecmaqcod = "" ;
      AV45TFLecMaqCod = "" ;
      AV91Tlectorwwds_3_tflecmaqcod_sel = "" ;
      AV46TFLecMaqCod_Sel = "" ;
      AV92Tlectorwwds_4_tflechdr = "" ;
      AV78TFLecHdr = "" ;
      AV93Tlectorwwds_5_tflechdr_sel = "" ;
      AV79TFLecHdr_Sel = "" ;
      AV96Tlectorwwds_8_tflecopenom = "" ;
      AV80TFlecOpeNom = "" ;
      AV97Tlectorwwds_9_tflecopenom_sel = "" ;
      AV81TFlecOpeNom_Sel = "" ;
      AV98Tlectorwwds_10_tflecfascod = "" ;
      AV59TFLecFasCod = "" ;
      AV99Tlectorwwds_11_tflecfascod_sel = "" ;
      AV60TFLecFasCod_Sel = "" ;
      AV100Tlectorwwds_12_tflecfasdsc = "" ;
      AV82TFLecFasDsc = "" ;
      AV101Tlectorwwds_13_tflecfasdsc_sel = "" ;
      AV83TFLecFasDsc_Sel = "" ;
      AV106Tlectorwwds_18_tflecparnom = "" ;
      AV84TFLecParNom = "" ;
      AV107Tlectorwwds_19_tflecparnom_sel = "" ;
      AV85TFLecParNom_Sel = "" ;
      AV108Tlectorwwds_20_tflechor = "" ;
      AV69TFLecHor = "" ;
      AV109Tlectorwwds_21_tflechor_sel = "" ;
      AV70TFLecHor_Sel = "" ;
      AV110Tlectorwwds_22_tflecfec = GXutil.nullDate() ;
      AV71TFLecFec = GXutil.nullDate() ;
      AV111Tlectorwwds_23_tflectipent = "" ;
      AV73TFLecTipEnt = "" ;
      AV112Tlectorwwds_24_tflectipent_sel = "" ;
      AV74TFLecTipEnt_Sel = "" ;
      AV113Tlectorwwds_25_tflecestado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV76TFLecEstado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV90Tlectorwwds_2_tflecmaqcod = "" ;
      lV92Tlectorwwds_4_tflechdr = "" ;
      lV98Tlectorwwds_10_tflecfascod = "" ;
      lV108Tlectorwwds_20_tflechor = "" ;
      lV111Tlectorwwds_23_tflectipent = "" ;
      A1169LecBarPar = "" ;
      P08BA2_A1796LecTipEnt = new String[] {""} ;
      P08BA2_n1796LecTipEnt = new boolean[] {false} ;
      P08BA2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BA2_n1174LecFec = new boolean[] {false} ;
      P08BA2_A1173LecHor = new String[] {""} ;
      P08BA2_n1173LecHor = new boolean[] {false} ;
      P08BA2_A13721LecHdr = new String[] {""} ;
      P08BA2_A1166LecMaqCod = new String[] {""} ;
      P08BA2_A1188LecFasOrd = new short[1] ;
      P08BA2_n1188LecFasOrd = new boolean[] {false} ;
      P08BA2_A1169LecBarPar = new String[] {""} ;
      P08BA2_n1169LecBarPar = new boolean[] {false} ;
      P08BA2_A1168LecBarReo = new byte[1] ;
      P08BA2_n1168LecBarReo = new boolean[] {false} ;
      P08BA2_A1167LecBarCod = new int[1] ;
      P08BA2_n1167LecBarCod = new boolean[] {false} ;
      P08BA2_A1170LecOpeCod = new int[1] ;
      P08BA2_n1170LecOpeCod = new boolean[] {false} ;
      P08BA2_A1171LecFasCod = new String[] {""} ;
      P08BA2_n1171LecFasCod = new boolean[] {false} ;
      P08BA2_A1172LecParCod = new short[1] ;
      P08BA2_n1172LecParCod = new boolean[] {false} ;
      P08BA2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV75TFLecEstado_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlectorwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08BA2_A1796LecTipEnt, P08BA2_n1796LecTipEnt, P08BA2_A1174LecFec, P08BA2_n1174LecFec, P08BA2_A1173LecHor, P08BA2_n1173LecHor, P08BA2_A13721LecHdr, P08BA2_A1166LecMaqCod, P08BA2_A1188LecFasOrd, P08BA2_n1188LecFasOrd,
            P08BA2_A1169LecBarPar, P08BA2_n1169LecBarPar, P08BA2_A1168LecBarReo, P08BA2_n1168LecBarReo, P08BA2_A1167LecBarCod, P08BA2_n1167LecBarCod, P08BA2_A1170LecOpeCod, P08BA2_n1170LecOpeCod, P08BA2_A1171LecFasCod, P08BA2_n1171LecFasCod,
            P08BA2_A1172LecParCod, P08BA2_n1172LecParCod, P08BA2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private short gxcookieaux ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV102Tlectorwwds_14_tflecfasord ;
   private short AV63TFLecFasOrd ;
   private short AV103Tlectorwwds_15_tflecfasord_to ;
   private short AV64TFLecFasOrd_To ;
   private short AV104Tlectorwwds_16_tflecparcod ;
   private short AV65TFLecParCod ;
   private short AV105Tlectorwwds_17_tflecparcod_to ;
   private short AV66TFLecParCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1170LecOpeCod ;
   private int AV94Tlectorwwds_6_tflecopecod ;
   private int AV55TFLecOpeCod ;
   private int AV95Tlectorwwds_7_tflecopecod_to ;
   private int AV56TFLecOpeCod_To ;
   private int AV113Tlectorwwds_25_tflecestado_sels_size ;
   private int A1167LecBarCod ;
   private int AV114GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1166LecMaqCod ;
   private String A13721LecHdr ;
   private String A14259lecOpeNom ;
   private String A1171LecFasCod ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String A13722LecEstado ;
   private String AV90Tlectorwwds_2_tflecmaqcod ;
   private String AV45TFLecMaqCod ;
   private String AV91Tlectorwwds_3_tflecmaqcod_sel ;
   private String AV46TFLecMaqCod_Sel ;
   private String AV92Tlectorwwds_4_tflechdr ;
   private String AV78TFLecHdr ;
   private String AV93Tlectorwwds_5_tflechdr_sel ;
   private String AV79TFLecHdr_Sel ;
   private String AV96Tlectorwwds_8_tflecopenom ;
   private String AV80TFlecOpeNom ;
   private String AV97Tlectorwwds_9_tflecopenom_sel ;
   private String AV81TFlecOpeNom_Sel ;
   private String AV98Tlectorwwds_10_tflecfascod ;
   private String AV59TFLecFasCod ;
   private String AV99Tlectorwwds_11_tflecfascod_sel ;
   private String AV60TFLecFasCod_Sel ;
   private String AV100Tlectorwwds_12_tflecfasdsc ;
   private String AV82TFLecFasDsc ;
   private String AV101Tlectorwwds_13_tflecfasdsc_sel ;
   private String AV83TFLecFasDsc_Sel ;
   private String AV106Tlectorwwds_18_tflecparnom ;
   private String AV84TFLecParNom ;
   private String AV107Tlectorwwds_19_tflecparnom_sel ;
   private String AV85TFLecParNom_Sel ;
   private String AV108Tlectorwwds_20_tflechor ;
   private String AV69TFLecHor ;
   private String AV109Tlectorwwds_21_tflechor_sel ;
   private String AV70TFLecHor_Sel ;
   private String AV111Tlectorwwds_23_tflectipent ;
   private String AV73TFLecTipEnt ;
   private String AV112Tlectorwwds_24_tflectipent_sel ;
   private String AV74TFLecTipEnt_Sel ;
   private String scmdbuf ;
   private String lV90Tlectorwwds_2_tflecmaqcod ;
   private String lV92Tlectorwwds_4_tflechdr ;
   private String lV98Tlectorwwds_10_tflecfascod ;
   private String lV108Tlectorwwds_20_tflechor ;
   private String lV111Tlectorwwds_23_tflectipent ;
   private String A1169LecBarPar ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV110Tlectorwwds_22_tflecfec ;
   private java.util.Date AV71TFLecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1796LecTipEnt ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV75TFLecEstado_SelsJson ;
   private String AV11Filename ;
   private String AV89Tlectorwwds_1_filterfulltext ;
   private String AV77FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08BA2_A1796LecTipEnt ;
   private boolean[] P08BA2_n1796LecTipEnt ;
   private java.util.Date[] P08BA2_A1174LecFec ;
   private boolean[] P08BA2_n1174LecFec ;
   private String[] P08BA2_A1173LecHor ;
   private boolean[] P08BA2_n1173LecHor ;
   private String[] P08BA2_A13721LecHdr ;
   private String[] P08BA2_A1166LecMaqCod ;
   private short[] P08BA2_A1188LecFasOrd ;
   private boolean[] P08BA2_n1188LecFasOrd ;
   private String[] P08BA2_A1169LecBarPar ;
   private boolean[] P08BA2_n1169LecBarPar ;
   private byte[] P08BA2_A1168LecBarReo ;
   private boolean[] P08BA2_n1168LecBarReo ;
   private int[] P08BA2_A1167LecBarCod ;
   private boolean[] P08BA2_n1167LecBarCod ;
   private int[] P08BA2_A1170LecOpeCod ;
   private boolean[] P08BA2_n1170LecOpeCod ;
   private String[] P08BA2_A1171LecFasCod ;
   private boolean[] P08BA2_n1171LecFasCod ;
   private short[] P08BA2_A1172LecParCod ;
   private boolean[] P08BA2_n1172LecParCod ;
   private String[] P08BA2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV113Tlectorwwds_25_tflecestado_sels ;
   private GXSimpleCollection<String> AV76TFLecEstado_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tlectorwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV113Tlectorwwds_25_tflecestado_sels ,
                                          String AV91Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV90Tlectorwwds_2_tflecmaqcod ,
                                          String AV93Tlectorwwds_5_tflechdr_sel ,
                                          String AV92Tlectorwwds_4_tflechdr ,
                                          int AV94Tlectorwwds_6_tflecopecod ,
                                          int AV95Tlectorwwds_7_tflecopecod_to ,
                                          String AV99Tlectorwwds_11_tflecfascod_sel ,
                                          String AV98Tlectorwwds_10_tflecfascod ,
                                          short AV102Tlectorwwds_14_tflecfasord ,
                                          short AV103Tlectorwwds_15_tflecfasord_to ,
                                          short AV104Tlectorwwds_16_tflecparcod ,
                                          short AV105Tlectorwwds_17_tflecparcod_to ,
                                          String AV109Tlectorwwds_21_tflechor_sel ,
                                          String AV108Tlectorwwds_20_tflechor ,
                                          java.util.Date AV110Tlectorwwds_22_tflecfec ,
                                          String AV112Tlectorwwds_24_tflectipent_sel ,
                                          String AV111Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV89Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV97Tlectorwwds_9_tflecopenom_sel ,
                                          String AV96Tlectorwwds_8_tflecopenom ,
                                          String AV101Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV100Tlectorwwds_12_tflecfasdsc ,
                                          String AV107Tlectorwwds_19_tflecparnom_sel ,
                                          String AV106Tlectorwwds_18_tflecparnom ,
                                          int AV113Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV91Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV92Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV94Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV95Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV102Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV103Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV104Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV105Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV108Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV111Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
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
                  return conditional_P08BA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

