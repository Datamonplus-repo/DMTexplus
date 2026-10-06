package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrecetas", "/app.wcrecetas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrecetas extends GXWebObjectStub
{
   public wcrecetas( )
   {
   }

   public wcrecetas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrecetas.class ));
   }

   public wcrecetas( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrecetas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrecetas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Lineas Proceso QUIMICO";
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

