package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class producwwexport extends GXProcedure
{
   public producwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( producwwexport.class ), "" );
   }

   public producwwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      producwwexport.this.aP1 = new String[] {""};
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
      producwwexport.this.aP0 = aP0;
      producwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "PRODUCWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      producwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      producwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNom_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNom, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNum_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNum, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAox)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAox_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "AOX (adsorbable organic halogens)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39TFPrdAox)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFPrdAox_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFPrdGots_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "GOTS", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdGots_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPrdGots)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "GOTS", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrdGots, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFPrdReach_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "REACH", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrdReach_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFPrdReach)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "REACH", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrdReach, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV46TFPrdOkotex_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko Tex", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV65GXV1 = 1 ;
         while ( AV65GXV1 <= AV46TFPrdOkotex_Sels.size() )
         {
            AV47TFPrdOkotex_Sel = (String)AV46TFPrdOkotex_Sels.elementAt(-1+AV65GXV1) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV47TFPrdOkotex_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV47TFPrdOkotex_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV65GXV1 = (int)(AV65GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFPrdHm_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HM", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPrdHm_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFPrdHm)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HM", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrdHm, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV51TFPrdZDHC_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ZDHC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV66GXV2 = 1 ;
         while ( AV66GXV2 <= AV51TFPrdZDHC_Sels.size() )
         {
            AV52TFPrdZDHC_Sel = (String)AV51TFPrdZDHC_Sels.elementAt(-1+AV66GXV2) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV52TFPrdZDHC_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV52TFPrdZDHC_Sel), "1") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 1", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV52TFPrdZDHC_Sel), "2") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 2", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV52TFPrdZDHC_Sel), "3") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 3", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV66GXV2 = (int)(AV66GXV2+1) ;
         }
      }
      if ( ! ( ( AV54TFPrdList_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "List by Inditex ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV67GXV3 = 1 ;
         while ( AV67GXV3 <= AV54TFPrdList_Sels.size() )
         {
            AV55TFPrdList_Sel = (String)AV54TFPrdList_Sels.elementAt(-1+AV67GXV3) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV55TFPrdList_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV55TFPrdList_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV67GXV3 = (int)(AV67GXV3+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFPrdTHELIST_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "THELIST", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFPrdTHELIST_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFPrdTHELIST)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "THELIST", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFPrdTHELIST, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFPrdHS_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja Seguridad?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFPrdHS_Sel, GXv_char5) ;
         producwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFPrdHS)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja Seguridad?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            producwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFPrdHS, GXv_char5) ;
            producwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFPrdFHS)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Hoja Seguridad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV60TFPrdFHS );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV62TFPrdEsCompuesto_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Es Compuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         producwwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( AV62TFPrdEsCompuesto_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV62TFPrdEsCompuesto_Sel == 2 )
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.PRODUCWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.PRODUCWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV68GXV4 = 1 ;
      while ( AV68GXV4 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV68GXV4));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV68GXV4 = (int)(AV68GXV4+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Stocksquimicos_producwwds_1_filterfulltext = AV18FilterFullText ;
      AV71Stocksquimicos_producwwds_2_tfprdnom = AV34TFPrdNom ;
      AV72Stocksquimicos_producwwds_3_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV73Stocksquimicos_producwwds_4_tfprdnum = AV36TFPrdNum ;
      AV74Stocksquimicos_producwwds_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV75Stocksquimicos_producwwds_6_tfprdaox = AV39TFPrdAox ;
      AV76Stocksquimicos_producwwds_7_tfprdaox_to = AV40TFPrdAox_To ;
      AV77Stocksquimicos_producwwds_8_tfprdgots = AV41TFPrdGots ;
      AV78Stocksquimicos_producwwds_9_tfprdgots_sel = AV42TFPrdGots_Sel ;
      AV79Stocksquimicos_producwwds_10_tfprdreach = AV43TFPrdReach ;
      AV80Stocksquimicos_producwwds_11_tfprdreach_sel = AV44TFPrdReach_Sel ;
      AV81Stocksquimicos_producwwds_12_tfprdokotex_sels = AV46TFPrdOkotex_Sels ;
      AV82Stocksquimicos_producwwds_13_tfprdhm = AV48TFPrdHm ;
      AV83Stocksquimicos_producwwds_14_tfprdhm_sel = AV49TFPrdHm_Sel ;
      AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV51TFPrdZDHC_Sels ;
      AV85Stocksquimicos_producwwds_16_tfprdlist_sels = AV54TFPrdList_Sels ;
      AV86Stocksquimicos_producwwds_17_tfprdthelist = AV56TFPrdTHELIST ;
      AV87Stocksquimicos_producwwds_18_tfprdthelist_sel = AV57TFPrdTHELIST_Sel ;
      AV88Stocksquimicos_producwwds_19_tfprdhs = AV58TFPrdHS ;
      AV89Stocksquimicos_producwwds_20_tfprdhs_sel = AV59TFPrdHS_Sel ;
      AV90Stocksquimicos_producwwds_21_tfprdfhs = AV60TFPrdFHS ;
      AV91Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV62TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV81Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV85Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV72Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV71Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV74Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV73Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV75Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV76Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV78Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV77Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV80Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV79Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV81Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV83Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV82Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV85Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV87Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV86Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV89Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV88Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV90Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV91Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV70Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV71Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV71Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV73Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV73Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV77Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV77Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV79Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV82Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV82Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV86Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV88Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV88Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VG2 */
      pr_default.execute(0, new Object[] {lV71Stocksquimicos_producwwds_2_tfprdnom, AV72Stocksquimicos_producwwds_3_tfprdnom_sel, lV73Stocksquimicos_producwwds_4_tfprdnum, AV74Stocksquimicos_producwwds_5_tfprdnum_sel, AV75Stocksquimicos_producwwds_6_tfprdaox, AV76Stocksquimicos_producwwds_7_tfprdaox_to, lV77Stocksquimicos_producwwds_8_tfprdgots, AV78Stocksquimicos_producwwds_9_tfprdgots_sel, lV79Stocksquimicos_producwwds_10_tfprdreach, AV80Stocksquimicos_producwwds_11_tfprdreach_sel, lV82Stocksquimicos_producwwds_13_tfprdhm, AV83Stocksquimicos_producwwds_14_tfprdhm_sel, lV86Stocksquimicos_producwwds_17_tfprdthelist, AV87Stocksquimicos_producwwds_18_tfprdthelist_sel, lV88Stocksquimicos_producwwds_19_tfprdhs, AV89Stocksquimicos_producwwds_20_tfprdhs_sel, AV90Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9742PrdFHS = P08VG2_A9742PrdFHS[0] ;
         A9741PrdHS = P08VG2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VG2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VG2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VG2_A11364PrdHm[0] ;
         A5887PrdReach = P08VG2_A5887PrdReach[0] ;
         A11363PrdGots = P08VG2_A11363PrdGots[0] ;
         A9733PrdAox = P08VG2_A9733PrdAox[0] ;
         A718PrdNom = P08VG2_A718PrdNom[0] ;
         A11687PrdList = P08VG2_A11687PrdList[0] ;
         A13301PrdZDHC = P08VG2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VG2_A5888PrdOkotex[0] ;
         A719PrdNum = P08VG2_A719PrdNum[0] ;
         A396EmprCod = P08VG2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV70Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV70Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV70Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
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
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9733PrdAox)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11363PrdGots, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5887PrdReach, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11364PrdHm, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 1", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 2", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 3", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A11687PrdList), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13302PrdTHELIST, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9741PrdHS, GXv_char5) ;
               producwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9742PrdFHS );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.booltostr( A13881PrdEsCompu) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdAox", "", "AOX (adsorbable organic halogens)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdGots", "", "GOTS", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdReach", "", "REACH", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdOkotex", "", "Oeko Tex", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdHm", "", "HM", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdZDHC", "", "ZDHC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdList", "", "List by Inditex ", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdTHELIST", "", "THELIST", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdHS", "", "Hoja Seguridad?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdFHS", "", "Fecha Hoja Seguridad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdEsCompuesto", "", "Es Compuesto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.PRODUCWWColumnsSelector", GXv_char5) ;
      producwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.PRODUCWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV5 = 1 ;
      while ( AV92GXV5 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV5));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV34TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV35TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV39TFPrdAox = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFPrdAox_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV41TFPrdGots = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV42TFPrdGots_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV43TFPrdReach = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV44TFPrdReach_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV45TFPrdOkotex_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV46TFPrdOkotex_Sels.fromJSonString(AV45TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV48TFPrdHm = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV49TFPrdHm_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV50TFPrdZDHC_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFPrdZDHC_Sels.fromJSonString(AV50TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV53TFPrdList_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFPrdList_Sels.fromJSonString(AV53TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV56TFPrdTHELIST = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV57TFPrdTHELIST_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV58TFPrdHS = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV59TFPrdHS_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV60TFPrdFHS = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDESCOMPUESTO_SEL") == 0 )
         {
            AV62TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV92GXV5 = (int)(AV92GXV5+1) ;
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
      this.aP0[0] = producwwexport.this.AV11Filename;
      this.aP1[0] = producwwexport.this.AV12ErrorMessage;
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
      AV35TFPrdNom_Sel = "" ;
      AV34TFPrdNom = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV36TFPrdNum = "" ;
      AV39TFPrdAox = DecimalUtil.ZERO ;
      AV40TFPrdAox_To = DecimalUtil.ZERO ;
      AV42TFPrdGots_Sel = "" ;
      AV41TFPrdGots = "" ;
      AV44TFPrdReach_Sel = "" ;
      AV43TFPrdReach = "" ;
      AV46TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47TFPrdOkotex_Sel = "" ;
      AV49TFPrdHm_Sel = "" ;
      AV48TFPrdHm = "" ;
      AV51TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFPrdZDHC_Sel = "" ;
      AV54TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55TFPrdList_Sel = "" ;
      AV57TFPrdTHELIST_Sel = "" ;
      AV56TFPrdTHELIST = "" ;
      AV59TFPrdHS_Sel = "" ;
      AV58TFPrdHS = "" ;
      AV60TFPrdFHS = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      AV70Stocksquimicos_producwwds_1_filterfulltext = "" ;
      AV71Stocksquimicos_producwwds_2_tfprdnom = "" ;
      AV72Stocksquimicos_producwwds_3_tfprdnom_sel = "" ;
      AV73Stocksquimicos_producwwds_4_tfprdnum = "" ;
      AV74Stocksquimicos_producwwds_5_tfprdnum_sel = "" ;
      AV75Stocksquimicos_producwwds_6_tfprdaox = DecimalUtil.ZERO ;
      AV76Stocksquimicos_producwwds_7_tfprdaox_to = DecimalUtil.ZERO ;
      AV77Stocksquimicos_producwwds_8_tfprdgots = "" ;
      AV78Stocksquimicos_producwwds_9_tfprdgots_sel = "" ;
      AV79Stocksquimicos_producwwds_10_tfprdreach = "" ;
      AV80Stocksquimicos_producwwds_11_tfprdreach_sel = "" ;
      AV81Stocksquimicos_producwwds_12_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV82Stocksquimicos_producwwds_13_tfprdhm = "" ;
      AV83Stocksquimicos_producwwds_14_tfprdhm_sel = "" ;
      AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV85Stocksquimicos_producwwds_16_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      AV87Stocksquimicos_producwwds_18_tfprdthelist_sel = "" ;
      AV88Stocksquimicos_producwwds_19_tfprdhs = "" ;
      AV89Stocksquimicos_producwwds_20_tfprdhs_sel = "" ;
      AV90Stocksquimicos_producwwds_21_tfprdfhs = GXutil.nullDate() ;
      lV70Stocksquimicos_producwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV71Stocksquimicos_producwwds_2_tfprdnom = "" ;
      lV73Stocksquimicos_producwwds_4_tfprdnum = "" ;
      lV77Stocksquimicos_producwwds_8_tfprdgots = "" ;
      lV79Stocksquimicos_producwwds_10_tfprdreach = "" ;
      lV82Stocksquimicos_producwwds_13_tfprdhm = "" ;
      lV86Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      lV88Stocksquimicos_producwwds_19_tfprdhs = "" ;
      P08VG2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VG2_A9741PrdHS = new String[] {""} ;
      P08VG2_A13302PrdTHELIST = new String[] {""} ;
      P08VG2_n13302PrdTHELIST = new boolean[] {false} ;
      P08VG2_A11364PrdHm = new String[] {""} ;
      P08VG2_A5887PrdReach = new String[] {""} ;
      P08VG2_A11363PrdGots = new String[] {""} ;
      P08VG2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VG2_A718PrdNom = new String[] {""} ;
      P08VG2_A11687PrdList = new String[] {""} ;
      P08VG2_A13301PrdZDHC = new String[] {""} ;
      P08VG2_A5888PrdOkotex = new String[] {""} ;
      P08VG2_A719PrdNum = new String[] {""} ;
      P08VG2_A396EmprCod = new String[] {""} ;
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
      AV45TFPrdOkotex_SelsJson = "" ;
      AV50TFPrdZDHC_SelsJson = "" ;
      AV53TFPrdList_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.producwwexport__default(),
         new Object[] {
             new Object[] {
            P08VG2_A9742PrdFHS, P08VG2_A9741PrdHS, P08VG2_A13302PrdTHELIST, P08VG2_n13302PrdTHELIST, P08VG2_A11364PrdHm, P08VG2_A5887PrdReach, P08VG2_A11363PrdGots, P08VG2_A9733PrdAox, P08VG2_A718PrdNom, P08VG2_A11687PrdList,
            P08VG2_A13301PrdZDHC, P08VG2_A5888PrdOkotex, P08VG2_A719PrdNum, P08VG2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV62TFPrdEsCompuesto_Sel ;
   private byte AV91Stocksquimicos_producwwds_22_tfprdescompuesto_sel ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV65GXV1 ;
   private int AV66GXV2 ;
   private int AV67GXV3 ;
   private int AV68GXV4 ;
   private int AV81Stocksquimicos_producwwds_12_tfprdokotex_sels_size ;
   private int AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ;
   private int AV85Stocksquimicos_producwwds_16_tfprdlist_sels_size ;
   private int AV92GXV5 ;
   private long AV38i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV39TFPrdAox ;
   private java.math.BigDecimal AV40TFPrdAox_To ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV75Stocksquimicos_producwwds_6_tfprdaox ;
   private java.math.BigDecimal AV76Stocksquimicos_producwwds_7_tfprdaox_to ;
   private String AV35TFPrdNom_Sel ;
   private String AV34TFPrdNom ;
   private String AV37TFPrdNum_Sel ;
   private String AV36TFPrdNum ;
   private String AV42TFPrdGots_Sel ;
   private String AV41TFPrdGots ;
   private String AV44TFPrdReach_Sel ;
   private String AV43TFPrdReach ;
   private String AV47TFPrdOkotex_Sel ;
   private String AV49TFPrdHm_Sel ;
   private String AV48TFPrdHm ;
   private String AV52TFPrdZDHC_Sel ;
   private String AV55TFPrdList_Sel ;
   private String AV57TFPrdTHELIST_Sel ;
   private String AV56TFPrdTHELIST ;
   private String AV59TFPrdHS_Sel ;
   private String AV58TFPrdHS ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String AV71Stocksquimicos_producwwds_2_tfprdnom ;
   private String AV72Stocksquimicos_producwwds_3_tfprdnom_sel ;
   private String AV73Stocksquimicos_producwwds_4_tfprdnum ;
   private String AV74Stocksquimicos_producwwds_5_tfprdnum_sel ;
   private String AV77Stocksquimicos_producwwds_8_tfprdgots ;
   private String AV78Stocksquimicos_producwwds_9_tfprdgots_sel ;
   private String AV79Stocksquimicos_producwwds_10_tfprdreach ;
   private String AV80Stocksquimicos_producwwds_11_tfprdreach_sel ;
   private String AV82Stocksquimicos_producwwds_13_tfprdhm ;
   private String AV83Stocksquimicos_producwwds_14_tfprdhm_sel ;
   private String AV86Stocksquimicos_producwwds_17_tfprdthelist ;
   private String AV87Stocksquimicos_producwwds_18_tfprdthelist_sel ;
   private String AV88Stocksquimicos_producwwds_19_tfprdhs ;
   private String AV89Stocksquimicos_producwwds_20_tfprdhs_sel ;
   private String scmdbuf ;
   private String lV71Stocksquimicos_producwwds_2_tfprdnom ;
   private String lV73Stocksquimicos_producwwds_4_tfprdnum ;
   private String lV77Stocksquimicos_producwwds_8_tfprdgots ;
   private String lV79Stocksquimicos_producwwds_10_tfprdreach ;
   private String lV82Stocksquimicos_producwwds_13_tfprdhm ;
   private String lV86Stocksquimicos_producwwds_17_tfprdthelist ;
   private String lV88Stocksquimicos_producwwds_19_tfprdhs ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV60TFPrdFHS ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV90Stocksquimicos_producwwds_21_tfprdfhs ;
   private boolean returnInSub ;
   private boolean A13881PrdEsCompu ;
   private boolean AV17OrderedDsc ;
   private boolean n13302PrdTHELIST ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV45TFPrdOkotex_SelsJson ;
   private String AV50TFPrdZDHC_SelsJson ;
   private String AV53TFPrdList_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV70Stocksquimicos_producwwds_1_filterfulltext ;
   private String lV70Stocksquimicos_producwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV46TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV51TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV54TFPrdList_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08VG2_A9742PrdFHS ;
   private String[] P08VG2_A9741PrdHS ;
   private String[] P08VG2_A13302PrdTHELIST ;
   private boolean[] P08VG2_n13302PrdTHELIST ;
   private String[] P08VG2_A11364PrdHm ;
   private String[] P08VG2_A5887PrdReach ;
   private String[] P08VG2_A11363PrdGots ;
   private java.math.BigDecimal[] P08VG2_A9733PrdAox ;
   private String[] P08VG2_A718PrdNom ;
   private String[] P08VG2_A11687PrdList ;
   private String[] P08VG2_A13301PrdZDHC ;
   private String[] P08VG2_A5888PrdOkotex ;
   private String[] P08VG2_A719PrdNum ;
   private String[] P08VG2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV81Stocksquimicos_producwwds_12_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV85Stocksquimicos_producwwds_16_tfprdlist_sels ;
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

final  class producwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV81Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV85Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV72Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV71Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV74Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV73Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV75Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV76Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV78Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV77Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV80Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV79Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV81Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV83Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV82Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV85Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV87Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV86Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV89Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV88Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV90Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV91Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV70Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[17];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV72Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV73Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( AV81Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV83Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV82Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV85Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV88Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( AV91Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV91Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdGots" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdGots DESC" ;
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
                  return conditional_P08VG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
      }
   }

}

