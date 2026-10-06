package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcalprowwexport extends GXProcedure
{
   public tcalprowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcalprowwexport.class ), "" );
   }

   public tcalprowwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tcalprowwexport.this.aP1 = new String[] {""};
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
      tcalprowwexport.this.aP0 = aP0;
      tcalprowwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TCALPROWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFAlbProID) && (0==AV35TFAlbProID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFAlbProID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFAlbProID_To );
      }
      if ( ! ( ( AV37TFAlbProInEx_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mercado Interno / Externo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV68i = 1 ;
         AV82GXV1 = 1 ;
         while ( AV82GXV1 <= AV37TFAlbProInEx_Sels.size() )
         {
            AV38TFAlbProInEx_Sel = ((Number) AV37TFAlbProInEx_Sels.elementAt(-1+AV82GXV1)).byteValue() ;
            if ( AV68i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV38TFAlbProInEx_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Mercado Interno", "") );
            }
            else if ( AV38TFAlbProInEx_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Mercado Externo", "") );
            }
            AV68i = (long)(AV68i+1) ;
            AV82GXV1 = (int)(AV82GXV1+1) ;
         }
      }
      if ( ! ( ( AV40TFAlbProTipo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor o Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV68i = 1 ;
         AV83GXV2 = 1 ;
         while ( AV83GXV2 <= AV40TFAlbProTipo_Sels.size() )
         {
            AV41TFAlbProTipo_Sel = (String)AV40TFAlbProTipo_Sels.elementAt(-1+AV83GXV2) ;
            if ( AV68i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV41TFAlbProTipo_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Proveedor", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV41TFAlbProTipo_Sel), httpContext.getMessage( "C", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cliente", "") );
            }
            AV68i = (long)(AV68i+1) ;
            AV83GXV2 = (int)(AV83GXV2+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFAlbProDate)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV42TFAlbProDate );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV44TFAlbProSal) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha-Hora Salida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV44TFAlbProSal );
      }
      if ( ! ( (0==AV46TFCatDocID) && (0==AV47TFCatDocID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Categoria", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFCatDocID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFCatDocID_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFCatDocNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Categoria", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCatDocNom_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFCatDocNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Categoria", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCatDocNom, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFAlbProPrvID) && (0==AV51TFAlbProPrvID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFAlbProPrvID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFAlbProPrvID_To );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFAlbProPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFAlbProPrvNom_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFAlbProPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFAlbProPrvNom, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFAlbProCliCod) && (0==AV55TFAlbProCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFAlbProCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFAlbProCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFAlbProCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFAlbProCliNom_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFAlbProCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFAlbProCliNom, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV58TFAlbProDomEnv) && (0==AV59TFAlbProDomEnv_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio Envio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFAlbProDomEnv );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFAlbProDomEnv_To );
      }
      if ( ! ( (0==AV60TFTrnCod) && (0==AV61TFTrnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Transp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFTrnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFTrnCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFTrnNom_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFTrnNom, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFAlbProMatricula_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFAlbProMatricula_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFAlbProMatricula)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFAlbProMatricula, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFAlbProObs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFAlbProObs_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFAlbProObs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFAlbProObs, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFAlbProIDAT_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "AT ID", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFAlbProIDAT_Sel, GXv_char5) ;
         tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFAlbProIDAT)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "AT ID", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFAlbProIDAT, GXv_char5) ;
            tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV78TFAlbProStAT_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado AT ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV68i = 1 ;
         AV84GXV3 = 1 ;
         while ( AV84GXV3 <= AV78TFAlbProStAT_Sels.size() )
         {
            AV79TFAlbProStAT_Sel = ((Number) AV78TFAlbProStAT_Sels.elementAt(-1+AV84GXV3)).byteValue() ;
            if ( AV68i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV79TFAlbProStAT_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( AV79TFAlbProStAT_Sel == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Enviada", "") );
            }
            AV68i = (long)(AV68i+1) ;
            AV84GXV3 = (int)(AV84GXV3+1) ;
         }
      }
      if ( ! ( ( AV72TFAlbProAnulado_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tcalprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV68i = 1 ;
         AV85GXV4 = 1 ;
         while ( AV85GXV4 <= AV72TFAlbProAnulado_Sels.size() )
         {
            AV70TFAlbProAnulado_Sel = (String)AV72TFAlbProAnulado_Sels.elementAt(-1+AV85GXV4) ;
            if ( AV68i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV70TFAlbProAnulado_Sel), "") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Activo", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV70TFAlbProAnulado_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Anulado", "") );
            }
            AV68i = (long)(AV68i+1) ;
            AV85GXV4 = (int)(AV85GXV4+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TCALPROWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TCALPROWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV86GXV5 = 1 ;
      while ( AV86GXV5 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV86GXV5));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV86GXV5 = (int)(AV86GXV5+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV88Tcalprowwds_1_filterfulltext = AV18FilterFullText ;
      AV89Tcalprowwds_2_tfalbproid = AV34TFAlbProID ;
      AV90Tcalprowwds_3_tfalbproid_to = AV35TFAlbProID_To ;
      AV91Tcalprowwds_4_tfalbproinex_sels = AV37TFAlbProInEx_Sels ;
      AV92Tcalprowwds_5_tfalbprotipo_sels = AV40TFAlbProTipo_Sels ;
      AV93Tcalprowwds_6_tfalbprodate = AV42TFAlbProDate ;
      AV94Tcalprowwds_7_tfalbprosal = AV44TFAlbProSal ;
      AV95Tcalprowwds_8_tfcatdocid = AV46TFCatDocID ;
      AV96Tcalprowwds_9_tfcatdocid_to = AV47TFCatDocID_To ;
      AV97Tcalprowwds_10_tfcatdocnom = AV48TFCatDocNom ;
      AV98Tcalprowwds_11_tfcatdocnom_sel = AV49TFCatDocNom_Sel ;
      AV99Tcalprowwds_12_tfalbproprvid = AV50TFAlbProPrvID ;
      AV100Tcalprowwds_13_tfalbproprvid_to = AV51TFAlbProPrvID_To ;
      AV101Tcalprowwds_14_tfalbproprvnom = AV52TFAlbProPrvNom ;
      AV102Tcalprowwds_15_tfalbproprvnom_sel = AV53TFAlbProPrvNom_Sel ;
      AV103Tcalprowwds_16_tfalbproclicod = AV54TFAlbProCliCod ;
      AV104Tcalprowwds_17_tfalbproclicod_to = AV55TFAlbProCliCod_To ;
      AV105Tcalprowwds_18_tfalbproclinom = AV56TFAlbProCliNom ;
      AV106Tcalprowwds_19_tfalbproclinom_sel = AV57TFAlbProCliNom_Sel ;
      AV107Tcalprowwds_20_tfalbprodomenv = AV58TFAlbProDomEnv ;
      AV108Tcalprowwds_21_tfalbprodomenv_to = AV59TFAlbProDomEnv_To ;
      AV109Tcalprowwds_22_tftrncod = AV60TFTrnCod ;
      AV110Tcalprowwds_23_tftrncod_to = AV61TFTrnCod_To ;
      AV111Tcalprowwds_24_tftrnnom = AV62TFTrnNom ;
      AV112Tcalprowwds_25_tftrnnom_sel = AV63TFTrnNom_Sel ;
      AV113Tcalprowwds_26_tfalbpromatricula = AV64TFAlbProMatricula ;
      AV114Tcalprowwds_27_tfalbpromatricula_sel = AV65TFAlbProMatricula_Sel ;
      AV115Tcalprowwds_28_tfalbproobs = AV66TFAlbProObs ;
      AV116Tcalprowwds_29_tfalbproobs_sel = AV67TFAlbProObs_Sel ;
      AV117Tcalprowwds_30_tfalbproidat = AV73TFAlbProIDAT ;
      AV118Tcalprowwds_31_tfalbproidat_sel = AV74TFAlbProIDAT_Sel ;
      AV119Tcalprowwds_32_tfalbprostat_sels = AV78TFAlbProStAT_Sels ;
      AV120Tcalprowwds_33_tfalbproanulado_sels = AV72TFAlbProAnulado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV91Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV92Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV119Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV120Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV89Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV90Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV91Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV92Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV93Tcalprowwds_6_tfalbprodate ,
                                           AV94Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV95Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV96Tcalprowwds_9_tfcatdocid_to) ,
                                           AV98Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV97Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV99Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV100Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV102Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV101Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV103Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV104Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV106Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV105Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV107Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV108Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV109Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV110Tcalprowwds_23_tftrncod_to) ,
                                           AV112Tcalprowwds_25_tftrnnom_sel ,
                                           AV111Tcalprowwds_24_tftrnnom ,
                                           AV114Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV113Tcalprowwds_26_tfalbpromatricula ,
                                           AV116Tcalprowwds_29_tfalbproobs_sel ,
                                           AV115Tcalprowwds_28_tfalbproobs ,
                                           AV118Tcalprowwds_31_tfalbproidat_sel ,
                                           AV117Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV119Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV120Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV88Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV97Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV97Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV101Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV101Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV105Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV105Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV111Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV111Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV113Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV113Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV115Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV115Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV117Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV117Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091R2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV89Tcalprowwds_2_tfalbproid), Integer.valueOf(AV90Tcalprowwds_3_tfalbproid_to), AV93Tcalprowwds_6_tfalbprodate, AV94Tcalprowwds_7_tfalbprosal, Short.valueOf(AV95Tcalprowwds_8_tfcatdocid), Short.valueOf(AV96Tcalprowwds_9_tfcatdocid_to), lV97Tcalprowwds_10_tfcatdocnom, AV98Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV99Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV100Tcalprowwds_13_tfalbproprvid_to), lV101Tcalprowwds_14_tfalbproprvnom, AV102Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV103Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV104Tcalprowwds_17_tfalbproclicod_to), lV105Tcalprowwds_18_tfalbproclinom, AV106Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV107Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV108Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV109Tcalprowwds_22_tftrncod), Short.valueOf(AV110Tcalprowwds_23_tftrncod_to), lV111Tcalprowwds_24_tftrnnom, AV112Tcalprowwds_25_tftrnnom_sel, lV113Tcalprowwds_26_tfalbpromatricula, AV114Tcalprowwds_27_tfalbpromatricula_sel, lV115Tcalprowwds_28_tfalbproobs, AV116Tcalprowwds_29_tfalbproobs_sel, lV117Tcalprowwds_30_tfalbproidat, AV118Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P091R2_A396EmprCod[0] ;
         A13440AlbProAnul = P091R2_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091R2_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091R2_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091R2_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091R2_A13424AlbProMatr[0] ;
         A841TrnNom = P091R2_A841TrnNom[0] ;
         n841TrnNom = P091R2_n841TrnNom[0] ;
         A840TrnCod = P091R2_A840TrnCod[0] ;
         n840TrnCod = P091R2_n840TrnCod[0] ;
         A13427AlbProDomE = P091R2_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091R2_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091R2_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091R2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091R2_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091R2_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091R2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091R2_n13454CatDocNom[0] ;
         A13453CatDocID = P091R2_A13453CatDocID[0] ;
         n13453CatDocID = P091R2_n13453CatDocID[0] ;
         A13429AlbProSal = P091R2_A13429AlbProSal[0] ;
         A13430AlbProDate = P091R2_A13430AlbProDate[0] ;
         A13418AlbProID = P091R2_A13418AlbProID[0] ;
         A13417AlbProTipo = P091R2_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091R2_A13452AlbProInEx[0] ;
         A841TrnNom = P091R2_A841TrnNom[0] ;
         n841TrnNom = P091R2_n841TrnNom[0] ;
         A13426AlbProCliN = P091R2_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091R2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091R2_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091R2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091R2_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV88Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV88Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV88Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13418AlbProID );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( A13452AlbProInEx == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Mercado Interno", "") );
               }
               else if ( A13452AlbProInEx == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Mercado Externo", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A13417AlbProTipo), httpContext.getMessage( "P", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Proveedor", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13417AlbProTipo), httpContext.getMessage( "C", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cliente", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A13430AlbProDate );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A13429AlbProSal );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13453CatDocID );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13454CatDocNom, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13419AlbProPrvI );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13420AlbProPrvN, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13425AlbProCliC );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13426AlbProCliN, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13427AlbProDomE );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A840TrnCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13424AlbProMatr, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13439AlbProObs, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13436AlbProIDAT, GXv_char5) ;
               tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( A13438AlbProStAT == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
               }
               else if ( A13438AlbProStAT == 3 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Enviada", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A13440AlbProAnul), "") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Activo", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13440AlbProAnul), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Anulado", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProID", "", "Nº Documento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProInEx", "", "Mercado Interno / Externo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProTipo", "", "Proveedor o Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProDate", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProSal", "", "Fecha-Hora Salida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CatDocID", "", "Codigo Categoria", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CatDocNom", "", "Categoria", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProPrvID", "", "Codigo Proveedor", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProPrvNom", "", "Nombre Proveedor", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProCliCod", "", "Codigo Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProCliNom", "", "Nombre Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProDomEnv", "", "Domicilio Envio", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnCod", "", "Cod Transp", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProMatricula", "", "Matricula", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProObs", "", "Observaciones", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProIDAT", "", "AT ID", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProStAT", "", "Estado AT ", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProAnulado", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TCALPROWWColumnsSelector", GXv_char5) ;
      tcalprowwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TCALPROWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCALPROWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TCALPROWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV121GXV6 = 1 ;
      while ( AV121GXV6 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV6));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROID") == 0 )
         {
            AV34TFAlbProID = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFAlbProID_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROINEX_SEL") == 0 )
         {
            AV36TFAlbProInEx_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV37TFAlbProInEx_Sels.fromJSonString(AV36TFAlbProInEx_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROTIPO_SEL") == 0 )
         {
            AV39TFAlbProTipo_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV40TFAlbProTipo_Sels.fromJSonString(AV39TFAlbProTipo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODATE") == 0 )
         {
            AV42TFAlbProDate = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV44TFAlbProSal = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCID") == 0 )
         {
            AV46TFCatDocID = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFCatDocID_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM") == 0 )
         {
            AV48TFCatDocNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM_SEL") == 0 )
         {
            AV49TFCatDocNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVID") == 0 )
         {
            AV50TFAlbProPrvID = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFAlbProPrvID_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV52TFAlbProPrvNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV53TFAlbProPrvNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLICOD") == 0 )
         {
            AV54TFAlbProCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFAlbProCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM") == 0 )
         {
            AV56TFAlbProCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM_SEL") == 0 )
         {
            AV57TFAlbProCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODOMENV") == 0 )
         {
            AV58TFAlbProDomEnv = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFAlbProDomEnv_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV60TFTrnCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFTrnCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV62TFTrnNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV63TFTrnNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA") == 0 )
         {
            AV64TFAlbProMatricula = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA_SEL") == 0 )
         {
            AV65TFAlbProMatricula_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS") == 0 )
         {
            AV66TFAlbProObs = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS_SEL") == 0 )
         {
            AV67TFAlbProObs_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV73TFAlbProIDAT = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV74TFAlbProIDAT_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV77TFAlbProStAT_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV78TFAlbProStAT_Sels.fromJSonString(AV77TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROANULADO_SEL") == 0 )
         {
            AV71TFAlbProAnulado_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV72TFAlbProAnulado_Sels.fromJSonString(AV71TFAlbProAnulado_SelsJson, null);
         }
         AV121GXV6 = (int)(AV121GXV6+1) ;
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
      this.aP0[0] = tcalprowwexport.this.AV11Filename;
      this.aP1[0] = tcalprowwexport.this.AV12ErrorMessage;
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
      AV37TFAlbProInEx_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV40TFAlbProTipo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41TFAlbProTipo_Sel = "" ;
      AV42TFAlbProDate = GXutil.nullDate() ;
      AV44TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV49TFCatDocNom_Sel = "" ;
      AV48TFCatDocNom = "" ;
      AV53TFAlbProPrvNom_Sel = "" ;
      AV52TFAlbProPrvNom = "" ;
      AV57TFAlbProCliNom_Sel = "" ;
      AV56TFAlbProCliNom = "" ;
      AV63TFTrnNom_Sel = "" ;
      AV62TFTrnNom = "" ;
      AV65TFAlbProMatricula_Sel = "" ;
      AV64TFAlbProMatricula = "" ;
      AV67TFAlbProObs_Sel = "" ;
      AV66TFAlbProObs = "" ;
      AV74TFAlbProIDAT_Sel = "" ;
      AV73TFAlbProIDAT = "" ;
      AV78TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV72TFAlbProAnulado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV70TFAlbProAnulado_Sel = "" ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13417AlbProTipo = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13454CatDocNom = "" ;
      A13420AlbProPrvN = "" ;
      A13426AlbProCliN = "" ;
      A841TrnNom = "" ;
      A13424AlbProMatr = "" ;
      A13439AlbProObs = "" ;
      A13436AlbProIDAT = "" ;
      A13440AlbProAnul = "" ;
      AV88Tcalprowwds_1_filterfulltext = "" ;
      AV91Tcalprowwds_4_tfalbproinex_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV92Tcalprowwds_5_tfalbprotipo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV93Tcalprowwds_6_tfalbprodate = GXutil.nullDate() ;
      AV94Tcalprowwds_7_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV97Tcalprowwds_10_tfcatdocnom = "" ;
      AV98Tcalprowwds_11_tfcatdocnom_sel = "" ;
      AV101Tcalprowwds_14_tfalbproprvnom = "" ;
      AV102Tcalprowwds_15_tfalbproprvnom_sel = "" ;
      AV105Tcalprowwds_18_tfalbproclinom = "" ;
      AV106Tcalprowwds_19_tfalbproclinom_sel = "" ;
      AV111Tcalprowwds_24_tftrnnom = "" ;
      AV112Tcalprowwds_25_tftrnnom_sel = "" ;
      AV113Tcalprowwds_26_tfalbpromatricula = "" ;
      AV114Tcalprowwds_27_tfalbpromatricula_sel = "" ;
      AV115Tcalprowwds_28_tfalbproobs = "" ;
      AV116Tcalprowwds_29_tfalbproobs_sel = "" ;
      AV117Tcalprowwds_30_tfalbproidat = "" ;
      AV118Tcalprowwds_31_tfalbproidat_sel = "" ;
      AV119Tcalprowwds_32_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV120Tcalprowwds_33_tfalbproanulado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV88Tcalprowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV97Tcalprowwds_10_tfcatdocnom = "" ;
      lV101Tcalprowwds_14_tfalbproprvnom = "" ;
      lV105Tcalprowwds_18_tfalbproclinom = "" ;
      lV111Tcalprowwds_24_tftrnnom = "" ;
      lV113Tcalprowwds_26_tfalbpromatricula = "" ;
      lV115Tcalprowwds_28_tfalbproobs = "" ;
      lV117Tcalprowwds_30_tfalbproidat = "" ;
      P091R2_A396EmprCod = new String[] {""} ;
      P091R2_A13440AlbProAnul = new String[] {""} ;
      P091R2_A13438AlbProStAT = new byte[1] ;
      P091R2_A13436AlbProIDAT = new String[] {""} ;
      P091R2_A13439AlbProObs = new String[] {""} ;
      P091R2_A13424AlbProMatr = new String[] {""} ;
      P091R2_A841TrnNom = new String[] {""} ;
      P091R2_n841TrnNom = new boolean[] {false} ;
      P091R2_A840TrnCod = new short[1] ;
      P091R2_n840TrnCod = new boolean[] {false} ;
      P091R2_A13427AlbProDomE = new byte[1] ;
      P091R2_A13426AlbProCliN = new String[] {""} ;
      P091R2_A13425AlbProCliC = new int[1] ;
      P091R2_A13420AlbProPrvN = new String[] {""} ;
      P091R2_n13420AlbProPrvN = new boolean[] {false} ;
      P091R2_A13419AlbProPrvI = new int[1] ;
      P091R2_A13454CatDocNom = new String[] {""} ;
      P091R2_n13454CatDocNom = new boolean[] {false} ;
      P091R2_A13453CatDocID = new short[1] ;
      P091R2_n13453CatDocID = new boolean[] {false} ;
      P091R2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091R2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091R2_A13418AlbProID = new int[1] ;
      P091R2_A13417AlbProTipo = new String[] {""} ;
      P091R2_A13452AlbProInEx = new byte[1] ;
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
      AV36TFAlbProInEx_SelsJson = "" ;
      AV39TFAlbProTipo_SelsJson = "" ;
      AV77TFAlbProStAT_SelsJson = "" ;
      AV71TFAlbProAnulado_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcalprowwexport__default(),
         new Object[] {
             new Object[] {
            P091R2_A396EmprCod, P091R2_A13440AlbProAnul, P091R2_A13438AlbProStAT, P091R2_A13436AlbProIDAT, P091R2_A13439AlbProObs, P091R2_A13424AlbProMatr, P091R2_A841TrnNom, P091R2_n841TrnNom, P091R2_A840TrnCod, P091R2_n840TrnCod,
            P091R2_A13427AlbProDomE, P091R2_A13426AlbProCliN, P091R2_A13425AlbProCliC, P091R2_A13420AlbProPrvN, P091R2_n13420AlbProPrvN, P091R2_A13419AlbProPrvI, P091R2_A13454CatDocNom, P091R2_n13454CatDocNom, P091R2_A13453CatDocID, P091R2_n13453CatDocID,
            P091R2_A13429AlbProSal, P091R2_A13430AlbProDate, P091R2_A13418AlbProID, P091R2_A13417AlbProTipo, P091R2_A13452AlbProInEx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38TFAlbProInEx_Sel ;
   private byte AV58TFAlbProDomEnv ;
   private byte AV59TFAlbProDomEnv_To ;
   private byte AV79TFAlbProStAT_Sel ;
   private byte A13452AlbProInEx ;
   private byte A13427AlbProDomE ;
   private byte A13438AlbProStAT ;
   private byte AV107Tcalprowwds_20_tfalbprodomenv ;
   private byte AV108Tcalprowwds_21_tfalbprodomenv_to ;
   private short AV46TFCatDocID ;
   private short AV47TFCatDocID_To ;
   private short AV60TFTrnCod ;
   private short AV61TFTrnCod_To ;
   private short GXv_int3[] ;
   private short A13453CatDocID ;
   private short A840TrnCod ;
   private short AV95Tcalprowwds_8_tfcatdocid ;
   private short AV96Tcalprowwds_9_tfcatdocid_to ;
   private short AV109Tcalprowwds_22_tftrncod ;
   private short AV110Tcalprowwds_23_tftrncod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFAlbProID ;
   private int AV35TFAlbProID_To ;
   private int AV82GXV1 ;
   private int AV83GXV2 ;
   private int AV50TFAlbProPrvID ;
   private int AV51TFAlbProPrvID_To ;
   private int AV54TFAlbProCliCod ;
   private int AV55TFAlbProCliCod_To ;
   private int AV84GXV3 ;
   private int AV85GXV4 ;
   private int AV86GXV5 ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int A13425AlbProCliC ;
   private int AV89Tcalprowwds_2_tfalbproid ;
   private int AV90Tcalprowwds_3_tfalbproid_to ;
   private int AV99Tcalprowwds_12_tfalbproprvid ;
   private int AV100Tcalprowwds_13_tfalbproprvid_to ;
   private int AV103Tcalprowwds_16_tfalbproclicod ;
   private int AV104Tcalprowwds_17_tfalbproclicod_to ;
   private int AV91Tcalprowwds_4_tfalbproinex_sels_size ;
   private int AV92Tcalprowwds_5_tfalbprotipo_sels_size ;
   private int AV119Tcalprowwds_32_tfalbprostat_sels_size ;
   private int AV120Tcalprowwds_33_tfalbproanulado_sels_size ;
   private int AV121GXV6 ;
   private long AV68i ;
   private long AV31VisibleColumnCount ;
   private String AV41TFAlbProTipo_Sel ;
   private String AV49TFCatDocNom_Sel ;
   private String AV48TFCatDocNom ;
   private String AV53TFAlbProPrvNom_Sel ;
   private String AV52TFAlbProPrvNom ;
   private String AV57TFAlbProCliNom_Sel ;
   private String AV56TFAlbProCliNom ;
   private String AV63TFTrnNom_Sel ;
   private String AV62TFTrnNom ;
   private String AV65TFAlbProMatricula_Sel ;
   private String AV64TFAlbProMatricula ;
   private String AV74TFAlbProIDAT_Sel ;
   private String AV73TFAlbProIDAT ;
   private String AV70TFAlbProAnulado_Sel ;
   private String A13417AlbProTipo ;
   private String A13454CatDocNom ;
   private String A13420AlbProPrvN ;
   private String A13426AlbProCliN ;
   private String A841TrnNom ;
   private String A13424AlbProMatr ;
   private String A13436AlbProIDAT ;
   private String A13440AlbProAnul ;
   private String AV97Tcalprowwds_10_tfcatdocnom ;
   private String AV98Tcalprowwds_11_tfcatdocnom_sel ;
   private String AV101Tcalprowwds_14_tfalbproprvnom ;
   private String AV102Tcalprowwds_15_tfalbproprvnom_sel ;
   private String AV105Tcalprowwds_18_tfalbproclinom ;
   private String AV106Tcalprowwds_19_tfalbproclinom_sel ;
   private String AV111Tcalprowwds_24_tftrnnom ;
   private String AV112Tcalprowwds_25_tftrnnom_sel ;
   private String AV113Tcalprowwds_26_tfalbpromatricula ;
   private String AV114Tcalprowwds_27_tfalbpromatricula_sel ;
   private String AV117Tcalprowwds_30_tfalbproidat ;
   private String AV118Tcalprowwds_31_tfalbproidat_sel ;
   private String scmdbuf ;
   private String lV97Tcalprowwds_10_tfcatdocnom ;
   private String lV101Tcalprowwds_14_tfalbproprvnom ;
   private String lV105Tcalprowwds_18_tfalbproclinom ;
   private String lV111Tcalprowwds_24_tftrnnom ;
   private String lV113Tcalprowwds_26_tfalbpromatricula ;
   private String lV117Tcalprowwds_30_tfalbproidat ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV44TFAlbProSal ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date AV94Tcalprowwds_7_tfalbprosal ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV42TFAlbProDate ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV93Tcalprowwds_6_tfalbprodate ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n13420AlbProPrvN ;
   private boolean n13454CatDocNom ;
   private boolean n13453CatDocID ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV36TFAlbProInEx_SelsJson ;
   private String AV39TFAlbProTipo_SelsJson ;
   private String AV77TFAlbProStAT_SelsJson ;
   private String AV71TFAlbProAnulado_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV67TFAlbProObs_Sel ;
   private String AV66TFAlbProObs ;
   private String A13439AlbProObs ;
   private String AV88Tcalprowwds_1_filterfulltext ;
   private String AV115Tcalprowwds_28_tfalbproobs ;
   private String AV116Tcalprowwds_29_tfalbproobs_sel ;
   private String lV88Tcalprowwds_1_filterfulltext ;
   private String lV115Tcalprowwds_28_tfalbproobs ;
   private GXSimpleCollection<Byte> AV37TFAlbProInEx_Sels ;
   private GXSimpleCollection<Byte> AV78TFAlbProStAT_Sels ;
   private GXSimpleCollection<Byte> AV91Tcalprowwds_4_tfalbproinex_sels ;
   private GXSimpleCollection<Byte> AV119Tcalprowwds_32_tfalbprostat_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV40TFAlbProTipo_Sels ;
   private GXSimpleCollection<String> AV72TFAlbProAnulado_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P091R2_A396EmprCod ;
   private String[] P091R2_A13440AlbProAnul ;
   private byte[] P091R2_A13438AlbProStAT ;
   private String[] P091R2_A13436AlbProIDAT ;
   private String[] P091R2_A13439AlbProObs ;
   private String[] P091R2_A13424AlbProMatr ;
   private String[] P091R2_A841TrnNom ;
   private boolean[] P091R2_n841TrnNom ;
   private short[] P091R2_A840TrnCod ;
   private boolean[] P091R2_n840TrnCod ;
   private byte[] P091R2_A13427AlbProDomE ;
   private String[] P091R2_A13426AlbProCliN ;
   private int[] P091R2_A13425AlbProCliC ;
   private String[] P091R2_A13420AlbProPrvN ;
   private boolean[] P091R2_n13420AlbProPrvN ;
   private int[] P091R2_A13419AlbProPrvI ;
   private String[] P091R2_A13454CatDocNom ;
   private boolean[] P091R2_n13454CatDocNom ;
   private short[] P091R2_A13453CatDocID ;
   private boolean[] P091R2_n13453CatDocID ;
   private java.util.Date[] P091R2_A13429AlbProSal ;
   private java.util.Date[] P091R2_A13430AlbProDate ;
   private int[] P091R2_A13418AlbProID ;
   private String[] P091R2_A13417AlbProTipo ;
   private byte[] P091R2_A13452AlbProInEx ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV92Tcalprowwds_5_tfalbprotipo_sels ;
   private GXSimpleCollection<String> AV120Tcalprowwds_33_tfalbproanulado_sels ;
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

final  class tcalprowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV91Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV92Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV119Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV120Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV89Tcalprowwds_2_tfalbproid ,
                                          int AV90Tcalprowwds_3_tfalbproid_to ,
                                          int AV91Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV92Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV93Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV94Tcalprowwds_7_tfalbprosal ,
                                          short AV95Tcalprowwds_8_tfcatdocid ,
                                          short AV96Tcalprowwds_9_tfcatdocid_to ,
                                          String AV98Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV97Tcalprowwds_10_tfcatdocnom ,
                                          int AV99Tcalprowwds_12_tfalbproprvid ,
                                          int AV100Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV102Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV101Tcalprowwds_14_tfalbproprvnom ,
                                          int AV103Tcalprowwds_16_tfalbproclicod ,
                                          int AV104Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV106Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV105Tcalprowwds_18_tfalbproclinom ,
                                          byte AV107Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV108Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV109Tcalprowwds_22_tftrncod ,
                                          short AV110Tcalprowwds_23_tftrncod_to ,
                                          String AV112Tcalprowwds_25_tftrnnom_sel ,
                                          String AV111Tcalprowwds_24_tftrnnom ,
                                          String AV114Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV113Tcalprowwds_26_tfalbpromatricula ,
                                          String AV116Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV115Tcalprowwds_28_tfalbproobs ,
                                          String AV118Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV117Tcalprowwds_30_tfalbproidat ,
                                          int AV119Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV120Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV88Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[28];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV89Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( AV91Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV92Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV97Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV99Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV100Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV103Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV104Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV107Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV108Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV109Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV110Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV111Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV113Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV115Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV117Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( AV119Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV120Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV120Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProID" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProID DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDate" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDate DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProSal" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CatDocID" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CatDocID DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CatDocNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CatDocNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProObs" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProObs DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul DESC" ;
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
                  return conditional_P091R2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Boolean) dynConstraints[56]).booleanValue() , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
      }
   }

}

