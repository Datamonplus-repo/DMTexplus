package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlinea", "/app.tlinea"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlinea extends GXWebObjectStub
{
   public tlinea( )
   {
   }

   public tlinea( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlinea.class ));
   }

   public tlinea( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlinea_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlinea_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de LINEAS";
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

