package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.topasenprompt", "/app.topasenprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class topasenprompt extends GXWebObjectStub
{
   public topasenprompt( )
   {
   }

   public topasenprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( topasenprompt.class ));
   }

   public topasenprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new topasenprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new topasenprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona OPERACION ASEGURA EN";
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

