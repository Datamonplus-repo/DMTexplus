package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cambiodecolorhojaruta_4", "/app.formulaciontinte.cambiodecolorhojaruta_4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiodecolorhojaruta_4 extends GXWebObjectStub
{
   public cambiodecolorhojaruta_4( )
   {
   }

   public cambiodecolorhojaruta_4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiodecolorhojaruta_4.class ));
   }

   public cambiodecolorhojaruta_4( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiodecolorhojaruta_4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiodecolorhojaruta_4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Recetas de Tinte (Agrupacion)";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

