package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwp_columnsselector_add extends GXProcedure
{
   public wwp_columnsselector_add( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_columnsselector_add.class ), "" );
   }

   public wwp_columnsselector_add( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        boolean aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             boolean aP4 ,
                             String aP5 )
   {
      wwp_columnsselector_add.this.AV8ColumnsSelector = aP0[0];
      this.aP0 = aP0;
      wwp_columnsselector_add.this.AV9ColumnName = aP1;
      wwp_columnsselector_add.this.AV12Category = aP2;
      wwp_columnsselector_add.this.AV13DisplayName = aP3;
      wwp_columnsselector_add.this.AV10IsVisible = aP4;
      wwp_columnsselector_add.this.AV14Fixed = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV11Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( AV9ColumnName );
      AV11Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( AV13DisplayName );
      AV11Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( AV10IsVisible );
      AV11Column.setgxTv_SdtWWPColumnsSelector_Column_Order( (short)(AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size()+1) );
      AV11Column.setgxTv_SdtWWPColumnsSelector_Column_Category( AV12Category );
      AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV11Column, 0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wwp_columnsselector_add.this.AV8ColumnsSelector;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean AV10IsVisible ;
   private String AV9ColumnName ;
   private String AV12Category ;
   private String AV13DisplayName ;
   private String AV14Fixed ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector[] aP0 ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV11Column ;
}

