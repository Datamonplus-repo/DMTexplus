package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticu_wwexport extends GXProcedure
{
   public tarticu_wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_wwexport.class ), "" );
   }

   public tarticu_wwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tarticu_wwexport.this.aP1 = new String[] {""};
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
      tarticu_wwexport.this.aP0 = aP0;
      tarticu_wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "Tarticu_WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFCliCod) && (0==AV35TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCliNom_Sel, GXv_char5) ;
         tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFCliNom, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFArtCod_Sel, GXv_char5) ;
         tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFArtCod, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFArtDsc_Sel, GXv_char5) ;
         tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFArtDsc, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFTipArtCod) && (0==AV43TFTipArtCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFTipArtCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFTipArtCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFTipArtDsc_Sel, GXv_char5) ;
         tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFTipArtDsc, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFArtPml) && (0==AV47TFArtPml_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pml", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFArtPml );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFArtPml_To );
      }
      if ( ! ( (0==AV48TFArtGraAca) && (0==AV49TFArtGraAca_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Grm2", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFArtGraAca );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFArtGraAca_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFArtRen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFArtRen_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rdto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFArtRen)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFArtRen_To)) );
      }
      if ( ! ( (0==AV52TFArtAcaMin) && (0==AV53TFArtAcaMin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ancho Ac", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFArtAcaMin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFArtAcaMin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFArtComer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo Comercial", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFArtComer_Sel, GXv_char5) ;
         tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFArtComer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo Comercial", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFArtComer, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFArtActivo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Activo?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticu_wwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV58TFArtActivo_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV58TFArtActivo_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Tarticu_WWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Tarticu_WWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV61GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Tarticu_wwds_1_filterfulltext = AV18FilterFullText ;
      AV64Tarticu_wwds_2_tfclicod = AV34TFCliCod ;
      AV65Tarticu_wwds_3_tfclicod_to = AV35TFCliCod_To ;
      AV66Tarticu_wwds_4_tfclinom = AV36TFCliNom ;
      AV67Tarticu_wwds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV68Tarticu_wwds_6_tfartcod = AV38TFArtCod ;
      AV69Tarticu_wwds_7_tfartcod_sel = AV39TFArtCod_Sel ;
      AV70Tarticu_wwds_8_tfartdsc = AV40TFArtDsc ;
      AV71Tarticu_wwds_9_tfartdsc_sel = AV41TFArtDsc_Sel ;
      AV72Tarticu_wwds_10_tftipartcod = AV42TFTipArtCod ;
      AV73Tarticu_wwds_11_tftipartcod_to = AV43TFTipArtCod_To ;
      AV74Tarticu_wwds_12_tftipartdsc = AV44TFTipArtDsc ;
      AV75Tarticu_wwds_13_tftipartdsc_sel = AV45TFTipArtDsc_Sel ;
      AV76Tarticu_wwds_14_tfartpml = AV46TFArtPml ;
      AV77Tarticu_wwds_15_tfartpml_to = AV47TFArtPml_To ;
      AV78Tarticu_wwds_16_tfartgraaca = AV48TFArtGraAca ;
      AV79Tarticu_wwds_17_tfartgraaca_to = AV49TFArtGraAca_To ;
      AV80Tarticu_wwds_18_tfartren = AV50TFArtRen ;
      AV81Tarticu_wwds_19_tfartren_to = AV51TFArtRen_To ;
      AV82Tarticu_wwds_20_tfartacamin = AV52TFArtAcaMin ;
      AV83Tarticu_wwds_21_tfartacamin_to = AV53TFArtAcaMin_To ;
      AV84Tarticu_wwds_22_tfartcomer = AV54TFArtComer ;
      AV85Tarticu_wwds_23_tfartcomer_sel = AV55TFArtComer_Sel ;
      AV86Tarticu_wwds_24_tfartactivo_sel = AV58TFArtActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV65Tarticu_wwds_3_tfclicod_to) ,
                                           AV67Tarticu_wwds_5_tfclinom_sel ,
                                           AV66Tarticu_wwds_4_tfclinom ,
                                           AV69Tarticu_wwds_7_tfartcod_sel ,
                                           AV68Tarticu_wwds_6_tfartcod ,
                                           AV71Tarticu_wwds_9_tfartdsc_sel ,
                                           AV70Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV72Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV73Tarticu_wwds_11_tftipartcod_to) ,
                                           AV75Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV74Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV76Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV77Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV78Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV79Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV80Tarticu_wwds_18_tfartren ,
                                           AV81Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV82Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV83Tarticu_wwds_21_tfartacamin_to) ,
                                           AV85Tarticu_wwds_23_tfartcomer_sel ,
                                           AV84Tarticu_wwds_22_tfartcomer ,
                                           AV86Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV63Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV66Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV66Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV68Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV68Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV70Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV70Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV74Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV74Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV84Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV84Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9B2 */
      pr_default.execute(0, new Object[] {lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, lV63Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV64Tarticu_wwds_2_tfclicod), Integer.valueOf(AV65Tarticu_wwds_3_tfclicod_to), lV66Tarticu_wwds_4_tfclinom, AV67Tarticu_wwds_5_tfclinom_sel, lV68Tarticu_wwds_6_tfartcod, AV69Tarticu_wwds_7_tfartcod_sel, lV70Tarticu_wwds_8_tfartdsc, AV71Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV72Tarticu_wwds_10_tftipartcod), Short.valueOf(AV73Tarticu_wwds_11_tftipartcod_to), lV74Tarticu_wwds_12_tftipartdsc, AV75Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV76Tarticu_wwds_14_tfartpml), Short.valueOf(AV77Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV78Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV79Tarticu_wwds_17_tfartgraaca_to), AV80Tarticu_wwds_18_tfartren, AV81Tarticu_wwds_19_tfartren_to, Short.valueOf(AV82Tarticu_wwds_20_tfartacamin), Short.valueOf(AV83Tarticu_wwds_21_tfartacamin_to), lV84Tarticu_wwds_22_tfartcomer, AV85Tarticu_wwds_23_tfartcomer_sel, AV86Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P0A9B2_A10045CliAct[0] ;
         A14295ArtActivo = P0A9B2_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9B2_A5741ArtComer[0] ;
         n5741ArtComer = P0A9B2_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9B2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9B2_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9B2_A95ArtRen[0] ;
         n95ArtRen = P0A9B2_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9B2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9B2_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9B2_A1148ArtPml[0] ;
         n1148ArtPml = P0A9B2_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9B2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9B2_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9B2_A829TipArtCod[0] ;
         A69ArtDsc = P0A9B2_A69ArtDsc[0] ;
         n69ArtDsc = P0A9B2_n69ArtDsc[0] ;
         A65ArtCod = P0A9B2_A65ArtCod[0] ;
         A279CliNom = P0A9B2_A279CliNom[0] ;
         A252CliCod = P0A9B2_A252CliCod[0] ;
         A396EmprCod = P0A9B2_A396EmprCod[0] ;
         A10045CliAct = P0A9B2_A10045CliAct[0] ;
         A279CliNom = P0A9B2_A279CliNom[0] ;
         A830TipArtDsc = P0A9B2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9B2_n830TipArtDsc[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A65ArtCod, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A69ArtDsc, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A829TipArtCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A830TipArtDsc, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1148ArtPml );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1903ArtGraAca );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A95ArtRen)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A63ArtAcaMin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV57NProc );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5741ArtComer, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14295ArtActivo, GXv_char5) ;
            tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtCod", "", "Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipArtCod", "", "Tipo Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipArtDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtPml", "", "Pml", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtGraAca", "", "Grm2", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtRen", "", "Rdto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtAcaMin", "", "Ancho Ac", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&NProc", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ProCods", "", "Proceso", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ProDscs", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ArtProCod", "", "Acs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtComer", "", "Artículo Comercial", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtActivo", "", "Activo?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Tarticu_WWColumnsSelector", GXv_char5) ;
      tarticu_wwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Tarticu_WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Tarticu_WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Tarticu_WWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV2 = 1 ;
      while ( AV87GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV38TFArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV39TFArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV40TFArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV41TFArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV42TFTipArtCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFTipArtCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV44TFTipArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV45TFTipArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV46TFArtPml = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFArtPml_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV48TFArtGraAca = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFArtGraAca_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV50TFArtRen = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFArtRen_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV52TFArtAcaMin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFArtAcaMin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV54TFArtComer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV55TFArtComer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACTIVO_SEL") == 0 )
         {
            AV58TFArtActivo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV87GXV2 = (int)(AV87GXV2+1) ;
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
      this.aP0[0] = tarticu_wwexport.this.AV11Filename;
      this.aP1[0] = tarticu_wwexport.this.AV12ErrorMessage;
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
      AV37TFCliNom_Sel = "" ;
      AV36TFCliNom = "" ;
      AV39TFArtCod_Sel = "" ;
      AV38TFArtCod = "" ;
      AV41TFArtDsc_Sel = "" ;
      AV40TFArtDsc = "" ;
      AV45TFTipArtDsc_Sel = "" ;
      AV44TFTipArtDsc = "" ;
      AV50TFArtRen = DecimalUtil.ZERO ;
      AV51TFArtRen_To = DecimalUtil.ZERO ;
      AV55TFArtComer_Sel = "" ;
      AV54TFArtComer = "" ;
      AV58TFArtActivo_Sel = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      A14295ArtActivo = "" ;
      AV63Tarticu_wwds_1_filterfulltext = "" ;
      AV66Tarticu_wwds_4_tfclinom = "" ;
      AV67Tarticu_wwds_5_tfclinom_sel = "" ;
      AV68Tarticu_wwds_6_tfartcod = "" ;
      AV69Tarticu_wwds_7_tfartcod_sel = "" ;
      AV70Tarticu_wwds_8_tfartdsc = "" ;
      AV71Tarticu_wwds_9_tfartdsc_sel = "" ;
      AV74Tarticu_wwds_12_tftipartdsc = "" ;
      AV75Tarticu_wwds_13_tftipartdsc_sel = "" ;
      AV80Tarticu_wwds_18_tfartren = DecimalUtil.ZERO ;
      AV81Tarticu_wwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV84Tarticu_wwds_22_tfartcomer = "" ;
      AV85Tarticu_wwds_23_tfartcomer_sel = "" ;
      AV86Tarticu_wwds_24_tfartactivo_sel = "" ;
      scmdbuf = "" ;
      lV63Tarticu_wwds_1_filterfulltext = "" ;
      lV66Tarticu_wwds_4_tfclinom = "" ;
      lV68Tarticu_wwds_6_tfartcod = "" ;
      lV70Tarticu_wwds_8_tfartdsc = "" ;
      lV74Tarticu_wwds_12_tftipartdsc = "" ;
      lV84Tarticu_wwds_22_tfartcomer = "" ;
      A10045CliAct = "" ;
      P0A9B2_A10045CliAct = new String[] {""} ;
      P0A9B2_A14295ArtActivo = new String[] {""} ;
      P0A9B2_A5741ArtComer = new String[] {""} ;
      P0A9B2_n5741ArtComer = new boolean[] {false} ;
      P0A9B2_A63ArtAcaMin = new short[1] ;
      P0A9B2_n63ArtAcaMin = new boolean[] {false} ;
      P0A9B2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9B2_n95ArtRen = new boolean[] {false} ;
      P0A9B2_A1903ArtGraAca = new short[1] ;
      P0A9B2_n1903ArtGraAca = new boolean[] {false} ;
      P0A9B2_A1148ArtPml = new short[1] ;
      P0A9B2_n1148ArtPml = new boolean[] {false} ;
      P0A9B2_A830TipArtDsc = new String[] {""} ;
      P0A9B2_n830TipArtDsc = new boolean[] {false} ;
      P0A9B2_A829TipArtCod = new short[1] ;
      P0A9B2_A69ArtDsc = new String[] {""} ;
      P0A9B2_n69ArtDsc = new boolean[] {false} ;
      P0A9B2_A65ArtCod = new String[] {""} ;
      P0A9B2_A279CliNom = new String[] {""} ;
      P0A9B2_A252CliCod = new int[1] ;
      P0A9B2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_wwexport__default(),
         new Object[] {
             new Object[] {
            P0A9B2_A10045CliAct, P0A9B2_A14295ArtActivo, P0A9B2_A5741ArtComer, P0A9B2_n5741ArtComer, P0A9B2_A63ArtAcaMin, P0A9B2_n63ArtAcaMin, P0A9B2_A95ArtRen, P0A9B2_n95ArtRen, P0A9B2_A1903ArtGraAca, P0A9B2_n1903ArtGraAca,
            P0A9B2_A1148ArtPml, P0A9B2_n1148ArtPml, P0A9B2_A830TipArtDsc, P0A9B2_n830TipArtDsc, P0A9B2_A829TipArtCod, P0A9B2_A69ArtDsc, P0A9B2_n69ArtDsc, P0A9B2_A65ArtCod, P0A9B2_A279CliNom, P0A9B2_A252CliCod,
            P0A9B2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV42TFTipArtCod ;
   private short AV43TFTipArtCod_To ;
   private short AV46TFArtPml ;
   private short AV47TFArtPml_To ;
   private short AV48TFArtGraAca ;
   private short AV49TFArtGraAca_To ;
   private short AV52TFArtAcaMin ;
   private short AV53TFArtAcaMin_To ;
   private short GXv_int3[] ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV72Tarticu_wwds_10_tftipartcod ;
   private short AV73Tarticu_wwds_11_tftipartcod_to ;
   private short AV76Tarticu_wwds_14_tfartpml ;
   private short AV77Tarticu_wwds_15_tfartpml_to ;
   private short AV78Tarticu_wwds_16_tfartgraaca ;
   private short AV79Tarticu_wwds_17_tfartgraaca_to ;
   private short AV82Tarticu_wwds_20_tfartacamin ;
   private short AV83Tarticu_wwds_21_tfartacamin_to ;
   private short AV16OrderedBy ;
   private short AV57NProc ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int AV61GXV1 ;
   private int A252CliCod ;
   private int AV64Tarticu_wwds_2_tfclicod ;
   private int AV65Tarticu_wwds_3_tfclicod_to ;
   private int AV87GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV50TFArtRen ;
   private java.math.BigDecimal AV51TFArtRen_To ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV80Tarticu_wwds_18_tfartren ;
   private java.math.BigDecimal AV81Tarticu_wwds_19_tfartren_to ;
   private String AV37TFCliNom_Sel ;
   private String AV36TFCliNom ;
   private String AV39TFArtCod_Sel ;
   private String AV38TFArtCod ;
   private String AV41TFArtDsc_Sel ;
   private String AV40TFArtDsc ;
   private String AV45TFTipArtDsc_Sel ;
   private String AV44TFTipArtDsc ;
   private String AV55TFArtComer_Sel ;
   private String AV54TFArtComer ;
   private String AV58TFArtActivo_Sel ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String A14295ArtActivo ;
   private String AV66Tarticu_wwds_4_tfclinom ;
   private String AV67Tarticu_wwds_5_tfclinom_sel ;
   private String AV68Tarticu_wwds_6_tfartcod ;
   private String AV69Tarticu_wwds_7_tfartcod_sel ;
   private String AV70Tarticu_wwds_8_tfartdsc ;
   private String AV71Tarticu_wwds_9_tfartdsc_sel ;
   private String AV74Tarticu_wwds_12_tftipartdsc ;
   private String AV75Tarticu_wwds_13_tftipartdsc_sel ;
   private String AV84Tarticu_wwds_22_tfartcomer ;
   private String AV85Tarticu_wwds_23_tfartcomer_sel ;
   private String AV86Tarticu_wwds_24_tfartactivo_sel ;
   private String scmdbuf ;
   private String lV66Tarticu_wwds_4_tfclinom ;
   private String lV68Tarticu_wwds_6_tfartcod ;
   private String lV70Tarticu_wwds_8_tfartdsc ;
   private String lV74Tarticu_wwds_12_tftipartdsc ;
   private String lV84Tarticu_wwds_22_tfartcomer ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n5741ArtComer ;
   private boolean n63ArtAcaMin ;
   private boolean n95ArtRen ;
   private boolean n1903ArtGraAca ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV63Tarticu_wwds_1_filterfulltext ;
   private String lV63Tarticu_wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9B2_A10045CliAct ;
   private String[] P0A9B2_A14295ArtActivo ;
   private String[] P0A9B2_A5741ArtComer ;
   private boolean[] P0A9B2_n5741ArtComer ;
   private short[] P0A9B2_A63ArtAcaMin ;
   private boolean[] P0A9B2_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9B2_A95ArtRen ;
   private boolean[] P0A9B2_n95ArtRen ;
   private short[] P0A9B2_A1903ArtGraAca ;
   private boolean[] P0A9B2_n1903ArtGraAca ;
   private short[] P0A9B2_A1148ArtPml ;
   private boolean[] P0A9B2_n1148ArtPml ;
   private String[] P0A9B2_A830TipArtDsc ;
   private boolean[] P0A9B2_n830TipArtDsc ;
   private short[] P0A9B2_A829TipArtCod ;
   private String[] P0A9B2_A69ArtDsc ;
   private boolean[] P0A9B2_n69ArtDsc ;
   private String[] P0A9B2_A65ArtCod ;
   private String[] P0A9B2_A279CliNom ;
   private int[] P0A9B2_A252CliCod ;
   private String[] P0A9B2_A396EmprCod ;
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

final  class tarticu_wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Tarticu_wwds_1_filterfulltext ,
                                          int AV64Tarticu_wwds_2_tfclicod ,
                                          int AV65Tarticu_wwds_3_tfclicod_to ,
                                          String AV67Tarticu_wwds_5_tfclinom_sel ,
                                          String AV66Tarticu_wwds_4_tfclinom ,
                                          String AV69Tarticu_wwds_7_tfartcod_sel ,
                                          String AV68Tarticu_wwds_6_tfartcod ,
                                          String AV71Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV70Tarticu_wwds_8_tfartdsc ,
                                          short AV72Tarticu_wwds_10_tftipartcod ,
                                          short AV73Tarticu_wwds_11_tftipartcod_to ,
                                          String AV75Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV74Tarticu_wwds_12_tftipartdsc ,
                                          short AV76Tarticu_wwds_14_tfartpml ,
                                          short AV77Tarticu_wwds_15_tfartpml_to ,
                                          short AV78Tarticu_wwds_16_tfartgraaca ,
                                          short AV79Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV80Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV81Tarticu_wwds_19_tfartren_to ,
                                          short AV82Tarticu_wwds_20_tfartacamin ,
                                          short AV83Tarticu_wwds_21_tfartacamin_to ,
                                          String AV85Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV84Tarticu_wwds_22_tfartcomer ,
                                          String AV86Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.CliAct, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T3.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV63Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV66Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV79Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV82Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV83Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV84Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
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
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtComer DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtActivo" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtActivo DESC" ;
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
                  return conditional_P0A9B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((String[]) buf[20])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
      }
   }

}

