package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lpedidprompt", "/app.lpedidprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lpedidprompt extends GXWebObjectStub
{
   public lpedidprompt( )
   {
   }

   public lpedidprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lpedidprompt.class ));
   }

   public lpedidprompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lpedidprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lpedidprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tabla LPEDID";
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

