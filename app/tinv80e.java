package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tinv80e", "/app.tinv80e"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinv80e extends GXWebObjectStub
{
   public tinv80e( )
   {
   }

   public tinv80e( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinv80e.class ));
   }

   public tinv80e( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinv80e_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinv80e_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA INVENTARIO 80 ESTAMPACION";
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

