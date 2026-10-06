package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tempreswwexport extends GXProcedure
{
   public tempreswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tempreswwexport.class ), "" );
   }

   public tempreswwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tempreswwexport.this.aP1 = new String[] {""};
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
      tempreswwexport.this.aP0 = aP0;
      tempreswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TEMPRESWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99FilterFullText, GXv_char5) ;
      tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV49TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFEmprCod_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFEmprCod, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFEmprNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFEmprNom_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFEmprNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFEmprNom, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFEmprDir_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dirección", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFEmprDir_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFEmprDir)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dirección", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFEmprDir, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFEmprCpo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Postal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFEmprCpo_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFEmprCpo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Postal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFEmprCpo, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFEmprPob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Población", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFEmprPob_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFEmprPob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Población", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFEmprPob, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFEmprCif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CIF", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFEmprCif_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFEmprCif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CIF", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFEmprCif, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFEmprTel_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Teléfono", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFEmprTel_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFEmprTel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Teléfono", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFEmprTel, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFEmprFax_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fax", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFEmprFax_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFEmprFax)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fax", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFEmprFax, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFIvaCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo IVA", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFIvaCod_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFIvaCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo IVA", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFIvaCod, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFIvaDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion IVA", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFIvaDsc_Sel, GXv_char5) ;
         tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFIvaDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion IVA", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFIvaDsc, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV68TFIvaPor) && (0==AV69TFIvaPor_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "IVA General", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV68TFIvaPor );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tempreswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV69TFIvaPor_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("TEMPRESWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("TEMPRESWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV102GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV104Tempreswwds_1_filterfulltext = AV99FilterFullText ;
      AV105Tempreswwds_2_tfemprcod = AV48TFEmprCod ;
      AV106Tempreswwds_3_tfemprcod_sel = AV49TFEmprCod_Sel ;
      AV107Tempreswwds_4_tfemprnom = AV50TFEmprNom ;
      AV108Tempreswwds_5_tfemprnom_sel = AV51TFEmprNom_Sel ;
      AV109Tempreswwds_6_tfemprdir = AV52TFEmprDir ;
      AV110Tempreswwds_7_tfemprdir_sel = AV53TFEmprDir_Sel ;
      AV111Tempreswwds_8_tfemprcpo = AV54TFEmprCpo ;
      AV112Tempreswwds_9_tfemprcpo_sel = AV55TFEmprCpo_Sel ;
      AV113Tempreswwds_10_tfemprpob = AV56TFEmprPob ;
      AV114Tempreswwds_11_tfemprpob_sel = AV57TFEmprPob_Sel ;
      AV115Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV116Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV117Tempreswwds_14_tfemprtel = AV60TFEmprTel ;
      AV118Tempreswwds_15_tfemprtel_sel = AV61TFEmprTel_Sel ;
      AV119Tempreswwds_16_tfemprfax = AV62TFEmprFax ;
      AV120Tempreswwds_17_tfemprfax_sel = AV63TFEmprFax_Sel ;
      AV121Tempreswwds_18_tfivacod = AV64TFIvaCod ;
      AV122Tempreswwds_19_tfivacod_sel = AV65TFIvaCod_Sel ;
      AV123Tempreswwds_20_tfivadsc = AV66TFIvaDsc ;
      AV124Tempreswwds_21_tfivadsc_sel = AV67TFIvaDsc_Sel ;
      AV125Tempreswwds_22_tfivapor = AV68TFIvaPor ;
      AV126Tempreswwds_23_tfivapor_to = AV69TFIvaPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV104Tempreswwds_1_filterfulltext ,
                                           AV106Tempreswwds_3_tfemprcod_sel ,
                                           AV105Tempreswwds_2_tfemprcod ,
                                           AV108Tempreswwds_5_tfemprnom_sel ,
                                           AV107Tempreswwds_4_tfemprnom ,
                                           AV110Tempreswwds_7_tfemprdir_sel ,
                                           AV109Tempreswwds_6_tfemprdir ,
                                           AV112Tempreswwds_9_tfemprcpo_sel ,
                                           AV111Tempreswwds_8_tfemprcpo ,
                                           AV114Tempreswwds_11_tfemprpob_sel ,
                                           AV113Tempreswwds_10_tfemprpob ,
                                           AV116Tempreswwds_13_tfemprcif_sel ,
                                           AV115Tempreswwds_12_tfemprcif ,
                                           AV118Tempreswwds_15_tfemprtel_sel ,
                                           AV117Tempreswwds_14_tfemprtel ,
                                           AV120Tempreswwds_17_tfemprfax_sel ,
                                           AV119Tempreswwds_16_tfemprfax ,
                                           AV122Tempreswwds_19_tfivacod_sel ,
                                           AV121Tempreswwds_18_tfivacod ,
                                           AV124Tempreswwds_21_tfivadsc_sel ,
                                           AV123Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV125Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV126Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV104Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Tempreswwds_1_filterfulltext), "%", "") ;
      lV105Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV105Tempreswwds_2_tfemprcod), 3, "%") ;
      lV107Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV107Tempreswwds_4_tfemprnom), 30, "%") ;
      lV109Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV109Tempreswwds_6_tfemprdir), 35, "%") ;
      lV111Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV111Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV113Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV113Tempreswwds_10_tfemprpob), 35, "%") ;
      lV115Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV115Tempreswwds_12_tfemprcif), 15, "%") ;
      lV117Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV117Tempreswwds_14_tfemprtel), 15, "%") ;
      lV119Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV119Tempreswwds_16_tfemprfax), 15, "%") ;
      lV121Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV121Tempreswwds_18_tfivacod), 3, "%") ;
      lV123Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV123Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OX2 */
      pr_default.execute(0, new Object[] {lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV104Tempreswwds_1_filterfulltext, lV105Tempreswwds_2_tfemprcod, AV106Tempreswwds_3_tfemprcod_sel, lV107Tempreswwds_4_tfemprnom, AV108Tempreswwds_5_tfemprnom_sel, lV109Tempreswwds_6_tfemprdir, AV110Tempreswwds_7_tfemprdir_sel, lV111Tempreswwds_8_tfemprcpo, AV112Tempreswwds_9_tfemprcpo_sel, lV113Tempreswwds_10_tfemprpob, AV114Tempreswwds_11_tfemprpob_sel, lV115Tempreswwds_12_tfemprcif, AV116Tempreswwds_13_tfemprcif_sel, lV117Tempreswwds_14_tfemprtel, AV118Tempreswwds_15_tfemprtel_sel, lV119Tempreswwds_16_tfemprfax, AV120Tempreswwds_17_tfemprfax_sel, lV121Tempreswwds_18_tfivacod, AV122Tempreswwds_19_tfivacod_sel, lV123Tempreswwds_20_tfivadsc, AV124Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV125Tempreswwds_22_tfivapor), Byte.valueOf(AV126Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A588IvaPor = P08OX2_A588IvaPor[0] ;
         n588IvaPor = P08OX2_n588IvaPor[0] ;
         A954IvaDsc = P08OX2_A954IvaDsc[0] ;
         n954IvaDsc = P08OX2_n954IvaDsc[0] ;
         A953IvaCod = P08OX2_A953IvaCod[0] ;
         n953IvaCod = P08OX2_n953IvaCod[0] ;
         A405EmprFax = P08OX2_A405EmprFax[0] ;
         n405EmprFax = P08OX2_n405EmprFax[0] ;
         A409EmprTel = P08OX2_A409EmprTel[0] ;
         n409EmprTel = P08OX2_n409EmprTel[0] ;
         A395EmprCif = P08OX2_A395EmprCif[0] ;
         n395EmprCif = P08OX2_n395EmprCif[0] ;
         A408EmprPob = P08OX2_A408EmprPob[0] ;
         n408EmprPob = P08OX2_n408EmprPob[0] ;
         A403EmprCpo = P08OX2_A403EmprCpo[0] ;
         n403EmprCpo = P08OX2_n403EmprCpo[0] ;
         A404EmprDir = P08OX2_A404EmprDir[0] ;
         n404EmprDir = P08OX2_n404EmprDir[0] ;
         A407EmprNom = P08OX2_A407EmprNom[0] ;
         n407EmprNom = P08OX2_n407EmprNom[0] ;
         A396EmprCod = P08OX2_A396EmprCod[0] ;
         A588IvaPor = P08OX2_A588IvaPor[0] ;
         n588IvaPor = P08OX2_n588IvaPor[0] ;
         A954IvaDsc = P08OX2_A954IvaDsc[0] ;
         n954IvaDsc = P08OX2_n954IvaDsc[0] ;
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
         AV45VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A407EmprNom, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A404EmprDir, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A403EmprCpo, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A408EmprPob, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A395EmprCif, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A409EmprTel, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A405EmprFax, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A953IvaCod, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A954IvaDsc, GXv_char5) ;
            tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A588IvaPor );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
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
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Empresa", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprNom", "", "Nombre", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprDir", "", "Dirección", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCpo", "", "Código Postal", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprPob", "", "Población", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCif", "", "CIF", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprTel", "", "Teléfono", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprFax", "", "Fax", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IvaCod", "", "Codigo IVA", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IvaDsc", "", "Descripcion IVA", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IvaPor", "", "IVA General", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TEMPRESWWColumnsSelector", GXv_char5) ;
      tempreswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("TEMPRESWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEMPRESWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TEMPRESWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV127GXV2 = 1 ;
      while ( AV127GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV127GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV99FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV48TFEmprCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV49TFEmprCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV50TFEmprNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV51TFEmprNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR") == 0 )
         {
            AV52TFEmprDir = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR_SEL") == 0 )
         {
            AV53TFEmprDir_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO") == 0 )
         {
            AV54TFEmprCpo = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO_SEL") == 0 )
         {
            AV55TFEmprCpo_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB") == 0 )
         {
            AV56TFEmprPob = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB_SEL") == 0 )
         {
            AV57TFEmprPob_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF") == 0 )
         {
            AV58TFEmprCif = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF_SEL") == 0 )
         {
            AV59TFEmprCif_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL") == 0 )
         {
            AV60TFEmprTel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL_SEL") == 0 )
         {
            AV61TFEmprTel_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX") == 0 )
         {
            AV62TFEmprFax = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX_SEL") == 0 )
         {
            AV63TFEmprFax_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD") == 0 )
         {
            AV64TFIvaCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD_SEL") == 0 )
         {
            AV65TFIvaCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC") == 0 )
         {
            AV66TFIvaDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC_SEL") == 0 )
         {
            AV67TFIvaDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVAPOR") == 0 )
         {
            AV68TFIvaPor = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFIvaPor_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV127GXV2 = (int)(AV127GXV2+1) ;
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
      this.aP0[0] = tempreswwexport.this.AV11Filename;
      this.aP1[0] = tempreswwexport.this.AV12ErrorMessage;
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
      AV99FilterFullText = "" ;
      AV49TFEmprCod_Sel = "" ;
      AV48TFEmprCod = "" ;
      AV51TFEmprNom_Sel = "" ;
      AV50TFEmprNom = "" ;
      AV53TFEmprDir_Sel = "" ;
      AV52TFEmprDir = "" ;
      AV55TFEmprCpo_Sel = "" ;
      AV54TFEmprCpo = "" ;
      AV57TFEmprPob_Sel = "" ;
      AV56TFEmprPob = "" ;
      AV59TFEmprCif_Sel = "" ;
      AV58TFEmprCif = "" ;
      AV61TFEmprTel_Sel = "" ;
      AV60TFEmprTel = "" ;
      AV63TFEmprFax_Sel = "" ;
      AV62TFEmprFax = "" ;
      AV65TFIvaCod_Sel = "" ;
      AV64TFIvaCod = "" ;
      AV67TFIvaDsc_Sel = "" ;
      AV66TFIvaDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      A395EmprCif = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A953IvaCod = "" ;
      A954IvaDsc = "" ;
      AV104Tempreswwds_1_filterfulltext = "" ;
      AV105Tempreswwds_2_tfemprcod = "" ;
      AV106Tempreswwds_3_tfemprcod_sel = "" ;
      AV107Tempreswwds_4_tfemprnom = "" ;
      AV108Tempreswwds_5_tfemprnom_sel = "" ;
      AV109Tempreswwds_6_tfemprdir = "" ;
      AV110Tempreswwds_7_tfemprdir_sel = "" ;
      AV111Tempreswwds_8_tfemprcpo = "" ;
      AV112Tempreswwds_9_tfemprcpo_sel = "" ;
      AV113Tempreswwds_10_tfemprpob = "" ;
      AV114Tempreswwds_11_tfemprpob_sel = "" ;
      AV115Tempreswwds_12_tfemprcif = "" ;
      AV116Tempreswwds_13_tfemprcif_sel = "" ;
      AV117Tempreswwds_14_tfemprtel = "" ;
      AV118Tempreswwds_15_tfemprtel_sel = "" ;
      AV119Tempreswwds_16_tfemprfax = "" ;
      AV120Tempreswwds_17_tfemprfax_sel = "" ;
      AV121Tempreswwds_18_tfivacod = "" ;
      AV122Tempreswwds_19_tfivacod_sel = "" ;
      AV123Tempreswwds_20_tfivadsc = "" ;
      AV124Tempreswwds_21_tfivadsc_sel = "" ;
      scmdbuf = "" ;
      lV104Tempreswwds_1_filterfulltext = "" ;
      lV105Tempreswwds_2_tfemprcod = "" ;
      lV107Tempreswwds_4_tfemprnom = "" ;
      lV109Tempreswwds_6_tfemprdir = "" ;
      lV111Tempreswwds_8_tfemprcpo = "" ;
      lV113Tempreswwds_10_tfemprpob = "" ;
      lV115Tempreswwds_12_tfemprcif = "" ;
      lV117Tempreswwds_14_tfemprtel = "" ;
      lV119Tempreswwds_16_tfemprfax = "" ;
      lV121Tempreswwds_18_tfivacod = "" ;
      lV123Tempreswwds_20_tfivadsc = "" ;
      P08OX2_A588IvaPor = new byte[1] ;
      P08OX2_n588IvaPor = new boolean[] {false} ;
      P08OX2_A954IvaDsc = new String[] {""} ;
      P08OX2_n954IvaDsc = new boolean[] {false} ;
      P08OX2_A953IvaCod = new String[] {""} ;
      P08OX2_n953IvaCod = new boolean[] {false} ;
      P08OX2_A405EmprFax = new String[] {""} ;
      P08OX2_n405EmprFax = new boolean[] {false} ;
      P08OX2_A409EmprTel = new String[] {""} ;
      P08OX2_n409EmprTel = new boolean[] {false} ;
      P08OX2_A395EmprCif = new String[] {""} ;
      P08OX2_n395EmprCif = new boolean[] {false} ;
      P08OX2_A408EmprPob = new String[] {""} ;
      P08OX2_n408EmprPob = new boolean[] {false} ;
      P08OX2_A403EmprCpo = new String[] {""} ;
      P08OX2_n403EmprCpo = new boolean[] {false} ;
      P08OX2_A404EmprDir = new String[] {""} ;
      P08OX2_n404EmprDir = new boolean[] {false} ;
      P08OX2_A407EmprNom = new String[] {""} ;
      P08OX2_n407EmprNom = new boolean[] {false} ;
      P08OX2_A396EmprCod = new String[] {""} ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempreswwexport__default(),
         new Object[] {
             new Object[] {
            P08OX2_A588IvaPor, P08OX2_n588IvaPor, P08OX2_A954IvaDsc, P08OX2_n954IvaDsc, P08OX2_A953IvaCod, P08OX2_n953IvaCod, P08OX2_A405EmprFax, P08OX2_n405EmprFax, P08OX2_A409EmprTel, P08OX2_n409EmprTel,
            P08OX2_A395EmprCif, P08OX2_n395EmprCif, P08OX2_A408EmprPob, P08OX2_n408EmprPob, P08OX2_A403EmprCpo, P08OX2_n403EmprCpo, P08OX2_A404EmprDir, P08OX2_n404EmprDir, P08OX2_A407EmprNom, P08OX2_n407EmprNom,
            P08OX2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV68TFIvaPor ;
   private byte AV69TFIvaPor_To ;
   private byte A588IvaPor ;
   private byte AV125Tempreswwds_22_tfivapor ;
   private byte AV126Tempreswwds_23_tfivapor_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV102GXV1 ;
   private int AV127GXV2 ;
   private long AV45VisibleColumnCount ;
   private String AV49TFEmprCod_Sel ;
   private String AV48TFEmprCod ;
   private String AV51TFEmprNom_Sel ;
   private String AV50TFEmprNom ;
   private String AV53TFEmprDir_Sel ;
   private String AV52TFEmprDir ;
   private String AV55TFEmprCpo_Sel ;
   private String AV54TFEmprCpo ;
   private String AV57TFEmprPob_Sel ;
   private String AV56TFEmprPob ;
   private String AV59TFEmprCif_Sel ;
   private String AV58TFEmprCif ;
   private String AV61TFEmprTel_Sel ;
   private String AV60TFEmprTel ;
   private String AV63TFEmprFax_Sel ;
   private String AV62TFEmprFax ;
   private String AV65TFIvaCod_Sel ;
   private String AV64TFIvaCod ;
   private String AV67TFIvaDsc_Sel ;
   private String AV66TFIvaDsc ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String A395EmprCif ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A953IvaCod ;
   private String A954IvaDsc ;
   private String AV105Tempreswwds_2_tfemprcod ;
   private String AV106Tempreswwds_3_tfemprcod_sel ;
   private String AV107Tempreswwds_4_tfemprnom ;
   private String AV108Tempreswwds_5_tfemprnom_sel ;
   private String AV109Tempreswwds_6_tfemprdir ;
   private String AV110Tempreswwds_7_tfemprdir_sel ;
   private String AV111Tempreswwds_8_tfemprcpo ;
   private String AV112Tempreswwds_9_tfemprcpo_sel ;
   private String AV113Tempreswwds_10_tfemprpob ;
   private String AV114Tempreswwds_11_tfemprpob_sel ;
   private String AV115Tempreswwds_12_tfemprcif ;
   private String AV116Tempreswwds_13_tfemprcif_sel ;
   private String AV117Tempreswwds_14_tfemprtel ;
   private String AV118Tempreswwds_15_tfemprtel_sel ;
   private String AV119Tempreswwds_16_tfemprfax ;
   private String AV120Tempreswwds_17_tfemprfax_sel ;
   private String AV121Tempreswwds_18_tfivacod ;
   private String AV122Tempreswwds_19_tfivacod_sel ;
   private String AV123Tempreswwds_20_tfivadsc ;
   private String AV124Tempreswwds_21_tfivadsc_sel ;
   private String scmdbuf ;
   private String lV105Tempreswwds_2_tfemprcod ;
   private String lV107Tempreswwds_4_tfemprnom ;
   private String lV109Tempreswwds_6_tfemprdir ;
   private String lV111Tempreswwds_8_tfemprcpo ;
   private String lV113Tempreswwds_10_tfemprpob ;
   private String lV115Tempreswwds_12_tfemprcif ;
   private String lV117Tempreswwds_14_tfemprtel ;
   private String lV119Tempreswwds_16_tfemprfax ;
   private String lV121Tempreswwds_18_tfivacod ;
   private String lV123Tempreswwds_20_tfivadsc ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n588IvaPor ;
   private boolean n954IvaDsc ;
   private boolean n953IvaCod ;
   private boolean n405EmprFax ;
   private boolean n409EmprTel ;
   private boolean n395EmprCif ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV99FilterFullText ;
   private String AV104Tempreswwds_1_filterfulltext ;
   private String lV104Tempreswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08OX2_A588IvaPor ;
   private boolean[] P08OX2_n588IvaPor ;
   private String[] P08OX2_A954IvaDsc ;
   private boolean[] P08OX2_n954IvaDsc ;
   private String[] P08OX2_A953IvaCod ;
   private boolean[] P08OX2_n953IvaCod ;
   private String[] P08OX2_A405EmprFax ;
   private boolean[] P08OX2_n405EmprFax ;
   private String[] P08OX2_A409EmprTel ;
   private boolean[] P08OX2_n409EmprTel ;
   private String[] P08OX2_A395EmprCif ;
   private boolean[] P08OX2_n395EmprCif ;
   private String[] P08OX2_A408EmprPob ;
   private boolean[] P08OX2_n408EmprPob ;
   private String[] P08OX2_A403EmprCpo ;
   private boolean[] P08OX2_n403EmprCpo ;
   private String[] P08OX2_A404EmprDir ;
   private boolean[] P08OX2_n404EmprDir ;
   private String[] P08OX2_A407EmprNom ;
   private boolean[] P08OX2_n407EmprNom ;
   private String[] P08OX2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class tempreswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV104Tempreswwds_1_filterfulltext ,
                                          String AV106Tempreswwds_3_tfemprcod_sel ,
                                          String AV105Tempreswwds_2_tfemprcod ,
                                          String AV108Tempreswwds_5_tfemprnom_sel ,
                                          String AV107Tempreswwds_4_tfemprnom ,
                                          String AV110Tempreswwds_7_tfemprdir_sel ,
                                          String AV109Tempreswwds_6_tfemprdir ,
                                          String AV112Tempreswwds_9_tfemprcpo_sel ,
                                          String AV111Tempreswwds_8_tfemprcpo ,
                                          String AV114Tempreswwds_11_tfemprpob_sel ,
                                          String AV113Tempreswwds_10_tfemprpob ,
                                          String AV116Tempreswwds_13_tfemprcif_sel ,
                                          String AV115Tempreswwds_12_tfemprcif ,
                                          String AV118Tempreswwds_15_tfemprtel_sel ,
                                          String AV117Tempreswwds_14_tfemprtel ,
                                          String AV120Tempreswwds_17_tfemprfax_sel ,
                                          String AV119Tempreswwds_16_tfemprfax ,
                                          String AV122Tempreswwds_19_tfivacod_sel ,
                                          String AV121Tempreswwds_18_tfivacod ,
                                          String AV124Tempreswwds_21_tfivadsc_sel ,
                                          String AV123Tempreswwds_20_tfivadsc ,
                                          byte AV125Tempreswwds_22_tfivapor ,
                                          byte AV126Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV104Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV106Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV105Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV109Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV111Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV113Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV115Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV117Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV119Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV121Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV125Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV126Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprNom DESC" ;
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
         scmdbuf += " ORDER BY T1.EmprDir" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprDir DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCpo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCpo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprPob" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprPob DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCif" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCif DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprTel" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprTel DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprFax" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprFax DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IvaCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IvaCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IvaDsc" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IvaDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IvaPor" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IvaPor DESC" ;
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
                  return conditional_P08OX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

