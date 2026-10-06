package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradarecuentosproductosexportcsv_impl extends GXWebProcedure
{
   public entradarecuentosproductosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "EntradaRecuentosProductosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("EntradaRecuentosProductosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("EntradaRecuentosProductosColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Teorica", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Real", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Teo CC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Real CC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Entradarecuentosproductosds_1_filterfulltext = AV30FilterFullText ;
      AV53Entradarecuentosproductosds_2_tfprdnum = AV39TFPrdNum ;
      AV54Entradarecuentosproductosds_3_tfprdnum_sel = AV40TFPrdNum_Sel ;
      AV55Entradarecuentosproductosds_4_tfprdnom = AV41TFPrdNom ;
      AV56Entradarecuentosproductosds_5_tfprdnom_sel = AV42TFPrdNom_Sel ;
      AV57Entradarecuentosproductosds_6_tfrecexiteo = AV43TFRecExiTeo ;
      AV58Entradarecuentosproductosds_7_tfrecexiteo_to = AV44TFRecExiTeo_To ;
      AV59Entradarecuentosproductosds_8_tfrecexitcc = AV45TFRecExiTcc ;
      AV60Entradarecuentosproductosds_9_tfrecexitcc_to = AV46TFRecExiTcc_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Entradarecuentosproductosds_1_filterfulltext ,
                                           AV54Entradarecuentosproductosds_3_tfprdnum_sel ,
                                           AV53Entradarecuentosproductosds_2_tfprdnum ,
                                           AV56Entradarecuentosproductosds_5_tfprdnom_sel ,
                                           AV55Entradarecuentosproductosds_4_tfprdnom ,
                                           AV57Entradarecuentosproductosds_6_tfrecexiteo ,
                                           AV58Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                           AV59Entradarecuentosproductosds_8_tfrecexitcc ,
                                           AV60Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV47EmprCod ,
                                           AV48Recfec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV52Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV52Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV52Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV52Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV53Entradarecuentosproductosds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Entradarecuentosproductosds_2_tfprdnum), 6, "%") ;
      lV55Entradarecuentosproductosds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Entradarecuentosproductosds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08V32 */
      pr_default.execute(0, new Object[] {AV47EmprCod, AV48Recfec, lV52Entradarecuentosproductosds_1_filterfulltext, lV52Entradarecuentosproductosds_1_filterfulltext, lV52Entradarecuentosproductosds_1_filterfulltext, lV52Entradarecuentosproductosds_1_filterfulltext, lV53Entradarecuentosproductosds_2_tfprdnum, AV54Entradarecuentosproductosds_3_tfprdnum_sel, lV55Entradarecuentosproductosds_4_tfprdnom, AV56Entradarecuentosproductosds_5_tfprdnom_sel, AV57Entradarecuentosproductosds_6_tfrecexiteo, AV58Entradarecuentosproductosds_7_tfrecexiteo_to, AV59Entradarecuentosproductosds_8_tfrecexitcc, AV60Entradarecuentosproductosds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13416RecEstInv = P08V32_A13416RecEstInv[0] ;
         A727PrdRec = P08V32_A727PrdRec[0] ;
         A810RecFec = P08V32_A810RecFec[0] ;
         A396EmprCod = P08V32_A396EmprCod[0] ;
         A808RecExiTcc = P08V32_A808RecExiTcc[0] ;
         A809RecExiTeo = P08V32_A809RecExiTeo[0] ;
         A718PrdNom = P08V32_A718PrdNom[0] ;
         A719PrdNum = P08V32_A719PrdNum[0] ;
         A807RecExiRea = P08V32_A807RecExiRea[0] ;
         A11624RecMemCant = P08V32_A11624RecMemCant[0] ;
         A806RecExiRcc = P08V32_A806RecExiRcc[0] ;
         A12285RecLot = P08V32_A12285RecLot[0] ;
         A727PrdRec = P08V32_A727PrdRec[0] ;
         A718PrdNom = P08V32_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
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
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
               entradarecuentosproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
               entradarecuentosproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A809RecExiTeo, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV31RecExiRea = ((A11624RecMemCant==1) ? A807RecExiRea : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A807RecExiRea)==0) ? A809RecExiTeo : A807RecExiRea)) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV31RecExiRea, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV32Difer = A809RecExiTeo.subtract(AV31RecExiRea) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV32Difer, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A808RecExiTcc, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV33RecExiRcc = ((A11624RecMemCant==1) ? A806RecExiRcc : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A806RecExiRcc)==0) ? A808RecExiTcc : A806RecExiRcc)) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV33RecExiRcc, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV34DiferCC = A808RecExiTcc.subtract(AV33RecExiRcc) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV34DiferCC, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV35RecLot = A12285RecLot ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV35RecLot, ";", ","), GXv_char3) ;
               entradarecuentosproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=EntradaRecuentosProductosExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecExiTeo", "", "Cant Teorica", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&RecExiRea", "", "Cant Real", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Difer", "", "Dif", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecExiTcc", "", "Cant Teo CC", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&RecExiRcc", "", "Cant Real CC", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&DiferCC", "", "Dif", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&RecLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "EntradaRecuentosProductosColumnsSelector", GXv_char3) ;
      entradarecuentosproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("EntradaRecuentosProductosGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaRecuentosProductosGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV19Session.getValue("EntradaRecuentosProductosGridState"), null, null);
      }
      AV28OrderedBy = AV37GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV37GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV39TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV40TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV41TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV42TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV43TFRecExiTeo = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFRecExiTeo_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV45TFRecExiTcc = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFRecExiTcc_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
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
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      AV52Entradarecuentosproductosds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV53Entradarecuentosproductosds_2_tfprdnum = "" ;
      AV39TFPrdNum = "" ;
      AV54Entradarecuentosproductosds_3_tfprdnum_sel = "" ;
      AV40TFPrdNum_Sel = "" ;
      AV55Entradarecuentosproductosds_4_tfprdnom = "" ;
      AV41TFPrdNom = "" ;
      AV56Entradarecuentosproductosds_5_tfprdnom_sel = "" ;
      AV42TFPrdNom_Sel = "" ;
      AV57Entradarecuentosproductosds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV43TFRecExiTeo = DecimalUtil.ZERO ;
      AV58Entradarecuentosproductosds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV44TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV59Entradarecuentosproductosds_8_tfrecexitcc = DecimalUtil.ZERO ;
      AV45TFRecExiTcc = DecimalUtil.ZERO ;
      AV60Entradarecuentosproductosds_9_tfrecexitcc_to = DecimalUtil.ZERO ;
      AV46TFRecExiTcc_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV52Entradarecuentosproductosds_1_filterfulltext = "" ;
      lV53Entradarecuentosproductosds_2_tfprdnum = "" ;
      lV55Entradarecuentosproductosds_4_tfprdnom = "" ;
      A727PrdRec = "" ;
      AV47EmprCod = "" ;
      AV48Recfec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      P08V32_A13416RecEstInv = new byte[1] ;
      P08V32_A727PrdRec = new String[] {""} ;
      P08V32_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08V32_A396EmprCod = new String[] {""} ;
      P08V32_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V32_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V32_A718PrdNom = new String[] {""} ;
      P08V32_A719PrdNum = new String[] {""} ;
      P08V32_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V32_A11624RecMemCant = new byte[1] ;
      P08V32_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V32_A12285RecLot = new String[] {""} ;
      AV31RecExiRea = DecimalUtil.ZERO ;
      AV32Difer = DecimalUtil.ZERO ;
      AV33RecExiRcc = DecimalUtil.ZERO ;
      AV34DiferCC = DecimalUtil.ZERO ;
      AV35RecLot = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentosproductosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08V32_A13416RecEstInv, P08V32_A727PrdRec, P08V32_A810RecFec, P08V32_A396EmprCod, P08V32_A808RecExiTcc, P08V32_A809RecExiTeo, P08V32_A718PrdNom, P08V32_A719PrdNum, P08V32_A807RecExiRea, P08V32_A11624RecMemCant,
            P08V32_A806RecExiRcc, P08V32_A12285RecLot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11624RecMemCant ;
   private byte A13416RecEstInv ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV61GXV1 ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal AV57Entradarecuentosproductosds_6_tfrecexiteo ;
   private java.math.BigDecimal AV43TFRecExiTeo ;
   private java.math.BigDecimal AV58Entradarecuentosproductosds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV44TFRecExiTeo_To ;
   private java.math.BigDecimal AV59Entradarecuentosproductosds_8_tfrecexitcc ;
   private java.math.BigDecimal AV45TFRecExiTcc ;
   private java.math.BigDecimal AV60Entradarecuentosproductosds_9_tfrecexitcc_to ;
   private java.math.BigDecimal AV46TFRecExiTcc_To ;
   private java.math.BigDecimal AV31RecExiRea ;
   private java.math.BigDecimal AV32Difer ;
   private java.math.BigDecimal AV33RecExiRcc ;
   private java.math.BigDecimal AV34DiferCC ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A12285RecLot ;
   private String AV53Entradarecuentosproductosds_2_tfprdnum ;
   private String AV39TFPrdNum ;
   private String AV54Entradarecuentosproductosds_3_tfprdnum_sel ;
   private String AV40TFPrdNum_Sel ;
   private String AV55Entradarecuentosproductosds_4_tfprdnom ;
   private String AV41TFPrdNom ;
   private String AV56Entradarecuentosproductosds_5_tfprdnom_sel ;
   private String AV42TFPrdNom_Sel ;
   private String scmdbuf ;
   private String lV53Entradarecuentosproductosds_2_tfprdnum ;
   private String lV55Entradarecuentosproductosds_4_tfprdnom ;
   private String A727PrdRec ;
   private String AV47EmprCod ;
   private String A396EmprCod ;
   private String AV35RecLot ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV48Recfec ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV52Entradarecuentosproductosds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV52Entradarecuentosproductosds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08V32_A13416RecEstInv ;
   private String[] P08V32_A727PrdRec ;
   private java.util.Date[] P08V32_A810RecFec ;
   private String[] P08V32_A396EmprCod ;
   private java.math.BigDecimal[] P08V32_A808RecExiTcc ;
   private java.math.BigDecimal[] P08V32_A809RecExiTeo ;
   private String[] P08V32_A718PrdNom ;
   private String[] P08V32_A719PrdNum ;
   private java.math.BigDecimal[] P08V32_A807RecExiRea ;
   private byte[] P08V32_A11624RecMemCant ;
   private java.math.BigDecimal[] P08V32_A806RecExiRcc ;
   private String[] P08V32_A12285RecLot ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class entradarecuentosproductosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08V32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Entradarecuentosproductosds_1_filterfulltext ,
                                          String AV54Entradarecuentosproductosds_3_tfprdnum_sel ,
                                          String AV53Entradarecuentosproductosds_2_tfprdnum ,
                                          String AV56Entradarecuentosproductosds_5_tfprdnom_sel ,
                                          String AV55Entradarecuentosproductosds_4_tfprdnom ,
                                          java.math.BigDecimal AV57Entradarecuentosproductosds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV58Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Entradarecuentosproductosds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV60Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV47EmprCod ,
                                          java.util.Date AV48Recfec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.EmprCod, T1.RecExiTcc, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.RecExiRea, T1.RecMemCant, T1.RecExiRcc, T1.RecLot FROM" ;
      scmdbuf += " (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV52Entradarecuentosproductosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Entradarecuentosproductosds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Entradarecuentosproductosds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Entradarecuentosproductosds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Entradarecuentosproductosds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Entradarecuentosproductosds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Entradarecuentosproductosds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Entradarecuentosproductosds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Entradarecuentosproductosds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Entradarecuentosproductosds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Entradarecuentosproductosds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
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
                  return conditional_P08V32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08V32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
      }
   }

}

