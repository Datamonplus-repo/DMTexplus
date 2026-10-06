package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwp_gridstateaddfiltervalueandsel extends GXProcedure
{
   public wwp_gridstateaddfiltervalueandsel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_gridstateaddfiltervalueandsel.class ), "" );
   }

   public wwp_gridstateaddfiltervalueandsel( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( app.wwpbaseobjects.SdtWWPGridState[] aP0 ,
                        String aP1 ,
                        String aP2 ,
                        boolean aP3 ,
                        short aP4 ,
                        String aP5 ,
                        String aP6 ,
                        boolean aP7 ,
                        String aP8 ,
                        String aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( app.wwpbaseobjects.SdtWWPGridState[] aP0 ,
                             String aP1 ,
                             String aP2 ,
                             boolean aP3 ,
                             short aP4 ,
                             String aP5 ,
                             String aP6 ,
                             boolean aP7 ,
                             String aP8 ,
                             String aP9 )
   {
      wwp_gridstateaddfiltervalueandsel.this.AV12GridState = aP0[0];
      this.aP0 = aP0;
      wwp_gridstateaddfiltervalueandsel.this.AV8FilterName = aP1;
      wwp_gridstateaddfiltervalueandsel.this.AV18FilterDsc = aP2;
      wwp_gridstateaddfiltervalueandsel.this.AV11AddFitler = aP3;
      wwp_gridstateaddfiltervalueandsel.this.AV14FilterOperator = aP4;
      wwp_gridstateaddfiltervalueandsel.this.AV10FilterValue = aP5;
      wwp_gridstateaddfiltervalueandsel.this.AV9FilterValueTo = aP6;
      wwp_gridstateaddfiltervalueandsel.this.AV15AddFitlerSel = aP7;
      wwp_gridstateaddfiltervalueandsel.this.AV16FilterValueSel = aP8;
      wwp_gridstateaddfiltervalueandsel.this.AV17FilterValueToSel = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV11AddFitler )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( AV8FilterName );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Dsc( AV18FilterDsc );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Operator( AV14FilterOperator );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV10FilterValue );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Valueto( AV9FilterValueTo );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( AV15AddFitlerSel )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( AV8FilterName+"_SEL" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Dsc( AV18FilterDsc );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV16FilterValueSel );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Valueto( AV17FilterValueToSel );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wwp_gridstateaddfiltervalueandsel.this.AV12GridState;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14FilterOperator ;
   private short Gx_err ;
   private boolean AV11AddFitler ;
   private boolean AV15AddFitlerSel ;
   private String AV8FilterName ;
   private String AV18FilterDsc ;
   private String AV10FilterValue ;
   private String AV9FilterValueTo ;
   private String AV16FilterValueSel ;
   private String AV17FilterValueToSel ;
   private app.wwpbaseobjects.SdtWWPGridState[] aP0 ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
}

