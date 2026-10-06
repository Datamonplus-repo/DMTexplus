package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.utilidadtablasrecuen", "/app.utilidadtablasrecuen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class utilidadtablasrecuen extends GXWebObjectStub
{
   public utilidadtablasrecuen( )
   {
   }

   public utilidadtablasrecuen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( utilidadtablasrecuen.class ));
   }

   public utilidadtablasrecuen( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new utilidadtablasrecuen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new utilidadtablasrecuen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Utilidad Tablas Recuento";
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

