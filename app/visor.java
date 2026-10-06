package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class visor extends GXProcedure
{
   public visor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( visor.class ), "" );
   }

   public visor( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String aP0 )
   {
      visor.this.AV25Filename = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV119PdfFile.setSource( AV25Filename );
      if ( AV119PdfFile.exists() )
      {
         AV118Window.setUrl( formatLink(AV25Filename, new String[] {}, new String[] {})  );
         AV118Window.setReturnParms(new Object[] {});
         AV118Window.setHeight( 600 );
         AV118Window.setWidth( 800 );
         httpContext.newWindow(AV118Window);
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
      AV119PdfFile = new com.genexus.util.GXFile();
      AV118Window = new com.genexus.webpanels.GXWindow();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV25Filename ;
   private com.genexus.webpanels.GXWindow AV118Window ;
   private com.genexus.util.GXFile AV119PdfFile ;
}

