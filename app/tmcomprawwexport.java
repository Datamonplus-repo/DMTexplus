package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmcomprawwexport extends GXProcedure
{
   public tmcomprawwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcomprawwexport.class ), "" );
   }

   public tmcomprawwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmcomprawwexport.this.aP1 = new String[] {""};
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
      tmcomprawwexport.this.aP0 = aP0;
      tmcomprawwexport.this.aP1 = aP1;
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
      AV11Filename = "PrivateTempStorage" + "TMCompraWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmcomprawwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV38TFMComCod) && (0==AV39TFMComCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Compra", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFMComCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFMComCod_To );
      }
      if ( ! ( ( AV56TFMComOri_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Origen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV58i = 1 ;
         AV63GXV1 = 1 ;
         while ( AV63GXV1 <= AV56TFMComOri_Sels.size() )
         {
            AV57TFMComOri_Sel = (String)AV56TFMComOri_Sels.elementAt(-1+AV63GXV1) ;
            if ( AV58i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV57TFMComOri_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Manual", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV57TFMComOri_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Automático", "") );
            }
            AV58i = (long)(AV58i+1) ;
            AV63GXV1 = (int)(AV63GXV1+1) ;
         }
      }
      if ( ! ( ( AV53TFMComEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV58i = 1 ;
         AV64GXV2 = 1 ;
         while ( AV64GXV2 <= AV53TFMComEst_Sels.size() )
         {
            AV54TFMComEst_Sel = (String)AV53TFMComEst_Sels.elementAt(-1+AV64GXV2) ;
            if ( AV58i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV54TFMComEst_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV54TFMComEst_Sel), httpContext.getMessage( "C", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Confirmada", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV54TFMComEst_Sel), httpContext.getMessage( "E", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Enviada", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV54TFMComEst_Sel), "X") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cancelada", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV54TFMComEst_Sel), httpContext.getMessage( "R", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Recibida", "") );
            }
            AV58i = (long)(AV58i+1) ;
            AV64GXV2 = (int)(AV64GXV2+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFMComFch)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV42TFMComFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFMComSolFch)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F. Solicitada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV48TFMComSolFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFMComEntFch)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F. Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV50TFMComEntFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV44TFPrvNum) && (0==AV45TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrvNom_Sel, GXv_char5) ;
         tmcomprawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmcomprawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrvNom, GXv_char5) ;
            tmcomprawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TMCompraWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TMCompraWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV65GXV3 = 1 ;
      while ( AV65GXV3 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV65GXV3));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV65GXV3 = (int)(AV65GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Tmcomprawwds_1_filterfulltext = AV18FilterFullText ;
      AV68Tmcomprawwds_2_tfmcomcod = AV38TFMComCod ;
      AV69Tmcomprawwds_3_tfmcomcod_to = AV39TFMComCod_To ;
      AV70Tmcomprawwds_4_tfmcomori_sels = AV56TFMComOri_Sels ;
      AV71Tmcomprawwds_5_tfmcomest_sels = AV53TFMComEst_Sels ;
      AV72Tmcomprawwds_6_tfmcomfch = AV42TFMComFch ;
      AV73Tmcomprawwds_7_tfmcomsolfch = AV48TFMComSolFch ;
      AV74Tmcomprawwds_8_tfmcomentfch = AV50TFMComEntFch ;
      AV75Tmcomprawwds_9_tfprvnum = AV44TFPrvNum ;
      AV76Tmcomprawwds_10_tfprvnum_to = AV45TFPrvNum_To ;
      AV77Tmcomprawwds_11_tfprvnom = AV46TFPrvNom ;
      AV78Tmcomprawwds_12_tfprvnom_sel = AV47TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11050MComOri ,
                                           AV70Tmcomprawwds_4_tfmcomori_sels ,
                                           A11049MComEst ,
                                           AV71Tmcomprawwds_5_tfmcomest_sels ,
                                           Long.valueOf(AV68Tmcomprawwds_2_tfmcomcod) ,
                                           Long.valueOf(AV69Tmcomprawwds_3_tfmcomcod_to) ,
                                           Integer.valueOf(AV70Tmcomprawwds_4_tfmcomori_sels.size()) ,
                                           Integer.valueOf(AV71Tmcomprawwds_5_tfmcomest_sels.size()) ,
                                           AV72Tmcomprawwds_6_tfmcomfch ,
                                           AV73Tmcomprawwds_7_tfmcomsolfch ,
                                           AV74Tmcomprawwds_8_tfmcomentfch ,
                                           Integer.valueOf(AV75Tmcomprawwds_9_tfprvnum) ,
                                           Integer.valueOf(AV76Tmcomprawwds_10_tfprvnum_to) ,
                                           AV78Tmcomprawwds_12_tfprvnom_sel ,
                                           AV77Tmcomprawwds_11_tfprvnom ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11046MComFch ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV67Tmcomprawwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV77Tmcomprawwds_11_tfprvnom = GXutil.padr( GXutil.rtrim( AV77Tmcomprawwds_11_tfprvnom), 30, "%") ;
      /* Using cursor P08WC2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV68Tmcomprawwds_2_tfmcomcod), Long.valueOf(AV69Tmcomprawwds_3_tfmcomcod_to), AV72Tmcomprawwds_6_tfmcomfch, AV73Tmcomprawwds_7_tfmcomsolfch, AV74Tmcomprawwds_8_tfmcomentfch, Integer.valueOf(AV75Tmcomprawwds_9_tfprvnum), Integer.valueOf(AV76Tmcomprawwds_10_tfprvnum_to), lV77Tmcomprawwds_11_tfprvnom, AV78Tmcomprawwds_12_tfprvnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08WC2_A396EmprCod[0] ;
         A794PrvNom = P08WC2_A794PrvNom[0] ;
         n794PrvNom = P08WC2_n794PrvNom[0] ;
         A795PrvNum = P08WC2_A795PrvNum[0] ;
         n795PrvNum = P08WC2_n795PrvNum[0] ;
         A11048MComEntFch = P08WC2_A11048MComEntFch[0] ;
         A11047MComSolFch = P08WC2_A11047MComSolFch[0] ;
         A11046MComFch = P08WC2_A11046MComFch[0] ;
         A11055MComCod = P08WC2_A11055MComCod[0] ;
         A11049MComEst = P08WC2_A11049MComEst[0] ;
         A11050MComOri = P08WC2_A11050MComOri[0] ;
         A794PrvNom = P08WC2_A794PrvNom[0] ;
         n794PrvNom = P08WC2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV67Tmcomprawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV67Tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV67Tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV67Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A11055MComCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A11050MComOri), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Manual", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11050MComOri), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Automático", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A11049MComEst), httpContext.getMessage( "P", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), httpContext.getMessage( "C", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Confirmada", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), httpContext.getMessage( "E", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Enviada", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "X") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cancelada", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), httpContext.getMessage( "R", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Recibida", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A11046MComFch );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A11047MComSolFch );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A11048MComEntFch );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A795PrvNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A794PrvNom, GXv_char5) ;
               tmcomprawwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
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
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MComCod", "", "Compra", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MComOri", "", "Origen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MComEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MComFch", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MComSolFch", "", "F. Solicitada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MComEntFch", "", "F. Entrada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNum", "", "Codigo Proveedor", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNom", "", "Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMCompraWWColumnsSelector", GXv_char5) ;
      tmcomprawwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TMCompraWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMCompraWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TMCompraWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV4 = 1 ;
      while ( AV79GXV4 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV4));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMCOD") == 0 )
         {
            AV38TFMComCod = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV39TFMComCod_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMORI_SEL") == 0 )
         {
            AV55TFMComOri_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV56TFMComOri_Sels.fromJSonString(AV55TFMComOri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEST_SEL") == 0 )
         {
            AV52TFMComEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFMComEst_Sels.fromJSonString(AV52TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMFCH") == 0 )
         {
            AV42TFMComFch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLFCH") == 0 )
         {
            AV48TFMComSolFch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTFCH") == 0 )
         {
            AV50TFMComEntFch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV44TFPrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV46TFPrvNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV47TFPrvNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV4 = (int)(AV79GXV4+1) ;
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
      this.aP0[0] = tmcomprawwexport.this.AV11Filename;
      this.aP1[0] = tmcomprawwexport.this.AV12ErrorMessage;
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
      AV56TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57TFMComOri_Sel = "" ;
      AV53TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFMComEst_Sel = "" ;
      AV42TFMComFch = GXutil.nullDate() ;
      AV48TFMComSolFch = GXutil.nullDate() ;
      AV50TFMComEntFch = GXutil.nullDate() ;
      AV47TFPrvNom_Sel = "" ;
      AV46TFPrvNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A11050MComOri = "" ;
      A11049MComEst = "" ;
      A11046MComFch = GXutil.nullDate() ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      A794PrvNom = "" ;
      AV67Tmcomprawwds_1_filterfulltext = "" ;
      AV70Tmcomprawwds_4_tfmcomori_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV71Tmcomprawwds_5_tfmcomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV72Tmcomprawwds_6_tfmcomfch = GXutil.nullDate() ;
      AV73Tmcomprawwds_7_tfmcomsolfch = GXutil.nullDate() ;
      AV74Tmcomprawwds_8_tfmcomentfch = GXutil.nullDate() ;
      AV77Tmcomprawwds_11_tfprvnom = "" ;
      AV78Tmcomprawwds_12_tfprvnom_sel = "" ;
      lV67Tmcomprawwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV77Tmcomprawwds_11_tfprvnom = "" ;
      P08WC2_A396EmprCod = new String[] {""} ;
      P08WC2_A794PrvNom = new String[] {""} ;
      P08WC2_n794PrvNom = new boolean[] {false} ;
      P08WC2_A795PrvNum = new int[1] ;
      P08WC2_n795PrvNum = new boolean[] {false} ;
      P08WC2_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08WC2_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08WC2_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08WC2_A11055MComCod = new long[1] ;
      P08WC2_A11049MComEst = new String[] {""} ;
      P08WC2_A11050MComOri = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55TFMComOri_SelsJson = "" ;
      AV52TFMComEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmcomprawwexport__default(),
         new Object[] {
             new Object[] {
            P08WC2_A396EmprCod, P08WC2_A794PrvNom, P08WC2_n794PrvNom, P08WC2_A795PrvNum, P08WC2_n795PrvNum, P08WC2_A11048MComEntFch, P08WC2_A11047MComSolFch, P08WC2_A11046MComFch, P08WC2_A11055MComCod, P08WC2_A11049MComEst,
            P08WC2_A11050MComOri
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV63GXV1 ;
   private int AV64GXV2 ;
   private int AV44TFPrvNum ;
   private int AV45TFPrvNum_To ;
   private int AV65GXV3 ;
   private int A795PrvNum ;
   private int AV75Tmcomprawwds_9_tfprvnum ;
   private int AV76Tmcomprawwds_10_tfprvnum_to ;
   private int AV70Tmcomprawwds_4_tfmcomori_sels_size ;
   private int AV71Tmcomprawwds_5_tfmcomest_sels_size ;
   private int AV79GXV4 ;
   private long AV38TFMComCod ;
   private long AV39TFMComCod_To ;
   private long AV58i ;
   private long AV31VisibleColumnCount ;
   private long A11055MComCod ;
   private long AV68Tmcomprawwds_2_tfmcomcod ;
   private long AV69Tmcomprawwds_3_tfmcomcod_to ;
   private String AV57TFMComOri_Sel ;
   private String AV54TFMComEst_Sel ;
   private String AV47TFPrvNom_Sel ;
   private String AV46TFPrvNom ;
   private String A11050MComOri ;
   private String A11049MComEst ;
   private String A794PrvNom ;
   private String AV77Tmcomprawwds_11_tfprvnom ;
   private String AV78Tmcomprawwds_12_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV77Tmcomprawwds_11_tfprvnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV42TFMComFch ;
   private java.util.Date AV48TFMComSolFch ;
   private java.util.Date AV50TFMComEntFch ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private java.util.Date AV72Tmcomprawwds_6_tfmcomfch ;
   private java.util.Date AV73Tmcomprawwds_7_tfmcomsolfch ;
   private java.util.Date AV74Tmcomprawwds_8_tfmcomentfch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV55TFMComOri_SelsJson ;
   private String AV52TFMComEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV67Tmcomprawwds_1_filterfulltext ;
   private String lV67Tmcomprawwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV56TFMComOri_Sels ;
   private GXSimpleCollection<String> AV53TFMComEst_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08WC2_A396EmprCod ;
   private String[] P08WC2_A794PrvNom ;
   private boolean[] P08WC2_n794PrvNom ;
   private int[] P08WC2_A795PrvNum ;
   private boolean[] P08WC2_n795PrvNum ;
   private java.util.Date[] P08WC2_A11048MComEntFch ;
   private java.util.Date[] P08WC2_A11047MComSolFch ;
   private java.util.Date[] P08WC2_A11046MComFch ;
   private long[] P08WC2_A11055MComCod ;
   private String[] P08WC2_A11049MComEst ;
   private String[] P08WC2_A11050MComOri ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV70Tmcomprawwds_4_tfmcomori_sels ;
   private GXSimpleCollection<String> AV71Tmcomprawwds_5_tfmcomest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class tmcomprawwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV70Tmcomprawwds_4_tfmcomori_sels ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV71Tmcomprawwds_5_tfmcomest_sels ,
                                          long AV68Tmcomprawwds_2_tfmcomcod ,
                                          long AV69Tmcomprawwds_3_tfmcomcod_to ,
                                          int AV70Tmcomprawwds_4_tfmcomori_sels_size ,
                                          int AV71Tmcomprawwds_5_tfmcomest_sels_size ,
                                          java.util.Date AV72Tmcomprawwds_6_tfmcomfch ,
                                          java.util.Date AV73Tmcomprawwds_7_tfmcomsolfch ,
                                          java.util.Date AV74Tmcomprawwds_8_tfmcomentfch ,
                                          int AV75Tmcomprawwds_9_tfprvnum ,
                                          int AV76Tmcomprawwds_10_tfprvnum_to ,
                                          String AV78Tmcomprawwds_12_tfprvnom_sel ,
                                          String AV77Tmcomprawwds_11_tfprvnom ,
                                          long A11055MComCod ,
                                          java.util.Date A11046MComFch ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV67Tmcomprawwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[9];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.PrvNom, T1.PrvNum, T1.MComEntFch, T1.MComSolFch, T1.MComFch, T1.MComCod, T1.MComEst, T1.MComOri FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV68Tmcomprawwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmcomprawwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( AV70Tmcomprawwds_4_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV70Tmcomprawwds_4_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      if ( AV71Tmcomprawwds_5_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Tmcomprawwds_5_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Tmcomprawwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Tmcomprawwds_7_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Tmcomprawwds_8_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmcomprawwds_9_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV76Tmcomprawwds_10_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tmcomprawwds_12_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Tmcomprawwds_11_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tmcomprawwds_12_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComOri" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComOri DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEst" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComFch" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComFch DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComSolFch" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComSolFch DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEntFch" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEntFch DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P08WC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((long[]) buf[8])[0] = rslt.getLong(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
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
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
      }
   }

}

