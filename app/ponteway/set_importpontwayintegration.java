package app.ponteway ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class set_importpontwayintegration extends GXProcedure
{
   public set_importpontwayintegration( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( set_importpontwayintegration.class ), "" );
   }

   public set_importpontwayintegration( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 )
   {
      set_importpontwayintegration.this.AV8GuiaRemessaLinhaItemDTO = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
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
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> AV8GuiaRemessaLinhaItemDTO ;
}

