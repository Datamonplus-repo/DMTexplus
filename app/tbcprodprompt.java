package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbcprodprompt", "/app.tbcprodprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbcprodprompt extends GXWebObjectStub
{
   public tbcprodprompt( )
   {
   }

   public tbcprodprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbcprodprompt.class ));
   }

   public tbcprodprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbcprodprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbcprodprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Productos";
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

