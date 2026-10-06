package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_verproductospesadosexport extends GXProcedure
{
   public cierrerecetastinte_verproductospesadosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_verproductospesadosexport.class ), "" );
   }

   public cierrerecetastinte_verproductospesadosexport( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      cierrerecetastinte_verproductospesadosexport.this.aP1 = new String[] {""};
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
      cierrerecetastinte_verproductospesadosexport.this.aP0 = aP0;
      cierrerecetastinte_verproductospesadosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_VerProductosPesadosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFRecLinPro) && (0==AV35TFRecLinPro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFRecLinPro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFRecLinPro_To );
      }
      if ( ! ( (0==AV36TFRecLin) && (0==AV37TFRecLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "##") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFRecLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFRecLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFRecPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFRecPrdNum_Sel, GXv_char5) ;
         cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFRecPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFRecPrdNum, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFRecPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFRecPrdDsc_Sel, GXv_char5) ;
         cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFRecPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFRecPrdDsc, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFForPrdUMe) && (0==AV43TFForPrdUMe_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad Medida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFForPrdUMe );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFForPrdUMe_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFForPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Unidades Medida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFForPrdDsc_Sel, GXv_char5) ;
         cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFForPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Unidades Medida", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFForPrdDsc, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdCant)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdCant_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFPrdCant)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFPrdCant_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdCanFin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCanFin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Teorica", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFPrdCanFin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFPrdCanFin_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFRecLinUsr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFRecLinUsr_Sel, GXv_char5) ;
         cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFRecLinUsr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFRecLinUsr, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV52TFRecPesFec) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_verproductospesadosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV52TFRecPesFec );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV57GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV18FilterFullText ;
      AV60Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV34TFRecLinPro ;
      AV61Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV35TFRecLinPro_To ;
      AV62Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV36TFRecLin ;
      AV63Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV37TFRecLin_To ;
      AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV38TFRecPrdNum ;
      AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV39TFRecPrdNum_Sel ;
      AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV40TFRecPrdDsc ;
      AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV41TFRecPrdDsc_Sel ;
      AV68Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV42TFForPrdUMe ;
      AV69Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV43TFForPrdUMe_To ;
      AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV44TFForPrdDsc ;
      AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV45TFForPrdDsc_Sel ;
      AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV46TFPrdCant ;
      AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV47TFPrdCant_To ;
      AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV48TFPrdCanFin ;
      AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV49TFPrdCanFin_To ;
      AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV50TFRecLinUsr ;
      AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV51TFRecLinUsr_Sel ;
      AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV52TFRecPesFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV60Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV61Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV62Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV63Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV68Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV69Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
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
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094U2 */
      pr_default.execute(0, new Object[] {lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV60Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV61Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV62Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV63Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV68Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV69Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P094U2_A396EmprCod[0] ;
         A4577RecPesFec = P094U2_A4577RecPesFec[0] ;
         A4576RecLinUsr = P094U2_A4576RecLinUsr[0] ;
         A683PrdCanFin = P094U2_A683PrdCanFin[0] ;
         A686PrdCant = P094U2_A686PrdCant[0] ;
         A488ForPrdDsc = P094U2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094U2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P094U2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094U2_n490ForPrdUMe[0] ;
         A875RecPrdDsc = P094U2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P094U2_A872RecPrdNum[0] ;
         A811RecLin = P094U2_A811RecLin[0] ;
         A1273RecLinPro = P094U2_A1273RecLinPro[0] ;
         A129BarCod = P094U2_A129BarCod[0] ;
         A132BarCodReo = P094U2_A132BarCodReo[0] ;
         A130BarCodPar = P094U2_A130BarCodPar[0] ;
         A2804RecLinMaq = P094U2_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094U2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094U2_n488ForPrdDsc[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1273RecLinPro );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A811RecLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A872RecPrdNum, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A875RecPrdDsc, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A490ForPrdUMe );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A488ForPrdDsc, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A686PrdCant)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A683PrdCanFin)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4576RecLinUsr, GXv_char5) ;
            cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4577RecPesFec );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinPro", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLin", "", "##", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPrdNum", "", "Codigo Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPrdDsc", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForPrdUMe", "", "Unidad Medida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForPrdDsc", "", "Descripcion Unidades Medida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdCant", "", "Cantidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdCanFin", "", "Cantidad Teorica", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinUsr", "Pesaje", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPesFec", "Pesaje", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CierreRecetasTinte_VerProductosPesadosColumnsSelector", GXv_char5) ;
      cierrerecetastinte_verproductospesadosexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV2 = 1 ;
      while ( AV79GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV34TFRecLinPro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFRecLinPro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV36TFRecLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFRecLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV38TFRecPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV39TFRecPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV40TFRecPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV41TFRecPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV42TFForPrdUMe = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFForPrdUMe_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV44TFForPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV45TFForPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV46TFPrdCant = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdCant_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV48TFPrdCanFin = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdCanFin_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV50TFRecLinUsr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV51TFRecLinUsr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV52TFRecPesFec = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
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
      this.aP0[0] = cierrerecetastinte_verproductospesadosexport.this.AV11Filename;
      this.aP1[0] = cierrerecetastinte_verproductospesadosexport.this.AV12ErrorMessage;
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
      AV39TFRecPrdNum_Sel = "" ;
      AV38TFRecPrdNum = "" ;
      AV41TFRecPrdDsc_Sel = "" ;
      AV40TFRecPrdDsc = "" ;
      AV45TFForPrdDsc_Sel = "" ;
      AV44TFForPrdDsc = "" ;
      AV46TFPrdCant = DecimalUtil.ZERO ;
      AV47TFPrdCant_To = DecimalUtil.ZERO ;
      AV48TFPrdCanFin = DecimalUtil.ZERO ;
      AV49TFPrdCanFin_To = DecimalUtil.ZERO ;
      AV51TFRecLinUsr_Sel = "" ;
      AV50TFRecLinUsr = "" ;
      AV52TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = "" ;
      AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = "" ;
      AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = "" ;
      AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant = DecimalUtil.ZERO ;
      AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = DecimalUtil.ZERO ;
      AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = DecimalUtil.ZERO ;
      AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = "" ;
      AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      lV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      lV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      lV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      lV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      P094U2_A396EmprCod = new String[] {""} ;
      P094U2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094U2_A4576RecLinUsr = new String[] {""} ;
      P094U2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094U2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094U2_A488ForPrdDsc = new String[] {""} ;
      P094U2_n488ForPrdDsc = new boolean[] {false} ;
      P094U2_A490ForPrdUMe = new byte[1] ;
      P094U2_n490ForPrdUMe = new boolean[] {false} ;
      P094U2_A875RecPrdDsc = new String[] {""} ;
      P094U2_A872RecPrdNum = new String[] {""} ;
      P094U2_A811RecLin = new short[1] ;
      P094U2_A1273RecLinPro = new byte[1] ;
      P094U2_A129BarCod = new int[1] ;
      P094U2_A132BarCodReo = new byte[1] ;
      P094U2_A130BarCodPar = new String[] {""} ;
      P094U2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_verproductospesadosexport__default(),
         new Object[] {
             new Object[] {
            P094U2_A396EmprCod, P094U2_A4577RecPesFec, P094U2_A4576RecLinUsr, P094U2_A683PrdCanFin, P094U2_A686PrdCant, P094U2_A488ForPrdDsc, P094U2_n488ForPrdDsc, P094U2_A490ForPrdUMe, P094U2_n490ForPrdUMe, P094U2_A875RecPrdDsc,
            P094U2_A872RecPrdNum, P094U2_A811RecLin, P094U2_A1273RecLinPro, P094U2_A129BarCod, P094U2_A132BarCodReo, P094U2_A130BarCodPar, P094U2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34TFRecLinPro ;
   private byte AV35TFRecLinPro_To ;
   private byte AV42TFForPrdUMe ;
   private byte AV43TFForPrdUMe_To ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte AV60Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ;
   private byte AV61Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ;
   private byte AV68Cierrerecetastinte_verproductospesadosds_10_tfforprdume ;
   private byte AV69Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ;
   private byte A132BarCodReo ;
   private short AV36TFRecLin ;
   private short AV37TFRecLin_To ;
   private short GXv_int3[] ;
   private short A811RecLin ;
   private short AV62Cierrerecetastinte_verproductospesadosds_4_tfreclin ;
   private short AV63Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ;
   private short AV16OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV57GXV1 ;
   private int A129BarCod ;
   private int AV79GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV46TFPrdCant ;
   private java.math.BigDecimal AV47TFPrdCant_To ;
   private java.math.BigDecimal AV48TFPrdCanFin ;
   private java.math.BigDecimal AV49TFPrdCanFin_To ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant ;
   private java.math.BigDecimal AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ;
   private java.math.BigDecimal AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ;
   private java.math.BigDecimal AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ;
   private String AV39TFRecPrdNum_Sel ;
   private String AV38TFRecPrdNum ;
   private String AV41TFRecPrdDsc_Sel ;
   private String AV40TFRecPrdDsc ;
   private String AV45TFForPrdDsc_Sel ;
   private String AV44TFForPrdDsc ;
   private String AV51TFRecLinUsr_Sel ;
   private String AV50TFRecLinUsr ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A4576RecLinUsr ;
   private String AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ;
   private String AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ;
   private String AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ;
   private String AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String lV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String lV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String lV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV52TFRecPesFec ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String lV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P094U2_A396EmprCod ;
   private java.util.Date[] P094U2_A4577RecPesFec ;
   private String[] P094U2_A4576RecLinUsr ;
   private java.math.BigDecimal[] P094U2_A683PrdCanFin ;
   private java.math.BigDecimal[] P094U2_A686PrdCant ;
   private String[] P094U2_A488ForPrdDsc ;
   private boolean[] P094U2_n488ForPrdDsc ;
   private byte[] P094U2_A490ForPrdUMe ;
   private boolean[] P094U2_n490ForPrdUMe ;
   private String[] P094U2_A875RecPrdDsc ;
   private String[] P094U2_A872RecPrdNum ;
   private short[] P094U2_A811RecLin ;
   private byte[] P094U2_A1273RecLinPro ;
   private int[] P094U2_A129BarCod ;
   private byte[] P094U2_A132BarCodReo ;
   private String[] P094U2_A130BarCodPar ;
   private short[] P094U2_A2804RecLinMaq ;
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

final  class cierrerecetastinte_verproductospesadosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV60Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV61Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV62Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV63Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV68Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV69Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
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
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[28];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecPesFec, T1.RecLinUsr, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV60Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV61Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV64Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV68Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV69Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV76Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanFin" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanFin DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPesFec" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPesFec DESC" ;
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
                  return conditional_P094U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

