package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctrabajosexternosrecepcionmantenimiento", "/app.wctrabajosexternosrecepcionmantenimiento"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctrabajosexternosrecepcionmantenimiento extends GXWebObjectStub
{
   public wctrabajosexternosrecepcionmantenimiento( )
   {
   }

   public wctrabajosexternosrecepcionmantenimiento( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctrabajosexternosrecepcionmantenimiento.class ));
   }

   public wctrabajosexternosrecepcionmantenimiento( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctrabajosexternosrecepcionmantenimiento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctrabajosexternosrecepcionmantenimiento_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LREXHD";
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

