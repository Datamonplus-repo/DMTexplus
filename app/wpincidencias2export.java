package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpincidencias2export extends GXProcedure
{
   public wpincidencias2export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpincidencias2export.class ), "" );
   }

   public wpincidencias2export( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wpincidencias2export.this.aP1 = new String[] {""};
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
      wpincidencias2export.this.aP0 = aP0;
      wpincidencias2export.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WPIncidencias2Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64FilterFullText, GXv_char5) ;
      wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV32GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV18DynamicFiltersSelector1 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV18DynamicFiltersSelector1, "INC_NUM_ULT") == 0 )
         {
            AV19DynamicFiltersOperator1 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV20Inc_Num_ult1 = GXutil.lval( AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
            if ( ! (0==AV20Inc_Num_ult1) )
            {
               AV13CellRow = (int)(AV13CellRow+1) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
               if ( AV19DynamicFiltersOperator1 == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), "<", "", "", "", "", "", "", "") );
               }
               else if ( AV19DynamicFiltersOperator1 == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), "=", "", "", "", "", "", "", "") );
               }
               else if ( AV19DynamicFiltersOperator1 == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), ">", "", "", "", "", "", "", "") );
               }
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV20Inc_Num_ult1 );
            }
         }
         else if ( GXutil.strcmp(AV18DynamicFiltersSelector1, "EMPRNOM") == 0 )
         {
            AV19DynamicFiltersOperator1 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV21EmprNom1 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            if ( ! (GXutil.strcmp("", AV21EmprNom1)==0) )
            {
               AV13CellRow = (int)(AV13CellRow+1) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
               if ( AV19DynamicFiltersOperator1 == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") );
               }
               else if ( AV19DynamicFiltersOperator1 == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") );
               }
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21EmprNom1, GXv_char5) ;
               wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         if ( AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV22DynamicFiltersEnabled2 = true ;
            AV32GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV23DynamicFiltersSelector2 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV23DynamicFiltersSelector2, "INC_NUM_ULT") == 0 )
            {
               AV24DynamicFiltersOperator2 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV25Inc_Num_ult2 = GXutil.lval( AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
               if ( ! (0==AV25Inc_Num_ult2) )
               {
                  AV13CellRow = (int)(AV13CellRow+1) ;
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                  if ( AV24DynamicFiltersOperator2 == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), "<", "", "", "", "", "", "", "") );
                  }
                  else if ( AV24DynamicFiltersOperator2 == 1 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), "=", "", "", "", "", "", "", "") );
                  }
                  else if ( AV24DynamicFiltersOperator2 == 2 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), ">", "", "", "", "", "", "", "") );
                  }
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV25Inc_Num_ult2 );
               }
            }
            else if ( GXutil.strcmp(AV23DynamicFiltersSelector2, "EMPRNOM") == 0 )
            {
               AV24DynamicFiltersOperator2 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV26EmprNom2 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               if ( ! (GXutil.strcmp("", AV26EmprNom2)==0) )
               {
                  AV13CellRow = (int)(AV13CellRow+1) ;
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                  if ( AV24DynamicFiltersOperator2 == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") );
                  }
                  else if ( AV24DynamicFiltersOperator2 == 1 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") );
                  }
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV26EmprNom2, GXv_char5) ;
                  wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
               }
            }
            if ( AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV27DynamicFiltersEnabled3 = true ;
               AV32GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV35GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV28DynamicFiltersSelector3 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_NUM_ULT") == 0 )
               {
                  AV29DynamicFiltersOperator3 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV30Inc_Num_ult3 = GXutil.lval( AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
                  if ( ! (0==AV30Inc_Num_ult3) )
                  {
                     AV13CellRow = (int)(AV13CellRow+1) ;
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                     if ( AV29DynamicFiltersOperator3 == 0 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), "<", "", "", "", "", "", "", "") );
                     }
                     else if ( AV29DynamicFiltersOperator3 == 1 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), "=", "", "", "", "", "", "", "") );
                     }
                     else if ( AV29DynamicFiltersOperator3 == 2 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Numero", ""), ">", "", "", "", "", "", "", "") );
                     }
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV30Inc_Num_ult3 );
                  }
               }
               else if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "EMPRNOM") == 0 )
               {
                  AV29DynamicFiltersOperator3 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV31EmprNom3 = AV32GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  if ( ! (GXutil.strcmp("", AV31EmprNom3)==0) )
                  {
                     AV13CellRow = (int)(AV13CellRow+1) ;
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                     if ( AV29DynamicFiltersOperator3 == 0 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") );
                     }
                     else if ( AV29DynamicFiltersOperator3 == 1 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") );
                     }
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                     GXt_char4 = "" ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV31EmprNom3, GXv_char5) ;
                     wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
                  }
               }
            }
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFInc_Dia)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV48TFInc_Dia );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV50TFInc_Linea) && (0==AV51TFInc_Linea_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFInc_Linea );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFInc_Linea_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV52TFInc_Hora) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV52TFInc_Hora, "99:99:99") );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFInc_Prog_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Programa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFInc_Prog_Sel, GXv_char5) ;
         wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFInc_Prog)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Programa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFInc_Prog, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFInc_Terminal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFInc_Terminal_Sel, GXv_char5) ;
         wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFInc_Terminal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFInc_Terminal, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFInc_Usuario_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFInc_Usuario_Sel, GXv_char5) ;
         wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFInc_Usuario)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpincidencias2export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFInc_Usuario, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("WPIncidencias2ColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("WPIncidencias2ColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64FilterFullText ,
                                           AV18DynamicFiltersSelector1 ,
                                           Short.valueOf(AV19DynamicFiltersOperator1) ,
                                           Long.valueOf(AV20Inc_Num_ult1) ,
                                           AV21EmprNom1 ,
                                           Boolean.valueOf(AV22DynamicFiltersEnabled2) ,
                                           AV23DynamicFiltersSelector2 ,
                                           Short.valueOf(AV24DynamicFiltersOperator2) ,
                                           Long.valueOf(AV25Inc_Num_ult2) ,
                                           AV26EmprNom2 ,
                                           Boolean.valueOf(AV27DynamicFiltersEnabled3) ,
                                           AV28DynamicFiltersSelector3 ,
                                           Short.valueOf(AV29DynamicFiltersOperator3) ,
                                           Long.valueOf(AV30Inc_Num_ult3) ,
                                           AV31EmprNom3 ,
                                           AV48TFInc_Dia ,
                                           Long.valueOf(AV50TFInc_Linea) ,
                                           Long.valueOf(AV51TFInc_Linea_To) ,
                                           AV52TFInc_Hora ,
                                           AV55TFInc_Prog_Sel ,
                                           AV54TFInc_Prog ,
                                           AV57TFInc_Terminal_Sel ,
                                           AV56TFInc_Terminal ,
                                           AV59TFInc_Usuario_Sel ,
                                           AV58TFInc_Usuario ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4936Inc_Obs ,
                                           Long.valueOf(A4930Inc_Num_ul) ,
                                           A407EmprNom ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV21EmprNom1 = GXutil.padr( GXutil.rtrim( AV21EmprNom1), 30, "%") ;
      lV21EmprNom1 = GXutil.padr( GXutil.rtrim( AV21EmprNom1), 30, "%") ;
      lV26EmprNom2 = GXutil.padr( GXutil.rtrim( AV26EmprNom2), 30, "%") ;
      lV26EmprNom2 = GXutil.padr( GXutil.rtrim( AV26EmprNom2), 30, "%") ;
      lV31EmprNom3 = GXutil.padr( GXutil.rtrim( AV31EmprNom3), 30, "%") ;
      lV31EmprNom3 = GXutil.padr( GXutil.rtrim( AV31EmprNom3), 30, "%") ;
      /* Using cursor P089F2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV20Inc_Num_ult1), Long.valueOf(AV20Inc_Num_ult1), Long.valueOf(AV20Inc_Num_ult1), lV21EmprNom1, lV21EmprNom1, Long.valueOf(AV25Inc_Num_ult2), Long.valueOf(AV25Inc_Num_ult2), Long.valueOf(AV25Inc_Num_ult2), lV26EmprNom2, lV26EmprNom2, Long.valueOf(AV30Inc_Num_ult3), Long.valueOf(AV30Inc_Num_ult3), Long.valueOf(AV30Inc_Num_ult3), lV31EmprNom3, lV31EmprNom3, AV48TFInc_Dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P089F2_A396EmprCod[0] ;
         A4929Inc_Dia = P089F2_A4929Inc_Dia[0] ;
         A407EmprNom = P089F2_A407EmprNom[0] ;
         n407EmprNom = P089F2_n407EmprNom[0] ;
         A4930Inc_Num_ul = P089F2_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = P089F2_n4930Inc_Num_ul[0] ;
         A407EmprNom = P089F2_A407EmprNom[0] ;
         n407EmprNom = P089F2_n407EmprNom[0] ;
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
            GXt_dtime6 = GXutil.resetTime( A4929Inc_Dia );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A4931Inc_Linea );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( localUtil.format( A4932Inc_Hora, "99:99:99") );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4935Inc_Prog, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4934Inc_Termin, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4933Inc_Usuari, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV69Nlin = DecimalUtil.doubleToDec(GXutil.gxmlines( A4936Inc_Obs, (short)(60))) ;
            AV60i = 1 ;
            AV61Inc_obsTxt = " " ;
            while ( AV60i <= AV69Nlin.doubleValue() )
            {
               AV61Inc_obsTxt += GXutil.gxgetmli( A4936Inc_Obs, (short)(AV60i), (short)(60)) + GXutil.newLine( ) ;
               AV60i = (long)(AV60i+1) ;
            }
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61Inc_obsTxt, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4936Inc_Obs, GXv_char5) ;
            wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Dia", "", "Dia", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Linea", "", "#", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Hora", "", "Hora", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Prog", "", "Programa", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Terminal", "", "Terminal", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Usuario", "", "Usuario", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Inc_obsTxt", "", "Texto Obs", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Inc_Hdr", "", "Hdr", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Obs", "", "Observación", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPIncidencias2ColumnsSelector", GXv_char5) ;
      wpincidencias2export.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WPIncidencias2GridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPIncidencias2GridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WPIncidencias2GridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV70GXV2 = 1 ;
      while ( AV70GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV64FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV48TFInc_Dia = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV50TFInc_Linea = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV51TFInc_Linea_To = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV52TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV54TFInc_Prog = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV55TFInc_Prog_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV56TFInc_Terminal = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV57TFInc_Terminal_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV58TFInc_Usuario = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV59TFInc_Usuario_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV70GXV2 = (int)(AV70GXV2+1) ;
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
      this.aP0[0] = wpincidencias2export.this.AV11Filename;
      this.aP1[0] = wpincidencias2export.this.AV12ErrorMessage;
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
      AV64FilterFullText = "" ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV18DynamicFiltersSelector1 = "" ;
      AV21EmprNom1 = "" ;
      AV23DynamicFiltersSelector2 = "" ;
      AV26EmprNom2 = "" ;
      AV28DynamicFiltersSelector3 = "" ;
      AV31EmprNom3 = "" ;
      AV48TFInc_Dia = GXutil.nullDate() ;
      AV52TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV55TFInc_Prog_Sel = "" ;
      AV54TFInc_Prog = "" ;
      AV57TFInc_Terminal_Sel = "" ;
      AV56TFInc_Terminal = "" ;
      AV59TFInc_Usuario_Sel = "" ;
      AV58TFInc_Usuario = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4935Inc_Prog = "" ;
      A4934Inc_Termin = "" ;
      A4933Inc_Usuari = "" ;
      A4936Inc_Obs = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV21EmprNom1 = "" ;
      lV26EmprNom2 = "" ;
      lV31EmprNom3 = "" ;
      A407EmprNom = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      P089F2_A396EmprCod = new String[] {""} ;
      P089F2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089F2_A407EmprNom = new String[] {""} ;
      P089F2_n407EmprNom = new boolean[] {false} ;
      P089F2_A4930Inc_Num_ul = new long[1] ;
      P089F2_n4930Inc_Num_ul = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV69Nlin = DecimalUtil.ZERO ;
      AV61Inc_obsTxt = "" ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpincidencias2export__default(),
         new Object[] {
             new Object[] {
            P089F2_A396EmprCod, P089F2_A4929Inc_Dia, P089F2_A407EmprNom, P089F2_n407EmprNom, P089F2_A4930Inc_Num_ul, P089F2_n4930Inc_Num_ul
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19DynamicFiltersOperator1 ;
   private short AV24DynamicFiltersOperator2 ;
   private short AV29DynamicFiltersOperator3 ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV67GXV1 ;
   private int AV70GXV2 ;
   private long AV20Inc_Num_ult1 ;
   private long AV25Inc_Num_ult2 ;
   private long AV30Inc_Num_ult3 ;
   private long AV50TFInc_Linea ;
   private long AV51TFInc_Linea_To ;
   private long AV45VisibleColumnCount ;
   private long A4931Inc_Linea ;
   private long A4930Inc_Num_ul ;
   private long AV60i ;
   private java.math.BigDecimal AV69Nlin ;
   private String AV21EmprNom1 ;
   private String AV26EmprNom2 ;
   private String AV31EmprNom3 ;
   private String AV55TFInc_Prog_Sel ;
   private String AV54TFInc_Prog ;
   private String AV57TFInc_Terminal_Sel ;
   private String AV56TFInc_Terminal ;
   private String AV59TFInc_Usuario_Sel ;
   private String AV58TFInc_Usuario ;
   private String A4935Inc_Prog ;
   private String A4934Inc_Termin ;
   private String A4933Inc_Usuari ;
   private String scmdbuf ;
   private String lV21EmprNom1 ;
   private String lV26EmprNom2 ;
   private String lV31EmprNom3 ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV52TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV48TFInc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean AV22DynamicFiltersEnabled2 ;
   private boolean AV27DynamicFiltersEnabled3 ;
   private boolean AV17OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n4930Inc_Num_ul ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV64FilterFullText ;
   private String AV18DynamicFiltersSelector1 ;
   private String AV23DynamicFiltersSelector2 ;
   private String AV28DynamicFiltersSelector3 ;
   private String A4936Inc_Obs ;
   private String AV61Inc_obsTxt ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P089F2_A396EmprCod ;
   private java.util.Date[] P089F2_A4929Inc_Dia ;
   private String[] P089F2_A407EmprNom ;
   private boolean[] P089F2_n407EmprNom ;
   private long[] P089F2_A4930Inc_Num_ul ;
   private boolean[] P089F2_n4930Inc_Num_ul ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV32GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class wpincidencias2export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P089F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64FilterFullText ,
                                          String AV18DynamicFiltersSelector1 ,
                                          short AV19DynamicFiltersOperator1 ,
                                          long AV20Inc_Num_ult1 ,
                                          String AV21EmprNom1 ,
                                          boolean AV22DynamicFiltersEnabled2 ,
                                          String AV23DynamicFiltersSelector2 ,
                                          short AV24DynamicFiltersOperator2 ,
                                          long AV25Inc_Num_ult2 ,
                                          String AV26EmprNom2 ,
                                          boolean AV27DynamicFiltersEnabled3 ,
                                          String AV28DynamicFiltersSelector3 ,
                                          short AV29DynamicFiltersOperator3 ,
                                          long AV30Inc_Num_ult3 ,
                                          String AV31EmprNom3 ,
                                          java.util.Date AV48TFInc_Dia ,
                                          long AV50TFInc_Linea ,
                                          long AV51TFInc_Linea_To ,
                                          java.util.Date AV52TFInc_Hora ,
                                          String AV55TFInc_Prog_Sel ,
                                          String AV54TFInc_Prog ,
                                          String AV57TFInc_Terminal_Sel ,
                                          String AV56TFInc_Terminal ,
                                          String AV59TFInc_Usuario_Sel ,
                                          String AV58TFInc_Usuario ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          String A4936Inc_Obs ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[16];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Inc_Dia, T2.EmprNom, T1.Inc_Num_ul FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ( GXutil.strcmp(AV18DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV19DynamicFiltersOperator1 == 0 ) && ( ! (0==AV20Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV18DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV19DynamicFiltersOperator1 == 1 ) && ( ! (0==AV20Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV18DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV19DynamicFiltersOperator1 == 2 ) && ( ! (0==AV20Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV18DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV19DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV21EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV18DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV19DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV21EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( AV22DynamicFiltersEnabled2 && ( GXutil.strcmp(AV23DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV24DynamicFiltersOperator2 == 0 ) && ( ! (0==AV25Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( AV22DynamicFiltersEnabled2 && ( GXutil.strcmp(AV23DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV24DynamicFiltersOperator2 == 1 ) && ( ! (0==AV25Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( AV22DynamicFiltersEnabled2 && ( GXutil.strcmp(AV23DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV24DynamicFiltersOperator2 == 2 ) && ( ! (0==AV25Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( AV22DynamicFiltersEnabled2 && ( GXutil.strcmp(AV23DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV24DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV26EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( AV22DynamicFiltersEnabled2 && ( GXutil.strcmp(AV23DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV24DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV26EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( AV27DynamicFiltersEnabled3 && ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV29DynamicFiltersOperator3 == 0 ) && ( ! (0==AV30Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( AV27DynamicFiltersEnabled3 && ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV29DynamicFiltersOperator3 == 1 ) && ( ! (0==AV30Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( AV27DynamicFiltersEnabled3 && ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV29DynamicFiltersOperator3 == 2 ) && ( ! (0==AV30Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( AV27DynamicFiltersEnabled3 && ( GXutil.strcmp(AV28DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV29DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV31EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( AV27DynamicFiltersEnabled3 && ( GXutil.strcmp(AV28DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV29DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV31EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.Inc_Num_ul" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Inc_Dia" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Inc_Dia DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P089F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).longValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

