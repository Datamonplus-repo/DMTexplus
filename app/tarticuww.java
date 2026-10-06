package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticuww", "/app.tarticuww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticuww extends GXWebObjectStub
{
   public tarticuww( )
   {
   }

   public tarticuww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticuww.class ));
   }

   public tarticuww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticuww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticuww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ficha Tecnica (Articulo)";
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

