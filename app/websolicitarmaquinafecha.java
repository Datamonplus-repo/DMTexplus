package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.websolicitarmaquinafecha", "/app.websolicitarmaquinafecha"})
@jakarta.servlet.annotation.MultipartConfig
public final  class websolicitarmaquinafecha extends GXWebObjectStub
{
   public websolicitarmaquinafecha( )
   {
   }

   public websolicitarmaquinafecha( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( websolicitarmaquinafecha.class ));
   }

   public websolicitarmaquinafecha( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new websolicitarmaquinafecha_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new websolicitarmaquinafecha_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Solicitar Maquina Fecha";
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

