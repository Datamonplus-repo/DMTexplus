package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionarhdragrupada", "/app.gestionarhdragrupada"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gestionarhdragrupada extends GXWebObjectStub
{
   public gestionarhdragrupada( )
   {
   }

   public gestionarhdragrupada( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gestionarhdragrupada.class ));
   }

   public gestionarhdragrupada( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gestionarhdragrupada_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gestionarhdragrupada_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Gestionar HDR Agrupada";
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

