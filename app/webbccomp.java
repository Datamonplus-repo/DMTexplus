package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webbccomp", "/app.webbccomp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webbccomp extends GXWebObjectStub
{
   public webbccomp( )
   {
   }

   public webbccomp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webbccomp.class ));
   }

   public webbccomp( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webbccomp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webbccomp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio Compras a BC";
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

