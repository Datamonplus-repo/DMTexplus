package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantwwexport extends GXProcedure
{
   public mantwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantwwexport.class ), "" );
   }

   public mantwwexport( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      mantwwexport.this.aP1 = new String[] {""};
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
      mantwwexport.this.aP0 = aP0;
      mantwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "MAntWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mantwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      mantwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFMAntId) && (0==AV35TFMAntId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFMAntId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFMAntId_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFMAntEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMAntEmprCod_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFMAntEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFMAntEmprCod, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFMAntCliCod) && (0==AV39TFMAntCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFMAntCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFMAntCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFMAntCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMAntCliNom_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFMAntCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMAntCliNom, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFMAntArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFMAntArtCod_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFMAntArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFMAntArtCod, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFMAntArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFMAntArtDsc_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFMAntArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFMAntArtDsc, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFMAntColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFMAntColNom_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFMAntColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFMAntColNom, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFMAntColNum) && (0==AV49TFMAntColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFMAntColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFMAntColNum_To );
      }
      if ( ! ( (0==AV50TFMAntColCod) && (0==AV51TFMAntColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFMAntColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFMAntColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFMAntMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMAntMaqCod_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFMAntMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFMAntMaqCod, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFMAntMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFMAntMaqDsc_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFMAntMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMAntMaqDsc, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFMAntTipMCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFMAntTipMCod_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFMAntTipMCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFMAntTipMCod, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFMAntTipMDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFMAntTipMDsc_Sel, GXv_char5) ;
         mantwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFMAntTipMDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFMAntTipMDsc, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFMAntKilProd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFMAntKilProd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFMAntKilProd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFMAntKilProd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFMAntKilReo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFMAntKilReo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Reoperados", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFMAntKilReo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFMAntKilReo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMAntPorc)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMAntPorc_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Porc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFMAntPorc)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFMAntPorc_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("AnticipacionErrores.MAntWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("AnticipacionErrores.MAntWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV69GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV71Anticipacionerrores_mantwwds_1_filterfulltext = AV18FilterFullText ;
      AV72Anticipacionerrores_mantwwds_2_tfmantid = AV34TFMAntId ;
      AV73Anticipacionerrores_mantwwds_3_tfmantid_to = AV35TFMAntId_To ;
      AV74Anticipacionerrores_mantwwds_4_tfmantemprcod = AV36TFMAntEmprCod ;
      AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV37TFMAntEmprCod_Sel ;
      AV76Anticipacionerrores_mantwwds_6_tfmantclicod = AV38TFMAntCliCod ;
      AV77Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV39TFMAntCliCod_To ;
      AV78Anticipacionerrores_mantwwds_8_tfmantclinom = AV40TFMAntCliNom ;
      AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV41TFMAntCliNom_Sel ;
      AV80Anticipacionerrores_mantwwds_10_tfmantartcod = AV42TFMAntArtCod ;
      AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV43TFMAntArtCod_Sel ;
      AV82Anticipacionerrores_mantwwds_12_tfmantartdsc = AV44TFMAntArtDsc ;
      AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV45TFMAntArtDsc_Sel ;
      AV84Anticipacionerrores_mantwwds_14_tfmantcolnom = AV46TFMAntColNom ;
      AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV47TFMAntColNom_Sel ;
      AV86Anticipacionerrores_mantwwds_16_tfmantcolnum = AV48TFMAntColNum ;
      AV87Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV49TFMAntColNum_To ;
      AV88Anticipacionerrores_mantwwds_18_tfmantcolcod = AV50TFMAntColCod ;
      AV89Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV51TFMAntColCod_To ;
      AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV52TFMAntMaqCod ;
      AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV53TFMAntMaqCod_Sel ;
      AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV54TFMAntMaqDsc ;
      AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV55TFMAntMaqDsc_Sel ;
      AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV56TFMAntTipMCod ;
      AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV57TFMAntTipMCod_Sel ;
      AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV58TFMAntTipMDsc ;
      AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV59TFMAntTipMDsc_Sel ;
      AV98Anticipacionerrores_mantwwds_28_tfmantkilprod = AV60TFMAntKilProd ;
      AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV61TFMAntKilProd_To ;
      AV100Anticipacionerrores_mantwwds_30_tfmantkilreo = AV62TFMAntKilReo ;
      AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV63TFMAntKilReo_To ;
      AV102Anticipacionerrores_mantwwds_32_tfmantporc = AV64TFMAntPorc ;
      AV103Anticipacionerrores_mantwwds_33_tfmantporc_to = AV65TFMAntPorc_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV72Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV73Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV76Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV77Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV78Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV80Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV82Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV84Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV86Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV87Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV88Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV89Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV98Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV100Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV102Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV103Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV74Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV78Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV80Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV80Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV82Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV82Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV84Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV90Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV94Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUJ2 */
      pr_default.execute(0, new Object[] {lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, lV71Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV72Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV73Anticipacionerrores_mantwwds_3_tfmantid_to), lV74Anticipacionerrores_mantwwds_4_tfmantemprcod, AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV76Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV77Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV78Anticipacionerrores_mantwwds_8_tfmantclinom, AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV80Anticipacionerrores_mantwwds_10_tfmantartcod, AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV82Anticipacionerrores_mantwwds_12_tfmantartdsc, AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV84Anticipacionerrores_mantwwds_14_tfmantcolnom, AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV86Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV87Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV88Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV89Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV90Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV94Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV98Anticipacionerrores_mantwwds_28_tfmantkilprod, AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV100Anticipacionerrores_mantwwds_30_tfmantkilreo, AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV102Anticipacionerrores_mantwwds_32_tfmantporc, AV103Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14643MAntKilPro = P0AUJ2_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUJ2_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUJ2_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUJ2_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUJ2_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUJ2_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUJ2_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUJ2_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUJ2_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUJ2_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUJ2_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUJ2_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUJ2_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUJ2_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUJ2_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUJ2_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14562MAntId );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14566MAntEmprCo, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14565MAntCliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14611MAntCliNom, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14567MAntArtCod, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14613MAntArtDsc, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14623MAntColNom, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14568MAntColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14642MAntColCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14570MAntMaqCod, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14610MAntMaqDsc, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14569MAntTipMCo, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14612MAntTipMDs, GXv_char5) ;
            mantwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14643MAntKilPro)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14644MAntKilReo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14645MAntPorc)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntId", "", "Id", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntEmprCod", "", "Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntCliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntCliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntArtCod", "", "Cód Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntArtDsc", "", "Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntColNum", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntColCod", "", "Tipo Colorante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMaqCod", "", "máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMaqDsc", "", "Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntTipMCod", "", "Cód.  Tipo Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntTipMDsc", "", "Tipo Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntKilProd", "", "Kilos Produccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntKilReo", "", "Kilos Reoperados", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntPorc", "", "Porc", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAntWWColumnsSelector", GXv_char5) ;
      mantwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnticipacionErrores.MAntWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnticipacionErrores.MAntWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AnticipacionErrores.MAntWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV104GXV2 = 1 ;
      while ( AV104GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTID") == 0 )
         {
            AV34TFMAntId = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV35TFMAntId_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD") == 0 )
         {
            AV36TFMAntEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD_SEL") == 0 )
         {
            AV37TFMAntEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLICOD") == 0 )
         {
            AV38TFMAntCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFMAntCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM") == 0 )
         {
            AV40TFMAntCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM_SEL") == 0 )
         {
            AV41TFMAntCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD") == 0 )
         {
            AV42TFMAntArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD_SEL") == 0 )
         {
            AV43TFMAntArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC") == 0 )
         {
            AV44TFMAntArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC_SEL") == 0 )
         {
            AV45TFMAntArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM") == 0 )
         {
            AV46TFMAntColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM_SEL") == 0 )
         {
            AV47TFMAntColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNUM") == 0 )
         {
            AV48TFMAntColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFMAntColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLCOD") == 0 )
         {
            AV50TFMAntColCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFMAntColCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD") == 0 )
         {
            AV52TFMAntMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD_SEL") == 0 )
         {
            AV53TFMAntMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC") == 0 )
         {
            AV54TFMAntMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC_SEL") == 0 )
         {
            AV55TFMAntMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD") == 0 )
         {
            AV56TFMAntTipMCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD_SEL") == 0 )
         {
            AV57TFMAntTipMCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC") == 0 )
         {
            AV58TFMAntTipMDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC_SEL") == 0 )
         {
            AV59TFMAntTipMDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILPROD") == 0 )
         {
            AV60TFMAntKilProd = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFMAntKilProd_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILREO") == 0 )
         {
            AV62TFMAntKilReo = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFMAntKilReo_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTPORC") == 0 )
         {
            AV64TFMAntPorc = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFMAntPorc_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV104GXV2 = (int)(AV104GXV2+1) ;
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
      this.aP0[0] = mantwwexport.this.AV11Filename;
      this.aP1[0] = mantwwexport.this.AV12ErrorMessage;
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
      AV37TFMAntEmprCod_Sel = "" ;
      AV36TFMAntEmprCod = "" ;
      AV41TFMAntCliNom_Sel = "" ;
      AV40TFMAntCliNom = "" ;
      AV43TFMAntArtCod_Sel = "" ;
      AV42TFMAntArtCod = "" ;
      AV45TFMAntArtDsc_Sel = "" ;
      AV44TFMAntArtDsc = "" ;
      AV47TFMAntColNom_Sel = "" ;
      AV46TFMAntColNom = "" ;
      AV53TFMAntMaqCod_Sel = "" ;
      AV52TFMAntMaqCod = "" ;
      AV55TFMAntMaqDsc_Sel = "" ;
      AV54TFMAntMaqDsc = "" ;
      AV57TFMAntTipMCod_Sel = "" ;
      AV56TFMAntTipMCod = "" ;
      AV59TFMAntTipMDsc_Sel = "" ;
      AV58TFMAntTipMDsc = "" ;
      AV60TFMAntKilProd = DecimalUtil.ZERO ;
      AV61TFMAntKilProd_To = DecimalUtil.ZERO ;
      AV62TFMAntKilReo = DecimalUtil.ZERO ;
      AV63TFMAntKilReo_To = DecimalUtil.ZERO ;
      AV64TFMAntPorc = DecimalUtil.ZERO ;
      AV65TFMAntPorc_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14566MAntEmprCo = "" ;
      A14611MAntCliNom = "" ;
      A14567MAntArtCod = "" ;
      A14613MAntArtDsc = "" ;
      A14623MAntColNom = "" ;
      A14570MAntMaqCod = "" ;
      A14610MAntMaqDsc = "" ;
      A14569MAntTipMCo = "" ;
      A14612MAntTipMDs = "" ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      AV71Anticipacionerrores_mantwwds_1_filterfulltext = "" ;
      AV74Anticipacionerrores_mantwwds_4_tfmantemprcod = "" ;
      AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = "" ;
      AV78Anticipacionerrores_mantwwds_8_tfmantclinom = "" ;
      AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel = "" ;
      AV80Anticipacionerrores_mantwwds_10_tfmantartcod = "" ;
      AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel = "" ;
      AV82Anticipacionerrores_mantwwds_12_tfmantartdsc = "" ;
      AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = "" ;
      AV84Anticipacionerrores_mantwwds_14_tfmantcolnom = "" ;
      AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = "" ;
      AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod = "" ;
      AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = "" ;
      AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc = "" ;
      AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = "" ;
      AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod = "" ;
      AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = "" ;
      AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc = "" ;
      AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = "" ;
      AV98Anticipacionerrores_mantwwds_28_tfmantkilprod = DecimalUtil.ZERO ;
      AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to = DecimalUtil.ZERO ;
      AV100Anticipacionerrores_mantwwds_30_tfmantkilreo = DecimalUtil.ZERO ;
      AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to = DecimalUtil.ZERO ;
      AV102Anticipacionerrores_mantwwds_32_tfmantporc = DecimalUtil.ZERO ;
      AV103Anticipacionerrores_mantwwds_33_tfmantporc_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV71Anticipacionerrores_mantwwds_1_filterfulltext = "" ;
      lV74Anticipacionerrores_mantwwds_4_tfmantemprcod = "" ;
      lV78Anticipacionerrores_mantwwds_8_tfmantclinom = "" ;
      lV80Anticipacionerrores_mantwwds_10_tfmantartcod = "" ;
      lV82Anticipacionerrores_mantwwds_12_tfmantartdsc = "" ;
      lV84Anticipacionerrores_mantwwds_14_tfmantcolnom = "" ;
      lV90Anticipacionerrores_mantwwds_20_tfmantmaqcod = "" ;
      lV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc = "" ;
      lV94Anticipacionerrores_mantwwds_24_tfmanttipmcod = "" ;
      lV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc = "" ;
      A14646MAntKilTot = DecimalUtil.ZERO ;
      P0AUJ2_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUJ2_A14612MAntTipMDs = new String[] {""} ;
      P0AUJ2_A14569MAntTipMCo = new String[] {""} ;
      P0AUJ2_A14610MAntMaqDsc = new String[] {""} ;
      P0AUJ2_A14570MAntMaqCod = new String[] {""} ;
      P0AUJ2_A14642MAntColCod = new byte[1] ;
      P0AUJ2_A14568MAntColNum = new int[1] ;
      P0AUJ2_A14623MAntColNom = new String[] {""} ;
      P0AUJ2_A14613MAntArtDsc = new String[] {""} ;
      P0AUJ2_A14567MAntArtCod = new String[] {""} ;
      P0AUJ2_A14611MAntCliNom = new String[] {""} ;
      P0AUJ2_A14565MAntCliCod = new int[1] ;
      P0AUJ2_A14566MAntEmprCo = new String[] {""} ;
      P0AUJ2_A14562MAntId = new long[1] ;
      P0AUJ2_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUJ2_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mantwwexport__default(),
         new Object[] {
             new Object[] {
            P0AUJ2_A14643MAntKilPro, P0AUJ2_A14612MAntTipMDs, P0AUJ2_A14569MAntTipMCo, P0AUJ2_A14610MAntMaqDsc, P0AUJ2_A14570MAntMaqCod, P0AUJ2_A14642MAntColCod, P0AUJ2_A14568MAntColNum, P0AUJ2_A14623MAntColNom, P0AUJ2_A14613MAntArtDsc, P0AUJ2_A14567MAntArtCod,
            P0AUJ2_A14611MAntCliNom, P0AUJ2_A14565MAntCliCod, P0AUJ2_A14566MAntEmprCo, P0AUJ2_A14562MAntId, P0AUJ2_A14644MAntKilReo, P0AUJ2_A14646MAntKilTot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50TFMAntColCod ;
   private byte AV51TFMAntColCod_To ;
   private byte A14642MAntColCod ;
   private byte AV88Anticipacionerrores_mantwwds_18_tfmantcolcod ;
   private byte AV89Anticipacionerrores_mantwwds_19_tfmantcolcod_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFMAntCliCod ;
   private int AV39TFMAntCliCod_To ;
   private int AV48TFMAntColNum ;
   private int AV49TFMAntColNum_To ;
   private int AV69GXV1 ;
   private int A14565MAntCliCod ;
   private int A14568MAntColNum ;
   private int AV76Anticipacionerrores_mantwwds_6_tfmantclicod ;
   private int AV77Anticipacionerrores_mantwwds_7_tfmantclicod_to ;
   private int AV86Anticipacionerrores_mantwwds_16_tfmantcolnum ;
   private int AV87Anticipacionerrores_mantwwds_17_tfmantcolnum_to ;
   private int AV104GXV2 ;
   private long AV34TFMAntId ;
   private long AV35TFMAntId_To ;
   private long AV31VisibleColumnCount ;
   private long A14562MAntId ;
   private long AV72Anticipacionerrores_mantwwds_2_tfmantid ;
   private long AV73Anticipacionerrores_mantwwds_3_tfmantid_to ;
   private java.math.BigDecimal AV60TFMAntKilProd ;
   private java.math.BigDecimal AV61TFMAntKilProd_To ;
   private java.math.BigDecimal AV62TFMAntKilReo ;
   private java.math.BigDecimal AV63TFMAntKilReo_To ;
   private java.math.BigDecimal AV64TFMAntPorc ;
   private java.math.BigDecimal AV65TFMAntPorc_To ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14645MAntPorc ;
   private java.math.BigDecimal AV98Anticipacionerrores_mantwwds_28_tfmantkilprod ;
   private java.math.BigDecimal AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to ;
   private java.math.BigDecimal AV100Anticipacionerrores_mantwwds_30_tfmantkilreo ;
   private java.math.BigDecimal AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to ;
   private java.math.BigDecimal AV102Anticipacionerrores_mantwwds_32_tfmantporc ;
   private java.math.BigDecimal AV103Anticipacionerrores_mantwwds_33_tfmantporc_to ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private String AV37TFMAntEmprCod_Sel ;
   private String AV36TFMAntEmprCod ;
   private String AV43TFMAntArtCod_Sel ;
   private String AV42TFMAntArtCod ;
   private String AV47TFMAntColNom_Sel ;
   private String AV46TFMAntColNom ;
   private String AV53TFMAntMaqCod_Sel ;
   private String AV52TFMAntMaqCod ;
   private String AV57TFMAntTipMCod_Sel ;
   private String AV56TFMAntTipMCod ;
   private String A14566MAntEmprCo ;
   private String A14567MAntArtCod ;
   private String A14623MAntColNom ;
   private String A14570MAntMaqCod ;
   private String A14569MAntTipMCo ;
   private String AV74Anticipacionerrores_mantwwds_4_tfmantemprcod ;
   private String AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ;
   private String AV80Anticipacionerrores_mantwwds_10_tfmantartcod ;
   private String AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel ;
   private String AV84Anticipacionerrores_mantwwds_14_tfmantcolnom ;
   private String AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ;
   private String AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod ;
   private String AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ;
   private String AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod ;
   private String AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ;
   private String scmdbuf ;
   private String lV74Anticipacionerrores_mantwwds_4_tfmantemprcod ;
   private String lV80Anticipacionerrores_mantwwds_10_tfmantartcod ;
   private String lV84Anticipacionerrores_mantwwds_14_tfmantcolnom ;
   private String lV90Anticipacionerrores_mantwwds_20_tfmantmaqcod ;
   private String lV94Anticipacionerrores_mantwwds_24_tfmanttipmcod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV41TFMAntCliNom_Sel ;
   private String AV40TFMAntCliNom ;
   private String AV45TFMAntArtDsc_Sel ;
   private String AV44TFMAntArtDsc ;
   private String AV55TFMAntMaqDsc_Sel ;
   private String AV54TFMAntMaqDsc ;
   private String AV59TFMAntTipMDsc_Sel ;
   private String AV58TFMAntTipMDsc ;
   private String A14611MAntCliNom ;
   private String A14613MAntArtDsc ;
   private String A14610MAntMaqDsc ;
   private String A14612MAntTipMDs ;
   private String AV71Anticipacionerrores_mantwwds_1_filterfulltext ;
   private String AV78Anticipacionerrores_mantwwds_8_tfmantclinom ;
   private String AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel ;
   private String AV82Anticipacionerrores_mantwwds_12_tfmantartdsc ;
   private String AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ;
   private String AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc ;
   private String AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ;
   private String AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc ;
   private String AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ;
   private String lV71Anticipacionerrores_mantwwds_1_filterfulltext ;
   private String lV78Anticipacionerrores_mantwwds_8_tfmantclinom ;
   private String lV82Anticipacionerrores_mantwwds_12_tfmantartdsc ;
   private String lV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc ;
   private String lV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AUJ2_A14643MAntKilPro ;
   private String[] P0AUJ2_A14612MAntTipMDs ;
   private String[] P0AUJ2_A14569MAntTipMCo ;
   private String[] P0AUJ2_A14610MAntMaqDsc ;
   private String[] P0AUJ2_A14570MAntMaqCod ;
   private byte[] P0AUJ2_A14642MAntColCod ;
   private int[] P0AUJ2_A14568MAntColNum ;
   private String[] P0AUJ2_A14623MAntColNom ;
   private String[] P0AUJ2_A14613MAntArtDsc ;
   private String[] P0AUJ2_A14567MAntArtCod ;
   private String[] P0AUJ2_A14611MAntCliNom ;
   private int[] P0AUJ2_A14565MAntCliCod ;
   private String[] P0AUJ2_A14566MAntEmprCo ;
   private long[] P0AUJ2_A14562MAntId ;
   private java.math.BigDecimal[] P0AUJ2_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUJ2_A14646MAntKilTot ;
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

final  class mantwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV72Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV73Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV76Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV77Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV80Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV82Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV84Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV86Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV87Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV88Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV89Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV98Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV100Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV102Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV103Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[48];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV71Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV73Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV87Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV88Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV89Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV92Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntEmprCo" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntEmprCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntId" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntId DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntCliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntCliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntCliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntCliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntArtCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntColNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntColNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntColCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntMaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntMaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntTipMCo" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntTipMCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntTipMDs" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntTipMDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntKilPro" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntKilPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntKilReo" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntKilReo DESC" ;
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
                  return conditional_P0AUJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
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
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
      }
   }

}

