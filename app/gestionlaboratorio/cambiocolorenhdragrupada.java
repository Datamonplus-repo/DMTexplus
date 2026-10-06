package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.cambiocolorenhdragrupada", "/app.gestionlaboratorio.cambiocolorenhdragrupada"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiocolorenhdragrupada extends GXWebObjectStub
{
   public cambiocolorenhdragrupada( )
   {
   }

   public cambiocolorenhdragrupada( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiocolorenhdragrupada.class ));
   }

   public cambiocolorenhdragrupada( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiocolorenhdragrupada_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiocolorenhdragrupada_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cambio de Color en Hdrs Agrupadas";
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

