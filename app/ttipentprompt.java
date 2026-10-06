package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipentprompt", "/app.ttipentprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipentprompt extends GXWebObjectStub
{
   public ttipentprompt( )
   {
   }

   public ttipentprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipentprompt.class ));
   }

   public ttipentprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipentprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipentprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TIPOS DE ENTRADAS";
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

