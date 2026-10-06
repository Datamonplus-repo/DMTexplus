package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almprdww", "/app.almprdww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almprdww extends GXWebObjectStub
{
   public almprdww( )
   {
   }

   public almprdww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almprdww.class ));
   }

   public almprdww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almprdww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almprdww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Almacenes en productos";
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

