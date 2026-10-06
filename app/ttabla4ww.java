package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttabla4ww", "/app.ttabla4ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttabla4ww extends GXWebObjectStub
{
   public ttabla4ww( )
   {
   }

   public ttabla4ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttabla4ww.class ));
   }

   public ttabla4ww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttabla4ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttabla4ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " CUADERNO ENCARGOS POR CLIENTE";
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

