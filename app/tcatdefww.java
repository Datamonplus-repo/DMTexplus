package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdefww", "/app.tcatdefww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdefww extends GXWebObjectStub
{
   public tcatdefww( )
   {
   }

   public tcatdefww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdefww.class ));
   }

   public tcatdefww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdefww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdefww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Categoría de los defectos";
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

