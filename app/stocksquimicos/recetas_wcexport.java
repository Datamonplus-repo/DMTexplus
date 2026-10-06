package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetas_wcexport extends GXProcedure
{
   public recetas_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetas_wcexport.class ), "" );
   }

   public recetas_wcexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetas_wcexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      recetas_wcexport.this.aP0 = aP0;
      recetas_wcexport.this.aP1 = aP1;
      initialize();
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
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "Recetas_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV49TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarNHdr_Sel, GXv_char5) ;
         recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarNHdr, GXv_char5) ;
            recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFRecLinUsr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFRecLinUsr_Sel, GXv_char5) ;
         recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFRecLinUsr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFRecLinUsr, GXv_char5) ;
            recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV55TFRecPesFec) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV55TFRecPesFec );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV58TFRecFecAlt) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Alta Receta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV58TFRecFecAlt );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.Recetas_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.Recetas_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV62GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Stocksquimicos_recetas_wcds_1_filterfulltext = AV18FilterFullText ;
      AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV48TFBarNHdr ;
      AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV49TFBarNHdr_Sel ;
      AV67Stocksquimicos_recetas_wcds_4_tfreclinusr = AV53TFRecLinUsr ;
      AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV54TFRecLinUsr_Sel ;
      AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV55TFRecPesFec ;
      AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV58TFRecFecAlt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                           AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                           AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                           AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                           AV67Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                           AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                           AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV51emprcod ,
                                           AV52prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV64Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV64Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV65Stocksquimicos_recetas_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr), 11, "%") ;
      lV67Stocksquimicos_recetas_wcds_4_tfreclinusr = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_recetas_wcds_4_tfreclinusr), 8, "%") ;
      /* Using cursor P09I92 */
      pr_default.execute(0, new Object[] {AV51emprcod, AV52prdnum, lV64Stocksquimicos_recetas_wcds_1_filterfulltext, lV64Stocksquimicos_recetas_wcds_1_filterfulltext, lV65Stocksquimicos_recetas_wcds_2_tfbarnhdr, AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel, lV67Stocksquimicos_recetas_wcds_4_tfreclinusr, AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel, AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec, AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09I92_A2804RecLinMaq[0] ;
         A396EmprCod = P09I92_A396EmprCod[0] ;
         A719PrdNum = P09I92_A719PrdNum[0] ;
         n719PrdNum = P09I92_n719PrdNum[0] ;
         A4866RecFecAlt = P09I92_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09I92_n4866RecFecAlt[0] ;
         A4577RecPesFec = P09I92_A4577RecPesFec[0] ;
         A4576RecLinUsr = P09I92_A4576RecLinUsr[0] ;
         A707PrdFacCon = P09I92_A707PrdFacCon[0] ;
         A686PrdCant = P09I92_A686PrdCant[0] ;
         A130BarCodPar = P09I92_A130BarCodPar[0] ;
         A132BarCodReo = P09I92_A132BarCodReo[0] ;
         A129BarCod = P09I92_A129BarCod[0] ;
         A1273RecLinPro = P09I92_A1273RecLinPro[0] ;
         A811RecLin = P09I92_A811RecLin[0] ;
         A707PrdFacCon = P09I92_A707PrdFacCon[0] ;
         A4866RecFecAlt = P09I92_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09I92_n4866RecFecAlt[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV47Cant = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47Cant)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV50CantPdt = ((GXutil.strcmp("", A4576RecLinUsr)==0) ? DecimalUtil.doubleToDec(0) : (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50CantPdt)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4576RecLinUsr, GXv_char5) ;
            recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4577RecPesFec );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4866RecFecAlt );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV71Nfasestinte = (byte)(0) ;
            AV57BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            /* Using cursor P09I93 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A150BarFacTin = P09I93_A150BarFacTin[0] ;
               A4442BarFasDTI = P09I93_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P09I93_n4442BarFasDTI[0] ;
               A194BarOrdLin = P09I93_A194BarOrdLin[0] ;
               A758ProCod = P09I93_A758ProCod[0] ;
               if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV71Nfasestinte = (byte)(AV71Nfasestinte+1) ;
                  AV57BarFasDTI = A4442BarFasDTI ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( AV57BarFasDTI );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Cant", "", "Cantidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&CantPdt", "", "Cant Pdte", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinUsr", "Pesaje", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPesFec", "Pesaje", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFecAlt", "", "Fecha Alta Receta", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&BarFasDTI", "", "Inicio Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.Recetas_WCColumnsSelector", GXv_char5) ;
      recetas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.Recetas_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.Recetas_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("StocksQuimicos.Recetas_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV2 = 1 ;
      while ( AV73GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV48TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV49TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV53TFRecLinUsr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV54TFRecLinUsr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV55TFRecPesFec = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV58TFRecFecAlt = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV52prdnum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV73GXV2 = (int)(AV73GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = recetas_wcexport.this.AV11Filename;
      this.aP1[0] = recetas_wcexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18FilterFullText = "" ;
      AV49TFBarNHdr_Sel = "" ;
      AV48TFBarNHdr = "" ;
      AV54TFRecLinUsr_Sel = "" ;
      AV53TFRecLinUsr = "" ;
      AV55TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV58TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV64Stocksquimicos_recetas_wcds_1_filterfulltext = "" ;
      AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr = "" ;
      AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = "" ;
      AV67Stocksquimicos_recetas_wcds_4_tfreclinusr = "" ;
      AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = "" ;
      AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV64Stocksquimicos_recetas_wcds_1_filterfulltext = "" ;
      lV65Stocksquimicos_recetas_wcds_2_tfbarnhdr = "" ;
      lV67Stocksquimicos_recetas_wcds_4_tfreclinusr = "" ;
      A130BarCodPar = "" ;
      AV51emprcod = "" ;
      AV52prdnum = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09I92_A2804RecLinMaq = new short[1] ;
      P09I92_A396EmprCod = new String[] {""} ;
      P09I92_A719PrdNum = new String[] {""} ;
      P09I92_n719PrdNum = new boolean[] {false} ;
      P09I92_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09I92_n4866RecFecAlt = new boolean[] {false} ;
      P09I92_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09I92_A4576RecLinUsr = new String[] {""} ;
      P09I92_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09I92_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09I92_A130BarCodPar = new String[] {""} ;
      P09I92_A132BarCodReo = new byte[1] ;
      P09I92_A129BarCod = new int[1] ;
      P09I92_A1273RecLinPro = new byte[1] ;
      P09I92_A811RecLin = new short[1] ;
      AV47Cant = DecimalUtil.ZERO ;
      AV50CantPdt = DecimalUtil.ZERO ;
      AV57BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      P09I93_A396EmprCod = new String[] {""} ;
      P09I93_A129BarCod = new int[1] ;
      P09I93_A132BarCodReo = new byte[1] ;
      P09I93_A130BarCodPar = new String[] {""} ;
      P09I93_A150BarFacTin = new String[] {""} ;
      P09I93_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09I93_n4442BarFasDTI = new boolean[] {false} ;
      P09I93_A194BarOrdLin = new short[1] ;
      P09I93_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.recetas_wcexport__default(),
         new Object[] {
             new Object[] {
            P09I92_A2804RecLinMaq, P09I92_A396EmprCod, P09I92_A719PrdNum, P09I92_n719PrdNum, P09I92_A4866RecFecAlt, P09I92_n4866RecFecAlt, P09I92_A4577RecPesFec, P09I92_A4576RecLinUsr, P09I92_A707PrdFacCon, P09I92_A686PrdCant,
            P09I92_A130BarCodPar, P09I92_A132BarCodReo, P09I92_A129BarCod, P09I92_A1273RecLinPro, P09I92_A811RecLin
            }
            , new Object[] {
            P09I93_A396EmprCod, P09I93_A129BarCod, P09I93_A132BarCodReo, P09I93_A130BarCodPar, P09I93_A150BarFacTin, P09I93_A4442BarFasDTI, P09I93_n4442BarFasDTI, P09I93_A194BarOrdLin, P09I93_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV71Nfasestinte ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV62GXV1 ;
   private int A129BarCod ;
   private int AV73GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV47Cant ;
   private java.math.BigDecimal AV50CantPdt ;
   private String AV49TFBarNHdr_Sel ;
   private String AV48TFBarNHdr ;
   private String AV54TFRecLinUsr_Sel ;
   private String AV53TFRecLinUsr ;
   private String A13696BarNHdr ;
   private String A4576RecLinUsr ;
   private String AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr ;
   private String AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ;
   private String AV67Stocksquimicos_recetas_wcds_4_tfreclinusr ;
   private String AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV65Stocksquimicos_recetas_wcds_2_tfbarnhdr ;
   private String lV67Stocksquimicos_recetas_wcds_4_tfreclinusr ;
   private String A130BarCodPar ;
   private String AV51emprcod ;
   private String AV52prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV55TFRecPesFec ;
   private java.util.Date AV58TFRecFecAlt ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec ;
   private java.util.Date AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt ;
   private java.util.Date AV57BarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n4866RecFecAlt ;
   private boolean n4442BarFasDTI ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV64Stocksquimicos_recetas_wcds_1_filterfulltext ;
   private String lV64Stocksquimicos_recetas_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09I92_A2804RecLinMaq ;
   private String[] P09I92_A396EmprCod ;
   private String[] P09I92_A719PrdNum ;
   private boolean[] P09I92_n719PrdNum ;
   private java.util.Date[] P09I92_A4866RecFecAlt ;
   private boolean[] P09I92_n4866RecFecAlt ;
   private java.util.Date[] P09I92_A4577RecPesFec ;
   private String[] P09I92_A4576RecLinUsr ;
   private java.math.BigDecimal[] P09I92_A707PrdFacCon ;
   private java.math.BigDecimal[] P09I92_A686PrdCant ;
   private String[] P09I92_A130BarCodPar ;
   private byte[] P09I92_A132BarCodReo ;
   private int[] P09I92_A129BarCod ;
   private byte[] P09I92_A1273RecLinPro ;
   private short[] P09I92_A811RecLin ;
   private String[] P09I93_A396EmprCod ;
   private int[] P09I93_A129BarCod ;
   private byte[] P09I93_A132BarCodReo ;
   private String[] P09I93_A130BarCodPar ;
   private String[] P09I93_A150BarFacTin ;
   private java.util.Date[] P09I93_A4442BarFasDTI ;
   private boolean[] P09I93_n4442BarFasDTI ;
   private short[] P09I93_A194BarOrdLin ;
   private String[] P09I93_A758ProCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class recetas_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09I92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                          String AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                          String AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                          String AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                          String AV67Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                          java.util.Date AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                          java.util.Date AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          java.util.Date A4866RecFecAlt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV51emprcod ,
                                          String AV52prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[10];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.PrdNum, T3.RecFecAlt, T1.RecPesFec, T1.RecLinUsr, T2.PrdFacCon, T1.PrdCant, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinPro," ;
      scmdbuf += " T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV64Stocksquimicos_recetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_recetas_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_recetas_wcds_4_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Stocksquimicos_recetas_wcds_6_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70Stocksquimicos_recetas_wcds_7_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T3.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPesFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPesFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.RecFecAlt" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.RecFecAlt DESC" ;
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
                  return conditional_P09I92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09I92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09I93", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasDTI, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

