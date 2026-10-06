package app.test ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class barraprogreso_pr extends GXProcedure
{
   public barraprogreso_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barraprogreso_pr.class ), "" );
   }

   public barraprogreso_pr( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV9ProgressIndicator.setgxTv_SdtProgress_Value( 10 );
      AV9ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV9ProgressIndicator.show();
      AV8i = GXutil.sleep( 1) ;
      AV9ProgressIndicator.setgxTv_SdtProgress_Value( 20 );
      AV9ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando 20%", ""));
      AV8i = GXutil.sleep( 1) ;
      AV9ProgressIndicator.setgxTv_SdtProgress_Value( 40 );
      AV9ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando 40%", ""));
      AV8i = GXutil.sleep( 1) ;
      AV9ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
      AV9ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando 60%", ""));
      AV8i = GXutil.sleep( 1) ;
      AV9ProgressIndicator.setgxTv_SdtProgress_Value( 80 );
      AV9ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando 80%", ""));
      AV8i = GXutil.sleep( 1) ;
      AV9ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV9ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando 100%", ""));
      AV8i = GXutil.sleep( 1) ;
      AV9ProgressIndicator.hide();
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
      AV9ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8i ;
   private short Gx_err ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV9ProgressIndicator ;
}

