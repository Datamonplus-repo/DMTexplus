package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradarecuentos", "/app.entradarecuentos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradarecuentos extends GXWebObjectStub
{
   public entradarecuentos( )
   {
   }

   public entradarecuentos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradarecuentos.class ));
   }

   public entradarecuentos( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradarecuentos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradarecuentos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Recuentos";
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

