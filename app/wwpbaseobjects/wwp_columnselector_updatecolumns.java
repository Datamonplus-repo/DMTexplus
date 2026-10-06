package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwp_columnselector_updatecolumns extends GXProcedure
{
   public wwp_columnselector_updatecolumns( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_columnselector_updatecolumns.class ), "" );
   }

   public wwp_columnselector_updatecolumns( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.wwpbaseobjects.SdtWWPColumnsSelector executeUdp( app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 )
   {
      wwp_columnselector_updatecolumns.this.aP1 = new app.wwpbaseobjects.SdtWWPColumnsSelector[] {new app.wwpbaseobjects.SdtWWPColumnsSelector()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 ,
                        app.wwpbaseobjects.SdtWWPColumnsSelector[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 ,
                             app.wwpbaseobjects.SdtWWPColumnsSelector[] aP1 )
   {
      wwp_columnselector_updatecolumns.this.AV13OldColumnsSelector = aP0[0];
      this.aP0 = aP0;
      wwp_columnselector_updatecolumns.this.AV10ColumnsSelector = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19GXV1 = 1 ;
      while ( AV19GXV1 <= AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV8Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV19GXV1));
         /* Execute user subroutine: 'ISCOLUMNVISIBLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV11Found )
         {
            AV8Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( AV12IsColumnVisible );
            AV8Column.setgxTv_SdtWWPColumnsSelector_Column_Fixed( AV15Fixed );
            AV8Column.setgxTv_SdtWWPColumnsSelector_Column_Order( AV14ColumnOrder );
         }
         AV19GXV1 = (int)(AV19GXV1+1) ;
      }
      AV16ColumnsSelectorAux = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV16ColumnsSelectorAux.fromJSonString(AV10ColumnsSelector.toJSonString(false, true), null);
      AV16ColumnsSelectorAux.getgxTv_SdtWWPColumnsSelector_Columns().sort("Order");
      AV14ColumnOrder = (short)(0) ;
      AV20GXV2 = 1 ;
      while ( AV20GXV2 <= AV16ColumnsSelectorAux.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV9ColumnAux = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelectorAux.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV20GXV2));
         AV21GXV3 = 1 ;
         while ( AV21GXV3 <= AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
         {
            AV8Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV21GXV3));
            if ( GXutil.strcmp(AV8Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname(), AV9ColumnAux.getgxTv_SdtWWPColumnsSelector_Column_Columnname()) == 0 )
            {
               AV8Column.setgxTv_SdtWWPColumnsSelector_Column_Order( AV14ColumnOrder );
               if (true) break;
            }
            AV21GXV3 = (int)(AV21GXV3+1) ;
         }
         AV14ColumnOrder = (short)(AV14ColumnOrder+1) ;
         AV20GXV2 = (int)(AV20GXV2+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ISCOLUMNVISIBLE' Routine */
      returnInSub = false ;
      AV11Found = false ;
      AV22GXV4 = 1 ;
      while ( AV22GXV4 <= AV13OldColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV9ColumnAux = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13OldColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV22GXV4));
         if ( GXutil.strcmp(AV8Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname(), AV9ColumnAux.getgxTv_SdtWWPColumnsSelector_Column_Columnname()) == 0 )
         {
            AV12IsColumnVisible = AV9ColumnAux.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ;
            AV15Fixed = AV9ColumnAux.getgxTv_SdtWWPColumnsSelector_Column_Fixed() ;
            AV14ColumnOrder = AV9ColumnAux.getgxTv_SdtWWPColumnsSelector_Column_Order() ;
            AV11Found = true ;
            if (true) break;
         }
         AV22GXV4 = (int)(AV22GXV4+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = wwp_columnselector_updatecolumns.this.AV13OldColumnsSelector;
      this.aP1[0] = wwp_columnselector_updatecolumns.this.AV10ColumnsSelector;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV15Fixed = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV9ColumnAux = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14ColumnOrder ;
   private short Gx_err ;
   private int AV19GXV1 ;
   private int AV20GXV2 ;
   private int AV21GXV3 ;
   private int AV22GXV4 ;
   private boolean returnInSub ;
   private boolean AV11Found ;
   private boolean AV12IsColumnVisible ;
   private String AV15Fixed ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector[] aP1 ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV13OldColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV8Column ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV9ColumnAux ;
}

