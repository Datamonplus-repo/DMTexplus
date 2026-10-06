package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionanalisishdrstradicional2", "/app.wcproduccionanalisishdrstradicional2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionanalisishdrstradicional2 extends GXWebObjectStub
{
   public wcproduccionanalisishdrstradicional2( )
   {
   }

   public wcproduccionanalisishdrstradicional2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionanalisishdrstradicional2.class ));
   }

   public wcproduccionanalisishdrstradicional2( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionanalisishdrstradicional2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionanalisishdrstradicional2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Analisis Hdrs Tradicional";
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

