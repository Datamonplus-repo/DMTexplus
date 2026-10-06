package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlavora", "/app.tlavora"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlavora extends GXWebObjectStub
{
   public tlavora( )
   {
   }

   public tlavora( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlavora.class ));
   }

   public tlavora( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlavora_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlavora_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla LAVORA de Termoeletrónic";
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

