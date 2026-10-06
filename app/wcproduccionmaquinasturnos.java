package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionmaquinasturnos", "/app.wcproduccionmaquinasturnos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionmaquinasturnos extends GXWebObjectStub
{
   public wcproduccionmaquinasturnos( )
   {
   }

   public wcproduccionmaquinasturnos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionmaquinasturnos.class ));
   }

   public wcproduccionmaquinasturnos( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionmaquinasturnos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionmaquinasturnos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Maquinas Turnos";
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

