package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class testcatwwexport extends GXProcedure
{
   public testcatwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testcatwwexport.class ), "" );
   }

   public testcatwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      testcatwwexport.this.aP1 = new String[] {""};
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
      testcatwwexport.this.aP0 = aP0;
      testcatwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TESTCATWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFEmprCod_Sel, GXv_char5) ;
         testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV36TFCliCod) && (0==AV37TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFArtCod_Sel, GXv_char5) ;
         testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFArtCod, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV40TFEstCatAny) && (0==AV41TFEstCatAny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "EstCatAny", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFEstCatAny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFEstCatAny_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFEstCatSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFEstCatSer_Sel, GXv_char5) ;
         testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFEstCatSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFEstCatSer, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFEstCatTip) && (0==AV45TFEstCatTip_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Articulo (E.Cl./Art./T.A)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFEstCatTip );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFEstCatTip_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFEstCatDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFEstCatDsc_Sel, GXv_char5) ;
         testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFEstCatDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFEstCatDsc, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFEstCatAIm0)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFEstCatAIm0_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acum.Imp0 (Est.Cl/Ar/T.Art)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFEstCatAIm0)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFEstCatAIm0_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFEstCatAIm1)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFEstCatAIm1_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acum.Imp.1 (Est.Cl/Ar/T.Art)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFEstCatAIm1)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFEstCatAIm1_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFEstCatOrd0)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFEstCatOrd0_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden (Est.Cli/Art/T.Art)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFEstCatOrd0)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         testcatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFEstCatOrd0_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TESTCATWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TESTCATWWColumnsSelector") ;
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
      AV59Testcatwwds_1_filterfulltext = AV18FilterFullText ;
      AV60Testcatwwds_2_tfemprcod = AV34TFEmprCod ;
      AV61Testcatwwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV62Testcatwwds_4_tfclicod = AV36TFCliCod ;
      AV63Testcatwwds_5_tfclicod_to = AV37TFCliCod_To ;
      AV64Testcatwwds_6_tfartcod = AV38TFArtCod ;
      AV65Testcatwwds_7_tfartcod_sel = AV39TFArtCod_Sel ;
      AV66Testcatwwds_8_tfestcatany = AV40TFEstCatAny ;
      AV67Testcatwwds_9_tfestcatany_to = AV41TFEstCatAny_To ;
      AV68Testcatwwds_10_tfestcatser = AV42TFEstCatSer ;
      AV69Testcatwwds_11_tfestcatser_sel = AV43TFEstCatSer_Sel ;
      AV70Testcatwwds_12_tfestcattip = AV44TFEstCatTip ;
      AV71Testcatwwds_13_tfestcattip_to = AV45TFEstCatTip_To ;
      AV72Testcatwwds_14_tfestcatdsc = AV46TFEstCatDsc ;
      AV73Testcatwwds_15_tfestcatdsc_sel = AV47TFEstCatDsc_Sel ;
      AV74Testcatwwds_16_tfestcataim0 = AV48TFEstCatAIm0 ;
      AV75Testcatwwds_17_tfestcataim0_to = AV49TFEstCatAIm0_To ;
      AV76Testcatwwds_18_tfestcataim1 = AV50TFEstCatAIm1 ;
      AV77Testcatwwds_19_tfestcataim1_to = AV51TFEstCatAIm1_To ;
      AV78Testcatwwds_20_tfestcatord0 = AV52TFEstCatOrd0 ;
      AV79Testcatwwds_21_tfestcatord0_to = AV53TFEstCatOrd0_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Testcatwwds_1_filterfulltext ,
                                           AV61Testcatwwds_3_tfemprcod_sel ,
                                           AV60Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV62Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV63Testcatwwds_5_tfclicod_to) ,
                                           AV65Testcatwwds_7_tfartcod_sel ,
                                           AV64Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV66Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV67Testcatwwds_9_tfestcatany_to) ,
                                           AV69Testcatwwds_11_tfestcatser_sel ,
                                           AV68Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV70Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV71Testcatwwds_13_tfestcattip_to) ,
                                           AV73Testcatwwds_15_tfestcatdsc_sel ,
                                           AV72Testcatwwds_14_tfestcatdsc ,
                                           AV74Testcatwwds_16_tfestcataim0 ,
                                           AV75Testcatwwds_17_tfestcataim0_to ,
                                           AV76Testcatwwds_18_tfestcataim1 ,
                                           AV77Testcatwwds_19_tfestcataim1_to ,
                                           AV78Testcatwwds_20_tfestcatord0 ,
                                           AV79Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Testcatwwds_1_filterfulltext), "%", "") ;
      lV60Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV60Testcatwwds_2_tfemprcod), 3, "%") ;
      lV64Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Testcatwwds_6_tfartcod), 16, "%") ;
      lV68Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV68Testcatwwds_10_tfestcatser), 3, "%") ;
      lV72Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV72Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0AL93 */
      pr_default.execute(0, new Object[] {lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV59Testcatwwds_1_filterfulltext, lV60Testcatwwds_2_tfemprcod, AV61Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV62Testcatwwds_4_tfclicod), Integer.valueOf(AV63Testcatwwds_5_tfclicod_to), lV64Testcatwwds_6_tfartcod, AV65Testcatwwds_7_tfartcod_sel, Short.valueOf(AV66Testcatwwds_8_tfestcatany), Short.valueOf(AV67Testcatwwds_9_tfestcatany_to), lV68Testcatwwds_10_tfestcatser, AV69Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV70Testcatwwds_12_tfestcattip), Short.valueOf(AV71Testcatwwds_13_tfestcattip_to), lV72Testcatwwds_14_tfestcatdsc, AV73Testcatwwds_15_tfestcatdsc_sel, AV74Testcatwwds_16_tfestcataim0, AV75Testcatwwds_17_tfestcataim0_to, AV76Testcatwwds_18_tfestcataim1, AV77Testcatwwds_19_tfestcataim1_to, AV78Testcatwwds_20_tfestcatord0, AV79Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5388EstCatOrd0 = P0AL93_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0AL93_n5388EstCatOrd0[0] ;
         A5385EstCatDsc = P0AL93_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0AL93_n5385EstCatDsc[0] ;
         A5384EstCatTip = P0AL93_A5384EstCatTip[0] ;
         A5383EstCatSer = P0AL93_A5383EstCatSer[0] ;
         A5382EstCatAny = P0AL93_A5382EstCatAny[0] ;
         A65ArtCod = P0AL93_A65ArtCod[0] ;
         A252CliCod = P0AL93_A252CliCod[0] ;
         A396EmprCod = P0AL93_A396EmprCod[0] ;
         A5387EstCatAIm1 = P0AL93_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL93_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0AL93_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL93_A5386EstCatAIm0[0] ;
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
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A65ArtCod, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5382EstCatAny );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5383EstCatSer, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5384EstCatTip );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5385EstCatDsc, GXv_char5) ;
            testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5386EstCatAIm0)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5387EstCatAIm1)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5388EstCatOrd0)) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Código Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtCod", "", "Código Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatAny", "", "EstCatAny", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatSer", "", "N.Serie Fac (Est.Cl/art/t.art)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatTip", "", "Tipo Articulo (E.Cl./Art./T.A)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatDsc", "", "Desc.T.Art (E.Cl./Art./T.A)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatAIm0", "", "Acum.Imp0 (Est.Cl/Ar/T.Art)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatAIm1", "", "Acum.Imp.1 (Est.Cl/Ar/T.Art)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EstCatOrd0", "", "Orden (Est.Cli/Art/T.Art)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TESTCATWWColumnsSelector", GXv_char5) ;
      testcatwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TESTCATWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TESTCATWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TESTCATWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV2 = 1 ;
      while ( AV80GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV38TFArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV39TFArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATANY") == 0 )
         {
            AV40TFEstCatAny = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFEstCatAny_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER") == 0 )
         {
            AV42TFEstCatSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER_SEL") == 0 )
         {
            AV43TFEstCatSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATTIP") == 0 )
         {
            AV44TFEstCatTip = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFEstCatTip_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC") == 0 )
         {
            AV46TFEstCatDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC_SEL") == 0 )
         {
            AV47TFEstCatDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM0") == 0 )
         {
            AV48TFEstCatAIm0 = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFEstCatAIm0_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM1") == 0 )
         {
            AV50TFEstCatAIm1 = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFEstCatAIm1_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATORD0") == 0 )
         {
            AV52TFEstCatOrd0 = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFEstCatOrd0_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV80GXV2 = (int)(AV80GXV2+1) ;
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
      this.aP0[0] = testcatwwexport.this.AV11Filename;
      this.aP1[0] = testcatwwexport.this.AV12ErrorMessage;
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
      AV35TFEmprCod_Sel = "" ;
      AV34TFEmprCod = "" ;
      AV39TFArtCod_Sel = "" ;
      AV38TFArtCod = "" ;
      AV43TFEstCatSer_Sel = "" ;
      AV42TFEstCatSer = "" ;
      AV47TFEstCatDsc_Sel = "" ;
      AV46TFEstCatDsc = "" ;
      AV48TFEstCatAIm0 = DecimalUtil.ZERO ;
      AV49TFEstCatAIm0_To = DecimalUtil.ZERO ;
      AV50TFEstCatAIm1 = DecimalUtil.ZERO ;
      AV51TFEstCatAIm1_To = DecimalUtil.ZERO ;
      AV52TFEstCatOrd0 = DecimalUtil.ZERO ;
      AV53TFEstCatOrd0_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A5383EstCatSer = "" ;
      A5385EstCatDsc = "" ;
      A5386EstCatAIm0 = DecimalUtil.ZERO ;
      A5387EstCatAIm1 = DecimalUtil.ZERO ;
      A5388EstCatOrd0 = DecimalUtil.ZERO ;
      AV59Testcatwwds_1_filterfulltext = "" ;
      AV60Testcatwwds_2_tfemprcod = "" ;
      AV61Testcatwwds_3_tfemprcod_sel = "" ;
      AV64Testcatwwds_6_tfartcod = "" ;
      AV65Testcatwwds_7_tfartcod_sel = "" ;
      AV68Testcatwwds_10_tfestcatser = "" ;
      AV69Testcatwwds_11_tfestcatser_sel = "" ;
      AV72Testcatwwds_14_tfestcatdsc = "" ;
      AV73Testcatwwds_15_tfestcatdsc_sel = "" ;
      AV74Testcatwwds_16_tfestcataim0 = DecimalUtil.ZERO ;
      AV75Testcatwwds_17_tfestcataim0_to = DecimalUtil.ZERO ;
      AV76Testcatwwds_18_tfestcataim1 = DecimalUtil.ZERO ;
      AV77Testcatwwds_19_tfestcataim1_to = DecimalUtil.ZERO ;
      AV78Testcatwwds_20_tfestcatord0 = DecimalUtil.ZERO ;
      AV79Testcatwwds_21_tfestcatord0_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV59Testcatwwds_1_filterfulltext = "" ;
      lV60Testcatwwds_2_tfemprcod = "" ;
      lV64Testcatwwds_6_tfartcod = "" ;
      lV68Testcatwwds_10_tfestcatser = "" ;
      lV72Testcatwwds_14_tfestcatdsc = "" ;
      P0AL93_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL93_n5388EstCatOrd0 = new boolean[] {false} ;
      P0AL93_A5385EstCatDsc = new String[] {""} ;
      P0AL93_n5385EstCatDsc = new boolean[] {false} ;
      P0AL93_A5384EstCatTip = new short[1] ;
      P0AL93_A5383EstCatSer = new String[] {""} ;
      P0AL93_A5382EstCatAny = new short[1] ;
      P0AL93_A65ArtCod = new String[] {""} ;
      P0AL93_A252CliCod = new int[1] ;
      P0AL93_A396EmprCod = new String[] {""} ;
      P0AL93_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL93_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcatwwexport__default(),
         new Object[] {
             new Object[] {
            P0AL93_A5388EstCatOrd0, P0AL93_n5388EstCatOrd0, P0AL93_A5385EstCatDsc, P0AL93_n5385EstCatDsc, P0AL93_A5384EstCatTip, P0AL93_A5383EstCatSer, P0AL93_A5382EstCatAny, P0AL93_A65ArtCod, P0AL93_A252CliCod, P0AL93_A396EmprCod,
            P0AL93_A5387EstCatAIm1, P0AL93_A5386EstCatAIm0
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV40TFEstCatAny ;
   private short AV41TFEstCatAny_To ;
   private short AV44TFEstCatTip ;
   private short AV45TFEstCatTip_To ;
   private short GXv_int3[] ;
   private short A5382EstCatAny ;
   private short A5384EstCatTip ;
   private short AV66Testcatwwds_8_tfestcatany ;
   private short AV67Testcatwwds_9_tfestcatany_to ;
   private short AV70Testcatwwds_12_tfestcattip ;
   private short AV71Testcatwwds_13_tfestcattip_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV57GXV1 ;
   private int A252CliCod ;
   private int AV62Testcatwwds_4_tfclicod ;
   private int AV63Testcatwwds_5_tfclicod_to ;
   private int AV80GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV48TFEstCatAIm0 ;
   private java.math.BigDecimal AV49TFEstCatAIm0_To ;
   private java.math.BigDecimal AV50TFEstCatAIm1 ;
   private java.math.BigDecimal AV51TFEstCatAIm1_To ;
   private java.math.BigDecimal AV52TFEstCatOrd0 ;
   private java.math.BigDecimal AV53TFEstCatOrd0_To ;
   private java.math.BigDecimal A5386EstCatAIm0 ;
   private java.math.BigDecimal A5387EstCatAIm1 ;
   private java.math.BigDecimal A5388EstCatOrd0 ;
   private java.math.BigDecimal AV74Testcatwwds_16_tfestcataim0 ;
   private java.math.BigDecimal AV75Testcatwwds_17_tfestcataim0_to ;
   private java.math.BigDecimal AV76Testcatwwds_18_tfestcataim1 ;
   private java.math.BigDecimal AV77Testcatwwds_19_tfestcataim1_to ;
   private java.math.BigDecimal AV78Testcatwwds_20_tfestcatord0 ;
   private java.math.BigDecimal AV79Testcatwwds_21_tfestcatord0_to ;
   private String AV35TFEmprCod_Sel ;
   private String AV34TFEmprCod ;
   private String AV39TFArtCod_Sel ;
   private String AV38TFArtCod ;
   private String AV43TFEstCatSer_Sel ;
   private String AV42TFEstCatSer ;
   private String AV47TFEstCatDsc_Sel ;
   private String AV46TFEstCatDsc ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A5383EstCatSer ;
   private String A5385EstCatDsc ;
   private String AV60Testcatwwds_2_tfemprcod ;
   private String AV61Testcatwwds_3_tfemprcod_sel ;
   private String AV64Testcatwwds_6_tfartcod ;
   private String AV65Testcatwwds_7_tfartcod_sel ;
   private String AV68Testcatwwds_10_tfestcatser ;
   private String AV69Testcatwwds_11_tfestcatser_sel ;
   private String AV72Testcatwwds_14_tfestcatdsc ;
   private String AV73Testcatwwds_15_tfestcatdsc_sel ;
   private String scmdbuf ;
   private String lV60Testcatwwds_2_tfemprcod ;
   private String lV64Testcatwwds_6_tfartcod ;
   private String lV68Testcatwwds_10_tfestcatser ;
   private String lV72Testcatwwds_14_tfestcatdsc ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n5388EstCatOrd0 ;
   private boolean n5385EstCatDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV59Testcatwwds_1_filterfulltext ;
   private String lV59Testcatwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AL93_A5388EstCatOrd0 ;
   private boolean[] P0AL93_n5388EstCatOrd0 ;
   private String[] P0AL93_A5385EstCatDsc ;
   private boolean[] P0AL93_n5385EstCatDsc ;
   private short[] P0AL93_A5384EstCatTip ;
   private String[] P0AL93_A5383EstCatSer ;
   private short[] P0AL93_A5382EstCatAny ;
   private String[] P0AL93_A65ArtCod ;
   private int[] P0AL93_A252CliCod ;
   private String[] P0AL93_A396EmprCod ;
   private java.math.BigDecimal[] P0AL93_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0AL93_A5386EstCatAIm0 ;
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

final  class testcatwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AL93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Testcatwwds_1_filterfulltext ,
                                          String AV61Testcatwwds_3_tfemprcod_sel ,
                                          String AV60Testcatwwds_2_tfemprcod ,
                                          int AV62Testcatwwds_4_tfclicod ,
                                          int AV63Testcatwwds_5_tfclicod_to ,
                                          String AV65Testcatwwds_7_tfartcod_sel ,
                                          String AV64Testcatwwds_6_tfartcod ,
                                          short AV66Testcatwwds_8_tfestcatany ,
                                          short AV67Testcatwwds_9_tfestcatany_to ,
                                          String AV69Testcatwwds_11_tfestcatser_sel ,
                                          String AV68Testcatwwds_10_tfestcatser ,
                                          short AV70Testcatwwds_12_tfestcattip ,
                                          short AV71Testcatwwds_13_tfestcattip_to ,
                                          String AV73Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV72Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV74Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV75Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV76Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV77Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV78Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV79Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.ArtCod, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV59Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV68Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatAny" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatAny DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatSer" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatTip" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatTip DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatOrd0" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatOrd0 DESC" ;
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
                  return conditional_P0AL93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AL93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
      }
   }

}

