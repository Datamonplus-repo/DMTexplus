package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproductosformula", "/app.wcproductosformula"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproductosformula extends GXWebObjectStub
{
   public wcproductosformula( )
   {
   }

   public wcproductosformula( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproductosformula.class ));
   }

   public wcproductosformula( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproductosformula_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproductosformula_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Table LPRFOR";
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

