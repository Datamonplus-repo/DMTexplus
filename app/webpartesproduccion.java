package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpartesproduccion", "/app.webpartesproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpartesproduccion extends GXWebObjectStub
{
   public webpartesproduccion( )
   {
   }

   public webpartesproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpartesproduccion.class ));
   }

   public webpartesproduccion( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpartesproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpartesproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Table LHIPRO";
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

