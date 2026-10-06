package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrepuestomovimientosexport extends GXProcedure
{
   public wcrepuestomovimientosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrepuestomovimientosexport.class ), "" );
   }

   public wcrepuestomovimientosexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcrepuestomovimientosexport.this.aP1 = new String[] {""};
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
      wcrepuestomovimientosexport.this.aP0 = aP0;
      wcrepuestomovimientosexport.this.aP1 = aP1;
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
      AV11Filename = "PrivateTempStorage" + "WCRepuestoMovimientosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV37TFMRMov) && (0==AV38TFMRMov_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFMRMov );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFMRMov_To );
      }
      if ( ! ( (0==AV39TFMRMovOrd) && (0==AV40TFMRMovOrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFMRMovOrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFMRMovOrd_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV41TFMRMovFch) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV41TFMRMovFch );
      }
      if ( ! ( (0==AV43TFMRMovTpo) && (0==AV44TFMRMovTpo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFMRMovTpo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFMRMovTpo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFMRMovTpoD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Tipo Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFMRMovTpoD_Sel, GXv_char5) ;
         wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFMRMovTpoD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Tipo Movimiento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFMRMovTpoD, GXv_char5) ;
            wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFMRMovDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFMRMovDsc_Sel, GXv_char5) ;
         wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFMRMovDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFMRMovDsc, GXv_char5) ;
            wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFMRMovCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMRMovCnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFMRMovCnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFMRMovCnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMRMovPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMRMovPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio del Mov.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFMRMovPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestomovimientosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFMRMovPre_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV22Session.getValue("WCRepuestoMovimientosColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV22Session.getValue("WCRepuestoMovimientosColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV58GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Wcrepuestomovimientosds_1_emprcod = AV16EmprCod ;
      AV61Wcrepuestomovimientosds_2_mrcod = AV17MRCod ;
      AV62Wcrepuestomovimientosds_3_mrnom = AV18MRNom ;
      AV63Wcrepuestomovimientosds_4_filterfulltext = AV21FilterFullText ;
      AV64Wcrepuestomovimientosds_5_tfmrmov = AV37TFMRMov ;
      AV65Wcrepuestomovimientosds_6_tfmrmov_to = AV38TFMRMov_To ;
      AV66Wcrepuestomovimientosds_7_tfmrmovord = AV39TFMRMovOrd ;
      AV67Wcrepuestomovimientosds_8_tfmrmovord_to = AV40TFMRMovOrd_To ;
      AV68Wcrepuestomovimientosds_9_tfmrmovfch = AV41TFMRMovFch ;
      AV69Wcrepuestomovimientosds_10_tfmrmovtpo = AV43TFMRMovTpo ;
      AV70Wcrepuestomovimientosds_11_tfmrmovtpo_to = AV44TFMRMovTpo_To ;
      AV71Wcrepuestomovimientosds_12_tfmrmovtpod = AV45TFMRMovTpoD ;
      AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV46TFMRMovTpoD_Sel ;
      AV73Wcrepuestomovimientosds_14_tfmrmovdsc = AV47TFMRMovDsc ;
      AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV48TFMRMovDsc_Sel ;
      AV75Wcrepuestomovimientosds_16_tfmrmovcnt = AV49TFMRMovCnt ;
      AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to = AV50TFMRMovCnt_To ;
      AV77Wcrepuestomovimientosds_18_tfmrmovpre = AV51TFMRMovPre ;
      AV78Wcrepuestomovimientosds_19_tfmrmovpre_to = AV52TFMRMovPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Wcrepuestomovimientosds_4_filterfulltext ,
                                           Long.valueOf(AV64Wcrepuestomovimientosds_5_tfmrmov) ,
                                           Long.valueOf(AV65Wcrepuestomovimientosds_6_tfmrmov_to) ,
                                           Integer.valueOf(AV66Wcrepuestomovimientosds_7_tfmrmovord) ,
                                           Integer.valueOf(AV67Wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                           AV68Wcrepuestomovimientosds_9_tfmrmovfch ,
                                           Integer.valueOf(AV69Wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                           Integer.valueOf(AV70Wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                           AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                           AV71Wcrepuestomovimientosds_12_tfmrmovtpod ,
                                           AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                           AV73Wcrepuestomovimientosds_14_tfmrmovdsc ,
                                           AV75Wcrepuestomovimientosds_16_tfmrmovcnt ,
                                           AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                           AV77Wcrepuestomovimientosds_18_tfmrmovpre ,
                                           AV78Wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                           Long.valueOf(A9502MRMov) ,
                                           Integer.valueOf(A9503MRMovOrd) ,
                                           Integer.valueOf(A9505MRMovTpo) ,
                                           A9506MRMovTpoD ,
                                           A9507MRMovDsc ,
                                           A9508MRMovCnt ,
                                           A9509MRMovPre ,
                                           A9504MRMovFch ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           A9493MRNom ,
                                           AV62Wcrepuestomovimientosds_3_mrnom ,
                                           A396EmprCod ,
                                           AV16EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV17MRCod) ,
                                           AV60Wcrepuestomovimientosds_1_emprcod ,
                                           Integer.valueOf(AV61Wcrepuestomovimientosds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV71Wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV71Wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
      lV73Wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV73Wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
      /* Using cursor P08VY2 */
      pr_default.execute(0, new Object[] {AV60Wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV61Wcrepuestomovimientosds_2_mrcod), AV62Wcrepuestomovimientosds_3_mrnom, AV16EmprCod, Integer.valueOf(AV17MRCod), lV63Wcrepuestomovimientosds_4_filterfulltext, lV63Wcrepuestomovimientosds_4_filterfulltext, lV63Wcrepuestomovimientosds_4_filterfulltext, lV63Wcrepuestomovimientosds_4_filterfulltext, lV63Wcrepuestomovimientosds_4_filterfulltext, lV63Wcrepuestomovimientosds_4_filterfulltext, lV63Wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV64Wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV65Wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV66Wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV67Wcrepuestomovimientosds_8_tfmrmovord_to), AV68Wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV69Wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV70Wcrepuestomovimientosds_11_tfmrmovtpo_to), lV71Wcrepuestomovimientosds_12_tfmrmovtpod, AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV73Wcrepuestomovimientosds_14_tfmrmovdsc, AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV75Wcrepuestomovimientosds_16_tfmrmovcnt, AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to, AV77Wcrepuestomovimientosds_18_tfmrmovpre, AV78Wcrepuestomovimientosds_19_tfmrmovpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9509MRMovPre = P08VY2_A9509MRMovPre[0] ;
         A9508MRMovCnt = P08VY2_A9508MRMovCnt[0] ;
         A9507MRMovDsc = P08VY2_A9507MRMovDsc[0] ;
         A9506MRMovTpoD = P08VY2_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08VY2_n9506MRMovTpoD[0] ;
         A9505MRMovTpo = P08VY2_A9505MRMovTpo[0] ;
         A9504MRMovFch = P08VY2_A9504MRMovFch[0] ;
         A9503MRMovOrd = P08VY2_A9503MRMovOrd[0] ;
         A9502MRMov = P08VY2_A9502MRMov[0] ;
         A9493MRNom = P08VY2_A9493MRNom[0] ;
         n9493MRNom = P08VY2_n9493MRNom[0] ;
         A9492MRCod = P08VY2_A9492MRCod[0] ;
         A396EmprCod = P08VY2_A396EmprCod[0] ;
         A9493MRNom = P08VY2_A9493MRNom[0] ;
         n9493MRNom = P08VY2_n9493MRNom[0] ;
         A9506MRMovTpoD = P08VY2_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08VY2_n9506MRMovTpoD[0] ;
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
         AV34VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A9502MRMov );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A9503MRMovOrd );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( A9504MRMovFch );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A9505MRMovTpo );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9506MRMovTpoD, GXv_char5) ;
            wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9507MRMovDsc, GXv_char5) ;
            wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9508MRMovCnt)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9509MRMovPre)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMov", "", "Movimiento", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovOrd", "", "Orden", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovFch", "", "Fecha", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovTpo", "", "Tipo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovTpoD", "", "Desc Tipo Movimiento", false, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovDsc", "", "Descripción", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovCnt", "", "Cantidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRMovPre", "", "Precio del Mov.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCRepuestoMovimientosColumnsSelector", GXv_char5) ;
      wcrepuestomovimientosexport.this.GXt_char4 = GXv_char5[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("WCRepuestoMovimientosGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRepuestoMovimientosGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("WCRepuestoMovimientosGridState"), null, null);
      }
      AV19OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV2 = 1 ;
      while ( AV79GXV2 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV2));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOV") == 0 )
         {
            AV37TFMRMov = GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV38TFMRMov_To = GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVORD") == 0 )
         {
            AV39TFMRMovOrd = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFMRMovOrd_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVFCH") == 0 )
         {
            AV41TFMRMovFch = localUtil.ctot( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPO") == 0 )
         {
            AV43TFMRMovTpo = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFMRMovTpo_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD") == 0 )
         {
            AV45TFMRMovTpoD = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD_SEL") == 0 )
         {
            AV46TFMRMovTpoD_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC") == 0 )
         {
            AV47TFMRMovDsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC_SEL") == 0 )
         {
            AV48TFMRMovDsc_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVCNT") == 0 )
         {
            AV49TFMRMovCnt = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFMRMovCnt_To = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVPRE") == 0 )
         {
            AV51TFMRMovPre = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFMRMovPre_To = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV17MRCod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV18MRNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV2 = (int)(AV79GXV2+1) ;
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
      this.aP0[0] = wcrepuestomovimientosexport.this.AV11Filename;
      this.aP1[0] = wcrepuestomovimientosexport.this.AV12ErrorMessage;
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
      AV21FilterFullText = "" ;
      AV41TFMRMovFch = GXutil.resetTime( GXutil.nullDate() );
      AV46TFMRMovTpoD_Sel = "" ;
      AV45TFMRMovTpoD = "" ;
      AV48TFMRMovDsc_Sel = "" ;
      AV47TFMRMovDsc = "" ;
      AV49TFMRMovCnt = DecimalUtil.ZERO ;
      AV50TFMRMovCnt_To = DecimalUtil.ZERO ;
      AV51TFMRMovPre = DecimalUtil.ZERO ;
      AV52TFMRMovPre_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9506MRMovTpoD = "" ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      AV60Wcrepuestomovimientosds_1_emprcod = "" ;
      AV16EmprCod = "" ;
      AV62Wcrepuestomovimientosds_3_mrnom = "" ;
      AV18MRNom = "" ;
      AV63Wcrepuestomovimientosds_4_filterfulltext = "" ;
      AV68Wcrepuestomovimientosds_9_tfmrmovfch = GXutil.resetTime( GXutil.nullDate() );
      AV71Wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel = "" ;
      AV73Wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel = "" ;
      AV75Wcrepuestomovimientosds_16_tfmrmovcnt = DecimalUtil.ZERO ;
      AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to = DecimalUtil.ZERO ;
      AV77Wcrepuestomovimientosds_18_tfmrmovpre = DecimalUtil.ZERO ;
      AV78Wcrepuestomovimientosds_19_tfmrmovpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV63Wcrepuestomovimientosds_4_filterfulltext = "" ;
      lV71Wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      lV73Wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      A9493MRNom = "" ;
      A396EmprCod = "" ;
      P08VY2_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VY2_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VY2_A9507MRMovDsc = new String[] {""} ;
      P08VY2_A9506MRMovTpoD = new String[] {""} ;
      P08VY2_n9506MRMovTpoD = new boolean[] {false} ;
      P08VY2_A9505MRMovTpo = new int[1] ;
      P08VY2_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08VY2_A9503MRMovOrd = new int[1] ;
      P08VY2_A9502MRMov = new long[1] ;
      P08VY2_A9493MRNom = new String[] {""} ;
      P08VY2_n9493MRNom = new boolean[] {false} ;
      P08VY2_A9492MRCod = new int[1] ;
      P08VY2_A396EmprCod = new String[] {""} ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrepuestomovimientosexport__default(),
         new Object[] {
             new Object[] {
            P08VY2_A9509MRMovPre, P08VY2_A9508MRMovCnt, P08VY2_A9507MRMovDsc, P08VY2_A9506MRMovTpoD, P08VY2_n9506MRMovTpoD, P08VY2_A9505MRMovTpo, P08VY2_A9504MRMovFch, P08VY2_A9503MRMovOrd, P08VY2_A9502MRMov, P08VY2_A9493MRNom,
            P08VY2_n9493MRNom, P08VY2_A9492MRCod, P08VY2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV19OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV39TFMRMovOrd ;
   private int AV40TFMRMovOrd_To ;
   private int AV43TFMRMovTpo ;
   private int AV44TFMRMovTpo_To ;
   private int AV58GXV1 ;
   private int A9503MRMovOrd ;
   private int A9505MRMovTpo ;
   private int AV61Wcrepuestomovimientosds_2_mrcod ;
   private int AV17MRCod ;
   private int AV66Wcrepuestomovimientosds_7_tfmrmovord ;
   private int AV67Wcrepuestomovimientosds_8_tfmrmovord_to ;
   private int AV69Wcrepuestomovimientosds_10_tfmrmovtpo ;
   private int AV70Wcrepuestomovimientosds_11_tfmrmovtpo_to ;
   private int A9492MRCod ;
   private int AV79GXV2 ;
   private long AV37TFMRMov ;
   private long AV38TFMRMov_To ;
   private long AV34VisibleColumnCount ;
   private long A9502MRMov ;
   private long AV64Wcrepuestomovimientosds_5_tfmrmov ;
   private long AV65Wcrepuestomovimientosds_6_tfmrmov_to ;
   private java.math.BigDecimal AV49TFMRMovCnt ;
   private java.math.BigDecimal AV50TFMRMovCnt_To ;
   private java.math.BigDecimal AV51TFMRMovPre ;
   private java.math.BigDecimal AV52TFMRMovPre_To ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal AV75Wcrepuestomovimientosds_16_tfmrmovcnt ;
   private java.math.BigDecimal AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to ;
   private java.math.BigDecimal AV77Wcrepuestomovimientosds_18_tfmrmovpre ;
   private java.math.BigDecimal AV78Wcrepuestomovimientosds_19_tfmrmovpre_to ;
   private String AV46TFMRMovTpoD_Sel ;
   private String AV45TFMRMovTpoD ;
   private String AV48TFMRMovDsc_Sel ;
   private String AV47TFMRMovDsc ;
   private String A9506MRMovTpoD ;
   private String A9507MRMovDsc ;
   private String AV60Wcrepuestomovimientosds_1_emprcod ;
   private String AV16EmprCod ;
   private String AV62Wcrepuestomovimientosds_3_mrnom ;
   private String AV18MRNom ;
   private String AV71Wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel ;
   private String AV73Wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel ;
   private String scmdbuf ;
   private String lV71Wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String lV73Wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String A9493MRNom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV41TFMRMovFch ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date AV68Wcrepuestomovimientosds_9_tfmrmovfch ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private boolean n9506MRMovTpoD ;
   private boolean n9493MRNom ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV63Wcrepuestomovimientosds_4_filterfulltext ;
   private String lV63Wcrepuestomovimientosds_4_filterfulltext ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VY2_A9509MRMovPre ;
   private java.math.BigDecimal[] P08VY2_A9508MRMovCnt ;
   private String[] P08VY2_A9507MRMovDsc ;
   private String[] P08VY2_A9506MRMovTpoD ;
   private boolean[] P08VY2_n9506MRMovTpoD ;
   private int[] P08VY2_A9505MRMovTpo ;
   private java.util.Date[] P08VY2_A9504MRMovFch ;
   private int[] P08VY2_A9503MRMovOrd ;
   private long[] P08VY2_A9502MRMov ;
   private String[] P08VY2_A9493MRNom ;
   private boolean[] P08VY2_n9493MRNom ;
   private int[] P08VY2_A9492MRCod ;
   private String[] P08VY2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class wcrepuestomovimientosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV64Wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV65Wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV66Wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV67Wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV68Wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV69Wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV70Wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV71Wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV73Wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV75Wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV77Wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV78Wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV62Wcrepuestomovimientosds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV16EmprCod ,
                                          int A9492MRCod ,
                                          int AV17MRCod ,
                                          String AV60Wcrepuestomovimientosds_1_emprcod ,
                                          int AV61Wcrepuestomovimientosds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MRMovPre, T1.MRMovCnt, T1.MRMovDsc, T3.MTMovNom AS MRMovTpoD, T1.MRMovTpo AS MRMovTpo, T1.MRMovFch, T1.MRMovOrd, T1.MRMov, T2.MRNom, T1.MRCod, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod" ;
      scmdbuf += " = T1.MRMovTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV63Wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMov" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMov DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovOrd" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovOrd DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovFch" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovFch DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovTpo" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovTpo DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T3.MTMovNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovDsc" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovDsc DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovCnt" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovCnt DESC" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovPre" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovPre DESC" ;
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
                  return conditional_P08VY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[39]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               return;
      }
   }

}

