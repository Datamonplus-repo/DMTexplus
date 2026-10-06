package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcompro", "/app.wcwcompro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcompro extends GXWebObjectStub
{
   public wcwcompro( )
   {
   }

   public wcwcompro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcompro.class ));
   }

   public wcwcompro( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcompro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcompro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Compras Realizadas";
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

