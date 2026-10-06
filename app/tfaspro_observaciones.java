package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfaspro_observaciones", "/app.tfaspro_observaciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfaspro_observaciones extends GXWebObjectStub
{
   public tfaspro_observaciones( )
   {
   }

   public tfaspro_observaciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfaspro_observaciones.class ));
   }

   public tfaspro_observaciones( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfaspro_observaciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfaspro_observaciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones";
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

