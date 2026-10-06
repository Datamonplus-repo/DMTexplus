package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttarcc", "/app.ttarcc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttarcc extends GXWebObjectStub
{
   public ttarcc( )
   {
   }

   public ttarcc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttarcc.class ));
   }

   public ttarcc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttarcc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttarcc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos Articulo Cuardeno Encargos";
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

