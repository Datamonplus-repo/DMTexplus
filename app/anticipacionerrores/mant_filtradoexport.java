package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_filtradoexport extends GXProcedure
{
   public mant_filtradoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_filtradoexport.class ), "" );
   }

   public mant_filtradoexport( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String[] aP5 )
   {
      mant_filtradoexport.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      mant_filtradoexport.this.AV69MAntEmprCod = aP0;
      mant_filtradoexport.this.AV77CliCod = aP1;
      mant_filtradoexport.this.AV78ArtCod = aP2;
      mant_filtradoexport.this.AV79ForColNum = aP3;
      mant_filtradoexport.this.AV80TipMaqCodJSON = aP4;
      mant_filtradoexport.this.aP5 = aP5;
      mant_filtradoexport.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV81TipMaqCodCollection.fromJSonString(AV80TipMaqCodJSON, null);
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
      AV11Filename = "./PrivateTempStorage/" + "MAnt_FiltradoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFMAntId) && (0==AV35TFMAntId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFMAntId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFMAntId_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFMAntEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMAntEmprCod_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFMAntEmprCod, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFMAntCliCod) && (0==AV39TFMAntCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFMAntCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFMAntCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFMAntCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMAntCliNom_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMAntCliNom, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFMAntArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFMAntArtCod_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFMAntArtCod, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFMAntArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFMAntArtDsc_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFMAntArtDsc, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFMAntColNum) && (0==AV49TFMAntColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFMAntColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFMAntColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFMAntColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFMAntColNom_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFMAntColNom, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFMAntColCod) && (0==AV51TFMAntColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFMAntColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFMAntColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFMAntMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMAntMaqCod_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFMAntMaqCod, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFMAntMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFMAntMaqDsc_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMAntMaqDsc, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFMAntTipMCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFMAntTipMCod_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFMAntTipMCod, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFMAntTipMDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFMAntTipMDsc_Sel, GXv_char5) ;
         mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFMAntTipMDsc, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFMAntKilTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMAntKilTot_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Total", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84TFMAntKilTot)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV85TFMAntKilTot_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFMAntKilProd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFMAntKilProd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFMAntKilProd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFMAntKilProd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFMAntKilReo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFMAntKilReo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Reoperados", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFMAntKilReo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFMAntKilReo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMAntPorc)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMAntPorc_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Porc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFMAntPorc)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFMAntPorc_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFMAntMetTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFMAntMetTot_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros Total", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV95TFMAntMetTot)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV96TFMAntMetTot_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFMAntMetProd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFMAntMetProd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "M.  Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91TFMAntMetProd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV92TFMAntMetProd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFMAntMetReo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFMAntMetReo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "M. Reoperados", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV93TFMAntMetReo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV94TFMAntMetReo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFMantMetPor)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFMantMetPor_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Porc Met", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV97TFMantMetPor)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_filtradoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV98TFMantMetPor_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("AnticipacionErrores.MAnt_FiltradoColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("AnticipacionErrores.MAnt_FiltradoColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV101GXV1 = 1 ;
      while ( AV101GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV101GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV101GXV1 = (int)(AV101GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV103Anticipacionerrores_mant_filtradods_1_filterfulltext = AV18FilterFullText ;
      AV104Anticipacionerrores_mant_filtradods_2_tfmantid = AV34TFMAntId ;
      AV105Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV35TFMAntId_To ;
      AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV36TFMAntEmprCod ;
      AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV37TFMAntEmprCod_Sel ;
      AV108Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV38TFMAntCliCod ;
      AV109Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV39TFMAntCliCod_To ;
      AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV40TFMAntCliNom ;
      AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV41TFMAntCliNom_Sel ;
      AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV42TFMAntArtCod ;
      AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV43TFMAntArtCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV44TFMAntArtDsc ;
      AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV45TFMAntArtDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV48TFMAntColNum ;
      AV117Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV49TFMAntColNum_To ;
      AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV46TFMAntColNom ;
      AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV47TFMAntColNom_Sel ;
      AV120Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV50TFMAntColCod ;
      AV121Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV51TFMAntColCod_To ;
      AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV52TFMAntMaqCod ;
      AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV53TFMAntMaqCod_Sel ;
      AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV54TFMAntMaqDsc ;
      AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV55TFMAntMaqDsc_Sel ;
      AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV56TFMAntTipMCod ;
      AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV57TFMAntTipMCod_Sel ;
      AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV58TFMAntTipMDsc ;
      AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV59TFMAntTipMDsc_Sel ;
      AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV84TFMAntKilTot ;
      AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV85TFMAntKilTot_To ;
      AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV60TFMAntKilProd ;
      AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV61TFMAntKilProd_To ;
      AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV62TFMAntKilReo ;
      AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV63TFMAntKilReo_To ;
      AV136Anticipacionerrores_mant_filtradods_34_tfmantporc = AV64TFMAntPorc ;
      AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV65TFMAntPorc_To ;
      AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV95TFMAntMetTot ;
      AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV96TFMAntMetTot_To ;
      AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV91TFMAntMetProd ;
      AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV92TFMAntMetProd_To ;
      AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV93TFMAntMetReo ;
      AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV94TFMAntMetReo_To ;
      AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV97TFMantMetPor ;
      AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV98TFMantMetPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV81TipMaqCodCollection ,
                                           AV103Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV104Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV105Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV108Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV109Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV116Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV117Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV120Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV121Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV136Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV78ArtCod ,
                                           Integer.valueOf(AV79ForColNum) ,
                                           Integer.valueOf(AV81TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV90sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV90sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV77CliCod) ,
                                           AV69MAntEmprCod ,
                                           A14563MAntTkn ,
                                           A14564MAntUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV110Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV112Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUK2 */
      pr_default.execute(0, new Object[] {AV90sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV90sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV77CliCod), AV69MAntEmprCod, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, lV103Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV104Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV105Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV108Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV109Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV110Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV112Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV116Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV117Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV120Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV121Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV136Anticipacionerrores_mant_filtradods_34_tfmantporc, AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV78ArtCod, Integer.valueOf(AV79ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14563MAntTkn = P0AUK2_A14563MAntTkn[0] ;
         A14564MAntUsu = P0AUK2_A14564MAntUsu[0] ;
         A14648MAntMetPro = P0AUK2_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUK2_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUK2_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUK2_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUK2_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUK2_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUK2_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUK2_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUK2_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUK2_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUK2_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUK2_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUK2_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUK2_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUK2_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUK2_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUK2_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUK2_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUK2_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUK2_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUK2_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUK2_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
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
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14567MAntArtCod, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14613MAntArtDsc, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14568MAntColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14623MAntColNom, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14610MAntMaqDsc, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14569MAntTipMCo, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14612MAntTipMDs, GXv_char5) ;
            mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14646MAntKilTot)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14643MAntKilPro)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14644MAntKilReo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14645MAntPorc)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14647MAntMetTot)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14648MAntMetPro)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14649MAntMetReo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14650MantMetPor)) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntId", "", "Id", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntEmprCod", "", "Empresa", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntCliCod", "", "Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntCliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntArtCod", "", "Cód Artículo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntArtDsc", "", "Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntColNum", "", "Color", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntColCod", "", "Tipo Colorante", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMaqCod", "", "máquina", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMaqDsc", "", "Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntTipMCod", "", "Cód.  Tipo Máquina", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntTipMDsc", "", "Tipo Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntKilTot", "", "Kilos Total", true, "") ;
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMetTot", "", "Metros Total", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMetProd", "", "M.  Produccion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MAntMetReo", "", "M. Reoperados", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MantMetPor", "", "Porc Met", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAnt_FiltradoColumnsSelector", GXv_char5) ;
      mant_filtradoexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnticipacionErrores.MAnt_FiltradoGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnticipacionErrores.MAnt_FiltradoGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AnticipacionErrores.MAnt_FiltradoGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV146GXV2 = 1 ;
      while ( AV146GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV2));
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNUM") == 0 )
         {
            AV48TFMAntColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFMAntColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM") == 0 )
         {
            AV46TFMAntColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM_SEL") == 0 )
         {
            AV47TFMAntColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILTOT") == 0 )
         {
            AV84TFMAntKilTot = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV85TFMAntKilTot_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETTOT") == 0 )
         {
            AV95TFMAntMetTot = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV96TFMAntMetTot_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETPROD") == 0 )
         {
            AV91TFMAntMetProd = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV92TFMAntMetProd_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETREO") == 0 )
         {
            AV93TFMAntMetReo = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV94TFMAntMetReo_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETPOR") == 0 )
         {
            AV97TFMantMetPor = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV98TFMantMetPor_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MANTEMPRCOD") == 0 )
         {
            AV69MAntEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV77CliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD") == 0 )
         {
            AV78ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV79ForColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPMAQCODJSON") == 0 )
         {
            AV80TipMaqCodJSON = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHAINICIO") == 0 )
         {
            AV82FechaInicio = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHAFIN") == 0 )
         {
            AV83FechaFin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV146GXV2 = (int)(AV146GXV2+1) ;
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
      this.aP5[0] = mant_filtradoexport.this.AV11Filename;
      this.aP6[0] = mant_filtradoexport.this.AV12ErrorMessage;
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
      AV81TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
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
      AV84TFMAntKilTot = DecimalUtil.ZERO ;
      AV85TFMAntKilTot_To = DecimalUtil.ZERO ;
      AV60TFMAntKilProd = DecimalUtil.ZERO ;
      AV61TFMAntKilProd_To = DecimalUtil.ZERO ;
      AV62TFMAntKilReo = DecimalUtil.ZERO ;
      AV63TFMAntKilReo_To = DecimalUtil.ZERO ;
      AV64TFMAntPorc = DecimalUtil.ZERO ;
      AV65TFMAntPorc_To = DecimalUtil.ZERO ;
      AV95TFMAntMetTot = DecimalUtil.ZERO ;
      AV96TFMAntMetTot_To = DecimalUtil.ZERO ;
      AV91TFMAntMetProd = DecimalUtil.ZERO ;
      AV92TFMAntMetProd_To = DecimalUtil.ZERO ;
      AV93TFMAntMetReo = DecimalUtil.ZERO ;
      AV94TFMAntMetReo_To = DecimalUtil.ZERO ;
      AV97TFMantMetPor = DecimalUtil.ZERO ;
      AV98TFMantMetPor_To = DecimalUtil.ZERO ;
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
      A14646MAntKilTot = DecimalUtil.ZERO ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      A14647MAntMetTot = DecimalUtil.ZERO ;
      A14648MAntMetPro = DecimalUtil.ZERO ;
      A14649MAntMetReo = DecimalUtil.ZERO ;
      A14650MantMetPor = DecimalUtil.ZERO ;
      AV103Anticipacionerrores_mant_filtradods_1_filterfulltext = "" ;
      AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod = "" ;
      AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = "" ;
      AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom = "" ;
      AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = "" ;
      AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod = "" ;
      AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = "" ;
      AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc = "" ;
      AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = "" ;
      AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom = "" ;
      AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = "" ;
      AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = "" ;
      AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = "" ;
      AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = "" ;
      AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = "" ;
      AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = "" ;
      AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = "" ;
      AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = "" ;
      AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = "" ;
      AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot = DecimalUtil.ZERO ;
      AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = DecimalUtil.ZERO ;
      AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod = DecimalUtil.ZERO ;
      AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = DecimalUtil.ZERO ;
      AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo = DecimalUtil.ZERO ;
      AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = DecimalUtil.ZERO ;
      AV136Anticipacionerrores_mant_filtradods_34_tfmantporc = DecimalUtil.ZERO ;
      AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to = DecimalUtil.ZERO ;
      AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot = DecimalUtil.ZERO ;
      AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = DecimalUtil.ZERO ;
      AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod = DecimalUtil.ZERO ;
      AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = DecimalUtil.ZERO ;
      AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo = DecimalUtil.ZERO ;
      AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = DecimalUtil.ZERO ;
      AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor = DecimalUtil.ZERO ;
      AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = DecimalUtil.ZERO ;
      AV90sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      scmdbuf = "" ;
      lV103Anticipacionerrores_mant_filtradods_1_filterfulltext = "" ;
      lV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod = "" ;
      lV110Anticipacionerrores_mant_filtradods_8_tfmantclinom = "" ;
      lV112Anticipacionerrores_mant_filtradods_10_tfmantartcod = "" ;
      lV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc = "" ;
      lV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom = "" ;
      lV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = "" ;
      lV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = "" ;
      lV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = "" ;
      lV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = "" ;
      A14563MAntTkn = "" ;
      A14564MAntUsu = "" ;
      P0AUK2_A14563MAntTkn = new String[] {""} ;
      P0AUK2_A14564MAntUsu = new String[] {""} ;
      P0AUK2_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUK2_n14648MAntMetPro = new boolean[] {false} ;
      P0AUK2_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUK2_A14612MAntTipMDs = new String[] {""} ;
      P0AUK2_A14569MAntTipMCo = new String[] {""} ;
      P0AUK2_A14610MAntMaqDsc = new String[] {""} ;
      P0AUK2_A14570MAntMaqCod = new String[] {""} ;
      P0AUK2_A14642MAntColCod = new byte[1] ;
      P0AUK2_A14623MAntColNom = new String[] {""} ;
      P0AUK2_A14568MAntColNum = new int[1] ;
      P0AUK2_A14613MAntArtDsc = new String[] {""} ;
      P0AUK2_A14567MAntArtCod = new String[] {""} ;
      P0AUK2_A14611MAntCliNom = new String[] {""} ;
      P0AUK2_A14565MAntCliCod = new int[1] ;
      P0AUK2_A14566MAntEmprCo = new String[] {""} ;
      P0AUK2_A14562MAntId = new long[1] ;
      P0AUK2_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUK2_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUK2_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUK2_n14649MAntMetReo = new boolean[] {false} ;
      P0AUK2_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUK2_n14647MAntMetTot = new boolean[] {false} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_filtradoexport__default(),
         new Object[] {
             new Object[] {
            P0AUK2_A14563MAntTkn, P0AUK2_A14564MAntUsu, P0AUK2_A14648MAntMetPro, P0AUK2_n14648MAntMetPro, P0AUK2_A14643MAntKilPro, P0AUK2_A14612MAntTipMDs, P0AUK2_A14569MAntTipMCo, P0AUK2_A14610MAntMaqDsc, P0AUK2_A14570MAntMaqCod, P0AUK2_A14642MAntColCod,
            P0AUK2_A14623MAntColNom, P0AUK2_A14568MAntColNum, P0AUK2_A14613MAntArtDsc, P0AUK2_A14567MAntArtCod, P0AUK2_A14611MAntCliNom, P0AUK2_A14565MAntCliCod, P0AUK2_A14566MAntEmprCo, P0AUK2_A14562MAntId, P0AUK2_A14644MAntKilReo, P0AUK2_A14646MAntKilTot,
            P0AUK2_A14649MAntMetReo, P0AUK2_n14649MAntMetReo, P0AUK2_A14647MAntMetTot, P0AUK2_n14647MAntMetTot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50TFMAntColCod ;
   private byte AV51TFMAntColCod_To ;
   private byte A14642MAntColCod ;
   private byte AV120Anticipacionerrores_mant_filtradods_18_tfmantcolcod ;
   private byte AV121Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV82FechaInicio ;
   private short AV83FechaFin ;
   private short Gx_err ;
   private int AV77CliCod ;
   private int AV79ForColNum ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFMAntCliCod ;
   private int AV39TFMAntCliCod_To ;
   private int AV48TFMAntColNum ;
   private int AV49TFMAntColNum_To ;
   private int AV101GXV1 ;
   private int A14565MAntCliCod ;
   private int A14568MAntColNum ;
   private int AV108Anticipacionerrores_mant_filtradods_6_tfmantclicod ;
   private int AV109Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ;
   private int AV116Anticipacionerrores_mant_filtradods_14_tfmantcolnum ;
   private int AV117Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ;
   private int AV81TipMaqCodCollection_size ;
   private int AV146GXV2 ;
   private long AV34TFMAntId ;
   private long AV35TFMAntId_To ;
   private long AV31VisibleColumnCount ;
   private long A14562MAntId ;
   private long AV104Anticipacionerrores_mant_filtradods_2_tfmantid ;
   private long AV105Anticipacionerrores_mant_filtradods_3_tfmantid_to ;
   private java.math.BigDecimal AV84TFMAntKilTot ;
   private java.math.BigDecimal AV85TFMAntKilTot_To ;
   private java.math.BigDecimal AV60TFMAntKilProd ;
   private java.math.BigDecimal AV61TFMAntKilProd_To ;
   private java.math.BigDecimal AV62TFMAntKilReo ;
   private java.math.BigDecimal AV63TFMAntKilReo_To ;
   private java.math.BigDecimal AV64TFMAntPorc ;
   private java.math.BigDecimal AV65TFMAntPorc_To ;
   private java.math.BigDecimal AV95TFMAntMetTot ;
   private java.math.BigDecimal AV96TFMAntMetTot_To ;
   private java.math.BigDecimal AV91TFMAntMetProd ;
   private java.math.BigDecimal AV92TFMAntMetProd_To ;
   private java.math.BigDecimal AV93TFMAntMetReo ;
   private java.math.BigDecimal AV94TFMAntMetReo_To ;
   private java.math.BigDecimal AV97TFMantMetPor ;
   private java.math.BigDecimal AV98TFMantMetPor_To ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14645MAntPorc ;
   private java.math.BigDecimal A14647MAntMetTot ;
   private java.math.BigDecimal A14648MAntMetPro ;
   private java.math.BigDecimal A14649MAntMetReo ;
   private java.math.BigDecimal A14650MantMetPor ;
   private java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot ;
   private java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ;
   private java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod ;
   private java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ;
   private java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo ;
   private java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ;
   private java.math.BigDecimal AV136Anticipacionerrores_mant_filtradods_34_tfmantporc ;
   private java.math.BigDecimal AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to ;
   private java.math.BigDecimal AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot ;
   private java.math.BigDecimal AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ;
   private java.math.BigDecimal AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod ;
   private java.math.BigDecimal AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ;
   private java.math.BigDecimal AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo ;
   private java.math.BigDecimal AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ;
   private java.math.BigDecimal AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor ;
   private java.math.BigDecimal AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ;
   private String AV69MAntEmprCod ;
   private String AV78ArtCod ;
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
   private String AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod ;
   private String AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ;
   private String AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod ;
   private String AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ;
   private String AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom ;
   private String AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ;
   private String AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ;
   private String AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ;
   private String AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ;
   private String AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ;
   private String AV90sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ;
   private String scmdbuf ;
   private String lV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod ;
   private String lV112Anticipacionerrores_mant_filtradods_10_tfmantartcod ;
   private String lV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom ;
   private String lV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ;
   private String lV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ;
   private String A14564MAntUsu ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n14648MAntMetPro ;
   private boolean n14649MAntMetReo ;
   private boolean n14647MAntMetTot ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV80TipMaqCodJSON ;
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
   private String AV103Anticipacionerrores_mant_filtradods_1_filterfulltext ;
   private String AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom ;
   private String AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ;
   private String AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc ;
   private String AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ;
   private String AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ;
   private String AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ;
   private String AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ;
   private String AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ;
   private String AV90sdtMTok_getgxTv_SdtsdtMTok_Mtkn ;
   private String lV103Anticipacionerrores_mant_filtradods_1_filterfulltext ;
   private String lV110Anticipacionerrores_mant_filtradods_8_tfmantclinom ;
   private String lV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc ;
   private String lV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ;
   private String lV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ;
   private String A14563MAntTkn ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private app.anticipacionerrores.SdtsdtMTok AV90sdtMTok ;
   private String[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUK2_A14563MAntTkn ;
   private String[] P0AUK2_A14564MAntUsu ;
   private java.math.BigDecimal[] P0AUK2_A14648MAntMetPro ;
   private boolean[] P0AUK2_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUK2_A14643MAntKilPro ;
   private String[] P0AUK2_A14612MAntTipMDs ;
   private String[] P0AUK2_A14569MAntTipMCo ;
   private String[] P0AUK2_A14610MAntMaqDsc ;
   private String[] P0AUK2_A14570MAntMaqCod ;
   private byte[] P0AUK2_A14642MAntColCod ;
   private String[] P0AUK2_A14623MAntColNom ;
   private int[] P0AUK2_A14568MAntColNum ;
   private String[] P0AUK2_A14613MAntArtDsc ;
   private String[] P0AUK2_A14567MAntArtCod ;
   private String[] P0AUK2_A14611MAntCliNom ;
   private int[] P0AUK2_A14565MAntCliCod ;
   private String[] P0AUK2_A14566MAntEmprCo ;
   private long[] P0AUK2_A14562MAntId ;
   private java.math.BigDecimal[] P0AUK2_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUK2_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUK2_A14649MAntMetReo ;
   private boolean[] P0AUK2_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUK2_A14647MAntMetTot ;
   private boolean[] P0AUK2_n14647MAntMetTot ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV81TipMaqCodCollection ;
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

final  class mant_filtradoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV81TipMaqCodCollection ,
                                          String AV103Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV104Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV105Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV108Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV109Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV116Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV117Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV120Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV121Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV136Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV78ArtCod ,
                                          int AV79ForColNum ,
                                          int AV81TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV90sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV90sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV77CliCod ,
                                          String AV69MAntEmprCod ,
                                          String A14563MAntTkn ,
                                          String A14564MAntUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[69];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT MAntTkn, MAntUsu, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc, MAntArtCod, MAntCliNom," ;
      scmdbuf += " MAntCliCod, MAntEmprCo, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntTkn = ? and MAntUsu = ? and MAntCliCod = ? and MAntEmprCo = ?)");
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
         GXv_int8[20] = (byte)(1) ;
         GXv_int8[21] = (byte)(1) ;
         GXv_int8[22] = (byte)(1) ;
         GXv_int8[23] = (byte)(1) ;
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV104Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV105Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV106Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV108Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV109Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV110Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV116Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV117Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV120Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV121Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV126Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV128Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int8[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int8[67] = (byte)(1) ;
      }
      if ( ! (0==AV79ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int8[68] = (byte)(1) ;
      }
      if ( AV81TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntId" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntId DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntEmprCo" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntEmprCo DESC" ;
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
         scmdbuf += " ORDER BY MAntColNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntColNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntColNom DESC" ;
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
         scmdbuf += " ORDER BY MAntKilTot" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntKilTot DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntKilPro" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntKilPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntKilReo" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntKilReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntMetTot" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntMetTot DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntMetPro" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntMetPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MAntMetReo" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MAntMetReo DESC" ;
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
                  return conditional_P0AUK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getVarchar(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[69], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
      }
   }

}

