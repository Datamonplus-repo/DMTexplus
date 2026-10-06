package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdefprompt", "/app.tcatdefprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdefprompt extends GXWebObjectStub
{
   public tcatdefprompt( )
   {
   }

   public tcatdefprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdefprompt.class ));
   }

   public tcatdefprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdefprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdefprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Categoría de los defectos";
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

