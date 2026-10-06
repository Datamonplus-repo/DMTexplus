package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcalidad", "/app.tcalidad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcalidad extends GXWebObjectStub
{
   public tcalidad( )
   {
   }

   public tcalidad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcalidad.class ));
   }

   public tcalidad( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcalidad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcalidad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla de CALIDADES";
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

