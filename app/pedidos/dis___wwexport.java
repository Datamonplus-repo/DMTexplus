package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis___wwexport extends GXProcedure
{
   public dis___wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis___wwexport.class ), "" );
   }

   public dis___wwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String[] aP5 )
   {
      dis___wwexport.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      dis___wwexport.this.AV85DisCod = aP0;
      dis___wwexport.this.AV86DisFeccliFrom = aP1;
      dis___wwexport.this.AV87DisFecclito = aP2;
      dis___wwexport.this.AV83DisFecFrom = aP3;
      dis___wwexport.this.AV84DisFecto = aP4;
      dis___wwexport.this.aP5 = aP5;
      dis___wwexport.this.aP6 = aP6;
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
      AV11Filename = "./PrivateTempStorage/" + "Dis___WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV38TFDisUsrCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFDisUsrCod_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFDisUsrCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFDisUsrCod, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV40TFDisEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV80i = 1 ;
         AV90GXV1 = 1 ;
         while ( AV90GXV1 <= AV40TFDisEst_Sels.size() )
         {
            AV41TFDisEst_Sel = ((Number) AV40TFDisEst_Sels.elementAt(-1+AV90GXV1)).byteValue() ;
            if ( AV80i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV41TFDisEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Pedido", "") );
            }
            else if ( AV41TFDisEst_Sel == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Produccion", "") );
            }
            AV80i = (long)(AV80i+1) ;
            AV90GXV1 = (int)(AV90GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFDisCliNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFDisCliNum_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFDisCliNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFDisCliNum, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFDisEncCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFDisEncCli_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFDisEncCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFDisEncCli, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFDisFecEnt)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFDisFecEnt_To)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Data entr.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV52TFDisFecEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV53TFDisFecEnt_To );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV54TFCliCod) && (0==AV55TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFCliNom_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFCliNom, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFDisArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFDisArtCod_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFDisArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFDisArtCod, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFDisArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFDisArtDsc_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFDisArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFDisArtDsc, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFDisColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFDisColNom_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFDisColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFDisColNom, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV64TFDisColNum) && (0==AV65TFDisColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cor. Núm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV64TFDisColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV65TFDisColNum_To );
      }
      if ( ! ( (0==AV66TFDisTipCol) && (0==AV67TFDisTipCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV66TFDisTipCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV67TFDisTipCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV69TFDisNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFDisNomCli_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFDisNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFDisNomCli, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV70TFDisNumCli) && (0==AV71TFDisNumCli_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV70TFDisNumCli );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV71TFDisNumCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV73TFMaqCodDis_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFMaqCodDis_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV72TFMaqCodDis)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFMaqCodDis, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFDisNumUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFDisNumUni_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76TFDisNumUni)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77TFDisNumUni_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV79TFDisUniMed_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFDisUniMed_Sel, GXv_char5) ;
         dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV78TFDisUniMed)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFDisUniMed, GXv_char5) ;
            dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV74TFDisNumPie) && (0==AV75TFDisNumPie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV74TFDisNumPie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis___wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV75TFDisNumPie_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis___WWColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV19Session.getValue("Pedidos.Dis___WWColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV91GXV2 = 1 ;
      while ( AV91GXV2 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV91GXV2));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV91GXV2 = (int)(AV91GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV93Pedidos_dis___wwds_1_filterfulltext = AV18FilterFullText ;
      AV94Pedidos_dis___wwds_2_tfdisusrcod = AV37TFDisUsrCod ;
      AV95Pedidos_dis___wwds_3_tfdisusrcod_sel = AV38TFDisUsrCod_Sel ;
      AV96Pedidos_dis___wwds_4_tfdisest_sels = AV40TFDisEst_Sels ;
      AV97Pedidos_dis___wwds_5_tfdisclinum = AV42TFDisCliNum ;
      AV98Pedidos_dis___wwds_6_tfdisclinum_sel = AV43TFDisCliNum_Sel ;
      AV99Pedidos_dis___wwds_7_tfdisenccli = AV44TFDisEncCli ;
      AV100Pedidos_dis___wwds_8_tfdisenccli_sel = AV45TFDisEncCli_Sel ;
      AV101Pedidos_dis___wwds_9_tfdisfecent = AV52TFDisFecEnt ;
      AV102Pedidos_dis___wwds_10_tfdisfecent_to = AV53TFDisFecEnt_To ;
      AV103Pedidos_dis___wwds_11_tfclicod = AV54TFCliCod ;
      AV104Pedidos_dis___wwds_12_tfclicod_to = AV55TFCliCod_To ;
      AV105Pedidos_dis___wwds_13_tfclinom = AV56TFCliNom ;
      AV106Pedidos_dis___wwds_14_tfclinom_sel = AV57TFCliNom_Sel ;
      AV107Pedidos_dis___wwds_15_tfdisartcod = AV58TFDisArtCod ;
      AV108Pedidos_dis___wwds_16_tfdisartcod_sel = AV59TFDisArtCod_Sel ;
      AV109Pedidos_dis___wwds_17_tfdisartdsc = AV60TFDisArtDsc ;
      AV110Pedidos_dis___wwds_18_tfdisartdsc_sel = AV61TFDisArtDsc_Sel ;
      AV111Pedidos_dis___wwds_19_tfdiscolnom = AV62TFDisColNom ;
      AV112Pedidos_dis___wwds_20_tfdiscolnom_sel = AV63TFDisColNom_Sel ;
      AV113Pedidos_dis___wwds_21_tfdiscolnum = AV64TFDisColNum ;
      AV114Pedidos_dis___wwds_22_tfdiscolnum_to = AV65TFDisColNum_To ;
      AV115Pedidos_dis___wwds_23_tfdistipcol = AV66TFDisTipCol ;
      AV116Pedidos_dis___wwds_24_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV117Pedidos_dis___wwds_25_tfdisnomcli = AV68TFDisNomCli ;
      AV118Pedidos_dis___wwds_26_tfdisnomcli_sel = AV69TFDisNomCli_Sel ;
      AV119Pedidos_dis___wwds_27_tfdisnumcli = AV70TFDisNumCli ;
      AV120Pedidos_dis___wwds_28_tfdisnumcli_to = AV71TFDisNumCli_To ;
      AV121Pedidos_dis___wwds_29_tfmaqcoddis = AV72TFMaqCodDis ;
      AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV73TFMaqCodDis_Sel ;
      AV123Pedidos_dis___wwds_31_tfdisnumuni = AV76TFDisNumUni ;
      AV124Pedidos_dis___wwds_32_tfdisnumuni_to = AV77TFDisNumUni_To ;
      AV125Pedidos_dis___wwds_33_tfdisunimed = AV78TFDisUniMed ;
      AV126Pedidos_dis___wwds_34_tfdisunimed_sel = AV79TFDisUniMed_Sel ;
      AV127Pedidos_dis___wwds_35_tfdisnumpie = AV74TFDisNumPie ;
      AV128Pedidos_dis___wwds_36_tfdisnumpie_to = AV75TFDisNumPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV96Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV95Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV94Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV96Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV98Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV97Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV100Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV99Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV101Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV102Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV104Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV106Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV105Pedidos_dis___wwds_13_tfclinom ,
                                           AV108Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV107Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV110Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV109Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV112Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV111Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV113Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV114Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV115Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV116Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV118Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV117Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV119Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV120Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV121Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV123Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV124Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV126Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV125Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV127Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV128Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV85DisCod) ,
                                           AV83DisFecFrom ,
                                           AV84DisFecto ,
                                           AV86DisFeccliFrom ,
                                           AV87DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV93Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV94Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV97Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV97Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV99Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV99Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV105Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV105Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV107Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV107Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV109Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV109Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV111Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV111Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV117Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV117Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV121Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV121Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV125Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV125Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1Y2 */
      pr_default.execute(0, new Object[] {lV94Pedidos_dis___wwds_2_tfdisusrcod, AV95Pedidos_dis___wwds_3_tfdisusrcod_sel, lV97Pedidos_dis___wwds_5_tfdisclinum, AV98Pedidos_dis___wwds_6_tfdisclinum_sel, lV99Pedidos_dis___wwds_7_tfdisenccli, AV100Pedidos_dis___wwds_8_tfdisenccli_sel, AV101Pedidos_dis___wwds_9_tfdisfecent, AV102Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV103Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV104Pedidos_dis___wwds_12_tfclicod_to), lV105Pedidos_dis___wwds_13_tfclinom, AV106Pedidos_dis___wwds_14_tfclinom_sel, lV107Pedidos_dis___wwds_15_tfdisartcod, AV108Pedidos_dis___wwds_16_tfdisartcod_sel, lV109Pedidos_dis___wwds_17_tfdisartdsc, AV110Pedidos_dis___wwds_18_tfdisartdsc_sel, lV111Pedidos_dis___wwds_19_tfdiscolnom, AV112Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV113Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV114Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV115Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV116Pedidos_dis___wwds_24_tfdistipcol_to), lV117Pedidos_dis___wwds_25_tfdisnomcli, AV118Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV119Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV120Pedidos_dis___wwds_28_tfdisnumcli_to), lV121Pedidos_dis___wwds_29_tfmaqcoddis, AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV123Pedidos_dis___wwds_31_tfdisnumuni, AV124Pedidos_dis___wwds_32_tfdisnumuni_to, lV125Pedidos_dis___wwds_33_tfdisunimed, AV126Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV127Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV128Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV85DisCod), AV83DisFecFrom, AV84DisFecto, AV86DisFeccliFrom, AV87DisFecclito});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A370DisFecCli = P0A1Y2_A370DisFecCli[0] ;
         A369DisFec = P0A1Y2_A369DisFec[0] ;
         A361DisCod = P0A1Y2_A361DisCod[0] ;
         A374DisNumPie = P0A1Y2_A374DisNumPie[0] ;
         A392DisUniMed = P0A1Y2_A392DisUniMed[0] ;
         A375DisNumUni = P0A1Y2_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1Y2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1Y2_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1Y2_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1Y2_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1Y2_A390DisTipCol[0] ;
         n390DisTipCol = P0A1Y2_n390DisTipCol[0] ;
         A363DisColNum = P0A1Y2_A363DisColNum[0] ;
         n363DisColNum = P0A1Y2_n363DisColNum[0] ;
         A362DisColNom = P0A1Y2_A362DisColNom[0] ;
         n362DisColNom = P0A1Y2_n362DisColNom[0] ;
         A337DisArtDsc = P0A1Y2_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1Y2_A335DisArtCod[0] ;
         A279CliNom = P0A1Y2_A279CliNom[0] ;
         A252CliCod = P0A1Y2_A252CliCod[0] ;
         A371DisFecEnt = P0A1Y2_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1Y2_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1Y2_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1Y2_A4348DisUsrCod[0] ;
         A367DisEst = P0A1Y2_A367DisEst[0] ;
         A396EmprCod = P0A1Y2_A396EmprCod[0] ;
         A279CliNom = P0A1Y2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV93Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV93Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV93Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
            AV34VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4348DisUsrCod, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( "" );
               if ( A367DisEst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Pedido", "") );
               }
               else if ( A367DisEst == 3 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Produccion", "") );
               }
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A360DisCliNum, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4813DisEncCli, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A361DisCod );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A370DisFecCli );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A369DisFec );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A371DisFecEnt );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A335DisArtCod, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A337DisArtDsc, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A362DisColNom, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A363DisColNum );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A390DisTipCol );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1195DisNomCli, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A1196DisNumCli );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1122MaqCodDis, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A375DisNumUni)) );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A392DisUniMed, GXv_char5) ;
               dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A374DisNumPie );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisUsrCod", "", "Usuario", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisEst", "", "Estado", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisCliNum", "", "Ped. Cli.", true, "") ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisEncCli", "", "Ped. Cli.", true, "") ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisCod", "", "Nr.Enc", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFecCli", "", "Data ped.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFec", "", "Data reg.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFecEnt", "", "Data entr.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisArtCod", "", "Artigo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisArtDsc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisColNom", "", "Cor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisColNum", "", "Cor. Núm", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisTipCol", "", "TC", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNomCli", "", "Color Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNumCli", "", "Numero", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCodDis", "", "Maquina", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNumUni", "", "Unidades", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisUniMed", "", "Und.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNumPie", "", "Piezas", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis___WWColumnsSelector", GXv_char5) ;
      dis___wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis___WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis___WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Pedidos.Dis___WWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV129GXV3 = 1 ;
      while ( AV129GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV129GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV37TFDisUsrCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV38TFDisUsrCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV39TFDisEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV40TFDisEst_Sels.fromJSonString(AV39TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV42TFDisCliNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV43TFDisCliNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV44TFDisEncCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV45TFDisEncCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV52TFDisFecEnt = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV53TFDisFecEnt_To = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV54TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV56TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV57TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV58TFDisArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV59TFDisArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV60TFDisArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV61TFDisArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV62TFDisColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV63TFDisColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV64TFDisColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFDisColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV66TFDisTipCol = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFDisTipCol_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV68TFDisNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV69TFDisNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV70TFDisNumCli = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFDisNumCli_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV72TFMaqCodDis = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV73TFMaqCodDis_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV76TFDisNumUni = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFDisNumUni_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV78TFDisUniMed = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV79TFDisUniMed_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV74TFDisNumPie = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFDisNumPie_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV129GXV3 = (int)(AV129GXV3+1) ;
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
      this.aP5[0] = dis___wwexport.this.AV11Filename;
      this.aP6[0] = dis___wwexport.this.AV12ErrorMessage;
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
      AV38TFDisUsrCod_Sel = "" ;
      AV37TFDisUsrCod = "" ;
      AV40TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV43TFDisCliNum_Sel = "" ;
      AV42TFDisCliNum = "" ;
      AV45TFDisEncCli_Sel = "" ;
      AV44TFDisEncCli = "" ;
      AV52TFDisFecEnt = GXutil.nullDate() ;
      AV53TFDisFecEnt_To = GXutil.nullDate() ;
      AV57TFCliNom_Sel = "" ;
      AV56TFCliNom = "" ;
      AV59TFDisArtCod_Sel = "" ;
      AV58TFDisArtCod = "" ;
      AV61TFDisArtDsc_Sel = "" ;
      AV60TFDisArtDsc = "" ;
      AV63TFDisColNom_Sel = "" ;
      AV62TFDisColNom = "" ;
      AV69TFDisNomCli_Sel = "" ;
      AV68TFDisNomCli = "" ;
      AV73TFMaqCodDis_Sel = "" ;
      AV72TFMaqCodDis = "" ;
      AV76TFDisNumUni = DecimalUtil.ZERO ;
      AV77TFDisNumUni_To = DecimalUtil.ZERO ;
      AV79TFDisUniMed_Sel = "" ;
      AV78TFDisUniMed = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A396EmprCod = "" ;
      AV19Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4348DisUsrCod = "" ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1122MaqCodDis = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      AV93Pedidos_dis___wwds_1_filterfulltext = "" ;
      AV94Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      AV95Pedidos_dis___wwds_3_tfdisusrcod_sel = "" ;
      AV96Pedidos_dis___wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV97Pedidos_dis___wwds_5_tfdisclinum = "" ;
      AV98Pedidos_dis___wwds_6_tfdisclinum_sel = "" ;
      AV99Pedidos_dis___wwds_7_tfdisenccli = "" ;
      AV100Pedidos_dis___wwds_8_tfdisenccli_sel = "" ;
      AV101Pedidos_dis___wwds_9_tfdisfecent = GXutil.nullDate() ;
      AV102Pedidos_dis___wwds_10_tfdisfecent_to = GXutil.nullDate() ;
      AV105Pedidos_dis___wwds_13_tfclinom = "" ;
      AV106Pedidos_dis___wwds_14_tfclinom_sel = "" ;
      AV107Pedidos_dis___wwds_15_tfdisartcod = "" ;
      AV108Pedidos_dis___wwds_16_tfdisartcod_sel = "" ;
      AV109Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      AV110Pedidos_dis___wwds_18_tfdisartdsc_sel = "" ;
      AV111Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      AV112Pedidos_dis___wwds_20_tfdiscolnom_sel = "" ;
      AV117Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      AV118Pedidos_dis___wwds_26_tfdisnomcli_sel = "" ;
      AV121Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel = "" ;
      AV123Pedidos_dis___wwds_31_tfdisnumuni = DecimalUtil.ZERO ;
      AV124Pedidos_dis___wwds_32_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV125Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV126Pedidos_dis___wwds_34_tfdisunimed_sel = "" ;
      lV93Pedidos_dis___wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV94Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      lV97Pedidos_dis___wwds_5_tfdisclinum = "" ;
      lV99Pedidos_dis___wwds_7_tfdisenccli = "" ;
      lV105Pedidos_dis___wwds_13_tfclinom = "" ;
      lV107Pedidos_dis___wwds_15_tfdisartcod = "" ;
      lV109Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      lV111Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      lV117Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      lV121Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      lV125Pedidos_dis___wwds_33_tfdisunimed = "" ;
      P0A1Y2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1Y2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1Y2_A361DisCod = new int[1] ;
      P0A1Y2_A374DisNumPie = new short[1] ;
      P0A1Y2_A392DisUniMed = new String[] {""} ;
      P0A1Y2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1Y2_A1122MaqCodDis = new String[] {""} ;
      P0A1Y2_n1122MaqCodDis = new boolean[] {false} ;
      P0A1Y2_A1196DisNumCli = new int[1] ;
      P0A1Y2_A1195DisNomCli = new String[] {""} ;
      P0A1Y2_A390DisTipCol = new byte[1] ;
      P0A1Y2_n390DisTipCol = new boolean[] {false} ;
      P0A1Y2_A363DisColNum = new int[1] ;
      P0A1Y2_n363DisColNum = new boolean[] {false} ;
      P0A1Y2_A362DisColNom = new String[] {""} ;
      P0A1Y2_n362DisColNom = new boolean[] {false} ;
      P0A1Y2_A337DisArtDsc = new String[] {""} ;
      P0A1Y2_A335DisArtCod = new String[] {""} ;
      P0A1Y2_A279CliNom = new String[] {""} ;
      P0A1Y2_A252CliCod = new int[1] ;
      P0A1Y2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1Y2_A4813DisEncCli = new String[] {""} ;
      P0A1Y2_A360DisCliNum = new String[] {""} ;
      P0A1Y2_A4348DisUsrCod = new String[] {""} ;
      P0A1Y2_A367DisEst = new byte[1] ;
      P0A1Y2_A396EmprCod = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV39TFDisEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis___wwexport__default(),
         new Object[] {
             new Object[] {
            P0A1Y2_A370DisFecCli, P0A1Y2_A369DisFec, P0A1Y2_A361DisCod, P0A1Y2_A374DisNumPie, P0A1Y2_A392DisUniMed, P0A1Y2_A375DisNumUni, P0A1Y2_A1122MaqCodDis, P0A1Y2_n1122MaqCodDis, P0A1Y2_A1196DisNumCli, P0A1Y2_A1195DisNomCli,
            P0A1Y2_A390DisTipCol, P0A1Y2_n390DisTipCol, P0A1Y2_A363DisColNum, P0A1Y2_n363DisColNum, P0A1Y2_A362DisColNom, P0A1Y2_n362DisColNom, P0A1Y2_A337DisArtDsc, P0A1Y2_A335DisArtCod, P0A1Y2_A279CliNom, P0A1Y2_A252CliCod,
            P0A1Y2_A371DisFecEnt, P0A1Y2_A4813DisEncCli, P0A1Y2_A360DisCliNum, P0A1Y2_A4348DisUsrCod, P0A1Y2_A367DisEst, P0A1Y2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV41TFDisEst_Sel ;
   private byte AV66TFDisTipCol ;
   private byte AV67TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV115Pedidos_dis___wwds_23_tfdistipcol ;
   private byte AV116Pedidos_dis___wwds_24_tfdistipcol_to ;
   private short AV74TFDisNumPie ;
   private short AV75TFDisNumPie_To ;
   private short GXv_int3[] ;
   private short A374DisNumPie ;
   private short AV127Pedidos_dis___wwds_35_tfdisnumpie ;
   private short AV128Pedidos_dis___wwds_36_tfdisnumpie_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV85DisCod ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV90GXV1 ;
   private int AV54TFCliCod ;
   private int AV55TFCliCod_To ;
   private int AV64TFDisColNum ;
   private int AV65TFDisColNum_To ;
   private int AV70TFDisNumCli ;
   private int AV71TFDisNumCli_To ;
   private int AV91GXV2 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int AV103Pedidos_dis___wwds_11_tfclicod ;
   private int AV104Pedidos_dis___wwds_12_tfclicod_to ;
   private int AV113Pedidos_dis___wwds_21_tfdiscolnum ;
   private int AV114Pedidos_dis___wwds_22_tfdiscolnum_to ;
   private int AV119Pedidos_dis___wwds_27_tfdisnumcli ;
   private int AV120Pedidos_dis___wwds_28_tfdisnumcli_to ;
   private int AV96Pedidos_dis___wwds_4_tfdisest_sels_size ;
   private int AV129GXV3 ;
   private long AV80i ;
   private long AV34VisibleColumnCount ;
   private java.math.BigDecimal AV76TFDisNumUni ;
   private java.math.BigDecimal AV77TFDisNumUni_To ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV123Pedidos_dis___wwds_31_tfdisnumuni ;
   private java.math.BigDecimal AV124Pedidos_dis___wwds_32_tfdisnumuni_to ;
   private String AV38TFDisUsrCod_Sel ;
   private String AV37TFDisUsrCod ;
   private String AV43TFDisCliNum_Sel ;
   private String AV42TFDisCliNum ;
   private String AV45TFDisEncCli_Sel ;
   private String AV44TFDisEncCli ;
   private String AV57TFCliNom_Sel ;
   private String AV56TFCliNom ;
   private String AV59TFDisArtCod_Sel ;
   private String AV58TFDisArtCod ;
   private String AV61TFDisArtDsc_Sel ;
   private String AV60TFDisArtDsc ;
   private String AV63TFDisColNom_Sel ;
   private String AV62TFDisColNom ;
   private String AV69TFDisNomCli_Sel ;
   private String AV68TFDisNomCli ;
   private String AV73TFMaqCodDis_Sel ;
   private String AV72TFMaqCodDis ;
   private String AV79TFDisUniMed_Sel ;
   private String AV78TFDisUniMed ;
   private String A396EmprCod ;
   private String A4348DisUsrCod ;
   private String A360DisCliNum ;
   private String A4813DisEncCli ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1122MaqCodDis ;
   private String A392DisUniMed ;
   private String AV94Pedidos_dis___wwds_2_tfdisusrcod ;
   private String AV95Pedidos_dis___wwds_3_tfdisusrcod_sel ;
   private String AV97Pedidos_dis___wwds_5_tfdisclinum ;
   private String AV98Pedidos_dis___wwds_6_tfdisclinum_sel ;
   private String AV99Pedidos_dis___wwds_7_tfdisenccli ;
   private String AV100Pedidos_dis___wwds_8_tfdisenccli_sel ;
   private String AV105Pedidos_dis___wwds_13_tfclinom ;
   private String AV106Pedidos_dis___wwds_14_tfclinom_sel ;
   private String AV107Pedidos_dis___wwds_15_tfdisartcod ;
   private String AV108Pedidos_dis___wwds_16_tfdisartcod_sel ;
   private String AV109Pedidos_dis___wwds_17_tfdisartdsc ;
   private String AV110Pedidos_dis___wwds_18_tfdisartdsc_sel ;
   private String AV111Pedidos_dis___wwds_19_tfdiscolnom ;
   private String AV112Pedidos_dis___wwds_20_tfdiscolnom_sel ;
   private String AV117Pedidos_dis___wwds_25_tfdisnomcli ;
   private String AV118Pedidos_dis___wwds_26_tfdisnomcli_sel ;
   private String AV121Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel ;
   private String AV125Pedidos_dis___wwds_33_tfdisunimed ;
   private String AV126Pedidos_dis___wwds_34_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV94Pedidos_dis___wwds_2_tfdisusrcod ;
   private String lV97Pedidos_dis___wwds_5_tfdisclinum ;
   private String lV99Pedidos_dis___wwds_7_tfdisenccli ;
   private String lV105Pedidos_dis___wwds_13_tfclinom ;
   private String lV107Pedidos_dis___wwds_15_tfdisartcod ;
   private String lV109Pedidos_dis___wwds_17_tfdisartdsc ;
   private String lV111Pedidos_dis___wwds_19_tfdiscolnom ;
   private String lV117Pedidos_dis___wwds_25_tfdisnomcli ;
   private String lV121Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String lV125Pedidos_dis___wwds_33_tfdisunimed ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV86DisFeccliFrom ;
   private java.util.Date AV87DisFecclito ;
   private java.util.Date AV83DisFecFrom ;
   private java.util.Date AV84DisFecto ;
   private java.util.Date AV52TFDisFecEnt ;
   private java.util.Date AV53TFDisFecEnt_To ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV101Pedidos_dis___wwds_9_tfdisfecent ;
   private java.util.Date AV102Pedidos_dis___wwds_10_tfdisfecent_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean Cond_result ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV39TFDisEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV93Pedidos_dis___wwds_1_filterfulltext ;
   private String lV93Pedidos_dis___wwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV40TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV96Pedidos_dis___wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0A1Y2_A370DisFecCli ;
   private java.util.Date[] P0A1Y2_A369DisFec ;
   private int[] P0A1Y2_A361DisCod ;
   private short[] P0A1Y2_A374DisNumPie ;
   private String[] P0A1Y2_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1Y2_A375DisNumUni ;
   private String[] P0A1Y2_A1122MaqCodDis ;
   private boolean[] P0A1Y2_n1122MaqCodDis ;
   private int[] P0A1Y2_A1196DisNumCli ;
   private String[] P0A1Y2_A1195DisNomCli ;
   private byte[] P0A1Y2_A390DisTipCol ;
   private boolean[] P0A1Y2_n390DisTipCol ;
   private int[] P0A1Y2_A363DisColNum ;
   private boolean[] P0A1Y2_n363DisColNum ;
   private String[] P0A1Y2_A362DisColNom ;
   private boolean[] P0A1Y2_n362DisColNom ;
   private String[] P0A1Y2_A337DisArtDsc ;
   private String[] P0A1Y2_A335DisArtCod ;
   private String[] P0A1Y2_A279CliNom ;
   private int[] P0A1Y2_A252CliCod ;
   private java.util.Date[] P0A1Y2_A371DisFecEnt ;
   private String[] P0A1Y2_A4813DisEncCli ;
   private String[] P0A1Y2_A360DisCliNum ;
   private String[] P0A1Y2_A4348DisUsrCod ;
   private byte[] P0A1Y2_A367DisEst ;
   private String[] P0A1Y2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class dis___wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV96Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV95Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV94Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV96Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV98Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV97Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV100Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV99Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV101Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV102Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV103Pedidos_dis___wwds_11_tfclicod ,
                                          int AV104Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV106Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV105Pedidos_dis___wwds_13_tfclinom ,
                                          String AV108Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV107Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV110Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV109Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV112Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV111Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV113Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV114Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV115Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV116Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV118Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV117Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV119Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV120Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV121Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV123Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV124Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV126Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV125Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV127Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV128Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV85DisCod ,
                                          java.util.Date AV83DisFecFrom ,
                                          java.util.Date AV84DisFecto ,
                                          java.util.Date AV86DisFeccliFrom ,
                                          java.util.Date AV87DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV93Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[39];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom," ;
      scmdbuf += " T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst, T1.EmprCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( AV96Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV114Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV115Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV117Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV119Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV121Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV125Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV128Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV85DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
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
                  return conditional_P0A1Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 20);
               ((String[]) buf[22])[0] = rslt.getString(19, 8);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 3);
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
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
      }
   }

}

