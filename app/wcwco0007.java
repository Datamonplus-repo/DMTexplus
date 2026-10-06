package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwco0007", "/app.wcwco0007"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwco0007 extends GXWebObjectStub
{
   public wcwco0007( )
   {
   }

   public wcwco0007( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwco0007.class ));
   }

   public wcwco0007( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwco0007_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwco0007_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Productos Quimicos";
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

