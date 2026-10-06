package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class barraprogreso extends GXProcedure
{
   public barraprogreso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barraprogreso.class ), "" );
   }

   public barraprogreso( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        boolean aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             boolean aP2 ,
                             byte aP3 )
   {
      barraprogreso.this.AV8Titulo = aP0;
      barraprogreso.this.AV9IndicadorAvance = aP1;
      barraprogreso.this.AV10Mostrar = aP2;
      barraprogreso.this.AV11ProgressIndicatorType = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12ProgressIndicator.setgxTv_SdtProgress_Type( AV11ProgressIndicatorType );
      AV12ProgressIndicator.setgxTv_SdtProgress_Class( "GXProgressBarDanger" );
      AV12ProgressIndicator.setgxTv_SdtProgress_Value( AV9IndicadorAvance );
      AV12ProgressIndicator.showwithtitleanddescription("", AV8Titulo);
      if ( AV10Mostrar )
      {
         AV12ProgressIndicator.show();
      }
      else
      {
         AV13i = GXutil.sleep( 1) ;
         AV12ProgressIndicator.hide();
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11ProgressIndicatorType ;
   private short AV13i ;
   private short Gx_err ;
   private int AV9IndicadorAvance ;
   private boolean AV10Mostrar ;
   private String AV8Titulo ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV12ProgressIndicator ;
}

