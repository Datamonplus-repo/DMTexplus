package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwcctipo", "/app.controlcalidadhtd.wwcctipo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwcctipo extends GXWebObjectStub
{
   public wwcctipo( )
   {
   }

   public wwcctipo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwcctipo.class ));
   }

   public wwcctipo( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwcctipo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwcctipo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Controles de Calidad Tipo";
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

